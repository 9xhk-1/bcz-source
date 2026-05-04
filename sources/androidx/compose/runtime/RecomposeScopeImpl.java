package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.RecomposeScopeObserver;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,494:1\n33#2,2:495\n1#3:497\n256#4,2:498\n231#4,3:500\n200#4,7:503\n211#4,3:511\n214#4,9:515\n234#4:524\n258#4:525\n1399#5:510\n1270#5:514\n1399#5:536\n1270#5:540\n1399#5:562\n1270#5:566\n395#6,4:526\n367#6,6:530\n377#6,3:537\n380#6,9:541\n399#6:550\n423#6:551\n395#6,4:552\n367#6,6:556\n377#6,3:563\n380#6,9:567\n399#6:576\n424#6:577\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n240#1:495,2\n404#1:498,2\n404#1:500,3\n404#1:503,7\n404#1:511,3\n404#1:515,9\n404#1:524\n404#1:525\n404#1:510\n404#1:514\n426#1:536\n426#1:540\n446#1:562\n446#1:566\n426#1:526,4\n426#1:530,6\n426#1:537,3\n426#1:541,9\n426#1:550\n446#1:551\n446#1:552,4\n446#1:556,6\n446#1:563,3\n446#1:567,9\n446#1:576\n446#1:577\n*E\n"})
/* loaded from: classes.dex */
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {

    @l
    private Anchor anchor;

    @l
    private p<? super Composer, ? super Integer, g2> block;
    private int currentToken;
    private int flags;

    @l
    private RecomposeScopeObserver observer;

    @l
    private RecomposeScopeOwner owner;

    @l
    private MutableScatterMap<DerivedState<?>, Object> trackedDependencies;

    @l
    private MutableObjectIntMap<Object> trackedInstances;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,494:1\n33#2,6:495\n90#2,2:501\n33#2,6:503\n92#2:509\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n*L\n477#1:495,6\n488#1:501,2\n488#1:503,6\n488#1:509\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        public final void adoptAnchoredScopes$runtime_release(@k SlotWriter slotWriter, @k List<Anchor> list, @k RecomposeScopeOwner recomposeScopeOwner) {
            List<Anchor> list2 = list;
            if (list2.isEmpty()) {
                return;
            }
            int size = list2.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object slot = slotWriter.slot(list.get(i11), 0);
                RecomposeScopeImpl recomposeScopeImpl = slot instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) slot : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.adoptedBy(recomposeScopeOwner);
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime_release(@k SlotTable slotTable, @k List<Anchor> list) {
            List<Anchor> list2 = list;
            if (!list2.isEmpty()) {
                int size = list2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Anchor anchor = list.get(i11);
                    if (slotTable.ownsAnchor(anchor) && (slotTable.slot$runtime_release(slotTable.anchorIndex(anchor), 0) instanceof RecomposeScopeImpl)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public RecomposeScopeImpl(@l RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    private final boolean checkDerivedStateChanged(DerivedState<?> derivedState, MutableScatterMap<DerivedState<?>, Object> mutableScatterMap) {
        g0.n(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
        if (policy == null) {
            policy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return !policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), mutableScatterMap.get(derivedState));
    }

    private final boolean getRereading() {
        return (this.flags & 32) != 0;
    }

    private final void setRereading(boolean z11) {
        if (z11) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    private final void setSkipped(boolean z11) {
        if (z11) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    public final void adoptedBy(@k RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    public final void compose(@k Composer composer) {
        g2 g2Var;
        p<? super Composer, ? super Integer, g2> pVar = this.block;
        RecomposeScopeObserver recomposeScopeObserver = this.observer;
        if (recomposeScopeObserver != null && pVar != null) {
            recomposeScopeObserver.onBeginScopeComposition(this);
            try {
                pVar.invoke(composer, 1);
                return;
            } finally {
                recomposeScopeObserver.onEndScopeComposition(this);
            }
        }
        if (pVar != null) {
            pVar.invoke(composer, 1);
            g2Var = g2.f100423a;
        } else {
            g2Var = null;
        }
        if (g2Var == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    @l
    public final x00.l<Composition, g2> end(final int i11) {
        final MutableObjectIntMap<Object> mutableObjectIntMap = this.trackedInstances;
        if (mutableObjectIntMap != null && !getSkipped$runtime_release()) {
            Object[] objArr = mutableObjectIntMap.keys;
            int[] iArr = mutableObjectIntMap.values;
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j11 = jArr[i12];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((255 & j11) < 128) {
                                int i15 = (i12 << 3) + i14;
                                Object obj = objArr[i15];
                                if (iArr[i15] != i11) {
                                    return new x00.l<Composition, g2>() { // from class: androidx.compose.runtime.RecomposeScopeImpl$end$1$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // x00.l
                                        public /* bridge */ /* synthetic */ g2 invoke(Composition composition) {
                                            invoke2(composition);
                                            return g2.f100423a;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Composition composition) {
                                            int i16;
                                            MutableObjectIntMap mutableObjectIntMap2;
                                            int i17;
                                            MutableScatterMap mutableScatterMap;
                                            i16 = RecomposeScopeImpl.this.currentToken;
                                            if (i16 != i11) {
                                                return;
                                            }
                                            MutableObjectIntMap<Object> mutableObjectIntMap3 = mutableObjectIntMap;
                                            mutableObjectIntMap2 = RecomposeScopeImpl.this.trackedInstances;
                                            if (!g0.g(mutableObjectIntMap3, mutableObjectIntMap2) || !(composition instanceof CompositionImpl)) {
                                                return;
                                            }
                                            MutableObjectIntMap<Object> mutableObjectIntMap4 = mutableObjectIntMap;
                                            int i18 = i11;
                                            RecomposeScopeImpl recomposeScopeImpl = RecomposeScopeImpl.this;
                                            long[] jArr2 = mutableObjectIntMap4.metadata;
                                            int length2 = jArr2.length - 2;
                                            if (length2 < 0) {
                                                return;
                                            }
                                            int i19 = 0;
                                            while (true) {
                                                long j12 = jArr2[i19];
                                                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i21 = 8;
                                                    int i22 = 8 - ((~(i19 - length2)) >>> 31);
                                                    int i23 = 0;
                                                    while (i23 < i22) {
                                                        if ((255 & j12) < 128) {
                                                            int i24 = (i19 << 3) + i23;
                                                            Object obj2 = mutableObjectIntMap4.keys[i24];
                                                            boolean z11 = mutableObjectIntMap4.values[i24] != i18;
                                                            i17 = i21;
                                                            if (z11) {
                                                                CompositionImpl compositionImpl = (CompositionImpl) composition;
                                                                compositionImpl.removeObservation$runtime_release(obj2, recomposeScopeImpl);
                                                                if (obj2 instanceof DerivedState) {
                                                                    compositionImpl.removeDerivedStateObservation$runtime_release((DerivedState) obj2);
                                                                    mutableScatterMap = recomposeScopeImpl.trackedDependencies;
                                                                    if (mutableScatterMap != null) {
                                                                        mutableScatterMap.remove(obj2);
                                                                    }
                                                                }
                                                            }
                                                            if (z11) {
                                                                mutableObjectIntMap4.removeValueAt(i24);
                                                            }
                                                        } else {
                                                            i17 = i21;
                                                        }
                                                        j12 >>= i17;
                                                        i23++;
                                                        i21 = i17;
                                                    }
                                                    if (i22 != i21) {
                                                        return;
                                                    }
                                                }
                                                if (i19 == length2) {
                                                    return;
                                                } else {
                                                    i19++;
                                                }
                                            }
                                        }
                                    };
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        }
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                }
            }
        }
        return null;
    }

    @l
    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final boolean getCanRecompose() {
        return this.block != null;
    }

    public final boolean getDefaultsInScope() {
        return (this.flags & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final boolean getForcedRecompose() {
        return (this.flags & 64) != 0;
    }

    public final boolean getPaused() {
        return (this.flags & 256) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.flags & 8) != 0;
    }

    public final boolean getResuming() {
        return (this.flags & 512) != 0;
    }

    public final boolean getReusing() {
        return (this.flags & 128) != 0;
    }

    public final boolean getSkipped$runtime_release() {
        return (this.flags & 16) != 0;
    }

    public final boolean getUsed() {
        return (this.flags & 1) != 0;
    }

    public final boolean getValid() {
        if (this.owner != null) {
            Anchor anchor = this.anchor;
            if (anchor != null ? anchor.getValid() : false) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.invalidate(this, null);
        }
    }

    @k
    public final InvalidationResult invalidateForResult(@l Object obj) {
        InvalidationResult invalidate;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        return (recomposeScopeOwner == null || (invalidate = recomposeScopeOwner.invalidate(this, obj)) == null) ? InvalidationResult.IGNORED : invalidate;
    }

    public final boolean isConditional() {
        return this.trackedDependencies != null;
    }

    public final boolean isInvalidFor(@l Object obj) {
        MutableScatterMap<DerivedState<?>, Object> mutableScatterMap;
        if (obj == null || (mutableScatterMap = this.trackedDependencies) == null) {
            return true;
        }
        if (obj instanceof DerivedState) {
            return checkDerivedStateChanged((DerivedState) obj, mutableScatterMap);
        }
        if (!(obj instanceof ScatterSet)) {
            return true;
        }
        ScatterSet scatterSet = (ScatterSet) obj;
        if (scatterSet.isNotEmpty()) {
            Object[] objArr = scatterSet.elements;
            long[] jArr = scatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                loop0: while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                Object obj2 = objArr[(i11 << 3) + i13];
                                if (!(obj2 instanceof DerivedState) || checkDerivedStateChanged((DerivedState) obj2, mutableScatterMap)) {
                                    break loop0;
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
                return true;
            }
        }
        return false;
    }

    @ExperimentalComposeRuntimeApi
    @k
    public final CompositionObserverHandle observe$runtime_release(@k final RecomposeScopeObserver recomposeScopeObserver) {
        Object obj;
        obj = RecomposeScopeImplKt.callbackLock;
        synchronized (obj) {
            this.observer = recomposeScopeObserver;
            g2 g2Var = g2.f100423a;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.RecomposeScopeImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj2;
                RecomposeScopeObserver recomposeScopeObserver2;
                obj2 = RecomposeScopeImplKt.callbackLock;
                RecomposeScopeImpl recomposeScopeImpl = RecomposeScopeImpl.this;
                RecomposeScopeObserver recomposeScopeObserver3 = recomposeScopeObserver;
                synchronized (obj2) {
                    try {
                        recomposeScopeObserver2 = recomposeScopeImpl.observer;
                        if (g0.g(recomposeScopeObserver2, recomposeScopeObserver3)) {
                            recomposeScopeImpl.observer = null;
                        }
                        g2 g2Var2 = g2.f100423a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
    }

    public final void recordDerivedStateValue(@k DerivedState<?> derivedState, @l Object obj) {
        MutableScatterMap<DerivedState<?>, Object> mutableScatterMap = this.trackedDependencies;
        if (mutableScatterMap == null) {
            mutableScatterMap = new MutableScatterMap<>(0, 1, null);
            this.trackedDependencies = mutableScatterMap;
        }
        mutableScatterMap.set(derivedState, obj);
    }

    public final boolean recordRead(@k Object obj) {
        int i11 = 0;
        if (getRereading()) {
            return false;
        }
        MutableObjectIntMap<Object> mutableObjectIntMap = this.trackedInstances;
        int i12 = 1;
        if (mutableObjectIntMap == null) {
            mutableObjectIntMap = new MutableObjectIntMap<>(i11, i12, null);
            this.trackedInstances = mutableObjectIntMap;
        }
        return mutableObjectIntMap.put(obj, this.currentToken, -1) == this.currentToken;
    }

    public final void release() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.recomposeScopeReleased(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        RecomposeScopeObserver recomposeScopeObserver = this.observer;
        if (recomposeScopeObserver != null) {
            recomposeScopeObserver.onScopeDisposed(this);
        }
    }

    public final void rereadTrackedInstances() {
        MutableObjectIntMap<Object> mutableObjectIntMap;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner == null || (mutableObjectIntMap = this.trackedInstances) == null) {
            return;
        }
        setRereading(true);
        try {
            Object[] objArr = mutableObjectIntMap.keys;
            int[] iArr = mutableObjectIntMap.values;
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj = objArr[i14];
                                int i15 = iArr[i14];
                                recomposeScopeOwner.recordReadOf(obj);
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
        } finally {
            setRereading(false);
        }
    }

    public final void scopeSkipped() {
        if (getReusing()) {
            return;
        }
        setSkipped(true);
    }

    public final void setAnchor(@l Anchor anchor) {
        this.anchor = anchor;
    }

    public final void setDefaultsInScope(boolean z11) {
        if (z11) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final void setDefaultsInvalid(boolean z11) {
        if (z11) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final void setForcedRecompose(boolean z11) {
        if (z11) {
            this.flags |= 64;
        } else {
            this.flags &= -65;
        }
    }

    public final void setPaused(boolean z11) {
        this.flags = z11 ? this.flags | 256 : this.flags & (-257);
    }

    public final void setRequiresRecompose(boolean z11) {
        if (z11) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void setResuming(boolean z11) {
        this.flags = z11 ? this.flags | 512 : this.flags & (-513);
    }

    public final void setReusing(boolean z11) {
        this.flags = z11 ? this.flags | 128 : this.flags & (-129);
    }

    public final void setUsed(boolean z11) {
        this.flags = z11 ? this.flags | 1 : this.flags & (-2);
    }

    public final void start(int i11) {
        this.currentToken = i11;
        setSkipped(false);
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(@k p<? super Composer, ? super Integer, g2> pVar) {
        this.block = pVar;
    }

    @ExperimentalComposeRuntimeApi
    private static /* synthetic */ void getObserver$annotations() {
    }
}
