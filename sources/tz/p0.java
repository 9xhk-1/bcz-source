package tz;

/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: c, reason: collision with root package name */
    public static final p0 f91349c = new p0(1, "未初始化");

    /* renamed from: d, reason: collision with root package name */
    public static final p0 f91350d = new p0(2, "正在初始化");

    /* renamed from: e, reason: collision with root package name */
    public static final p0 f91351e = new p0(-1, "初始化失败");

    /* renamed from: f, reason: collision with root package name */
    public static final p0 f91352f = new p0(0, "初始化成功");

    /* renamed from: g, reason: collision with root package name */
    public static final p0 f91353g = new p0(-2, "初始化错误");

    /* renamed from: a, reason: collision with root package name */
    public final int f91354a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91355b;

    public p0(int i11, String str) {
        this.f91354a = i11;
        this.f91355b = str;
    }

    public static p0 b(int i11) {
        return i11 != -2 ? i11 != -1 ? i11 != 0 ? i11 != 2 ? f91349c : f91350d : f91352f : f91351e : f91353g;
    }

    public int a() {
        return this.f91354a;
    }
}
