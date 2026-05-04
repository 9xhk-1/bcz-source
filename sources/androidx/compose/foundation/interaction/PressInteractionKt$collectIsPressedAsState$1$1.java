package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import c40.r0;
import j00.c;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l00.a;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class PressInteractionKt$collectIsPressedAsState$1$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ MutableState<Boolean> $isPressed;
    final /* synthetic */ InteractionSource $this_collectIsPressedAsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressInteractionKt$collectIsPressedAsState$1$1(InteractionSource interactionSource, MutableState<Boolean> mutableState, c<? super PressInteractionKt$collectIsPressedAsState$1$1> cVar) {
        super(2, cVar);
        this.$this_collectIsPressedAsState = interactionSource;
        this.$isPressed = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new PressInteractionKt$collectIsPressedAsState$1$1(this.$this_collectIsPressedAsState, this.$isPressed, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((PressInteractionKt$collectIsPressedAsState$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final ArrayList arrayList = new ArrayList();
            i<Interaction> interactions = this.$this_collectIsPressedAsState.getInteractions();
            final MutableState<Boolean> mutableState = this.$isPressed;
            j<? super Interaction> jVar = new j() { // from class: androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1.1
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                    return emit((Interaction) obj2, (c<? super g2>) cVar);
                }

                public final Object emit(Interaction interaction, c<? super g2> cVar) {
                    if (interaction instanceof PressInteraction.Press) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        arrayList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        arrayList.remove(((PressInteraction.Cancel) interaction).getPress());
                    }
                    mutableState.setValue(a.a(!arrayList.isEmpty()));
                    return g2.f100423a;
                }
            };
            this.label = 1;
            if (interactions.collect(jVar, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
