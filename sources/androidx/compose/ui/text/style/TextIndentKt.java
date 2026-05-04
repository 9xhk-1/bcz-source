package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class TextIndentKt {
    @k
    public static final TextIndent lerp(@k TextIndent textIndent, @k TextIndent textIndent2, float f11) {
        return new TextIndent(SpanStyleKt.m4506lerpTextUnitInheritableC3pnCVY(textIndent.m5001getFirstLineXSAIIZE(), textIndent2.m5001getFirstLineXSAIIZE(), f11), SpanStyleKt.m4506lerpTextUnitInheritableC3pnCVY(textIndent.m5002getRestLineXSAIIZE(), textIndent2.m5002getRestLineXSAIIZE(), f11), null);
    }
}
