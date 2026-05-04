package q10;

import a00.h0;
import a00.l1;
import e30.c1;
import e30.r0;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import n10.o;
import p10.a0;
import s20.y;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final n20.f f81411a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final n20.f f81412b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final n20.f f81413c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final n20.f f81414d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final n20.f f81415e;

    static {
        n20.f f11 = n20.f.f("message");
        g0.o(f11, "identifier(...)");
        f81411a = f11;
        n20.f f12 = n20.f.f("replaceWith");
        g0.o(f12, "identifier(...)");
        f81412b = f12;
        n20.f f13 = n20.f.f("level");
        g0.o(f13, "identifier(...)");
        f81413c = f13;
        n20.f f14 = n20.f.f("expression");
        g0.o(f14, "identifier(...)");
        f81414d = f14;
        n20.f f15 = n20.f.f("imports");
        g0.o(f15, "identifier(...)");
        f81415e = f15;
    }

    @m80.k
    public static final c b(@m80.k n10.j jVar, @m80.k String message, @m80.k String replaceWith, @m80.k String level, boolean z11) {
        g0.p(jVar, "<this>");
        g0.p(message, "message");
        g0.p(replaceWith, "replaceWith");
        g0.p(level, "level");
        k kVar = new k(jVar, o.a.B, l1.W(h1.a(f81414d, new y(replaceWith)), h1.a(f81415e, new s20.b(h0.J(), new e(jVar)))), false, 8, null);
        n20.c cVar = o.a.f74077y;
        Pair a11 = h1.a(f81411a, new y(message));
        Pair a12 = h1.a(f81412b, new s20.a(kVar));
        n20.f fVar = f81413c;
        n20.b c11 = n20.b.f74280d.c(o.a.A);
        n20.f f11 = n20.f.f(level);
        g0.o(f11, "identifier(...)");
        return new k(jVar, cVar, l1.W(a11, a12, h1.a(fVar, new s20.k(c11, f11))), z11);
    }

    public static /* synthetic */ c c(n10.j jVar, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        if ((i11 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return b(jVar, str, str2, str3, z11);
    }

    public static final r0 d(n10.j jVar, a0 module) {
        g0.p(module, "module");
        c1 l11 = module.q().l(Variance.INVARIANT, jVar.W());
        g0.o(l11, "getArrayType(...)");
        return l11;
    }
}
