package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s1 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f7955b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7956c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7957d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final long f7958e = 1000000;

    /* renamed from: f, reason: collision with root package name */
    public static final long f7959f = 9223372036854L;

    /* renamed from: g, reason: collision with root package name */
    public static final long f7960g = 4611686018427387903L;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final h40.x0 f7954a = new h40.x0("REMOVED_TASK");

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final h40.x0 f7961h = new h40.x0("CLOSED_EMPTY");

    public static final long c(long j11) {
        return j11 / 1000000;
    }

    public static final long d(long j11) {
        if (j11 <= 0) {
            return 0L;
        }
        if (j11 >= f7959f) {
            return Long.MAX_VALUE;
        }
        return j11 * 1000000;
    }
}
