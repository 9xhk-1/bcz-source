package n20;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSpecialNames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialNames.kt\norg/jetbrains/kotlin/name/SpecialNames\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final h f74300a = new h();

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74301b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74302c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74303d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74304e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74305f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final c f74306g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74307h;

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74308i;

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74309j;

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74310k;

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74311l;

    /* renamed from: m, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74312m;

    /* renamed from: n, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74313n;

    /* renamed from: o, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74314o;

    /* renamed from: p, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74315p;

    /* renamed from: q, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74316q;

    /* renamed from: r, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f f74317r;

    static {
        f k11 = f.k("<no name provided>");
        g0.o(k11, "special(...)");
        f74301b = k11;
        f k12 = f.k("<root package>");
        g0.o(k12, "special(...)");
        f74302c = k12;
        f f11 = f.f("Companion");
        g0.o(f11, "identifier(...)");
        f74303d = f11;
        f f12 = f.f("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        g0.o(f12, "identifier(...)");
        f74304e = f12;
        f k13 = f.k("<anonymous>");
        g0.o(k13, "special(...)");
        f74305f = k13;
        c k14 = c.k(f.k("<anonymous>"));
        g0.o(k14, "topLevel(...)");
        f74306g = k14;
        f k15 = f.k("<unary>");
        g0.o(k15, "special(...)");
        f74307h = k15;
        f k16 = f.k("<this>");
        g0.o(k16, "special(...)");
        f74308i = k16;
        f k17 = f.k("<init>");
        g0.o(k17, "special(...)");
        f74309j = k17;
        f k18 = f.k("<iterator>");
        g0.o(k18, "special(...)");
        f74310k = k18;
        f k19 = f.k("<destruct>");
        g0.o(k19, "special(...)");
        f74311l = k19;
        f k21 = f.k("<local>");
        g0.o(k21, "special(...)");
        f74312m = k21;
        f k22 = f.k("<unused var>");
        g0.o(k22, "special(...)");
        f74313n = k22;
        f k23 = f.k("<set-?>");
        g0.o(k23, "special(...)");
        f74314o = k23;
        f k24 = f.k("<array>");
        g0.o(k24, "special(...)");
        f74315p = k24;
        f k25 = f.k("<receiver>");
        g0.o(k25, "special(...)");
        f74316q = k25;
        f k26 = f.k("<get-entries>");
        g0.o(k26, "special(...)");
        f74317r = k26;
    }

    @o
    @m80.k
    public static final f b(@l f fVar) {
        return (fVar == null || fVar.g()) ? f74304e : fVar;
    }

    public final boolean a(@m80.k f name) {
        g0.p(name, "name");
        String b11 = name.b();
        g0.o(b11, "asString(...)");
        return b11.length() > 0 && !name.g();
    }
}
