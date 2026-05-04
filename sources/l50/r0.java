package l50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonPrimitiveDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
/* loaded from: classes8.dex */
public final class r0 extends c {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final k50.k f70063j;

    public /* synthetic */ r0(k50.a aVar, k50.k kVar, String str, int i11, kotlin.jvm.internal.v vVar) {
        this(aVar, kVar, (i11 & 4) != 0 ? null : str);
    }

    @Override // l50.c
    @m80.k
    public k50.k W(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        if (tag == u1.f70076a) {
            return o0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // i50.d
    public int decodeElementIndex(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return 0;
    }

    @Override // l50.c
    @m80.k
    public k50.k o0() {
        return this.f70063j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(@m80.k k50.a json, @m80.k k50.k value, @m80.l String str) {
        super(json, value, str, null);
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(value, "value");
        this.f70063j = value;
        L(u1.f70076a);
    }
}
