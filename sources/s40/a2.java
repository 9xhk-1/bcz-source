package s40;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a2 implements u40.l<a0> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<a0, String> {
        public a(Object obj) {
            super(1, obj, u40.b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(a0 p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return (String) ((u40.b) this.receiver).c(p02);
        }
    }

    @Override // u40.l
    @m80.k
    public v40.e<a0> a() {
        return new v40.j(new a(c().a()));
    }

    @Override // u40.l
    @m80.k
    public w40.t<a0> b() {
        return new w40.t<>(a00.g0.l(new w40.d0(c0.c().a())), a00.h0.J());
    }

    @Override // u40.l
    @m80.k
    public u40.n<a0, ?> c() {
        return c0.c();
    }

    @Override // u40.l
    @m80.k
    public String d() {
        return "timeZoneId()";
    }
}
