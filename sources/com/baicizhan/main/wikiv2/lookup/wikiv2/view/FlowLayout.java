package com.baicizhan.main.wikiv2.lookup.wikiv2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;
import w00.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FlowLayout extends ViewGroup {

    /* renamed from: c, reason: collision with root package name */
    public static final int f25793c = 8;

    /* renamed from: a, reason: collision with root package name */
    public int f25794a;

    /* renamed from: b, reason: collision with root package name */
    public int f25795b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public FlowLayout(@m80.k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    @Override // android.view.ViewGroup
    @m80.k
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @m80.k
    public ViewGroup.LayoutParams generateLayoutParams(@l AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = i13 - i11;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (paddingLeft + measuredWidth > i15 - getPaddingRight()) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += i16 + this.f25795b;
                    i16 = 0;
                }
                childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, paddingTop + measuredHeight);
                paddingLeft += measuredWidth + this.f25794a;
                i16 = Math.max(i16, measuredHeight);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                i13 = size;
            } else {
                measureChild(childAt, i11, i12);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                i13 = size;
                if (i17 + measuredWidth + this.f25794a > (i13 - getPaddingLeft()) - getPaddingRight()) {
                    i15 = Math.max(i15, i17);
                    i16 += i18 + this.f25795b;
                } else {
                    measuredWidth = measuredWidth + this.f25794a + i17;
                    measuredHeight = Math.max(i18, measuredHeight);
                }
                if (i14 == childCount - 1) {
                    i16 += measuredHeight;
                    i15 = Math.max(i15, measuredWidth);
                }
                i18 = measuredHeight;
                i17 = measuredWidth;
            }
            i14++;
            size = i13;
        }
        int i19 = size;
        int paddingLeft = i15 + getPaddingLeft() + getPaddingRight();
        int paddingTop = i16 + getPaddingTop() + getPaddingBottom();
        if (mode == 1073741824) {
            paddingLeft = i19;
        }
        if (mode2 != 1073741824) {
            size2 = paddingTop;
        }
        setMeasuredDimension(paddingLeft, size2);
    }

    public final void setHorizontalSpacing(int i11) {
        this.f25794a = i11;
        requestLayout();
    }

    public final void setVerticalSpacing(int i11) {
        this.f25795b = i11;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public FlowLayout(@m80.k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    @Override // android.view.ViewGroup
    @m80.k
    public ViewGroup.LayoutParams generateLayoutParams(@l ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k
    public FlowLayout(@m80.k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
    }

    public /* synthetic */ FlowLayout(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
