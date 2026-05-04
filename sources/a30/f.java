package a30;

import a00.d1;
import a00.k1;
import a00.l1;
import e30.c1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAnnotationDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n121#1:147\n121#1:148\n121#1:149\n121#1:150\n1202#2,2:128\n1230#2,4:130\n1611#2,9:134\n1863#2:143\n1864#2:145\n1620#2:146\n1557#2:151\n1628#2,3:152\n1734#2,3:155\n1#3:144\n*S KotlinDebug\n*F\n+ 1 AnnotationDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationDeserializer\n*L\n74#1:147\n76#1:148\n77#1:149\n78#1:150\n47#1:128,2\n47#1:130,4\n48#1:134,9\n48#1:143\n48#1:145\n48#1:146\n87#1:151\n87#1:152,3\n112#1:155,3\n48#1:144\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p10.a0 f1754a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p10.f0 f1755b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1756a;

        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f1756a = iArr;
        }
    }

    public f(@m80.k p10.a0 module, @m80.k p10.f0 notFoundClasses) {
        kotlin.jvm.internal.g0.p(module, "module");
        kotlin.jvm.internal.g0.p(notFoundClasses, "notFoundClasses");
        this.f1754a = module;
        this.f1755b = notFoundClasses;
    }

    @m80.k
    public final q10.c a(@m80.k ProtoBuf.Annotation proto, @m80.k k20.c nameResolver) {
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        p10.b e11 = e(k0.a(nameResolver, proto.getId()));
        Map z11 = l1.z();
        if (proto.getArgumentCount() != 0 && !g30.i.m(e11) && q20.h.t(e11)) {
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> f11 = e11.f();
            kotlin.jvm.internal.g0.o(f11, "getConstructors(...)");
            kotlin.reflect.jvm.internal.impl.descriptors.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) a00.r0.n5(f11);
            if (bVar != null) {
                List<j1> g11 = bVar.g();
                kotlin.jvm.internal.g0.o(g11, "getValueParameters(...)");
                List<j1> list = g11;
                LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(a00.i0.d0(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(((j1) obj).getName(), obj);
                }
                List<ProtoBuf.Annotation.Argument> argumentList = proto.getArgumentList();
                kotlin.jvm.internal.g0.o(argumentList, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Annotation.Argument argument : argumentList) {
                    kotlin.jvm.internal.g0.m(argument);
                    Pair<n20.f, s20.g<?>> d11 = d(argument, linkedHashMap, nameResolver);
                    if (d11 != null) {
                        arrayList.add(d11);
                    }
                }
                z11 = l1.B0(arrayList);
            }
        }
        return new q10.d(e11.s(), z11, p10.x0.f78622a);
    }

    public final boolean b(s20.g<?> gVar, e30.r0 r0Var, ProtoBuf.Annotation.Argument.Value value) {
        ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        int i11 = type == null ? -1 : a.f1756a[type.ordinal()];
        if (i11 == 10) {
            p10.d r11 = r0Var.I0().r();
            p10.b bVar = r11 instanceof p10.b ? (p10.b) r11 : null;
            return bVar == null || n10.j.l0(bVar);
        }
        if (i11 != 13) {
            return kotlin.jvm.internal.g0.g(gVar.a(this.f1754a), r0Var);
        }
        if (!(gVar instanceof s20.b) || ((s20.b) gVar).b().size() != value.getArrayElementList().size()) {
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
        }
        e30.r0 k11 = c().k(r0Var);
        kotlin.jvm.internal.g0.o(k11, "getArrayElementType(...)");
        s20.b bVar2 = (s20.b) gVar;
        Iterable K = a00.h0.K(bVar2.b());
        if ((K instanceof Collection) && ((Collection) K).isEmpty()) {
            return true;
        }
        Iterator it = K.iterator();
        while (it.hasNext()) {
            int nextInt = ((d1) it).nextInt();
            s20.g<?> gVar2 = bVar2.b().get(nextInt);
            ProtoBuf.Annotation.Argument.Value arrayElement = value.getArrayElement(nextInt);
            kotlin.jvm.internal.g0.o(arrayElement, "getArrayElement(...)");
            if (!b(gVar2, k11, arrayElement)) {
                return false;
            }
        }
        return true;
    }

    public final n10.j c() {
        return this.f1754a.q();
    }

    public final Pair<n20.f, s20.g<?>> d(ProtoBuf.Annotation.Argument argument, Map<n20.f, ? extends j1> map, k20.c cVar) {
        j1 j1Var = map.get(k0.b(cVar, argument.getNameId()));
        if (j1Var == null) {
            return null;
        }
        n20.f b11 = k0.b(cVar, argument.getNameId());
        e30.r0 type = j1Var.getType();
        kotlin.jvm.internal.g0.o(type, "getType(...)");
        ProtoBuf.Annotation.Argument.Value value = argument.getValue();
        kotlin.jvm.internal.g0.o(value, "getValue(...)");
        return new Pair<>(b11, g(type, value, cVar));
    }

    public final p10.b e(n20.b bVar) {
        return p10.t.d(this.f1754a, bVar, this.f1755b);
    }

    @m80.k
    public final s20.g<?> f(@m80.k e30.r0 expectedType, @m80.k ProtoBuf.Annotation.Argument.Value value, @m80.k k20.c nameResolver) {
        kotlin.jvm.internal.g0.p(expectedType, "expectedType");
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        Boolean d11 = k20.b.P.d(value.getFlags());
        kotlin.jvm.internal.g0.o(d11, "get(...)");
        boolean booleanValue = d11.booleanValue();
        ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        switch (type == null ? -1 : a.f1756a[type.ordinal()]) {
            case 1:
                byte intValue = (byte) value.getIntValue();
                return booleanValue ? new s20.b0(intValue) : new s20.d(intValue);
            case 2:
                return new s20.e((char) value.getIntValue());
            case 3:
                short intValue2 = (short) value.getIntValue();
                return booleanValue ? new s20.e0(intValue2) : new s20.x(intValue2);
            case 4:
                int intValue3 = (int) value.getIntValue();
                return booleanValue ? new s20.c0(intValue3) : new s20.n(intValue3);
            case 5:
                long intValue4 = value.getIntValue();
                return booleanValue ? new s20.d0(intValue4) : new s20.u(intValue4);
            case 6:
                return new s20.m(value.getFloatValue());
            case 7:
                return new s20.j(value.getDoubleValue());
            case 8:
                return new s20.c(value.getIntValue() != 0);
            case 9:
                return new s20.y(nameResolver.getString(value.getStringValue()));
            case 10:
                return new s20.t(k0.a(nameResolver, value.getClassId()), value.getArrayDimensionCount());
            case 11:
                return new s20.k(k0.a(nameResolver, value.getClassId()), k0.b(nameResolver, value.getEnumValueId()));
            case 12:
                ProtoBuf.Annotation annotation = value.getAnnotation();
                kotlin.jvm.internal.g0.o(annotation, "getAnnotation(...)");
                return new s20.a(a(annotation, nameResolver));
            case 13:
                s20.i iVar = s20.i.f87444a;
                List<ProtoBuf.Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                kotlin.jvm.internal.g0.o(arrayElementList, "getArrayElementList(...)");
                List<ProtoBuf.Annotation.Argument.Value> list = arrayElementList;
                ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
                for (ProtoBuf.Annotation.Argument.Value value2 : list) {
                    c1 i11 = c().i();
                    kotlin.jvm.internal.g0.o(i11, "getAnyType(...)");
                    kotlin.jvm.internal.g0.m(value2);
                    arrayList.add(f(i11, value2, nameResolver));
                }
                return iVar.b(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.getType() + " (expected " + expectedType + ')').toString());
        }
    }

    public final s20.g<?> g(e30.r0 r0Var, ProtoBuf.Annotation.Argument.Value value, k20.c cVar) {
        s20.g<?> f11 = f(r0Var, value, cVar);
        if (!b(f11, r0Var, value)) {
            f11 = null;
        }
        if (f11 != null) {
            return f11;
        }
        return s20.l.f87447b.a("Unexpected argument value: actual type " + value.getType() + " != expected type " + r0Var);
    }
}
