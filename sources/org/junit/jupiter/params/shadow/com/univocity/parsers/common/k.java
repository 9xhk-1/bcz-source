package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class k<T extends i> implements i {

    /* renamed from: a, reason: collision with root package name */
    public final T f78166a;

    public k(T t11) {
        this.f78166a = t11;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public String[] a() {
        return this.f78166a.a();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public boolean c() {
        return this.f78166a.c();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public int e(String str) {
        return this.f78166a.e(str);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public String[] f() {
        return this.f78166a.f();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public int[] g() {
        return this.f78166a.g();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public int h(Enum<?> r22) {
        return this.f78166a.h(r22);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public boolean isStopped() {
        return this.f78166a.isStopped();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public p90.c k(String[] strArr) {
        return this.f78166a.k(strArr);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public int l() {
        return this.f78166a.l();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public int m() {
        return this.f78166a.m();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public long p() {
        return this.f78166a.p();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public p90.f s() {
        return this.f78166a.s();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public void stop() {
        this.f78166a.stop();
    }
}
