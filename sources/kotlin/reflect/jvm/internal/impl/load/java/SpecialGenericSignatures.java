package kotlin.reflect.jvm.internal.impl.load.java;

import a00.i0;
import a00.k1;
import a00.l1;
import a00.r0;
import a00.w1;
import a00.x1;
import g10.u;
import h20.f0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import m80.k;
import m80.l;
import n20.f;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSpecialGenericSignatures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,155:1\n1557#2:156\n1628#2,3:157\n1557#2:160\n1628#2,3:161\n1557#2:164\n1628#2,3:165\n1246#2,4:171\n1557#2:175\n1628#2,3:176\n1557#2:179\n1628#2,3:180\n1246#2,4:186\n1628#2,3:193\n1557#2:196\n1628#2,3:197\n1216#2,2:200\n1246#2,4:202\n13#3:168\n13#3:183\n477#4:169\n423#4:170\n477#4:184\n423#4:185\n153#5,3:190\n*S KotlinDebug\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n*L\n57#1:156\n57#1:157,3\n59#1:160\n59#1:161,3\n60#1:164\n60#1:165,3\n98#1:171,4\n104#1:175\n104#1:176,3\n105#1:179\n105#1:180,3\n129#1:186,4\n137#1:193,3\n141#1:196\n141#1:197,3\n142#1:200,2\n142#1:202,4\n63#1:168\n114#1:183\n98#1:169\n98#1:170\n129#1:184\n129#1:185\n133#1:190,3\n*E\n"})
/* loaded from: classes8.dex */
public class SpecialGenericSignatures {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f67253a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final List<a.C0793a> f67254b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final List<String> f67255c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final List<String> f67256d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final Map<a.C0793a, TypeSafeBarrierDescription> f67257e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final Map<String, TypeSafeBarrierDescription> f67258f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final Set<f> f67259g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final Set<String> f67260h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a.C0793a f67261i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final Map<a.C0793a, f> f67262j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final Map<String, f> f67263k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final Set<String> f67264l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final Set<f> f67265m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final Map<f, f> f67266n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SpecialSignatureInfo {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ SpecialSignatureInfo[] $VALUES;
        private final boolean isObjectReplacedWithTypeParameter;

        @l
        private final String valueParametersSignature;
        public static final SpecialSignatureInfo ONE_COLLECTION_PARAMETER = new SpecialSignatureInfo("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);
        public static final SpecialSignatureInfo OBJECT_PARAMETER_NON_GENERIC = new SpecialSignatureInfo("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);
        public static final SpecialSignatureInfo OBJECT_PARAMETER_GENERIC = new SpecialSignatureInfo("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);

        private static final /* synthetic */ SpecialSignatureInfo[] $values() {
            return new SpecialSignatureInfo[]{ONE_COLLECTION_PARAMETER, OBJECT_PARAMETER_NON_GENERIC, OBJECT_PARAMETER_GENERIC};
        }

        static {
            SpecialSignatureInfo[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private SpecialSignatureInfo(String str, int i11, String str2, boolean z11) {
            this.valueParametersSignature = str2;
            this.isObjectReplacedWithTypeParameter = z11;
        }

        public static SpecialSignatureInfo valueOf(String str) {
            return (SpecialSignatureInfo) Enum.valueOf(SpecialSignatureInfo.class, str);
        }

        public static SpecialSignatureInfo[] values() {
            return (SpecialSignatureInfo[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TypeSafeBarrierDescription {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ TypeSafeBarrierDescription[] $VALUES;

        @l
        private final Object defaultValue;
        public static final TypeSafeBarrierDescription NULL = new TypeSafeBarrierDescription("NULL", 0, null);
        public static final TypeSafeBarrierDescription INDEX = new TypeSafeBarrierDescription("INDEX", 1, -1);
        public static final TypeSafeBarrierDescription FALSE = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT = new a("MAP_GET_OR_DEFAULT", 3);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends TypeSafeBarrierDescription {
            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public a(java.lang.String r2, int r3) {
                /*
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.a.<init>(java.lang.String, int):void");
            }
        }

        private static final /* synthetic */ TypeSafeBarrierDescription[] $values() {
            return new TypeSafeBarrierDescription[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        static {
            TypeSafeBarrierDescription[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i11, Object obj, v vVar) {
            this(str, i11, obj);
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) $VALUES.clone();
        }

        private TypeSafeBarrierDescription(String str, int i11, Object obj) {
            this.defaultValue = obj;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a, reason: collision with other inner class name */
        public static final class C0793a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f67267a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final f f67268b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f67269c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f67270d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f67271e;

            public C0793a(@k String classInternalName, @k f name, @k String parameters, @k String returnType) {
                g0.p(classInternalName, "classInternalName");
                g0.p(name, "name");
                g0.p(parameters, "parameters");
                g0.p(returnType, "returnType");
                this.f67267a = classInternalName;
                this.f67268b = name;
                this.f67269c = parameters;
                this.f67270d = returnType;
                this.f67271e = f0.f58067a.l(classInternalName, name + '(' + parameters + ')' + returnType);
            }

            public static /* synthetic */ C0793a b(C0793a c0793a, String str, f fVar, String str2, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = c0793a.f67267a;
                }
                if ((i11 & 2) != 0) {
                    fVar = c0793a.f67268b;
                }
                if ((i11 & 4) != 0) {
                    str2 = c0793a.f67269c;
                }
                if ((i11 & 8) != 0) {
                    str3 = c0793a.f67270d;
                }
                return c0793a.a(str, fVar, str2, str3);
            }

            @k
            public final C0793a a(@k String classInternalName, @k f name, @k String parameters, @k String returnType) {
                g0.p(classInternalName, "classInternalName");
                g0.p(name, "name");
                g0.p(parameters, "parameters");
                g0.p(returnType, "returnType");
                return new C0793a(classInternalName, name, parameters, returnType);
            }

            @k
            public final f c() {
                return this.f67268b;
            }

            @k
            public final String d() {
                return this.f67271e;
            }

            public boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0793a)) {
                    return false;
                }
                C0793a c0793a = (C0793a) obj;
                return g0.g(this.f67267a, c0793a.f67267a) && g0.g(this.f67268b, c0793a.f67268b) && g0.g(this.f67269c, c0793a.f67269c) && g0.g(this.f67270d, c0793a.f67270d);
            }

            public int hashCode() {
                return (((((this.f67267a.hashCode() * 31) + this.f67268b.hashCode()) * 31) + this.f67269c.hashCode()) * 31) + this.f67270d.hashCode();
            }

            @k
            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f67267a + ", name=" + this.f67268b + ", parameters=" + this.f67269c + ", returnType=" + this.f67270d + ')';
            }
        }

        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final f b(@k f name) {
            g0.p(name, "name");
            return f().get(name);
        }

        @k
        public final List<String> c() {
            return SpecialGenericSignatures.f67255c;
        }

        @k
        public final Set<f> d() {
            return SpecialGenericSignatures.f67259g;
        }

        @k
        public final Set<String> e() {
            return SpecialGenericSignatures.f67260h;
        }

        @k
        public final Map<f, f> f() {
            return SpecialGenericSignatures.f67266n;
        }

        @k
        public final Set<f> g() {
            return SpecialGenericSignatures.f67265m;
        }

        @k
        public final C0793a h() {
            return SpecialGenericSignatures.f67261i;
        }

        @k
        public final Map<String, TypeSafeBarrierDescription> i() {
            return SpecialGenericSignatures.f67258f;
        }

        @k
        public final Map<String, f> j() {
            return SpecialGenericSignatures.f67263k;
        }

        public final boolean k(@k f fVar) {
            g0.p(fVar, "<this>");
            return g().contains(fVar);
        }

        @k
        public final SpecialSignatureInfo l(@k String builtinSignature) {
            g0.p(builtinSignature, "builtinSignature");
            return c().contains(builtinSignature) ? SpecialSignatureInfo.ONE_COLLECTION_PARAMETER : ((TypeSafeBarrierDescription) l1.K(i(), builtinSignature)) == TypeSafeBarrierDescription.NULL ? SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }

        public final C0793a m(String str, String str2, String str3, String str4) {
            f f11 = f.f(str2);
            g0.o(f11, "identifier(...)");
            return new C0793a(str, f11, str3, str4);
        }

        public a() {
        }
    }

    static {
        Set<String> u11 = w1.u("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(i0.d0(u11, 10));
        for (String str : u11) {
            a aVar = f67253a;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            g0.o(desc, "getDesc(...)");
            arrayList.add(aVar.m("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f67254b = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(i0.d0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((a.C0793a) it.next()).d());
        }
        f67255c = arrayList3;
        List<a.C0793a> list = f67254b;
        ArrayList arrayList4 = new ArrayList(i0.d0(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((a.C0793a) it2.next()).c().b());
        }
        f67256d = arrayList4;
        f0 f0Var = f0.f58067a;
        a aVar2 = f67253a;
        String i11 = f0Var.i("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        g0.o(desc2, "getDesc(...)");
        a.C0793a m11 = aVar2.m(i11, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        Pair a11 = h1.a(m11, typeSafeBarrierDescription);
        String i12 = f0Var.i("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        g0.o(desc3, "getDesc(...)");
        Pair a12 = h1.a(aVar2.m(i12, "remove", "Ljava/lang/Object;", desc3), typeSafeBarrierDescription);
        String i13 = f0Var.i("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        g0.o(desc4, "getDesc(...)");
        Pair a13 = h1.a(aVar2.m(i13, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription);
        String i14 = f0Var.i("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        g0.o(desc5, "getDesc(...)");
        Pair a14 = h1.a(aVar2.m(i14, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription);
        String i15 = f0Var.i("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        g0.o(desc6, "getDesc(...)");
        Pair a15 = h1.a(aVar2.m(i15, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription);
        Pair a16 = h1.a(aVar2.m(f0Var.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        a.C0793a m12 = aVar2.m(f0Var.i("Map"), ct.d.f46852f, "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        Pair a17 = h1.a(m12, typeSafeBarrierDescription2);
        Pair a18 = h1.a(aVar2.m(f0Var.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String i16 = f0Var.i("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        g0.o(desc7, "getDesc(...)");
        a.C0793a m13 = aVar2.m(i16, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        Pair a19 = h1.a(m13, typeSafeBarrierDescription3);
        String i17 = f0Var.i("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        g0.o(desc8, "getDesc(...)");
        Map<a.C0793a, TypeSafeBarrierDescription> W = l1.W(a11, a12, a13, a14, a15, a16, a17, a18, a19, h1.a(aVar2.m(i17, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        f67257e = W;
        LinkedHashMap linkedHashMap = new LinkedHashMap(k1.j(W.size()));
        Iterator<T> it3 = W.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((a.C0793a) entry.getKey()).d(), entry.getValue());
        }
        f67258f = linkedHashMap;
        Set C = x1.C(f67257e.keySet(), f67254b);
        ArrayList arrayList5 = new ArrayList(i0.d0(C, 10));
        Iterator it4 = C.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((a.C0793a) it4.next()).c());
        }
        f67259g = r0.f6(arrayList5);
        ArrayList arrayList6 = new ArrayList(i0.d0(C, 10));
        Iterator it5 = C.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((a.C0793a) it5.next()).d());
        }
        f67260h = r0.f6(arrayList6);
        a aVar3 = f67253a;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        g0.o(desc9, "getDesc(...)");
        a.C0793a m14 = aVar3.m("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f67261i = m14;
        f0 f0Var2 = f0.f58067a;
        String h11 = f0Var2.h("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        g0.o(desc10, "getDesc(...)");
        Pair a21 = h1.a(aVar3.m(h11, "toByte", "", desc10), f.f("byteValue"));
        String h12 = f0Var2.h("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        g0.o(desc11, "getDesc(...)");
        Pair a22 = h1.a(aVar3.m(h12, "toShort", "", desc11), f.f("shortValue"));
        String h13 = f0Var2.h("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        g0.o(desc12, "getDesc(...)");
        Pair a23 = h1.a(aVar3.m(h13, "toInt", "", desc12), f.f("intValue"));
        String h14 = f0Var2.h("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        g0.o(desc13, "getDesc(...)");
        Pair a24 = h1.a(aVar3.m(h14, "toLong", "", desc13), f.f("longValue"));
        String h15 = f0Var2.h("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        g0.o(desc14, "getDesc(...)");
        Pair a25 = h1.a(aVar3.m(h15, "toFloat", "", desc14), f.f("floatValue"));
        String h16 = f0Var2.h("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        g0.o(desc15, "getDesc(...)");
        Pair a26 = h1.a(aVar3.m(h16, "toDouble", "", desc15), f.f("doubleValue"));
        Pair a27 = h1.a(m14, f.f("remove"));
        String h17 = f0Var2.h("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        g0.o(desc16, "getDesc(...)");
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        g0.o(desc17, "getDesc(...)");
        Map<a.C0793a, f> W2 = l1.W(a21, a22, a23, a24, a25, a26, a27, h1.a(aVar3.m(h17, ct.d.f46852f, desc16, desc17), f.f("charAt")));
        f67262j = W2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(k1.j(W2.size()));
        Iterator<T> it6 = W2.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((a.C0793a) entry2.getKey()).d(), entry2.getValue());
        }
        f67263k = linkedHashMap2;
        Map<a.C0793a, f> map = f67262j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<a.C0793a, f> entry3 : map.entrySet()) {
            linkedHashSet.add(a.C0793a.b(entry3.getKey(), null, entry3.getValue(), null, null, 13, null).d());
        }
        f67264l = linkedHashSet;
        Set<a.C0793a> keySet = f67262j.keySet();
        HashSet hashSet = new HashSet();
        Iterator<T> it7 = keySet.iterator();
        while (it7.hasNext()) {
            hashSet.add(((a.C0793a) it7.next()).c());
        }
        f67265m = hashSet;
        Set<Map.Entry<a.C0793a, f>> entrySet = f67262j.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(i0.d0(entrySet, 10));
        Iterator<T> it8 = entrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it8.next();
            arrayList7.add(new Pair(((a.C0793a) entry4.getKey()).c(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(u.u(k1.j(i0.d0(arrayList7, 10)), 16));
        for (Pair pair : arrayList7) {
            linkedHashMap3.put((f) pair.getSecond(), (f) pair.getFirst());
        }
        f67266n = linkedHashMap3;
    }
}
