package io.ktor.util;

import io.ktor.util.Platform;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f61985a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f61986b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f61987c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f61988d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f61989e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f61990f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f61991g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f61992h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f61993i;

    static {
        a aVar = new a();
        f61985a = aVar;
        Platform a11 = b.a(aVar);
        boolean z11 = true;
        f61986b = !(a11 instanceof Platform.a) ? !((a11 instanceof Platform.d) && ((Platform.d) a11).d() == Platform.JsPlatform.Browser) : ((Platform.a) a11).d() != Platform.JsPlatform.Browser;
        Platform a12 = b.a(aVar);
        if (!(a12 instanceof Platform.a) ? !(a12 instanceof Platform.d) || ((Platform.d) a12).d() != Platform.JsPlatform.Node : ((Platform.a) a12).d() != Platform.JsPlatform.Node) {
            z11 = false;
        }
        f61987c = z11;
        f61988d = b.a(aVar) instanceof Platform.a;
        f61989e = b.a(aVar) instanceof Platform.d;
        f61990f = g0.g(b.a(aVar), Platform.b.f61982a);
        f61991g = g0.g(b.a(aVar), Platform.c.f61983a);
        f61992h = b.b(aVar);
        f61993i = b.c(aVar);
    }

    public final boolean a() {
        return f61986b;
    }

    public final boolean b() {
        return f61992h;
    }

    public final boolean c() {
        return f61988d;
    }

    public final boolean d() {
        return f61990f;
    }

    public final boolean e() {
        return f61991g;
    }

    public final boolean f() {
        return f61993i;
    }

    public final boolean g() {
        return f61987c;
    }

    public final boolean h() {
        return f61989e;
    }
}
