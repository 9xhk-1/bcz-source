package s40;

import kotlinx.datetime.UtcOffset;
import s40.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUtcOffsetFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtcOffsetFormat.kt\nkotlinx/datetime/format/UtcOffsetFormat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
/* loaded from: classes8.dex */
public final class i2 extends s40.a<UtcOffset, u0> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f87688c = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final u40.f<h2> f87689b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements s40.b<h2, a>, e {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final u40.d<h2> f87690a;

        public a(@m80.k u40.d<h2> actualBuilder) {
            kotlin.jvm.internal.g0.p(actualBuilder, "actualBuilder");
            this.f87690a = actualBuilder;
        }

        @Override // s40.e
        public void F0(@m80.k u40.o<? super h2> structure) {
            kotlin.jvm.internal.g0.p(structure, "structure");
            p0().a(structure);
        }

        @Override // s40.b
        @m80.k
        /* renamed from: d1, reason: merged with bridge method [inline-methods] */
        public a G0() {
            return new a(new u40.d());
        }

        @Override // s40.b
        @m80.k
        public u40.d<h2> p0() {
            return this.f87690a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final i2 a(@m80.k x00.l<? super g0.e, yz.g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            a aVar = new a(new u40.d());
            block.invoke(aVar);
            return new i2(aVar.build());
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i2(@m80.k u40.f<? super h2> actualFormat) {
        super(null);
        kotlin.jvm.internal.g0.p(actualFormat, "actualFormat");
        this.f87689b = actualFormat;
    }

    @Override // s40.a
    @m80.k
    public u40.f<u0> e() {
        return this.f87689b;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public u0 f() {
        u0 u0Var;
        u0Var = e3.f87667d;
        return u0Var;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public u0 g(@m80.k UtcOffset value) {
        kotlin.jvm.internal.g0.p(value, "value");
        u0 u0Var = new u0(null, null, null, null, 15, null);
        u0Var.c(value);
        return u0Var;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public UtcOffset h(@m80.k u0 intermediate) {
        kotlin.jvm.internal.g0.p(intermediate, "intermediate");
        return intermediate.d();
    }
}
