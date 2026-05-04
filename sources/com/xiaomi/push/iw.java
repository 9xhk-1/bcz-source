package com.xiaomi.push;

import com.xiaomi.push.iz;

/* loaded from: classes8.dex */
public class iw {

    /* renamed from: a, reason: collision with root package name */
    private final jd f46148a;

    /* renamed from: a, reason: collision with other field name */
    private final jm f832a;

    public iw() {
        this(new iz.a());
    }

    public void a(is isVar, byte[] bArr) {
        try {
            this.f832a.a(bArr);
            isVar.a(this.f46148a);
        } finally {
            this.f46148a.k();
        }
    }

    public iw(jf jfVar) {
        jm jmVar = new jm();
        this.f832a = jmVar;
        this.f46148a = jfVar.a(jmVar);
    }
}
