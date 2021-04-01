#!/bin/bash
#echo what is password
#read password
#echo okay $password

read -e -p "jar file to transfer: " jarfile
ls -l $jarfile

scp -i keys/kashmir.key $jarfile ubuntu@18.222.9.215:/home/ubuntu/frq-site
ssh -i keys/kashmir.key ubuntu@18.222.9.215 'bash -s' <<- EOM
  cd frq-site/
  sudo systemctl restart frqsite
  sudo systemctl restart nginx
  date >> log
EOM

echo "done"