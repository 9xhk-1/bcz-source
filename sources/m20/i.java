package m20;

import a00.h0;
import a00.i0;
import a00.r0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.b;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import m20.d;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJvmProtoBufUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmProtoBufUtil.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmProtoBufUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1557#2:142\n1628#2,3:143\n1557#2:146\n1628#2,3:147\n1557#2:150\n1628#2,3:151\n1#3:154\n*S KotlinDebug\n*F\n+ 1 JvmProtoBufUtil.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmProtoBufUtil\n*L\n79#1:142\n79#1:143,3\n81#1:146\n81#1:147,3\n103#1:150\n103#1:151,3\n*E\n"})
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final i f71820a = new i();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final kotlin.reflect.jvm.internal.impl.protobuf.f f71821b;

    static {
        kotlin.reflect.jvm.internal.impl.protobuf.f d11 = kotlin.reflect.jvm.internal.impl.protobuf.f.d();
        JvmProtoBuf.a(d11);
        g0.o(d11, "apply(...)");
        f71821b = d11;
    }

    public static /* synthetic */ d.a d(i iVar, ProtoBuf.Property property, k20.c cVar, k20.g gVar, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        return iVar.c(property, cVar, gVar, z11);
    }

    @o
    public static final boolean f(@k ProtoBuf.Property proto) {
        g0.p(proto, "proto");
        b.C0752b a11 = c.f71798a.a();
        Object extension = proto.getExtension(JvmProtoBuf.f67475e);
        g0.o(extension, "getExtension(...)");
        Boolean d11 = a11.d(((Number) extension).intValue());
        g0.o(d11, "get(...)");
        return d11.booleanValue();
    }

    @o
    @k
    public static final Pair<f, ProtoBuf.Class> h(@k byte[] bytes, @k String[] strings) {
        g0.p(bytes, "bytes");
        g0.p(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(f71820a.k(byteArrayInputStream, strings), ProtoBuf.Class.parseFrom(byteArrayInputStream, f71821b));
    }

    @o
    @k
    public static final Pair<f, ProtoBuf.Class> i(@k String[] data, @k String[] strings) {
        g0.p(data, "data");
        g0.p(strings, "strings");
        byte[] e11 = a.e(data);
        g0.o(e11, "decodeBytes(...)");
        return h(e11, strings);
    }

    @o
    @k
    public static final Pair<f, ProtoBuf.Function> j(@k String[] data, @k String[] strings) {
        g0.p(data, "data");
        g0.p(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.e(data));
        return new Pair<>(f71820a.k(byteArrayInputStream, strings), ProtoBuf.Function.parseFrom(byteArrayInputStream, f71821b));
    }

    @o
    @k
    public static final Pair<f, ProtoBuf.Package> l(@k byte[] bytes, @k String[] strings) {
        g0.p(bytes, "bytes");
        g0.p(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(f71820a.k(byteArrayInputStream, strings), ProtoBuf.Package.parseFrom(byteArrayInputStream, f71821b));
    }

    @o
    @k
    public static final Pair<f, ProtoBuf.Package> m(@k String[] data, @k String[] strings) {
        g0.p(data, "data");
        g0.p(strings, "strings");
        byte[] e11 = a.e(data);
        g0.o(e11, "decodeBytes(...)");
        return l(e11, strings);
    }

    @k
    public final kotlin.reflect.jvm.internal.impl.protobuf.f a() {
        return f71821b;
    }

    @l
    public final d.b b(@k ProtoBuf.Constructor proto, @k k20.c nameResolver, @k k20.g typeTable) {
        String r32;
        g0.p(proto, "proto");
        g0.p(nameResolver, "nameResolver");
        g0.p(typeTable, "typeTable");
        GeneratedMessageLite.f<ProtoBuf.Constructor, JvmProtoBuf.JvmMethodSignature> constructorSignature = JvmProtoBuf.f67471a;
        g0.o(constructorSignature, "constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) k20.e.a(proto, constructorSignature);
        String string = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? "<init>" : nameResolver.getString(jvmMethodSignature.getName());
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
            g0.o(valueParameterList, "getValueParameterList(...)");
            List<ProtoBuf.ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            for (ProtoBuf.ValueParameter valueParameter : list) {
                i iVar = f71820a;
                g0.m(valueParameter);
                String g11 = iVar.g(k20.f.q(valueParameter, typeTable), nameResolver);
                if (g11 == null) {
                    return null;
                }
                arrayList.add(g11);
            }
            r32 = r0.r3(arrayList, "", pn.j.f81006c, ")V", 0, null, null, 56, null);
        } else {
            r32 = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new d.b(string, r32);
    }

    @l
    public final d.a c(@k ProtoBuf.Property proto, @k k20.c nameResolver, @k k20.g typeTable, boolean z11) {
        String g11;
        g0.p(proto, "proto");
        g0.p(nameResolver, "nameResolver");
        g0.p(typeTable, "typeTable");
        GeneratedMessageLite.f<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f67474d;
        g0.o(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) k20.e.a(proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        JvmProtoBuf.JvmFieldSignature field = jvmPropertySignature.hasField() ? jvmPropertySignature.getField() : null;
        if (field == null && z11) {
            return null;
        }
        int name = (field == null || !field.hasName()) ? proto.getName() : field.getName();
        if (field == null || !field.hasDesc()) {
            g11 = g(k20.f.n(proto, typeTable), nameResolver);
            if (g11 == null) {
                return null;
            }
        } else {
            g11 = nameResolver.getString(field.getDesc());
        }
        return new d.a(nameResolver.getString(name), g11);
    }

    @l
    public final d.b e(@k ProtoBuf.Function proto, @k k20.c nameResolver, @k k20.g typeTable) {
        String str;
        g0.p(proto, "proto");
        g0.p(nameResolver, "nameResolver");
        g0.p(typeTable, "typeTable");
        GeneratedMessageLite.f<ProtoBuf.Function, JvmProtoBuf.JvmMethodSignature> methodSignature = JvmProtoBuf.f67472b;
        g0.o(methodSignature, "methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) k20.e.a(proto, methodSignature);
        int name = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? proto.getName() : jvmMethodSignature.getName();
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List R = h0.R(k20.f.k(proto, typeTable));
            List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
            g0.o(valueParameterList, "getValueParameterList(...)");
            List<ProtoBuf.ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            for (ProtoBuf.ValueParameter valueParameter : list) {
                g0.m(valueParameter);
                arrayList.add(k20.f.q(valueParameter, typeTable));
            }
            List I4 = r0.I4(R, arrayList);
            ArrayList arrayList2 = new ArrayList(i0.d0(I4, 10));
            Iterator it = I4.iterator();
            while (it.hasNext()) {
                String g11 = f71820a.g((ProtoBuf.Type) it.next(), nameResolver);
                if (g11 == null) {
                    return null;
                }
                arrayList2.add(g11);
            }
            String g12 = g(k20.f.m(proto, typeTable), nameResolver);
            if (g12 == null) {
                return null;
            }
            str = r0.r3(arrayList2, "", pn.j.f81006c, pn.j.f81007d, 0, null, null, 56, null) + g12;
        } else {
            str = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new d.b(nameResolver.getString(name), str);
    }

    public final String g(ProtoBuf.Type type, k20.c cVar) {
        if (type.hasClassName()) {
            return b.b(cVar.a(type.getClassName()));
        }
        return null;
    }

    public final f k(InputStream inputStream, String[] strArr) {
        JvmProtoBuf.StringTableTypes parseDelimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(inputStream, f71821b);
        g0.o(parseDelimitedFrom, "parseDelimitedFrom(...)");
        return new f(parseDelimitedFrom, strArr);
    }
}
