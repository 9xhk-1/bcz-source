package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
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
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$cursorHandleGestures$2 extends SuspendLambda implements p<r0, c<? super l2>, Object> {
    final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {372}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = textFieldSelectionState;
            this.$this_cursorHandleGestures = pointerInputScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$this_cursorHandleGestures, cVar);
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
                PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
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
    @d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {373}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = textFieldSelectionState;
            this.$this_cursorHandleGestures = pointerInputScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(this.this$0, this.$this_cursorHandleGestures, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object detectCursorHandleDragGestures;
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                this.label = 1;
                detectCursorHandleDragGestures = textFieldSelectionState.detectCursorHandleDragGestures(pointerInputScope, this);
                if (detectCursorHandleDragGestures == l11) {
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
    @d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$this_cursorHandleGestures = pointerInputScope;
            this.this$0 = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass3(this.$this_cursorHandleGestures, this.this$0, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass3) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                final TextFieldSelectionState textFieldSelectionState = this.this$0;
                l<Offset, g2> lVar = new l<Offset, g2>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.cursorHandleGestures.2.3.1
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                        m1373invokek4lQ0M(offset.m2278unboximpl());
                        return g2.f100423a;
                    }

                    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m1373invokek4lQ0M(long j11) {
                        TextToolbarState textToolbarState;
                        TextFieldSelectionState textFieldSelectionState2 = TextFieldSelectionState.this;
                        textToolbarState = textFieldSelectionState2.getTextToolbarState();
                        TextToolbarState textToolbarState2 = TextToolbarState.Cursor;
                        if (textToolbarState == textToolbarState2) {
                            textToolbarState2 = TextToolbarState.None;
                        }
                        textFieldSelectionState2.setTextToolbarState(textToolbarState2);
                    }
                };
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, lVar, this, 7, null) == l11) {
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
    public TextFieldSelectionState$cursorHandleGestures$2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, c<? super TextFieldSelectionState$cursorHandleGestures$2> cVar) {
        super(2, cVar);
        this.this$0 = textFieldSelectionState;
        this.$this_cursorHandleGestures = pointerInputScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TextFieldSelectionState$cursorHandleGestures$2 textFieldSelectionState$cursorHandleGestures$2 = new TextFieldSelectionState$cursorHandleGestures$2(this.this$0, this.$this_cursorHandleGestures, cVar);
        textFieldSelectionState$cursorHandleGestures$2.L$0 = obj;
        return textFieldSelectionState$cursorHandleGestures$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super l2> cVar) {
        return ((TextFieldSelectionState$cursorHandleGestures$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
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
        k.f(r0Var, null, coroutineStart, new AnonymousClass1(this.this$0, this.$this_cursorHandleGestures, null), 1, null);
        k.f(r0Var, null, coroutineStart, new AnonymousClass2(this.this$0, this.$this_cursorHandleGestures, null), 1, null);
        f11 = k.f(r0Var, null, coroutineStart, new AnonymousClass3(this.$this_cursorHandleGestures, this.this$0, null), 1, null);
        return f11;
    }
}
