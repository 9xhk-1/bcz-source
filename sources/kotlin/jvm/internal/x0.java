package kotlin.jvm.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import y00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class x0 {
    public static int A(Object obj) {
        if (obj instanceof c0) {
            return ((c0) obj).getArity();
        }
        if (obj instanceof x00.a) {
            return 0;
        }
        if (obj instanceof x00.l) {
            return 1;
        }
        if (obj instanceof x00.p) {
            return 2;
        }
        if (obj instanceof x00.q) {
            return 3;
        }
        if (obj instanceof x00.r) {
            return 4;
        }
        if (obj instanceof x00.s) {
            return 5;
        }
        if (obj instanceof x00.t) {
            return 6;
        }
        if (obj instanceof x00.u) {
            return 7;
        }
        if (obj instanceof x00.v) {
            return 8;
        }
        if (obj instanceof x00.w) {
            return 9;
        }
        if (obj instanceof x00.b) {
            return 10;
        }
        if (obj instanceof x00.c) {
            return 11;
        }
        if (obj instanceof x00.d) {
            return 12;
        }
        if (obj instanceof x00.e) {
            return 13;
        }
        if (obj instanceof x00.f) {
            return 14;
        }
        if (obj instanceof x00.g) {
            return 15;
        }
        if (obj instanceof x00.h) {
            return 16;
        }
        if (obj instanceof x00.i) {
            return 17;
        }
        if (obj instanceof x00.j) {
            return 18;
        }
        if (obj instanceof x00.k) {
            return 19;
        }
        if (obj instanceof x00.m) {
            return 20;
        }
        if (obj instanceof x00.n) {
            return 21;
        }
        return obj instanceof x00.o ? 22 : -1;
    }

    public static boolean B(Object obj, int i11) {
        return (obj instanceof yz.w) && A(obj) == i11;
    }

    public static boolean C(Object obj) {
        if (obj instanceof Collection) {
            return !(obj instanceof y00.a) || (obj instanceof y00.b);
        }
        return false;
    }

    public static boolean D(Object obj) {
        if (obj instanceof Iterable) {
            return !(obj instanceof y00.a) || (obj instanceof y00.c);
        }
        return false;
    }

    public static boolean E(Object obj) {
        if (obj instanceof Iterator) {
            return !(obj instanceof y00.a) || (obj instanceof y00.d);
        }
        return false;
    }

    public static boolean F(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof y00.a) || (obj instanceof y00.e);
        }
        return false;
    }

    public static boolean G(Object obj) {
        if (obj instanceof ListIterator) {
            return !(obj instanceof y00.a) || (obj instanceof y00.f);
        }
        return false;
    }

    public static boolean H(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof y00.a) || (obj instanceof y00.g);
        }
        return false;
    }

    public static boolean I(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof y00.a) || (obj instanceof g.a);
        }
        return false;
    }

    public static boolean J(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof y00.a) || (obj instanceof y00.h);
        }
        return false;
    }

    public static <T extends Throwable> T K(T t11) {
        return (T) g0.B(t11, x0.class.getName());
    }

    public static ClassCastException L(ClassCastException classCastException) {
        throw ((ClassCastException) K(classCastException));
    }

    public static void M(Object obj, String str) {
        N((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void N(String str) {
        throw L(new ClassCastException(str));
    }

    public static Collection a(Object obj) {
        if ((obj instanceof y00.a) && !(obj instanceof y00.b)) {
            M(obj, "kotlin.collections.MutableCollection");
        }
        return s(obj);
    }

    public static Collection b(Object obj, String str) {
        if ((obj instanceof y00.a) && !(obj instanceof y00.b)) {
            N(str);
        }
        return s(obj);
    }

    public static Iterable c(Object obj) {
        if ((obj instanceof y00.a) && !(obj instanceof y00.c)) {
            M(obj, "kotlin.collections.MutableIterable");
        }
        return t(obj);
    }

    public static Iterable d(Object obj, String str) {
        if ((obj instanceof y00.a) && !(obj instanceof y00.c)) {
            N(str);
        }
        return t(obj);
    }

    public static Iterator e(Object obj) {
        if ((obj instanceof y00.a) && !(obj instanceof y00.d)) {
            M(obj, "kotlin.collections.MutableIterator");
        }
        return u(obj);
    }

    public static Iterator f(Object obj, String str) {
        if ((obj instanceof y00.a) && !(obj instanceof y00.d)) {
            N(str);
        }
        return u(obj);
    }

    public static List g(Object obj) {
        if ((obj instanceof y00.a) && !(obj instanceof y00.e)) {
            M(obj, "kotlin.collections.MutableList");
        }
        return v(obj);
    }

    public static List h(Object obj, String str) {
        if ((obj instanceof y00.a) && !(obj instanceof y00.e)) {
            N(str);
        }
        return v(obj);
    }

    public static ListIterator i(Object obj) {
        if ((obj instanceof y00.a) && !(obj instanceof y00.f)) {
            M(obj, "kotlin.collections.MutableListIterator");
        }
        return w(obj);
    }

    public static ListIterator j(Object obj, String str) {
        if ((obj instanceof y00.a) && !(obj instanceof y00.f)) {
            N(str);
        }
        return w(obj);
    }

    public static Map k(Object obj) {
        if ((obj instanceof y00.a) && !(obj instanceof y00.g)) {
            M(obj, "kotlin.collections.MutableMap");
        }
        return x(obj);
    }

    public static Map l(Object obj, String str) {
        if ((obj instanceof y00.a) && !(obj instanceof y00.g)) {
            N(str);
        }
        return x(obj);
    }

    public static Map.Entry m(Object obj) {
        if ((obj instanceof y00.a) && !(obj instanceof g.a)) {
            M(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return y(obj);
    }

    public static Map.Entry n(Object obj, String str) {
        if ((obj instanceof y00.a) && !(obj instanceof g.a)) {
            N(str);
        }
        return y(obj);
    }

    public static Set o(Object obj) {
        if ((obj instanceof y00.a) && !(obj instanceof y00.h)) {
            M(obj, "kotlin.collections.MutableSet");
        }
        return z(obj);
    }

    public static Set p(Object obj, String str) {
        if ((obj instanceof y00.a) && !(obj instanceof y00.h)) {
            N(str);
        }
        return z(obj);
    }

    public static Object q(Object obj, int i11) {
        if (obj != null && !B(obj, i11)) {
            M(obj, "kotlin.jvm.functions.Function" + i11);
        }
        return obj;
    }

    public static Object r(Object obj, int i11, String str) {
        if (obj != null && !B(obj, i11)) {
            N(str);
        }
        return obj;
    }

    public static Collection s(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e11) {
            throw L(e11);
        }
    }

    public static Iterable t(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e11) {
            throw L(e11);
        }
    }

    public static Iterator u(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e11) {
            throw L(e11);
        }
    }

    public static List v(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e11) {
            throw L(e11);
        }
    }

    public static ListIterator w(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e11) {
            throw L(e11);
        }
    }

    public static Map x(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e11) {
            throw L(e11);
        }
    }

    public static Map.Entry y(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e11) {
            throw L(e11);
        }
    }

    public static Set z(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e11) {
            throw L(e11);
        }
    }
}
