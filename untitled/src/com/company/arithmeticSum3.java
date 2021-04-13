package com.company;
import com.company.MyThread.*;
import java.util.ArrayList;
import java.util.List;

public class arithmeticSum3 {
    static long arithmeticSum3(int variantNum, long to, int threadsCount) {
        long result = 0;
       long lowerValue = 0;
        long upperValue;
       long m = to / threadsCount;
       long mLast = to / threadsCount + to % threadsCount;
        List<MyThread> threads = new ArrayList<>(threadsCount);
        MyThread at;
        for (int i = 0; i < threadsCount; i++) {
            upperValue = lowerValue + 1;
            lowerValue = (upperValue - 1) + (i == threadsCount - 1 ? mLast : m);
            at = new MyThread(variantNum, upperValue, lowerValue);


            threads.add(at);
            at.start();
        }
        for (MyThread t : threads) {
            try {
                t.join();
                result += t.result;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
