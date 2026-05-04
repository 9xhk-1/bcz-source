package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Pair;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@InternalComposeApi
/* loaded from: classes.dex */
public final class MovableContentStateReference {
    public static final int $stable = 8;

    @k
    private final Anchor anchor;

    @k
    private final ControlledComposition composition;

    @k
    private final MovableContent<Object> content;

    @k
    private List<? extends Pair<RecomposeScopeImpl, ? extends Object>> invalidations;

    @k
    private final PersistentCompositionLocalMap locals;

    @l
    private final List<MovableContentStateReference> nestedReferences;

    @l
    private final Object parameter;

    @k
    private final SlotTable slotTable;

    public MovableContentStateReference(@k MovableContent<Object> movableContent, @l Object obj, @k ControlledComposition controlledComposition, @k SlotTable slotTable, @k Anchor anchor, @k List<? extends Pair<RecomposeScopeImpl, ? extends Object>> list, @k PersistentCompositionLocalMap persistentCompositionLocalMap, @l List<MovableContentStateReference> list2) {
        this.content = movableContent;
        this.parameter = obj;
        this.composition = controlledComposition;
        this.slotTable = slotTable;
        this.anchor = anchor;
        this.invalidations = list;
        this.locals = persistentCompositionLocalMap;
        this.nestedReferences = list2;
    }

    @k
    public final Anchor getAnchor$runtime_release() {
        return this.anchor;
    }

    @k
    public final ControlledComposition getComposition$runtime_release() {
        return this.composition;
    }

    @k
    public final MovableContent<Object> getContent$runtime_release() {
        return this.content;
    }

    @k
    public final List<Pair<RecomposeScopeImpl, Object>> getInvalidations$runtime_release() {
        return this.invalidations;
    }

    @k
    public final PersistentCompositionLocalMap getLocals$runtime_release() {
        return this.locals;
    }

    @l
    public final List<MovableContentStateReference> getNestedReferences$runtime_release() {
        return this.nestedReferences;
    }

    @l
    public final Object getParameter$runtime_release() {
        return this.parameter;
    }

    @k
    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }

    public final void setInvalidations$runtime_release(@k List<? extends Pair<RecomposeScopeImpl, ? extends Object>> list) {
        this.invalidations = list;
    }
}
