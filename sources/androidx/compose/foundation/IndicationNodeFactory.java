package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.node.DelegatableNode;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface IndicationNodeFactory extends Indication {
    @m80.k
    DelegatableNode create(@m80.k InteractionSource interactionSource);

    boolean equals(@l Object obj);

    int hashCode();
}
