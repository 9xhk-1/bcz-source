package h2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends j {
    public i() {
        this.f58036p = e2.b.f48352j;
    }

    @Override // h2.j, e2.d
    public void R(int i11, int i12) {
        if (this.f58032l.t()) {
            int i13 = this.f58033m.f48332c;
            int i14 = i11 * i13;
            int i15 = i11 * this.f58034n.f48332c;
            int i16 = (i12 * i13) + i14;
            while (i14 < i16) {
                float i17 = this.f58032l.i() * this.f48397a.f48383h.f12537x;
                float v11 = this.f58032l.v() * this.f48397a.f48383h.f12537x;
                float[] fArr = this.f58034n.f48337e;
                fArr[i15] = i17;
                fArr[i15 + 1] = v11;
                this.f58033m.f48337e[i14] = i17 + (v11 * this.f58032l.q(0.0f));
                i14 += this.f58033m.f48332c;
                i15 += this.f58034n.f48332c;
            }
            return;
        }
        int i18 = this.f58033m.f48332c;
        int i19 = i11 * i18;
        int i21 = i11 * this.f58034n.f48332c;
        int i22 = (i12 * i18) + i19;
        while (i19 < i22) {
            float i23 = this.f58032l.i() * this.f48397a.f48383h.f12537x;
            float v12 = (this.f58032l.v() * this.f48397a.f48383h.f12537x) - i23;
            float[] fArr2 = this.f58034n.f48337e;
            fArr2[i21] = i23;
            fArr2[i21 + 1] = v12;
            this.f58033m.f48337e[i19] = i23 + (v12 * this.f58032l.q(0.0f));
            i19 += this.f58033m.f48332c;
            i21 += this.f58034n.f48332c;
        }
    }

    @Override // e2.d
    public e2.d Z() {
        return new i(this);
    }

    public i(i iVar) {
        super(iVar);
    }
}
