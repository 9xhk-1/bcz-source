package androidx.compose.ui.platform;

import android.content.Context;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import androidx.compose.ui.input.pointer.PointerIcon;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(24)
/* loaded from: classes2.dex */
final class AndroidComposeViewVerificationHelperMethodsN {

    @m80.k
    public static final AndroidComposeViewVerificationHelperMethodsN INSTANCE = new AndroidComposeViewVerificationHelperMethodsN();

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    @DoNotInline
    @RequiresApi(24)
    public final void setPointerIcon(@m80.k View view, @m80.l PointerIcon pointerIcon) {
        android.view.PointerIcon androidPointerIcon = toAndroidPointerIcon(view.getContext(), pointerIcon);
        if (kotlin.jvm.internal.g0.g(view.getPointerIcon(), androidPointerIcon)) {
            return;
        }
        view.setPointerIcon(androidPointerIcon);
    }

    @RequiresApi(24)
    @m80.k
    public final android.view.PointerIcon toAndroidPointerIcon(@m80.k Context context, @m80.l PointerIcon pointerIcon) {
        return pointerIcon instanceof AndroidPointerIcon ? ((AndroidPointerIcon) pointerIcon).getPointerIcon() : pointerIcon instanceof AndroidPointerIconType ? android.view.PointerIcon.getSystemIcon(context, ((AndroidPointerIconType) pointerIcon).getType()) : android.view.PointerIcon.getSystemIcon(context, 1000);
    }
}
