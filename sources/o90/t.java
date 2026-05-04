package o90;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.junit.jupiter.api.j2;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.MethodFilter;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class t<T> extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.n {

    /* renamed from: i, reason: collision with root package name */
    public final Class<T> f76691i;

    /* renamed from: j, reason: collision with root package name */
    public final Constructor<T> f76692j;

    /* renamed from: k, reason: collision with root package name */
    public final Set<h90.c> f76693k;

    /* renamed from: l, reason: collision with root package name */
    public int f76694l;

    /* renamed from: m, reason: collision with root package name */
    public h90.c[] f76695m;

    /* renamed from: n, reason: collision with root package name */
    public h90.c[] f76696n;

    /* renamed from: o, reason: collision with root package name */
    public Object[] f76697o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f76698p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f76699q;

    /* renamed from: r, reason: collision with root package name */
    public NormalizedString[] f76700r;

    /* renamed from: s, reason: collision with root package name */
    public Object[] f76701s;

    /* renamed from: t, reason: collision with root package name */
    public Map<h90.c, t<?>> f76702t;

    /* renamed from: u, reason: collision with root package name */
    public final g90.g f76703u;

    /* renamed from: v, reason: collision with root package name */
    public final MethodFilter f76704v;

    /* renamed from: w, reason: collision with root package name */
    public j90.e f76705w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f76706x;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends t {
        public a(Class cls, MethodFilter methodFilter) {
            super(cls, methodFilter);
        }

        @Override // o90.t
        public void G(r90.g gVar, h90.c cVar) {
            if (gVar == null) {
                return;
            }
            b(gVar).b(NormalizedString.valueOf(cVar.c()));
        }
    }

    @Deprecated
    public t(Class<T> cls) {
        this(cls, null, MethodFilter.ONLY_SETTERS);
    }

    public static String L(AnnotatedElement annotatedElement) {
        if (annotatedElement instanceof Method) {
            return "method: " + annotatedElement;
        }
        return "field '" + h90.a.H(annotatedElement) + "' (" + h90.a.M(annotatedElement).getName() + ')';
    }

    public void G(r90.g gVar, h90.c cVar) {
        if (gVar == null) {
            return;
        }
        if (cVar.i()) {
            c(gVar).b(Integer.valueOf(cVar.f()));
        } else {
            b(gVar).b(NormalizedString.valueOf(cVar.c()));
        }
    }

    public final boolean H(r90.g gVar, r90.g gVar2) {
        if (gVar2 == null) {
            return false;
        }
        if (gVar == null) {
            return true;
        }
        if (gVar.getClass() == gVar2.getClass()) {
            return false;
        }
        return (O(gVar, "execute").getReturnType() == O(gVar2, "execute").getReturnType() && O(gVar, "revert").getReturnType() == O(gVar2, "revert").getReturnType()) ? false : true;
    }

    public j90.i I() {
        return this.f78174b.clone();
    }

    public T J(String[] strArr, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i iVar) {
        Object[] w11 = super.w(strArr, iVar);
        if (w11 == null) {
            return null;
        }
        try {
            T newInstance = this.f76692j.newInstance(null);
            Y(newInstance, w11, iVar);
            if (this.f76702t != null) {
                d0(strArr, newInstance, iVar);
            }
            return newInstance;
        } catch (Throwable th2) {
            throw new DataProcessingException("Unable to instantiate class '" + this.f76691i.getName() + '\'', strArr, th2);
        }
    }

    public t<?> K(Annotation annotation, Class cls, h90.c cVar, g90.g gVar) {
        return new t<>(cls, gVar, this.f76704v);
    }

    public Class<T> M() {
        return this.f76691i;
    }

    public final j90.d N() {
        return this.f76705w;
    }

    public final Method O(r90.g gVar, String str) {
        Method method = null;
        for (Method method2 : gVar.getClass().getMethods()) {
            if (method2.getName().equals(str) && !method2.isSynthetic() && !method2.isBridge() && (method2.getModifiers() & 1) == 1 && method2.getParameterTypes().length == 1 && method2.getReturnType() != Void.TYPE) {
                if (method != null) {
                    throw new DataProcessingException("Unable to convert values for class '" + this.f76691i + "'. Multiple '" + str + "' methods defined in conversion " + gVar.getClass() + '.');
                }
                method = method2;
            }
        }
        if (method != null) {
            return method;
        }
        throw new DataProcessingException("Unable to convert values for class '" + this.f76691i + "'. Cannot find method '" + str + "' in conversion " + gVar.getClass() + '.');
    }

    public Map<h90.c, t<?>> P() {
        if (this.f76702t == null) {
            this.f76702t = new LinkedHashMap();
        }
        return this.f76702t;
    }

    public final void Q() {
        int size = this.f76693k.size();
        NormalizedString[] normalizedStringArr = new NormalizedString[size];
        h90.c[] cVarArr = (h90.c[]) this.f76693k.toArray(new h90.c[0]);
        for (int i11 = 0; i11 < size; i11++) {
            normalizedStringArr[i11] = cVarArr[i11].c();
        }
        if (NormalizedString.identifyLiterals(normalizedStringArr)) {
            for (int i12 = 0; i12 < size; i12++) {
                cVarArr[i12].n(normalizedStringArr[i12]);
            }
        }
    }

    public final void R() {
        T(null);
    }

    public final void S(String[] strArr) {
        T(NormalizedString.toArray(strArr));
    }

    public final void T(NormalizedString[] normalizedStringArr) {
        NormalizedString[] normalizedStringArr2;
        if (this.f76698p) {
            return;
        }
        this.f76698p = true;
        Map<Field, i90.b> t11 = h90.a.t(this.f76691i);
        for (String str : this.f76705w.c()) {
            for (Map.Entry<Field, i90.b> entry : t11.entrySet()) {
                Field key = entry.getKey();
                if (key.getName().equals(str) && ((g90.j) h90.a.p(key, g90.j.class)) == null) {
                    normalizedStringArr2 = normalizedStringArr;
                    e0(key.getType(), key, key.getName(), entry.getValue(), normalizedStringArr2, null);
                } else {
                    normalizedStringArr2 = normalizedStringArr;
                }
                normalizedStringArr = normalizedStringArr2;
            }
        }
        NormalizedString[] normalizedStringArr3 = normalizedStringArr;
        for (Map.Entry<Field, i90.b> entry2 : t11.entrySet()) {
            Field key2 = entry2.getKey();
            b0(key2, key2.getName(), entry2.getValue(), normalizedStringArr3);
        }
        for (Method method : h90.a.u(this.f76691i, this.f76704v)) {
            b0(method, method.getName(), null, normalizedStringArr3);
        }
        this.f76695m = null;
        this.f76694l = -1;
        Q();
        j0();
    }

    public final void U() {
        if (Z() >= this.f76693k.size()) {
            this.f76696n = null;
            this.f76697o = null;
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f76693k);
        linkedHashSet.removeAll(Arrays.asList(this.f76695m));
        int i11 = 0;
        h90.c[] cVarArr = (h90.c[]) linkedHashSet.toArray(new h90.c[0]);
        this.f76696n = cVarArr;
        String[] strArr = new String[cVarArr.length];
        a aVar = new a(M(), this.f76704v);
        while (true) {
            h90.c[] cVarArr2 = this.f76696n;
            if (i11 >= cVarArr2.length) {
                aVar.B(strArr, null);
                this.f76697o = aVar.w(new String[this.f76696n.length], null);
                return;
            } else {
                h90.c cVar = cVarArr2[i11];
                if (c0(cVar)) {
                    aVar.i0(cVar.g(), cVar);
                }
                strArr[i11] = NormalizedString.valueOf(cVar.c());
                i11++;
            }
        }
    }

    public boolean V() {
        return this.f76699q;
    }

    public final void W(org.junit.jupiter.params.shadow.com.univocity.parsers.common.i iVar, Object[] objArr, NormalizedString[] normalizedStringArr, int[] iArr, boolean z11) {
        if (normalizedStringArr == null) {
            normalizedStringArr = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.f78086b;
        }
        int length = normalizedStringArr.length > objArr.length ? normalizedStringArr.length : objArr.length;
        Iterator<h90.c> it = this.f76693k.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            int f11 = it.next().f();
            if (length <= f11) {
                z12 = true;
                length = f11;
            }
        }
        if (z12) {
            length++;
        }
        h90.c[] cVarArr = new h90.c[length];
        TreeSet treeSet = new TreeSet();
        for (h90.c cVar : this.f76693k) {
            if (cVar.h()) {
                int[] i11 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.i(normalizedStringArr, cVar.c());
                if (i11.length == 0) {
                    treeSet.add(cVar.c());
                } else {
                    for (int i12 : i11) {
                        cVarArr[i12] = cVar;
                    }
                }
            } else if (cVar.f() < length) {
                cVarArr[cVar.f()] = cVar;
            }
        }
        if (iVar != null && !treeSet.isEmpty()) {
            if (normalizedStringArr.length == 0) {
                throw new DataProcessingException("Could not find fields " + treeSet.toString() + " in input. Please enable header extraction in the parser settings in order to match field names.");
            }
            if (this.f76699q) {
                DataProcessingException dataProcessingException = new DataProcessingException("Could not find fields " + treeSet.toString() + "' in input. Names found: {headers}");
                dataProcessingException.setValue("headers", Arrays.toString(normalizedStringArr));
                throw dataProcessingException;
            }
        }
        if (iArr != null) {
            for (int i13 = 0; i13 < length; i13++) {
                int i14 = 0;
                while (true) {
                    if (i14 >= iArr.length) {
                        cVarArr[i13] = null;
                        break;
                    } else if (iArr[i14] == i13) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            if (z11) {
                h90.c[] cVarArr2 = new h90.c[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    for (int i16 = 0; i16 < length; i16++) {
                        int i17 = iArr[i15];
                        if (i17 != -1) {
                            cVarArr2[i15] = cVarArr[i17];
                        }
                    }
                }
                cVarArr = cVarArr2;
            }
        }
        this.f76695m = cVarArr;
        U();
    }

    public final void X(T t11, Object[] objArr, NormalizedString[] normalizedStringArr, int[] iArr, boolean z11) {
        t<T> tVar;
        Object[] objArr2;
        if (objArr.length > this.f76694l) {
            tVar = this;
            objArr2 = objArr;
            tVar.W(null, objArr2, normalizedStringArr, iArr, z11);
        } else {
            tVar = this;
            objArr2 = objArr;
        }
        int length = objArr2.length;
        h90.c[] cVarArr = tVar.f76695m;
        int length2 = length < cVarArr.length ? objArr2.length : cVarArr.length;
        for (int i11 = 0; i11 < length2; i11++) {
            h90.c cVar = tVar.f76695m[i11];
            if (cVar != null) {
                try {
                    objArr2[i11] = cVar.j(t11);
                } catch (Throwable th2) {
                    if (!tVar.f76691i.isAssignableFrom(t11.getClass())) {
                        A(th2, new Object[]{t11}, -1);
                        throw E(th2, objArr2, i11);
                    }
                    if (!A(th2, objArr2, i11)) {
                        throw E(th2, objArr2, i11);
                    }
                }
            }
        }
    }

    public void Y(T t11, Object[] objArr, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i iVar) {
        t<T> tVar;
        Object[] objArr2;
        if (objArr.length > this.f76694l) {
            this.f76694l = objArr.length;
            tVar = this;
            objArr2 = objArr;
            tVar.W(iVar, objArr2, NormalizedString.toIdentifierGroupArray(iVar.a()), iVar.g(), iVar.c());
        } else {
            tVar = this;
            objArr2 = objArr;
        }
        int length = objArr2.length;
        h90.c[] cVarArr = tVar.f76695m;
        int length2 = length < cVarArr.length ? objArr2.length : cVarArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length2; i12++) {
            h90.c cVar = tVar.f76695m[i12];
            if (cVar != null) {
                cVar.p(t11, objArr2[i12]);
            }
        }
        if (tVar.f78174b != null && objArr2.length < tVar.f76695m.length) {
            while (true) {
                h90.c[] cVarArr2 = tVar.f76695m;
                if (length2 >= cVarArr2.length) {
                    break;
                }
                h90.c cVar2 = cVarArr2[length2];
                if (cVar2 != null) {
                    cVar2.p(t11, tVar.f78174b.a(length2, null, null));
                }
                length2++;
            }
        }
        if (tVar.f76696n == null) {
            return;
        }
        while (true) {
            h90.c[] cVarArr3 = tVar.f76696n;
            if (i11 >= cVarArr3.length) {
                return;
            }
            Object obj = tVar.f76697o[i11];
            if (obj != null) {
                cVarArr3[i11].p(t11, obj);
            }
            i11++;
        }
    }

    public final int Z() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            h90.c[] cVarArr = this.f76695m;
            if (i11 >= cVarArr.length) {
                return i12;
            }
            if (cVarArr[i11] != null) {
                i12++;
            }
            i11++;
        }
    }

    public final void a0(Map<Object, Integer> map, Map<Object, String> map2) {
        for (h90.c cVar : this.f76693k) {
            NormalizedString c11 = cVar.f() == -1 ? cVar.c() : NormalizedString.valueOf("Column #" + cVar.f());
            Integer num = map.get(c11);
            if (num == null) {
                num = 0;
            }
            map.put(c11, Integer.valueOf(num.intValue() + 1));
            String str = map2.get(c11);
            String name = cVar.g() instanceof Method ? ((Method) cVar.g()).getName() : ((Field) cVar.g()).getName();
            if (!this.f76705w.d().isEmpty()) {
                name = this.f76705w.d() + '.' + name;
            }
            if (str != null) {
                name = str + j2.O + name;
            }
            map2.put(c11, name);
        }
        Map<h90.c, t<?>> map3 = this.f76702t;
        if (map3 != null) {
            Iterator<t<?>> it = map3.values().iterator();
            while (it.hasNext()) {
                it.next().a0(map, map2);
            }
        }
    }

    public void b0(AnnotatedElement annotatedElement, String str, i90.b bVar, NormalizedString[] normalizedStringArr) {
        AnnotatedElement annotatedElement2;
        i90.b bVar2;
        NormalizedString[] normalizedStringArr2;
        h90.c cVar;
        if (((g90.l) h90.a.p(annotatedElement, g90.l.class)) != null) {
            cVar = new h90.c(this.f76691i, annotatedElement, bVar, this.f76703u, normalizedStringArr);
            bVar2 = bVar;
            normalizedStringArr2 = normalizedStringArr;
            annotatedElement2 = annotatedElement;
            if (c0(cVar)) {
                this.f76693k.add(cVar);
                i0(annotatedElement2, cVar);
            }
        } else {
            annotatedElement2 = annotatedElement;
            bVar2 = bVar;
            normalizedStringArr2 = normalizedStringArr;
            cVar = null;
        }
        h90.d descriptor = annotatedElement2 instanceof Method ? this.f76704v.toDescriptor(this.f76705w.d(), (Method) annotatedElement2) : null;
        if (this.f76705w.e(descriptor, str)) {
            if (cVar == null) {
                h90.c cVar2 = new h90.c(this.f76691i, annotatedElement2, bVar2, this.f76703u, normalizedStringArr2);
                this.f76705w.i(cVar2, str, descriptor);
                this.f76693k.add(cVar2);
                i0(annotatedElement2, cVar2);
            } else {
                this.f76705w.i(cVar, str, descriptor);
            }
        }
        g90.j jVar = (g90.j) h90.a.p(annotatedElement2, g90.j.class);
        if (jVar != null) {
            Class<?> cls = (Class) h90.b.b(annotatedElement2, jVar, "type", jVar.type());
            if (cls == Object.class) {
                cls = h90.a.M(annotatedElement2);
            }
            e0(cls, annotatedElement2, str, bVar2, normalizedStringArr2, jVar);
        }
    }

    public boolean c0(h90.c cVar) {
        return true;
    }

    public void d0(String[] strArr, Object obj, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i iVar) {
        for (Map.Entry<h90.c, t<?>> entry : this.f76702t.entrySet()) {
            Object J = entry.getValue().J(strArr, iVar);
            if (J != null) {
                entry.getKey().p(obj, J);
            }
        }
    }

    public final void e0(Class cls, AnnotatedElement annotatedElement, String str, i90.b bVar, NormalizedString[] normalizedStringArr, g90.j jVar) {
        Class cls2;
        g90.g gVar = (jVar == null || (cls2 = (Class) h90.b.b(annotatedElement, jVar, "headerTransformer", jVar.headerTransformer())) == g90.g.class) ? null : (g90.g) h90.a.Q(g90.g.class, cls2, (String[]) h90.b.b(annotatedElement, jVar, "args", jVar.args()));
        h90.c cVar = new h90.c(cls, annotatedElement, bVar, null, normalizedStringArr);
        t<?> K = K(jVar, cls, cVar, gVar);
        K.f78174b = this.f78174b != null ? I() : null;
        K.f76705w = new j90.e(str, this.f76705w);
        K.T(normalizedStringArr);
        P().put(cVar, K);
    }

    public final Object[] f0(T t11, NormalizedString[] normalizedStringArr, int[] iArr) {
        t<T> tVar;
        if (!this.f76706x) {
            this.f76706x = true;
            k0();
        }
        if (t11 == null) {
            return null;
        }
        if (this.f76701s == null) {
            if (normalizedStringArr != null) {
                this.f76701s = new Object[normalizedStringArr.length];
            } else {
                int i11 = 0;
                if (iArr != null) {
                    int length = iArr.length;
                    int i12 = 0;
                    while (i11 < length) {
                        int i13 = iArr[i11] + 1;
                        if (i13 > i12) {
                            i12 = i13;
                        }
                        i11++;
                    }
                    if (i12 < iArr.length) {
                        i12 = iArr.length;
                    }
                    this.f76701s = new Object[i12];
                } else {
                    HashSet hashSet = new HashSet();
                    int i14 = -1;
                    for (h90.c cVar : this.f76693k) {
                        if (i14 < cVar.f() + 1) {
                            i14 = cVar.f() + 1;
                        }
                        hashSet.add(Integer.valueOf(cVar.f()));
                    }
                    if (i14 < this.f76693k.size()) {
                        i14 = this.f76693k.size();
                    }
                    this.f76701s = new Object[i14];
                    if (this.f76700r == null) {
                        this.f76700r = new NormalizedString[i14];
                        Iterator<h90.c> it = this.f76693k.iterator();
                        while (i11 < i14) {
                            if (!hashSet.contains(Integer.valueOf(i11))) {
                                NormalizedString normalizedString = null;
                                while (it.hasNext() && (normalizedString = it.next().c()) == null) {
                                }
                                this.f76700r[i11] = normalizedString;
                            }
                            i11++;
                        }
                    }
                }
            }
        }
        Map<h90.c, t<?>> map = this.f76702t;
        if (map != null) {
            for (Map.Entry<h90.c, t<?>> entry : map.entrySet()) {
                Object j11 = entry.getKey().j(t11);
                if (j11 != null) {
                    t<?> value = entry.getValue();
                    value.f76701s = this.f76701s;
                    value.f0(j11, normalizedStringArr, iArr);
                }
            }
        }
        NormalizedString[] identifierGroupArray = NormalizedString.toIdentifierGroupArray(normalizedStringArr);
        NormalizedString[] normalizedStringArr2 = this.f76700r;
        NormalizedString[] normalizedStringArr3 = normalizedStringArr2 != null ? normalizedStringArr2 : identifierGroupArray;
        try {
            tVar = this;
            try {
                tVar.X(t11, this.f76701s, normalizedStringArr3, iArr, false);
                if (super.D(true, tVar.f76701s, normalizedStringArr3, iArr)) {
                    return tVar.f76701s;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                DataProcessingException dataProcessingException = th;
                if (!(dataProcessingException instanceof DataProcessingException)) {
                    if (A(dataProcessingException, tVar.f76701s, -1)) {
                        return null;
                    }
                    throw E(dataProcessingException, tVar.f76701s, -1);
                }
                DataProcessingException dataProcessingException2 = dataProcessingException;
                if (dataProcessingException2.isHandled()) {
                    return null;
                }
                throw dataProcessingException2;
            }
        } catch (Throwable th3) {
            th = th3;
            tVar = this;
        }
    }

    public void g0(j90.d dVar) {
        this.f76705w = dVar == null ? new j90.e() : (j90.e) dVar.m6306clone();
    }

    public void h0(boolean z11) {
        this.f76699q = z11;
    }

    public final void i0(AnnotatedElement annotatedElement, h90.c cVar) {
        List<Annotation> m11 = h90.a.m(annotatedElement, g90.l.class.getPackage());
        r90.g gVar = null;
        if (!m11.isEmpty()) {
            Class<?> M = h90.a.M(annotatedElement);
            g90.l lVar = annotatedElement == null ? null : (g90.l) h90.a.p(annotatedElement, g90.l.class);
            String I = h90.a.I(annotatedElement, lVar);
            String K = h90.a.K(annotatedElement, lVar);
            for (Annotation annotation : m11) {
                try {
                    r90.g A = h90.a.A(M, annotatedElement, annotation, I, K);
                    if (A != null) {
                        G(A, cVar);
                        gVar = A;
                    }
                } catch (Throwable th2) {
                    throw new DataProcessingException("Error processing annotation '" + (annotation.annotationType().getSimpleName() + "' of field " + cVar) + ". " + th2.getMessage(), th2);
                }
            }
            if (M.isEnum()) {
                Iterator<Annotation> it = m11.iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    if (it.next().annotationType() == g90.d.class) {
                        z11 = true;
                    }
                }
                if (!z11) {
                    gVar = h90.a.g(M, I, K);
                    G(gVar, cVar);
                }
            }
        }
        g90.l lVar2 = (g90.l) h90.a.p(annotatedElement, g90.l.class);
        if (lVar2 == null || ((Boolean) h90.b.b(annotatedElement, lVar2, "applyDefaultConversion", Boolean.valueOf(lVar2.applyDefaultConversion()))).booleanValue()) {
            r90.g D = h90.a.D(annotatedElement);
            if (H(gVar, D)) {
                G(D, cVar);
            }
        }
    }

    public void j0() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashSet<h90.c> hashSet = new HashSet();
        HashSet<h90.c> hashSet2 = new HashSet();
        for (h90.c cVar : this.f76693k) {
            NormalizedString c11 = cVar.c();
            int f11 = cVar.f();
            if (f11 != -1) {
                if (hashMap2.containsKey(Integer.valueOf(f11))) {
                    hashSet2.add(cVar);
                    hashSet2.add(hashMap2.get(Integer.valueOf(f11)));
                } else {
                    hashMap2.put(Integer.valueOf(f11), cVar);
                }
            } else if (hashMap.containsKey(c11)) {
                hashSet.add(cVar);
                hashSet.add(hashMap.get(c11));
            } else {
                hashMap.put(c11, cVar);
            }
        }
        if (hashSet2.size() > 0 || hashSet.size() > 0) {
            StringBuilder sb2 = new StringBuilder("Conflicting field mappings defined in annotated class: " + M().getName());
            for (h90.c cVar2 : hashSet2) {
                sb2.append("\n\tIndex: '");
                sb2.append(cVar2.f());
                sb2.append("' of  ");
                sb2.append(L(cVar2.g()));
            }
            for (h90.c cVar3 : hashSet) {
                sb2.append("\n\tName: '");
                sb2.append((CharSequence) cVar3.c());
                sb2.append("' of ");
                sb2.append(L(cVar3.g()));
            }
            throw new DataProcessingException(sb2.toString());
        }
    }

    public final void k0() {
        TreeMap treeMap = new TreeMap();
        HashMap hashMap = new HashMap();
        a0(treeMap, hashMap);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<Object, Integer> entry : treeMap.entrySet()) {
            if (entry.getValue().intValue() > 1) {
                String str = hashMap.get(entry.getKey());
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append('\t');
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(str);
            }
        }
        if (sb2.length() <= 0) {
            return;
        }
        throw new DataProcessingException("Cannot write object as multiple attributes/methods have been mapped to the same output column:\n" + sb2.toString());
    }

    public t(Class<T> cls, MethodFilter methodFilter) {
        this(cls, null, methodFilter);
    }

    public t(Class<T> cls, g90.g gVar, MethodFilter methodFilter) {
        this.f76693k = new LinkedHashSet();
        this.f76694l = -1;
        int i11 = 0;
        this.f76698p = false;
        this.f76699q = false;
        Constructor<T> constructor = null;
        this.f76700r = null;
        this.f76702t = null;
        this.f76705w = new j90.e();
        this.f76706x = false;
        this.f76691i = cls;
        this.f76703u = gVar;
        this.f76704v = methodFilter;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Constructor<?> constructor2 = declaredConstructors[i11];
            if (constructor2.getParameterTypes().length == 0) {
                constructor = (Constructor<T>) constructor2;
                break;
            }
            i11++;
        }
        if (constructor != null && !constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        this.f76692j = constructor;
    }
}
