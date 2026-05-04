package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s2 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f7966e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7967f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7968g = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f7972k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f7973l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static final int f7974m = 4;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final h40.x0 f7962a = new h40.x0("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final h40.x0 f7963b = new h40.x0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final h40.x0 f7964c = new h40.x0("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final h40.x0 f7965d = new h40.x0("TOO_LATE_TO_CANCEL");

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final h40.x0 f7969h = new h40.x0("SEALED");

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final n1 f7970i = new n1(false);

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final n1 f7971j = new n1(true);

    @m80.l
    public static final Object g(@m80.l Object obj) {
        return obj instanceof e2 ? new f2((e2) obj) : obj;
    }

    @m80.l
    public static final Object h(@m80.l Object obj) {
        e2 e2Var;
        f2 f2Var = obj instanceof f2 ? (f2) obj : null;
        return (f2Var == null || (e2Var = f2Var.f7856a) == null) ? obj : e2Var;
    }
}
