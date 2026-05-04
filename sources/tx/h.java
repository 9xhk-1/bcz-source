package tx;

import tx.p0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements x00.l<?, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f91087a = new a();

        public final void a(p0 configure) {
            kotlin.jvm.internal.g0.p(configure, "$this$configure");
            if (configure instanceof p0.e) {
                ((p0.e) configure).z(true);
            }
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
            a((p0) obj);
            return g2.f100423a;
        }
    }

    @m80.k
    public static final n0 a(@m80.k sx.g selector) {
        kotlin.jvm.internal.g0.p(selector, "selector");
        return new n0(selector, p0.f91164e.a());
    }

    @yz.n(message = "noDelay is true by default", replaceWith = @yz.w0(expression = "this", imports = {}))
    @m80.k
    public static final <T extends m<? extends T, ?>> T b(@m80.k T t11) {
        kotlin.jvm.internal.g0.p(t11, "<this>");
        return (T) t11.b(a.f91087a);
    }
}
