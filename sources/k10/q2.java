package k10;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.PropertyReference;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import s20.t;
import u10.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,330:1\n1611#2,9:331\n1863#2:340\n1864#2:342\n1620#2:343\n1755#2,3:344\n1368#2:347\n1454#2,5:348\n1611#2,9:353\n1863#2:362\n1864#2:365\n1620#2:366\n1557#2:367\n1628#2,3:368\n1#3:341\n1#3:363\n1#3:364\n1#3:371\n*S KotlinDebug\n*F\n+ 1 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n*L\n134#1:331,9\n134#1:340\n134#1:342\n134#1:343\n143#1:344,3\n144#1:347\n144#1:348,5\n164#1:353,9\n164#1:362\n164#1:365\n164#1:366\n194#1:367\n194#1:368,3\n134#1:341\n164#1:364\n*E\n"})
/* loaded from: classes8.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final n20.c f64983a = new n20.c("kotlin.jvm.JvmStatic");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64984a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f64984a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(s20.b bVar, ClassLoader classLoader) {
        e30.r0 e11;
        Class q11;
        s20.a0 a0Var = bVar instanceof s20.a0 ? (s20.a0) bVar : null;
        if (a0Var == null || (e11 = a0Var.e()) == null) {
            return null;
        }
        List<? extends s20.g<?>> b11 = bVar.b();
        ArrayList arrayList = new ArrayList(a00.i0.d0(b11, 10));
        Iterator<T> it = b11.iterator();
        while (it.hasNext()) {
            arrayList.add(u((s20.g) it.next(), classLoader));
        }
        PrimitiveType N = n10.j.N(e11);
        int i11 = 0;
        switch (N == null ? -1 : a.f64984a[N.ordinal()]) {
            case -1:
                if (!n10.j.c0(e11)) {
                    throw new IllegalStateException(("Not an array type: " + e11).toString());
                }
                e30.r0 type = ((e30.a2) a00.r0.m5(e11.G0())).getType();
                kotlin.jvm.internal.g0.o(type, "getType(...)");
                p10.d r11 = type.I0().r();
                p10.b bVar2 = r11 instanceof p10.b ? (p10.b) r11 : null;
                if (bVar2 == null) {
                    throw new IllegalStateException(("Not a class type: " + type).toString());
                }
                if (n10.j.v0(type)) {
                    int size = bVar.b().size();
                    String[] strArr = new String[size];
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlin.String");
                        strArr[i11] = obj;
                        i11++;
                    }
                    return strArr;
                }
                if (n10.j.l0(bVar2)) {
                    int size2 = bVar.b().size();
                    Class[] clsArr = new Class[size2];
                    while (i11 < size2) {
                        Object obj2 = arrayList.get(i11);
                        kotlin.jvm.internal.g0.n(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                        clsArr[i11] = obj2;
                        i11++;
                    }
                    return clsArr;
                }
                n20.b n11 = u20.e.n(bVar2);
                if (n11 == null || (q11 = q(classLoader, n11, 0, 4, null)) == null) {
                    return null;
                }
                Object newInstance = Array.newInstance((Class<?>) q11, bVar.b().size());
                kotlin.jvm.internal.g0.n(newInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                Object[] objArr = (Object[]) newInstance;
                int size3 = arrayList.size();
                while (i11 < size3) {
                    objArr[i11] = arrayList.get(i11);
                    i11++;
                }
                return objArr;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                int size4 = bVar.b().size();
                boolean[] zArr = new boolean[size4];
                while (i11 < size4) {
                    Object obj3 = arrayList.get(i11);
                    kotlin.jvm.internal.g0.n(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    zArr[i11] = ((Boolean) obj3).booleanValue();
                    i11++;
                }
                return zArr;
            case 2:
                int size5 = bVar.b().size();
                char[] cArr = new char[size5];
                while (i11 < size5) {
                    Object obj4 = arrayList.get(i11);
                    kotlin.jvm.internal.g0.n(obj4, "null cannot be cast to non-null type kotlin.Char");
                    cArr[i11] = ((Character) obj4).charValue();
                    i11++;
                }
                return cArr;
            case 3:
                int size6 = bVar.b().size();
                byte[] bArr = new byte[size6];
                while (i11 < size6) {
                    Object obj5 = arrayList.get(i11);
                    kotlin.jvm.internal.g0.n(obj5, "null cannot be cast to non-null type kotlin.Byte");
                    bArr[i11] = ((Byte) obj5).byteValue();
                    i11++;
                }
                return bArr;
            case 4:
                int size7 = bVar.b().size();
                short[] sArr = new short[size7];
                while (i11 < size7) {
                    Object obj6 = arrayList.get(i11);
                    kotlin.jvm.internal.g0.n(obj6, "null cannot be cast to non-null type kotlin.Short");
                    sArr[i11] = ((Short) obj6).shortValue();
                    i11++;
                }
                return sArr;
            case 5:
                int size8 = bVar.b().size();
                int[] iArr = new int[size8];
                while (i11 < size8) {
                    Object obj7 = arrayList.get(i11);
                    kotlin.jvm.internal.g0.n(obj7, "null cannot be cast to non-null type kotlin.Int");
                    iArr[i11] = ((Integer) obj7).intValue();
                    i11++;
                }
                return iArr;
            case 6:
                int size9 = bVar.b().size();
                float[] fArr = new float[size9];
                while (i11 < size9) {
                    Object obj8 = arrayList.get(i11);
                    kotlin.jvm.internal.g0.n(obj8, "null cannot be cast to non-null type kotlin.Float");
                    fArr[i11] = ((Float) obj8).floatValue();
                    i11++;
                }
                return fArr;
            case 7:
                int size10 = bVar.b().size();
                long[] jArr = new long[size10];
                while (i11 < size10) {
                    Object obj9 = arrayList.get(i11);
                    kotlin.jvm.internal.g0.n(obj9, "null cannot be cast to non-null type kotlin.Long");
                    jArr[i11] = ((Long) obj9).longValue();
                    i11++;
                }
                return jArr;
            case 8:
                int size11 = bVar.b().size();
                double[] dArr = new double[size11];
                while (i11 < size11) {
                    Object obj10 = arrayList.get(i11);
                    kotlin.jvm.internal.g0.n(obj10, "null cannot be cast to non-null type kotlin.Double");
                    dArr[i11] = ((Double) obj10).doubleValue();
                    i11++;
                }
                return dArr;
        }
    }

    @m80.l
    public static final kotlin.reflect.jvm.internal.e<?> b(@m80.l Object obj) {
        kotlin.reflect.jvm.internal.e<?> eVar = obj instanceof kotlin.reflect.jvm.internal.e ? (kotlin.reflect.jvm.internal.e) obj : null;
        if (eVar != null) {
            return eVar;
        }
        kotlin.reflect.jvm.internal.g c11 = c(obj);
        return c11 != null ? c11 : d(obj);
    }

    @m80.l
    public static final kotlin.reflect.jvm.internal.g c(@m80.l Object obj) {
        kotlin.reflect.jvm.internal.g gVar = obj instanceof kotlin.reflect.jvm.internal.g ? (kotlin.reflect.jvm.internal.g) obj : null;
        if (gVar != null) {
            return gVar;
        }
        FunctionReference functionReference = obj instanceof FunctionReference ? (FunctionReference) obj : null;
        h10.c compute = functionReference != null ? functionReference.compute() : null;
        if (compute instanceof kotlin.reflect.jvm.internal.g) {
            return (kotlin.reflect.jvm.internal.g) compute;
        }
        return null;
    }

    @m80.l
    public static final kotlin.reflect.jvm.internal.p<?> d(@m80.l Object obj) {
        kotlin.reflect.jvm.internal.p<?> pVar = obj instanceof kotlin.reflect.jvm.internal.p ? (kotlin.reflect.jvm.internal.p) obj : null;
        if (pVar != null) {
            return pVar;
        }
        PropertyReference propertyReference = obj instanceof PropertyReference ? (PropertyReference) obj : null;
        h10.c compute = propertyReference != null ? propertyReference.compute() : null;
        if (compute instanceof kotlin.reflect.jvm.internal.p) {
            return (kotlin.reflect.jvm.internal.p) compute;
        }
        return null;
    }

    @m80.k
    public static final List<Annotation> e(@m80.k q10.a aVar) {
        Annotation r11;
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        q10.g annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (q10.c cVar : annotations) {
            p10.x0 source = cVar.getSource();
            if (source instanceof u10.b) {
                r11 = ((u10.b) source).d();
            } else if (source instanceof l.a) {
                v10.u c11 = ((l.a) source).c();
                v10.g gVar = c11 instanceof v10.g ? (v10.g) c11 : null;
                r11 = gVar != null ? gVar.O() : null;
            } else {
                r11 = r(cVar);
            }
            if (r11 != null) {
                arrayList.add(r11);
            }
        }
        return v(arrayList);
    }

    @m80.k
    public static final Class<?> f(@m80.k Class<?> cls) {
        kotlin.jvm.internal.g0.p(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    @m80.l
    public static final Object g(@m80.k Type type) {
        kotlin.jvm.internal.g0.p(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (kotlin.jvm.internal.g0.g(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (kotlin.jvm.internal.g0.g(cls, Character.TYPE)) {
            return (char) 0;
        }
        if (kotlin.jvm.internal.g0.g(cls, Byte.TYPE)) {
            return (byte) 0;
        }
        if (kotlin.jvm.internal.g0.g(cls, Short.TYPE)) {
            return (short) 0;
        }
        if (kotlin.jvm.internal.g0.g(cls, Integer.TYPE)) {
            return 0;
        }
        if (kotlin.jvm.internal.g0.g(cls, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (kotlin.jvm.internal.g0.g(cls, Long.TYPE)) {
            return 0L;
        }
        if (kotlin.jvm.internal.g0.g(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (kotlin.jvm.internal.g0.g(cls, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    @m80.k
    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.n, D extends kotlin.reflect.jvm.internal.impl.descriptors.a> D h(@m80.k Class<?> moduleAnchor, @m80.k M proto, @m80.k k20.c nameResolver, @m80.k k20.g typeTable, @m80.k k20.a metadataVersion, @m80.k x00.p<? super a30.j0, ? super M, ? extends D> createDescriptor) {
        List<ProtoBuf.TypeParameter> typeParameterList;
        kotlin.jvm.internal.g0.p(moduleAnchor, "moduleAnchor");
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        kotlin.jvm.internal.g0.p(typeTable, "typeTable");
        kotlin.jvm.internal.g0.p(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.g0.p(createDescriptor, "createDescriptor");
        u10.k b11 = h2.b(moduleAnchor);
        if (proto instanceof ProtoBuf.Function) {
            typeParameterList = ((ProtoBuf.Function) proto).getTypeParameterList();
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            typeParameterList = ((ProtoBuf.Property) proto).getTypeParameterList();
        }
        List<ProtoBuf.TypeParameter> list = typeParameterList;
        a30.m a11 = b11.a();
        p10.a0 b12 = b11.b();
        k20.h b13 = k20.h.f65196b.b();
        kotlin.jvm.internal.g0.m(list);
        return createDescriptor.invoke(new a30.j0(new a30.o(a11, nameResolver, b12, typeTable, b13, metadataVersion, null, null, list)), proto);
    }

    @m80.l
    public static final Field i(@m80.k Class<?> cls, @m80.k String name) {
        kotlin.jvm.internal.g0.p(cls, "<this>");
        kotlin.jvm.internal.g0.p(name, "name");
        try {
            return cls.getDeclaredField(name);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @m80.l
    public static final Method j(@m80.k Class<?> cls, @m80.k String name, @m80.k Class<?>... parameterTypes) {
        kotlin.jvm.internal.g0.p(cls, "<this>");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(parameterTypes, "parameterTypes");
        try {
            return cls.getDeclaredMethod(name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @m80.l
    public static final p10.t0 k(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        if (aVar.d0() == null) {
            return null;
        }
        p10.h b11 = aVar.b();
        kotlin.jvm.internal.g0.n(b11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((p10.b) b11).W();
    }

    @m80.k
    public static final n20.c l() {
        return f64983a;
    }

    public static final boolean m(@m80.k h10.r rVar) {
        e30.r0 D;
        kotlin.jvm.internal.g0.p(rVar, "<this>");
        kotlin.reflect.jvm.internal.r rVar2 = rVar instanceof kotlin.reflect.jvm.internal.r ? (kotlin.reflect.jvm.internal.r) rVar : null;
        return (rVar2 == null || (D = rVar2.D()) == null || !q20.i.i(D)) ? false : true;
    }

    public static final boolean n(@m80.k h10.r rVar) {
        e30.r0 D;
        kotlin.jvm.internal.g0.p(rVar, "<this>");
        kotlin.reflect.jvm.internal.r rVar2 = rVar instanceof kotlin.reflect.jvm.internal.r ? (kotlin.reflect.jvm.internal.r) rVar : null;
        return (rVar2 == null || (D = rVar2.D()) == null || !q20.i.c(D)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class<?> o(ClassLoader classLoader, String str, String str2, int i11) {
        if (kotlin.jvm.internal.g0.g(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i11 > 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (str.length() > 0) {
            sb2.append(str + '.');
        }
        sb2.append(u30.f0.y2(str2, '.', '$', false, 4, null));
        if (i11 > 0) {
            sb2.append(com.alipay.sdk.m.u.i.f11097b);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return u10.e.a(classLoader, sb3);
    }

    public static final Class<?> p(ClassLoader classLoader, n20.b bVar, int i11) {
        o10.a aVar = o10.a.f75522a;
        n20.d j11 = bVar.a().j();
        kotlin.jvm.internal.g0.o(j11, "toUnsafe(...)");
        n20.b n11 = aVar.n(j11);
        if (n11 != null) {
            bVar = n11;
        }
        String b11 = bVar.f().b();
        kotlin.jvm.internal.g0.o(b11, "asString(...)");
        String b12 = bVar.g().b();
        kotlin.jvm.internal.g0.o(b12, "asString(...)");
        return o(classLoader, b11, b12, i11);
    }

    public static /* synthetic */ Class q(ClassLoader classLoader, n20.b bVar, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return p(classLoader, bVar, i11);
    }

    public static final Annotation r(q10.c cVar) {
        p10.b l11 = u20.e.l(cVar);
        Class<?> s11 = l11 != null ? s(l11) : null;
        if (s11 == null) {
            s11 = null;
        }
        if (s11 == null) {
            return null;
        }
        Set<Map.Entry<n20.f, s20.g<?>>> entrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            n20.f fVar = (n20.f) entry.getKey();
            s20.g gVar = (s20.g) entry.getValue();
            ClassLoader classLoader = s11.getClassLoader();
            kotlin.jvm.internal.g0.o(classLoader, "getClassLoader(...)");
            Object u11 = u(gVar, classLoader);
            Pair a11 = u11 != null ? yz.h1.a(fVar.b(), u11) : null;
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return (Annotation) l10.e.h(s11, a00.l1.B0(arrayList), null, 4, null);
    }

    @m80.l
    public static final Class<?> s(@m80.k p10.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        p10.x0 source = bVar.getSource();
        kotlin.jvm.internal.g0.o(source, "getSource(...)");
        if (source instanceof h20.z) {
            h20.x d11 = ((h20.z) source).d();
            kotlin.jvm.internal.g0.n(d11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((u10.f) d11).e();
        }
        if (source instanceof l.a) {
            v10.u c11 = ((l.a) source).c();
            kotlin.jvm.internal.g0.n(c11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((v10.q) c11).e();
        }
        n20.b n11 = u20.e.n(bVar);
        if (n11 == null) {
            return null;
        }
        return p(v10.f.j(bVar.getClass()), n11, 0);
    }

    @m80.l
    public static final KVisibility t(@m80.k p10.p pVar) {
        kotlin.jvm.internal.g0.p(pVar, "<this>");
        if (kotlin.jvm.internal.g0.g(pVar, p10.o.f78590e)) {
            return KVisibility.PUBLIC;
        }
        if (kotlin.jvm.internal.g0.g(pVar, p10.o.f78588c)) {
            return KVisibility.PROTECTED;
        }
        if (kotlin.jvm.internal.g0.g(pVar, p10.o.f78589d)) {
            return KVisibility.INTERNAL;
        }
        if (kotlin.jvm.internal.g0.g(pVar, p10.o.f78586a) || kotlin.jvm.internal.g0.g(pVar, p10.o.f78587b)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    public static final Object u(s20.g<?> gVar, ClassLoader classLoader) {
        if (gVar instanceof s20.a) {
            return r(((s20.a) gVar).b());
        }
        if (gVar instanceof s20.b) {
            return a((s20.b) gVar, classLoader);
        }
        if (gVar instanceof s20.k) {
            Pair<? extends n20.b, ? extends n20.f> b11 = ((s20.k) gVar).b();
            n20.b component1 = b11.component1();
            n20.f component2 = b11.component2();
            Class q11 = q(classLoader, component1, 0, 4, null);
            if (q11 != null) {
                return p2.a(q11, component2.b());
            }
            return null;
        }
        if (!(gVar instanceof s20.t)) {
            if ((gVar instanceof s20.l) || (gVar instanceof s20.v)) {
                return null;
            }
            return gVar.b();
        }
        t.b b12 = ((s20.t) gVar).b();
        if (b12 instanceof t.b.C1127b) {
            t.b.C1127b c1127b = (t.b.C1127b) b12;
            return p(classLoader, c1127b.b(), c1127b.a());
        }
        if (!(b12 instanceof t.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        p10.d r11 = ((t.b.a) b12).a().I0().r();
        p10.b bVar = r11 instanceof p10.b ? (p10.b) r11 : null;
        if (bVar != null) {
            return s(bVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<? extends java.lang.annotation.Annotation>, java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList, java.util.Collection] */
    public static final List<Annotation> v(List<? extends Annotation> list) {
        List l11;
        Iterable<Annotation> iterable = (Iterable) list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return list;
        }
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (kotlin.jvm.internal.g0.g(w00.b.d(w00.b.a((Annotation) it.next())).getSimpleName(), "Container")) {
                list = new ArrayList<>();
                for (Annotation annotation : iterable) {
                    Class d11 = w00.b.d(w00.b.a(annotation));
                    if (!kotlin.jvm.internal.g0.g(d11.getSimpleName(), "Container") || d11.getAnnotation(kotlin.jvm.internal.q0.class) == null) {
                        l11 = a00.g0.l(annotation);
                    } else {
                        Object invoke = d11.getDeclaredMethod("value", null).invoke(annotation, null);
                        kotlin.jvm.internal.g0.n(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        l11 = a00.q.t((Annotation[]) invoke);
                    }
                    a00.m0.s0(list, l11);
                }
            }
        }
        return list;
    }
}
