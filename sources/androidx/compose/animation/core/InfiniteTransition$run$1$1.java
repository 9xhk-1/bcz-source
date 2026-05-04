package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", i = {0, 0, 1, 1}, l = {172, 193}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class InfiniteTransition$run$1$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ MutableState<State<Long>> $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InfiniteTransition this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements p<Float, j00.c<? super Boolean>, Object> {
        /* synthetic */ float F$0;
        int label;

        public AnonymousClass3(j00.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(cVar);
            anonymousClass3.F$0 = ((Number) obj).floatValue();
            return anonymousClass3;
        }

        public final Object invoke(float f11, j00.c<? super Boolean> cVar) {
            return ((AnonymousClass3) create(Float.valueOf(f11), cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return l00.a.a(this.F$0 > 0.0f);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Float f11, j00.c<? super Boolean> cVar) {
            return invoke(f11.floatValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1$1(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, j00.c<? super InfiniteTransition$run$1$1> cVar) {
        super(2, cVar);
        this.$toolingOverride = mutableState;
        this.this$0 = infiniteTransition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new InfiniteTransition$run$1$1(this.$toolingOverride, this.this$0, cVar);
        infiniteTransition$run$1$1.L$0 = obj;
        return infiniteTransition$run$1$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((InfiniteTransition$run$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
    
        if (kotlinx.coroutines.flow.k.x0(r4, r5, r7) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
    
        if (androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r4, r7) == r0) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0076 -> B:6:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005b -> B:6:0x0040). Please report as a decompilation issue!!! */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r7.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r4 = r7.L$0
            c40.r0 r4 = (c40.r0) r4
            kotlin.e.n(r8)
            r8 = r4
            goto L40
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L23:
            java.lang.Object r1 = r7.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r4 = r7.L$0
            c40.r0 r4 = (c40.r0) r4
            kotlin.e.n(r8)
            r8 = r4
            goto L56
        L30:
            kotlin.e.n(r8)
            java.lang.Object r8 = r7.L$0
            c40.r0 r8 = (c40.r0) r8
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.element = r4
        L40:
            androidx.compose.animation.core.InfiniteTransition$run$1$1$1 r4 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$1
            androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> r5 = r7.$toolingOverride
            androidx.compose.animation.core.InfiniteTransition r6 = r7.this$0
            r4.<init>()
            r7.L$0 = r8
            r7.L$1 = r1
            r7.label = r3
            java.lang.Object r4 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r4, r7)
            if (r4 != r0) goto L56
            goto L78
        L56:
            float r4 = r1.element
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L40
            androidx.compose.animation.core.InfiniteTransition$run$1$1$2 r4 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$2
            r4.<init>()
            kotlinx.coroutines.flow.i r4 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r4)
            androidx.compose.animation.core.InfiniteTransition$run$1$1$3 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$3
            r6 = 0
            r5.<init>(r6)
            r7.L$0 = r8
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r4 = kotlinx.coroutines.flow.k.x0(r4, r5, r7)
            if (r4 != r0) goto L40
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
