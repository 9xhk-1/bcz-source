package androidx.compose.material;

import androidx.camera.view.q;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Stable;
import c40.l2;
import c40.s0;
import j00.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import m80.k;
import n40.a;
import n40.g;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public final class InternalMutatorMutex {
    public static final int $stable = 0;

    @k
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);

    @k
    private final a mutex = g.b(false, 1, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Mutator {

        @k
        private final l2 job;

        @k
        private final MutatePriority priority;

        public Mutator(@k MutatePriority mutatePriority, @k l2 l2Var) {
            this.priority = mutatePriority;
            this.job = l2Var;
        }

        public final boolean canInterrupt(@k Mutator mutator) {
            return this.priority.compareTo(mutator.priority) >= 0;
        }

        public final void cancel() {
            l2.a.b(this.job, null, 1, null);
        }

        @k
        public final l2 getJob() {
            return this.job;
        }

        @k
        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    public static /* synthetic */ Object mutate$default(InternalMutatorMutex internalMutatorMutex, MutatePriority mutatePriority, l lVar, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mutate(mutatePriority, lVar, cVar);
    }

    public static /* synthetic */ Object mutateWith$default(InternalMutatorMutex internalMutatorMutex, Object obj, MutatePriority mutatePriority, p pVar, c cVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mutateWith(obj, mutatePriority, pVar, cVar);
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
    public final <R> Object mutate(@k MutatePriority mutatePriority, @k l<? super c<? super R>, ? extends Object> lVar, @k c<? super R> cVar) {
        return s0.g(new InternalMutatorMutex$mutate$2(mutatePriority, this, lVar, null), cVar);
    }

    @m80.l
    public final <T, R> Object mutateWith(T t11, @k MutatePriority mutatePriority, @k p<? super T, ? super c<? super R>, ? extends Object> pVar, @k c<? super R> cVar) {
        return s0.g(new InternalMutatorMutex$mutateWith$2(mutatePriority, this, pVar, t11, null), cVar);
    }

    public final boolean tryMutate(@k x00.a<g2> aVar) {
        boolean c11 = a.C0899a.c(this.mutex, null, 1, null);
        if (!c11) {
            return c11;
        }
        try {
            aVar.invoke();
            return c11;
        } finally {
            a.C0899a.d(this.mutex, null, 1, null);
        }
    }
}
