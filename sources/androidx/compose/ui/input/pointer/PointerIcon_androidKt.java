package androidx.compose.ui.input.pointer;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PointerIcon_androidKt {

    @k
    private static final PointerIcon pointerIconDefault = new AndroidPointerIconType(1000);

    @k
    private static final PointerIcon pointerIconCrosshair = new AndroidPointerIconType(1007);

    @k
    private static final PointerIcon pointerIconText = new AndroidPointerIconType(1008);

    @k
    private static final PointerIcon pointerIconHand = new AndroidPointerIconType(1002);

    @k
    public static final PointerIcon PointerIcon(@k android.view.PointerIcon pointerIcon) {
        return new AndroidPointerIcon(pointerIcon);
    }

    @k
    public static final PointerIcon getPointerIconCrosshair() {
        return pointerIconCrosshair;
    }

    @k
    public static final PointerIcon getPointerIconDefault() {
        return pointerIconDefault;
    }

    @k
    public static final PointerIcon getPointerIconHand() {
        return pointerIconHand;
    }

    @k
    public static final PointerIcon getPointerIconText() {
        return pointerIconText;
    }

    @k
    public static final PointerIcon PointerIcon(int i11) {
        return new AndroidPointerIconType(i11);
    }
}
