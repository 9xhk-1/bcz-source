package com.igexin.push.c;

import android.text.TextUtils;
import com.igexin.push.c.b;

/* loaded from: classes7.dex */
public final class j extends h implements i {

    /* renamed from: e, reason: collision with root package name */
    private static j f37492e;

    private j() {
        super(com.igexin.push.core.e.f38015aq, com.igexin.push.core.e.f38017as);
        this.f37485d.f37427j = true;
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            try {
                if (f37492e == null) {
                    f37492e = new j();
                }
                jVar = f37492e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    @Override // com.igexin.push.c.h
    public final int c() {
        return b.EnumC0463b.f37453a;
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
