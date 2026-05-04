package fa;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f51446c = 2;

    /* renamed from: a, reason: collision with root package name */
    public int f51447a = 2;

    /* renamed from: b, reason: collision with root package name */
    public int f51448b;

    public void a() {
        this.f51448b++;
    }

    public boolean b() {
        return this.f51448b < this.f51447a;
    }

    public void c() {
        this.f51448b = 0;
    }

    public void d(int maxCount) {
        this.f51447a = maxCount;
    }
}
