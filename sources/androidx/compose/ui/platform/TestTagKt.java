package androidx.compose.ui.platform;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class TestTagKt {
    @Stable
    @m80.k
    public static final Modifier testTag(@m80.k Modifier modifier, @m80.k String str) {
        return modifier.then(new TestTagElement(str));
    }
}
