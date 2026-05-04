package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class z extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f78216b;

    /* renamed from: c, reason: collision with root package name */
    public final long f78217c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Long, String> f78218d;

    /* renamed from: e, reason: collision with root package name */
    public final String f78219e;

    /* renamed from: f, reason: collision with root package name */
    public final int f78220f;

    /* renamed from: g, reason: collision with root package name */
    public final String f78221g;

    /* renamed from: h, reason: collision with root package name */
    public final long f78222h;

    public z(y yVar) {
        super(yVar);
        this.f78216b = yVar.o();
        this.f78217c = yVar.n();
        Map<Long, String> b11 = yVar.b();
        Map<Long, String> map = Collections.EMPTY_MAP;
        this.f78218d = b11 != map ? Collections.unmodifiableMap(yVar.b()) : map;
        this.f78219e = yVar.q();
        this.f78220f = yVar.m();
        this.f78221g = yVar.i();
        this.f78222h = yVar.p();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.a0, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public Map<Long, String> b() {
        return this.f78218d;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.a0, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public String i() {
        return this.f78221g;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.k, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public int m() {
        return this.f78220f;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.a0, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public long n() {
        return this.f78217c;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.a0, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public long o() {
        return this.f78216b;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.k, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public long p() {
        return this.f78222h;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.a0, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public String q() {
        return this.f78219e;
    }
}
