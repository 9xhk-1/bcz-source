package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIcon_androidKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextPointerIcon_androidKt {

    @k
    private static final PointerIcon textPointerIcon = PointerIcon_androidKt.PointerIcon(1008);

    @k
    private static final PointerIcon handwritingPointerIcon = PointerIcon_androidKt.PointerIcon(1022);

    @k
    public static final PointerIcon getHandwritingPointerIcon() {
        return handwritingPointerIcon;
    }

    @k
    public static final PointerIcon getTextPointerIcon() {
        return textPointerIcon;
    }
}
