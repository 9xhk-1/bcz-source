package u30;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d f91598a = new d();

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final Charset f91599b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final Charset f91600c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final Charset f91601d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final Charset f91602e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final Charset f91603f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final Charset f91604g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public static volatile Charset f91605h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public static volatile Charset f91606i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public static volatile Charset f91607j;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.g0.o(forName, "forName(...)");
        f91599b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        kotlin.jvm.internal.g0.o(forName2, "forName(...)");
        f91600c = forName2;
        Charset forName3 = Charset.forName(n60.c.f74536d);
        kotlin.jvm.internal.g0.o(forName3, "forName(...)");
        f91601d = forName3;
        Charset forName4 = Charset.forName(n60.c.f74537e);
        kotlin.jvm.internal.g0.o(forName4, "forName(...)");
        f91602e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.g0.o(forName5, "forName(...)");
        f91603f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.g0.o(forName6, "forName(...)");
        f91604g = forName6;
    }

    @w00.j(name = "UTF32")
    @m80.k
    public final Charset a() {
        Charset charset = f91605h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32");
        kotlin.jvm.internal.g0.o(forName, "forName(...)");
        f91605h = forName;
        return forName;
    }

    @w00.j(name = "UTF32_BE")
    @m80.k
    public final Charset b() {
        Charset charset = f91607j;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        kotlin.jvm.internal.g0.o(forName, "forName(...)");
        f91607j = forName;
        return forName;
    }

    @w00.j(name = "UTF32_LE")
    @m80.k
    public final Charset c() {
        Charset charset = f91606i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.g0.o(forName, "forName(...)");
        f91606i = forName;
        return forName;
    }
}
