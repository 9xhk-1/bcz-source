package androidx.compose.foundation;

import androidx.camera.view.q;
import androidx.compose.runtime.Stable;
import c40.l2;
import c40.s0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.d0;
import n40.a;
import x00.l;
import x00.p;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public final class MutatorMutex {
    public static final int $stable = 0;

    @m80.k
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);

    @m80.k
    private final n40.a mutex = n40.g.b(false, 1, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Mutator {

        @m80.k
        private final l2 job;

        @m80.k
        private final MutatePriority priority;

        public Mutator(@m80.k MutatePriority mutatePriority, @m80.k l2 l2Var) {
            this.priority = mutatePriority;
            this.job = l2Var;
        }

        public final boolean canInterrupt(@m80.k Mutator mutator) {
            return this.priority.compareTo(mutator.priority) >= 0;
        }

        public final void cancel() {
            this.job.cancel(new MutationInterruptedException());
        }

        @m80.k
        public final l2 getJob() {
            return this.job;
        }

        @m80.k
        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, lVar, cVar);
    }

    public static /* synthetic */ Object mutateWith$default(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, p pVar, j00.c cVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, pVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!q.a(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    @m80.l
    public final <R> Object mutate(@m80.k MutatePriority mutatePriority, @m80.k l<? super j00.c<? super R>, ? extends Object> lVar, @m80.k j00.c<? super R> cVar) {
        return s0.g(new MutatorMutex$mutate$2(mutatePriority, this, lVar, null), cVar);
    }

    @m80.l
    public final <T, R> Object mutateWith(T t11, @m80.k MutatePriority mutatePriority, @m80.k p<? super T, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar) {
        return s0.g(new MutatorMutex$mutateWith$2(mutatePriority, this, pVar, t11, null), cVar);
    }

    @v0
    public final boolean tryLock() {
        return a.C0899a.c(this.mutex, null, 1, null);
    }

    public final boolean tryMutate(@m80.k x00.a<g2> aVar) {
        boolean tryLock = tryLock();
        if (!tryLock) {
            return tryLock;
        }
        try {
            aVar.invoke();
            return tryLock;
        } finally {
            d0.d(1);
            unlock();
            d0.c(1);
        }
    }

    @v0
    public final void unlock() {
        a.C0899a.d(this.mutex, null, 1, null);
    }
}
