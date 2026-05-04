package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.l;
import g10.u;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nLazyLayoutNearestRangeState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,66:1\n85#2:67\n113#2,2:68\n*S KotlinDebug\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n*L\n32#1:67\n32#1:68,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutNearestRangeState implements State<l> {
    public static final int $stable = 0;

    @k
    private static final Companion Companion = new Companion(null);
    private final int extraItemCount;
    private int lastFirstVisibleItem;
    private final int slidingWindowSize;

    @k
    private final MutableState value$delegate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final l calculateNearestItemsRange(int i11, int i12, int i13) {
            int i14 = (i11 / i12) * i12;
            return u.W1(Math.max(i14 - i13, 0), i14 + i12 + i13);
        }

        private Companion() {
        }
    }

    public LazyLayoutNearestRangeState(int i11, int i12, int i13) {
        this.slidingWindowSize = i12;
        this.extraItemCount = i13;
        this.value$delegate = SnapshotStateKt.mutableStateOf(Companion.calculateNearestItemsRange(i11, i12, i13), SnapshotStateKt.structuralEqualityPolicy());
        this.lastFirstVisibleItem = i11;
    }

    private void setValue(l lVar) {
        this.value$delegate.setValue(lVar);
    }

    public final void update(int i11) {
        if (i11 != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = i11;
            setValue(Companion.calculateNearestItemsRange(i11, this.slidingWindowSize, this.extraItemCount));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    @k
    public l getValue() {
        return (l) this.value$delegate.getValue();
    }
}
