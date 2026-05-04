package androidx.compose.foundation.text;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.j;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nLinkStateInteractionSourceObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkStateInteractionSourceObserver.kt\nandroidx/compose/foundation/text/LinkStateInteractionSourceObserver\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1#1,70:1\n1516#2:71\n*S KotlinDebug\n*F\n+ 1 LinkStateInteractionSourceObserver.kt\nandroidx/compose/foundation/text/LinkStateInteractionSourceObserver\n*L\n36#1:71\n*E\n"})
/* loaded from: classes.dex */
public final class LinkStateInteractionSourceObserver {
    public static final int $stable = 0;

    @k
    private final InteractionSource interactionSource;
    private final int Focused = 1;
    private final int Hovered = 2;
    private final int Pressed = 4;

    @k
    private final MutableIntState interactionState = SnapshotIntStateKt.mutableIntStateOf(0);

    public LinkStateInteractionSourceObserver(@k InteractionSource interactionSource) {
        this.interactionSource = interactionSource;
    }

    @l
    public final Object collectInteractionsForLinks(@k j00.c<? super g2> cVar) {
        final MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
        Object collect = this.interactionSource.getInteractions().collect(new j() { // from class: androidx.compose.foundation.text.LinkStateInteractionSourceObserver$collectInteractionsForLinks$2
            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, j00.c cVar2) {
                return emit((Interaction) obj, (j00.c<? super g2>) cVar2);
            }

            public final Object emit(Interaction interaction, j00.c<? super g2> cVar2) {
                MutableIntState mutableIntState;
                int i11;
                if (interaction instanceof HoverInteraction.Enter ? true : interaction instanceof FocusInteraction.Focus ? true : interaction instanceof PressInteraction.Press) {
                    mutableObjectList.add(interaction);
                } else if (interaction instanceof HoverInteraction.Exit) {
                    mutableObjectList.remove(((HoverInteraction.Exit) interaction).getEnter());
                } else if (interaction instanceof FocusInteraction.Unfocus) {
                    mutableObjectList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                } else if (interaction instanceof PressInteraction.Release) {
                    mutableObjectList.remove(((PressInteraction.Release) interaction).getPress());
                } else if (interaction instanceof PressInteraction.Cancel) {
                    mutableObjectList.remove(((PressInteraction.Cancel) interaction).getPress());
                }
                MutableObjectList<Interaction> mutableObjectList2 = mutableObjectList;
                LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = this;
                Object[] objArr = mutableObjectList2.content;
                int i12 = mutableObjectList2._size;
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    Interaction interaction2 = (Interaction) objArr[i14];
                    if (interaction2 instanceof HoverInteraction.Enter) {
                        i11 = linkStateInteractionSourceObserver.Hovered;
                    } else if (interaction2 instanceof FocusInteraction.Focus) {
                        i11 = linkStateInteractionSourceObserver.Focused;
                    } else if (interaction2 instanceof PressInteraction.Press) {
                        i11 = linkStateInteractionSourceObserver.Pressed;
                    }
                    i13 |= i11;
                }
                mutableIntState = this.interactionState;
                mutableIntState.setIntValue(i13);
                return g2.f100423a;
            }
        }, cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }

    public final boolean isFocused() {
        return (this.interactionState.getIntValue() & this.Focused) != 0;
    }

    public final boolean isHovered() {
        return (this.interactionState.getIntValue() & this.Hovered) != 0;
    }

    public final boolean isPressed() {
        return (this.interactionState.getIntValue() & this.Pressed) != 0;
    }
}
