public class MultithreadingIntro {
    public static void main(String[] args) {
        Runnable printChar = new PrintChar('a', Integer.MAX_VALUE);
        Thread printSecond = new PrintNum(55, Integer.MAX_VALUE);
        Thread printFirst = new Thread(printChar);

        printFirst.start();
        printSecond.start();

    }

}

    class PrintNum extends Thread {
        private int num;
        private int times;

        public void run() {
            for(int i=0;i<times;i++){
                System.out.println(num);
            }
        }
        public PrintNum(int num1, int times1){
           num = num1;
           times = times1;
        }

    }

    class PrintChar implements Runnable {
        private char letter;
        private int times;

        @Override
        public void run() {
            for(int i=0;i<times;i++){
                System.out.print(letter);
            }

        }
        public PrintChar(char letters1, int times1){
            letter = letters1;
            times = times1;
        }
    }

