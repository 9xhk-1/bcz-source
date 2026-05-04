package vm;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class h implements TypeEvaluator<Matrix> {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f94070a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f94071b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f94072c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f11, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.f94070a);
        matrix2.getValues(this.f94071b);
        for (int i11 = 0; i11 < 9; i11++) {
            float[] fArr = this.f94071b;
            float f12 = fArr[i11];
            float f13 = this.f94070a[i11];
            fArr[i11] = f13 + ((f12 - f13) * f11);
        }
        this.f94072c.setValues(this.f94071b);
        return this.f94072c;
    }
}
