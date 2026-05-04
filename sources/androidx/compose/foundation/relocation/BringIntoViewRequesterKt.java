package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import m80.k;
import yz.n;

/* loaded from: classes.dex */
public final class BringIntoViewRequesterKt {
    @k
    public static final BringIntoViewRequester BringIntoViewRequester() {
        return BringIntoViewRequesterKt__BringIntoViewRequesterKt.BringIntoViewRequester();
    }

    @k
    public static final Modifier bringIntoViewRequester(@k Modifier modifier, @k BringIntoViewRequester bringIntoViewRequester) {
        return BringIntoViewRequesterKt__BringIntoViewRequesterKt.bringIntoViewRequester(modifier, bringIntoViewRequester);
    }

    @n(message = "Use BringIntoViewModifierNode instead")
    @k
    public static final Modifier bringIntoViewResponder(@k Modifier modifier, @k BringIntoViewResponder bringIntoViewResponder) {
        return BringIntoViewRequesterKt__BringIntoViewResponderKt.bringIntoViewResponder(modifier, bringIntoViewResponder);
    }
}
