package androidx.compose.foundation.selection;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SelectableGroupKt {
    @Stable
    @k
    public static final Modifier selectableGroup(@k Modifier modifier) {
        return SemanticsModifierKt.semantics$default(modifier, false, new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.foundation.selection.SelectableGroupKt$selectableGroup$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
            }
        }, 1, null);
    }
}
