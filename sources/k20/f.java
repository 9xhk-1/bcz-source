package k20;

import a00.i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nprotoTypeTableUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 protoTypeTableUtil.kt\norg/jetbrains/kotlin/metadata/deserialization/ProtoTypeTableUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1#2:126\n1557#3:127\n1628#3,3:128\n1557#3:131\n1628#3,3:132\n1557#3:135\n1628#3,3:136\n1557#3:139\n1628#3,3:140\n1557#3:143\n1628#3,3:144\n*S KotlinDebug\n*F\n+ 1 protoTypeTableUtil.kt\norg/jetbrains/kotlin/metadata/deserialization/ProtoTypeTableUtilKt\n*L\n24#1:127\n24#1:128,3\n45#1:131\n45#1:132,3\n118#1:135\n118#1:136,3\n121#1:139\n121#1:140,3\n124#1:143\n124#1:144,3\n*E\n"})
/* loaded from: classes8.dex */
public final class f {
    @l
    public static final ProtoBuf.Type a(@k ProtoBuf.Type type, @k g typeTable) {
        g0.p(type, "<this>");
        g0.p(typeTable, "typeTable");
        if (type.hasAbbreviatedType()) {
            return type.getAbbreviatedType();
        }
        if (type.hasAbbreviatedTypeId()) {
            return typeTable.a(type.getAbbreviatedTypeId());
        }
        return null;
    }

    @k
    public static final List<ProtoBuf.Type> b(@k ProtoBuf.Class r22, @k g typeTable) {
        g0.p(r22, "<this>");
        g0.p(typeTable, "typeTable");
        List<ProtoBuf.Type> contextReceiverTypeList = r22.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = r22.getContextReceiverTypeIdList();
            g0.o(contextReceiverTypeIdList, "getContextReceiverTypeIdList(...)");
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(i0.d0(list, 10));
            for (Integer num : list) {
                g0.m(num);
                contextReceiverTypeList.add(typeTable.a(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    @k
    public static final List<ProtoBuf.Type> c(@k ProtoBuf.Function function, @k g typeTable) {
        g0.p(function, "<this>");
        g0.p(typeTable, "typeTable");
        List<ProtoBuf.Type> contextReceiverTypeList = function.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = function.getContextReceiverTypeIdList();
            g0.o(contextReceiverTypeIdList, "getContextReceiverTypeIdList(...)");
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(i0.d0(list, 10));
            for (Integer num : list) {
                g0.m(num);
                contextReceiverTypeList.add(typeTable.a(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    @k
    public static final List<ProtoBuf.Type> d(@k ProtoBuf.Property property, @k g typeTable) {
        g0.p(property, "<this>");
        g0.p(typeTable, "typeTable");
        List<ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = property.getContextReceiverTypeIdList();
            g0.o(contextReceiverTypeIdList, "getContextReceiverTypeIdList(...)");
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(i0.d0(list, 10));
            for (Integer num : list) {
                g0.m(num);
                contextReceiverTypeList.add(typeTable.a(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    @k
    public static final ProtoBuf.Type e(@k ProtoBuf.TypeAlias typeAlias, @k g typeTable) {
        g0.p(typeAlias, "<this>");
        g0.p(typeTable, "typeTable");
        if (typeAlias.hasExpandedType()) {
            ProtoBuf.Type expandedType = typeAlias.getExpandedType();
            g0.o(expandedType, "getExpandedType(...)");
            return expandedType;
        }
        if (typeAlias.hasExpandedTypeId()) {
            return typeTable.a(typeAlias.getExpandedTypeId());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    @l
    public static final ProtoBuf.Type f(@k ProtoBuf.Type type, @k g typeTable) {
        g0.p(type, "<this>");
        g0.p(typeTable, "typeTable");
        if (type.hasFlexibleUpperBound()) {
            return type.getFlexibleUpperBound();
        }
        if (type.hasFlexibleUpperBoundId()) {
            return typeTable.a(type.getFlexibleUpperBoundId());
        }
        return null;
    }

    public static final boolean g(@k ProtoBuf.Function function) {
        g0.p(function, "<this>");
        return function.hasReceiverType() || function.hasReceiverTypeId();
    }

    public static final boolean h(@k ProtoBuf.Property property) {
        g0.p(property, "<this>");
        return property.hasReceiverType() || property.hasReceiverTypeId();
    }

    @l
    public static final ProtoBuf.Type i(@k ProtoBuf.Class r12, @k g typeTable) {
        g0.p(r12, "<this>");
        g0.p(typeTable, "typeTable");
        if (r12.hasInlineClassUnderlyingType()) {
            return r12.getInlineClassUnderlyingType();
        }
        if (r12.hasInlineClassUnderlyingTypeId()) {
            return typeTable.a(r12.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    @l
    public static final ProtoBuf.Type j(@k ProtoBuf.Type type, @k g typeTable) {
        g0.p(type, "<this>");
        g0.p(typeTable, "typeTable");
        if (type.hasOuterType()) {
            return type.getOuterType();
        }
        if (type.hasOuterTypeId()) {
            return typeTable.a(type.getOuterTypeId());
        }
        return null;
    }

    @l
    public static final ProtoBuf.Type k(@k ProtoBuf.Function function, @k g typeTable) {
        g0.p(function, "<this>");
        g0.p(typeTable, "typeTable");
        if (function.hasReceiverType()) {
            return function.getReceiverType();
        }
        if (function.hasReceiverTypeId()) {
            return typeTable.a(function.getReceiverTypeId());
        }
        return null;
    }

    @l
    public static final ProtoBuf.Type l(@k ProtoBuf.Property property, @k g typeTable) {
        g0.p(property, "<this>");
        g0.p(typeTable, "typeTable");
        if (property.hasReceiverType()) {
            return property.getReceiverType();
        }
        if (property.hasReceiverTypeId()) {
            return typeTable.a(property.getReceiverTypeId());
        }
        return null;
    }

    @k
    public static final ProtoBuf.Type m(@k ProtoBuf.Function function, @k g typeTable) {
        g0.p(function, "<this>");
        g0.p(typeTable, "typeTable");
        if (function.hasReturnType()) {
            ProtoBuf.Type returnType = function.getReturnType();
            g0.o(returnType, "getReturnType(...)");
            return returnType;
        }
        if (function.hasReturnTypeId()) {
            return typeTable.a(function.getReturnTypeId());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    @k
    public static final ProtoBuf.Type n(@k ProtoBuf.Property property, @k g typeTable) {
        g0.p(property, "<this>");
        g0.p(typeTable, "typeTable");
        if (property.hasReturnType()) {
            ProtoBuf.Type returnType = property.getReturnType();
            g0.o(returnType, "getReturnType(...)");
            return returnType;
        }
        if (property.hasReturnTypeId()) {
            return typeTable.a(property.getReturnTypeId());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    @k
    public static final List<ProtoBuf.Type> o(@k ProtoBuf.Class r22, @k g typeTable) {
        g0.p(r22, "<this>");
        g0.p(typeTable, "typeTable");
        List<ProtoBuf.Type> supertypeList = r22.getSupertypeList();
        if (supertypeList.isEmpty()) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            List<Integer> supertypeIdList = r22.getSupertypeIdList();
            g0.o(supertypeIdList, "getSupertypeIdList(...)");
            List<Integer> list = supertypeIdList;
            supertypeList = new ArrayList<>(i0.d0(list, 10));
            for (Integer num : list) {
                g0.m(num);
                supertypeList.add(typeTable.a(num.intValue()));
            }
        }
        return supertypeList;
    }

    @l
    public static final ProtoBuf.Type p(@k ProtoBuf.Type.Argument argument, @k g typeTable) {
        g0.p(argument, "<this>");
        g0.p(typeTable, "typeTable");
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return typeTable.a(argument.getTypeId());
        }
        return null;
    }

    @k
    public static final ProtoBuf.Type q(@k ProtoBuf.ValueParameter valueParameter, @k g typeTable) {
        g0.p(valueParameter, "<this>");
        g0.p(typeTable, "typeTable");
        if (valueParameter.hasType()) {
            ProtoBuf.Type type = valueParameter.getType();
            g0.o(type, "getType(...)");
            return type;
        }
        if (valueParameter.hasTypeId()) {
            return typeTable.a(valueParameter.getTypeId());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    @k
    public static final ProtoBuf.Type r(@k ProtoBuf.TypeAlias typeAlias, @k g typeTable) {
        g0.p(typeAlias, "<this>");
        g0.p(typeTable, "typeTable");
        if (typeAlias.hasUnderlyingType()) {
            ProtoBuf.Type underlyingType = typeAlias.getUnderlyingType();
            g0.o(underlyingType, "getUnderlyingType(...)");
            return underlyingType;
        }
        if (typeAlias.hasUnderlyingTypeId()) {
            return typeTable.a(typeAlias.getUnderlyingTypeId());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    @k
    public static final List<ProtoBuf.Type> s(@k ProtoBuf.TypeParameter typeParameter, @k g typeTable) {
        g0.p(typeParameter, "<this>");
        g0.p(typeTable, "typeTable");
        List<ProtoBuf.Type> upperBoundList = typeParameter.getUpperBoundList();
        if (upperBoundList.isEmpty()) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            List<Integer> upperBoundIdList = typeParameter.getUpperBoundIdList();
            g0.o(upperBoundIdList, "getUpperBoundIdList(...)");
            List<Integer> list = upperBoundIdList;
            upperBoundList = new ArrayList<>(i0.d0(list, 10));
            for (Integer num : list) {
                g0.m(num);
                upperBoundList.add(typeTable.a(num.intValue()));
            }
        }
        return upperBoundList;
    }

    @l
    public static final ProtoBuf.Type t(@k ProtoBuf.ValueParameter valueParameter, @k g typeTable) {
        g0.p(valueParameter, "<this>");
        g0.p(typeTable, "typeTable");
        if (valueParameter.hasVarargElementType()) {
            return valueParameter.getVarargElementType();
        }
        if (valueParameter.hasVarargElementTypeId()) {
            return typeTable.a(valueParameter.getVarargElementTypeId());
        }
        return null;
    }
}
