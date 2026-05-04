package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.x;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
final class MutableInteractionSourceImpl implements MutableInteractionSource {

    @k
    private final x<Interaction> interactions = e0.b(0, 16, BufferOverflow.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    @l
    public Object emit(@k Interaction interaction, @k c<? super g2> cVar) {
        Object emit = getInteractions().emit(interaction, cVar);
        return emit == b.l() ? emit : g2.f100423a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(@k Interaction interaction) {
        return getInteractions().d(interaction);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    @k
    public x<Interaction> getInteractions() {
        return this.interactions;
    }
}
