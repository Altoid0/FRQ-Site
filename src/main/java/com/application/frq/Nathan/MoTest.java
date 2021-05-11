package com.application.frq.Nathan;

import java.util.ArrayList;

public class MoTest {

    static class Aclass {

        public void methodX()

        {

            System.out.print("Super X ");

            methodY();

        }

        public void methodY()

        {

            System.out.print("Super Y ");

            methodZ();

        }

        public void methodZ(){

        System.out.print("Super Z");

    }

}

static class Bclass extends Aclass {

    public void methodX() {

        super.methodX();

    }

    public void methodY() {

        System.out.print("Sub Y ");

        methodZ();

    }

}


    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("there");
        strings.add("hello");
        strings.add("there");
        strings.add("there");

        for(int i=0;i<strings.size();i++){
            String s = strings.get(i);
            if(s.equals("hello")){
                strings.remove(i);
                i -= 1;
            }
        }

        System.out.println(strings);
    }

}
