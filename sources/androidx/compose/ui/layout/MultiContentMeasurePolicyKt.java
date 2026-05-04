package androidx.compose.ui.layout;

import m80.k;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class MultiContentMeasurePolicyKt {
    @v0
    @k
    public static final MeasurePolicy createMeasurePolicy(@k MultiContentMeasurePolicy multiContentMeasurePolicy) {
        return new MultiContentMeasurePolicyImpl(multiContentMeasurePolicy);
    }
}
