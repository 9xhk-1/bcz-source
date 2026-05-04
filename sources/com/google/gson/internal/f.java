package com.google.gson.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f35035a = a();

    public static int a() {
        return d(System.getProperty("java.version"));
    }

    public static int b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb2.append(charAt);
            }
            return Integer.parseInt(sb2.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int c() {
        return f35035a;
    }

    public static int d(String str) {
        int f11 = f(str);
        if (f11 == -1) {
            f11 = b(str);
        }
        if (f11 == -1) {
            return 6;
        }
        return f11;
    }

    public static boolean e() {
        return f35035a >= 9;
    }

    public static int f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
