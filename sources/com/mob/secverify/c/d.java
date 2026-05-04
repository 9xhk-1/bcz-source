package com.mob.secverify.c;

import com.mob.secverify.common.exception.VerifyException;
import com.mob.secverify.pure.core.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static volatile d f40715a;

    private d() {
    }

    public static d a() {
        if (f40715a == null) {
            synchronized (d.class) {
                try {
                    if (f40715a == null) {
                        f40715a = new d();
                    }
                } finally {
                }
            }
        }
        return f40715a;
    }

    public String b() throws VerifyException {
        return f.a().b();
    }
}
