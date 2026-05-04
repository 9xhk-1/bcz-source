package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", f = "Ripple.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class Ripple$rememberUpdatedInstance$1$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ RippleIndicationInstance $instance;
    final /* synthetic */ InteractionSource $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1$1(InteractionSource interactionSource, RippleIndicationInstance rippleIndicationInstance, c<? super Ripple$rememberUpdatedInstance$1$1> cVar) {
        super(2, cVar);
        this.$interactionSource = interactionSource;
        this.$instance = rippleIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        Ripple$rememberUpdatedInstance$1$1 ripple$rememberUpdatedInstance$1$1 = new Ripple$rememberUpdatedInstance$1$1(this.$interactionSource, this.$instance, cVar);
        ripple$rememberUpdatedInstance$1$1.L$0 = obj;
        return ripple$rememberUpdatedInstance$1$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((Ripple$rememberUpdatedInstance$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final r0 r0Var = (r0) this.L$0;
            i<Interaction> interactions = this.$interactionSource.getInteractions();
            final RippleIndicationInstance rippleIndicationInstance = this.$instance;
            j<? super Interaction> jVar = new j() { // from class: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1.1
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                    return emit((Interaction) obj2, (c<? super g2>) cVar);
                }

                public final Object emit(Interaction interaction, c<? super g2> cVar) {
                    if (interaction instanceof PressInteraction.Press) {
                        RippleIndicationInstance.this.addRipple((PressInteraction.Press) interaction, r0Var);
                    } else if (interaction instanceof PressInteraction.Release) {
                        RippleIndicationInstance.this.removeRipple(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        RippleIndicationInstance.this.removeRipple(((PressInteraction.Cancel) interaction).getPress());
                    } else {
                        RippleIndicationInstance.this.updateStateLayer$material_ripple(interaction, r0Var);
                    }
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
