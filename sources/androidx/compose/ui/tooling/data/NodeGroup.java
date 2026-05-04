package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.unit.IntRect;
import java.util.Collection;
import java.util.List;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@UiToolingDataApi
/* loaded from: classes2.dex */
public final class NodeGroup extends Group {
    public static final int $stable = 8;

    @k
    private final List<ModifierInfo> modifierInfo;

    @k
    private final Object node;

    public NodeGroup(@l Object obj, @k Object obj2, @k IntRect intRect, @k Collection<? extends Object> collection, @k List<ModifierInfo> list, @k Collection<? extends Group> collection2) {
        super(obj, null, null, null, intRect, collection, collection2, false, null);
        this.node = obj2;
        this.modifierInfo = list;
    }

    @Override // androidx.compose.ui.tooling.data.Group
    @k
    public List<ModifierInfo> getModifierInfo() {
        return this.modifierInfo;
    }

    @k
    public final Object getNode() {
        return this.node;
    }
}
