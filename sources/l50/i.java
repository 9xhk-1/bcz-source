package l50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final char[] f69999a;

    /* renamed from: b, reason: collision with root package name */
    public int f70000b;

    public i(@m80.k char[] buffer) {
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        this.f69999a = buffer;
        this.f70000b = buffer.length;
    }

    public void D(int i11) {
        this.f70000b = i11;
    }

    public final void E(int i11) {
        D(Math.min(this.f69999a.length, i11));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i11) {
        return h(i11);
    }

    public char h(int i11) {
        return this.f69999a[i11];
    }

    @m80.k
    public final char[] j() {
        return this.f69999a;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return n();
    }

    public int n() {
        return this.f70000b;
    }

    @Override // java.lang.CharSequence
    @m80.k
    public CharSequence subSequence(int i11, int i12) {
        return u30.f0.M1(this.f69999a, i11, Math.min(i12, length()));
    }

    @m80.k
    public final String substring(int i11, int i12) {
        return u30.f0.M1(this.f69999a, i11, Math.min(i12, length()));
    }

    @Override // java.lang.CharSequence
    @m80.k
    public String toString() {
        return substring(0, length());
    }
}
