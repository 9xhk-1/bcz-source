package j50;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.time.Instant;
import kotlin.uuid.Uuid;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,217:1\n211#1,6:254\n211#1,6:260\n211#1,6:266\n211#1,6:272\n211#1,6:278\n211#1,6:284\n211#1,6:290\n1#2:218\n3170#3,11:219\n1310#3,2:230\n3170#3,11:232\n3170#3,11:243\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n*L\n193#1:254,6\n197#1:260,6\n198#1:266,6\n199#1:272,6\n200#1:278,6\n203#1:284,6\n206#1:290,6\n73#1:219,11\n81#1:230,2\n151#1:232,11\n156#1:243,11\n*E\n"})
/* loaded from: classes8.dex */
public final class f2 {
    public static final Object a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @m80.l
    public static final <T> f50.i<T> b(@m80.k h10.d<T> dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        return c(dVar, new f50.i[0]);
    }

    @m80.l
    public static final <T> f50.i<T> c(@m80.k h10.d<T> dVar, @m80.k f50.i<Object>... args) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        kotlin.jvm.internal.g0.p(args, "args");
        return d(w00.b.d(dVar), (f50.i[]) Arrays.copyOf(args, args.length));
    }

    @m80.l
    public static final <T> f50.i<T> d(@m80.k Class<T> cls, @m80.k f50.i<Object>... args) {
        kotlin.jvm.internal.g0.p(cls, "<this>");
        kotlin.jvm.internal.g0.p(args, "args");
        if (cls.isEnum() && o(cls)) {
            return e(cls);
        }
        f50.i<T> m11 = m(cls, (f50.i[]) Arrays.copyOf(args, args.length));
        if (m11 != null) {
            return m11;
        }
        f50.i<T> h11 = h(cls);
        if (h11 != null) {
            return h11;
        }
        f50.i<T> f11 = f(cls, (f50.i[]) Arrays.copyOf(args, args.length));
        if (f11 != null) {
            return f11;
        }
        if (p(cls)) {
            return new f50.o(w00.b.i(cls));
        }
        return null;
    }

    public static final <T> f50.i<T> e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.g0.o(canonicalName, "getCanonicalName(...)");
        kotlin.jvm.internal.g0.n(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new k0(canonicalName, (Enum[]) enumConstants);
    }

    public static final <T> f50.i<T> f(Class<T> cls, f50.i<Object>... iVarArr) {
        Field field;
        f50.i<T> l11;
        Object g11 = g(cls);
        if (g11 != null && (l11 = l(g11, (f50.i[]) Arrays.copyOf(iVarArr, iVarArr.length))) != null) {
            return l11;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            kotlin.jvm.internal.g0.o(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i11 = 0;
            Class<?> cls2 = null;
            boolean z11 = false;
            while (true) {
                if (i11 < length) {
                    Class<?> cls3 = declaredClasses[i11];
                    if (kotlin.jvm.internal.g0.g(cls3.getSimpleName(), "$serializer")) {
                        if (z11) {
                            break;
                        }
                        z11 = true;
                        cls2 = cls3;
                    }
                    i11++;
                } else if (!z11) {
                }
            }
            cls2 = null;
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof f50.i) {
                return (f50.i) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    public static final <T> Object g(Class<T> cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        kotlin.jvm.internal.g0.o(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i11];
            if (cls2.getAnnotation(r1.class) != null) {
                break;
            }
            i11++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        kotlin.jvm.internal.g0.o(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009d, code lost:
    
        if (r4 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0056, code lost:
    
        if (r5 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> f50.i<T> h(java.lang.Class<T> r11) {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto Lae
            java.lang.String r2 = "java."
            r3 = 0
            r4 = 2
            boolean r2 = u30.f0.J2(r0, r2, r3, r4, r1)
            if (r2 != 0) goto Lae
            java.lang.String r2 = "kotlin."
            boolean r0 = u30.f0.J2(r0, r2, r3, r4, r1)
            if (r0 == 0) goto L1b
            goto Lae
        L1b:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r2 = "getDeclaredFields(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            int r2 = r0.length
            r6 = r1
            r4 = r3
            r5 = r4
        L28:
            r7 = 1
            if (r4 >= r2) goto L56
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.g0.g(r9, r10)
            if (r9 == 0) goto L53
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.g0.g(r9, r11)
            if (r9 == 0) goto L53
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L53
            if (r5 == 0) goto L51
        L4f:
            r6 = r1
            goto L59
        L51:
            r5 = r7
            r6 = r8
        L53:
            int r4 = r4 + 1
            goto L28
        L56:
            if (r5 != 0) goto L59
            goto L4f
        L59:
            if (r6 != 0) goto L5c
            return r1
        L5c:
            java.lang.Object r0 = r6.get(r1)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r2 = "getMethods(...)"
            kotlin.jvm.internal.g0.o(r11, r2)
            int r2 = r11.length
            r5 = r1
            r4 = r3
        L6c:
            if (r3 >= r2) goto L9d
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r9)
            if (r8 == 0) goto L9a
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r9 = "getParameterTypes(...)"
            kotlin.jvm.internal.g0.o(r8, r9)
            int r8 = r8.length
            if (r8 != 0) goto L9a
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<f50.i> r9 = f50.i.class
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r9)
            if (r8 == 0) goto L9a
            if (r4 == 0) goto L98
        L96:
            r5 = r1
            goto La0
        L98:
            r5 = r6
            r4 = r7
        L9a:
            int r3 = r3 + 1
            goto L6c
        L9d:
            if (r4 != 0) goto La0
            goto L96
        La0:
            if (r5 != 0) goto La3
            return r1
        La3:
            java.lang.Object r11 = r5.invoke(r0, r1)
            boolean r0 = r11 instanceof f50.i
            if (r0 == 0) goto Lae
            f50.i r11 = (f50.i) r11
            return r11
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.f2.h(java.lang.Class):f50.i");
    }

    public static final <T> T i(@m80.k T[] tArr, int i11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return tArr[i11];
    }

    public static final boolean j(@m80.k boolean[] zArr, int i11) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return zArr[i11];
    }

    @m80.k
    public static final Map<h10.d<?>, f50.i<?>> k() {
        Map g11 = a00.k1.g();
        g11.put(kotlin.jvm.internal.o0.d(String.class), g50.a.F(kotlin.jvm.internal.w0.f67050a));
        g11.put(kotlin.jvm.internal.o0.d(Character.TYPE), g50.a.z(kotlin.jvm.internal.q.f67018a));
        g11.put(kotlin.jvm.internal.o0.d(char[].class), g50.a.e());
        g11.put(kotlin.jvm.internal.o0.d(Double.TYPE), g50.a.A(kotlin.jvm.internal.w.f67042a));
        g11.put(kotlin.jvm.internal.o0.d(double[].class), g50.a.f());
        g11.put(kotlin.jvm.internal.o0.d(Float.TYPE), g50.a.B(kotlin.jvm.internal.z.f67060a));
        g11.put(kotlin.jvm.internal.o0.d(float[].class), g50.a.g());
        g11.put(kotlin.jvm.internal.o0.d(Long.TYPE), g50.a.D(kotlin.jvm.internal.j0.f66993a));
        g11.put(kotlin.jvm.internal.o0.d(long[].class), g50.a.j());
        g11.put(kotlin.jvm.internal.o0.d(yz.w1.class), g50.a.L(yz.w1.f100453b));
        g11.put(kotlin.jvm.internal.o0.d(Integer.TYPE), g50.a.C(kotlin.jvm.internal.e0.f66981a));
        g11.put(kotlin.jvm.internal.o0.d(int[].class), g50.a.h());
        g11.put(kotlin.jvm.internal.o0.d(yz.s1.class), g50.a.K(yz.s1.f100444b));
        g11.put(kotlin.jvm.internal.o0.d(Short.TYPE), g50.a.E(kotlin.jvm.internal.s0.f67030a));
        g11.put(kotlin.jvm.internal.o0.d(short[].class), g50.a.p());
        g11.put(kotlin.jvm.internal.o0.d(yz.c2.class), g50.a.M(yz.c2.f100410b));
        g11.put(kotlin.jvm.internal.o0.d(Byte.TYPE), g50.a.y(kotlin.jvm.internal.o.f67008a));
        g11.put(kotlin.jvm.internal.o0.d(byte[].class), g50.a.d());
        g11.put(kotlin.jvm.internal.o0.d(yz.o1.class), g50.a.J(yz.o1.f100435b));
        g11.put(kotlin.jvm.internal.o0.d(Boolean.TYPE), g50.a.x(kotlin.jvm.internal.l.f67001a));
        g11.put(kotlin.jvm.internal.o0.d(boolean[].class), g50.a.c());
        g11.put(kotlin.jvm.internal.o0.d(yz.g2.class), g50.a.N(yz.g2.f100423a));
        g11.put(kotlin.jvm.internal.o0.d(Void.class), g50.a.m());
        try {
            g11.put(kotlin.jvm.internal.o0.d(kotlin.time.e.class), g50.a.G(kotlin.time.e.f67757b));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            g11.put(kotlin.jvm.internal.o0.d(yz.x1.class), g50.a.t());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            g11.put(kotlin.jvm.internal.o0.d(yz.t1.class), g50.a.s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            g11.put(kotlin.jvm.internal.o0.d(yz.d2.class), g50.a.u());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            g11.put(kotlin.jvm.internal.o0.d(yz.p1.class), g50.a.r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            g11.put(kotlin.jvm.internal.o0.d(Uuid.class), g50.a.I(Uuid.Companion));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            g11.put(kotlin.jvm.internal.o0.d(Instant.class), g50.a.H(Instant.Companion));
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        return a00.k1.d(g11);
    }

    public static final <T> f50.i<T> l(Object obj, f50.i<Object>... iVarArr) {
        Class[] clsArr;
        try {
            if (iVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = iVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i11 = 0; i11 < length; i11++) {
                    clsArr2[i11] = f50.i.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(iVarArr, iVarArr.length));
            if (invoke instanceof f50.i) {
                return (f50.i) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause == null) {
                throw e11;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e11.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final <T> f50.i<T> m(Class<?> cls, f50.i<Object>... iVarArr) {
        Object a11 = a(cls, "Companion");
        if (a11 == null) {
            return null;
        }
        return l(a11, (f50.i[]) Arrays.copyOf(iVarArr, iVarArr.length));
    }

    public static final <T> boolean n(@m80.k h10.d<T> dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        return w00.b.d(dVar).isInterface();
    }

    public static final <T> boolean o(Class<T> cls) {
        return cls.getAnnotation(f50.a0.class) == null && cls.getAnnotation(f50.l.class) == null;
    }

    public static final <T> boolean p(Class<T> cls) {
        if (cls.getAnnotation(f50.l.class) != null) {
            return true;
        }
        f50.a0 a0Var = (f50.a0) cls.getAnnotation(f50.a0.class);
        return a0Var != null && kotlin.jvm.internal.g0.g(kotlin.jvm.internal.o0.d(a0Var.with()), kotlin.jvm.internal.o0.d(f50.o.class));
    }

    public static final boolean q(@m80.k h10.d<Object> rootClass) {
        kotlin.jvm.internal.g0.p(rootClass, "rootClass");
        return w00.b.d(rootClass).isArray();
    }

    public static final void r(x00.a<yz.g2> aVar) {
        try {
            aVar.invoke();
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
    }

    @m80.k
    public static final Void s(@m80.k h10.d<?> dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        g2.j(dVar);
        throw new KotlinNothingValueException();
    }

    @m80.k
    public static final Void t(@m80.k Class<?> cls) {
        kotlin.jvm.internal.g0.p(cls, "<this>");
        throw new SerializationException(g2.h(w00.b.i(cls)));
    }

    @m80.k
    public static final <T, E extends T> E[] u(@m80.k ArrayList<E> arrayList, @m80.k h10.d<T> eClass) {
        kotlin.jvm.internal.g0.p(arrayList, "<this>");
        kotlin.jvm.internal.g0.p(eClass, "eClass");
        Object newInstance = Array.newInstance((Class<?>) w00.b.d(eClass), arrayList.size());
        kotlin.jvm.internal.g0.n(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) newInstance);
        kotlin.jvm.internal.g0.o(eArr, "toArray(...)");
        return eArr;
    }
}
