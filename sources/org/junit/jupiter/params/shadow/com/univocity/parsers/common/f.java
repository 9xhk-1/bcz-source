package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.MethodFilter;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class f<F extends q> extends g<F> {

    /* renamed from: p, reason: collision with root package name */
    public o90.z<? extends i> f78095p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f78098s;

    /* renamed from: t, reason: collision with root package name */
    public long f78099t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f78100u;

    /* renamed from: v, reason: collision with root package name */
    public long f78101v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f78102w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f78103x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f78104y;

    /* renamed from: z, reason: collision with root package name */
    public List<k90.g> f78105z;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f78094o = null;

    /* renamed from: q, reason: collision with root package name */
    public boolean f78096q = true;

    /* renamed from: r, reason: collision with root package name */
    public int f78097r = 1048576;

    public f() {
        this.f78098s = Runtime.getRuntime().availableProcessors() > 1;
        this.f78099t = -1L;
        this.f78100u = false;
        this.f78101v = 0L;
        this.f78102w = false;
        this.f78103x = true;
        this.f78104y = true;
        this.f78105z = new ArrayList();
    }

    public final boolean A0() {
        return this.f78100u;
    }

    public k90.a B0() {
        int t11 = t();
        return t11 != -1 ? new k90.d(t11, v(), A()) : new k90.f(v(), A());
    }

    public k90.c E0(int i11) {
        return this.f78098s ? this.f78100u ? new l90.b(o().g(), n0(), 10, i11, this.f78103x) : new l90.b(o().e(), o().g(), n0(), 10, i11, this.f78103x) : this.f78100u ? new org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.b(o().g(), n0(), i11, this.f78103x) : new org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.b(o().e(), o().g(), n0(), i11, this.f78103x);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public final void F() {
        Class cls;
        o90.z<? extends i> zVar = this.f78095p;
        if (zVar instanceof o90.d) {
            cls = ((o90.d) zVar).M();
        } else {
            if (zVar instanceof o90.l) {
                Class[] d11 = ((o90.l) zVar).d();
                if (d11.length > 0) {
                    cls = d11[0];
                }
            }
            cls = null;
        }
        if (cls != null) {
            l0(cls);
        }
    }

    public final boolean F0() {
        o90.z<? extends i> zVar = this.f78095p;
        if (zVar instanceof o90.u) {
            return ((o90.u) zVar).a();
        }
        return false;
    }

    public void G0(boolean z11) {
        this.f78103x = z11;
    }

    public void I0(boolean z11) {
        if (z11 && F0()) {
            throw new IllegalArgumentException("Cannot reorder columns when using a row processor that manipulates nested rows.");
        }
        this.f78096q = z11;
    }

    public void J0(boolean z11) {
        this.f78102w = z11;
    }

    public void M0(boolean z11) {
        this.f78104y = z11;
    }

    public void N0(boolean z11) {
        this.f78094o = Boolean.valueOf(z11);
    }

    public void O0(int i11) {
        this.f78097r = i11;
    }

    public final void P0(boolean z11) {
        this.f78100u = z11;
    }

    public void S0(long j11) {
        this.f78099t = j11;
    }

    public final void T0(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("Number of rows to skip from the input must be 0 or greater");
        }
        this.f78101v = j11;
    }

    public void U0(o90.z<? extends i> zVar) {
        this.f78095p = zVar;
    }

    public void V0(boolean z11) {
        this.f78098s = z11;
    }

    @Deprecated
    public void W0(n90.y yVar) {
        this.f78095p = yVar;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public void a(Map<String, Object> map) {
        super.a(map);
        map.put("Header extraction enabled", this.f78094o);
        o90.z<? extends i> zVar = this.f78095p;
        map.put("Processor", zVar == null ? "none" : zVar.getClass().getName());
        map.put("Column reordering enabled", Boolean.valueOf(this.f78096q));
        map.put("Input buffer size", Integer.valueOf(this.f78097r));
        map.put("Input reading on separate thread", Boolean.valueOf(this.f78098s));
        long j11 = this.f78099t;
        map.put("Number of records to read", j11 == -1 ? TtmlNode.COMBINE_ALL : Long.valueOf(j11));
        map.put("Line separator detection enabled", Boolean.valueOf(this.f78100u));
        map.put("Auto-closing enabled", Boolean.valueOf(this.f78103x));
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public void c() {
        super.c();
        this.f78095p = null;
        this.f78099t = -1L;
        this.f78101v = 0L;
    }

    public void g0(k90.g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.f78105z == null) {
            this.f78105z = new ArrayList();
        }
        this.f78105z.add(gVar);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public f clone() {
        return (f) super.clone();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public f e(boolean z11) {
        return (f) super.e(z11);
    }

    public synchronized void l0(Class<?> cls) {
        try {
            if (g(cls)) {
                g90.h s11 = h90.a.s(cls);
                String[] strArr = d.f78085a;
                boolean a11 = h90.a.a(cls);
                boolean z11 = !a11;
                if (s11 != null) {
                    if (s11.sequence().length > 0) {
                        strArr = s11.sequence();
                    }
                    z11 = s11.extract();
                }
                if (this.f78094o == null) {
                    N0(z11);
                }
                if (p() == null && strArr.length > 0 && !this.f78094o.booleanValue()) {
                    R(cls, strArr);
                }
                if (n() == null) {
                    if (a11) {
                        K(h90.a.L(cls, MethodFilter.ONLY_SETTERS));
                    } else if (strArr.length > 0 && h90.a.d(cls)) {
                        J(strArr);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public j90.m m() {
        if (F0()) {
            return null;
        }
        return super.m();
    }

    public List<k90.g> m0() {
        return this.f78105z;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public j90.n<?> n() {
        if (F0()) {
            return null;
        }
        return super.n();
    }

    public int n0() {
        return this.f78097r;
    }

    public long o0() {
        return this.f78099t;
    }

    public final long p0() {
        return this.f78101v;
    }

    public <T extends i> o90.z<T> q0() {
        o90.z<T> zVar = (o90.z<T>) this.f78095p;
        return zVar == null ? o90.y.f76714a : zVar;
    }

    public boolean r0() {
        return this.f78098s;
    }

    @Deprecated
    public n90.y s0() {
        o90.z<? extends i> zVar = this.f78095p;
        return zVar == null ? n90.r.f74981a : (n90.y) zVar;
    }

    public boolean t0() {
        return this.f78103x;
    }

    public boolean u0() {
        return !F0() && this.f78096q;
    }

    public boolean v0() {
        return this.f78102w;
    }

    public boolean x0() {
        return this.f78104y;
    }

    public boolean z0() {
        Boolean bool = this.f78094o;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
