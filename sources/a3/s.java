package a3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class s<T> extends j0<T> {

    /* renamed from: d, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<T> f1628d;

    public s() {
        this.f1628d = new com.badlogic.gdx.utils.a<>();
    }

    @Override // a3.j0
    public void d(T t11) {
        this.f1628d.C(t11, true);
        super.d(t11);
    }

    @Override // a3.j0
    public void e(com.badlogic.gdx.utils.a<T> aVar) {
        this.f1628d.z(aVar, true);
        super.e(aVar);
    }

    @Override // a3.j0
    public T h() {
        T t11 = (T) super.h();
        this.f1628d.a(t11);
        return t11;
    }

    public void j() {
        super.e(this.f1628d);
        this.f1628d.clear();
    }

    public s(int i11) {
        super(i11);
        this.f1628d = new com.badlogic.gdx.utils.a<>();
    }

    public s(int i11, int i12) {
        super(i11, i12);
        this.f1628d = new com.badlogic.gdx.utils.a<>();
    }
}
