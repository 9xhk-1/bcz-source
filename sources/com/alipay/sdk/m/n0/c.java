package com.alipay.sdk.m.n0;

import android.content.Context;
import java.util.zip.Adler32;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static b f10867a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f10868b = new Object();

    public static long a(b bVar) {
        if (bVar == null) {
            return 0L;
        }
        String format = String.format("%s%s%s%s%s", bVar.c(), bVar.d(), Long.valueOf(bVar.a()), bVar.e(), bVar.b());
        if (com.alipay.sdk.m.l0.f.m5632a(format)) {
            return 0L;
        }
        Adler32 adler32 = new Adler32();
        adler32.reset();
        adler32.update(format.getBytes());
        return adler32.getValue();
    }

    public static synchronized b b(Context context) {
        synchronized (c.class) {
            b bVar = f10867a;
            if (bVar != null) {
                return bVar;
            }
            if (context == null) {
                return null;
            }
            b a11 = a(context);
            f10867a = a11;
            return a11;
        }
    }

    public static b a(Context context) {
        if (context == null) {
            return null;
        }
        synchronized (f10868b) {
            try {
                String b11 = d.a(context).b();
                if (com.alipay.sdk.m.l0.f.m5632a(b11)) {
                    return null;
                }
                if (b11.endsWith("\n")) {
                    b11 = b11.substring(0, b11.length() - 1);
                }
                b bVar = new b();
                long currentTimeMillis = System.currentTimeMillis();
                String a11 = com.alipay.sdk.m.l0.d.a(context);
                String b12 = com.alipay.sdk.m.l0.d.b(context);
                bVar.c(a11);
                bVar.a(a11);
                bVar.b(currentTimeMillis);
                bVar.b(b12);
                bVar.d(b11);
                bVar.a(a(bVar));
                return bVar;
            } finally {
            }
        }
    }
}
