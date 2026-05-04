package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntRect;
import java.util.Collection;
import java.util.List;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@UiToolingDataApi
/* loaded from: classes2.dex */
public final class CallGroup extends Group {
    public static final int $stable = 8;

    @k
    private final List<ParameterInformation> parameters;

    public CallGroup(@l Object obj, @l String str, @k IntRect intRect, @l SourceLocation sourceLocation, @l Object obj2, @k List<ParameterInformation> list, @k Collection<? extends Object> collection, @k Collection<? extends Group> collection2, boolean z11) {
        super(obj, str, sourceLocation, obj2, intRect, collection, collection2, z11, null);
        this.parameters = list;
    }

    @Override // androidx.compose.ui.tooling.data.Group
    @k
    public List<ParameterInformation> getParameters() {
        return this.parameters;
    }
}
