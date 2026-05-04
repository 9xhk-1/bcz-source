package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class NestedScrollModifierKt {
    @k
    public static final Modifier nestedScroll(@k Modifier modifier, @k NestedScrollConnection nestedScrollConnection, @l NestedScrollDispatcher nestedScrollDispatcher) {
        return modifier.then(new NestedScrollElement(nestedScrollConnection, nestedScrollDispatcher));
    }

    public static /* synthetic */ Modifier nestedScroll$default(Modifier modifier, NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            nestedScrollDispatcher = null;
        }
        return nestedScroll(modifier, nestedScrollConnection, nestedScrollDispatcher);
    }
}
