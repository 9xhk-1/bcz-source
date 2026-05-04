package n10;

import a00.l1;
import a00.r0;
import e30.h2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedType;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUnsignedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnsignedType.kt\norg/jetbrains/kotlin/builtins/UnsignedTypes\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,122:1\n11165#2:123\n11500#2,3:124\n11165#2:127\n11500#2,3:128\n11500#2,3:131\n*S KotlinDebug\n*F\n+ 1 UnsignedType.kt\norg/jetbrains/kotlin/builtins/UnsignedTypes\n*L\n36#1:123\n36#1:124,3\n37#1:127\n37#1:128,3\n47#1:131,3\n*E\n"})
/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final q f74082a = new q();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Set<n20.f> f74083b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final Set<n20.f> f74084c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final HashMap<n20.b, n20.b> f74085d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final HashMap<n20.b, n20.b> f74086e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final HashMap<UnsignedArrayType, n20.f> f74087f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final Set<n20.f> f74088g;

    static {
        UnsignedType[] values = UnsignedType.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (UnsignedType unsignedType : values) {
            arrayList.add(unsignedType.getTypeName());
        }
        f74083b = r0.f6(arrayList);
        UnsignedArrayType[] values2 = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (UnsignedArrayType unsignedArrayType : values2) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        f74084c = r0.f6(arrayList2);
        f74085d = new HashMap<>();
        f74086e = new HashMap<>();
        f74087f = l1.M(h1.a(UnsignedArrayType.UBYTEARRAY, n20.f.f("ubyteArrayOf")), h1.a(UnsignedArrayType.USHORTARRAY, n20.f.f("ushortArrayOf")), h1.a(UnsignedArrayType.UINTARRAY, n20.f.f("uintArrayOf")), h1.a(UnsignedArrayType.ULONGARRAY, n20.f.f("ulongArrayOf")));
        UnsignedType[] values3 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : values3) {
            linkedHashSet.add(unsignedType2.getArrayClassId().h());
        }
        f74088g = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            f74085d.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            f74086e.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    @w00.o
    public static final boolean d(@m80.k e30.r0 type) {
        p10.d r11;
        g0.p(type, "type");
        if (h2.w(type) || (r11 = type.I0().r()) == null) {
            return false;
        }
        return f74082a.c(r11);
    }

    @m80.l
    public final n20.b a(@m80.k n20.b arrayClassId) {
        g0.p(arrayClassId, "arrayClassId");
        return f74085d.get(arrayClassId);
    }

    public final boolean b(@m80.k n20.f name) {
        g0.p(name, "name");
        return f74088g.contains(name);
    }

    public final boolean c(@m80.k p10.h descriptor) {
        g0.p(descriptor, "descriptor");
        p10.h b11 = descriptor.b();
        return (b11 instanceof p10.g0) && g0.g(((p10.g0) b11).d(), o.A) && f74083b.contains(descriptor.getName());
    }
}
