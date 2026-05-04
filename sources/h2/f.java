package h2;

import com.badlogic.gdx.utils.GdxRuntimeException;
import e2.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f extends d {

    /* renamed from: l, reason: collision with root package name */
    public a.d f58011l;

    /* renamed from: m, reason: collision with root package name */
    public a.d f58012m;

    /* renamed from: n, reason: collision with root package name */
    public a.d f58013n;

    /* renamed from: o, reason: collision with root package name */
    public a.f<e2.c> f58014o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f58015p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f58016q;

    @Override // e2.d
    public void C0() {
        float f11;
        float f12;
        float f13;
        int i11 = this.f48397a.f48380e.f48329c;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            e2.c cVar = this.f58014o.f48342f[i12];
            float f14 = 1.0f;
            float f15 = this.f58015p ? this.f58012m.f48337e[i12] : 1.0f;
            if (this.f58016q) {
                a.d dVar = this.f58013n;
                int i14 = dVar.f48332c * i12;
                float[] fArr = dVar.f48337e;
                float f16 = fArr[i14];
                float f17 = fArr[i14 + 1];
                float f18 = fArr[i14 + 2];
                f14 = fArr[i14 + 3];
                f12 = f17;
                f13 = f18;
                f11 = f16;
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
                f13 = 0.0f;
            }
            float f19 = f14;
            float[] fArr2 = this.f58011l.f48337e;
            cVar.B(fArr2[i13], fArr2[i13 + 1], fArr2[i13 + 2], f11, f12, f13, f19, f15);
            cVar.H();
            i12++;
            i13 += this.f58011l.f48332c;
        }
    }

    @Override // e2.d
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public f Z() {
        return new f();
    }

    @Override // e2.d
    public void X() {
        this.f58011l = (a.d) this.f48397a.f48380e.a(e2.b.f48346d);
    }

    @Override // e2.d
    public void init() {
        a.f<e2.c> fVar = (a.f) this.f48397a.f48380e.g(e2.b.f48354l);
        this.f58014o = fVar;
        if (fVar == null) {
            throw new GdxRuntimeException("ParticleController channel not found, specify an influencer which will allocate it please.");
        }
        this.f58012m = (a.d) this.f48397a.f48380e.g(e2.b.f48352j);
        a.d dVar = (a.d) this.f48397a.f48380e.g(e2.b.f48351i);
        this.f58013n = dVar;
        this.f58015p = this.f58012m != null;
        this.f58016q = dVar != null;
    }
}
