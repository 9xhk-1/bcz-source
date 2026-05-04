package h20;

import e30.c1;
import e30.r0;
import e30.u0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p implements a30.w {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final p f58131a = new p();

    @Override // a30.w
    @m80.k
    public r0 a(@m80.k ProtoBuf.Type proto, @m80.k String flexibleId, @m80.k c1 lowerBound, @m80.k c1 upperBound) {
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(flexibleId, "flexibleId");
        kotlin.jvm.internal.g0.p(lowerBound, "lowerBound");
        kotlin.jvm.internal.g0.p(upperBound, "upperBound");
        return !kotlin.jvm.internal.g0.g(flexibleId, "kotlin.jvm.PlatformType") ? g30.i.d(ErrorTypeKind.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString()) : proto.hasExtension(JvmProtoBuf.f67477g) ? new d20.j(lowerBound, upperBound) : u0.e(lowerBound, upperBound);
    }
}
