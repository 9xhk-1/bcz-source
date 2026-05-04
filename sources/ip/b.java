package ip;

import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b extends g {

    /* renamed from: c, reason: collision with root package name */
    public final short f62640c;

    /* renamed from: d, reason: collision with root package name */
    public final short f62641d;

    public b(g gVar, int i11, int i12) {
        super(gVar);
        this.f62640c = (short) i11;
        this.f62641d = (short) i12;
    }

    @Override // ip.g
    public void c(kp.a aVar, byte[] bArr) {
        int i11 = 0;
        while (true) {
            short s11 = this.f62641d;
            if (i11 >= s11) {
                return;
            }
            if (i11 == 0 || (i11 == 31 && s11 <= 62)) {
                aVar.c(31, 5);
                short s12 = this.f62641d;
                if (s12 > 62) {
                    aVar.c(s12 - 31, 16);
                } else if (i11 == 0) {
                    aVar.c(Math.min((int) s12, 31), 5);
                } else {
                    aVar.c(s12 - 31, 5);
                }
            }
            aVar.c(bArr[this.f62640c + i11], 8);
            i11++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append((int) this.f62640c);
        sb2.append("::");
        sb2.append((this.f62640c + this.f62641d) - 1);
        sb2.append(u0.f91710f);
        return sb2.toString();
    }
}
