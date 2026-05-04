package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextLinkStyles;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextLinkScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNullOrEmpty(TextLinkStyles textLinkStyles) {
        if (textLinkStyles != null) {
            return textLinkStyles.getStyle() == null && textLinkStyles.getFocusedStyle() == null && textLinkStyles.getHoveredStyle() == null && textLinkStyles.getPressedStyle() == null;
        }
        return true;
    }
}
