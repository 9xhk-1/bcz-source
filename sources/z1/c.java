package z1;

import a3.j0;
import a3.q;
import a3.w0;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.r;
import com.badlogic.gdx.utils.a;
import java.util.Iterator;
import n2.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c implements q {

    /* renamed from: g, reason: collision with root package name */
    public static final int f100576g = 1000;

    /* renamed from: a, reason: collision with root package name */
    public float[] f100577a;

    /* renamed from: b, reason: collision with root package name */
    public Mesh f100578b;

    /* renamed from: c, reason: collision with root package name */
    public final w0<com.badlogic.gdx.utils.a<b>> f100579c;

    /* renamed from: d, reason: collision with root package name */
    public f f100580d;

    /* renamed from: e, reason: collision with root package name */
    public final j0<com.badlogic.gdx.utils.a<b>> f100581e;

    /* renamed from: f, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<com.badlogic.gdx.utils.a<b>> f100582f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j0<com.badlogic.gdx.utils.a<b>> {
        public a(int i11) {
            super(i11);
        }

        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public com.badlogic.gdx.utils.a<b> g() {
            return new com.badlogic.gdx.utils.a<>(false, 100);
        }
    }

    public c(f fVar) {
        this(1000, fVar);
    }

    public int D() {
        return this.f100577a.length / 24;
    }

    public void I(int i11) {
        this.f100577a = new float[i11 * 24];
        Mesh.VertexDataType vertexDataType = Mesh.VertexDataType.VertexArray;
        if (q1.g.f81386i != null) {
            vertexDataType = Mesh.VertexDataType.VertexBufferObjectWithVAO;
        }
        int i12 = i11 * 6;
        this.f100578b = new Mesh(vertexDataType, false, i11 * 4, i12, new r(1, 3, w.f74225u), new r(4, 4, w.f74227w), new r(16, 2, "a_texCoord0"));
        short[] sArr = new short[i12];
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            sArr[i13] = (short) i14;
            short s11 = (short) (i14 + 2);
            sArr[i13 + 1] = s11;
            short s12 = (short) (i14 + 1);
            sArr[i13 + 2] = s12;
            sArr[i13 + 3] = s12;
            sArr[i13 + 4] = s11;
            sArr[i13 + 5] = (short) (i14 + 3);
            i13 += 6;
            i14 += 4;
        }
        this.f100578b.H1(sArr);
    }

    public void R() {
        this.f100580d.z();
        Iterator<w0.b<com.badlogic.gdx.utils.a<b>>> it = this.f100579c.iterator();
        while (it.hasNext()) {
            w0.b<com.badlogic.gdx.utils.a<b>> next = it.next();
            this.f100580d.D(next.f1680d, next.f1679c);
            X(this.f100580d.R(next.f1680d), next.f1679c);
            this.f100580d.I(next.f1680d);
        }
        this.f100580d.b();
    }

    public final void X(w wVar, com.badlogic.gdx.utils.a<b> aVar) {
        int i11;
        a.b<b> it = aVar.iterator();
        d dVar = null;
        loop0: while (true) {
            i11 = 0;
            while (it.hasNext()) {
                b next = it.next();
                if (dVar == null || !dVar.equals(next.c())) {
                    if (i11 > 0) {
                        z(wVar, i11);
                        i11 = 0;
                    }
                    next.f100574i.d();
                    dVar = next.f100574i;
                }
                next.c0();
                float[] fArr = next.f100567b;
                System.arraycopy(fArr, 0, this.f100577a, i11, fArr.length);
                i11 += next.f100567b.length;
                if (i11 == this.f100577a.length) {
                    break;
                }
            }
            z(wVar, i11);
        }
        if (i11 > 0) {
            z(wVar, i11);
        }
    }

    public void Z(f fVar) {
        this.f100580d = fVar;
    }

    public void b(b bVar) {
        int o11 = this.f100580d.o(bVar);
        com.badlogic.gdx.utils.a<b> aVar = this.f100579c.get(o11);
        if (aVar == null) {
            aVar = this.f100581e.h();
            aVar.clear();
            this.f100582f.a(aVar);
            this.f100579c.a(o11, aVar);
        }
        aVar.a(bVar);
    }

    @Override // a3.q
    public void dispose() {
        o();
        this.f100577a = null;
        this.f100578b.dispose();
    }

    public void flush() {
        R();
        o();
    }

    public void o() {
        this.f100579c.clear();
        this.f100581e.e(this.f100582f);
        this.f100582f.clear();
    }

    public void z(w wVar, int i11) {
        this.f100578b.O1(this.f100577a, 0, i11);
        this.f100578b.D1(wVar, 4, 0, i11 / 4);
    }

    public c(int i11, f fVar) {
        this.f100579c = new w0<>();
        this.f100581e = new a(16);
        this.f100582f = new com.badlogic.gdx.utils.a<>(16);
        I(i11);
        Z(fVar);
    }
}
