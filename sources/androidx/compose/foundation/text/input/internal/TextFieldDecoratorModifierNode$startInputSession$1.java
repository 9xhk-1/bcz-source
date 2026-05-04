package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {745}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$startInputSession$1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
    final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
    int label;
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {746}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements x00.p<PlatformTextInputSessionScope, j00.c<?>, Object> {
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TextFieldDecoratorModifierNode this$0;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
        public /* synthetic */ class C00641 extends FunctionReferenceImpl implements x00.l<ImeAction, g2> {
            public C00641(Object obj) {
                super(1, obj, TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ImeAction imeAction) {
                m1286invokeKlQnJC8(imeAction.m4728unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m1286invokeKlQnJC8(int i11) {
                ((TextFieldDecoratorModifierNode) this.receiver).m1284onImeActionPerformedKlQnJC8(i11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = textFieldDecoratorModifierNode;
            this.$receiveContentConfiguration = receiveContentConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$receiveContentConfiguration, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, j00.c<?> cVar) {
            return ((AnonymousClass1) create(platformTextInputSessionScope, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 == 0) {
                kotlin.e.n(obj);
                PlatformTextInputSessionScope platformTextInputSessionScope = (PlatformTextInputSessionScope) this.L$0;
                TransformedTextFieldState textFieldState = this.this$0.getTextFieldState();
                TextLayoutState textLayoutState = this.this$0.getTextLayoutState();
                ImeOptions imeOptions$foundation_release = this.this$0.getKeyboardOptions().toImeOptions$foundation_release(this.this$0.getSingleLine());
                ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
                C00641 c00641 = new C00641(this.this$0);
                final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                x00.a<g2> aVar = new x00.a<g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.startInputSession.1.1.2
                    {
                        super(0);
                    }

                    @Override // x00.a
                    public /* bridge */ /* synthetic */ g2 invoke() {
                        invoke2();
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                    }
                };
                kotlinx.coroutines.flow.x<g2> stylusHandwritingTrigger = this.this$0.getStylusHandwritingTrigger();
                ViewConfiguration viewConfiguration = (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalViewConfiguration());
                this.label = 1;
                if (AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSessionScope, textFieldState, textLayoutState, imeOptions$foundation_release, receiveContentConfiguration, c00641, aVar, stylusHandwritingTrigger, viewConfiguration, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$startInputSession$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, j00.c<? super TextFieldDecoratorModifierNode$startInputSession$1> cVar) {
        super(2, cVar);
        this.this$0 = textFieldDecoratorModifierNode;
        this.$receiveContentConfiguration = receiveContentConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new TextFieldDecoratorModifierNode$startInputSession$1(this.this$0, this.$receiveContentConfiguration, cVar);
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
        return ((TextFieldDecoratorModifierNode$startInputSession$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(textFieldDecoratorModifierNode, this.$receiveContentConfiguration, null);
            this.label = 1;
            if (PlatformTextInputModifierNodeKt.establishTextInputSession(textFieldDecoratorModifierNode, anonymousClass1, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
