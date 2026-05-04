package androidx.compose.foundation;

import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.node.DrawModifierNodeKt;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", i = {}, l = {com.jiongji.andriod.card.R.styleable.Theme_drawable_syncview_error}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ DefaultDebugIndication.DefaultDebugIndicationInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance, j00.c<? super DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultDebugIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InteractionSource interactionSource;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            final Ref.IntRef intRef = new Ref.IntRef();
            final Ref.IntRef intRef2 = new Ref.IntRef();
            final Ref.IntRef intRef3 = new Ref.IntRef();
            interactionSource = this.this$0.interactionSource;
            kotlinx.coroutines.flow.i<Interaction> interactions = interactionSource.getInteractions();
            final DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = this.this$0;
            kotlinx.coroutines.flow.j<? super Interaction> jVar = new kotlinx.coroutines.flow.j() { // from class: androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1.1
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, j00.c cVar) {
                    return emit((Interaction) obj2, (j00.c<? super g2>) cVar);
                }

                public final Object emit(Interaction interaction, j00.c<? super g2> cVar) {
                    boolean z11;
                    boolean z12;
                    boolean z13;
                    boolean z14 = true;
                    if (interaction instanceof PressInteraction.Press) {
                        Ref.IntRef.this.element++;
                    } else if (interaction instanceof PressInteraction.Release) {
                        Ref.IntRef intRef4 = Ref.IntRef.this;
                        intRef4.element--;
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        Ref.IntRef intRef5 = Ref.IntRef.this;
                        intRef5.element--;
                    } else if (interaction instanceof HoverInteraction.Enter) {
                        intRef2.element++;
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        Ref.IntRef intRef6 = intRef2;
                        intRef6.element--;
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        intRef3.element++;
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        Ref.IntRef intRef7 = intRef3;
                        intRef7.element--;
                    }
                    boolean z15 = false;
                    boolean z16 = Ref.IntRef.this.element > 0;
                    boolean z17 = intRef2.element > 0;
                    boolean z18 = intRef3.element > 0;
                    z11 = defaultDebugIndicationInstance.isPressed;
                    if (z11 != z16) {
                        defaultDebugIndicationInstance.isPressed = z16;
                        z15 = true;
                    }
                    z12 = defaultDebugIndicationInstance.isHovered;
                    if (z12 != z17) {
                        defaultDebugIndicationInstance.isHovered = z17;
                        z15 = true;
                    }
                    z13 = defaultDebugIndicationInstance.isFocused;
                    if (z13 != z18) {
                        defaultDebugIndicationInstance.isFocused = z18;
                    } else {
                        z14 = z15;
                    }
                    if (z14) {
                        DrawModifierNodeKt.invalidateDraw(defaultDebugIndicationInstance);
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
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }
}
