package androidx.compose.foundation.text;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AutofillHighlightKt {

    @k
    private static final ProvidableCompositionLocal<Color> LocalAutofillHighlightColor = CompositionLocalKt.compositionLocalOf$default(null, new x00.a<Color>() { // from class: androidx.compose.foundation.text.AutofillHighlightKt$LocalAutofillHighlightColor$1
        @Override // x00.a
        public /* bridge */ /* synthetic */ Color invoke() {
            return Color.m2499boximpl(m1024invoke0d7_KjU());
        }

        /* renamed from: invoke-0d7_KjU, reason: not valid java name */
        public final long m1024invoke0d7_KjU() {
            return AutofillHighlight_androidKt.autofillHighlightColor();
        }
    }, 1, null);

    @k
    public static final ProvidableCompositionLocal<Color> getLocalAutofillHighlightColor() {
        return LocalAutofillHighlightColor;
    }
}
