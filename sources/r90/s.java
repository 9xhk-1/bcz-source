package r90;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class s<I, O> implements g<I, O> {

    /* renamed from: a, reason: collision with root package name */
    public O f83870a;

    /* renamed from: b, reason: collision with root package name */
    public I f83871b;

    public s() {
        this(null, null);
    }

    @Override // r90.g
    public I a(O o11) {
        return o11 == null ? this.f83871b : i(o11);
    }

    @Override // r90.g
    public O b(I i11) {
        return i11 == null ? this.f83870a : d(i11);
    }

    public abstract O d(I i11);

    public O e() {
        return this.f83870a;
    }

    public I f() {
        return this.f83871b;
    }

    public void g(O o11) {
        this.f83870a = o11;
    }

    public void h(I i11) {
        this.f83871b = i11;
    }

    public abstract I i(O o11);

    public s(O o11, I i11) {
        this.f83870a = o11;
        this.f83871b = i11;
    }
}
