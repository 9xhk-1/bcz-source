package androidx.compose.ui.modifier;

import a00.l1;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.Pair;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class MultiLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;

    @k
    private final SnapshotStateMap<ModifierLocal<?>, Object> map;

    public MultiLocalMap(@k Pair<? extends ModifierLocal<?>, ? extends Object> pair, @k Pair<? extends ModifierLocal<?>, ? extends Object>... pairArr) {
        super(null);
        SnapshotStateMap<ModifierLocal<?>, Object> mutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
        this.map = mutableStateMapOf;
        mutableStateMapOf.put(pair.getFirst(), pair.getSecond());
        mutableStateMapOf.putAll(l1.H0(pairArr));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@k ModifierLocal<?> modifierLocal) {
        return this.map.containsKey(modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    @l
    public <T> T get$ui_release(@k ModifierLocal<T> modifierLocal) {
        T t11 = (T) this.map.get(modifierLocal);
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release */
    public <T> void mo3963set$ui_release(@k ModifierLocal<T> modifierLocal, T t11) {
        this.map.put(modifierLocal, t11);
    }
}
