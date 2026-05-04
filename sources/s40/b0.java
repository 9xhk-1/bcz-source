package s40;

import s40.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b0 extends s40.a<l, a0> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final u40.f<a0> f87573b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements b<a0, a>, d, e, g0.c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final u40.d<a0> f87574a;

        public a(@m80.k u40.d<a0> actualBuilder) {
            kotlin.jvm.internal.g0.p(actualBuilder, "actualBuilder");
            this.f87574a = actualBuilder;
        }

        @Override // s40.g0.c
        public void C() {
            p0().a(new u40.e(new a2()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s40.e
        public void F0(@m80.k u40.o<? super h2> structure) {
            kotlin.jvm.internal.g0.p(structure, "structure");
            p0().a(structure);
        }

        /* JADX WARN: Multi-variable type inference failed */
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

        @Override // s40.g0.c
        public void h0(@m80.k e0<l> format) {
            kotlin.jvm.internal.g0.p(format, "format");
            if (format instanceof b0) {
                p0().a(((b0) format).e());
            }
        }

        @Override // s40.b
        @m80.k
        public u40.d<a0> p0() {
            return this.f87574a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(@m80.k u40.f<? super a0> actualFormat) {
        super(null);
        kotlin.jvm.internal.g0.p(actualFormat, "actualFormat");
        this.f87573b = actualFormat;
    }

    @Override // s40.a
    @m80.k
    public u40.f<a0> e() {
        return this.f87573b;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a0 f() {
        a0 a0Var;
        a0Var = c0.f87581b;
        return a0Var;
    }

    @Override // s40.a
    @m80.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a0 g(@m80.k l value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value.c();
    }

    @Override // s40.a
    @m80.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public l h(@m80.k a0 intermediate) {
        kotlin.jvm.internal.g0.p(intermediate, "intermediate");
        return new l(intermediate);
    }
}
