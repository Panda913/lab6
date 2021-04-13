package com.company;

import com.sun.prism.shader.Mask_TextureRGB_Loader;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {

    private static final int VARIANT_NUMBER = 2;

    public static void main(String[] args) {
       try {
           start();
       } catch ( NullPointerException e){
           System.out.println("Oops.....");
       }

    }

    public static  void start() throws  NullPointerException{
        long toValue = 1_000_000_000;

        double tStart = System.nanoTime();
        System.out.println(arithmeticSum1.arithmeticSum1(VARIANT_NUMBER, toValue));
        double tEnd = System.nanoTime();
        System.out.println("Витрачений час - " + (tEnd - tStart));

        tStart = System.nanoTime();
        System.out.println(arithmeticSum2.arithmeticSum2(VARIANT_NUMBER, toValue));
        tEnd = System.nanoTime();
        System.out.println("Витрачений час - " + (tEnd - tStart));

        tStart = System.nanoTime();
        System.out.println( arithmeticSum3.arithmeticSum3(VARIANT_NUMBER, toValue, 8));
        tEnd = System.nanoTime();
        System.out.println("Витрачений час - " + (tEnd - tStart));

    }

}

