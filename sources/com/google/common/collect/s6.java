package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.collect.t6;
import ho.b0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class s6 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f33830g = 16;

    /* renamed from: h, reason: collision with root package name */
    public static final int f33831h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f33832i = -1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f33833a;

    /* renamed from: b, reason: collision with root package name */
    public int f33834b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f33835c = -1;

    /* renamed from: d, reason: collision with root package name */
    @CheckForNull
    public t6.p f33836d;

    /* renamed from: e, reason: collision with root package name */
    @CheckForNull
    public t6.p f33837e;

    /* renamed from: f, reason: collision with root package name */
    @CheckForNull
    public Equivalence<Object> f33838f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        VALUE
    }

    @uo.a
    public s6 a(int concurrencyLevel) {
        int i11 = this.f33835c;
        Preconditions.checkState(i11 == -1, "concurrency level was already set to %s", i11);
        Preconditions.checkArgument(concurrencyLevel > 0);
        this.f33835c = concurrencyLevel;
        return this;
    }

    public int b() {
        int i11 = this.f33835c;
        if (i11 == -1) {
            return 4;
        }
        return i11;
    }

    public int c() {
        int i11 = this.f33834b;
        if (i11 == -1) {
            return 16;
        }
        return i11;
    }

    public Equivalence<Object> d() {
        return (Equivalence) ho.b0.a(this.f33838f, e().b());
    }

    public t6.p e() {
        return (t6.p) ho.b0.a(this.f33836d, t6.p.f33929a);
    }

    public t6.p f() {
        return (t6.p) ho.b0.a(this.f33837e, t6.p.f33929a);
    }

    @uo.a
    public s6 g(int initialCapacity) {
        int i11 = this.f33834b;
        Preconditions.checkState(i11 == -1, "initial capacity was already set to %s", i11);
        Preconditions.checkArgument(initialCapacity >= 0);
        this.f33834b = initialCapacity;
        return this;
    }

    @go.c
    @uo.a
    public s6 h(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f33838f;
        Preconditions.checkState(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f33838f = (Equivalence) Preconditions.checkNotNull(equivalence);
        this.f33833a = true;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> i() {
        return !this.f33833a ? new ConcurrentHashMap(c(), 0.75f, b()) : t6.d(this);
    }

    public s6 j(t6.p strength) {
        t6.p pVar = this.f33836d;
        Preconditions.checkState(pVar == null, "Key strength was already set to %s", pVar);
        this.f33836d = (t6.p) Preconditions.checkNotNull(strength);
        if (strength != t6.p.f33929a) {
            this.f33833a = true;
        }
        return this;
    }

    public s6 k(t6.p strength) {
        t6.p pVar = this.f33837e;
        Preconditions.checkState(pVar == null, "Value strength was already set to %s", pVar);
        this.f33837e = (t6.p) Preconditions.checkNotNull(strength);
        if (strength != t6.p.f33929a) {
            this.f33833a = true;
        }
        return this;
    }

    @go.c
    @uo.a
    public s6 l() {
        return j(t6.p.f33930b);
    }

    @go.c
    @uo.a
    public s6 m() {
        return k(t6.p.f33930b);
    }

    public String toString() {
        b0.b c11 = ho.b0.c(this);
        int i11 = this.f33834b;
        if (i11 != -1) {
            c11.d("initialCapacity", i11);
        }
        int i12 = this.f33835c;
        if (i12 != -1) {
            c11.d("concurrencyLevel", i12);
        }
        t6.p pVar = this.f33836d;
        if (pVar != null) {
            c11.f("keyStrength", ho.c.g(pVar.toString()));
        }
        t6.p pVar2 = this.f33837e;
        if (pVar2 != null) {
            c11.f("valueStrength", ho.c.g(pVar2.toString()));
        }
        if (this.f33838f != null) {
            c11.s("keyEquivalence");
        }
        return c11.toString();
    }
}
