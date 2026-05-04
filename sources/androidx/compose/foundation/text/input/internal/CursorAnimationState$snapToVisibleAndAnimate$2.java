package androidx.compose.foundation.text.input.internal;

import c40.l2;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class CursorAnimationState$snapToVisibleAndAnimate$2 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CursorAnimationState this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", i = {}, l = {72, 77, 79, 81}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
        final /* synthetic */ l2 $oldJob;
        int label;
        final /* synthetic */ CursorAnimationState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l2 l2Var, CursorAnimationState cursorAnimationState, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$oldJob = l2Var;
            this.this$0 = cursorAnimationState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new AnonymousClass1(this.$oldJob, this.this$0, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
        
            if (c40.a1.b(500, r10) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0040, code lost:
        
            if (c40.n2.l(r11, r10) == r0) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0073 -> B:9:0x0076). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.label
                r2 = 0
                r3 = 500(0x1f4, double:2.47E-321)
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 4
                r7 = 3
                r8 = 2
                r9 = 1
                if (r1 == 0) goto L33
                if (r1 == r9) goto L2f
                if (r1 == r8) goto L2b
                if (r1 == r7) goto L27
                if (r1 != r6) goto L1f
                kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L1d
                goto L76
            L1d:
                r11 = move-exception
                goto L7c
            L1f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L27:
                kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L1d
                goto L68
            L2b:
                kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L1d
                goto L59
            L2f:
                kotlin.e.n(r11)
                goto L43
            L33:
                kotlin.e.n(r11)
                c40.l2 r11 = r10.$oldJob
                if (r11 == 0) goto L43
                r10.label = r9
                java.lang.Object r11 = c40.n2.l(r11, r10)
                if (r11 != r0) goto L43
                goto L75
            L43:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r5)     // Catch: java.lang.Throwable -> L1d
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                boolean r11 = r11.getAnimate()     // Catch: java.lang.Throwable -> L1d
                if (r11 != 0) goto L5f
                r10.label = r8     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r11 = c40.a1.a(r10)     // Catch: java.lang.Throwable -> L1d
                if (r11 != r0) goto L59
                goto L75
            L59:
                kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1d
                r11.<init>()     // Catch: java.lang.Throwable -> L1d
                throw r11     // Catch: java.lang.Throwable -> L1d
            L5f:
                r10.label = r7     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r11 = c40.a1.b(r3, r10)     // Catch: java.lang.Throwable -> L1d
                if (r11 != r0) goto L68
                goto L75
            L68:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r2)     // Catch: java.lang.Throwable -> L1d
                r10.label = r6     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r11 = c40.a1.b(r3, r10)     // Catch: java.lang.Throwable -> L1d
                if (r11 != r0) goto L76
            L75:
                return r0
            L76:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r5)     // Catch: java.lang.Throwable -> L1d
                goto L5f
            L7c:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r0 = r10.this$0
                androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r0, r2)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnimationState$snapToVisibleAndAnimate$2(CursorAnimationState cursorAnimationState, j00.c<? super CursorAnimationState$snapToVisibleAndAnimate$2> cVar) {
        super(2, cVar);
        this.this$0 = cursorAnimationState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.this$0, cVar);
        cursorAnimationState$snapToVisibleAndAnimate$2.L$0 = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super Boolean> cVar) {
        return ((CursorAnimationState$snapToVisibleAndAnimate$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        l2 f11;
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        c40.r0 r0Var = (c40.r0) this.L$0;
        atomicReference = this.this$0.animationJob;
        l2 l2Var = (l2) atomicReference.getAndSet(null);
        atomicReference2 = this.this$0.animationJob;
        f11 = c40.k.f(r0Var, null, null, new AnonymousClass1(l2Var, this.this$0, null), 3, null);
        return l00.a.a(androidx.camera.view.q.a(atomicReference2, null, f11));
    }
}
