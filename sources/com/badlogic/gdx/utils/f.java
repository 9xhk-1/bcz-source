package com.badlogic.gdx.utils;

import a3.d0;
import a3.n0;
import a3.x0;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.JsonWriter;
import com.badlogic.gdx.utils.d;
import com.badlogic.gdx.utils.e;
import com.badlogic.gdx.utils.i;
import com.badlogic.gdx.utils.j;
import com.badlogic.gdx.utils.k;
import com.badlogic.gdx.utils.l;
import com.badlogic.gdx.utils.m;
import com.badlogic.gdx.utils.reflect.ReflectionException;
import com.baicizhan.main.activity.errorfb.WordErrorFeedbackActivity;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: s, reason: collision with root package name */
    public static final boolean f13260s = false;

    /* renamed from: a, reason: collision with root package name */
    public JsonWriter f13261a;

    /* renamed from: b, reason: collision with root package name */
    public String f13262b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13263c;

    /* renamed from: d, reason: collision with root package name */
    public JsonWriter.OutputType f13264d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13265e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13266f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13267g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13268h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13269i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13270j;

    /* renamed from: k, reason: collision with root package name */
    public d f13271k;

    /* renamed from: l, reason: collision with root package name */
    public final l<Class, n<String, a>> f13272l;

    /* renamed from: m, reason: collision with root package name */
    public final l<String, Class> f13273m;

    /* renamed from: n, reason: collision with root package name */
    public final l<Class, String> f13274n;

    /* renamed from: o, reason: collision with root package name */
    public final l<Class, d> f13275o;

    /* renamed from: p, reason: collision with root package name */
    public final l<Class, Object[]> f13276p;

    /* renamed from: q, reason: collision with root package name */
    public final Object[] f13277q;

    /* renamed from: r, reason: collision with root package name */
    public final Object[] f13278r;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final g3.e f13279a;

        /* renamed from: b, reason: collision with root package name */
        public Class f13280b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f13281c;

        public a(g3.e eVar) {
            this.f13279a = eVar;
            this.f13280b = eVar.e((g3.c.y(l.class, eVar.g()) || g3.c.y(Map.class, eVar.g())) ? 1 : 0);
            this.f13281c = eVar.i(Deprecated.class);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void D(f fVar, JsonValue jsonValue);

        void z(f fVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d<T> {
        void a(f fVar, T t11, Class cls);

        T b(f fVar, JsonValue jsonValue, Class cls);
    }

    public f() {
        this.f13262b = "class";
        this.f13263c = true;
        this.f13269i = true;
        this.f13272l = new l<>();
        this.f13273m = new l<>();
        this.f13274n = new l<>();
        this.f13275o = new l<>();
        this.f13276p = new l<>();
        this.f13277q = new Object[]{null};
        this.f13278r = new Object[]{null};
        this.f13264d = JsonWriter.OutputType.minimal;
    }

    public String A(String str) {
        return B(str, 0);
    }

    public void A0(String str, Class cls, @d0 Class cls2) {
        try {
            this.f13261a.j(str);
            y0(cls, cls2);
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public String B(String str, int i11) {
        return new g().s(str).v0(this.f13264d, i11);
    }

    public void B0(Class cls) {
        if (this.f13262b == null) {
            return;
        }
        String t11 = t(cls);
        if (t11 == null) {
            t11 = cls.getName();
        }
        try {
            this.f13261a.C(this.f13262b, t11);
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public String C(String str, JsonValue.c cVar) {
        return new g().s(str).u0(cVar);
    }

    public void C0(@d0 Object obj) {
        if (obj == null) {
            E0(obj, null, null);
        } else {
            E0(obj, obj.getClass(), null);
        }
    }

    public void D(@d0 Object obj, g3.e eVar, String str, @d0 Class cls, JsonValue jsonValue) {
        JsonValue z11 = jsonValue.z(str);
        if (z11 == null) {
            return;
        }
        try {
            eVar.s(obj, K(eVar.g(), cls, z11));
        } catch (SerializationException e11) {
            e11.addTrace(eVar.f() + " (" + eVar.d().getName() + pn.j.f81007d);
            throw e11;
        } catch (ReflectionException e12) {
            throw new SerializationException("Error accessing field: " + eVar.f() + " (" + eVar.d().getName() + pn.j.f81007d, e12);
        } catch (RuntimeException e13) {
            SerializationException serializationException = new SerializationException(e13);
            serializationException.addTrace(z11.P0());
            serializationException.addTrace(eVar.f() + " (" + eVar.d().getName() + pn.j.f81007d);
            throw serializationException;
        }
    }

    public void D0(@d0 Object obj, @d0 Class cls) {
        E0(obj, cls, null);
    }

    public void E(Object obj, String str, JsonValue jsonValue) {
        H(obj, str, str, null, jsonValue);
    }

    public void E0(@d0 Object obj, @d0 Class cls, @d0 Class cls2) {
        Class cls3 = cls;
        try {
            if (obj == null) {
                this.f13261a.I(null);
                return;
            }
            if ((cls3 != null && cls3.isPrimitive()) || cls3 == String.class || cls3 == Integer.class || cls3 == Boolean.class || cls3 == Float.class || cls3 == Long.class || cls3 == Double.class || cls3 == Short.class || cls3 == Byte.class || cls3 == Character.class) {
                this.f13261a.I(obj);
                return;
            }
            Class<?> cls4 = obj.getClass();
            if (cls4.isPrimitive() || cls4 == String.class || cls4 == Integer.class || cls4 == Boolean.class || cls4 == Float.class || cls4 == Long.class || cls4 == Double.class || cls4 == Short.class || cls4 == Byte.class || cls4 == Character.class) {
                y0(cls4, null);
                F0("value", obj);
                w0();
                return;
            }
            if (obj instanceof c) {
                y0(cls4, cls3);
                ((c) obj).z(this);
                w0();
                return;
            }
            d k11 = this.f13275o.k(cls4);
            if (k11 != null) {
                k11.a(this, obj, cls3);
                return;
            }
            int i11 = 0;
            if (obj instanceof com.badlogic.gdx.utils.a) {
                if (cls3 != null && cls4 != cls3 && cls4 != com.badlogic.gdx.utils.a.class) {
                    throw new SerializationException("Serialization of an Array other than the known type is not supported.\nKnown type: " + cls3 + "\nActual type: " + cls4);
                }
                p0();
                com.badlogic.gdx.utils.a aVar = (com.badlogic.gdx.utils.a) obj;
                int i12 = aVar.f13179b;
                while (i11 < i12) {
                    E0(aVar.get(i11), cls2, null);
                    i11++;
                }
                o0();
                return;
            }
            if (obj instanceof n0) {
                if (cls3 != null && cls4 != cls3 && cls4 != n0.class) {
                    throw new SerializationException("Serialization of a Queue other than the known type is not supported.\nKnown type: " + cls3 + "\nActual type: " + cls4);
                }
                p0();
                n0 n0Var = (n0) obj;
                int i13 = n0Var.f1599d;
                while (i11 < i13) {
                    E0(n0Var.get(i11), cls2, null);
                    i11++;
                }
                o0();
                return;
            }
            if (obj instanceof Collection) {
                if (this.f13262b == null || cls4 == ArrayList.class || (cls3 != null && cls3 == cls4)) {
                    p0();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        E0(it.next(), cls2, null);
                    }
                    o0();
                    return;
                }
                y0(cls4, cls3);
                q0(WordErrorFeedbackActivity.f18460k);
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    E0(it2.next(), cls2, null);
                }
                o0();
                w0();
                return;
            }
            if (cls4.isArray()) {
                Class componentType = cls2 == null ? cls4.getComponentType() : cls2;
                int b11 = g3.b.b(obj);
                p0();
                while (i11 < b11) {
                    E0(g3.b.a(obj, i11), componentType, null);
                    i11++;
                }
                o0();
                return;
            }
            if (obj instanceof l) {
                if (cls3 == null) {
                    cls3 = l.class;
                }
                y0(cls4, cls3);
                l.a it3 = ((l) obj).g().iterator();
                while (it3.hasNext()) {
                    l.b next = it3.next();
                    this.f13261a.j(c(next.f13394a));
                    E0(next.f13395b, cls2, null);
                }
                w0();
                return;
            }
            if (obj instanceof k) {
                if (cls3 == null) {
                    cls3 = k.class;
                }
                y0(cls4, cls3);
                k.a it4 = ((k) obj).g().iterator();
                while (it4.hasNext()) {
                    k.b next2 = it4.next();
                    this.f13261a.j(c(next2.f13372a));
                    D0(Integer.valueOf(next2.f13373b), Integer.class);
                }
                w0();
                return;
            }
            if (obj instanceof j) {
                if (cls3 == null) {
                    cls3 = j.class;
                }
                y0(cls4, cls3);
                j.a it5 = ((j) obj).h().iterator();
                while (it5.hasNext()) {
                    j.b next3 = it5.next();
                    this.f13261a.j(c(next3.f13351a));
                    D0(Float.valueOf(next3.f13352b), Float.class);
                }
                w0();
                return;
            }
            if (obj instanceof m) {
                if (cls3 == null) {
                    cls3 = m.class;
                }
                y0(cls4, cls3);
                this.f13261a.j("values");
                p0();
                m.a it6 = ((m) obj).iterator();
                while (it6.hasNext()) {
                    E0(it6.next(), cls2, null);
                }
                o0();
                w0();
                return;
            }
            if (obj instanceof com.badlogic.gdx.utils.d) {
                if (cls3 == null) {
                    cls3 = com.badlogic.gdx.utils.d.class;
                }
                y0(cls4, cls3);
                Iterator it7 = ((com.badlogic.gdx.utils.d) obj).g().iterator();
                while (it7.hasNext()) {
                    d.b bVar = (d.b) it7.next();
                    this.f13261a.j(String.valueOf(bVar.f13235a));
                    E0(bVar.f13236b, cls2, null);
                }
                w0();
                return;
            }
            if (obj instanceof i) {
                if (cls3 == null) {
                    cls3 = i.class;
                }
                y0(cls4, cls3);
                Iterator it8 = ((i) obj).g().iterator();
                while (it8.hasNext()) {
                    i.b bVar2 = (i.b) it8.next();
                    this.f13261a.j(String.valueOf(bVar2.f13328a));
                    E0(bVar2.f13329b, cls2, null);
                }
                w0();
                return;
            }
            if (obj instanceof e) {
                if (cls3 == null) {
                    cls3 = e.class;
                }
                y0(cls4, cls3);
                this.f13261a.j("values");
                p0();
                e.a n11 = ((e) obj).n();
                while (n11.f13255a) {
                    E0(Integer.valueOf(n11.b()), Integer.class, null);
                }
                o0();
                w0();
                return;
            }
            if (obj instanceof com.badlogic.gdx.utils.b) {
                if (cls3 == null) {
                    cls3 = com.badlogic.gdx.utils.b.class;
                }
                y0(cls4, cls3);
                com.badlogic.gdx.utils.b bVar3 = (com.badlogic.gdx.utils.b) obj;
                int i14 = bVar3.f13193c;
                while (i11 < i14) {
                    this.f13261a.j(c(bVar3.f13191a[i11]));
                    E0(bVar3.f13192b[i11], cls2, null);
                    i11++;
                }
                w0();
                return;
            }
            if (obj instanceof Map) {
                if (cls3 == null) {
                    cls3 = HashMap.class;
                }
                y0(cls4, cls3);
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    this.f13261a.j(c(entry.getKey()));
                    E0(entry.getValue(), cls2, null);
                }
                w0();
                return;
            }
            if (!g3.c.y(Enum.class, cls4)) {
                y0(cls4, cls3);
                v0(obj);
                w0();
                return;
            }
            if (cls4.getEnumConstants() == null) {
                cls4 = cls4.getSuperclass();
            }
            if (this.f13262b == null || (cls3 != null && cls3 == cls4)) {
                this.f13261a.I(b((Enum) obj));
                return;
            }
            y0(cls4, null);
            this.f13261a.j("value");
            this.f13261a.I(b((Enum) obj));
            w0();
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public void F(Object obj, String str, @d0 Class cls, JsonValue jsonValue) {
        H(obj, str, str, cls, jsonValue);
    }

    public void F0(String str, @d0 Object obj) {
        try {
            this.f13261a.j(str);
            if (obj == null) {
                E0(obj, null, null);
            } else {
                E0(obj, obj.getClass(), null);
            }
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public void G(Object obj, String str, String str2, JsonValue jsonValue) {
        H(obj, str, str2, null, jsonValue);
    }

    public void G0(String str, @d0 Object obj, @d0 Class cls) {
        try {
            this.f13261a.j(str);
            E0(obj, cls, null);
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public void H(Object obj, String str, String str2, @d0 Class cls, JsonValue jsonValue) {
        Class<?> cls2 = obj.getClass();
        a k11 = q(cls2).k(str);
        if (k11 != null) {
            g3.e eVar = k11.f13279a;
            if (cls == null) {
                cls = k11.f13280b;
            }
            D(obj, eVar, str2, cls, jsonValue);
            return;
        }
        throw new SerializationException("Field not found: " + str + " (" + cls2.getName() + pn.j.f81007d);
    }

    public void H0(String str, @d0 Object obj, @d0 Class cls, @d0 Class cls2) {
        try {
            this.f13261a.j(str);
            E0(obj, cls, cls2);
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public void I(Object obj, JsonValue jsonValue) {
        Class<?> cls = obj.getClass();
        n<String, a> q11 = q(cls);
        for (JsonValue jsonValue2 = jsonValue.f13156f; jsonValue2 != null; jsonValue2 = jsonValue2.f13158h) {
            a k11 = q11.k(jsonValue2.q0().replace(" ", "_"));
            if (k11 == null) {
                if (!jsonValue2.f13155e.equals(this.f13262b) && !this.f13266f && !v(cls, jsonValue2.f13155e)) {
                    SerializationException serializationException = new SerializationException("Field not found: " + jsonValue2.f13155e + " (" + cls.getName() + pn.j.f81007d);
                    serializationException.addTrace(jsonValue2.P0());
                    throw serializationException;
                }
            } else if (!this.f13267g || this.f13268h || !k11.f13281c) {
                g3.e eVar = k11.f13279a;
                try {
                    eVar.s(obj, K(eVar.g(), k11.f13280b, jsonValue2));
                } catch (SerializationException e11) {
                    e11.addTrace(eVar.f() + " (" + cls.getName() + pn.j.f81007d);
                    throw e11;
                } catch (ReflectionException e12) {
                    throw new SerializationException("Error accessing field: " + eVar.f() + " (" + cls.getName() + pn.j.f81007d, e12);
                } catch (RuntimeException e13) {
                    SerializationException serializationException2 = new SerializationException(e13);
                    serializationException2.addTrace(jsonValue2.P0());
                    serializationException2.addTrace(eVar.f() + " (" + cls.getName() + pn.j.f81007d);
                    throw serializationException2;
                }
            }
        }
    }

    @d0
    public <T> T J(@d0 Class<T> cls, JsonValue jsonValue) {
        return (T) K(cls, null, jsonValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x035b, code lost:
    
        if (r2 == r0) goto L308;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0440 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v59, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v60, types: [T, com.badlogic.gdx.utils.b] */
    /* JADX WARN: Type inference failed for: r0v61, types: [T, com.badlogic.gdx.utils.e] */
    /* JADX WARN: Type inference failed for: r0v62, types: [T, com.badlogic.gdx.utils.i] */
    /* JADX WARN: Type inference failed for: r0v63, types: [T, com.badlogic.gdx.utils.d] */
    /* JADX WARN: Type inference failed for: r0v64, types: [T, com.badlogic.gdx.utils.m] */
    /* JADX WARN: Type inference failed for: r0v65, types: [T, com.badlogic.gdx.utils.j] */
    /* JADX WARN: Type inference failed for: r0v66, types: [T, com.badlogic.gdx.utils.k] */
    /* JADX WARN: Type inference failed for: r0v67, types: [T, com.badlogic.gdx.utils.l] */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Enum] */
    @a3.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T K(@a3.d0 java.lang.Class<T> r23, @a3.d0 java.lang.Class r24, com.badlogic.gdx.utils.JsonValue r25) {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.f.K(java.lang.Class, java.lang.Class, com.badlogic.gdx.utils.JsonValue):java.lang.Object");
    }

    @d0
    public <T> T L(@d0 Class<T> cls, @d0 Class cls2, T t11, JsonValue jsonValue) {
        return jsonValue == null ? t11 : (T) K(cls, cls2, jsonValue);
    }

    @d0
    public <T> T M(String str, @d0 Class<T> cls, JsonValue jsonValue) {
        return (T) K(cls, null, jsonValue.z(str));
    }

    @d0
    public <T> T N(String str, @d0 Class<T> cls, @d0 Class cls2, JsonValue jsonValue) {
        return (T) K(cls, cls2, jsonValue.z(str));
    }

    @d0
    public <T> T O(String str, @d0 Class<T> cls, @d0 Class cls2, T t11, JsonValue jsonValue) {
        return (T) L(cls, cls2, t11, jsonValue.z(str));
    }

    @d0
    public <T> T P(String str, @d0 Class<T> cls, T t11, JsonValue jsonValue) {
        JsonValue z11 = jsonValue.z(str);
        return z11 == null ? t11 : (T) K(cls, null, z11);
    }

    public void Q(@d0 d dVar) {
        this.f13271k = dVar;
    }

    public void R(Class cls, String str, boolean z11) {
        a k11 = q(cls).k(str);
        if (k11 != null) {
            k11.f13281c = z11;
            return;
        }
        throw new SerializationException("Field not found: " + str + " (" + cls.getName() + pn.j.f81007d);
    }

    public void S(Class cls, String str, Class cls2) {
        a k11 = q(cls).k(str);
        if (k11 != null) {
            k11.f13280b = cls2;
            return;
        }
        throw new SerializationException("Field not found: " + str + " (" + cls.getName() + pn.j.f81007d);
    }

    public void T(boolean z11) {
        this.f13269i = z11;
    }

    public void U(boolean z11) {
        this.f13267g = z11;
    }

    public void V(boolean z11) {
        this.f13266f = z11;
    }

    public void W(JsonWriter.OutputType outputType) {
        this.f13264d = outputType;
    }

    public void X(boolean z11) {
        this.f13265e = z11;
    }

    public void Y(boolean z11) {
        this.f13268h = z11;
    }

    public <T> void Z(Class<T> cls, d<T> dVar) {
        this.f13275o.r(cls, dVar);
    }

    public void a(String str, Class cls) {
        this.f13273m.r(str, cls);
        this.f13274n.r(cls, str);
    }

    public void a0(boolean z11) {
        this.f13270j = z11;
    }

    public final String b(Enum r22) {
        return this.f13269i ? r22.name() : r22.toString();
    }

    public void b0(@d0 String str) {
        this.f13262b = str;
    }

    public final String c(Object obj) {
        return obj instanceof Enum ? b((Enum) obj) : obj instanceof Class ? ((Class) obj).getName() : String.valueOf(obj);
    }

    public void c0(boolean z11) {
        this.f13263c = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(Object obj, Object obj2) {
        n<String, a> q11 = q(obj2.getClass());
        l.a<String, a> it = q(obj.getClass()).iterator();
        while (it.hasNext()) {
            l.b next = it.next();
            a k11 = q11.k(next.f13394a);
            g3.e eVar = ((a) next.f13395b).f13279a;
            if (k11 == null) {
                throw new SerializationException("To object is missing field: " + ((String) next.f13394a));
            }
            try {
                k11.f13279a.s(obj2, eVar.a(obj));
            } catch (ReflectionException e11) {
                throw new SerializationException("Error copying field: " + eVar.f(), e11);
            }
        }
    }

    public void d0(Writer writer) {
        if (!(writer instanceof JsonWriter)) {
            writer = new JsonWriter(writer);
        }
        JsonWriter jsonWriter = (JsonWriter) writer;
        this.f13261a = jsonWriter;
        jsonWriter.E(this.f13264d);
        this.f13261a.H(this.f13265e);
    }

    @d0
    public <T> T e(Class<T> cls, InputStream inputStream) {
        return (T) K(cls, null, new g().b(inputStream));
    }

    public void e0(Class cls, com.badlogic.gdx.utils.a<String> aVar) {
        if (this.f13270j) {
            aVar.O();
        }
    }

    @d0
    public <T> T f(Class<T> cls, Reader reader) {
        return (T) K(cls, null, new g().r(reader));
    }

    public String f0(@d0 Object obj) {
        return h0(obj, obj == null ? null : obj.getClass(), null);
    }

    @d0
    public <T> T g(Class<T> cls, Class cls2, InputStream inputStream) {
        return (T) K(cls, cls2, new g().b(inputStream));
    }

    public String g0(@d0 Object obj, @d0 Class cls) {
        return h0(obj, cls, null);
    }

    @d0
    public <T> T h(Class<T> cls, Class cls2, Reader reader) {
        return (T) K(cls, cls2, new g().r(reader));
    }

    public String h0(@d0 Object obj, @d0 Class cls, @d0 Class cls2) {
        StringWriter stringWriter = new StringWriter();
        k0(obj, cls, cls2, stringWriter);
        return stringWriter.toString();
    }

    @d0
    public <T> T i(Class<T> cls, Class cls2, String str) {
        return (T) K(cls, cls2, new g().s(str));
    }

    public void i0(@d0 Object obj, Writer writer) {
        k0(obj, obj == null ? null : obj.getClass(), null, writer);
    }

    @d0
    public <T> T j(Class<T> cls, Class cls2, v1.a aVar) {
        try {
            return (T) K(cls, cls2, new g().a(aVar));
        } catch (Exception e11) {
            throw new SerializationException("Error reading file: " + aVar, e11);
        }
    }

    public void j0(@d0 Object obj, @d0 Class cls, Writer writer) {
        k0(obj, cls, null, writer);
    }

    @d0
    public <T> T k(Class<T> cls, Class cls2, char[] cArr, int i11, int i12) {
        return (T) K(cls, cls2, new g().t(cArr, i11, i12));
    }

    public void k0(@d0 Object obj, @d0 Class cls, @d0 Class cls2, Writer writer) {
        d0(writer);
        try {
            E0(obj, cls, cls2);
        } finally {
            x0.a(this.f13261a);
            this.f13261a = null;
        }
    }

    @d0
    public <T> T l(Class<T> cls, String str) {
        return (T) K(cls, null, new g().s(str));
    }

    public void l0(@d0 Object obj, @d0 Class cls, @d0 Class cls2, v1.a aVar) {
        Writer writer = null;
        try {
            try {
                writer = aVar.a0(false, "UTF-8");
                k0(obj, cls, cls2, writer);
            } catch (Exception e11) {
                throw new SerializationException("Error writing file: " + aVar, e11);
            }
        } finally {
            x0.a(writer);
        }
    }

    @d0
    public <T> T m(Class<T> cls, v1.a aVar) {
        try {
            return (T) K(cls, null, new g().a(aVar));
        } catch (Exception e11) {
            throw new SerializationException("Error reading file: " + aVar, e11);
        }
    }

    public void m0(@d0 Object obj, @d0 Class cls, v1.a aVar) {
        l0(obj, cls, null, aVar);
    }

    @d0
    public <T> T n(Class<T> cls, char[] cArr, int i11, int i12) {
        return (T) K(cls, null, new g().t(cArr, i11, i12));
    }

    public void n0(@d0 Object obj, v1.a aVar) {
        l0(obj, obj == null ? null : obj.getClass(), null, aVar);
    }

    @d0
    public Class o(String str) {
        return this.f13273m.k(str);
    }

    public void o0() {
        try {
            this.f13261a.r();
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    @d0
    public final Object[] p(Class cls) {
        if (!this.f13263c) {
            return null;
        }
        if (this.f13276p.b(cls)) {
            return this.f13276p.k(cls);
        }
        try {
            Object w11 = w(cls);
            n<String, a> q11 = q(cls);
            Object[] objArr = new Object[q11.f13380a];
            this.f13276p.r(cls, objArr);
            com.badlogic.gdx.utils.a<String> C = q11.C();
            int i11 = C.f13179b;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                a k11 = q11.k(C.get(i13));
                if (!this.f13267g || !k11.f13281c) {
                    g3.e eVar = k11.f13279a;
                    int i14 = i12 + 1;
                    try {
                        objArr[i12] = eVar.a(w11);
                        i12 = i14;
                    } catch (SerializationException e11) {
                        e11.addTrace(eVar + " (" + cls.getName() + pn.j.f81007d);
                        throw e11;
                    } catch (ReflectionException e12) {
                        throw new SerializationException("Error accessing field: " + eVar.f() + " (" + cls.getName() + pn.j.f81007d, e12);
                    } catch (RuntimeException e13) {
                        SerializationException serializationException = new SerializationException(e13);
                        serializationException.addTrace(eVar + " (" + cls.getName() + pn.j.f81007d);
                        throw serializationException;
                    }
                }
            }
            return objArr;
        } catch (Exception unused) {
            this.f13276p.r(cls, null);
            return null;
        }
    }

    public void p0() {
        try {
            this.f13261a.a();
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public final n<String, a> q(Class cls) {
        n<String, a> k11 = this.f13272l.k(cls);
        if (k11 != null) {
            return k11;
        }
        com.badlogic.gdx.utils.a aVar = new com.badlogic.gdx.utils.a();
        for (Class cls2 = cls; cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            aVar.a(cls2);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = aVar.f13179b - 1; i11 >= 0; i11--) {
            Collections.addAll(arrayList, g3.c.k((Class) aVar.get(i11)));
        }
        n<String, a> nVar = new n<>(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            g3.e eVar = (g3.e) arrayList.get(i12);
            if (!eVar.q() && !eVar.o() && !eVar.p()) {
                if (!eVar.h()) {
                    try {
                        eVar.t(true);
                    } catch (RuntimeException unused) {
                    }
                }
                nVar.r(eVar.f(), new a(eVar));
            }
        }
        e0(cls, nVar.f13414o);
        this.f13272l.r(cls, nVar);
        return nVar;
    }

    public void q0(String str) {
        try {
            this.f13261a.j(str);
            this.f13261a.a();
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public boolean r() {
        return this.f13266f;
    }

    public void r0(Object obj, String str) {
        u0(obj, str, str, null);
    }

    public <T> d<T> s(Class<T> cls) {
        return this.f13275o.k(cls);
    }

    public void s0(Object obj, String str, @d0 Class cls) {
        u0(obj, str, str, cls);
    }

    @d0
    public String t(Class cls) {
        return this.f13274n.k(cls);
    }

    public void t0(Object obj, String str, String str2) {
        u0(obj, str, str2, null);
    }

    public JsonWriter u() {
        return this.f13261a;
    }

    public void u0(Object obj, String str, String str2, @d0 Class cls) {
        Class<?> cls2 = obj.getClass();
        a k11 = q(cls2).k(str);
        if (k11 == null) {
            throw new SerializationException("Field not found: " + str + " (" + cls2.getName() + pn.j.f81007d);
        }
        g3.e eVar = k11.f13279a;
        if (cls == null) {
            cls = k11.f13280b;
        }
        try {
            this.f13261a.j(str2);
            E0(eVar.a(obj), eVar.g(), cls);
        } catch (SerializationException e11) {
            e11.addTrace(eVar + " (" + cls2.getName() + pn.j.f81007d);
            throw e11;
        } catch (ReflectionException e12) {
            throw new SerializationException("Error accessing field: " + eVar.f() + " (" + cls2.getName() + pn.j.f81007d, e12);
        } catch (Exception e13) {
            SerializationException serializationException = new SerializationException(e13);
            serializationException.addTrace(eVar + " (" + cls2.getName() + pn.j.f81007d);
            throw serializationException;
        }
    }

    public boolean v(Class cls, String str) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (java.util.Arrays.deepEquals(r8, r0) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v0(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.f.v0(java.lang.Object):void");
    }

    public Object w(Class cls) {
        try {
            return g3.c.F(cls);
        } catch (Exception e11) {
            e = e11;
            try {
                g3.d i11 = g3.c.i(cls, new Class[0]);
                i11.e(true);
                return i11.d(new Object[0]);
            } catch (ReflectionException unused) {
                if (g3.c.y(Enum.class, cls)) {
                    if (cls.getEnumConstants() == null) {
                        cls = cls.getSuperclass();
                    }
                    return cls.getEnumConstants()[0];
                }
                if (cls.isArray()) {
                    throw new SerializationException("Encountered JSON object when expected array of type: " + cls.getName(), e);
                }
                if (!g3.c.C(cls) || g3.c.E(cls)) {
                    throw new SerializationException("Class cannot be created (missing no-arg constructor): " + cls.getName(), e);
                }
                throw new SerializationException("Class cannot be created (non-static member class): " + cls.getName(), e);
            } catch (SecurityException unused2) {
                throw new SerializationException("Error constructing instance of class: " + cls.getName(), e);
            } catch (Exception e12) {
                e = e12;
                throw new SerializationException("Error constructing instance of class: " + cls.getName(), e);
            }
        }
    }

    public void w0() {
        try {
            this.f13261a.r();
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public String x(@d0 Object obj) {
        return y(obj, 0);
    }

    public void x0() {
        try {
            this.f13261a.k();
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public String y(@d0 Object obj, int i11) {
        return B(f0(obj), i11);
    }

    public void y0(Class cls, @d0 Class cls2) {
        try {
            this.f13261a.k();
            if (cls2 == null || cls2 != cls) {
                B0(cls);
            }
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public String z(@d0 Object obj, JsonValue.c cVar) {
        return C(f0(obj), cVar);
    }

    public void z0(String str) {
        try {
            this.f13261a.j(str);
            x0();
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public f(JsonWriter.OutputType outputType) {
        this.f13262b = "class";
        this.f13263c = true;
        this.f13269i = true;
        this.f13272l = new l<>();
        this.f13273m = new l<>();
        this.f13274n = new l<>();
        this.f13275o = new l<>();
        this.f13276p = new l<>();
        this.f13277q = new Object[]{null};
        this.f13278r = new Object[]{null};
        this.f13264d = outputType;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b<T> implements d<T> {
        @Override // com.badlogic.gdx.utils.f.d
        public abstract T b(f fVar, JsonValue jsonValue, Class cls);

        @Override // com.badlogic.gdx.utils.f.d
        public void a(f fVar, T t11, Class cls) {
        }
    }
}
