package com.xiaomi.push;

import java.net.InetSocketAddress;

/* loaded from: classes8.dex */
public final class cs {

    /* renamed from: a, reason: collision with root package name */
    private int f45363a;

    /* renamed from: a, reason: collision with other field name */
    private String f218a;

    public cs(String str, int i11) {
        this.f218a = str;
        this.f45363a = i11;
    }

    public int a() {
        return this.f45363a;
    }

    public String toString() {
        if (this.f45363a <= 0) {
            return this.f218a;
        }
        return this.f218a + ":" + this.f45363a;
    }

    public static cs a(String str, int i11) {
        int lastIndexOf = str.lastIndexOf(":");
        if (lastIndexOf != -1) {
            String substring = str.substring(0, lastIndexOf);
            try {
                int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
                if (parseInt > 0) {
                    i11 = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
            str = substring;
        }
        return new cs(str, i11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m5802a() {
        return this.f218a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static InetSocketAddress m5801a(String str, int i11) {
        cs a11 = a(str, i11);
        return new InetSocketAddress(a11.m5802a(), a11.a());
    }
}
