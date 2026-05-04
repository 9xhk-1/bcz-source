package kotlin.jvm.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t0 extends n0<short[]> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final short[] f67038d;

    public t0(int i11) {
        super(i11);
        this.f67038d = new short[i11];
    }

    public final void h(short s11) {
        short[] sArr = this.f67038d;
        int b11 = b();
        e(b11 + 1);
        sArr[b11] = s11;
    }

    @Override // kotlin.jvm.internal.n0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@m80.k short[] sArr) {
        g0.p(sArr, "<this>");
        return sArr.length;
    }

    @m80.k
    public final short[] j() {
        return g(this.f67038d, new short[f()]);
    }
}
