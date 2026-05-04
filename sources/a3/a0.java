package a3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f1437c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1438d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f1439e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f1440f = 3;

    /* renamed from: a, reason: collision with root package name */
    public final String f1441a;

    /* renamed from: b, reason: collision with root package name */
    public int f1442b;

    public a0(String str) {
        this(str, 1);
    }

    public void a(String str) {
        if (this.f1442b >= 3) {
            q1.g.f81378a.e(this.f1441a, str);
        }
    }

    public void b(String str, Exception exc) {
        if (this.f1442b >= 3) {
            q1.g.f81378a.d(this.f1441a, str, exc);
        }
    }

    public void c(String str) {
        if (this.f1442b >= 1) {
            q1.g.f81378a.h(this.f1441a, str);
        }
    }

    public void d(String str, Throwable th2) {
        if (this.f1442b >= 1) {
            q1.g.f81378a.a(this.f1441a, str, th2);
        }
    }

    public int e() {
        return this.f1442b;
    }

    public void f(String str) {
        if (this.f1442b >= 2) {
            q1.g.f81378a.f(this.f1441a, str);
        }
    }

    public void g(String str, Exception exc) {
        if (this.f1442b >= 2) {
            q1.g.f81378a.c(this.f1441a, str, exc);
        }
    }

    public void h(int i11) {
        this.f1442b = i11;
    }

    public a0(String str, int i11) {
        this.f1441a = str;
        this.f1442b = i11;
    }
}
