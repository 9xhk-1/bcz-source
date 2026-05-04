package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.PointerInputScope;
import c40.k;
import c40.l2;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlinx.coroutines.CoroutineStart;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 extends SuspendLambda implements p<r0, j00.c<? super l2>, Object> {
    final /* synthetic */ TextDragObserver $observer;
    final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ TextDragObserver $observer;
        final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
            this.$observer = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object detectPreDragGesturesWithObserver;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                PointerInputScope pointerInputScope = this.$this_detectDownAndDragGesturesWithObserver;
                TextDragObserver textDragObserver = this.$observer;
                this.label = 1;
                detectPreDragGesturesWithObserver = LongPressTextDragObserverKt.detectPreDragGesturesWithObserver(pointerInputScope, textDragObserver, this);
                if (detectPreDragGesturesWithObserver == l11) {
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
    @d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ TextDragObserver $observer;
        final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, j00.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
            this.$observer = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object detectDragGesturesWithObserver;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                PointerInputScope pointerInputScope = this.$this_detectDownAndDragGesturesWithObserver;
                TextDragObserver textDragObserver = this.$observer;
                this.label = 1;
                detectDragGesturesWithObserver = LongPressTextDragObserverKt.detectDragGesturesWithObserver(pointerInputScope, textDragObserver, this);
                if (detectDragGesturesWithObserver == l11) {
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
    public LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, j00.c<? super LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2> cVar) {
        super(2, cVar);
        this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
        this.$observer = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, cVar);
        longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super l2> cVar) {
        return ((LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l2 f11;
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        r0 r0Var = (r0) this.L$0;
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        k.f(r0Var, null, coroutineStart, new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1, null);
        f11 = k.f(r0Var, null, coroutineStart, new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1, null);
        return f11;
    }
}
