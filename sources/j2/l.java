package j2;

import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.n;
import j2.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l extends d {

    /* renamed from: g, reason: collision with root package name */
    public float[] f63156g;

    /* renamed from: h, reason: collision with root package name */
    public short[] f63157h;

    /* renamed from: i, reason: collision with root package name */
    public int f63158i;

    /* renamed from: j, reason: collision with root package name */
    public int f63159j;

    /* renamed from: k, reason: collision with root package name */
    public int f63160k;

    /* renamed from: l, reason: collision with root package name */
    public int f63161l;

    public l(l lVar) {
        super(lVar);
        d(lVar);
    }

    @Override // j2.k
    public k f() {
        return new l(this);
    }

    @Override // j2.k
    public void i(Vector3 vector3, float f11) {
        if (this.f63157h == null) {
            int M = n.M(this.f63160k - 3);
            int i11 = this.f63159j;
            int i12 = (M * i11) + this.f63158i;
            int i13 = i12 + i11;
            int i14 = i11 + i13;
            float[] fArr = this.f63156g;
            d.a.a(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i13], fArr[i13 + 1], fArr[i13 + 2], fArr[i14], fArr[i14 + 1], fArr[i14 + 2], vector3);
            return;
        }
        int M2 = n.M(this.f63161l - 1) * 3;
        short[] sArr = this.f63157h;
        short s11 = sArr[M2];
        int i15 = this.f63159j;
        int i16 = this.f63158i;
        int i17 = (s11 * i15) + i16;
        int i18 = (sArr[M2 + 1] * i15) + i16;
        int i19 = (sArr[M2 + 2] * i15) + i16;
        float[] fArr2 = this.f63156g;
        d.a.a(fArr2[i17], fArr2[i17 + 1], fArr2[i17 + 2], fArr2[i18], fArr2[i18 + 1], fArr2[i18 + 2], fArr2[i19], fArr2[i19 + 1], fArr2[i19 + 2], vector3);
    }

    @Override // j2.d
    public void l(Mesh mesh, x1.e eVar) {
        super.l(mesh, eVar);
        this.f63159j = mesh.s1() / 4;
        this.f63158i = mesh.q1(1).f12492e / 4;
        int D0 = mesh.D0();
        if (D0 > 0) {
            short[] sArr = new short[D0];
            this.f63157h = sArr;
            mesh.i1(sArr);
            this.f63161l = this.f63157h.length / 3;
        } else {
            this.f63157h = null;
        }
        int m11 = mesh.m();
        this.f63160k = m11;
        float[] fArr = new float[m11 * this.f63159j];
        this.f63156g = fArr;
        mesh.w1(fArr);
    }

    public l() {
    }
}
