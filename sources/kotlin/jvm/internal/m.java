package kotlin.jvm.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m extends n0<boolean[]> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final boolean[] f67002d;

    public m(int i11) {
        super(i11);
        this.f67002d = new boolean[i11];
    }

    public final void h(boolean z11) {
        boolean[] zArr = this.f67002d;
        int b11 = b();
        e(b11 + 1);
        zArr[b11] = z11;
    }

    @Override // kotlin.jvm.internal.n0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@m80.k boolean[] zArr) {
        g0.p(zArr, "<this>");
        return zArr.length;
    }

    @m80.k
    public final boolean[] j() {
        return g(this.f67002d, new boolean[f()]);
    }
}
