package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import c40.n;
import kotlin.jvm.internal.u0;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,390:1\n85#2:391\n113#2,2:392\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl\n*L\n286#1:391\n286#1:392,2\n*E\n"})
/* loaded from: classes.dex */
final class BasicTooltipStateImpl implements BasicTooltipState {
    private final boolean isPersistent;

    @m80.k
    private final MutableState isVisible$delegate;

    @l
    private n<? super g2> job;

    @m80.k
    private final MutatorMutex mutatorMutex;

    public BasicTooltipStateImpl(boolean z11, boolean z12, @m80.k MutatorMutex mutatorMutex) {
        this.isPersistent = z12;
        this.mutatorMutex = mutatorMutex;
        this.isVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z11), null, 2, null);
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public void dismiss() {
        setVisible(false);
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public boolean isPersistent() {
        return this.isPersistent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.BasicTooltipState
    public boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public void onDispose() {
        n<? super g2> nVar = this.job;
        if (nVar != null) {
            n.a.a(nVar, null, 1, null);
        }
    }

    public void setVisible(boolean z11) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z11));
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    @l
    public Object show(@m80.k MutatePriority mutatePriority, @m80.k j00.c<? super g2> cVar) {
        Object mutate = this.mutatorMutex.mutate(mutatePriority, new BasicTooltipStateImpl$show$2(this, new BasicTooltipStateImpl$show$cancellableShow$1(this, null), null), cVar);
        return mutate == kotlin.coroutines.intrinsics.b.l() ? mutate : g2.f100423a;
    }
}
