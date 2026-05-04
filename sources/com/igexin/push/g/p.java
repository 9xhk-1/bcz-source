package com.igexin.push.g;

import java.util.Random;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f38748a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz`~!@#$%^&*()-_=+[{}];:'/?.>,<".toCharArray();

    public static String a() {
        StringBuilder sb2 = new StringBuilder(16);
        Random random = new Random();
        for (int i11 = 0; i11 < 16; i11++) {
            char[] cArr = f38748a;
            sb2.append(cArr[random.nextInt(cArr.length)]);
        }
        return sb2.toString();
    }

    public static String b() {
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 16; i11++) {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(62)));
        }
        return sb2.toString();
    }

    private static long c() {
        return (new Random().nextInt(6) + 2) * 60000;
    }
}
