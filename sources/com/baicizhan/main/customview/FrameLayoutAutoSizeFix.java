package com.baicizhan.main.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.AutoSizeMgr;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public class FrameLayoutAutoSizeFix extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20044a = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameLayoutAutoSizeFix(@k Context context) {
        super(context);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameLayoutAutoSizeFix(@k Context context, @k AttributeSet attrs) {
        super(context, attrs);
        g0.p(context, "context");
        g0.p(attrs, "attrs");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    @k
    public FrameLayout.LayoutParams generateLayoutParams(@l AttributeSet attributeSet) {
        AutoSizeMgr.INSTANCE.adjust(getResources());
        FrameLayout.LayoutParams generateLayoutParams = super.generateLayoutParams(attributeSet);
        g0.o(generateLayoutParams, "generateLayoutParams(...)");
        return generateLayoutParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameLayoutAutoSizeFix(@k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameLayoutAutoSizeFix(@k Context context, @l AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        g0.p(context, "context");
    }
}
