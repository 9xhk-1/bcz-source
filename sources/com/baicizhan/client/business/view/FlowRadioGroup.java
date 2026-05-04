package com.baicizhan.client.business.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.KotlinExtKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;
import w00.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class FlowRadioGroup extends RadioGroup {

    /* renamed from: c, reason: collision with root package name */
    public static final int f16718c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f16719a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16720b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @k
    public FlowRadioGroup(@m80.k Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        g0.p(context, "context");
    }

    public final int getDEFAULT_BOTTOM_MARGIN() {
        return this.f16720b;
    }

    public final int getDEFAULT_LEFT_MARGIN() {
        return this.f16719a;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int paddingTop = getPaddingTop();
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            g0.o(childAt, "getChildAt(...)");
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                g0.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                int i19 = layoutParams2.leftMargin;
                if (i19 <= 0) {
                    i19 = this.f16719a;
                }
                int i21 = layoutParams2.bottomMargin;
                if (i21 <= 0) {
                    i21 = this.f16720b;
                }
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight() + layoutParams2.topMargin + i21;
                if (i16 + measuredWidth + i19 > i15) {
                    i17++;
                    paddingTop = getPaddingTop() + (measuredHeight * i17);
                    i16 = 0;
                }
                int i22 = i16 + i19;
                int i23 = layoutParams2.topMargin + paddingTop;
                childAt.layout(i22, i23, childAt.getMeasuredWidth() + i22, childAt.getMeasuredHeight() + i23);
                i16 += measuredWidth + i19 + layoutParams2.rightMargin;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            g0.o(childAt, "getChildAt(...)");
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                g0.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                int i18 = layoutParams2.leftMargin;
                if (i18 <= 0) {
                    i18 = this.f16719a;
                }
                int i19 = layoutParams2.bottomMargin;
                if (i19 <= 0) {
                    i19 = this.f16720b;
                }
                measureChild(childAt, i11, i12);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight() + layoutParams2.topMargin + i19;
                int i21 = i15 + 1;
                int i22 = i21 * measuredHeight;
                if (i16 + measuredWidth + i18 > size) {
                    i13 = (i15 + 2) * measuredHeight;
                    i16 = 0;
                } else {
                    i21 = i15;
                    i13 = i22;
                }
                i16 += measuredWidth + i18 + layoutParams2.rightMargin;
                i14 = i13;
                i15 = i21;
            }
        }
        setMeasuredDimension(size, i14 + getPaddingTop() + getPaddingBottom());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k
    public FlowRadioGroup(@m80.k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        g0.p(context, "context");
        this.f16719a = KotlinExtKt.getDpPixels(16);
        this.f16720b = KotlinExtKt.getDpPixels(12);
    }

    public /* synthetic */ FlowRadioGroup(Context context, AttributeSet attributeSet, int i11, v vVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }
}
