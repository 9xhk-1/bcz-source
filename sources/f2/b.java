package f2;

import e2.g;
import i2.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class b<T extends f> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<T> f50374a;

    /* renamed from: b, reason: collision with root package name */
    public int f50375b;

    /* renamed from: c, reason: collision with root package name */
    public int f50376c = 0;

    /* renamed from: d, reason: collision with root package name */
    public g f50377d = new g.a();

    /* renamed from: e, reason: collision with root package name */
    public com.badlogic.gdx.graphics.a f50378e;

    public b(Class<T> cls) {
        this.f50374a = new com.badlogic.gdx.utils.a<>(false, 10, cls);
    }

    @Override // f2.d
    public void I(T t11) {
        if (t11.f60126a.f48380e.f48329c > 0) {
            this.f50374a.a(t11);
            this.f50375b += t11.f60126a.f48380e.f48329c;
        }
    }

    public abstract void a(int i11);

    @Override // f2.d
    public void c() {
        this.f50374a.clear();
        this.f50375b = 0;
    }

    public void d(int i11) {
        if (this.f50376c >= i11) {
            return;
        }
        this.f50377d.a(i11);
        a(i11);
        this.f50376c = i11;
    }

    public abstract void e(int[] iArr);

    @Override // f2.d
    public void end() {
        int i11 = this.f50375b;
        if (i11 > 0) {
            d(i11);
            e(this.f50377d.c(this.f50374a));
        }
    }

    public int f() {
        return this.f50375b;
    }

    public g g() {
        return this.f50377d;
    }

    public void h() {
        this.f50375b = 0;
        this.f50376c = 0;
    }

    public void i(com.badlogic.gdx.graphics.a aVar) {
        this.f50378e = aVar;
        this.f50377d.b(aVar);
    }

    public void j(g gVar) {
        this.f50377d = gVar;
        gVar.b(this.f50378e);
        gVar.a(this.f50376c);
    }
}
