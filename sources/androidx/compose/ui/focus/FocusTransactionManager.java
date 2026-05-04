package androidx.compose.ui.focus;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFocusTransactionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,122:1\n1101#2:123\n1083#2,2:124\n1#3:126\n641#4,2:127\n641#4,2:129\n423#4,9:162\n76#5,7:131\n365#6,3:138\n329#6,6:141\n339#6,3:148\n342#6,9:152\n368#6:161\n1399#7:147\n1270#7:151\n*S KotlinDebug\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n*L\n32#1:123\n32#1:124,2\n55#1:127,2\n72#1:129,2\n118#1:162,9\n100#1:131,7\n109#1:138,3\n109#1:141,6\n109#1:148,3\n109#1:152,9\n109#1:161\n109#1:147\n109#1:151\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTransactionManager {
    public static final int $stable = 8;
    private int generation;
    private boolean ongoingTransaction;

    @k
    private final MutableScatterMap<FocusTargetNode, FocusStateImpl> states = ScatterMapKt.mutableScatterMapOf();

    @k
    private final MutableVector<a<g2>> cancellationListener = new MutableVector<>(new a[16], 0);

    /* JADX INFO: Access modifiers changed from: private */
    public final void beginTransaction() {
        this.ongoingTransaction = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTransaction() {
        this.states.clear();
        this.ongoingTransaction = false;
        MutableVector<a<g2>> mutableVector = this.cancellationListener;
        a<g2>[] aVarArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            aVarArr[i11].invoke();
        }
        this.cancellationListener.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commitTransaction() {
        MutableScatterMap<FocusTargetNode, FocusStateImpl> mutableScatterMap = this.states;
        Object[] objArr = mutableScatterMap.keys;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            ((FocusTargetNode) objArr[(i11 << 3) + i13]).commitFocusState$ui_release();
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.states.clear();
        this.ongoingTransaction = false;
        this.cancellationListener.clear();
    }

    public static /* synthetic */ Object withExistingTransaction$default(FocusTransactionManager focusTransactionManager, a aVar, a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        if (aVar != null) {
            focusTransactionManager.cancellationListener.add(aVar);
        }
        if (focusTransactionManager.getOngoingTransaction()) {
            return aVar2.invoke();
        }
        try {
            focusTransactionManager.beginTransaction();
            return aVar2.invoke();
        } finally {
            d0.d(1);
            focusTransactionManager.commitTransaction();
            d0.c(1);
        }
    }

    public static /* synthetic */ Object withNewTransaction$default(FocusTransactionManager focusTransactionManager, a aVar, a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        try {
            if (focusTransactionManager.getOngoingTransaction()) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            if (aVar != null) {
                focusTransactionManager.cancellationListener.add(aVar);
            }
            Object invoke = aVar2.invoke();
            d0.d(1);
            focusTransactionManager.commitTransaction();
            d0.c(1);
            return invoke;
        } catch (Throwable th2) {
            d0.d(1);
            focusTransactionManager.commitTransaction();
            d0.c(1);
            throw th2;
        }
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final boolean getOngoingTransaction() {
        return this.ongoingTransaction;
    }

    @l
    public final FocusStateImpl getUncommittedFocusState(@k FocusTargetNode focusTargetNode) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            throw new IllegalStateException("uncommittedFocusState must not be accessed when isTrackFocusEnabled is on");
        }
        return this.states.get(focusTargetNode);
    }

    public final void setUncommittedFocusState(@k FocusTargetNode focusTargetNode, @l FocusStateImpl focusStateImpl) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return;
        }
        FocusStateImpl focusStateImpl2 = this.states.get(focusTargetNode);
        if (focusStateImpl2 == null) {
            focusStateImpl2 = FocusStateImpl.Inactive;
        }
        if (focusStateImpl2 != focusStateImpl) {
            this.generation++;
        }
        MutableScatterMap<FocusTargetNode, FocusStateImpl> mutableScatterMap = this.states;
        if (focusStateImpl != null) {
            mutableScatterMap.set(focusTargetNode, focusStateImpl);
        } else {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("requires a non-null focus state");
            throw new KotlinNothingValueException();
        }
    }

    public final <T> T withExistingTransaction(@l a<g2> aVar, @k a<? extends T> aVar2) {
        if (aVar != null) {
            this.cancellationListener.add(aVar);
        }
        if (getOngoingTransaction()) {
            return aVar2.invoke();
        }
        try {
            beginTransaction();
            return aVar2.invoke();
        } finally {
            d0.d(1);
            commitTransaction();
            d0.c(1);
        }
    }

    public final <T> T withNewTransaction(@l a<g2> aVar, @k a<? extends T> aVar2) {
        try {
            if (getOngoingTransaction()) {
                cancelTransaction();
            }
            beginTransaction();
            if (aVar != null) {
                this.cancellationListener.add(aVar);
            }
            T invoke = aVar2.invoke();
            d0.d(1);
            commitTransaction();
            d0.c(1);
            return invoke;
        } catch (Throwable th2) {
            d0.d(1);
            commitTransaction();
            d0.c(1);
            throw th2;
        }
    }
}
