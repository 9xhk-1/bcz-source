package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PainterModifierKt {
    @k
    public static final Modifier paint(@k Modifier modifier, @k Painter painter, boolean z11, @k Alignment alignment, @k ContentScale contentScale, float f11, @l ColorFilter colorFilter) {
        return modifier.then(new PainterElement(painter, z11, alignment, contentScale, f11, colorFilter));
    }

    public static /* synthetic */ Modifier paint$default(Modifier modifier, Painter painter, boolean z11, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        Alignment alignment2 = alignment;
        if ((i11 & 8) != 0) {
            contentScale = ContentScale.Companion.getInside();
        }
        ContentScale contentScale2 = contentScale;
        if ((i11 & 16) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i11 & 32) != 0) {
            colorFilter = null;
        }
        return paint(modifier, painter, z12, alignment2, contentScale2, f12, colorFilter);
    }
}
