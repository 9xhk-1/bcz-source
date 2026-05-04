package a2;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.GdxRuntimeException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final int f1402b = 18;

    /* renamed from: a, reason: collision with root package name */
    public final float[] f1403a;

    public a() {
        this.f1403a = new float[18];
    }

    public static final float i(float f11) {
        if (f11 < 0.0f) {
            return 0.0f;
        }
        if (f11 > 1.0f) {
            return 1.0f;
        }
        return f11;
    }

    public a a(float f11, float f12, float f13) {
        int i11 = 0;
        while (true) {
            float[] fArr = this.f1403a;
            if (i11 >= fArr.length) {
                return this;
            }
            int i12 = i11 + 1;
            fArr[i11] = fArr[i11] + f11;
            int i13 = i11 + 2;
            fArr[i12] = fArr[i12] + f12;
            i11 += 3;
            fArr[i13] = fArr[i13] + f13;
        }
    }

    public a b(float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f14 * f14;
        float f18 = f15 * f15;
        float f19 = f16 * f16;
        float f21 = f17 + f18 + f19;
        if (f21 == 0.0f) {
            return this;
        }
        float f22 = (1.0f / f21) * (f21 + 1.0f);
        float f23 = f11 * f22;
        float f24 = f12 * f22;
        float f25 = f13 * f22;
        int i11 = f14 > 0.0f ? 0 : 3;
        float[] fArr = this.f1403a;
        fArr[i11] = fArr[i11] + (f17 * f23);
        int i12 = i11 + 1;
        fArr[i12] = fArr[i12] + (f17 * f24);
        int i13 = i11 + 2;
        fArr[i13] = fArr[i13] + (f17 * f25);
        int i14 = f15 > 0.0f ? 6 : 9;
        fArr[i14] = fArr[i14] + (f18 * f23);
        int i15 = i14 + 1;
        fArr[i15] = fArr[i15] + (f18 * f24);
        int i16 = i14 + 2;
        fArr[i16] = fArr[i16] + (f18 * f25);
        int i17 = f16 > 0.0f ? 12 : 15;
        fArr[i17] = fArr[i17] + (f23 * f19);
        int i18 = i17 + 1;
        fArr[i18] = fArr[i18] + (f24 * f19);
        int i19 = i17 + 2;
        fArr[i19] = fArr[i19] + (f19 * f25);
        return this;
    }

    public a c(float f11, float f12, float f13, Vector3 vector3) {
        return b(f11, f12, f13, vector3.f12537x, vector3.f12538y, vector3.f12539z);
    }

    public a d(com.badlogic.gdx.graphics.b bVar) {
        return a(bVar.f11544a, bVar.f11545b, bVar.f11546c);
    }

    public a e(com.badlogic.gdx.graphics.b bVar, float f11, float f12, float f13) {
        return b(bVar.f11544a, bVar.f11545b, bVar.f11546c, f11, f12, f13);
    }

    public a f(com.badlogic.gdx.graphics.b bVar, Vector3 vector3) {
        return b(bVar.f11544a, bVar.f11545b, bVar.f11546c, vector3.f12537x, vector3.f12538y, vector3.f12539z);
    }

    public a g(com.badlogic.gdx.graphics.b bVar, Vector3 vector3, Vector3 vector32) {
        return b(bVar.f11544a, bVar.f11545b, bVar.f11546c, vector32.f12537x - vector3.f12537x, vector32.f12538y - vector3.f12538y, vector32.f12539z - vector3.f12539z);
    }

    public a h(com.badlogic.gdx.graphics.b bVar, Vector3 vector3, Vector3 vector32, float f11) {
        float dst = f11 / (vector32.dst(vector3) + 1.0f);
        return b(bVar.f11544a * dst, bVar.f11545b * dst, bVar.f11546c * dst, vector32.f12537x - vector3.f12537x, vector32.f12538y - vector3.f12538y, vector32.f12539z - vector3.f12539z);
    }

    public a j() {
        int i11 = 0;
        while (true) {
            float[] fArr = this.f1403a;
            if (i11 >= fArr.length) {
                return this;
            }
            fArr[i11] = i(fArr[i11]);
            i11++;
        }
    }

    public a k() {
        int i11 = 0;
        while (true) {
            float[] fArr = this.f1403a;
            if (i11 >= fArr.length) {
                return this;
            }
            fArr[i11] = 0.0f;
            i11++;
        }
    }

    public com.badlogic.gdx.graphics.b l(com.badlogic.gdx.graphics.b bVar, int i11) {
        int i12 = i11 * 3;
        float[] fArr = this.f1403a;
        return bVar.F(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], 1.0f);
    }

    public a m(float f11, float f12, float f13) {
        for (int i11 = 0; i11 < 18; i11 += 3) {
            float[] fArr = this.f1403a;
            fArr[i11] = f11;
            fArr[i11 + 1] = f12;
            fArr[i11 + 2] = f13;
        }
        return this;
    }

    public a n(a aVar) {
        return p(aVar.f1403a);
    }

    public a o(com.badlogic.gdx.graphics.b bVar) {
        return m(bVar.f11544a, bVar.f11545b, bVar.f11546c);
    }

    public a p(float[] fArr) {
        int i11 = 0;
        while (true) {
            float[] fArr2 = this.f1403a;
            if (i11 >= fArr2.length) {
                return this;
            }
            fArr2[i11] = fArr[i11];
            i11++;
        }
    }

    public String toString() {
        String str = "";
        for (int i11 = 0; i11 < this.f1403a.length; i11 += 3) {
            str = str + Float.toString(this.f1403a[i11]) + j2.O + Float.toString(this.f1403a[i11 + 1]) + j2.O + Float.toString(this.f1403a[i11 + 2]) + "\n";
        }
        return str;
    }

    public a(float[] fArr) {
        if (fArr.length == 18) {
            float[] fArr2 = new float[fArr.length];
            this.f1403a = fArr2;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            return;
        }
        throw new GdxRuntimeException("Incorrect array size");
    }

    public a(a aVar) {
        this(aVar.f1403a);
    }
}
