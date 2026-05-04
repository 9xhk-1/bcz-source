package s40;

import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.YearMonth;
import kotlinx.datetime.format.Padding;
import s40.g0;
import s40.s1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f87744a = " /** TODO: the original format had an `y` directive, so the behavior is different on years earlier than 1 AD. See the [kotlinx.datetime.format.byUnicodePattern] documentation for details. */";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final v0 f87745b = new v0(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f87746c = yz.e0.c(new x00.a() { // from class: s40.m3
        @Override // x00.a
        public final Object invoke() {
            e0 c11;
            c11 = o3.c();
            return c11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f87747a = new a();

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

    public static final e0 c() {
        return l3.f87729c.a(new x00.l() { // from class: s40.n3
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 d11;
                d11 = o3.d((g0.f) obj);
                return d11;
            }
        });
    }

    public static final yz.g2 d(g0.f build) {
        kotlin.jvm.internal.g0.p(build, "$this$build");
        g0.f.P0(build, null, 1, null);
        h0.c(build, '-');
        g0.f.I(build, null, 1, null);
        return yz.g2.f100423a;
    }

    @m80.k
    public static final e0<YearMonth> g() {
        return (e0) f87746c.getValue();
    }

    public static final <T> T h(@m80.l T t11, @m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        if (t11 != null) {
            return t11;
        }
        throw new DateTimeFormatException("Can not create a " + name + " from the given input: the field " + name + " is missing");
    }

    public static final String i(s1 s1Var) {
        List<String> c11 = s1Var.c();
        s1.a aVar = s1.f87766b;
        if (kotlin.jvm.internal.g0.g(c11, aVar.b().c())) {
            return "MonthNames.ENGLISH_FULL";
        }
        if (!kotlin.jvm.internal.g0.g(c11, aVar.a().c())) {
            return a00.r0.r3(s1Var.c(), org.junit.jupiter.api.j2.O, "MonthNames(", pn.j.f81007d, 0, null, a.f87747a, 24, null);
        }
        return "MonthNames.ENGLISH_ABBREVIATED";
    }

    public static final void j(@m80.k g0.f fVar, @m80.k Padding padding) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(padding, "padding");
        if (fVar instanceof g) {
            ((g) fVar).m(new u40.e(new i3(padding, true)));
        }
    }

    public static final void k(@m80.k g0.f fVar, int i11) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        if (fVar instanceof g) {
            ((g) fVar).m(new u40.e(new v1(i11, true)));
        }
    }
}
