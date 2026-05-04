package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class g<F extends q> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public F f78111a;

    /* renamed from: j, reason: collision with root package name */
    public b0<? extends i> f78120j;

    /* renamed from: m, reason: collision with root package name */
    public String[] f78123m;

    /* renamed from: n, reason: collision with root package name */
    public Class<?> f78124n;

    /* renamed from: b, reason: collision with root package name */
    public String f78112b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f78113c = 4096;

    /* renamed from: d, reason: collision with root package name */
    public int f78114d = 512;

    /* renamed from: e, reason: collision with root package name */
    public boolean f78115e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f78116f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f78117g = true;

    /* renamed from: h, reason: collision with root package name */
    public j90.m f78118h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f78119i = true;

    /* renamed from: k, reason: collision with root package name */
    public int f78121k = -1;

    /* renamed from: l, reason: collision with root package name */
    public boolean f78122l = true;

    public g() {
        P(f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> j90.n<T> O(j90.n<T> nVar, T... tArr) {
        this.f78118h = (j90.m) nVar;
        nVar.b(tArr);
        return nVar;
    }

    public final int A() {
        return this.f78122l ? -1 : 1;
    }

    public final boolean B() {
        return this.f78119i;
    }

    public boolean E() {
        return this.f78120j != null;
    }

    public j90.n<Enum> G(Enum... enumArr) {
        return O(new j90.j(), enumArr);
    }

    public j90.n<String> J(String... strArr) {
        return O(new j90.l(), strArr);
    }

    public j90.n<Integer> K(Integer... numArr) {
        return O(new j90.k(), numArr);
    }

    public final void M(boolean z11) {
        this.f78119i = z11;
    }

    public void N(int i11) {
        this.f78121k = i11;
    }

    public void P(F f11) {
        if (f11 == null) {
            throw new IllegalArgumentException("Format cannot be null");
        }
        this.f78111a = f11;
    }

    public void Q(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.f78123m = null;
        } else {
            this.f78123m = strArr;
        }
    }

    public void R(Class<?> cls, String... strArr) {
        this.f78124n = cls;
        Q(strArr);
    }

    public void T(boolean z11) {
        this.f78117g = z11;
    }

    public void W(boolean z11) {
        this.f78116f = z11;
    }

    public void X(int i11) {
        this.f78113c = i11;
    }

    public void Y(int i11) {
        this.f78114d = i11;
    }

    public void Z(String str) {
        this.f78112b = str;
    }

    public void a(Map<String, Object> map) {
        map.put("Null value", this.f78112b);
        map.put("Maximum number of characters per column", Integer.valueOf(this.f78113c));
        map.put("Maximum number of columns", Integer.valueOf(this.f78114d));
        map.put("Skip empty lines", Boolean.valueOf(this.f78115e));
        map.put("Ignore trailing whitespaces", Boolean.valueOf(this.f78116f));
        map.put("Ignore leading whitespaces", Boolean.valueOf(this.f78117g));
        j90.m mVar = this.f78118h;
        map.put("Selected fields", mVar == null ? "none" : mVar.H());
        map.put("Headers", Arrays.toString(this.f78123m));
        map.put("Auto configuration enabled", Boolean.valueOf(this.f78119i));
        map.put("RowProcessor error handler", this.f78120j);
        map.put("Length of content displayed on error", Integer.valueOf(this.f78121k));
        map.put("Restricting data in exceptions", Boolean.valueOf(this.f78121k == 0));
        map.put("Skip bits as whitespace", Boolean.valueOf(this.f78122l));
    }

    public void a0(b0<? extends i> b0Var) {
        this.f78120j = b0Var;
    }

    public final void b() {
        if (this.f78119i) {
            F();
        }
    }

    @Deprecated
    public void b0(e0 e0Var) {
        this.f78120j = e0Var;
    }

    public void c() {
        this.f78118h = null;
        this.f78123m = null;
    }

    public final void c0(boolean z11) {
        this.f78122l = z11;
    }

    @Override // 
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public g clone() {
        return e(false);
    }

    public g e(boolean z11) {
        try {
            g gVar = (g) super.clone();
            F f11 = gVar.f78111a;
            if (f11 != null) {
                gVar.f78111a = (F) f11.clone();
            }
            if (z11) {
                gVar.c();
            }
            return gVar;
        } catch (CloneNotSupportedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public void e0(boolean z11) {
        this.f78115e = z11;
    }

    public abstract F f();

    public final void f0(boolean z11) {
        T(z11);
        W(z11);
    }

    public boolean g(Class<?> cls) {
        Class<?> cls2 = this.f78124n;
        if (cls2 == null) {
            return true;
        }
        if (cls2 == cls) {
            return false;
        }
        Q(null);
        return true;
    }

    public j90.n<Enum> h(Enum... enumArr) {
        return O(new j90.f(), enumArr);
    }

    public j90.n<String> i(String... strArr) {
        return O(new j90.h(), strArr);
    }

    public j90.n<Integer> j(Integer... numArr) {
        return O(new j90.g(), numArr);
    }

    public int l() {
        return this.f78121k;
    }

    public j90.m m() {
        return this.f78118h;
    }

    public j90.n<?> n() {
        return (j90.n) this.f78118h;
    }

    public F o() {
        return this.f78111a;
    }

    public String[] p() {
        return this.f78123m;
    }

    public boolean q() {
        return this.f78117g;
    }

    public boolean s() {
        return this.f78116f;
    }

    public int t() {
        return this.f78113c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(':');
        TreeMap treeMap = new TreeMap();
        a(treeMap);
        for (Map.Entry entry : treeMap.entrySet()) {
            sb2.append(ta0.b.f90407c);
            sb2.append((String) entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append("Format configuration:\n\t");
        sb2.append(o().toString());
        return sb2.toString();
    }

    public int u() {
        return this.f78114d;
    }

    public String v() {
        return this.f78112b;
    }

    public <T extends i> b0<T> w() {
        b0<T> b0Var = (b0<T>) this.f78120j;
        return b0Var == null ? v.f78195a : b0Var;
    }

    @Deprecated
    public e0 x() {
        b0<? extends i> b0Var = this.f78120j;
        return b0Var == null ? w.f78196a : (e0) b0Var;
    }

    public final boolean y() {
        return this.f78122l;
    }

    public boolean z() {
        return this.f78115e;
    }

    public void F() {
    }
}
