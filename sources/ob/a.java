package ob;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a<R, E> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f76738e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f76739f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f76740g = 3;

    /* renamed from: a, reason: collision with root package name */
    public R f76741a;

    /* renamed from: b, reason: collision with root package name */
    public E f76742b;

    /* renamed from: c, reason: collision with root package name */
    public int f76743c;

    /* renamed from: d, reason: collision with root package name */
    public int f76744d;

    public a(int signal) {
        this.f76744d = signal;
    }

    public E a() {
        return this.f76742b;
    }

    public int b() {
        return this.f76743c;
    }

    public R c() {
        return this.f76741a;
    }

    public int d() {
        return this.f76744d;
    }

    public void e(E error) {
        this.f76742b = error;
    }

    public void f(int progress) {
        this.f76743c = progress;
    }

    public void g(R result) {
        this.f76741a = result;
    }

    public void h(int signal) {
        this.f76744d = signal;
    }
}
