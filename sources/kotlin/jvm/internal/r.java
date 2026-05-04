package kotlin.jvm.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r extends n0<char[]> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final char[] f67029d;

    public r(int i11) {
        super(i11);
        this.f67029d = new char[i11];
    }

    public final void h(char c11) {
        char[] cArr = this.f67029d;
        int b11 = b();
        e(b11 + 1);
        cArr[b11] = c11;
    }

    @Override // kotlin.jvm.internal.n0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@m80.k char[] cArr) {
        g0.p(cArr, "<this>");
        return cArr.length;
    }

    @m80.k
    public final char[] j() {
        return g(this.f67029d, new char[f()]);
    }
}
