package com.igexin.push.f;

import android.os.Message;
import com.igexin.push.core.d;

/* loaded from: classes7.dex */
public class a implements com.igexin.push.f.b.c {

    /* renamed from: b, reason: collision with root package name */
    private static final long f38517b = 360000;

    /* renamed from: c, reason: collision with root package name */
    private static a f38518c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f38519d = "CheckCondition";

    /* renamed from: a, reason: collision with root package name */
    private long f38520a = 0;

    public static a a() {
        if (f38518c == null) {
            synchronized (a.class) {
                try {
                    if (f38518c == null) {
                        f38518c = new a();
                    }
                } finally {
                }
            }
        }
        return f38518c;
    }

    private static boolean d() {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = com.igexin.push.core.e.S;
        if (j11 <= 0) {
            com.igexin.push.core.e.S = currentTimeMillis - 60000;
            return true;
        }
        if (currentTimeMillis - j11 <= 60000) {
            return false;
        }
        com.igexin.push.core.e.S = currentTimeMillis;
        return true;
    }

    @Override // com.igexin.push.f.b.c
    public final void b() {
        com.igexin.c.a.c.a.b("CheckConditionTask", "CheckConditionTask start to run check condition status...");
        Message obtain = Message.obtain();
        obtain.what = com.igexin.push.core.b.T;
        d.a.f37956a.a(obtain);
    }

    @Override // com.igexin.push.f.b.c
    public final boolean c() {
        return System.currentTimeMillis() - this.f38520a > f38517b;
    }

    @Override // com.igexin.push.f.b.c
    public final void a(long j11) {
        this.f38520a = j11;
    }

    public final void a(boolean z11) {
        if (!z11 || d()) {
            b();
        }
    }
}
