package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class InspectorValueInfo implements InspectableValue {
    public static final int $stable = 8;

    @m80.l
    private InspectorInfo _values;

    @m80.k
    private final x00.l<InspectorInfo, g2> info;

    /* JADX WARN: Multi-variable type inference failed */
    public InspectorValueInfo(@m80.k x00.l<? super InspectorInfo, g2> lVar) {
        this.info = lVar;
    }

    private final InspectorInfo getValues() {
        InspectorInfo inspectorInfo = this._values;
        if (inspectorInfo == null) {
            inspectorInfo = new InspectorInfo();
            this.info.invoke(inspectorInfo);
        }
        this._values = inspectorInfo;
        return inspectorInfo;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @m80.k
    public q30.m<ValueElement> getInspectableElements() {
        return getValues().getProperties();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @m80.l
    public String getNameFallback() {
        return getValues().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @m80.l
    public Object getValueOverride() {
        return getValues().getValue();
    }
}
