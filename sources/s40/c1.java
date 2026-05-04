package s40;

import kotlinx.datetime.LocalDateTime;
import s40.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLocalDateTimeFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDateTimeFormat.kt\nkotlinx/datetime/format/LocalDateTimeFormat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* loaded from: classes8.dex */
public final class c1 extends s40.a<LocalDateTime, s0> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f87583c = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final u40.f<d0> f87584b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements s40.b<d0, a>, d {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final u40.d<d0> f87585a;

        public a(@m80.k u40.d<d0> actualBuilder) {
            kotlin.jvm.internal.g0.p(actualBuilder, "actualBuilder");
            this.f87585a = actualBuilder;
        }

        @Override // s40.d
        public void X(@m80.k u40.o<? super d0> structure) {
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
        public u40.d<d0> p0() {
            return this.f87585a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final c1 a(@m80.k x00.l<? super g0.b, yz.g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            a aVar = new a(new u40.d());
            block.invoke(aVar);
            return new c1(aVar.build());
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1(@m80.k u40.f<? super d0> actualFormat) {
        super(null);
        kotlin.jvm.internal.g0.p(actualFormat, "actualFormat");
        this.f87584b = actualFormat;
    }

    @Override // s40.a
    @m80.k
    public u40.f<s0> e() {
        return this.f87584b;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public s0 f() {
        s0 s0Var;
        s0Var = h1.f87681b;
        return s0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s40.a
    @m80.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public s0 g(@m80.k LocalDateTime value) {
        kotlin.jvm.internal.g0.p(value, "value");
        s0 s0Var = new s0(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        s0Var.p(value);
        return s0Var;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public LocalDateTime h(@m80.k s0 intermediate) {
        kotlin.jvm.internal.g0.p(intermediate, "intermediate");
        return intermediate.r();
    }
}
