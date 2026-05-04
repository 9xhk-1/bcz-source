package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c40.k;
import c40.l2;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlinx.coroutines.CoroutineStart;
import l00.d;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$selectionHandleGestures$2 extends SuspendLambda implements p<r0, c<? super l2>, Object> {
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {392}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = textFieldSelectionState;
            this.$this_selectionHandleGestures = pointerInputScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$this_selectionHandleGestures, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                this.label = 1;
                if (textFieldSelectionState.detectTouchMode(pointerInputScope, this) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {394}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, boolean z11, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$this_selectionHandleGestures = pointerInputScope;
            this.this$0 = textFieldSelectionState;
            this.$isStartHandle = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                final TextFieldSelectionState textFieldSelectionState = this.this$0;
                final boolean z11 = this.$isStartHandle;
                TapOnPosition tapOnPosition = new TapOnPosition() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.1
                    @Override // androidx.compose.foundation.text.input.internal.selection.TapOnPosition
                    /* renamed from: onEvent-k-4lQ0M */
                    public final void mo1337onEventk4lQ0M(long j11) {
                        long m1357getHandlePositiontuRUvjQ;
                        TextFieldSelectionState.this.markStartContentVisibleOffset();
                        TextFieldSelectionState textFieldSelectionState2 = TextFieldSelectionState.this;
                        boolean z12 = z11;
                        Handle handle = z12 ? Handle.SelectionStart : Handle.SelectionEnd;
                        m1357getHandlePositiontuRUvjQ = textFieldSelectionState2.m1357getHandlePositiontuRUvjQ(z12);
                        textFieldSelectionState2.m1367updateHandleDraggingUv8p0NA(handle, SelectionHandlesKt.m1449getAdjustedCoordinatesk4lQ0M(m1357getHandlePositiontuRUvjQ));
                    }
                };
                final TextFieldSelectionState textFieldSelectionState2 = this.this$0;
                a<g2> aVar = new a<g2>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.2
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
                        TextFieldSelectionState.this.clearHandleDragging();
                    }
                };
                this.label = 1;
                if (PressDownGestureKt.detectPressDownGesture(pointerInputScope, tapOnPosition, aVar, this) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {411}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z11, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.this$0 = textFieldSelectionState;
            this.$this_selectionHandleGestures = pointerInputScope;
            this.$isStartHandle = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass3(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass3) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object detectSelectionHandleDragGestures;
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                boolean z11 = this.$isStartHandle;
                this.label = 1;
                detectSelectionHandleDragGestures = textFieldSelectionState.detectSelectionHandleDragGestures(pointerInputScope, z11, this);
                if (detectSelectionHandleDragGestures == l11) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$selectionHandleGestures$2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z11, c<? super TextFieldSelectionState$selectionHandleGestures$2> cVar) {
        super(2, cVar);
        this.this$0 = textFieldSelectionState;
        this.$this_selectionHandleGestures = pointerInputScope;
        this.$isStartHandle = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TextFieldSelectionState$selectionHandleGestures$2 textFieldSelectionState$selectionHandleGestures$2 = new TextFieldSelectionState$selectionHandleGestures$2(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, cVar);
        textFieldSelectionState$selectionHandleGestures$2.L$0 = obj;
        return textFieldSelectionState$selectionHandleGestures$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super l2> cVar) {
        return ((TextFieldSelectionState$selectionHandleGestures$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l2 f11;
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        r0 r0Var = (r0) this.L$0;
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        k.f(r0Var, null, coroutineStart, new AnonymousClass1(this.this$0, this.$this_selectionHandleGestures, null), 1, null);
        k.f(r0Var, null, coroutineStart, new AnonymousClass2(this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle, null), 1, null);
        f11 = k.f(r0Var, null, coroutineStart, new AnonymousClass3(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, null), 1, null);
        return f11;
    }
}
