package e1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f48283a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f48284b;

    public d(float[] fArr, int[] iArr) {
        this.f48283a = fArr;
        this.f48284b = iArr;
    }

    public int[] a() {
        return this.f48284b;
    }

    public float[] b() {
        return this.f48283a;
    }

    public int c() {
        return this.f48284b.length;
    }

    public void d(d dVar, d dVar2, float f11) {
        if (dVar.f48284b.length == dVar2.f48284b.length) {
            for (int i11 = 0; i11 < dVar.f48284b.length; i11++) {
                this.f48283a[i11] = j1.i.k(dVar.f48283a[i11], dVar2.f48283a[i11], f11);
                this.f48284b[i11] = j1.d.c(f11, dVar.f48284b[i11], dVar2.f48284b[i11]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f48284b.length + " vs " + dVar2.f48284b.length + pn.j.f81007d);
    }
}
