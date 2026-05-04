package i2;

import com.badlogic.gdx.utils.GdxRuntimeException;
import e2.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends g {

    /* renamed from: n, reason: collision with root package name */
    public a.f<e2.c> f60125n;

    @Override // i2.g, e2.d
    public void C0() {
        int i11 = this.f48397a.f48380e.f48329c;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f60125n.f48342f[i12].i();
        }
    }

    @Override // i2.g
    public boolean J0(f2.d dVar) {
        return false;
    }

    @Override // e2.d
    public e2.d Z() {
        return new e();
    }

    @Override // e2.d
    public void init() {
        a.f<e2.c> fVar = (a.f) this.f48397a.f48380e.g(e2.b.f48354l);
        this.f60125n = fVar;
        if (fVar == null) {
            throw new GdxRuntimeException("ParticleController channel not found, specify an influencer which will allocate it please.");
        }
    }
}
