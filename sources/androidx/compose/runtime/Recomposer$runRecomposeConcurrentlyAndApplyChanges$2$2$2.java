package androidx.compose.runtime;

import c40.n;
import c40.r0;
import j00.c;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1791:1\n33#2,2:1792\n1#3:1794\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2\n*L\n918#1:1792,2\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ ControlledComposition $composition;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(Recomposer recomposer, ControlledComposition controlledComposition, c<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2> cVar) {
        super(2, cVar);
        this.this$0 = recomposer;
        this.$composition = controlledComposition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(this.this$0, this.$composition, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ControlledComposition performRecompose;
        List list;
        int i11;
        n deriveStateLocked;
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        performRecompose = this.this$0.performRecompose(this.$composition, null);
        Object obj2 = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj2) {
            if (performRecompose != null) {
                try {
                    list = recomposer.compositionsAwaitingApply;
                    list.add(performRecompose);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = recomposer.concurrentCompositionsOutstanding;
            recomposer.concurrentCompositionsOutstanding = i11 - 1;
            deriveStateLocked = recomposer.deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            Result.a aVar = Result.Companion;
            deriveStateLocked.resumeWith(Result.m6308constructorimpl(g2.f100423a));
        }
        return g2.f100423a;
    }
}
