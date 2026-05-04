package v10;

import a00.i0;
import a00.l1;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import q30.k0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nreflectClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 reflectClassUtil.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1557#2:100\n1628#2,3:101\n1557#2:104\n1628#2,3:105\n1567#2:108\n1598#2,4:109\n*S KotlinDebug\n*F\n+ 1 reflectClassUtil.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectClassUtilKt\n*L\n34#1:100\n34#1:101,3\n35#1:104\n35#1:105,3\n50#1:108\n50#1:109,4\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final List<h10.d<? extends Object>> f92834a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Map<Class<? extends Object>, Class<? extends Object>> f92835b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final Map<Class<? extends Object>, Class<? extends Object>> f92836c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Map<Class<? extends yz.w<?>>, Integer> f92837d;

    static {
        int i11 = 0;
        List<h10.d<? extends Object>> Q = a00.h0.Q(o0.d(Boolean.TYPE), o0.d(Byte.TYPE), o0.d(Character.TYPE), o0.d(Double.TYPE), o0.d(Float.TYPE), o0.d(Integer.TYPE), o0.d(Long.TYPE), o0.d(Short.TYPE));
        f92834a = Q;
        List<h10.d<? extends Object>> list = Q;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            h10.d dVar = (h10.d) it.next();
            arrayList.add(h1.a(w00.b.g(dVar), w00.b.h(dVar)));
        }
        f92835b = l1.B0(arrayList);
        List<h10.d<? extends Object>> list2 = f92834a;
        ArrayList arrayList2 = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            h10.d dVar2 = (h10.d) it2.next();
            arrayList2.add(h1.a(w00.b.h(dVar2), w00.b.g(dVar2)));
        }
        f92836c = l1.B0(arrayList2);
        List Q2 = a00.h0.Q(x00.a.class, x00.l.class, x00.p.class, x00.q.class, x00.r.class, x00.s.class, x00.t.class, x00.u.class, x00.v.class, x00.w.class, x00.b.class, x00.c.class, x00.d.class, x00.e.class, x00.f.class, x00.g.class, x00.h.class, x00.i.class, x00.j.class, x00.k.class, x00.m.class, x00.n.class, x00.o.class);
        ArrayList arrayList3 = new ArrayList(i0.d0(Q2, 10));
        for (Object obj : Q2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            arrayList3.add(h1.a((Class) obj, Integer.valueOf(i11)));
            i11 = i12;
        }
        f92837d = l1.B0(arrayList3);
    }

    public static final ParameterizedType a(ParameterizedType it) {
        kotlin.jvm.internal.g0.p(it, "it");
        Type ownerType = it.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    public static final q30.m b(ParameterizedType it) {
        kotlin.jvm.internal.g0.p(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        kotlin.jvm.internal.g0.o(actualTypeArguments, "getActualTypeArguments(...)");
        return a00.a0.T5(actualTypeArguments);
    }

    @m80.k
    public static final n20.b e(@m80.k Class<?> cls) {
        n20.b e11;
        kotlin.jvm.internal.g0.p(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            kotlin.jvm.internal.g0.o(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (e11 = e(declaringClass)) != null) {
                    n20.f f11 = n20.f.f(cls.getSimpleName());
                    kotlin.jvm.internal.g0.o(f11, "identifier(...)");
                    n20.b d11 = e11.d(f11);
                    if (d11 != null) {
                        return d11;
                    }
                }
                return n20.b.f74280d.c(new n20.c(cls.getName()));
            }
        }
        n20.c cVar = new n20.c(cls.getName());
        n20.c e12 = cVar.e();
        kotlin.jvm.internal.g0.o(e12, "parent(...)");
        n20.c k11 = n20.c.k(cVar.g());
        kotlin.jvm.internal.g0.o(k11, "topLevel(...)");
        return new n20.b(e12, k11, true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @m80.k
    public static final String f(@m80.k Class<?> cls) {
        kotlin.jvm.internal.g0.p(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                kotlin.jvm.internal.g0.o(name, "getName(...)");
                return u30.f0.y2(name, '.', '/', false, 4, null);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name2 = cls.getName();
            kotlin.jvm.internal.g0.o(name2, "getName(...)");
            sb2.append(u30.f0.y2(name2, '.', '/', false, 4, null));
            sb2.append(l70.f.f70689d);
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
                }
                break;
            case 64711720:
                if (name3.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals(TypedValues.Custom.S_FLOAT)) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return ExifInterface.LATITUDE_SOUTH;
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    @m80.l
    public static final Integer g(@m80.k Class<?> cls) {
        kotlin.jvm.internal.g0.p(cls, "<this>");
        return f92837d.get(cls);
    }

    @m80.k
    public static final List<Type> h(@m80.k Type type) {
        kotlin.jvm.internal.g0.p(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return a00.h0.J();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return k0.I3(k0.k1(q30.x.t(type, d.f92830a), e.f92832a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.g0.o(actualTypeArguments, "getActualTypeArguments(...)");
        return a00.a0.dz(actualTypeArguments);
    }

    @m80.l
    public static final Class<?> i(@m80.k Class<?> cls) {
        kotlin.jvm.internal.g0.p(cls, "<this>");
        return f92835b.get(cls);
    }

    @m80.k
    public static final ClassLoader j(@m80.k Class<?> cls) {
        kotlin.jvm.internal.g0.p(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        kotlin.jvm.internal.g0.o(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    @m80.l
    public static final Class<?> k(@m80.k Class<?> cls) {
        kotlin.jvm.internal.g0.p(cls, "<this>");
        return f92836c.get(cls);
    }

    public static final boolean l(@m80.k Class<?> cls) {
        kotlin.jvm.internal.g0.p(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
