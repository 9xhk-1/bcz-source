package w1;

import a3.q;
import a3.x0;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.ParticleEmitter;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d implements q {

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<ParticleEmitter> f94477a;

    /* renamed from: b, reason: collision with root package name */
    public BoundingBox f94478b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f94479c;

    /* renamed from: d, reason: collision with root package name */
    public float f94480d;

    /* renamed from: e, reason: collision with root package name */
    public float f94481e;

    /* renamed from: f, reason: collision with root package name */
    public float f94482f;

    public d() {
        this.f94480d = 1.0f;
        this.f94481e = 1.0f;
        this.f94482f = 1.0f;
        this.f94477a = new com.badlogic.gdx.utils.a<>(8);
    }

    public void C0(com.badlogic.gdx.graphics.g2d.e eVar) {
        J0(eVar, null);
    }

    public ParticleEmitter D(String str) {
        int i11 = this.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            ParticleEmitter particleEmitter = this.f94477a.get(i12);
            if (particleEmitter.y().equals(str)) {
                return particleEmitter;
            }
        }
        return null;
    }

    public void I() {
        int i11 = this.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f94477a.get(i12).h();
        }
    }

    public void J0(com.badlogic.gdx.graphics.g2d.e eVar, String str) {
        int i11 = this.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            ParticleEmitter particleEmitter = this.f94477a.get(i12);
            if (particleEmitter.s().f13179b != 0) {
                com.badlogic.gdx.utils.a<l> aVar = new com.badlogic.gdx.utils.a<>();
                a.b<String> it = particleEmitter.s().iterator();
                while (it.hasNext()) {
                    String name = new File(it.next().replace('\\', '/')).getName();
                    int lastIndexOf = name.lastIndexOf(46);
                    if (lastIndexOf != -1) {
                        name = name.substring(0, lastIndexOf);
                    }
                    if (str != null) {
                        name = str + name;
                    }
                    l D = eVar.D(name);
                    if (D == null) {
                        throw new IllegalArgumentException("Atlas is missing region: " + name);
                    }
                    aVar.a(D);
                }
                particleEmitter.J0(aVar);
            }
        }
    }

    public void Q0(v1.a aVar) {
        this.f94479c = true;
        com.badlogic.gdx.utils.l lVar = new com.badlogic.gdx.utils.l(this.f94477a.f13179b);
        int i11 = this.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            ParticleEmitter particleEmitter = this.f94477a.get(i12);
            if (particleEmitter.s().f13179b != 0) {
                com.badlogic.gdx.utils.a<l> aVar2 = new com.badlogic.gdx.utils.a<>();
                a.b<String> it = particleEmitter.s().iterator();
                while (it.hasNext()) {
                    String name = new File(it.next().replace('\\', '/')).getName();
                    l lVar2 = (l) lVar.k(name);
                    if (lVar2 == null) {
                        lVar2 = new l(a1(aVar.a(name)));
                        lVar.r(name, lVar2);
                    }
                    aVar2.a(lVar2);
                }
                particleEmitter.J0(aVar2);
            }
        }
    }

    public BoundingBox R() {
        if (this.f94478b == null) {
            this.f94478b = new BoundingBox();
        }
        BoundingBox boundingBox = this.f94478b;
        boundingBox.inf();
        a.b<ParticleEmitter> it = this.f94477a.iterator();
        while (it.hasNext()) {
            boundingBox.ext(it.next().n());
        }
        return boundingBox;
    }

    public void V0(v1.a aVar) {
        InputStream F = aVar.F();
        this.f94477a.clear();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(F), 512);
                do {
                    try {
                        this.f94477a.a(c1(bufferedReader2));
                    } catch (IOException e11) {
                        e = e11;
                        bufferedReader = bufferedReader2;
                        throw new GdxRuntimeException("Error loading effect: " + aVar, e);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        x0.a(bufferedReader);
                        throw th;
                    }
                } while (bufferedReader2.readLine() != null);
                x0.a(bufferedReader2);
            } catch (IOException e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public com.badlogic.gdx.utils.a<ParticleEmitter> X() {
        return this.f94477a;
    }

    public boolean Z() {
        int i11 = this.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (!this.f94477a.get(i12).Y()) {
                return false;
            }
        }
        return true;
    }

    public Texture a1(v1.a aVar) {
        return new Texture(aVar, false);
    }

    public void b() {
        int i11 = this.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f94477a.get(i12).d();
        }
    }

    public ParticleEmitter b1(ParticleEmitter particleEmitter) {
        return new ParticleEmitter(particleEmitter);
    }

    public ParticleEmitter c1(BufferedReader bufferedReader) throws IOException {
        return new ParticleEmitter(bufferedReader);
    }

    public void d1() {
        a.b<ParticleEmitter> it = this.f94477a.iterator();
        while (it.hasNext()) {
            it.next().h0();
        }
    }

    @Override // a3.q
    public void dispose() {
        if (this.f94479c) {
            int i11 = this.f94477a.f13179b;
            for (int i12 = 0; i12 < i11; i12++) {
                a.b<l> it = this.f94477a.get(i12).G().iterator();
                while (it.hasNext()) {
                    it.next().f().dispose();
                }
            }
        }
    }

    public void e1() {
        g1(true, true);
    }

    public void f1(boolean z11) {
        g1(z11, true);
    }

    public void g1(boolean z11, boolean z12) {
        int i11 = this.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f94477a.get(i12).p0(z12);
        }
        if (z11) {
            float f11 = this.f94480d;
            if (f11 == 1.0f && this.f94481e == 1.0f && this.f94482f == 1.0f) {
                return;
            }
            k1(1.0f / f11, 1.0f / this.f94481e, 1.0f / this.f94482f);
            this.f94482f = 1.0f;
            this.f94481e = 1.0f;
            this.f94480d = 1.0f;
        }
    }

    public void h1(Writer writer) throws IOException {
        int i11 = this.f94477a.f13179b;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            ParticleEmitter particleEmitter = this.f94477a.get(i12);
            int i14 = i13 + 1;
            if (i13 > 0) {
                writer.write("\n");
            }
            particleEmitter.r0(writer);
            i12++;
            i13 = i14;
        }
    }

    public void i0(v1.a aVar, com.badlogic.gdx.graphics.g2d.e eVar) {
        n0(aVar, eVar, null);
    }

    public void i1(float f11) {
        k1(f11, f11, f11);
    }

    public void j1(float f11, float f12) {
        k1(f11, f11, f12);
    }

    public void k1(float f11, float f12, float f13) {
        this.f94480d *= f11;
        this.f94481e *= f12;
        this.f94482f *= f13;
        a.b<ParticleEmitter> it = this.f94477a.iterator();
        while (it.hasNext()) {
            ParticleEmitter next = it.next();
            next.u0(f11, f12);
            next.s0(f13);
        }
    }

    public void l1(int i11) {
        int i12 = this.f94477a.f13179b;
        for (int i13 = 0; i13 < i12; i13++) {
            ParticleEmitter particleEmitter = this.f94477a.get(i13);
            particleEmitter.A0(false);
            particleEmitter.Z = i11;
            particleEmitter.f11895a0 = 0.0f;
        }
    }

    public void m1(boolean z11) {
        int i11 = this.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f94477a.get(i12).z0(z11);
        }
    }

    public void n0(v1.a aVar, com.badlogic.gdx.graphics.g2d.e eVar, String str) {
        V0(aVar);
        J0(eVar, str);
    }

    public void n1(boolean z11, boolean z12) {
        int i11 = this.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f94477a.get(i12).B0(z11, z12);
        }
    }

    public void o(a aVar) {
        int i11 = this.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f94477a.get(i12).f(aVar);
        }
    }

    public void o1(float f11, float f12) {
        int i11 = this.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f94477a.get(i12).G0(f11, f12);
        }
    }

    public void p1() {
        int i11 = this.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f94477a.get(i12).K0();
        }
    }

    public void q1(float f11) {
        int i11 = this.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f94477a.get(i12).L0(f11);
        }
    }

    public void w0(v1.a aVar, v1.a aVar2) {
        V0(aVar);
        Q0(aVar2);
    }

    public void z(a aVar, float f11) {
        int i11 = this.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f94477a.get(i12).g(aVar, f11);
        }
    }

    public d(d dVar) {
        this.f94480d = 1.0f;
        this.f94481e = 1.0f;
        this.f94482f = 1.0f;
        this.f94477a = new com.badlogic.gdx.utils.a<>(true, dVar.f94477a.f13179b);
        int i11 = dVar.f94477a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f94477a.a(b1(dVar.f94477a.get(i12)));
        }
    }
}
