package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class o extends m implements y {

    /* renamed from: g, reason: collision with root package name */
    public final k90.c f78181g;

    /* renamed from: h, reason: collision with root package name */
    public final b<?> f78182h;

    public o(b<?> bVar, int i11) {
        super(bVar == null ? null : bVar.f78014b, i11);
        this.f78182h = bVar;
        this.f78181g = bVar != null ? bVar.f78020h : null;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public Map<Long, String> b() {
        return this.f78182h.l();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public void d(long j11) {
        this.f78181g.d(j11);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public String i() {
        k90.c cVar = this.f78181g;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public int j() {
        k90.c cVar = this.f78181g;
        if (cVar != null) {
            return cVar.j();
        }
        return 0;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public char[] lineSeparator() {
        return this.f78181g.u();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public long n() {
        return this.f78181g.s();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public long o() {
        return this.f78181g.n();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public String q() {
        return this.f78182h.o();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public String r() {
        char[] k11 = this.f78168b.f78203g.k();
        if (k11 == null) {
            return null;
        }
        int length = this.f78168b.f78203g.length();
        if (length > k11.length) {
            length = k11.length;
        }
        if (length > 0) {
            return new String(k11, 0, length);
        }
        return null;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public String[] t() {
        return this.f78182h.q();
    }
}
