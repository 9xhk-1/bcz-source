package h70;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final x70.f f58819a;

    /* renamed from: b, reason: collision with root package name */
    public final long f58820b;

    /* renamed from: c, reason: collision with root package name */
    public long f58821c;

    /* renamed from: d, reason: collision with root package name */
    public long f58822d;

    /* renamed from: e, reason: collision with root package name */
    public long f58823e;

    public u(x70.f fVar) {
        e80.a.j(fVar, "Session");
        this.f58819a = fVar;
        long currentTimeMillis = System.currentTimeMillis();
        this.f58820b = currentTimeMillis;
        this.f58821c = currentTimeMillis;
        this.f58822d = currentTimeMillis;
        this.f58823e = currentTimeMillis;
    }

    public long a() {
        return this.f58823e;
    }

    public long b() {
        return this.f58821c;
    }

    public long c() {
        return this.f58822d;
    }

    public x70.f d() {
        return this.f58819a;
    }

    public long e() {
        return this.f58820b;
    }

    public void f() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f58821c = currentTimeMillis;
        this.f58823e = currentTimeMillis;
    }

    public void g() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f58822d = currentTimeMillis;
        this.f58823e = currentTimeMillis;
    }
}
