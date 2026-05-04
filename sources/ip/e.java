package ip;

import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e extends g {

    /* renamed from: c, reason: collision with root package name */
    public final short f62658c;

    /* renamed from: d, reason: collision with root package name */
    public final short f62659d;

    public e(g gVar, int i11, int i12) {
        super(gVar);
        this.f62658c = (short) i11;
        this.f62659d = (short) i12;
    }

    @Override // ip.g
    public void c(kp.a aVar, byte[] bArr) {
        aVar.c(this.f62658c, this.f62659d);
    }

    public String toString() {
        short s11 = this.f62658c;
        short s12 = this.f62659d;
        return "<" + Integer.toBinaryString((s11 & ((1 << s12) - 1)) | (1 << s12) | (1 << this.f62659d)).substring(1) + u0.f91710f;
    }
}
