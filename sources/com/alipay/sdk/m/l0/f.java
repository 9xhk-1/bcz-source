package com.alipay.sdk.m.l0;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f10776a = Pattern.compile("([\t\r\n])+");

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5632a(String str) {
        return str == null || str.length() <= 0;
    }

    public static int a(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i11 = 0;
        for (char c11 : str.toCharArray()) {
            i11 = (i11 * 31) + c11;
        }
        return i11;
    }
}
