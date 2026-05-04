package w1;

import a3.j0;
import com.badlogic.gdx.graphics.g2d.ParticleEmitter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends j0<a> {

    /* renamed from: d, reason: collision with root package name */
    public final d f94483d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends d {
        public a(d dVar) {
            super(dVar);
        }

        public void r1() {
            e.this.d(this);
        }
    }

    public e(d dVar, int i11, int i12) {
        super(i11, i12);
        this.f94483d = dVar;
    }

    @Override // a3.j0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void d(a aVar) {
        super.d(aVar);
        aVar.f1(false);
        float f11 = aVar.f94480d;
        d dVar = this.f94483d;
        if (f11 == dVar.f94480d && aVar.f94481e == dVar.f94481e && aVar.f94482f == dVar.f94482f) {
            return;
        }
        com.badlogic.gdx.utils.a<ParticleEmitter> X = aVar.X();
        com.badlogic.gdx.utils.a<ParticleEmitter> X2 = this.f94483d.X();
        for (int i11 = 0; i11 < X.f13179b; i11++) {
            ParticleEmitter particleEmitter = X.get(i11);
            ParticleEmitter particleEmitter2 = X2.get(i11);
            particleEmitter.d0(particleEmitter2);
            particleEmitter.c0(particleEmitter2);
        }
        d dVar2 = this.f94483d;
        aVar.f94480d = dVar2.f94480d;
        aVar.f94481e = dVar2.f94481e;
        aVar.f94482f = dVar2.f94482f;
    }

    @Override // a3.j0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a g() {
        a aVar = new a(this.f94483d);
        aVar.p1();
        return aVar;
    }
}
