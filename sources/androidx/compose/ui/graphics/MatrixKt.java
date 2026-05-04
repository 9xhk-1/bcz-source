package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,681:1\n49#2:682\n49#2:683\n49#2:684\n49#2:685\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n653#1:682\n654#1:683\n655#1:684\n656#1:685\n*E\n"})
/* loaded from: classes.dex */
public final class MatrixKt {
    /* renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m2763dotp89u6pk(float[] fArr, int i11, float[] fArr2, int i12) {
        int i13 = i11 * 4;
        return (fArr[i13] * fArr2[i12]) + (fArr[i13 + 1] * fArr2[4 + i12]) + (fArr[i13 + 2] * fArr2[8 + i12]) + (fArr[i13 + 3] * fArr2[12 + i12]);
    }

    /* renamed from: isIdentity-58bKbWc, reason: not valid java name */
    public static final boolean m2764isIdentity58bKbWc(@m80.k float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }
}
