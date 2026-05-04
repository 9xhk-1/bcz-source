package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ParentSizeElement extends ModifierNodeElement<ParentSizeNode> {
    private final float fraction;

    @l
    private final State<Integer> heightState;

    @k
    private final String inspectorName;

    @l
    private final State<Integer> widthState;

    public /* synthetic */ ParentSizeElement(float f11, State state, State state2, String str, int i11, v vVar) {
        this(f11, (i11 & 2) != 0 ? null : state, (i11 & 4) != 0 ? null : state2, str);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.fraction == parentSizeElement.fraction && g0.g(this.widthState, parentSizeElement.widthState) && g0.g(this.heightState, parentSizeElement.heightState);
    }

    public final float getFraction() {
        return this.fraction;
    }

    @l
    public final State<Integer> getHeightState() {
        return this.heightState;
    }

    @k
    public final String getInspectorName() {
        return this.inspectorName;
    }

    @l
    public final State<Integer> getWidthState() {
        return this.widthState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        State<Integer> state = this.widthState;
        int hashCode = (state != null ? state.hashCode() : 0) * 31;
        State<Integer> state2 = this.heightState;
        return ((hashCode + (state2 != null ? state2.hashCode() : 0)) * 31) + Float.hashCode(this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.setValue(Float.valueOf(this.fraction));
    }

    public ParentSizeElement(float f11, @l State<Integer> state, @l State<Integer> state2, @k String str) {
        this.fraction = f11;
        this.widthState = state;
        this.heightState = state2;
        this.inspectorName = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public ParentSizeNode create() {
        return new ParentSizeNode(this.fraction, this.widthState, this.heightState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k ParentSizeNode parentSizeNode) {
        parentSizeNode.setFraction(this.fraction);
        parentSizeNode.setWidthState(this.widthState);
        parentSizeNode.setHeightState(this.heightState);
    }
}
