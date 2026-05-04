package l50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f69995a = 16384;

    /* renamed from: b, reason: collision with root package name */
    public static final int f69996b = 128;

    @m80.k
    public static final f1 a(@m80.k k50.a json, @m80.k c0 reader, @m80.k char[] buffer) {
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(reader, "reader");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        return !json.i().a() ? new f1(reader, buffer) : new h1(reader, buffer);
    }

    public static /* synthetic */ f1 b(k50.a aVar, c0 c0Var, char[] cArr, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            cArr = p.f70044c.d();
        }
        return a(aVar, c0Var, cArr);
    }
}
