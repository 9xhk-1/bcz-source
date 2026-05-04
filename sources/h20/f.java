package h20;

import h20.a0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import m20.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {
    @m80.l
    public static final a0 a(@m80.k ProtoBuf.Property proto, @m80.k k20.c nameResolver, @m80.k k20.g typeTable, boolean z11, boolean z12, boolean z13) {
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        kotlin.jvm.internal.g0.p(typeTable, "typeTable");
        GeneratedMessageLite.f<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f67474d;
        kotlin.jvm.internal.g0.o(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) k20.e.a(proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (z11) {
            d.a c11 = m20.i.f71820a.c(proto, nameResolver, typeTable, z13);
            if (c11 == null) {
                return null;
            }
            return a0.f58041b.b(c11);
        }
        if (!z12 || !jvmPropertySignature.hasSyntheticMethod()) {
            return null;
        }
        a0.a aVar = a0.f58041b;
        JvmProtoBuf.JvmMethodSignature syntheticMethod = jvmPropertySignature.getSyntheticMethod();
        kotlin.jvm.internal.g0.o(syntheticMethod, "getSyntheticMethod(...)");
        return aVar.c(nameResolver, syntheticMethod);
    }

    public static /* synthetic */ a0 b(ProtoBuf.Property property, k20.c cVar, k20.g gVar, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        if ((i11 & 16) != 0) {
            z12 = false;
        }
        if ((i11 & 32) != 0) {
            z13 = true;
        }
        return a(property, cVar, gVar, z11, z12, z13);
    }
}
