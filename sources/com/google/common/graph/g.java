package com.google.common.graph;

import com.google.common.graph.c;
import mo.a1;
import mo.e0;
import mo.f0;
import mo.h0;
import mo.h1;
import mo.k;
import mo.x;
import mo.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public final class g<N> extends h0<N> implements y0<N> {

    /* renamed from: a, reason: collision with root package name */
    public final a1<N, c.a> f34235a;

    public g(k<? super N> builder) {
        this.f34235a = new h1(builder);
    }

    @Override // mo.y0
    public boolean G(f0<N> endpoints) {
        V(endpoints);
        return K(endpoints.f(), endpoints.g());
    }

    @Override // mo.y0
    public boolean K(N nodeU, N nodeV) {
        return this.f34235a.A(nodeU, nodeV, c.a.EDGE_EXISTS) == null;
    }

    @Override // mo.h0
    public x<N> W() {
        return this.f34235a;
    }

    @Override // mo.y0
    public boolean o(N node) {
        return this.f34235a.o(node);
    }

    @Override // mo.y0
    public boolean p(N node) {
        return this.f34235a.p(node);
    }

    @Override // mo.y0
    public boolean r(N nodeU, N nodeV) {
        return this.f34235a.r(nodeU, nodeV) != null;
    }

    @Override // mo.y0
    public boolean t(f0<N> endpoints) {
        V(endpoints);
        return r(endpoints.f(), endpoints.g());
    }
}
