package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final /* synthetic */ class BringIntoViewRequesterKt__BringIntoViewRequesterKt {
    @k
    public static final BringIntoViewRequester BringIntoViewRequester() {
        return new BringIntoViewRequesterImpl();
    }

    @k
    public static final Modifier bringIntoViewRequester(@k Modifier modifier, @k BringIntoViewRequester bringIntoViewRequester) {
        return modifier.then(new BringIntoViewRequesterElement(bringIntoViewRequester));
    }
}
