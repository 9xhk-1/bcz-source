package com.baicizhan.client.business.util.report;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;
import w00.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ExposureConstraintLayout extends ConstraintLayout implements IExposureData {
    public static final int $stable = 8;

    @l
    private Object exposureData;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public ExposureConstraintLayout(@m80.k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    @Override // com.baicizhan.client.business.util.report.IExposureData
    @l
    public Object getData() {
        return this.exposureData;
    }

    @l
    public final Object getExposureData() {
        return this.exposureData;
    }

    public final void setExposureData(@l Object obj) {
        this.exposureData = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public ExposureConstraintLayout(@m80.k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k
    public ExposureConstraintLayout(@m80.k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
    }

    public /* synthetic */ ExposureConstraintLayout(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
