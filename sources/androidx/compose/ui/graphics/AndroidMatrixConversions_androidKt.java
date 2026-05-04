package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidMatrixConversions_androidKt {
    /* renamed from: setFrom-EL8BTi8, reason: not valid java name */
    public static final void m2379setFromEL8BTi8(@m80.k android.graphics.Matrix matrix, @m80.k float[] fArr) {
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2];
        float f14 = fArr[3];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float f17 = fArr[6];
        float f18 = fArr[7];
        float f19 = fArr[8];
        float f21 = fArr[12];
        float f22 = fArr[13];
        float f23 = fArr[15];
        fArr[0] = f11;
        fArr[1] = f15;
        fArr[2] = f21;
        fArr[3] = f12;
        fArr[4] = f16;
        fArr[5] = f22;
        fArr[6] = f14;
        fArr[7] = f18;
        fArr[8] = f23;
        matrix.setValues(fArr);
        fArr[0] = f11;
        fArr[1] = f12;
        fArr[2] = f13;
        fArr[3] = f14;
        fArr[4] = f15;
        fArr[5] = f16;
        fArr[6] = f17;
        fArr[7] = f18;
        fArr[8] = f19;
    }

    /* renamed from: setFrom-tU-YjHk, reason: not valid java name */
    public static final void m2380setFromtUYjHk(@m80.k float[] fArr, @m80.k android.graphics.Matrix matrix) {
        matrix.getValues(fArr);
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2];
        float f14 = fArr[3];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float f17 = fArr[6];
        float f18 = fArr[7];
        float f19 = fArr[8];
        fArr[0] = f11;
        fArr[1] = f14;
        fArr[2] = 0.0f;
        fArr[3] = f17;
        fArr[4] = f12;
        fArr[5] = f15;
        fArr[6] = 0.0f;
        fArr[7] = f18;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f13;
        fArr[13] = f16;
        fArr[14] = 0.0f;
        fArr[15] = f19;
    }
}
