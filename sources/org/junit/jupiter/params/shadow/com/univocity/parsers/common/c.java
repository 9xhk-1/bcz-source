package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.io.File;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class c<S extends h<?>> {
    public final boolean A;
    public boolean B;
    public boolean C;
    public final g<p> D;
    public final int E;

    /* renamed from: a, reason: collision with root package name */
    public final n90.a0 f78058a;

    /* renamed from: b, reason: collision with root package name */
    public Writer f78059b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f78060c;

    /* renamed from: d, reason: collision with root package name */
    public final char f78061d;

    /* renamed from: e, reason: collision with root package name */
    public final k90.k f78062e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f78063f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f78064g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f78065h;

    /* renamed from: i, reason: collision with root package name */
    public final char[] f78066i;

    /* renamed from: j, reason: collision with root package name */
    public NormalizedString[] f78067j;

    /* renamed from: k, reason: collision with root package name */
    public long f78068k;

    /* renamed from: l, reason: collision with root package name */
    public final String f78069l;

    /* renamed from: m, reason: collision with root package name */
    public final String f78070m;

    /* renamed from: n, reason: collision with root package name */
    public final k90.k f78071n;

    /* renamed from: o, reason: collision with root package name */
    public final Object[] f78072o;

    /* renamed from: p, reason: collision with root package name */
    public int f78073p;

    /* renamed from: q, reason: collision with root package name */
    public Map<NormalizedString[], Map<NormalizedString, Integer>> f78074q;

    /* renamed from: r, reason: collision with root package name */
    public int f78075r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f78076s;

    /* renamed from: t, reason: collision with root package name */
    public boolean[] f78077t;

    /* renamed from: u, reason: collision with root package name */
    public NormalizedString[] f78078u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f78079v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f78080w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f78081x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f78082y;

    /* renamed from: z, reason: collision with root package name */
    public final int f78083z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g<p> {
        public a() {
        }

        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.g
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public p f() {
            return p.f78183g;
        }
    }

    public c(S s11) {
        this((Writer) null, s11);
    }

    public static int k0(int i11, String str) {
        if (str.isEmpty()) {
            return 0;
        }
        for (int i12 = 0; i12 < str.length(); i12++) {
            char charAt = str.charAt(i12);
            if (charAt > ' ' || i11 >= charAt) {
                return i12;
            }
        }
        return str.length();
    }

    public String A(Object obj) {
        this.f78082y = false;
        if (obj == null) {
            this.f78082y = true;
            return this.f78069l;
        }
        String valueOf = String.valueOf(obj);
        if (valueOf.isEmpty()) {
            this.f78082y = true;
            return this.f78070m;
        }
        if (!this.B || k0(this.f78083z, valueOf) != valueOf.length()) {
            return valueOf;
        }
        this.f78082y = true;
        return this.f78070m;
    }

    public final void A0(Collection<?> collection) {
        if (collection == null || collection.size() <= 0) {
            throw m0("No headers defined.");
        }
        B0((String[]) collection.toArray(new String[collection.size()]));
    }

    public final List<String> A1(Collection<String[]> collection) {
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<String[]> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(c1(it.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            throw o0("Error writing input rows", th2);
        }
    }

    public abstract void B(S s11);

    public final void B0(String... strArr) {
        if (this.f78068k > 0) {
            throw p0("Cannot write headers after records have been written.", strArr, null);
        }
        if (strArr == null || strArr.length <= 0) {
            throw p0("No headers defined.", strArr, null);
        }
        this.f78076s = true;
        if (this.A && this.f78064g != null) {
            s(strArr);
            Object[] objArr = this.f78064g;
            strArr = (String[]) Arrays.copyOf(objArr, objArr.length, String[].class);
        }
        this.f78067j = NormalizedString.toIdentifierGroupArray(strArr);
        l0(strArr);
        C();
        this.f78076s = false;
    }

    public final <K> List<String> B1(Map<K, String> map, Map<K, String[]> map2) {
        ArrayList arrayList = new ArrayList();
        h1(map, x0(map2), arrayList, false);
        return arrayList;
    }

    public final void C() {
        try {
            if (this.f78060c && this.f78062e.length() == 0) {
                return;
            }
            if (this.f78081x) {
                this.f78062e.G();
            }
            this.f78062e.I(this.f78059b);
            this.f78068k++;
        } catch (Throwable th2) {
            throw n0("Error writing row.", this.f78062e.A(), th2);
        }
    }

    public final String C0() {
        return E0(NormalizedString.toArray(this.f78067j));
    }

    public final <K> void C1(Map<K, String> map, Map<K, ?> map2) {
        if (map2 != null) {
            try {
                if (map2.isEmpty()) {
                    return;
                }
                this.f78078u = this.f78067j;
                if (this.f78080w) {
                    NormalizedString[] d11 = ((n90.b0) this.f78058a).d(map, map2);
                    this.f78078u = d11;
                    if (d11 == null) {
                        this.f78078u = this.f78067j;
                    }
                }
                if (this.f78078u == null) {
                    if (map != null) {
                        j0(map, false);
                        C1(map, map2);
                        return;
                    } else {
                        j0(map2, true);
                        C1(null, map2);
                        return;
                    }
                }
                if (map == null) {
                    for (Map.Entry<K, ?> entry : map2.entrySet()) {
                        e(this.f78078u, NormalizedString.valueOf(entry.getKey()), true, entry.getValue());
                    }
                    return;
                }
                for (Map.Entry<K, ?> entry2 : map2.entrySet()) {
                    String str = map.get(entry2.getKey());
                    if (str != null) {
                        e(this.f78078u, NormalizedString.valueOf(str), true, entry2.getValue());
                    }
                }
            } catch (Throwable th2) {
                throw o0("Error processing data from input map", th2);
            }
        }
    }

    public final String D() {
        if (this.f78060c && this.f78062e.length() == 0) {
            return null;
        }
        String A = this.f78062e.A();
        this.f78068k++;
        return A;
    }

    public final String D0(Collection<?> collection) {
        if (collection == null || collection.size() <= 0) {
            throw m0("No headers defined");
        }
        return E0((String[]) collection.toArray(new String[collection.size()]));
    }

    public final void D1() {
        t();
        W0(Arrays.copyOf(this.f78072o, this.f78073p));
        p();
    }

    public final <K> void E(Map<K, String> map, Map<K, Object[]> map2) {
        h1(map, v0(map2), null, true);
    }

    public final String E0(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            throw m0("No headers defined.");
        }
        this.f78076s = true;
        l0(strArr);
        this.f78076s = false;
        this.f78067j = NormalizedString.toIdentifierGroupArray(strArr);
        return D();
    }

    public final String E1() {
        t();
        String b12 = b1(Arrays.copyOf(this.f78072o, this.f78073p));
        p();
        return b12;
    }

    public final <K> void F(Map<K, Object[]> map) {
        a0(null, v0(map));
    }

    public final <K> void F0(Map<K, String> map, Map<K, Object[]> map2) {
        h1(map, v0(map2), null, false);
    }

    public final <K> void G(Map<K, String> map, Map<K, Object[]> map2) {
        try {
            E(map, map2);
        } finally {
            m();
        }
    }

    public final <K> void G0(Map<K, Object[]> map) {
        H0(null, map);
    }

    public final <K> List<String> H(Map<K, Object[]> map) {
        return I(null, map);
    }

    public final <K> void H0(Map<K, String> map, Map<K, Object[]> map2) {
        try {
            F0(map, map2);
        } finally {
            m();
        }
    }

    public final <K> List<String> I(Map<K, String> map, Map<K, Object[]> map2) {
        ArrayList arrayList = new ArrayList();
        h1(map, v0(map2), arrayList, true);
        return arrayList;
    }

    public final <K> List<String> I0(Map<K, String> map, Map<K, Object[]> map2) {
        ArrayList arrayList = new ArrayList();
        h1(map, v0(map2), arrayList, false);
        return arrayList;
    }

    public final void J(Object obj) {
        Object[] p11;
        if (this.f78058a == null) {
            m0("Cannot process record '" + (obj instanceof Object[] ? Arrays.toString((Object[]) obj) : String.valueOf(obj)) + "' without a writer processor. Please define a writer processor instance in the settings or use the 'writeRow' methods.");
        }
        try {
            if (this.f78080w) {
                NormalizedString[] c11 = ((n90.b0) this.f78058a).c(obj);
                this.f78078u = c11;
                if (c11 == null) {
                    this.f78078u = this.f78067j;
                }
                p11 = this.f78058a.p(obj, this.f78078u, this.f78065h);
            } else {
                p11 = this.f78058a.p(obj, z(), this.f78065h);
            }
            if (p11 != null) {
                W0(p11);
            }
        } catch (DataProcessingException e11) {
            e11.setErrorContentLength(this.E);
            throw e11;
        }
    }

    public final <T extends p90.c> void J0(T t11) {
        String[] a11;
        if (t11 == null) {
            if (this.f78060c) {
                return;
            }
            y0();
        } else {
            if (this.f78068k == 0 && this.f78063f && this.f78067j == null && (a11 = t11.getMetaData().a()) != null) {
                this.f78067j = NormalizedString.toArray(a11);
            }
            W0(t11.getValues());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(Map<?, ?> map) {
        L(null, map);
    }

    public final <T extends p90.c> String K0(T t11) {
        return b1(t11 == null ? null : t11.getValues());
    }

    public final <K> void L(Map<K, String> map, Map<K, ?> map2) {
        C1(map, map2);
        h0();
    }

    public final void L0(Collection<? extends p90.c> collection) {
        Iterator<? extends p90.c> it = collection.iterator();
        while (it.hasNext()) {
            J0(it.next());
        }
    }

    public final <T extends p90.c> void M(T t11) {
        J(t11 == null ? null : t11.getValues());
    }

    public final <K> void M0(Map<K, String> map, Map<K, ? extends p90.c> map2) {
        h1(map, w0(map2), null, false);
    }

    public final void N(Object... objArr) {
        J(objArr);
    }

    public final void N0(Collection<? extends p90.c> collection) {
        try {
            L0(collection);
        } finally {
            m();
        }
    }

    public final String O(Object obj) {
        n90.a0 a0Var = this.f78058a;
        if (a0Var == null) {
            throw m0("Cannot process record '" + obj + "' without a writer processor. Please define a writer processor instance in the settings or use the 'writeRow' methods.");
        }
        try {
            Object[] p11 = a0Var.p(obj, z(), this.f78065h);
            if (p11 != null) {
                return b1(p11);
            }
            return null;
        } catch (Throwable th2) {
            throw o0("Could not process record '" + obj + "'", th2);
        }
    }

    public final <K> void O0(Map<K, ? extends p90.c> map) {
        P0(null, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String P(Map<?, ?> map) {
        return Q(null, map);
    }

    public final <K> void P0(Map<K, String> map, Map<K, ? extends p90.c> map2) {
        try {
            M0(map, map2);
        } finally {
            m();
        }
    }

    public final <K> String Q(Map<K, String> map, Map<K, ?> map2) {
        C1(map, map2);
        return i0();
    }

    public final List<String> Q0(Collection<? extends p90.c> collection) {
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<? extends p90.c> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(K0(it.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            throw o0("Error writing input rows", th2);
        }
    }

    public final <T extends p90.c> String R(T t11) {
        return O(t11 == null ? null : t11.getValues());
    }

    public final <K> List<String> R0(Map<K, String> map, Map<K, ? extends p90.c> map2) {
        ArrayList arrayList = new ArrayList();
        h1(map, w0(map2), arrayList, false);
        return arrayList;
    }

    public final String S(Object... objArr) {
        return O(objArr);
    }

    public final void S0(String str) {
        try {
            this.f78059b.write(str);
            if (this.f78081x) {
                this.f78059b.write(this.f78066i);
            }
        } catch (Throwable th2) {
            throw n0("Error writing row.", str, th2);
        }
    }

    public final void T(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            J(it.next());
        }
    }

    public final void T0(Collection<?> collection) {
        if (collection == null) {
            return;
        }
        W0(collection.toArray());
    }

    public final <K, I extends Iterable<?>> void U(Map<K, I> map) {
        h1(null, map, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U0(Map<?, ?> map) {
        V0(null, map);
    }

    public final <K, I extends Iterable<?>> void V(Map<K, String> map, Map<K, I> map2) {
        h1(map, map2, null, true);
    }

    public final <K> void V0(Map<K, String> map, Map<K, ?> map2) {
        C1(map, map2);
        D1();
    }

    public final void W(Object[] objArr) {
        for (Object obj : objArr) {
            J(obj);
        }
    }

    public final void W0(Object... objArr) {
        try {
            if (this.f78068k == 0 && this.f78063f && this.f78067j != null) {
                z0();
            }
            if (objArr != null && (objArr.length != 0 || this.f78079v)) {
                l0(h(objArr));
                C();
                return;
            }
            if (this.f78060c) {
                return;
            }
            y0();
        } catch (Throwable th2) {
            throw p0("Error writing row.", objArr, th2);
        }
    }

    public final <T extends p90.c> void X(T[] tArr) {
        for (T t11 : tArr) {
            M(t11);
        }
    }

    public final void X0(String[] strArr) {
        W0(strArr);
    }

    public final void Y(Iterable<?> iterable) {
        try {
            T(iterable);
        } finally {
            m();
        }
    }

    public final String Y0(Collection<?> collection) {
        if (collection == null) {
            return null;
        }
        try {
            return b1(collection.toArray());
        } catch (Throwable th2) {
            throw o0("Error writing input row ", th2);
        }
    }

    public final <K, I extends Iterable<?>> void Z(Map<K, I> map) {
        a0(null, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String Z0(Map<?, ?> map) {
        return a1(null, map);
    }

    public final void a(Collection<String> collection) {
        if (collection != null) {
            try {
                for (String str : collection) {
                    Object[] objArr = this.f78072o;
                    int i11 = this.f78073p;
                    this.f78073p = i11 + 1;
                    objArr[i11] = str;
                }
            } catch (Throwable th2) {
                throw p0("Error adding values to in-memory row", collection.toArray(), th2);
            }
        }
    }

    public final <K, I extends Iterable<?>> void a0(Map<K, String> map, Map<K, I> map2) {
        try {
            V(map, map2);
        } finally {
            m();
        }
    }

    public final <K> String a1(Map<K, String> map, Map<K, ?> map2) {
        C1(map, map2);
        return E1();
    }

    public final void b(int i11, Object obj) {
        Object[] objArr = this.f78072o;
        if (i11 < objArr.length) {
            objArr[i11] = obj;
            if (this.f78073p <= i11) {
                this.f78073p = i11 + 1;
                return;
            }
            return;
        }
        throw p0("Cannot write '" + obj + "' to index '" + i11 + "'. Maximum number of columns (" + this.f78072o.length + ") exceeded.", new Object[]{obj}, null);
    }

    public final void b0(Object[] objArr) {
        try {
            W(objArr);
        } finally {
            m();
        }
    }

    public final String b1(Object... objArr) {
        if (objArr != null) {
            try {
                if (objArr.length == 0 && !this.f78079v) {
                }
                l0(h(objArr));
                return D();
            } catch (Throwable th2) {
                throw p0("Error writing row.", objArr, th2);
            }
        }
        if (this.f78060c) {
            return null;
        }
        l0(h(objArr));
        return D();
    }

    public final void c(Object obj) {
        try {
            Object[] objArr = this.f78072o;
            int i11 = this.f78073p;
            this.f78073p = i11 + 1;
            objArr[i11] = obj;
        } catch (Throwable th2) {
            throw p0("Error adding value to in-memory row", new Object[]{obj}, th2);
        }
    }

    public final List<String> c0(Iterable<?> iterable) {
        try {
            ArrayList arrayList = new ArrayList(1000);
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(O(it.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            throw o0("Unable process input records", th2);
        }
    }

    public final String c1(String[] strArr) {
        return b1(strArr);
    }

    public final void d(String str, Object obj) {
        b(x(this.f78067j, NormalizedString.valueOf(str), false), obj);
    }

    public final <K, I extends Iterable<?>> List<String> d0(Map<K, I> map) {
        return e0(null, map);
    }

    public final <C extends Collection<?>> void d1(Iterable<C> iterable) {
        Iterator<C> it = iterable.iterator();
        while (it.hasNext()) {
            T0(it.next());
        }
    }

    public final void e(NormalizedString[] normalizedStringArr, NormalizedString normalizedString, boolean z11, Object obj) {
        int x11 = x(normalizedStringArr, normalizedString, z11);
        if (x11 != -1) {
            b(x11, obj);
        }
    }

    public final <K, I extends Iterable<?>> List<String> e0(Map<K, String> map, Map<K, I> map2) {
        ArrayList arrayList = new ArrayList();
        h1(map, map2, arrayList, true);
        return arrayList;
    }

    public final void e1(Collection<Object[]> collection) {
        Iterator<Object[]> it = collection.iterator();
        while (it.hasNext()) {
            W0(it.next());
        }
    }

    public final void f(Collection<?> collection) {
        if (collection != null) {
            try {
                for (Object obj : collection) {
                    Object[] objArr = this.f78072o;
                    int i11 = this.f78073p;
                    this.f78073p = i11 + 1;
                    objArr[i11] = obj;
                }
            } catch (Throwable th2) {
                throw p0("Error adding values to in-memory row", collection.toArray(), th2);
            }
        }
    }

    public final List<String> f0(Object[] objArr) {
        try {
            ArrayList arrayList = new ArrayList(1000);
            for (Object obj : objArr) {
                arrayList.add(O(obj));
            }
            return arrayList;
        } catch (Throwable th2) {
            throw p0("Unable process input records", objArr, th2);
        }
    }

    public final <K, I extends Iterable<?>> void f1(Map<K, I> map) {
        h1(null, map, null, false);
    }

    public final void g(Object... objArr) {
        try {
            System.arraycopy(objArr, 0, this.f78072o, this.f78073p, objArr.length);
            this.f78073p += objArr.length;
        } catch (Throwable th2) {
            throw p0("Error adding values to in-memory row", objArr, th2);
        }
    }

    public abstract void g0(Object[] objArr);

    public final <K, I extends Iterable<?>> void g1(Map<K, String> map, Map<K, I> map2) {
        h1(map, map2, null, false);
    }

    public final Object[] h(Object[] objArr) {
        if (this.f78064g != null) {
            s(objArr);
            return this.f78064g;
        }
        if (!this.f78079v) {
            return objArr;
        }
        if (!this.f78080w) {
            NormalizedString[] normalizedStringArr = this.f78067j;
            return r(objArr, normalizedStringArr != null ? normalizedStringArr.length : -1, null);
        }
        NormalizedString[] normalizedStringArr2 = this.f78078u;
        int length = normalizedStringArr2 != null ? normalizedStringArr2.length : -1;
        NormalizedString[] normalizedStringArr3 = this.f78067j;
        Object[] r11 = r(objArr, length, normalizedStringArr3 == null ? null : Integer.valueOf(normalizedStringArr3.length));
        this.f78078u = null;
        return r11;
    }

    public final void h0() {
        t();
        N(Arrays.copyOf(this.f78072o, this.f78073p));
        p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:2:0x0000, B:4:0x0018, B:7:0x001e, B:8:0x0025, B:9:0x0028, B:11:0x0030, B:13:0x0034, B:15:0x0038, B:16:0x003f, B:17:0x0049, B:19:0x0050, B:23:0x0068, B:24:0x005e, B:29:0x007e, B:31:0x0082, B:35:0x008c, B:37:0x008f, B:39:0x009e, B:40:0x0095, B:48:0x00a7, B:55:0x00ab, B:58:0x00b1, B:60:0x00b9), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:2:0x0000, B:4:0x0018, B:7:0x001e, B:8:0x0025, B:9:0x0028, B:11:0x0030, B:13:0x0034, B:15:0x0038, B:16:0x003f, B:17:0x0049, B:19:0x0050, B:23:0x0068, B:24:0x005e, B:29:0x007e, B:31:0x0082, B:35:0x008c, B:37:0x008f, B:39:0x009e, B:40:0x0095, B:48:0x00a7, B:55:0x00ab, B:58:0x00b1, B:60:0x00b9), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <K, I extends java.lang.Iterable<?>> void h1(java.util.Map<K, java.lang.String> r11, java.util.Map<K, I> r12, java.util.List<java.lang.String> r13, boolean r14) {
        /*
            r10 = this;
            int r0 = r12.size()     // Catch: java.lang.Throwable -> L22
            java.util.Iterator[] r0 = new java.util.Iterator[r0]     // Catch: java.lang.Throwable -> L22
            int r1 = r12.size()     // Catch: java.lang.Throwable -> L22
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L22
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L22
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L22
            r3 = 1
            if (r13 == 0) goto L28
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString[] r4 = r10.f78067j     // Catch: java.lang.Throwable -> L22
            if (r4 != 0) goto L28
            if (r11 == 0) goto L25
            r10.j0(r11, r3)     // Catch: java.lang.Throwable -> L22
            goto L28
        L22:
            r11 = move-exception
            goto Lc3
        L25:
            r10.j0(r12, r3)     // Catch: java.lang.Throwable -> L22
        L28:
            long r4 = r10.f78068k     // Catch: java.lang.Throwable -> L22
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L3f
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString[] r4 = r10.f78067j     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L3f
            boolean r4 = r10.f78063f     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L3f
            java.lang.String r4 = r10.C0()     // Catch: java.lang.Throwable -> L22
            r13.add(r4)     // Catch: java.lang.Throwable -> L22
        L3f:
            java.util.Set r12 = r12.entrySet()     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L22
            r4 = 0
            r5 = r4
        L49:
            boolean r6 = r12.hasNext()     // Catch: java.lang.Throwable -> L22
            r7 = 0
            if (r6 == 0) goto L7a
            java.lang.Object r6 = r12.next()     // Catch: java.lang.Throwable -> L22
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> L22
            java.lang.Object r8 = r6.getValue()     // Catch: java.lang.Throwable -> L22
            if (r8 != 0) goto L5e
            r8 = r7
            goto L68
        L5e:
            java.lang.Object r8 = r6.getValue()     // Catch: java.lang.Throwable -> L22
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L22
        L68:
            r0[r5] = r8     // Catch: java.lang.Throwable -> L22
            java.lang.Object r8 = r6.getKey()     // Catch: java.lang.Throwable -> L22
            r1[r5] = r8     // Catch: java.lang.Throwable -> L22
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> L22
            r2.put(r6, r7)     // Catch: java.lang.Throwable -> L22
            int r5 = r5 + 1
            goto L49
        L7a:
            r6 = r3
            r12 = r4
        L7c:
            if (r12 >= r5) goto La1
            r8 = r0[r12]     // Catch: java.lang.Throwable -> L22
            if (r8 == 0) goto L8b
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r9 != 0) goto L89
            goto L8b
        L89:
            r9 = r4
            goto L8c
        L8b:
            r9 = r3
        L8c:
            r6 = r6 & r9
            if (r9 == 0) goto L95
            r8 = r1[r12]     // Catch: java.lang.Throwable -> L22
            r2.put(r8, r7)     // Catch: java.lang.Throwable -> L22
            goto L9e
        L95:
            r9 = r1[r12]     // Catch: java.lang.Throwable -> L22
            java.lang.Object r8 = r8.next()     // Catch: java.lang.Throwable -> L22
            r2.put(r9, r8)     // Catch: java.lang.Throwable -> L22
        L9e:
            int r12 = r12 + 1
            goto L7c
        La1:
            if (r6 != 0) goto Lc0
            if (r13 != 0) goto Laf
            if (r14 == 0) goto Lab
            r10.L(r11, r2)     // Catch: java.lang.Throwable -> L22
            goto Lc0
        Lab:
            r10.V0(r11, r2)     // Catch: java.lang.Throwable -> L22
            goto Lc0
        Laf:
            if (r14 == 0) goto Lb9
            java.lang.String r12 = r10.Q(r11, r2)     // Catch: java.lang.Throwable -> L22
            r13.add(r12)     // Catch: java.lang.Throwable -> L22
            goto Lc0
        Lb9:
            java.lang.String r12 = r10.a1(r11, r2)     // Catch: java.lang.Throwable -> L22
            r13.add(r12)     // Catch: java.lang.Throwable -> L22
        Lc0:
            if (r6 == 0) goto L7a
            return
        Lc3:
            java.lang.String r12 = "Error processing input rows from map"
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextWritingException r11 = r10.o0(r12, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.junit.jupiter.params.shadow.com.univocity.parsers.common.c.h1(java.util.Map, java.util.Map, java.util.List, boolean):void");
    }

    public final boolean i(int i11) {
        if (!this.f78076s) {
            return true;
        }
        boolean[] zArr = this.f78077t;
        return i11 >= zArr.length || zArr[i11];
    }

    public final String i0() {
        t();
        String S = S(Arrays.copyOf(this.f78072o, this.f78073p));
        p();
        return S;
    }

    public final void i1(Object[][] objArr) {
        for (Object[] objArr2 : objArr) {
            W0(objArr2);
        }
    }

    public final void j(char c11) {
        this.f78062e.append(c11);
    }

    public final void j0(Map<?, ?> map, boolean z11) {
        this.f78067j = new NormalizedString[map.size()];
        Iterator<?> it = (z11 ? map.keySet() : map.values()).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            this.f78067j[i11] = NormalizedString.valueOf(it.next());
            i11++;
        }
    }

    public final <C extends Collection<?>> void j1(Iterable<C> iterable) {
        try {
            d1(iterable);
        } finally {
            m();
        }
    }

    public final void k(char[] cArr) {
        this.f78062e.x(cArr);
    }

    public final void k1(Collection<Object[]> collection) {
        try {
            e1(collection);
        } finally {
            m();
        }
    }

    public final void l() {
        this.f78062e.h(this.f78071n);
    }

    public final void l0(Object[] objArr) {
        if (this.f78075r < objArr.length) {
            this.f78075r = objArr.length;
        }
        if (this.f78076s) {
            this.f78077t = new boolean[this.f78067j.length];
            int i11 = 0;
            while (true) {
                if (i11 >= this.f78067j.length) {
                    break;
                }
                this.f78077t[i11] = !r1[i11].isLiteral();
                i11++;
            }
        }
        g0(objArr);
    }

    public final <K, I extends Iterable<?>> void l1(Map<K, I> map) {
        m1(null, map);
    }

    public final void m() {
        try {
            this.f78074q = null;
            Writer writer = this.f78059b;
            if (writer != null) {
                writer.close();
                this.f78059b = null;
            }
            if (this.f78073p != 0) {
                throw new TextWritingException("Not all values associated with the last record have been written to the output. \n\tHint: use 'writeValuesToRow()' or 'writeValuesToString()' to flush the partially written values to a row.", this.f78068k, w(Arrays.copyOf(this.f78072o, this.f78073p)));
            }
        } catch (Throwable th2) {
            throw new IllegalStateException("Error closing the output.", th2);
        }
    }

    public final TextWritingException m0(String str) {
        return p0(str, null, null);
    }

    public final <K, I extends Iterable<?>> void m1(Map<K, String> map, Map<K, I> map2) {
        try {
            g1(map, map2);
        } finally {
            m();
        }
    }

    public final void n(String str) {
        S0(this.f78061d + str);
    }

    public final TextWritingException n0(String str, String str2, Throwable th2) {
        try {
            if ((th2 instanceof NullPointerException) && this.f78059b == null) {
                str = str + " No writer provided in the constructor of " + getClass().getName() + ". You can only use operations that write to Strings.";
            }
            throw new TextWritingException(str, this.f78068k, v(str2), th2);
        } catch (Throwable th3) {
            m();
            throw th3;
        }
    }

    public final void n1(Object[][] objArr) {
        try {
            i1(objArr);
        } finally {
            m();
        }
    }

    public final String o(String str) {
        return b1(this.f78061d + str);
    }

    public final TextWritingException o0(String str, Throwable th2) {
        return p0(str, null, th2);
    }

    public final <C extends Collection<?>> List<String> o1(Iterable<C> iterable) {
        try {
            ArrayList arrayList = new ArrayList(1000);
            Iterator<C> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(Y0(it.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            throw o0("Error writing input rows", th2);
        }
    }

    public final void p() {
        Arrays.fill(this.f78072o, 0, this.f78073p, (Object) null);
        this.f78073p = 0;
    }

    public final TextWritingException p0(String str, Object[] objArr, Throwable th2) {
        try {
            throw new TextWritingException(str, this.f78068k, w(objArr), th2);
        } finally {
        }
    }

    public final List<String> p1(Collection<Object[]> collection) {
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<Object[]> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(b1(it.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            throw o0("Error writing input rows", th2);
        }
    }

    public void q(boolean z11) {
        this.f78081x = z11;
    }

    public void q0(Integer... numArr) {
        this.D.j(numArr);
        u0(this.D);
    }

    public final <K, I extends Iterable<?>> List<String> q1(Map<K, I> map) {
        return r1(null, map);
    }

    public Object[] r(Object[] objArr, int i11, Integer num) {
        if (objArr.length < i11) {
            return Arrays.copyOf(objArr, i11);
        }
        if (num != null && objArr.length < num.intValue()) {
            return Arrays.copyOf(objArr, num.intValue());
        }
        if (i11 != -1 || num != null) {
            return objArr;
        }
        int length = objArr.length;
        int i12 = this.f78075r;
        return length < i12 ? Arrays.copyOf(objArr, i12) : objArr;
    }

    public void r0(String... strArr) {
        if (this.f78067j == null) {
            throw new IllegalStateException("Cannot de-select fields by name. Headers not defined.");
        }
        this.D.i(strArr);
        u0(this.D);
    }

    public final <K, I extends Iterable<?>> List<String> r1(Map<K, String> map, Map<K, I> map2) {
        ArrayList arrayList = new ArrayList();
        h1(map, map2, arrayList, false);
        return arrayList;
    }

    public final <T> void s(T[] tArr) {
        if (!this.A) {
            int length = tArr.length;
            Object[] objArr = this.f78064g;
            if (length > objArr.length) {
                this.f78064g = Arrays.copyOf(objArr, tArr.length);
            }
        }
        int i11 = 0;
        if (this.f78065h.length >= tArr.length) {
            while (i11 < tArr.length) {
                int[] iArr = this.f78065h;
                if (i11 >= iArr.length) {
                    return;
                }
                int i12 = iArr[i11];
                if (i12 != -1) {
                    this.f78064g[i12] = tArr[i11];
                }
                i11++;
            }
            return;
        }
        if (this.A) {
            while (true) {
                int[] iArr2 = this.f78065h;
                if (i11 >= iArr2.length) {
                    return;
                }
                this.f78064g[i11] = tArr[iArr2[i11]];
                i11++;
            }
        } else {
            while (true) {
                int[] iArr3 = this.f78065h;
                if (i11 >= iArr3.length) {
                    return;
                }
                Object[] objArr2 = this.f78064g;
                int i13 = iArr3[i11];
                objArr2[i13] = tArr[i13];
                i11++;
            }
        }
    }

    public void s0(Integer... numArr) {
        this.D.K(numArr);
        u0(this.D);
    }

    public final List<String> s1(Object[][] objArr) {
        try {
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object[] objArr2 : objArr) {
                String b12 = b1(objArr2);
                if (b12 != null) {
                    arrayList.add(b12);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            throw o0("Error writing input rows", th2);
        }
    }

    public final void t() {
        NormalizedString[] normalizedStringArr = this.f78067j;
        if (normalizedStringArr == null || this.f78073p >= normalizedStringArr.length) {
            return;
        }
        while (true) {
            int i11 = this.f78073p;
            if (i11 >= this.f78067j.length) {
                return;
            }
            Object[] objArr = this.f78072o;
            this.f78073p = i11 + 1;
            objArr[i11] = null;
        }
    }

    public void t0(String... strArr) {
        if (this.f78067j == null) {
            throw new IllegalStateException("Cannot select fields by name. Headers not defined.");
        }
        this.D.J(strArr);
        u0(this.D);
    }

    public final <C extends Collection<?>> void t1(Iterable<C> iterable) {
        Iterator<C> it = iterable.iterator();
        while (it.hasNext()) {
            W0(it.next().toArray());
        }
    }

    public final void u() {
        try {
            this.f78059b.flush();
        } catch (Throwable th2) {
            throw n0("Error flushing output.", this.f78062e.A(), th2);
        }
    }

    public final void u0(g<?> gVar) {
        j90.m m11 = gVar.m();
        if (m11 == null) {
            this.f78064g = null;
            this.f78065h = null;
            return;
        }
        NormalizedString[] normalizedStringArr = this.f78067j;
        if (normalizedStringArr != null && normalizedStringArr.length > 0) {
            int[] V = m11.V(normalizedStringArr);
            this.f78065h = V;
            if (this.A) {
                this.f78064g = new Object[d.x(V, -1).length];
                return;
            } else {
                this.f78064g = new Object[this.f78067j.length];
                return;
            }
        }
        if ((m11 instanceof j90.l) || (m11 instanceof j90.h)) {
            throw new IllegalStateException("Cannot select fields by name with no headers defined");
        }
        int i11 = this.f78075r;
        if (m11 instanceof j90.k) {
            boolean z11 = false;
            for (Integer num : ((j90.k) m11).e()) {
                if (i11 <= num.intValue()) {
                    i11 = num.intValue();
                    z11 = true;
                }
            }
            if (z11) {
                i11++;
            }
            int i12 = this.f78075r;
            if (i11 < i12) {
                i11 = i12;
            }
        } else {
            i11 = gVar.u();
        }
        int[] V2 = m11.V(new NormalizedString[i11]);
        this.f78065h = V2;
        if (this.A) {
            this.f78064g = new Object[d.x(V2, -1).length];
        } else {
            this.f78064g = new Object[i11];
        }
    }

    public final void u1(Collection<String[]> collection) {
        Iterator<String[]> it = collection.iterator();
        while (it.hasNext()) {
            X0(it.next());
        }
    }

    public final String v(CharSequence charSequence) {
        return org.junit.jupiter.params.shadow.com.univocity.parsers.common.a.restrictContent(this.E, charSequence);
    }

    public final <K> Map<K, Iterable<Object>> v0(Map<K, Object[]> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry<K, Object[]> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                linkedHashMap.put(entry.getKey(), Collections.EMPTY_LIST);
            } else {
                linkedHashMap.put(entry.getKey(), Arrays.asList(entry.getValue()));
            }
        }
        return linkedHashMap;
    }

    public final <K> void v1(Map<K, String> map, Map<K, String[]> map2) {
        h1(map, x0(map2), null, false);
    }

    public final Object[] w(Object[] objArr) {
        return org.junit.jupiter.params.shadow.com.univocity.parsers.common.a.restrictContent(this.E, objArr);
    }

    public final <K> Map<K, Iterable<String>> w0(Map<K, ? extends p90.c> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry<K, ? extends p90.c> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                linkedHashMap.put(entry.getKey(), Collections.EMPTY_LIST);
            } else {
                linkedHashMap.put(entry.getKey(), Arrays.asList(entry.getValue().getValues()));
            }
        }
        return linkedHashMap;
    }

    public final void w1(Collection<String[]> collection) {
        try {
            u1(collection);
        } finally {
            m();
        }
    }

    public final int x(NormalizedString[] normalizedStringArr, NormalizedString normalizedString, boolean z11) {
        if (this.f78074q == null) {
            this.f78074q = new HashMap();
        }
        Map<NormalizedString, Integer> map = this.f78074q.get(normalizedStringArr);
        if (map == null) {
            map = new HashMap<>();
            this.f78074q.put(normalizedStringArr, map);
        }
        Integer num = map.get(normalizedString);
        if (num == null) {
            if (normalizedStringArr == null) {
                throw o0("Cannot calculate position of header '" + ((Object) normalizedString) + "' as no headers were defined.", null);
            }
            int f11 = d.f(NormalizedString.toArray(normalizedStringArr), NormalizedString.valueOf(normalizedString));
            Integer valueOf = Integer.valueOf(f11);
            if (f11 == -1 && !z11) {
                throw o0("Header '" + ((Object) normalizedString) + "' could not be found. Defined headers are: " + Arrays.toString(normalizedStringArr) + '.', null);
            }
            map.put(normalizedString, valueOf);
            num = valueOf;
        }
        return num.intValue();
    }

    public final <K> Map<K, Iterable<String>> x0(Map<K, String[]> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry<K, String[]> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                linkedHashMap.put(entry.getKey(), Collections.EMPTY_LIST);
            } else {
                linkedHashMap.put(entry.getKey(), Arrays.asList(entry.getValue()));
            }
        }
        return linkedHashMap;
    }

    public final <K> void x1(Map<K, String[]> map) {
        y1(null, map);
    }

    public final long y() {
        return this.f78068k;
    }

    public final void y0() {
        try {
            if (this.f78081x) {
                this.f78059b.write(this.f78066i);
            }
        } catch (Throwable th2) {
            throw n0("Error writing empty row.", Arrays.toString(this.f78066i), th2);
        }
    }

    public final <K> void y1(Map<K, String> map, Map<K, String[]> map2) {
        try {
            v1(map, map2);
        } finally {
            m();
        }
    }

    public final NormalizedString[] z() {
        NormalizedString[] normalizedStringArr = this.f78067j;
        if (normalizedStringArr == null && this.f78065h == null) {
            return null;
        }
        return normalizedStringArr;
    }

    public final void z0() {
        B0(NormalizedString.toArray(this.f78067j));
    }

    public final <C extends Collection<?>> List<String> z1(Iterable<C> iterable) {
        try {
            ArrayList arrayList = new ArrayList(1000);
            Iterator<C> it = iterable.iterator();
            while (it.hasNext()) {
                String Y0 = Y0(it.next());
                if (Y0 != null) {
                    arrayList.add(Y0);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            throw o0("Error writing input rows", th2);
        }
    }

    public c(File file, S s11) {
        this(d.p(file), s11);
    }

    public c(File file, String str, S s11) {
        this(d.q(file, str), s11);
    }

    public c(File file, Charset charset, S s11) {
        this(d.r(file, charset), s11);
    }

    public c(OutputStream outputStream, S s11) {
        this(d.s(outputStream), s11);
    }

    public c(OutputStream outputStream, String str, S s11) {
        this(d.t(outputStream, str), s11);
    }

    public c(OutputStream outputStream, Charset charset, S s11) {
        this(d.u(outputStream, charset), s11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Writer writer, S s11) {
        this.f78068k = 0L;
        this.f78073p = 0;
        this.f78075r = -1;
        this.f78076s = false;
        this.f78081x = true;
        a aVar = new a();
        this.D = aVar;
        s11.b();
        this.B = s11.q();
        this.C = s11.s();
        aVar.Y(s11.u());
        this.E = s11.l();
        this.f78069l = s11.v();
        this.f78070m = s11.l0();
        this.f78066i = s11.o().e();
        this.f78061d = s11.o().b();
        this.f78060c = s11.z();
        n90.a0<?> n02 = s11.n0();
        this.f78058a = n02;
        this.f78080w = n02 instanceof n90.b0;
        this.f78079v = s11.m0();
        this.A = s11.o0();
        int A = s11.A();
        this.f78083z = A;
        this.f78071n = new k90.k(s11.t(), "", A, s11.o());
        this.f78062e = new k90.k(s11.t(), "", A, s11.o());
        this.f78059b = writer;
        this.f78067j = NormalizedString.toIdentifierGroupArray(s11.p());
        u0(s11);
        this.f78072o = new Object[s11.u()];
        this.f78063f = s11.p0();
        if (n02 instanceof n) {
            n nVar = (n) n02;
            nVar.f78180h = null;
            nVar.f78179g = s11.w();
        }
        B(s11);
    }
}
