package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.TouchBoundsExpansionKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStylusHandwriting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,215:1\n113#2:216\n113#2:217\n*S KotlinDebug\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingKt\n*L\n206#1:216\n207#1:217\n*E\n"})
/* loaded from: classes.dex */
public final class StylusHandwritingKt {

    @k
    private static final DpTouchBoundsExpansion HandwritingBoundsExpansion;
    private static final float HandwritingBoundsHorizontalOffset;
    private static final float HandwritingBoundsVerticalOffset;

    static {
        float m5115constructorimpl = Dp.m5115constructorimpl(40);
        HandwritingBoundsVerticalOffset = m5115constructorimpl;
        float m5115constructorimpl2 = Dp.m5115constructorimpl(10);
        HandwritingBoundsHorizontalOffset = m5115constructorimpl2;
        HandwritingBoundsExpansion = TouchBoundsExpansionKt.m4214DpTouchBoundsExpansiona9UjIt4(m5115constructorimpl2, m5115constructorimpl, m5115constructorimpl2, m5115constructorimpl);
    }

    @k
    public static final DpTouchBoundsExpansion getHandwritingBoundsExpansion() {
        return HandwritingBoundsExpansion;
    }

    public static final float getHandwritingBoundsHorizontalOffset() {
        return HandwritingBoundsHorizontalOffset;
    }

    public static final float getHandwritingBoundsVerticalOffset() {
        return HandwritingBoundsVerticalOffset;
    }

    @k
    public static final Modifier stylusHandwriting(@k Modifier modifier, boolean z11, boolean z12, @k a<g2> aVar) {
        if (!z11 || !StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
            return modifier;
        }
        if (z12) {
            modifier = PointerIconKt.stylusHoverIcon(modifier, TextPointerIcon_androidKt.getHandwritingPointerIcon(), false, HandwritingBoundsExpansion);
        }
        return modifier.then(new StylusHandwritingElement(aVar));
    }
}
