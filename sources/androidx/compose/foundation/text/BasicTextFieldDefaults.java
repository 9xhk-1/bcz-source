package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class BasicTextFieldDefaults {

    @k
    public static final BasicTextFieldDefaults INSTANCE = new BasicTextFieldDefaults();

    @k
    private static final SolidColor CursorBrush = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);

    private BasicTextFieldDefaults() {
    }

    @k
    public final SolidColor getCursorBrush() {
        return CursorBrush;
    }
}
