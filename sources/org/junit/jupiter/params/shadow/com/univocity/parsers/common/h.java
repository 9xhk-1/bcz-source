package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.MethodFilter;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class h<F extends q> extends g<F> {

    /* renamed from: o, reason: collision with root package name */
    public n90.a0<?> f78125o;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f78126p = null;

    /* renamed from: q, reason: collision with root package name */
    public String f78127q = "";

    /* renamed from: r, reason: collision with root package name */
    public boolean f78128r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f78129s = false;

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public final void F() {
        n90.a0<?> a0Var = this.f78125o;
        if (a0Var instanceof n90.f) {
            j0(((n90.f) a0Var).M());
        }
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public void a(Map<String, Object> map) {
        super.a(map);
        map.put("Empty value", this.f78127q);
        map.put("Header writing enabled", this.f78126p);
        n90.a0<?> a0Var = this.f78125o;
        map.put("Row processor", a0Var == null ? "none" : a0Var.getClass().getName());
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public void c() {
        super.c();
        this.f78125o = null;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public h clone() {
        return (h) super.clone();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public h e(boolean z11) {
        return (h) super.e(z11);
    }

    public void j0(Class<?> cls) {
        boolean z11;
        if (g(cls)) {
            g90.h s11 = h90.a.s(cls);
            String[] h11 = h90.a.h(cls, MethodFilter.ONLY_GETTERS);
            if (s11 != null) {
                if (s11.sequence().length > 0) {
                    h11 = s11.sequence();
                }
                z11 = s11.write();
            } else {
                z11 = false;
            }
            if (this.f78126p == null) {
                this.f78126p = Boolean.valueOf(z11);
            }
            if (p() != null || h11.length <= 0) {
                return;
            }
            R(cls, h11);
        }
    }

    public String l0() {
        return this.f78127q;
    }

    public final boolean m0() {
        return this.f78128r;
    }

    public n90.a0<?> n0() {
        return this.f78125o;
    }

    public boolean o0() {
        return this.f78129s;
    }

    public final boolean p0() {
        Boolean bool = this.f78126p;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void q0(boolean z11) {
        this.f78129s = z11;
    }

    public void r0(String str) {
        this.f78127q = str;
    }

    public final void s0(boolean z11) {
        this.f78128r = z11;
    }

    public final void t0(boolean z11) {
        this.f78126p = Boolean.valueOf(z11);
    }

    public void u0(n90.a0<?> a0Var) {
        this.f78125o = a0Var;
    }
}
