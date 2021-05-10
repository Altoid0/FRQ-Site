package com.application.frq.Nathan;

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
        new Bclass();
    }

}
