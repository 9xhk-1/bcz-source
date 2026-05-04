package com.zx.a.I8b7;

import com.zx.a.I8b7.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class k1 implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            h1 h1Var = h1.b.f46530a;
            h1Var.getClass();
            if (h1.f46518i != null && h1.f46518i.length() > 0) {
                h1.f46518i.a(h1Var.f46522c - 1);
                h1Var.f46522c = h1.f46518i.length();
            }
            if (h1.f46519j == null || h1.f46519j.length() <= 0) {
                return;
            }
            h1.f46519j.a(h1Var.f46523d - 1);
            h1Var.f46523d = h1.f46519j.length();
        } catch (Throwable th2) {
            r2.a(th2);
        }
    }
}
