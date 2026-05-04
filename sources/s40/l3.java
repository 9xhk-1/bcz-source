package s40;

import kotlinx.datetime.YearMonth;
import s40.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nYearMonthFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YearMonthFormat.kt\nkotlinx/datetime/format/YearMonthFormat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
/* loaded from: classes8.dex */
public final class l3 extends s40.a<YearMonth, v0> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f87729c = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final u40.f<j3> f87730b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements s40.b<j3, a>, g {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final u40.d<j3> f87731a;

        public a(@m80.k u40.d<j3> actualBuilder) {
            kotlin.jvm.internal.g0.p(actualBuilder, "actualBuilder");
            this.f87731a = actualBuilder;
        }

        @Override // s40.b
        @m80.k
        /* renamed from: d1, reason: merged with bridge method [inline-methods] */
        public a G0() {
            return new a(new u40.d());
        }

        @Override // s40.g
        public void m(@m80.k u40.o<? super j3> structure) {
            kotlin.jvm.internal.g0.p(structure, "structure");
            p0().a(structure);
        }

        @Override // s40.b
        @m80.k
        public u40.d<j3> p0() {
            return this.f87731a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final e0<YearMonth> a(@m80.k x00.l<? super g0.f, yz.g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            a aVar = new a(new u40.d());
            block.invoke(aVar);
            return new l3(aVar.build());
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l3(@m80.k u40.f<? super j3> actualFormat) {
        super(null);
        kotlin.jvm.internal.g0.p(actualFormat, "actualFormat");
        this.f87730b = actualFormat;
    }

    @Override // s40.a
    @m80.k
    public u40.f<v0> e() {
        return this.f87730b;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public v0 f() {
        v0 v0Var;
        v0Var = o3.f87745b;
        return v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s40.a
    @m80.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public v0 g(@m80.k YearMonth value) {
        kotlin.jvm.internal.g0.p(value, "value");
        v0 v0Var = new v0(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        v0Var.d(value);
        return v0Var;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public YearMonth h(@m80.k v0 intermediate) {
        kotlin.jvm.internal.g0.p(intermediate, "intermediate");
        return intermediate.e();
    }
}
