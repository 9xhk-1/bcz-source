package lx;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f71675a;

    /* renamed from: b, reason: collision with root package name */
    public int f71676b;

    public j(int i11, int i12) {
        this.f71675a = i11;
        this.f71676b = i12;
    }

    public final int a() {
        return this.f71676b;
    }

    public final int b() {
        return this.f71675a;
    }

    public final void c(int i11) {
        this.f71676b = i11;
    }

    public final void d(int i11) {
        this.f71675a = i11;
    }

    @m80.k
    public String toString() {
        return "MutableRange(start=" + this.f71675a + ", end=" + this.f71676b + ')';
    }
}
