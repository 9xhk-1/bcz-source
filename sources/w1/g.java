package w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f94485a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f94486b;

    /* renamed from: c, reason: collision with root package name */
    public final short[] f94487c;

    /* renamed from: d, reason: collision with root package name */
    public final o f94488d;

    public g(o oVar, float[] fArr, short[] sArr) {
        this.f94488d = oVar;
        this.f94486b = fArr;
        this.f94487c = sArr;
        float[] fArr2 = new float[fArr.length];
        this.f94485a = fArr2;
        float f11 = oVar.f94612b;
        float f12 = oVar.f94613c;
        float f13 = oVar.f94614d - f11;
        float f14 = oVar.f94615e - f12;
        int i11 = oVar.f94616f;
        int i12 = oVar.f94617g;
        int length = fArr.length;
        for (int i13 = 0; i13 < length; i13 += 2) {
            fArr2[i13] = ((fArr[i13] / i11) * f13) + f11;
            int i14 = i13 + 1;
            fArr2[i14] = ((1.0f - (fArr[i14] / i12)) * f14) + f12;
        }
    }

    public o a() {
        return this.f94488d;
    }

    public float[] b() {
        return this.f94485a;
    }

    public short[] c() {
        return this.f94487c;
    }

    public float[] d() {
        return this.f94486b;
    }
}
