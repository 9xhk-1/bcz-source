package s40;

import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.datetime.LocalDate;
import s40.g0;
import s40.m0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f87575a = yz.e0.c(new x00.a() { // from class: s40.y0
        @Override // x00.a
        public final Object invoke() {
            e0 g11;
            g11 = b1.g();
            return g11;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f87576b = yz.e0.c(new x00.a() { // from class: s40.z0
        @Override // x00.a
        public final Object invoke() {
            e0 e11;
            e11 = b1.e();
            return e11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final r0 f87577c = new r0(null, null, null, null, 15, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f87578a = new a();

        public a() {
            super(1, t40.g.class, "toKotlinCode", "toKotlinCode(Ljava/lang/String;)Ljava/lang/String;", 1);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return t40.g.b(p02);
        }
    }

    public static final e0 e() {
        return w0.f87800c.a(new x00.l() { // from class: s40.x0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 f11;
                f11 = b1.f((g0.a) obj);
                return f11;
            }
        });
    }

    public static final yz.g2 f(g0.a build) {
        kotlin.jvm.internal.g0.p(build, "$this$build");
        g0.f.P0(build, null, 1, null);
        g0.f.I(build, null, 1, null);
        g0.a.W(build, null, 1, null);
        return yz.g2.f100423a;
    }

    public static final e0 g() {
        return w0.f87800c.a(new x00.l() { // from class: s40.a1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 h11;
                h11 = b1.h((g0.a) obj);
                return h11;
            }
        });
    }

    public static final yz.g2 h(g0.a build) {
        kotlin.jvm.internal.g0.p(build, "$this$build");
        g0.f.P0(build, null, 1, null);
        h0.c(build, '-');
        g0.f.I(build, null, 1, null);
        h0.c(build, '-');
        g0.a.W(build, null, 1, null);
        return yz.g2.f100423a;
    }

    @m80.k
    public static final e0<LocalDate> k() {
        return (e0) f87575a.getValue();
    }

    @m80.k
    public static final e0<LocalDate> l() {
        return (e0) f87576b.getValue();
    }

    public static final String m(m0 m0Var) {
        List<String> c11 = m0Var.c();
        m0.a aVar = m0.f87732b;
        if (kotlin.jvm.internal.g0.g(c11, aVar.b().c())) {
            return "DayOfWeekNames.ENGLISH_FULL";
        }
        if (!kotlin.jvm.internal.g0.g(c11, aVar.a().c())) {
            return a00.r0.r3(m0Var.c(), org.junit.jupiter.api.j2.O, "DayOfWeekNames(", pn.j.f81007d, 0, null, a.f87578a, 24, null);
        }
        return "DayOfWeekNames.ENGLISH_ABBREVIATED";
    }
}
