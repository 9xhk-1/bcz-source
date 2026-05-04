package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import c40.s0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {489}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$detectTextFieldTapGestures$2 extends SuspendLambda implements q<PressGestureScope, Offset, c<? super g2>, Object> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTextFieldTapGestures$2(MutableInteractionSource mutableInteractionSource, TextFieldSelectionState textFieldSelectionState, c<? super TextFieldSelectionState$detectTextFieldTapGestures$2> cVar) {
        super(3, cVar);
        this.$interactionSource = mutableInteractionSource;
        this.this$0 = textFieldSelectionState;
    }

    @Override // x00.q
    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, c<? super g2> cVar) {
        return m1378invoked4ec7I(pressGestureScope, offset.m2278unboximpl(), cVar);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m1378invoked4ec7I(PressGestureScope pressGestureScope, long j11, c<? super g2> cVar) {
        TextFieldSelectionState$detectTextFieldTapGestures$2 textFieldSelectionState$detectTextFieldTapGestures$2 = new TextFieldSelectionState$detectTextFieldTapGestures$2(this.$interactionSource, this.this$0, cVar);
        textFieldSelectionState$detectTextFieldTapGestures$2.L$0 = pressGestureScope;
        textFieldSelectionState$detectTextFieldTapGestures$2.J$0 = j11;
        return textFieldSelectionState$detectTextFieldTapGestures$2.invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
            long j11 = this.J$0;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            if (mutableInteractionSource != null) {
                TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 textFieldSelectionState$detectTextFieldTapGestures$2$1$1 = new TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(pressGestureScope, this.this$0, j11, mutableInteractionSource, null);
                this.label = 1;
                if (s0.g(textFieldSelectionState$detectTextFieldTapGestures$2$1$1, this) == l11) {
                    return l11;
                }
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
