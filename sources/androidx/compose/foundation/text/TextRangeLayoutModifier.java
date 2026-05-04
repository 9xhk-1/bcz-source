package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.unit.Density;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextRangeLayoutModifier implements ParentDataModifier {
    public static final int $stable = 0;

    @k
    private final TextRangeScopeMeasurePolicy measurePolicy;

    public TextRangeLayoutModifier(@k TextRangeScopeMeasurePolicy textRangeScopeMeasurePolicy) {
        this.measurePolicy = textRangeScopeMeasurePolicy;
    }

    @k
    public final TextRangeScopeMeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    @k
    public TextRangeLayoutModifier modifyParentData(@k Density density, @l Object obj) {
        return this;
    }
}
