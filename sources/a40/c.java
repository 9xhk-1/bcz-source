package a40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b[] f1889a;

    public c(int i11) {
        b[] bVarArr = new b[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bVarArr[i12] = d.a(false);
        }
        this.f1889a = bVarArr;
    }

    @m80.k
    public final b a(int i11) {
        return this.f1889a[i11];
    }

    public final int b() {
        return this.f1889a.length;
    }

    public static /* synthetic */ void c() {
    }
}
