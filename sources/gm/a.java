package gm;

import android.annotation.TargetApi;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: gm.a$a, reason: collision with other inner class name */
    public class C0640a {

        /* renamed from: a, reason: collision with root package name */
        public float[] f53949a;

        /* renamed from: b, reason: collision with root package name */
        public float f53950b;

        /* renamed from: c, reason: collision with root package name */
        public float f53951c;

        /* renamed from: d, reason: collision with root package name */
        public float f53952d;

        /* renamed from: e, reason: collision with root package name */
        public float f53953e;

        /* renamed from: f, reason: collision with root package name */
        public float f53954f;

        public C0640a(float f11, float f12, float f13, float f14) {
            this.f53952d = f11 - f13;
            this.f53953e = f12 - f14;
            this.f53950b = f11 * f14;
            this.f53951c = f13 * f12;
            this.f53954f = (float) Math.sqrt((r3 * r3) + (r0 * r0));
            this.f53949a = new float[]{f11, f12, f13, f14};
        }

        public float a(float f11, float f12) {
            return Math.abs((((this.f53953e * f11) - (this.f53952d * f12)) + this.f53950b) - this.f53951c) / this.f53954f;
        }

        public float[] b() {
            return this.f53949a;
        }
    }

    public float[] a(float[]... fArr) {
        int i11 = 0;
        for (float[] fArr2 : fArr) {
            i11 += fArr2.length;
        }
        float[] fArr3 = new float[i11];
        int i12 = 0;
        for (float[] fArr4 : fArr) {
            for (float f11 : fArr4) {
                fArr3[i12] = f11;
                i12++;
            }
        }
        return fArr3;
    }

    @TargetApi(9)
    public float[] b(float[] fArr, float f11) {
        C0640a c0640a = new C0640a(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1]);
        float f12 = 0.0f;
        int i11 = 0;
        for (int i12 = 2; i12 < fArr.length - 2; i12 += 2) {
            float a11 = c0640a.a(fArr[i12], fArr[i12 + 1]);
            if (a11 > f12) {
                i11 = i12;
                f12 = a11;
            }
        }
        if (f12 <= f11) {
            return c0640a.b();
        }
        float[] b11 = b(Arrays.copyOfRange(fArr, 0, i11 + 2), f11);
        float[] b12 = b(Arrays.copyOfRange(fArr, i11, fArr.length), f11);
        return a(b11, Arrays.copyOfRange(b12, 2, b12.length));
    }
}
