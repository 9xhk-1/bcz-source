package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.text.input.PlatformTextInputService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,3106:1\n52#2,2:3107\n52#2,2:3109\n52#2,2:3111\n52#2,2:3113\n52#2,2:3115\n52#2,2:3117\n52#2,2:3119\n52#2,2:3121\n52#2,2:3123\n52#2,2:3125\n52#2,2:3127\n52#2,2:3129\n52#2,2:3131\n52#2,2:3133\n52#2,2:3135\n52#2,2:3137\n49#2:3139\n49#2:3140\n49#2:3141\n49#2:3142\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n2930#1:3107,2\n2931#1:3109,2\n2932#1:3111,2\n2933#1:3113,2\n2934#1:3115,2\n2935#1:3117,2\n2936#1:3119,2\n2937#1:3121,2\n2938#1:3123,2\n2939#1:3125,2\n2940#1:3127,2\n2941#1:3129,2\n2942#1:3131,2\n2943#1:3133,2\n2944#1:3135,2\n2945#1:3137,2\n2957#1:3139\n2958#1:3140\n2959#1:3141\n2960#1:3142\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidComposeView_androidKt {
    private static final long ONE_FRAME_120_HERTZ_IN_MILLISECONDS = 8;

    @m80.k
    private static x00.l<? super PlatformTextInputService, ? extends PlatformTextInputService> platformTextInputServiceInterceptor = new x00.l<PlatformTextInputService, PlatformTextInputService>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // x00.l
        public final PlatformTextInputService invoke(PlatformTextInputService platformTextInputService) {
            return platformTextInputService;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsDescendant(View view, View view2) {
        if (kotlin.jvm.internal.g0.g(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m4238dotp89u6pk(float[] fArr, int i11, float[] fArr2, int i12) {
        int i13 = i11 * 4;
        return (fArr[i13] * fArr2[i12]) + (fArr[i13 + 1] * fArr2[4 + i12]) + (fArr[i13 + 2] * fArr2[8 + i12]) + (fArr[i13 + 3] * fArr2[12 + i12]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentCaptureSessionCompat getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    @m80.k
    public static final x00.l<PlatformTextInputService, PlatformTextInputService> getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m4239preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float m4238dotp89u6pk = m4238dotp89u6pk(fArr2, 0, fArr, 0);
        float m4238dotp89u6pk2 = m4238dotp89u6pk(fArr2, 0, fArr, 1);
        float m4238dotp89u6pk3 = m4238dotp89u6pk(fArr2, 0, fArr, 2);
        float m4238dotp89u6pk4 = m4238dotp89u6pk(fArr2, 0, fArr, 3);
        float m4238dotp89u6pk5 = m4238dotp89u6pk(fArr2, 1, fArr, 0);
        float m4238dotp89u6pk6 = m4238dotp89u6pk(fArr2, 1, fArr, 1);
        float m4238dotp89u6pk7 = m4238dotp89u6pk(fArr2, 1, fArr, 2);
        float m4238dotp89u6pk8 = m4238dotp89u6pk(fArr2, 1, fArr, 3);
        float m4238dotp89u6pk9 = m4238dotp89u6pk(fArr2, 2, fArr, 0);
        float m4238dotp89u6pk10 = m4238dotp89u6pk(fArr2, 2, fArr, 1);
        float m4238dotp89u6pk11 = m4238dotp89u6pk(fArr2, 2, fArr, 2);
        float m4238dotp89u6pk12 = m4238dotp89u6pk(fArr2, 2, fArr, 3);
        float m4238dotp89u6pk13 = m4238dotp89u6pk(fArr2, 3, fArr, 0);
        float m4238dotp89u6pk14 = m4238dotp89u6pk(fArr2, 3, fArr, 1);
        float m4238dotp89u6pk15 = m4238dotp89u6pk(fArr2, 3, fArr, 2);
        float m4238dotp89u6pk16 = m4238dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = m4238dotp89u6pk;
        fArr[1] = m4238dotp89u6pk2;
        fArr[2] = m4238dotp89u6pk3;
        fArr[3] = m4238dotp89u6pk4;
        fArr[4] = m4238dotp89u6pk5;
        fArr[5] = m4238dotp89u6pk6;
        fArr[6] = m4238dotp89u6pk7;
        fArr[7] = m4238dotp89u6pk8;
        fArr[8] = m4238dotp89u6pk9;
        fArr[9] = m4238dotp89u6pk10;
        fArr[10] = m4238dotp89u6pk11;
        fArr[11] = m4238dotp89u6pk12;
        fArr[12] = m4238dotp89u6pk13;
        fArr[13] = m4238dotp89u6pk14;
        fArr[14] = m4238dotp89u6pk15;
        fArr[15] = m4238dotp89u6pk16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTranslate-cG2Xzmc, reason: not valid java name */
    public static final void m4240preTranslatecG2Xzmc(float[] fArr, float f11, float f12, float[] fArr2) {
        Matrix.m2748resetimpl(fArr2);
        Matrix.m2761translateimpl$default(fArr2, f11, f12, 0.0f, 4, null);
        m4239preTransformJiSxe2E(fArr, fArr2);
    }

    public static final void setPlatformTextInputServiceInterceptor(@m80.k x00.l<? super PlatformTextInputService, ? extends PlatformTextInputService> lVar) {
        platformTextInputServiceInterceptor = lVar;
    }
}
