package p90;

import j90.n;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g<C extends i> implements f {

    /* renamed from: a, reason: collision with root package name */
    public final C f80305a;

    /* renamed from: e, reason: collision with root package name */
    public p90.b[] f80309e;

    /* renamed from: b, reason: collision with root package name */
    public Map<Class, r90.g> f80306b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public Map<Class, Map<Annotation, r90.g>> f80307c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public Map<Integer, Annotation> f80308d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public j90.i f80310f = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements g90.a {

        /* renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ String[] f80311x0;

        /* renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ String[] f80312y0;

        public a(String[] strArr, String[] strArr2) {
            this.f80311x0 = strArr;
            this.f80312y0 = strArr2;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return g90.a.class;
        }

        @Override // g90.a
        public String[] falseStrings() {
            String[] strArr = this.f80312y0;
            return strArr == null ? org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.f78085a : strArr;
        }

        @Override // g90.a
        public String[] trueStrings() {
            String[] strArr = this.f80311x0;
            return strArr == null ? org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.f78085a : strArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements g90.f {

        /* renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ String f80313x0;

        /* renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ String[] f80314y0;

        public b(String str, String[] strArr) {
            this.f80313x0 = str;
            this.f80314y0 = strArr;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return g90.f.class;
        }

        @Override // g90.f
        public String[] formats() {
            return new String[]{this.f80313x0};
        }

        @Override // g90.f
        public String[] options() {
            return this.f80314y0;
        }
    }

    public g(C c11) {
        this.f80305a = c11;
    }

    public static Annotation Y(String str, String... strArr) {
        return new b(str, strArr);
    }

    public static Annotation v(String[] strArr, String[] strArr2) {
        return new a(strArr, strArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object z(p90.b bVar, String[] strArr, r90.g[] gVarArr) {
        String str = strArr[bVar.f80299a];
        int i11 = 0;
        String str2 = str;
        while (i11 < gVarArr.length) {
            Object b11 = gVarArr[i11].b(str2);
            i11++;
            str2 = b11;
        }
        return str2;
    }

    public final j90.i A() {
        if (this.f80310f == null) {
            this.f80310f = new j90.i();
        }
        return this.f80310f;
    }

    public p90.b B(int i11) {
        int length;
        int i12;
        p90.b[] bVarArr = this.f80309e;
        if (bVarArr == null || bVarArr.length < i11 + 1 || bVarArr[i11] == null) {
            synchronized (this) {
                try {
                    p90.b[] bVarArr2 = this.f80309e;
                    if (bVarArr2 != null) {
                        if (bVarArr2.length >= i11 + 1) {
                            if (bVarArr2[i11] == null) {
                            }
                        }
                    }
                    if (bVarArr2 != null) {
                        i12 = bVarArr2.length;
                        this.f80309e = (p90.b[]) Arrays.copyOf(bVarArr2, i11 + 1);
                        length = i11;
                    } else {
                        String[] a11 = this.f80305a.a();
                        length = (a11 == null || i11 >= a11.length) ? i11 : a11.length;
                        int[] g11 = this.f80305a.g();
                        if (g11 != null) {
                            for (int i13 : g11) {
                                if (length < i13) {
                                    length = i13;
                                }
                            }
                        }
                        this.f80309e = new p90.b[length + 1];
                        i12 = 0;
                    }
                    while (i12 < length + 1) {
                        this.f80309e[i12] = new p90.b(i12);
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f80309e[i11];
    }

    public final p90.b C(Enum<?> r22) {
        NormalizedString[] identifierGroupArray = NormalizedString.toIdentifierGroupArray(this.f80305a.a());
        if (identifierGroupArray == null || identifierGroupArray.length == 0) {
            throw new IllegalStateException("No headers parsed from input nor provided in the user settings. Only index-based operations are available.");
        }
        return B(this.f80305a.h(r22));
    }

    public final p90.b D(String str) {
        int e11 = this.f80305a.e(str);
        if (e11 != -1) {
            return B(e11);
        }
        K();
        throw new IllegalArgumentException("Header name '" + str + "' not found. Available columns are: " + Arrays.asList(f()));
    }

    public <T> T E(String[] strArr, int i11, Class<T> cls, T t11) {
        return (T) w(V(i11), strArr, cls, t11, null);
    }

    public <T> T F(String[] strArr, int i11, Class<T> cls, T t11, String str, String... strArr2) {
        return str == null ? (T) E(strArr, i11, cls, t11) : (T) w(V(i11), strArr, cls, t11, u(cls, str, strArr2));
    }

    public <T> T G(String[] strArr, Enum<?> r82, Class<T> cls, T t11) {
        return (T) w(W(r82), strArr, cls, t11, null);
    }

    public <T> T H(String[] strArr, Enum<?> r82, Class<T> cls, T t11, String str, String... strArr2) {
        return str == null ? (T) G(strArr, r82, cls, t11) : (T) w(W(r82), strArr, cls, t11, u(cls, str, strArr2));
    }

    public <T> T I(String[] strArr, String str, Class<T> cls, T t11) {
        return (T) w(X(str), strArr, cls, t11, null);
    }

    public <T> T J(String[] strArr, String str, Class<T> cls, T t11, String str2, String... strArr2) {
        return str2 == null ? (T) I(strArr, str, cls, t11) : (T) w(X(str), strArr, cls, t11, u(cls, str2, strArr2));
    }

    public final NormalizedString[] K() {
        NormalizedString[] identifierGroupArray = NormalizedString.toIdentifierGroupArray(this.f80305a.a());
        if (identifierGroupArray == null || identifierGroupArray.length == 0) {
            throw new IllegalStateException("No headers parsed from input nor provided in the user settings. Only index-based operations are available.");
        }
        return identifierGroupArray;
    }

    public <T> T L(String[] strArr, int i11, Class<T> cls, r90.g[] gVarArr) {
        return (T) x(V(i11), strArr, cls, gVarArr);
    }

    public <T> T M(String[] strArr, int i11, T t11, r90.g[] gVarArr) {
        return (T) y(V(i11), strArr, t11, gVarArr);
    }

    public <T> T N(String[] strArr, Enum<?> r22, Class<T> cls, r90.g[] gVarArr) {
        return (T) x(W(r22), strArr, cls, gVarArr);
    }

    public <T> T O(String[] strArr, Enum<?> r22, T t11, r90.g[] gVarArr) {
        return (T) y(W(r22), strArr, t11, gVarArr);
    }

    public <T> T P(String[] strArr, String str, Class<T> cls, r90.g[] gVarArr) {
        return (T) x(X(str), strArr, cls, gVarArr);
    }

    public <T> T Q(String[] strArr, String str, T t11, r90.g[] gVarArr) {
        return (T) y(X(str), strArr, t11, gVarArr);
    }

    public String R(String[] strArr, int i11) {
        return strArr[V(i11).f80299a];
    }

    public String S(String[] strArr, Enum<?> r22) {
        return strArr[W(r22).f80299a];
    }

    public String T(String[] strArr, String str) {
        int i11 = X(str).f80299a;
        if (i11 >= strArr.length) {
            return null;
        }
        return strArr[i11];
    }

    public final void U(String[] strArr, p90.b bVar) {
        if (this.f80310f != null) {
            synchronized (this) {
                String[] a11 = a();
                if (a11 != null) {
                    strArr = a11;
                }
                this.f80310f.i(false, strArr);
                bVar.c(this.f80310f.h(bVar.f80299a, bVar.f80300b));
            }
        }
    }

    public p90.b V(int i11) {
        return B(i11);
    }

    public p90.b W(Enum<?> r12) {
        return C(r12);
    }

    public p90.b X(String str) {
        return D(str);
    }

    @Override // p90.f
    public String[] a() {
        return this.f80305a.a();
    }

    @Override // p90.f
    public n<String> b(r90.g... gVarArr) {
        return A().e(gVarArr);
    }

    @Override // p90.f
    public n<Integer> c(r90.g... gVarArr) {
        return A().d(gVarArr);
    }

    @Override // p90.f
    public Object d(int i11) {
        return B(i11).f80301c;
    }

    @Override // p90.f
    public int e(String str) {
        return D(str).f80299a;
    }

    @Override // p90.f
    public String[] f() {
        return this.f80305a.f();
    }

    @Override // p90.f
    public Class<?> g(int i11) {
        return B(i11).f80300b;
    }

    @Override // p90.f
    public int h(Enum<?> r12) {
        return C(r12).f80299a;
    }

    @Override // p90.f
    public Class<?> i(Enum<?> r12) {
        return C(r12).f80300b;
    }

    @Override // p90.f
    public boolean j(String str) {
        return (str == null || this.f80305a.e(str) == -1) ? false : true;
    }

    @Override // p90.f
    public Object k(String str) {
        return D(str).f80301c;
    }

    @Override // p90.f
    public void l(Class<?> cls, String... strArr) {
        for (String str : strArr) {
            D(str).f80300b = cls;
        }
    }

    @Override // p90.f
    public Class<?> m(String str) {
        return D(str).f80300b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p90.f
    public void n(Class<?> cls, Enum... enumArr) {
        for (Enum r02 : enumArr) {
            C(r02).f80300b = cls;
        }
    }

    @Override // p90.f
    public <T> void o(T t11, String... strArr) {
        for (String str : strArr) {
            D(str).f80301c = t11;
        }
    }

    @Override // p90.f
    public <T extends Enum<T>> n<T> p(Class<T> cls, r90.g... gVarArr) {
        return (n<T>) A().c(gVarArr);
    }

    @Override // p90.f
    public <T> void q(T t11, int... iArr) {
        for (int i11 : iArr) {
            B(i11).f80301c = t11;
        }
    }

    @Override // p90.f
    public Object r(Enum<?> r12) {
        return C(r12).f80301c;
    }

    @Override // p90.f
    public <T> void s(T t11, Enum<?>... enumArr) {
        for (Enum<?> r02 : enumArr) {
            C(r02).f80301c = t11;
        }
    }

    @Override // p90.f
    public void t(Class<?> cls, int... iArr) {
        for (int i11 : iArr) {
            B(i11).f80300b = cls;
        }
    }

    public <T> Annotation u(Class<T> cls, String str, String... strArr) {
        Annotation v11;
        Integer valueOf = Integer.valueOf((cls.hashCode() * 31) + String.valueOf(str).hashCode() + (Arrays.toString(strArr).hashCode() * 31));
        Annotation annotation = this.f80308d.get(valueOf);
        if (annotation != null) {
            return annotation;
        }
        if (cls == Boolean.class || cls == Boolean.TYPE) {
            v11 = v(str == null ? null : new String[]{str}, strArr);
        } else {
            v11 = Y(str, strArr);
        }
        this.f80308d.put(valueOf, v11);
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    public final <T> T w(p90.b bVar, String[] strArr, Class<T> cls, T t11, Annotation annotation) {
        r90.g gVar;
        int i11;
        int i12 = bVar.f80299a;
        T t12 = i12 < strArr.length ? strArr[i12] : null;
        if (t12 == null) {
            t12 = t11 == null ? (T) bVar.f80301c : t11;
        }
        if (annotation == null) {
            U(strArr, bVar);
            t12 = (T) bVar.a(t12);
            if (t12 == null) {
                if (t11 == null) {
                    t11 = (T) bVar.f80301c;
                }
                t12 = t11;
            }
        }
        if (cls != null) {
            if (t12 != null && cls.isAssignableFrom(t12.getClass())) {
                return t12;
            }
            if (annotation == null) {
                gVar = this.f80306b.get(cls);
                if (gVar == null) {
                    gVar = h90.a.C(cls, null, null);
                    this.f80306b.put(cls, gVar);
                }
            } else {
                Map<Annotation, r90.g> map = this.f80307c.get(cls);
                if (map == null) {
                    map = new HashMap<>();
                    this.f80307c.put(cls, map);
                }
                r90.g gVar2 = map.get(annotation);
                if (gVar2 == null) {
                    gVar2 = h90.a.z(cls, annotation);
                    map.put(annotation, gVar2);
                }
                gVar = gVar2;
            }
            if (gVar == null) {
                if (cls == String.class) {
                    if (t12 != null && (i11 = bVar.f80299a) < strArr.length) {
                        return (T) strArr[i11];
                    }
                    return null;
                }
                DataProcessingException dataProcessingException = new DataProcessingException("Cannot convert '{value}' to " + cls.getName() + ((cls == Date.class || cls == Calendar.class) ? ". Need to specify format for date" : ""));
                dataProcessingException.setValue(t12);
                dataProcessingException.setErrorContentLength(this.f80305a.l());
                throw dataProcessingException;
            }
            t12 = (T) gVar.b(t12);
        }
        if (cls == null) {
            return t12;
        }
        try {
            return cls.cast(t12);
        } catch (ClassCastException unused) {
            DataProcessingException dataProcessingException2 = new DataProcessingException("Cannot cast value '{value}' of type " + t12.getClass().toString() + " to " + cls.getName());
            dataProcessingException2.setValue(t12);
            dataProcessingException2.setErrorContentLength(this.f80305a.l());
            throw dataProcessingException2;
        }
    }

    public final <T> T x(p90.b bVar, String[] strArr, Class<T> cls, r90.g[] gVarArr) {
        return cls.cast(z(bVar, strArr, gVarArr));
    }

    public final Object y(p90.b bVar, String[] strArr, Object obj, r90.g[] gVarArr) {
        Object z11 = z(bVar, strArr, gVarArr);
        return z11 == null ? obj : z11;
    }
}
