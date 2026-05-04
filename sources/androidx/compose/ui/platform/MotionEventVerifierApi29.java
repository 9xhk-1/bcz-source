package androidx.compose.ui.platform;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
@kotlin.jvm.internal.u0({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/MotionEventVerifierApi29\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,3106:1\n139#2:3107\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/MotionEventVerifierApi29\n*L\n3054#1:3107\n*E\n"})
/* loaded from: classes2.dex */
final class MotionEventVerifierApi29 {

    @m80.k
    public static final MotionEventVerifierApi29 INSTANCE = new MotionEventVerifierApi29();

    private MotionEventVerifierApi29() {
    }

    @DoNotInline
    public final boolean isValidMotionEvent(@m80.k MotionEvent motionEvent, int i11) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i11);
        if ((Float.floatToRawIntBits(rawX) & Integer.MAX_VALUE) >= 2139095040) {
            return false;
        }
        rawY = motionEvent.getRawY(i11);
        return (Float.floatToRawIntBits(rawY) & Integer.MAX_VALUE) < 2139095040;
    }
}
