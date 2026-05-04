package t90;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;
import org.junit.jupiter.params.shadow.com.univocity.parsers.fixed.FieldAlignment;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class h extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.h<c> {

    /* renamed from: t, reason: collision with root package name */
    public b f90373t;

    /* renamed from: u, reason: collision with root package name */
    public Map<String, b> f90374u;

    /* renamed from: v, reason: collision with root package name */
    public Map<String, b> f90375v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f90376w;

    /* renamed from: x, reason: collision with root package name */
    public FieldAlignment f90377x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f90378y;

    public h(b bVar) {
        this.f90374u = new HashMap();
        this.f90375v = new HashMap();
        this.f90376w = true;
        this.f90377x = null;
        this.f90378y = true;
        W0(bVar);
        NormalizedString[] A = bVar.A();
        if (A != null) {
            Q(NormalizedString.toArray(A));
        }
    }

    public final h A0(b bVar) {
        return E0(true, bVar);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.h
    @Deprecated
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public final h e(boolean z11) {
        b bVar = this.f90373t;
        return E0(z11, bVar == null ? null : bVar.clone());
    }

    public final h E0(boolean z11, b bVar) {
        h hVar = (h) super.e(z11);
        hVar.f90373t = bVar;
        if (z11) {
            hVar.f90374u = new HashMap();
            hVar.f90375v = new HashMap();
            return hVar;
        }
        hVar.f90374u = new HashMap(this.f90374u);
        hVar.f90375v = new HashMap(this.f90375v);
        return hVar;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public c f() {
        return new c();
    }

    public int[] G0() {
        b bVar = this.f90373t;
        if (bVar == null) {
            return null;
        }
        return bVar.x();
    }

    public FieldAlignment I0() {
        return this.f90377x;
    }

    public FieldAlignment[] J0() {
        b bVar = this.f90373t;
        if (bVar == null) {
            return null;
        }
        return bVar.y();
    }

    public int[] M0() {
        b bVar = this.f90373t;
        if (bVar == null) {
            return null;
        }
        return bVar.z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public char[] N0() {
        b bVar = this.f90373t;
        if (bVar == null) {
            return null;
        }
        return bVar.E((c) o());
    }

    public boolean[] O0() {
        b bVar = this.f90373t;
        if (bVar == null) {
            return null;
        }
        return bVar.G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i[] P0() {
        return i.c(this.f90374u, (c) o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i[] S0() {
        return i.c(this.f90375v, (c) o());
    }

    public boolean T0() {
        return this.f90376w;
    }

    public boolean U0() {
        return this.f90378y;
    }

    public void V0(FieldAlignment fieldAlignment) {
        this.f90377x = fieldAlignment;
    }

    public final void W0(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Field lengths cannot be null");
        }
        this.f90373t = bVar;
    }

    public void X0(boolean z11) {
        this.f90376w = z11;
    }

    public void Y0(boolean z11) {
        this.f90378y = z11;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.h, org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public void a(Map<String, Object> map) {
        super.a(map);
        map.put("Write line separator after record", Boolean.valueOf(this.f90378y));
        map.put("Field lengths", this.f90373t);
        map.put("Lookahead formats", this.f90374u);
        map.put("Lookbehind formats", this.f90375v);
        map.put("Use default padding for headers", Boolean.valueOf(this.f90376w));
        map.put("Default alignment for headers", this.f90377x);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.h
    public void j0(Class<?> cls) {
        if (this.f90373t != null) {
            return;
        }
        try {
            this.f90373t = b.u(cls);
            g90.h s11 = h90.a.s(cls);
            t0(s11 != null && s11.write());
        } catch (Exception unused) {
        }
        super.j0(cls);
        b.X(this.f90373t, this);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
    public int u() {
        int u11 = super.u();
        int length = i.a(this.f90373t, this.f90374u, this.f90375v).length;
        return u11 > length ? u11 : length;
    }

    public void v0(String str, b bVar) {
        i.f(str, bVar, this.f90374u);
    }

    public void x0(String str, b bVar) {
        i.g(str, bVar, this.f90375v);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.h
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final h clone() {
        return (h) super.e(false);
    }

    public h() {
        this.f90374u = new HashMap();
        this.f90375v = new HashMap();
        this.f90376w = true;
        this.f90377x = null;
        this.f90378y = true;
        this.f90373t = null;
    }
}
