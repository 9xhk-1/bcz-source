package androidx.compose.material;

import androidx.camera.view.q;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material.InternalMutatorMutex;
import c40.l2;
import c40.r0;
import j00.c;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.d;
import n40.a;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.InternalMutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {180, 142}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
@u0({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material/InternalMutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,174:1\n120#2,10:175\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material/InternalMutatorMutex$mutateWith$2\n*L\n140#1:175,10\n*E\n"})
/* loaded from: classes.dex */
public final class InternalMutatorMutex$mutateWith$2<R> extends SuspendLambda implements p<r0, c<? super R>, Object> {
    final /* synthetic */ p<T, c<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ T $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InternalMutatorMutex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InternalMutatorMutex$mutateWith$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, p<? super T, ? super c<? super R>, ? extends Object> pVar, T t11, c<? super InternalMutatorMutex$mutateWith$2> cVar) {
        super(2, cVar);
        this.$priority = mutatePriority;
        this.this$0 = internalMutatorMutex;
        this.$block = pVar;
        this.$receiver = t11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        InternalMutatorMutex$mutateWith$2 internalMutatorMutex$mutateWith$2 = new InternalMutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, cVar);
        internalMutatorMutex$mutateWith$2.L$0 = obj;
        return internalMutatorMutex$mutateWith$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super R> cVar) {
        return ((InternalMutatorMutex$mutateWith$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, n40.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        p pVar;
        InternalMutatorMutex.Mutator mutator;
        InternalMutatorMutex internalMutatorMutex;
        Object obj2;
        Throwable th2;
        InternalMutatorMutex internalMutatorMutex2;
        InternalMutatorMutex.Mutator mutator2;
        a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Object l11 = b.l();
        ?? r12 = this.label;
        try {
            try {
                if (r12 == 0) {
                    e.n(obj);
                    r0 r0Var = (r0) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    d.b bVar = r0Var.getCoroutineContext().get(l2.f7886e0);
                    g0.m(bVar);
                    InternalMutatorMutex.Mutator mutator3 = new InternalMutatorMutex.Mutator(mutatePriority, (l2) bVar);
                    this.this$0.tryMutateOrCancel(mutator3);
                    aVar = this.this$0.mutex;
                    pVar = this.$block;
                    Object obj3 = this.$receiver;
                    InternalMutatorMutex internalMutatorMutex3 = this.this$0;
                    this.L$0 = mutator3;
                    this.L$1 = aVar;
                    this.L$2 = pVar;
                    this.L$3 = obj3;
                    this.L$4 = internalMutatorMutex3;
                    this.label = 1;
                    if (aVar.lock(null, this) != l11) {
                        mutator = mutator3;
                        internalMutatorMutex = internalMutatorMutex3;
                        obj2 = obj3;
                    }
                    return l11;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    internalMutatorMutex2 = (InternalMutatorMutex) this.L$2;
                    aVar2 = (a) this.L$1;
                    mutator2 = (InternalMutatorMutex.Mutator) this.L$0;
                    try {
                        e.n(obj);
                        atomicReference2 = internalMutatorMutex2.currentMutator;
                        q.a(atomicReference2, mutator2, null);
                        aVar2.unlock(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = internalMutatorMutex2.currentMutator;
                        q.a(atomicReference, mutator2, null);
                        throw th2;
                    }
                }
                internalMutatorMutex = (InternalMutatorMutex) this.L$4;
                obj2 = this.L$3;
                pVar = (p) this.L$2;
                a aVar3 = (a) this.L$1;
                mutator = (InternalMutatorMutex.Mutator) this.L$0;
                e.n(obj);
                aVar = aVar3;
                this.L$0 = mutator;
                this.L$1 = aVar;
                this.L$2 = internalMutatorMutex;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                Object invoke = pVar.invoke(obj2, this);
                if (invoke != l11) {
                    internalMutatorMutex2 = internalMutatorMutex;
                    aVar2 = aVar;
                    obj = invoke;
                    mutator2 = mutator;
                    atomicReference2 = internalMutatorMutex2.currentMutator;
                    q.a(atomicReference2, mutator2, null);
                    aVar2.unlock(null);
                    return obj;
                }
                return l11;
            } catch (Throwable th4) {
                th2 = th4;
                internalMutatorMutex2 = internalMutatorMutex;
                mutator2 = mutator;
                atomicReference = internalMutatorMutex2.currentMutator;
                q.a(atomicReference, mutator2, null);
                throw th2;
            }
        } catch (Throwable th5) {
            r12.unlock(null);
            throw th5;
        }
    }
}
