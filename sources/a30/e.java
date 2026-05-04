package a30;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e extends a<q10.c> implements d<q10.c, s20.g<?>> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f f1750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@m80.k p10.a0 module, @m80.k p10.f0 notFoundClasses, @m80.k z20.a protocol) {
        super(protocol);
        kotlin.jvm.internal.g0.p(module, "module");
        kotlin.jvm.internal.g0.p(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        this.f1750b = new f(module, notFoundClasses);
    }

    @Override // a30.g
    @m80.k
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public q10.c g(@m80.k ProtoBuf.Annotation proto, @m80.k k20.c nameResolver) {
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        return this.f1750b.a(proto, nameResolver);
    }

    @Override // a30.d
    @m80.l
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public s20.g<?> c(@m80.k m0 container, @m80.k ProtoBuf.Property proto, @m80.k e30.r0 expectedType) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(expectedType, "expectedType");
        return null;
    }

    @Override // a30.d
    @m80.l
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public s20.g<?> a(@m80.k m0 container, @m80.k ProtoBuf.Property proto, @m80.k e30.r0 expectedType) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(expectedType, "expectedType");
        ProtoBuf.Annotation.Argument.Value value = (ProtoBuf.Annotation.Argument.Value) k20.e.a(proto, m().b());
        if (value == null) {
            return null;
        }
        return this.f1750b.f(expectedType, value, container.b());
    }
}
