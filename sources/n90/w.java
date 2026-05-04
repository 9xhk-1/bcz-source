package n90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.MethodFilter;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class w extends b0 {

    /* renamed from: e, reason: collision with root package name */
    public b f74984e;

    /* renamed from: f, reason: collision with root package name */
    public b[] f74985f;

    /* renamed from: g, reason: collision with root package name */
    public b f74986g;

    /* renamed from: h, reason: collision with root package name */
    public Class[] f74987h;

    /* renamed from: i, reason: collision with root package name */
    public final int f74988i;

    /* renamed from: j, reason: collision with root package name */
    public final String f74989j;

    /* renamed from: k, reason: collision with root package name */
    public Comparator f74990k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Comparator<Object> {
        public a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            return (obj == null || !obj.equals(obj2)) ? 1 : 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final a0<Object[]> f74992a;

        /* renamed from: b, reason: collision with root package name */
        public final NormalizedString[] f74993b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f74994c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f74995d;

        public b(a0<Object[]> a0Var, String[] strArr, int[] iArr, Object obj) {
            this(a0Var, strArr, iArr, obj, null);
        }

        public b(String[] strArr, int[] iArr, Class<?> cls) {
            this(null, strArr, iArr, cls, cls);
        }

        public b(a0<Object[]> a0Var, String[] strArr, int[] iArr, Object obj, Class<?> cls) {
            if (cls != null) {
                a0Var = new f<>(cls);
                if (strArr == null && iArr == null) {
                    MethodFilter methodFilter = MethodFilter.ONLY_GETTERS;
                    String[] h11 = h90.a.h(cls, methodFilter);
                    iArr = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.F(Arrays.asList(h90.a.L(cls, methodFilter)));
                    strArr = h11;
                }
            }
            this.f74992a = a0Var;
            this.f74993b = (strArr == null || strArr.length == 0) ? null : NormalizedString.toIdentifierGroupArray(strArr);
            this.f74994c = (iArr == null || iArr.length == 0) ? null : iArr;
            this.f74995d = obj;
        }
    }

    public w() {
        this(0);
    }

    public void A(a0<Object[]> a0Var, String... strArr) {
        this.f74984e = new b(a0Var, strArr, null, null);
    }

    @Override // n90.b0
    public String a() {
        return "Expecting one of values: " + u() + " at column index " + r();
    }

    @Override // n90.b0
    public NormalizedString[] b() {
        b bVar = this.f74986g;
        if (bVar != null) {
            return bVar.f74993b;
        }
        return null;
    }

    @Override // n90.b0
    public NormalizedString[] c(Object obj) {
        if (!(obj instanceof Object[])) {
            return s(obj);
        }
        Object[] objArr = (Object[]) obj;
        int i11 = this.f74988i;
        if (i11 < objArr.length) {
            return s(objArr[i11]);
        }
        return null;
    }

    @Override // n90.b0
    public NormalizedString[] d(Map map, Map map2) {
        Object obj = null;
        if (map2 != null && !map2.isEmpty()) {
            Object obj2 = this.f74989j;
            if (map != null) {
                if (obj2 != null) {
                    Object obj3 = map.get(obj2);
                    if (obj3 != null) {
                        obj = obj3.toString();
                    }
                } else {
                    int i11 = this.f74988i;
                    if (i11 != -1) {
                        Object x11 = x(map, i11);
                        if (x11 != null) {
                            obj = x11.toString();
                        }
                    }
                }
                obj2 = obj;
            }
            obj = obj2 != null ? map2.get(obj2) : x(map2, this.f74988i);
        }
        return s(obj);
    }

    @Override // n90.b0
    public int[] e() {
        b bVar = this.f74986g;
        if (bVar != null) {
            return bVar.f74994c;
        }
        return null;
    }

    @Override // n90.b0
    public a0<?> h(Object obj) {
        b t11 = t(obj);
        this.f74986g = t11;
        if (t11 != null) {
            return t11.f74992a;
        }
        return null;
    }

    public final void j(b bVar) {
        b[] bVarArr = this.f74985f;
        b[] bVarArr2 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
        this.f74985f = bVarArr2;
        bVarArr2[bVarArr2.length - 1] = bVar;
        Class[] clsArr = this.f74987h;
        this.f74987h = (Class[]) Arrays.copyOf(clsArr, clsArr.length + 1);
        Object obj = bVar.f74995d;
        if (obj == null || obj.getClass() != Class.class) {
            return;
        }
        this.f74987h[r0.length - 1] = (Class) bVar.f74995d;
    }

    public <T> void k(Class<T> cls) {
        j(new b(null, null, cls));
    }

    public <T> void l(Class<T> cls, int... iArr) {
        j(new b(null, iArr, cls));
    }

    public <T> void m(Class<T> cls, String... strArr) {
        j(new b(strArr, null, cls));
    }

    public void n(Object obj, a0<Object[]> a0Var) {
        j(new b(a0Var, null, null, obj));
    }

    public void o(Object obj, a0<Object[]> a0Var, int... iArr) {
        j(new b(a0Var, null, iArr, obj));
    }

    public void q(Object obj, a0<Object[]> a0Var, String... strArr) {
        j(new b(a0Var, strArr, null, obj));
    }

    public int r() {
        return this.f74988i;
    }

    public final NormalizedString[] s(Object obj) {
        for (int i11 = 0; i11 < this.f74985f.length; i11++) {
            b t11 = t(obj);
            if (t11 != null) {
                return t11.f74993b;
            }
        }
        return null;
    }

    public final b t(Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            int i11 = this.f74988i;
            if (length < i11) {
                return this.f74984e;
            }
            obj = objArr[i11];
        }
        int i12 = 0;
        while (true) {
            b[] bVarArr = this.f74985f;
            if (i12 >= bVarArr.length) {
                return this.f74984e;
            }
            b bVar = bVarArr[i12];
            Class cls = this.f74987h[i12];
            if (cls != null) {
                if (cls.isAssignableFrom(obj.getClass())) {
                    return bVar;
                }
            } else if (this.f74990k.compare(obj, bVar.f74995d) == 0) {
                return bVar;
            }
            i12++;
        }
    }

    public final List<Object> u() {
        ArrayList arrayList = new ArrayList(this.f74985f.length);
        for (b bVar : this.f74985f) {
            arrayList.add(bVar.f74995d);
        }
        return arrayList;
    }

    public final String v(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Header name cannot be blank");
        }
        return str;
    }

    public final int w(int i11) {
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException("Column index must be positive");
    }

    public final <V> V x(Map<?, V> map, int i11) {
        for (Map.Entry<?, V> entry : map.entrySet()) {
            if (i11 == 0) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void y(Comparator<?> comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Comparator must not be null");
        }
        this.f74990k = comparator;
    }

    public void z(a0<Object[]> a0Var, int... iArr) {
        this.f74984e = new b(a0Var, null, iArr, null);
    }

    public w(int i11) {
        this.f74985f = new b[0];
        this.f74987h = new Class[0];
        this.f74990k = new a();
        this.f74988i = w(i11);
        this.f74989j = null;
    }

    public w(String str) {
        this.f74985f = new b[0];
        this.f74987h = new Class[0];
        this.f74990k = new a();
        this.f74989j = v(str);
        this.f74988i = 0;
    }

    public w(String str, int i11) {
        this.f74985f = new b[0];
        this.f74987h = new Class[0];
        this.f74990k = new a();
        this.f74988i = w(i11);
        this.f74989j = v(str);
    }
}
