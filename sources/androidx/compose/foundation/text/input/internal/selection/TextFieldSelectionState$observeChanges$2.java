package androidx.compose.foundation.text.input.internal.selection;

import c40.k;
import c40.l2;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$observeChanges$2 extends SuspendLambda implements p<r0, c<? super l2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {423}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object observeTextChanges;
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                this.label = 1;
                observeTextChanges = textFieldSelectionState.observeTextChanges(this);
                if (observeTextChanges == l11) {
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
    @d(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {424}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(this.this$0, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object observeTextToolbarVisibility;
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                this.label = 1;
                observeTextToolbarVisibility = textFieldSelectionState.observeTextToolbarVisibility(this);
                if (observeTextToolbarVisibility == l11) {
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
    public TextFieldSelectionState$observeChanges$2(TextFieldSelectionState textFieldSelectionState, c<? super TextFieldSelectionState$observeChanges$2> cVar) {
        super(2, cVar);
        this.this$0 = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TextFieldSelectionState$observeChanges$2 textFieldSelectionState$observeChanges$2 = new TextFieldSelectionState$observeChanges$2(this.this$0, cVar);
        textFieldSelectionState$observeChanges$2.L$0 = obj;
        return textFieldSelectionState$observeChanges$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super l2> cVar) {
        return ((TextFieldSelectionState$observeChanges$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
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
        k.f(r0Var, null, null, new AnonymousClass1(this.this$0, null), 3, null);
        f11 = k.f(r0Var, null, null, new AnonymousClass2(this.this$0, null), 3, null);
        return f11;
    }
}
