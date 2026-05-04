package s40;

import kotlinx.datetime.LocalTime;
import s40.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLocalTimeFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalTimeFormat.kt\nkotlinx/datetime/format/LocalTimeFormat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
/* loaded from: classes8.dex */
public final class i1 extends s40.a<LocalTime, t0> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f87685c = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final u40.f<y1> f87686b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements s40.b<y1, a>, f {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final u40.d<y1> f87687a;

        public a(@m80.k u40.d<y1> actualBuilder) {
            kotlin.jvm.internal.g0.p(actualBuilder, "actualBuilder");
            this.f87687a = actualBuilder;
        }

        @Override // s40.b
        @m80.k
        /* renamed from: d1, reason: merged with bridge method [inline-methods] */
        public a G0() {
            return new a(new u40.d());
        }

        @Override // s40.f
        public void l(@m80.k u40.o<? super y1> structure) {
            kotlin.jvm.internal.g0.p(structure, "structure");
            p0().a(structure);
        }

        @Override // s40.b
        @m80.k
        public u40.d<y1> p0() {
            return this.f87687a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final i1 a(@m80.k x00.l<? super g0.d, yz.g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            a aVar = new a(new u40.d());
            block.invoke(aVar);
            return new i1(aVar.build());
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i1(@m80.k u40.f<? super y1> actualFormat) {
        super(null);
        kotlin.jvm.internal.g0.p(actualFormat, "actualFormat");
        this.f87686b = actualFormat;
    }

    @Override // s40.a
    @m80.k
    public u40.f<t0> e() {
        return this.f87686b;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public t0 f() {
        t0 t0Var;
        t0Var = o1.f87743b;
        return t0Var;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public t0 g(@m80.k LocalTime value) {
        kotlin.jvm.internal.g0.p(value, "value");
        t0 t0Var = new t0(null, null, null, null, null, null, 63, null);
        t0Var.c(value);
        return t0Var;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public LocalTime h(@m80.k t0 intermediate) {
        kotlin.jvm.internal.g0.p(intermediate, "intermediate");
        return intermediate.f();
    }
}
