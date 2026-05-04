package f0;

import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "GifDecodeUtils")
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final ByteString f50324a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final ByteString f50325b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final ByteString f50326c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final ByteString f50327d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final ByteString f50328e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final ByteString f50329f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final ByteString f50330g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final ByteString f50331h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final ByteString f50332i;

    static {
        ByteString.a aVar = ByteString.Companion;
        f50324a = aVar.l("GIF87a");
        f50325b = aVar.l("GIF89a");
        f50326c = aVar.l("RIFF");
        f50327d = aVar.l("WEBP");
        f50328e = aVar.l("VP8X");
        f50329f = aVar.l("ftyp");
        f50330g = aVar.l("msf1");
        f50331h = aVar.l("hevc");
        f50332i = aVar.l("hevx");
    }

    public static final boolean a(@m80.k g gVar, @m80.k l60.m mVar) {
        if (d(gVar, mVar)) {
            return mVar.J0(8L, f50330g) || mVar.J0(8L, f50331h) || mVar.J0(8L, f50332i);
        }
        return false;
    }

    public static final boolean b(@m80.k g gVar, @m80.k l60.m mVar) {
        return e(gVar, mVar) && mVar.J0(12L, f50328e) && mVar.request(17L) && ((byte) (mVar.getBuffer().x0(16L) & 2)) > 0;
    }

    public static final boolean c(@m80.k g gVar, @m80.k l60.m mVar) {
        return mVar.J0(0L, f50325b) || mVar.J0(0L, f50324a);
    }

    public static final boolean d(@m80.k g gVar, @m80.k l60.m mVar) {
        return mVar.J0(4L, f50329f);
    }

    public static final boolean e(@m80.k g gVar, @m80.k l60.m mVar) {
        return mVar.J0(0L, f50326c) && mVar.J0(8L, f50327d);
    }
}
