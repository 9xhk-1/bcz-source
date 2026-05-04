package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.PinnableContainer;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,161:1\n85#2:162\n113#2,2:163\n602#3,8:165\n50#4,5:173\n50#4,5:178\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n*L\n120#1:162\n120#1:163,2\n124#1:165,8\n137#1:173,5\n148#1:178,5\n*E\n"})
/* loaded from: classes.dex */
final class LazyLayoutPinnableItem implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {
    private boolean isDisposed;

    @l
    private final Object key;

    @l
    private PinnableContainer.PinnedHandle parentHandle;

    @k
    private final LazyLayoutPinnedItemList pinnedItemList;
    private int pinsCount;
    private int index = -1;

    @k
    private final MutableState _parentPinnableContainer$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public LazyLayoutPinnableItem(@l Object obj, @k LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        this.key = obj;
        this.pinnedItemList = lazyLayoutPinnedItemList;
    }

    private final PinnableContainer get_parentPinnableContainer() {
        return (PinnableContainer) this._parentPinnableContainer$delegate.getValue();
    }

    private final void set_parentPinnableContainer(PinnableContainer pinnableContainer) {
        this._parentPinnableContainer$delegate.setValue(pinnableContainer);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    @l
    public Object getKey() {
        return this.key;
    }

    @l
    public final PinnableContainer getParentPinnableContainer() {
        return get_parentPinnableContainer();
    }

    public final void onDisposed() {
        this.isDisposed = true;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer
    @k
    public PinnableContainer.PinnedHandle pin() {
        if (this.isDisposed) {
            InlineClassHelperKt.throwIllegalStateException("Pin should not be called on an already disposed item ");
        }
        if (this.pinsCount == 0) {
            this.pinnedItemList.pin$foundation_release(this);
            PinnableContainer parentPinnableContainer = getParentPinnableContainer();
            this.parentHandle = parentPinnableContainer != null ? parentPinnableContainer.pin() : null;
        }
        this.pinsCount++;
        return this;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer.PinnedHandle
    public void release() {
        if (this.isDisposed) {
            return;
        }
        if (!(this.pinsCount > 0)) {
            InlineClassHelperKt.throwIllegalStateException("Release should only be called once");
        }
        int i11 = this.pinsCount - 1;
        this.pinsCount = i11;
        if (i11 == 0) {
            this.pinnedItemList.release$foundation_release(this);
            PinnableContainer.PinnedHandle pinnedHandle = this.parentHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.parentHandle = null;
        }
    }

    public void setIndex(int i11) {
        this.index = i11;
    }

    public final void setParentPinnableContainer(@l PinnableContainer pinnableContainer) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (pinnableContainer != get_parentPinnableContainer()) {
                set_parentPinnableContainer(pinnableContainer);
                if (this.pinsCount > 0) {
                    PinnableContainer.PinnedHandle pinnedHandle = this.parentHandle;
                    if (pinnedHandle != null) {
                        pinnedHandle.release();
                    }
                    this.parentHandle = pinnableContainer != null ? pinnableContainer.pin() : null;
                }
            }
            g2 g2Var = g2.f100423a;
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        } catch (Throwable th2) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th2;
        }
    }
}
