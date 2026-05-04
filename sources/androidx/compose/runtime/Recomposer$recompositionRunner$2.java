package androidx.compose.runtime;

import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1072}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
@u0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1791:1\n33#2,2:1792\n33#2,2:1800\n33#3,6:1794\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n1070#1:1792,2\n1075#1:1800,2\n1070#1:1794,6\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer$recompositionRunner$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ q<r0, MonotonicFrameClock, c<? super g2>, Object> $block;
    final /* synthetic */ MonotonicFrameClock $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", i = {}, l = {1072}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ q<r0, MonotonicFrameClock, c<? super g2>, Object> $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(q<? super r0, ? super MonotonicFrameClock, ? super c<? super g2>, ? extends Object> qVar, MonotonicFrameClock monotonicFrameClock, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$block = qVar;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$block, this.$parentFrameClock, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
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
                r0 r0Var = (r0) this.L$0;
                q<r0, MonotonicFrameClock, c<? super g2>, Object> qVar = this.$block;
                MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                this.label = 1;
                if (qVar.invoke(r0Var, monotonicFrameClock, this) == l11) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, q<? super r0, ? super MonotonicFrameClock, ? super c<? super g2>, ? extends Object> qVar, MonotonicFrameClock monotonicFrameClock, c<? super Recomposer$recompositionRunner$2> cVar) {
        super(2, cVar);
        this.this$0 = recomposer;
        this.$block = qVar;
        this.$parentFrameClock = monotonicFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, cVar);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((Recomposer$recompositionRunner$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$recompositionRunner$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
