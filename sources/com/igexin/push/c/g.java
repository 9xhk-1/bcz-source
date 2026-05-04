package com.igexin.push.c;

import android.text.TextUtils;
import com.igexin.push.c.b;

/* loaded from: classes7.dex */
public final class g extends h implements i {

    /* renamed from: e, reason: collision with root package name */
    private static g f37480e;

    private g() {
        super(com.igexin.push.core.e.f38014ap, com.igexin.push.core.e.f38016ar);
        this.f37485d.f37427j = false;
    }

    public static synchronized g a() {
        g gVar;
        synchronized (g.class) {
            try {
                if (f37480e == null) {
                    f37480e = new g();
                }
                gVar = f37480e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @Override // com.igexin.push.c.h
    public final int c() {
        return b.EnumC0463b.f37454b;
    }

    @Override // com.igexin.push.c.i
    public final void a(int i11, d dVar) {
        e a11;
        if (dVar == null || TextUtils.isEmpty(dVar.a()) || (a11 = a(dVar.a())) == null) {
            return;
        }
        a(dVar);
        a11.a();
        m();
        if (i11 == b.a.f37449a) {
            l();
        }
    }

    @Override // com.igexin.push.c.i
    public final void b() {
    }

    @Override // com.igexin.push.c.h
    public final i d() {
        return this;
    }
}
