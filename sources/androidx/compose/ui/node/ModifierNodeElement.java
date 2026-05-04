package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElement;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import q30.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
@u0({"SMAP\nModifierNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierNodeElement.kt\nandroidx/compose/ui/node/ModifierNodeElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
/* loaded from: classes2.dex */
public abstract class ModifierNodeElement<N extends Modifier.Node> implements Modifier.Element, InspectableValue {
    public static final int $stable = 0;

    @l
    private InspectorInfo _inspectorValues;

    private final InspectorInfo getInspectorValues() {
        InspectorInfo inspectorInfo = this._inspectorValues;
        if (inspectorInfo != null) {
            return inspectorInfo;
        }
        InspectorInfo inspectorInfo2 = new InspectorInfo();
        inspectorInfo2.setName(o0.d(getClass()).C());
        inspectableProperties(inspectorInfo2);
        this._inspectorValues = inspectorInfo2;
        return inspectorInfo2;
    }

    @k
    public abstract N create();

    public abstract boolean equals(@l Object obj);

    @Override // androidx.compose.ui.platform.InspectableValue
    @k
    public final m<ValueElement> getInspectableElements() {
        return getInspectorValues().getProperties();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @l
    public final String getNameFallback() {
        return getInspectorValues().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @l
    public final Object getValueOverride() {
        return getInspectorValues().getValue();
    }

    public abstract int hashCode();

    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        Actual_jvmKt.tryPopulateReflectively(inspectorInfo, this);
    }

    public abstract void update(@k N n11);
}
