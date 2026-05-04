package a3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class j0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f1550a;

    /* renamed from: b, reason: collision with root package name */
    public int f1551b;

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<T> f1552c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void reset();
    }

    public j0() {
        this(16, Integer.MAX_VALUE);
    }

    public void a() {
        com.badlogic.gdx.utils.a<T> aVar = this.f1552c;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            b(aVar.get(i12));
        }
        aVar.clear();
    }

    public void b(T t11) {
        i(t11);
    }

    public void c(int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            com.badlogic.gdx.utils.a<T> aVar = this.f1552c;
            if (aVar.f13179b < this.f1550a) {
                aVar.a(g());
            }
        }
        this.f1551b = Math.max(this.f1551b, this.f1552c.f13179b);
    }

    public void d(T t11) {
        if (t11 == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        com.badlogic.gdx.utils.a<T> aVar = this.f1552c;
        if (aVar.f13179b >= this.f1550a) {
            b(t11);
            return;
        }
        aVar.a(t11);
        this.f1551b = Math.max(this.f1551b, this.f1552c.f13179b);
        i(t11);
    }

    public void e(com.badlogic.gdx.utils.a<T> aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("objects cannot be null.");
        }
        com.badlogic.gdx.utils.a<T> aVar2 = this.f1552c;
        int i11 = this.f1550a;
        int i12 = aVar.f13179b;
        for (int i13 = 0; i13 < i12; i13++) {
            T t11 = aVar.get(i13);
            if (t11 != null) {
                if (aVar2.f13179b < i11) {
                    aVar2.a(t11);
                    i(t11);
                } else {
                    b(t11);
                }
            }
        }
        this.f1551b = Math.max(this.f1551b, aVar2.f13179b);
    }

    public int f() {
        return this.f1552c.f13179b;
    }

    public abstract T g();

    public T h() {
        com.badlogic.gdx.utils.a<T> aVar = this.f1552c;
        return aVar.f13179b == 0 ? g() : aVar.pop();
    }

    public void i(T t11) {
        if (t11 instanceof a) {
            ((a) t11).reset();
        }
    }

    public j0(int i11) {
        this(i11, Integer.MAX_VALUE);
    }

    public j0(int i11, int i12) {
        this.f1552c = new com.badlogic.gdx.utils.a<>(false, i11);
        this.f1550a = i12;
    }
}
