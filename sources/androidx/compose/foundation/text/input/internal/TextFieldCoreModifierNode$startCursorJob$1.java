package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1", f = "TextFieldCoreModifier.kt", i = {}, l = {558}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode$startCursorJob$1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2", f = "TextFieldCoreModifier.kt", i = {}, l = {560}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements x00.p<Integer, j00.c<? super g2>, Object> {
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ TextFieldCoreModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextFieldCoreModifierNode textFieldCoreModifierNode, j00.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = textFieldCoreModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, cVar);
            anonymousClass2.I$0 = ((Number) obj).intValue();
            return anonymousClass2;
        }

        public final Object invoke(int i11, j00.c<? super g2> cVar) {
            return ((AnonymousClass2) create(Integer.valueOf(i11), cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        
            r4 = r3.this$0.cursorAnimation;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.e.n(r4)
                goto L33
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.e.n(r4)
                int r4 = r3.I$0
                int r4 = java.lang.Math.abs(r4)
                if (r4 != r2) goto L33
                androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode r4 = r3.this$0
                androidx.compose.foundation.text.input.internal.CursorAnimationState r4 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.access$getCursorAnimation$p(r4)
                if (r4 == 0) goto L33
                r3.label = r2
                java.lang.Object r4 = r4.snapToVisibleAndAnimate(r3)
                if (r4 != r0) goto L33
                return r0
            L33:
                yz.g2 r4 = yz.g2.f100423a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, j00.c<? super g2> cVar) {
            return invoke(num.intValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$startCursorJob$1(TextFieldCoreModifierNode textFieldCoreModifierNode, j00.c<? super TextFieldCoreModifierNode$startCursorJob$1> cVar) {
        super(2, cVar);
        this.this$0 = textFieldCoreModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new TextFieldCoreModifierNode$startCursorJob$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
        return ((TextFieldCoreModifierNode$startCursorJob$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = 1;
            final TextFieldCoreModifierNode textFieldCoreModifierNode = this.this$0;
            kotlinx.coroutines.flow.i snapshotFlow = SnapshotStateKt.snapshotFlow(new x00.a<Integer>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Integer invoke() {
                    TransformedTextFieldState transformedTextFieldState;
                    transformedTextFieldState = TextFieldCoreModifierNode.this.textFieldState;
                    transformedTextFieldState.getVisualText();
                    Integer valueOf = Integer.valueOf(((TextFieldCoreModifierNode.this.isAttached() && ((WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(TextFieldCoreModifierNode.this, CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused()) ? 1 : 2) * intRef.element);
                    intRef.element *= -1;
                    return valueOf;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.k.C(snapshotFlow, anonymousClass2, this) == l11) {
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
