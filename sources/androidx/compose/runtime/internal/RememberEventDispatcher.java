package androidx.compose.runtime.internal;

import a00.h0;
import androidx.collection.MutableIntList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.collection.MutableVector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRememberEventDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/RememberEventDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 6 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,309:1\n1101#2:310\n1083#2,2:311\n1101#2:313\n1083#2,2:314\n1101#2:316\n1083#2,2:317\n641#3,2:319\n519#3:322\n472#3:326\n519#3:328\n423#3,9:334\n519#3:343\n423#3,9:347\n136#3:363\n1#4:321\n45#5,3:323\n49#5:327\n45#5,5:329\n45#5,3:344\n49#5:356\n45#5,5:357\n65#6:362\n*S KotlinDebug\n*F\n+ 1 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/RememberEventDispatcher\n*L\n61#1:310\n61#1:311,2\n63#1:313\n63#1:314,2\n64#1:316\n64#1:317,2\n88#1:319,2\n150#1:322\n154#1:326\n173#1:328\n179#1:334,9\n187#1:343\n189#1:347,9\n292#1:363\n151#1:323,3\n151#1:327\n174#1:329,5\n188#1:344,3\n188#1:356\n197#1:357,5\n232#1:362\n*E\n"})
/* loaded from: classes.dex */
public final class RememberEventDispatcher implements RememberManager {
    public static final int $stable = 8;

    @k
    private final Set<RememberObserver> abandoning;

    @k
    private final MutableIntList afters;

    @k
    private MutableVector<RememberObserverHolder> currentRememberingList;

    @k
    private final MutableVector<Object> leaving;

    @l
    private ArrayList<Object> nestedRemembersLists;

    @l
    private MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> pausedPlaceholders;

    @k
    private final List<Object> pending;

    @k
    private final MutableIntList priorities;

    @l
    private MutableScatterSet<ComposeNodeLifecycleCallback> releasing;

    @k
    private final MutableVector<RememberObserverHolder> remembering;

    @k
    private final MutableVector<a<g2>> sideEffects;

    public RememberEventDispatcher(@k Set<RememberObserver> set) {
        this.abandoning = set;
        MutableVector<RememberObserverHolder> mutableVector = new MutableVector<>(new RememberObserverHolder[16], 0);
        this.remembering = mutableVector;
        this.currentRememberingList = mutableVector;
        this.leaving = new MutableVector<>(new Object[16], 0);
        this.sideEffects = new MutableVector<>(new a[16], 0);
        this.pending = new ArrayList();
        this.priorities = new MutableIntList(0, 1, null);
        this.afters = new MutableIntList(0, 1, null);
    }

    private final void dispatchRememberList(MutableVector<RememberObserverHolder> mutableVector) {
        RememberObserverHolder[] rememberObserverHolderArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            RememberObserver wrapped = rememberObserverHolderArr[i11].getWrapped();
            this.abandoning.remove(wrapped);
            wrapped.onRemembered();
        }
    }

    private final void processPendingLeaving(int i11) {
        if (this.pending.isEmpty()) {
            return;
        }
        int i12 = 0;
        int i13 = 0;
        List<? extends Object> list = null;
        MutableIntList mutableIntList = null;
        MutableIntList mutableIntList2 = null;
        while (true) {
            MutableIntList mutableIntList3 = this.afters;
            if (i13 >= mutableIntList3._size) {
                break;
            }
            if (i11 <= mutableIntList3.get(i13)) {
                Object remove = this.pending.remove(i13);
                int removeAt = this.afters.removeAt(i13);
                int removeAt2 = this.priorities.removeAt(i13);
                if (list == null) {
                    list = h0.U(remove);
                    mutableIntList2 = new MutableIntList(0, 1, null);
                    mutableIntList2.add(removeAt);
                    mutableIntList = new MutableIntList(0, 1, null);
                    mutableIntList.add(removeAt2);
                } else {
                    g0.n(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    g0.n(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    list.add(remove);
                    mutableIntList2.add(removeAt);
                    mutableIntList.add(removeAt2);
                }
            } else {
                i13++;
            }
        }
        if (list != null) {
            g0.n(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            g0.n(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = list.size() - 1;
            while (i12 < size) {
                int i14 = i12 + 1;
                int size2 = list.size();
                for (int i15 = i14; i15 < size2; i15++) {
                    int i16 = mutableIntList2.get(i12);
                    int i17 = mutableIntList2.get(i15);
                    if (i16 < i17 || (i17 == i16 && mutableIntList.get(i12) < mutableIntList.get(i15))) {
                        RememberEventDispatcherKt.swap(list, i12, i15);
                        RememberEventDispatcherKt.swap(mutableIntList, i12, i15);
                        RememberEventDispatcherKt.swap(mutableIntList2, i12, i15);
                    }
                }
                i12 = i14;
            }
            MutableVector<Object> mutableVector = this.leaving;
            mutableVector.addAll(mutableVector.getSize(), list);
        }
    }

    private final void recordLeaving(Object obj, int i11, int i12, int i13) {
        processPendingLeaving(i11);
        if (i13 < 0 || i13 >= i11) {
            this.leaving.add(obj);
            return;
        }
        this.pending.add(obj);
        this.priorities.add(i12);
        this.afters.add(i13);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void deactivating(@k ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i11, int i12, int i13) {
        recordLeaving(composeNodeLifecycleCallback, i11, i12, i13);
    }

    public final void dispatchAbandons() {
        if (this.abandoning.isEmpty()) {
            return;
        }
        Object beginSection = Trace.INSTANCE.beginSection("Compose:abandons");
        try {
            Iterator<RememberObserver> it = this.abandoning.iterator();
            while (it.hasNext()) {
                RememberObserver next = it.next();
                it.remove();
                next.onAbandoned();
            }
            g2 g2Var = g2.f100423a;
            Trace.INSTANCE.endSection(beginSection);
        } catch (Throwable th2) {
            Trace.INSTANCE.endSection(beginSection);
            throw th2;
        }
    }

    public final void dispatchRememberObservers() {
        Object beginSection;
        processPendingLeaving(Integer.MIN_VALUE);
        if (this.leaving.getSize() != 0) {
            beginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
            try {
                ScatterSet scatterSet = this.releasing;
                for (int size = this.leaving.getSize() - 1; -1 < size; size--) {
                    Object obj = this.leaving.content[size];
                    if (obj instanceof RememberObserverHolder) {
                        RememberObserver wrapped = ((RememberObserverHolder) obj).getWrapped();
                        this.abandoning.remove(wrapped);
                        wrapped.onForgotten();
                    }
                    if (obj instanceof ComposeNodeLifecycleCallback) {
                        if (scatterSet == null || !scatterSet.contains(obj)) {
                            ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                        } else {
                            ((ComposeNodeLifecycleCallback) obj).onRelease();
                        }
                    }
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.remembering.getSize() != 0) {
            Trace trace = Trace.INSTANCE;
            beginSection = trace.beginSection("Compose:onRemembered");
            try {
                dispatchRememberList(this.remembering);
                g2 g2Var2 = g2.f100423a;
                trace.endSection(beginSection);
            } finally {
                Trace.INSTANCE.endSection(beginSection);
            }
        }
    }

    public final void dispatchSideEffects() {
        if (this.sideEffects.getSize() != 0) {
            Object beginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
            try {
                MutableVector<a<g2>> mutableVector = this.sideEffects;
                a<g2>[] aVarArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i11 = 0; i11 < size; i11++) {
                    aVarArr[i11].invoke();
                }
                this.sideEffects.clear();
                g2 g2Var = g2.f100423a;
                Trace.INSTANCE.endSection(beginSection);
            } catch (Throwable th2) {
                Trace.INSTANCE.endSection(beginSection);
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public void endResumingScope(@k RecomposeScopeImpl recomposeScopeImpl) {
        MutableVector<RememberObserverHolder> mutableVector;
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        if (mutableScatterMap == null || mutableScatterMap.get(recomposeScopeImpl) == null) {
            return;
        }
        ArrayList<Object> arrayList = this.nestedRemembersLists;
        if (arrayList != null && (mutableVector = (MutableVector) Stack.m1945popimpl(arrayList)) != null) {
            this.currentRememberingList = mutableVector;
        }
        mutableScatterMap.remove(recomposeScopeImpl);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void forgetting(@k RememberObserverHolder rememberObserverHolder, int i11, int i12, int i13) {
        recordLeaving(rememberObserverHolder, i11, i12, i13);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void releasing(@k ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i11, int i12, int i13) {
        MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSet = this.releasing;
        if (mutableScatterSet == null) {
            mutableScatterSet = ScatterSetKt.mutableScatterSetOf();
            this.releasing = mutableScatterSet;
        }
        mutableScatterSet.plusAssign((MutableScatterSet<ComposeNodeLifecycleCallback>) composeNodeLifecycleCallback);
        recordLeaving(composeNodeLifecycleCallback, i11, i12, i13);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void rememberPausingScope(@k RecomposeScopeImpl recomposeScopeImpl) {
        PausedCompositionRemembers pausedCompositionRemembers = new PausedCompositionRemembers(this.abandoning);
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        if (mutableScatterMap == null) {
            mutableScatterMap = ScatterMapKt.mutableScatterMapOf();
            this.pausedPlaceholders = mutableScatterMap;
        }
        mutableScatterMap.set(recomposeScopeImpl, pausedCompositionRemembers);
        this.currentRememberingList.add(new RememberObserverHolder(pausedCompositionRemembers, null));
    }

    @Override // androidx.compose.runtime.RememberManager
    public void remembering(@k RememberObserverHolder rememberObserverHolder) {
        this.currentRememberingList.add(rememberObserverHolder);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void sideEffect(@k a<g2> aVar) {
        this.sideEffects.add(aVar);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void startResumingScope(@k RecomposeScopeImpl recomposeScopeImpl) {
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        PausedCompositionRemembers pausedCompositionRemembers = mutableScatterMap != null ? mutableScatterMap.get(recomposeScopeImpl) : null;
        if (pausedCompositionRemembers != null) {
            ArrayList<Object> arrayList = this.nestedRemembersLists;
            if (arrayList == null) {
                arrayList = Stack.m1936constructorimpl$default(null, 1, null);
                this.nestedRemembersLists = arrayList;
            }
            Stack.m1946pushimpl(arrayList, this.currentRememberingList);
            this.currentRememberingList = pausedCompositionRemembers.getPausedRemembers();
        }
    }
}
