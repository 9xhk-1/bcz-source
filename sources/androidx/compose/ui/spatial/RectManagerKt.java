package androidx.compose.ui.spatial;

import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRectManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManagerKt\n*L\n1#1,547:1\n546#1:548\n*S KotlinDebug\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManagerKt\n*L\n535#1:548\n*E\n"})
/* loaded from: classes2.dex */
public final class RectManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: analyzeComponents-58bKbWc, reason: not valid java name */
    public static final int m4351analyzeComponents58bKbWc(float[] fArr) {
        int i11 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i12 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i11 = 1;
        }
        return (i12 << 1) | i11;
    }

    private static final boolean getHasNonTranslationComponents(int i11) {
        return (i11 & 2) == 0;
    }

    private static final boolean isIdentity(int i11) {
        return i11 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isSet--gyyYBs, reason: not valid java name */
    public static final boolean m4352isSetgyyYBs(long j11) {
        return !IntOffset.m5242equalsimpl0(j11, IntOffset.Companion.m5253getMaxnOccac());
    }

    private static /* synthetic */ void getHasNonTranslationComponents$annotations(int i11) {
    }

    private static /* synthetic */ void isIdentity$annotations(int i11) {
    }

    private static final int toInt(boolean z11) {
        return z11 ? 1 : 0;
    }
}
