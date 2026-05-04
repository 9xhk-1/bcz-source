package l10;

import a00.a0;
import a00.i0;
import a00.r0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import m80.k;
import org.junit.jupiter.api.j2;
import pn.j;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnnotationConstructorCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCallerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n11165#2:182\n11500#2,3:183\n37#3,2:186\n18#3:195\n1557#4:188\n1628#4,3:189\n1734#4,3:192\n*S KotlinDebug\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCallerKt\n*L\n75#1:182\n75#1:183,3\n75#1:186,2\n173#1:195\n102#1:188\n102#1:189,3\n106#1:192,3\n*E\n"})
/* loaded from: classes8.dex */
public final class e {
    @k
    public static final <T> T g(@k Class<T> annotationClass, @k Map<String, ? extends Object> values, @k List<Method> methods) {
        g0.p(annotationClass, "annotationClass");
        g0.p(values, "values");
        g0.p(methods, "methods");
        c0 c11 = e0.c(new a(values));
        T t11 = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new c(annotationClass, values, e0.c(new b(annotationClass, values)), c11, methods));
        g0.n(t11, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t11;
    }

    public static /* synthetic */ Object h(Class cls, Map map, List list, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            Set keySet = map.keySet();
            ArrayList arrayList = new ArrayList(i0.d0(keySet, 10));
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return g(cls, map, list);
    }

    public static final <T> boolean i(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) {
        boolean g11;
        boolean z11;
        h10.d a11;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (g0.g((annotation == null || (a11 = w00.b.a(annotation)) == null) ? null : w00.b.d(a11), cls)) {
            List<Method> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (Method method : list2) {
                    Object obj2 = map.get(method.getName());
                    Object invoke = method.invoke(obj, null);
                    if (obj2 instanceof boolean[]) {
                        g0.n(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        g11 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                    } else if (obj2 instanceof char[]) {
                        g0.n(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                        g11 = Arrays.equals((char[]) obj2, (char[]) invoke);
                    } else if (obj2 instanceof byte[]) {
                        g0.n(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        g11 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                    } else if (obj2 instanceof short[]) {
                        g0.n(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        g11 = Arrays.equals((short[]) obj2, (short[]) invoke);
                    } else if (obj2 instanceof int[]) {
                        g0.n(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                        g11 = Arrays.equals((int[]) obj2, (int[]) invoke);
                    } else if (obj2 instanceof float[]) {
                        g0.n(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        g11 = Arrays.equals((float[]) obj2, (float[]) invoke);
                    } else if (obj2 instanceof long[]) {
                        g0.n(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                        g11 = Arrays.equals((long[]) obj2, (long[]) invoke);
                    } else if (obj2 instanceof double[]) {
                        g0.n(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        g11 = Arrays.equals((double[]) obj2, (double[]) invoke);
                    } else if (obj2 instanceof Object[]) {
                        g0.n(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        g11 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                    } else {
                        g11 = g0.g(obj2, invoke);
                    }
                    if (!g11) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public static final int j(Map map) {
        int i11 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            i11 += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return i11;
    }

    public static final int k(c0<Integer> c0Var) {
        return c0Var.getValue().intValue();
    }

    public static final String l(Class cls, Map map) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        sb2.append(cls.getCanonicalName());
        r0.p3(map.entrySet(), sb2, j2.O, j.f81006c, j.f81007d, 0, null, d.f69128a, 48, null);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static final CharSequence m(Map.Entry entry) {
        String obj;
        g0.p(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            obj = Arrays.toString((boolean[]) value);
            g0.o(obj, "toString(...)");
        } else if (value instanceof char[]) {
            obj = Arrays.toString((char[]) value);
            g0.o(obj, "toString(...)");
        } else if (value instanceof byte[]) {
            obj = Arrays.toString((byte[]) value);
            g0.o(obj, "toString(...)");
        } else if (value instanceof short[]) {
            obj = Arrays.toString((short[]) value);
            g0.o(obj, "toString(...)");
        } else if (value instanceof int[]) {
            obj = Arrays.toString((int[]) value);
            g0.o(obj, "toString(...)");
        } else if (value instanceof float[]) {
            obj = Arrays.toString((float[]) value);
            g0.o(obj, "toString(...)");
        } else if (value instanceof long[]) {
            obj = Arrays.toString((long[]) value);
            g0.o(obj, "toString(...)");
        } else if (value instanceof double[]) {
            obj = Arrays.toString((double[]) value);
            g0.o(obj, "toString(...)");
        } else if (value instanceof Object[]) {
            obj = Arrays.toString((Object[]) value);
            g0.o(obj, "toString(...)");
        } else {
            obj = value.toString();
        }
        return str + '=' + obj;
    }

    public static final String n(c0<String> c0Var) {
        return c0Var.getValue();
    }

    public static final Object o(Class cls, Map map, c0 c0Var, c0 c0Var2, List list, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(k(c0Var2));
                }
            } else if (name.equals("toString")) {
                return n(c0Var);
            }
        }
        if (g0.g(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(i(cls, list, map, a0.At(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Method is not supported: ");
        sb2.append(method);
        sb2.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb2.append(a0.dz(objArr));
        sb2.append(')');
        throw new KotlinReflectionInternalError(sb2.toString());
    }

    public static final Void p(int i11, String str, Class<?> cls) {
        String x11;
        h10.d d11 = g0.g(cls, Class.class) ? o0.d(h10.d.class) : (cls.isArray() && g0.g(cls.getComponentType(), Class.class)) ? o0.d(h10.d[].class) : w00.b.i(cls);
        if (g0.g(d11.x(), o0.d(Object[].class).x())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(d11.x());
            sb2.append(u30.u0.f91709e);
            Class<?> componentType = w00.b.d(d11).getComponentType();
            g0.o(componentType, "getComponentType(...)");
            sb2.append(w00.b.i(componentType).x());
            sb2.append(u30.u0.f91710f);
            x11 = sb2.toString();
        } else {
            x11 = d11.x();
        }
        throw new IllegalArgumentException("Argument #" + i11 + ' ' + str + " is not of the required type " + x11);
    }

    public static final Object q(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof h10.d) {
            obj = w00.b.d((h10.d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof h10.d[]) {
                g0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                h10.d[] dVarArr = (h10.d[]) obj;
                ArrayList arrayList = new ArrayList(dVarArr.length);
                for (h10.d dVar : dVarArr) {
                    arrayList.add(w00.b.d(dVar));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
