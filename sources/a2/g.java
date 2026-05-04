package a2;

import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f1414b = {0.282095f, 0.488603f, 0.488603f, 0.488603f, 1.092548f, 1.092548f, 1.092548f, 0.315392f, 0.546274f};

    /* renamed from: a, reason: collision with root package name */
    public final float[] f1415a;

    public g() {
        this.f1415a = new float[27];
    }

    public static final float a(float f11) {
        if (f11 < 0.0f) {
            return 0.0f;
        }
        if (f11 > 1.0f) {
            return 1.0f;
        }
        return f11;
    }

    public g b(float f11, float f12, float f13) {
        int i11 = 0;
        while (true) {
            float[] fArr = this.f1415a;
            if (i11 >= fArr.length) {
                return this;
            }
            fArr[i11] = f11;
            int i12 = i11 + 2;
            fArr[i11 + 1] = f12;
            i11 += 3;
            fArr[i12] = f13;
        }
    }

    public g c(a aVar) {
        return e(aVar.f1403a);
    }

    public g d(com.badlogic.gdx.graphics.b bVar) {
        return b(bVar.f11544a, bVar.f11545b, bVar.f11546c);
    }

    public g e(float[] fArr) {
        int i11 = 0;
        while (true) {
            float[] fArr2 = this.f1415a;
            if (i11 >= fArr2.length) {
                return this;
            }
            fArr2[i11] = fArr[i11];
            i11++;
        }
    }

    public g(float[] fArr) {
        if (fArr.length == 27) {
            this.f1415a = (float[]) fArr.clone();
            return;
        }
        throw new GdxRuntimeException("Incorrect array size");
    }
}
