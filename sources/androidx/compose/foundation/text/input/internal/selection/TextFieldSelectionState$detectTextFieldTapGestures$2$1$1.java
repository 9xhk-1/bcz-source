package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1", f = "TextFieldSelectionState.kt", i = {}, l = {502, TypedValues.PositionType.TYPE_POSITION_TYPE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ PressGestureScope $$this$detectTapAndPress;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $offset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1", f = "TextFieldSelectionState.kt", i = {1}, l = {494, 499}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ long $offset;
        Object L$0;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, long j11, MutableInteractionSource mutableInteractionSource, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = textFieldSelectionState;
            this.$offset = j11;
            this.$interactionSource = mutableInteractionSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$offset, this.$interactionSource, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                java.lang.Object r0 = r7.L$0
                androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                kotlin.e.n(r8)
                goto L5f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                java.lang.Object r1 = r7.L$0
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r1
                kotlin.e.n(r8)
                goto L47
            L27:
                kotlin.e.n(r8)
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r8 = r7.this$0
                androidx.compose.foundation.interaction.PressInteraction$Press r8 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$getPressInteraction$p(r8)
                if (r8 == 0) goto L4a
                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5 = r7.this$0
                androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                r6.<init>(r8)
                r7.L$0 = r5
                r7.label = r4
                java.lang.Object r8 = r1.emit(r6, r7)
                if (r8 != r0) goto L46
                goto L5d
            L46:
                r1 = r5
            L47:
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$setPressInteraction$p(r1, r2)
            L4a:
                androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
                long r4 = r7.$offset
                r8.<init>(r4, r2)
                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                r7.L$0 = r8
                r7.label = r3
                java.lang.Object r1 = r1.emit(r8, r7)
                if (r1 != r0) goto L5e
            L5d:
                return r0
            L5e:
                r0 = r8
            L5f:
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r8 = r7.this$0
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$setPressInteraction$p(r8, r0)
                yz.g2 r8 = yz.g2.f100423a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(PressGestureScope pressGestureScope, TextFieldSelectionState textFieldSelectionState, long j11, MutableInteractionSource mutableInteractionSource, c<? super TextFieldSelectionState$detectTextFieldTapGestures$2$1$1> cVar) {
        super(2, cVar);
        this.$$this$detectTapAndPress = pressGestureScope;
        this.this$0 = textFieldSelectionState;
        this.$offset = j11;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 textFieldSelectionState$detectTextFieldTapGestures$2$1$1 = new TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(this.$$this$detectTapAndPress, this.this$0, this.$offset, this.$interactionSource, cVar);
        textFieldSelectionState$detectTextFieldTapGestures$2$1$1.L$0 = obj;
        return textFieldSelectionState$detectTextFieldTapGestures$2$1$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((TextFieldSelectionState$detectTextFieldTapGestures$2$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r3.emit(r12, r11) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r12 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r12)
            goto L6b
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            kotlin.e.n(r12)
            goto L45
        L1e:
            kotlin.e.n(r12)
            java.lang.Object r12 = r11.L$0
            r4 = r12
            c40.r0 r4 = (c40.r0) r4
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1 r5 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r11.this$0
            long r7 = r11.$offset
            androidx.compose.foundation.interaction.MutableInteractionSource r9 = r11.$interactionSource
            r10 = 0
            r5.<init>(r6, r7, r9, r10)
            r8 = 3
            r9 = 0
            r7 = r5
            r5 = 0
            r6 = 0
            c40.i.e(r4, r5, r6, r7, r8, r9)
            androidx.compose.foundation.gestures.PressGestureScope r12 = r11.$$this$detectTapAndPress
            r11.label = r3
            java.lang.Object r12 = r12.tryAwaitRelease(r11)
            if (r12 != r0) goto L45
            goto L6a
        L45:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = r11.this$0
            androidx.compose.foundation.interaction.PressInteraction$Press r1 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$getPressInteraction$p(r1)
            if (r1 == 0) goto L6b
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = r11.$interactionSource
            if (r12 == 0) goto L5d
            androidx.compose.foundation.interaction.PressInteraction$Release r12 = new androidx.compose.foundation.interaction.PressInteraction$Release
            r12.<init>(r1)
            goto L62
        L5d:
            androidx.compose.foundation.interaction.PressInteraction$Cancel r12 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r12.<init>(r1)
        L62:
            r11.label = r2
            java.lang.Object r12 = r3.emit(r12, r11)
            if (r12 != r0) goto L6b
        L6a:
            return r0
        L6b:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r12 = r11.this$0
            r0 = 0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$setPressInteraction$p(r12, r0)
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
