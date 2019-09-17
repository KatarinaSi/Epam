package com.jarniks;

import com.jarniks.depended.DependedClass;

public class JarFromCMD {
    public static void main(String[] args) {
        System.out.println("Jar from cmd");
        DependedClass dc = new DependedClass();
        System.out.println(dc.getStr() + " from " + dc.getClass());
    }
}
