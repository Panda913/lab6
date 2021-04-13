package com.company;

   public class MyThread extends Thread {

        long variantNum;
        long lowerValue;
        long upperValue;
        long result;

        public MyThread(int variantNum, long lowerValue, long upperValue) {
            this.variantNum = variantNum;
            this.lowerValue = lowerValue;
            this.upperValue = upperValue;
        }

        @Override
        public void run() {
            long result = 0;



            for (long i = lowerValue; i <= upperValue; i++) {
                result += variantNum* i;

            }


            this.result = result;
        }
    }

