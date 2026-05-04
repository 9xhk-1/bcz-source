package androidx.compose.runtime;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.CompositionInstance;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/CompositionDataImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4891:1\n1#2:4892\n158#3,7:4893\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/CompositionDataImpl\n*L\n4854#1:4893,7\n*E\n"})
/* loaded from: classes.dex */
public final class CompositionDataImpl implements CompositionData, CompositionInstance {
    public static final int $stable = 8;

    @k
    private final Composition composition;

    public CompositionDataImpl(@k Composition composition) {
        this.composition = composition;
    }

    private static final CompositionGroup findContextGroup$lambda$2$scanGroup(SlotReader slotReader, CompositionContext compositionContext, SlotTable slotTable, int i11, int i12) {
        CompositionGroup findContextGroup$lambda$2$scanGroup;
        while (true) {
            if (i11 >= i12) {
                return null;
            }
            int groupSize = slotReader.groupSize(i11) + i11;
            if (slotReader.hasMark(i11) && slotReader.groupKey(i11) == 206 && g0.g(slotReader.groupObjectKey(i11), ComposerKt.getReference())) {
                Object groupGet = slotReader.groupGet(i11, 0);
                ComposerImpl.CompositionContextHolder compositionContextHolder = groupGet instanceof ComposerImpl.CompositionContextHolder ? (ComposerImpl.CompositionContextHolder) groupGet : null;
                if (compositionContextHolder != null && g0.g(compositionContextHolder.getRef(), compositionContext)) {
                    return SlotTableKt.compositionGroupOf(slotTable, i11);
                }
            }
            if (slotReader.containsMark(i11) && (findContextGroup$lambda$2$scanGroup = findContextGroup$lambda$2$scanGroup(slotReader, compositionContext, slotTable, i11 + 1, groupSize)) != null) {
                return findContextGroup$lambda$2$scanGroup;
            }
            i11 = groupSize;
        }
    }

    private final CompositionContext getContext(Composition composition) {
        CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
        if (compositionImpl != null) {
            return compositionImpl.getParent();
        }
        return null;
    }

    private final SlotTable getSlotTable() {
        Composition composition = this.composition;
        g0.n(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        return ((CompositionImpl) composition).getSlotTable$runtime_release();
    }

    public boolean equals(@l Object obj) {
        return (obj instanceof CompositionDataImpl) && g0.g(this.composition, ((CompositionDataImpl) obj).composition);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @l
    public CompositionGroup find(@k Object obj) {
        return getSlotTable().find(obj);
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    @l
    public CompositionGroup findContextGroup() {
        SlotTable slotTable;
        Composition parent = getParent(this.composition);
        if (parent == null || (slotTable = getSlotTable(parent)) == null) {
            return null;
        }
        CompositionContext context = getContext(this.composition);
        SlotReader openReader = slotTable.openReader();
        try {
            return findContextGroup$lambda$2$scanGroup(openReader, context, slotTable, 0, openReader.getSize());
        } finally {
            openReader.close();
        }
    }

    @k
    public final Composition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @k
    public Iterable<CompositionGroup> getCompositionGroups() {
        return getSlotTable().getCompositionGroups();
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    @l
    public CompositionInstance getParent() {
        Composition parent = getParent(this.composition);
        if (parent != null) {
            return new CompositionDataImpl(parent);
        }
        return null;
    }

    public int hashCode() {
        return this.composition.hashCode() * 31;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return getSlotTable().isEmpty();
    }

    private final Composition getParent(Composition composition) {
        CompositionContext context = getContext(composition);
        if (context != null) {
            return context.getComposition$runtime_release();
        }
        return null;
    }

    private final SlotTable getSlotTable(Composition composition) {
        CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
        if (compositionImpl != null) {
            return compositionImpl.getSlotTable$runtime_release();
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    @k
    public CompositionData getData() {
        return this;
    }
}
