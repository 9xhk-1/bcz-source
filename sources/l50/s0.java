package l50;

import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTreeJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/JsonPrimitiveEncoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,279:1\n1#2:280\n*E\n"})
/* loaded from: classes8.dex */
public final class s0 extends e {

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public k50.k f70066g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(@m80.k k50.a json, @m80.k x00.l<? super k50.k, g2> nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(nodeConsumer, "nodeConsumer");
        G(u1.f70076a);
    }

    @Override // l50.e
    @m80.k
    public k50.k a0() {
        k50.k kVar = this.f70066g;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // l50.e
    public void e0(@m80.k String key, @m80.k k50.k element) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(element, "element");
        if (key != u1.f70076a) {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.f70066g != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.f70066g = element;
        b0().invoke(element);
    }
}
