package com.google.gson;

import com.bumptech.glide.load.engine.GlideException;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d {
    public static final boolean A = false;
    public static final boolean B = false;
    public static final boolean C = true;
    public static final boolean D = false;
    public static final boolean E = false;
    public static final boolean F = false;
    public static final boolean G = true;
    public static final String H = null;
    public static final com.google.gson.c I = FieldNamingPolicy.IDENTITY;
    public static final r J = ToNumberPolicy.DOUBLE;
    public static final r K = ToNumberPolicy.LAZILY_PARSED_NUMBER;
    public static final bp.a<?> L = bp.a.get(Object.class);
    public static final String M = ")]}'\n";

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f34921z = false;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Map<bp.a<?>, f<?>>> f34922a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<bp.a<?>, s<?>> f34923b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.gson.internal.c f34924c;

    /* renamed from: d, reason: collision with root package name */
    public final xo.e f34925d;

    /* renamed from: e, reason: collision with root package name */
    public final List<t> f34926e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.gson.internal.d f34927f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.gson.c f34928g;

    /* renamed from: h, reason: collision with root package name */
    public final Map<Type, com.google.gson.f<?>> f34929h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f34930i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f34931j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f34932k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f34933l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f34934m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f34935n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f34936o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f34937p;

    /* renamed from: q, reason: collision with root package name */
    public final String f34938q;

    /* renamed from: r, reason: collision with root package name */
    public final int f34939r;

    /* renamed from: s, reason: collision with root package name */
    public final int f34940s;

    /* renamed from: t, reason: collision with root package name */
    public final LongSerializationPolicy f34941t;

    /* renamed from: u, reason: collision with root package name */
    public final List<t> f34942u;

    /* renamed from: v, reason: collision with root package name */
    public final List<t> f34943v;

    /* renamed from: w, reason: collision with root package name */
    public final r f34944w;

    /* renamed from: x, reason: collision with root package name */
    public final r f34945x;

    /* renamed from: y, reason: collision with root package name */
    public final List<ReflectionAccessFilter> f34946y;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends s<Number> {
        public a() {
        }

        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Double e(cp.a aVar) throws IOException {
            if (aVar.k0() != JsonToken.NULL) {
                return Double.valueOf(aVar.U());
            }
            aVar.d0();
            return null;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.L();
            } else {
                d.d(number.doubleValue());
                cVar.s0(number);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends s<Number> {
        public b() {
        }

        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Float e(cp.a aVar) throws IOException {
            if (aVar.k0() != JsonToken.NULL) {
                return Float.valueOf((float) aVar.U());
            }
            aVar.d0();
            return null;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.L();
            } else {
                d.d(number.floatValue());
                cVar.s0(number);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends s<Number> {
        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(cp.a aVar) throws IOException {
            if (aVar.k0() != JsonToken.NULL) {
                return Long.valueOf(aVar.Z());
            }
            aVar.d0();
            return null;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.L();
            } else {
                cVar.v0(number.toString());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.gson.d$d, reason: collision with other inner class name */
    public class C0432d extends s<AtomicLong> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f34949a;

        public C0432d(s sVar) {
            this.f34949a = sVar;
        }

        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicLong e(cp.a aVar) throws IOException {
            return new AtomicLong(((Number) this.f34949a.e(aVar)).longValue());
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, AtomicLong atomicLong) throws IOException {
            this.f34949a.i(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends s<AtomicLongArray> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f34950a;

        public e(s sVar) {
            this.f34950a = sVar;
        }

        @Override // com.google.gson.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray e(cp.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.E()) {
                arrayList.add(Long.valueOf(((Number) this.f34950a.e(aVar)).longValue()));
            }
            aVar.k();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i11 = 0; i11 < size; i11++) {
                atomicLongArray.set(i11, ((Long) arrayList.get(i11)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.e();
            int length = atomicLongArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                this.f34950a.i(cVar, Long.valueOf(atomicLongArray.get(i11)));
            }
            cVar.j();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f<T> extends s<T> {

        /* renamed from: a, reason: collision with root package name */
        public s<T> f34951a;

        @Override // com.google.gson.s
        public T e(cp.a aVar) throws IOException {
            s<T> sVar = this.f34951a;
            if (sVar != null) {
                return sVar.e(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.s
        public void i(cp.c cVar, T t11) throws IOException {
            s<T> sVar = this.f34951a;
            if (sVar == null) {
                throw new IllegalStateException();
            }
            sVar.i(cVar, t11);
        }

        public void j(s<T> sVar) {
            if (this.f34951a != null) {
                throw new AssertionError();
            }
            this.f34951a = sVar;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d() {
        /*
            r22 = this;
            com.google.gson.internal.d r1 = com.google.gson.internal.d.f35021h
            com.google.gson.c r2 = com.google.gson.d.I
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            com.google.gson.LongSerializationPolicy r12 = com.google.gson.LongSerializationPolicy.DEFAULT
            java.lang.String r13 = com.google.gson.d.H
            java.util.List r16 = java.util.Collections.EMPTY_LIST
            com.google.gson.r r19 = com.google.gson.d.J
            com.google.gson.r r20 = com.google.gson.d.K
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            r14 = 2
            r15 = 2
            r17 = r16
            r18 = r16
            r21 = r16
            r0 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.d.<init>():void");
    }

    public static void a(Object obj, cp.a aVar) {
        if (obj != null) {
            try {
                if (aVar.k0() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e11) {
                throw new JsonSyntaxException(e11);
            } catch (IOException e12) {
                throw new JsonIOException(e12);
            }
        }
    }

    public static s<AtomicLong> b(s<Number> sVar) {
        return new C0432d(sVar).d();
    }

    public static s<AtomicLongArray> c(s<Number> sVar) {
        return new e(sVar).d();
    }

    public static void d(double d11) {
        if (Double.isNaN(d11) || Double.isInfinite(d11)) {
            throw new IllegalArgumentException(d11 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static s<Number> t(LongSerializationPolicy longSerializationPolicy) {
        return longSerializationPolicy == LongSerializationPolicy.DEFAULT ? xo.n.f98242t : new c();
    }

    public String A(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        F(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void B(j jVar, cp.c cVar) throws JsonIOException {
        boolean w11 = cVar.w();
        cVar.d0(true);
        boolean r11 = cVar.r();
        cVar.a0(this.f34933l);
        boolean q11 = cVar.q();
        cVar.f0(this.f34930i);
        try {
            try {
                com.google.gson.internal.l.b(jVar, cVar);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            } catch (AssertionError e12) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e12.getMessage());
                assertionError.initCause(e12);
                throw assertionError;
            }
        } finally {
            cVar.d0(w11);
            cVar.a0(r11);
            cVar.f0(q11);
        }
    }

    public void C(j jVar, Appendable appendable) throws JsonIOException {
        try {
            B(jVar, w(com.google.gson.internal.l.c(appendable)));
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public void D(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            F(obj, obj.getClass(), appendable);
        } else {
            C(k.f35047a, appendable);
        }
    }

    public void E(Object obj, Type type, cp.c cVar) throws JsonIOException {
        s p11 = p(bp.a.get(type));
        boolean w11 = cVar.w();
        cVar.d0(true);
        boolean r11 = cVar.r();
        cVar.a0(this.f34933l);
        boolean q11 = cVar.q();
        cVar.f0(this.f34930i);
        try {
            try {
                p11.i(cVar, obj);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            } catch (AssertionError e12) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e12.getMessage());
                assertionError.initCause(e12);
                throw assertionError;
            }
        } finally {
            cVar.d0(w11);
            cVar.a0(r11);
            cVar.f0(q11);
        }
    }

    public void F(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            E(obj, type, w(com.google.gson.internal.l.c(appendable)));
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public j G(Object obj) {
        return obj == null ? k.f35047a : H(obj, obj.getClass());
    }

    public j H(Object obj, Type type) {
        xo.g gVar = new xo.g();
        E(obj, type, gVar);
        return gVar.y0();
    }

    public final s<Number> e(boolean z11) {
        return z11 ? xo.n.f98244v : new a();
    }

    @Deprecated
    public com.google.gson.internal.d f() {
        return this.f34927f;
    }

    public com.google.gson.c g() {
        return this.f34928g;
    }

    public final s<Number> h(boolean z11) {
        return z11 ? xo.n.f98243u : new b();
    }

    public <T> T i(j jVar, Class<T> cls) throws JsonSyntaxException {
        return (T) com.google.gson.internal.j.d(cls).cast(j(jVar, cls));
    }

    public <T> T j(j jVar, Type type) throws JsonSyntaxException {
        if (jVar == null) {
            return null;
        }
        return (T) k(new xo.f(jVar), type);
    }

    public <T> T k(cp.a aVar, Type type) throws JsonIOException, JsonSyntaxException {
        boolean H2 = aVar.H();
        boolean z11 = true;
        aVar.w0(true);
        try {
            try {
                try {
                    aVar.k0();
                    z11 = false;
                    return p(bp.a.get(type)).e(aVar);
                } catch (EOFException e11) {
                    if (!z11) {
                        throw new JsonSyntaxException(e11);
                    }
                    aVar.w0(H2);
                    return null;
                } catch (IllegalStateException e12) {
                    throw new JsonSyntaxException(e12);
                }
            } catch (IOException e13) {
                throw new JsonSyntaxException(e13);
            } catch (AssertionError e14) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e14.getMessage());
                assertionError.initCause(e14);
                throw assertionError;
            }
        } finally {
            aVar.w0(H2);
        }
    }

    public <T> T l(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        cp.a v11 = v(reader);
        Object k11 = k(v11, cls);
        a(k11, v11);
        return (T) com.google.gson.internal.j.d(cls).cast(k11);
    }

    public <T> T m(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        cp.a v11 = v(reader);
        T t11 = (T) k(v11, type);
        a(t11, v11);
        return t11;
    }

    public <T> T n(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) com.google.gson.internal.j.d(cls).cast(o(str, cls));
    }

    public <T> T o(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) m(new StringReader(str), type);
    }

    public <T> s<T> p(bp.a<T> aVar) {
        boolean z11;
        s<T> sVar = (s) this.f34923b.get(aVar == null ? L : aVar);
        if (sVar != null) {
            return sVar;
        }
        Map<bp.a<?>, f<?>> map = this.f34922a.get();
        if (map == null) {
            map = new HashMap<>();
            this.f34922a.set(map);
            z11 = true;
        } else {
            z11 = false;
        }
        f<?> fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(aVar, fVar2);
            Iterator<t> it = this.f34926e.iterator();
            while (it.hasNext()) {
                s<T> a11 = it.next().a(this, aVar);
                if (a11 != null) {
                    fVar2.j(a11);
                    this.f34923b.put(aVar, a11);
                    return a11;
                }
            }
            throw new IllegalArgumentException("GSON (2.9.1) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z11) {
                this.f34922a.remove();
            }
        }
    }

    public <T> s<T> q(Class<T> cls) {
        return p(bp.a.get((Class) cls));
    }

    public <T> s<T> r(t tVar, bp.a<T> aVar) {
        if (!this.f34926e.contains(tVar)) {
            tVar = this.f34925d;
        }
        boolean z11 = false;
        for (t tVar2 : this.f34926e) {
            if (z11) {
                s<T> a11 = tVar2.a(this, aVar);
                if (a11 != null) {
                    return a11;
                }
            } else if (tVar2 == tVar) {
                z11 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public boolean s() {
        return this.f34933l;
    }

    public String toString() {
        return "{serializeNulls:" + this.f34930i + ",factories:" + this.f34926e + ",instanceCreators:" + this.f34924c + com.alipay.sdk.m.u.i.f11099d;
    }

    public com.google.gson.e u() {
        return new com.google.gson.e(this);
    }

    public cp.a v(Reader reader) {
        cp.a aVar = new cp.a(reader);
        aVar.w0(this.f34935n);
        return aVar;
    }

    public cp.c w(Writer writer) throws IOException {
        if (this.f34932k) {
            writer.write(M);
        }
        cp.c cVar = new cp.c(writer);
        if (this.f34934m) {
            cVar.c0(GlideException.a.f28776d);
        }
        cVar.a0(this.f34933l);
        cVar.d0(this.f34935n);
        cVar.f0(this.f34930i);
        return cVar;
    }

    public boolean x() {
        return this.f34930i;
    }

    public String y(j jVar) {
        StringWriter stringWriter = new StringWriter();
        C(jVar, stringWriter);
        return stringWriter.toString();
    }

    public String z(Object obj) {
        return obj == null ? y(k.f35047a) : A(obj, obj.getClass());
    }

    public d(com.google.gson.internal.d dVar, com.google.gson.c cVar, Map<Type, com.google.gson.f<?>> map, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, LongSerializationPolicy longSerializationPolicy, String str, int i11, int i12, List<t> list, List<t> list2, List<t> list3, r rVar, r rVar2, List<ReflectionAccessFilter> list4) {
        this.f34922a = new ThreadLocal<>();
        this.f34923b = new ConcurrentHashMap();
        this.f34927f = dVar;
        this.f34928g = cVar;
        this.f34929h = map;
        com.google.gson.internal.c cVar2 = new com.google.gson.internal.c(map, z18, list4);
        this.f34924c = cVar2;
        this.f34930i = z11;
        this.f34931j = z12;
        this.f34932k = z13;
        this.f34933l = z14;
        this.f34934m = z15;
        this.f34935n = z16;
        this.f34936o = z17;
        this.f34937p = z18;
        this.f34941t = longSerializationPolicy;
        this.f34938q = str;
        this.f34939r = i11;
        this.f34940s = i12;
        this.f34942u = list;
        this.f34943v = list2;
        this.f34944w = rVar;
        this.f34945x = rVar2;
        this.f34946y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(xo.n.W);
        arrayList.add(xo.j.j(rVar));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(xo.n.C);
        arrayList.add(xo.n.f98235m);
        arrayList.add(xo.n.f98229g);
        arrayList.add(xo.n.f98231i);
        arrayList.add(xo.n.f98233k);
        s<Number> t11 = t(longSerializationPolicy);
        arrayList.add(xo.n.c(Long.TYPE, Long.class, t11));
        arrayList.add(xo.n.c(Double.TYPE, Double.class, e(z17)));
        arrayList.add(xo.n.c(Float.TYPE, Float.class, h(z17)));
        arrayList.add(xo.i.j(rVar2));
        arrayList.add(xo.n.f98237o);
        arrayList.add(xo.n.f98239q);
        arrayList.add(xo.n.b(AtomicLong.class, b(t11)));
        arrayList.add(xo.n.b(AtomicLongArray.class, c(t11)));
        arrayList.add(xo.n.f98241s);
        arrayList.add(xo.n.f98246x);
        arrayList.add(xo.n.E);
        arrayList.add(xo.n.G);
        arrayList.add(xo.n.b(BigDecimal.class, xo.n.f98248z));
        arrayList.add(xo.n.b(BigInteger.class, xo.n.A));
        arrayList.add(xo.n.b(LazilyParsedNumber.class, xo.n.B));
        arrayList.add(xo.n.I);
        arrayList.add(xo.n.K);
        arrayList.add(xo.n.O);
        arrayList.add(xo.n.Q);
        arrayList.add(xo.n.U);
        arrayList.add(xo.n.M);
        arrayList.add(xo.n.f98226d);
        arrayList.add(xo.c.f98161b);
        arrayList.add(xo.n.S);
        if (ap.d.f5400a) {
            arrayList.add(ap.d.f5404e);
            arrayList.add(ap.d.f5403d);
            arrayList.add(ap.d.f5405f);
        }
        arrayList.add(xo.a.f98155c);
        arrayList.add(xo.n.f98224b);
        arrayList.add(new xo.b(cVar2));
        arrayList.add(new xo.h(cVar2, z12));
        xo.e eVar = new xo.e(cVar2);
        this.f34925d = eVar;
        arrayList.add(eVar);
        arrayList.add(xo.n.X);
        arrayList.add(new xo.k(cVar2, cVar, dVar, eVar, list4));
        this.f34926e = Collections.unmodifiableList(arrayList);
    }
}
