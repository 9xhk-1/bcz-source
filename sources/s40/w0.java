package s40;

import kotlinx.datetime.LocalDate;
import s40.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLocalDateFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDateFormat.kt\nkotlinx/datetime/format/LocalDateFormat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
/* loaded from: classes8.dex */
public final class w0 extends s40.a<LocalDate, r0> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f87800c = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final u40.f<j> f87801b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements s40.b<j, a>, c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final u40.d<j> f87802a;

        public a(@m80.k u40.d<j> actualBuilder) {
            kotlin.jvm.internal.g0.p(actualBuilder, "actualBuilder");
            this.f87802a = actualBuilder;
        }

        @Override // s40.b
        @m80.k
        /* renamed from: d1, reason: merged with bridge method [inline-methods] */
        public a G0() {
            return new a(new u40.d());
        }

        @Override // s40.c
        public void n(@m80.k u40.o<? super j> structure) {
            kotlin.jvm.internal.g0.p(structure, "structure");
            p0().a(structure);
        }

        @Override // s40.b
        @m80.k
        public u40.d<j> p0() {
            return this.f87802a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final e0<LocalDate> a(@m80.k x00.l<? super g0.a, yz.g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            a aVar = new a(new u40.d());
            block.invoke(aVar);
            return new w0(aVar.build());
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(@m80.k u40.f<? super j> actualFormat) {
        super(null);
        kotlin.jvm.internal.g0.p(actualFormat, "actualFormat");
        this.f87801b = actualFormat;
    }

    @Override // s40.a
    @m80.k
    public u40.f<r0> e() {
        return this.f87801b;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public r0 f() {
        r0 r0Var;
        r0Var = b1.f87577c;
        return r0Var;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public r0 g(@m80.k LocalDate value) {
        kotlin.jvm.internal.g0.p(value, "value");
        r0 r0Var = new r0(null, null, null, null, 15, null);
        r0Var.e(value);
        return r0Var;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public LocalDate h(@m80.k r0 intermediate) {
        kotlin.jvm.internal.g0.p(intermediate, "intermediate");
        return intermediate.f();
    }
}
