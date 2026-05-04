package a30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p10.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nValueClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1557#2:47\n1628#2,3:48\n1557#2:51\n1628#2,3:52\n1557#2:55\n1628#2,3:56\n*S KotlinDebug\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n*L\n25#1:47\n25#1:48,3\n29#1:51\n29#1:52,3\n32#1:55\n32#1:56,3\n*E\n"})
/* loaded from: classes8.dex */
public final class x0 {
    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    public static final <T extends i30.h> h1<T> a(@m80.k ProtoBuf.Class r42, @m80.k k20.c nameResolver, @m80.k k20.g typeTable, @m80.k x00.l<? super ProtoBuf.Type, ? extends T> typeDeserializer, @m80.k x00.l<? super n20.f, ? extends T> typeOfPublicProperty) {
        T invoke;
        List<ProtoBuf.Type> multiFieldValueClassUnderlyingTypeList;
        kotlin.jvm.internal.g0.p(r42, "<this>");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        kotlin.jvm.internal.g0.p(typeTable, "typeTable");
        kotlin.jvm.internal.g0.p(typeDeserializer, "typeDeserializer");
        kotlin.jvm.internal.g0.p(typeOfPublicProperty, "typeOfPublicProperty");
        if (r42.getMultiFieldValueClassUnderlyingNameCount() <= 0) {
            if (!r42.hasInlineClassUnderlyingPropertyName()) {
                return null;
            }
            n20.f b11 = k0.b(nameResolver, r42.getInlineClassUnderlyingPropertyName());
            ProtoBuf.Type i11 = k20.f.i(r42, typeTable);
            if ((i11 != null && (invoke = typeDeserializer.invoke(i11)) != null) || (invoke = typeOfPublicProperty.invoke(b11)) != null) {
                return new p10.u(b11, invoke);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + k0.b(nameResolver, r42.getFqName()) + " with property " + b11).toString());
        }
        List<Integer> multiFieldValueClassUnderlyingNameList = r42.getMultiFieldValueClassUnderlyingNameList();
        kotlin.jvm.internal.g0.o(multiFieldValueClassUnderlyingNameList, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list = multiFieldValueClassUnderlyingNameList;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        for (Integer num : list) {
            kotlin.jvm.internal.g0.m(num);
            arrayList.add(k0.b(nameResolver, num.intValue()));
        }
        Pair a11 = yz.h1.a(Integer.valueOf(r42.getMultiFieldValueClassUnderlyingTypeIdCount()), Integer.valueOf(r42.getMultiFieldValueClassUnderlyingTypeCount()));
        if (kotlin.jvm.internal.g0.g(a11, yz.h1.a(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> multiFieldValueClassUnderlyingTypeIdList = r42.getMultiFieldValueClassUnderlyingTypeIdList();
            kotlin.jvm.internal.g0.o(multiFieldValueClassUnderlyingTypeIdList, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list2 = multiFieldValueClassUnderlyingTypeIdList;
            multiFieldValueClassUnderlyingTypeList = new ArrayList<>(a00.i0.d0(list2, 10));
            for (Integer num2 : list2) {
                kotlin.jvm.internal.g0.m(num2);
                multiFieldValueClassUnderlyingTypeList.add(typeTable.a(num2.intValue()));
            }
        } else {
            if (!kotlin.jvm.internal.g0.g(a11, yz.h1.a(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + k0.b(nameResolver, r42.getFqName()) + " has illegal multi-field value class representation").toString());
            }
            multiFieldValueClassUnderlyingTypeList = r42.getMultiFieldValueClassUnderlyingTypeList();
        }
        kotlin.jvm.internal.g0.m(multiFieldValueClassUnderlyingTypeList);
        List<ProtoBuf.Type> list3 = multiFieldValueClassUnderlyingTypeList;
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.invoke(it.next()));
        }
        return new p10.b0(a00.r0.o6(arrayList, arrayList2));
    }
}
