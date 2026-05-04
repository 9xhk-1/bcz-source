package y2;

import x2.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g<T extends x2.b> extends j<T> {

    /* renamed from: h, reason: collision with root package name */
    public int f99166h;

    /* renamed from: i, reason: collision with root package name */
    public int f99167i;

    public g(Class<? extends T> cls, int i11) {
        super(cls);
        this.f99166h = i11;
    }

    @Override // y2.j
    public boolean i(T t11) {
        int i11 = this.f99167i + 1;
        this.f99167i = i11;
        return i11 >= this.f99166h;
    }
}
