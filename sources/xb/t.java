package xb;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public long f97996a;

    /* renamed from: b, reason: collision with root package name */
    public long f97997b;

    public void a() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f97996a = currentTimeMillis;
        this.f97997b = currentTimeMillis;
    }

    public long b() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f97997b = currentTimeMillis;
        return currentTimeMillis - this.f97996a;
    }

    public long c() {
        return this.f97997b - this.f97996a;
    }
}
