package androidx.compose.ui.platform;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nInvertMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,81:1\n49#2:82\n49#2:83\n49#2:84\n49#2:85\n49#2:86\n49#2:87\n49#2:88\n49#2:89\n49#2:90\n49#2:91\n49#2:92\n49#2:93\n49#2:94\n49#2:95\n49#2:96\n49#2:97\n52#2,2:98\n52#2,2:100\n52#2,2:102\n52#2,2:104\n52#2,2:106\n52#2,2:108\n52#2,2:110\n52#2,2:112\n52#2,2:114\n52#2,2:116\n52#2,2:118\n52#2,2:120\n52#2,2:122\n52#2,2:124\n52#2,2:126\n52#2,2:128\n*S KotlinDebug\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n*L\n29#1:82\n30#1:83\n31#1:84\n32#1:85\n33#1:86\n34#1:87\n35#1:88\n36#1:89\n37#1:90\n38#1:91\n39#1:92\n40#1:93\n41#1:94\n42#1:95\n43#1:96\n44#1:97\n62#1:98,2\n63#1:100,2\n64#1:102,2\n65#1:104,2\n66#1:106,2\n67#1:108,2\n68#1:110,2\n69#1:112,2\n70#1:114,2\n71#1:116,2\n72#1:118,2\n73#1:120,2\n74#1:122,2\n75#1:124,2\n76#1:126,2\n77#1:128,2\n*E\n"})
/* loaded from: classes2.dex */
public final class InvertMatrixKt {
    /* renamed from: invertTo-JiSxe2E, reason: not valid java name */
    public static final boolean m4267invertToJiSxe2E(@m80.k float[] fArr, @m80.k float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2];
        float f14 = fArr[3];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float f17 = fArr[6];
        float f18 = fArr[7];
        float f19 = fArr[8];
        float f21 = fArr[9];
        float f22 = fArr[10];
        float f23 = fArr[11];
        float f24 = fArr[12];
        float f25 = fArr[13];
        float f26 = fArr[14];
        float f27 = fArr[15];
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f11 * f17) - (f13 * f15);
        float f31 = (f11 * f18) - (f14 * f15);
        float f32 = (f12 * f17) - (f13 * f16);
        float f33 = (f12 * f18) - (f14 * f16);
        float f34 = (f13 * f18) - (f14 * f17);
        float f35 = (f19 * f25) - (f21 * f24);
        float f36 = (f19 * f26) - (f22 * f24);
        float f37 = (f19 * f27) - (f23 * f24);
        float f38 = (f21 * f26) - (f22 * f25);
        float f39 = (f21 * f27) - (f23 * f25);
        float f41 = (f22 * f27) - (f23 * f26);
        float f42 = (((((f28 * f41) - (f29 * f39)) + (f31 * f38)) + (f32 * f37)) - (f33 * f36)) + (f34 * f35);
        if (f42 != 0.0f) {
            float f43 = 1.0f / f42;
            fArr2[0] = (((f16 * f41) - (f17 * f39)) + (f18 * f38)) * f43;
            fArr2[1] = ((((-f12) * f41) + (f13 * f39)) - (f14 * f38)) * f43;
            fArr2[2] = (((f25 * f34) - (f26 * f33)) + (f27 * f32)) * f43;
            fArr2[3] = ((((-f21) * f34) + (f22 * f33)) - (f23 * f32)) * f43;
            float f44 = -f15;
            fArr2[4] = (((f44 * f41) + (f17 * f37)) - (f18 * f36)) * f43;
            fArr2[5] = (((f41 * f11) - (f13 * f37)) + (f14 * f36)) * f43;
            float f45 = -f24;
            fArr2[6] = (((f45 * f34) + (f26 * f31)) - (f27 * f29)) * f43;
            fArr2[7] = (((f34 * f19) - (f22 * f31)) + (f23 * f29)) * f43;
            fArr2[8] = (((f15 * f39) - (f16 * f37)) + (f18 * f35)) * f43;
            fArr2[9] = ((((-f11) * f39) + (f37 * f12)) - (f14 * f35)) * f43;
            fArr2[10] = (((f24 * f33) - (f25 * f31)) + (f27 * f28)) * f43;
            fArr2[11] = ((((-f19) * f33) + (f31 * f21)) - (f23 * f28)) * f43;
            fArr2[12] = (((f44 * f38) + (f16 * f36)) - (f17 * f35)) * f43;
            fArr2[13] = (((f11 * f38) - (f12 * f36)) + (f13 * f35)) * f43;
            fArr2[14] = (((f45 * f32) + (f25 * f29)) - (f26 * f28)) * f43;
            fArr2[15] = (((f19 * f32) - (f21 * f29)) + (f22 * f28)) * f43;
        }
        return !(f42 == 0.0f);
    }
}
