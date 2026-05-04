package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import j00.c;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface MutableInteractionSource extends InteractionSource {
    @l
    Object emit(@k Interaction interaction, @k c<? super g2> cVar);

    boolean tryEmit(@k Interaction interaction);
}
