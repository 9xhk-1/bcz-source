package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextSelectionColorsKt {
    private static final long DefaultSelectionColor;

    @k
    private static final TextSelectionColors DefaultTextSelectionColors;

    @k
    private static final ProvidableCompositionLocal<TextSelectionColors> LocalTextSelectionColors = CompositionLocalKt.compositionLocalOf$default(null, new x00.a<TextSelectionColors>() { // from class: androidx.compose.foundation.text.selection.TextSelectionColorsKt$LocalTextSelectionColors$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final TextSelectionColors invoke() {
            TextSelectionColors textSelectionColors;
            textSelectionColors = TextSelectionColorsKt.DefaultTextSelectionColors;
            return textSelectionColors;
        }
    }, 1, null);

    static {
        long Color = ColorKt.Color(4282550004L);
        DefaultSelectionColor = Color;
        DefaultTextSelectionColors = new TextSelectionColors(Color, Color.m2508copywmQWz5c$default(Color, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    @k
    public static final ProvidableCompositionLocal<TextSelectionColors> getLocalTextSelectionColors() {
        return LocalTextSelectionColors;
    }

    @Stable
    private static /* synthetic */ void getDefaultTextSelectionColors$annotations() {
    }
}
