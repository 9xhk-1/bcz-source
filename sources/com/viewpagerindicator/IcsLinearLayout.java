package com.viewpagerindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class IcsLinearLayout extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f44753f = {android.R.attr.divider, android.R.attr.showDividers, android.R.attr.dividerPadding};

    /* renamed from: g, reason: collision with root package name */
    public static final int f44754g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f44755h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f44756i = 2;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f44757a;

    /* renamed from: b, reason: collision with root package name */
    public int f44758b;

    /* renamed from: c, reason: collision with root package name */
    public int f44759c;

    /* renamed from: d, reason: collision with root package name */
    public int f44760d;

    /* renamed from: e, reason: collision with root package name */
    public int f44761e;

    public IcsLinearLayout(Context context, int themeAttr) {
        super(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f44753f, themeAttr, 0);
        setDividerDrawable(obtainStyledAttributes.getDrawable(0));
        this.f44761e = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f44760d = obtainStyledAttributes.getInteger(1, 0);
        obtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8 && e(i11)) {
                d(canvas, childAt.getLeft() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).leftMargin);
            }
        }
        if (e(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            d(canvas, childAt2 == null ? (getWidth() - getPaddingRight()) - this.f44758b : childAt2.getRight());
        }
    }

    public final void b(Canvas canvas) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8 && e(i11)) {
                c(canvas, childAt.getTop() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).topMargin);
            }
        }
        if (e(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f44759c : childAt2.getBottom());
        }
    }

    public final void c(Canvas canvas, int top) {
        this.f44757a.setBounds(getPaddingLeft() + this.f44761e, top, (getWidth() - getPaddingRight()) - this.f44761e, this.f44759c + top);
        this.f44757a.draw(canvas);
    }

    public final void d(Canvas canvas, int left) {
        this.f44757a.setBounds(left, getPaddingTop() + this.f44761e, this.f44758b + left, (getHeight() - getPaddingBottom()) - this.f44761e);
        this.f44757a.draw(canvas);
    }

    public final boolean e(int childIndex) {
        if (childIndex != 0 && childIndex != getChildCount() && (this.f44760d & 2) != 0) {
            for (int i11 = childIndex - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        int indexOfChild = indexOfChild(child);
        int orientation = getOrientation();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) child.getLayoutParams();
        if (e(indexOfChild)) {
            if (orientation == 1) {
                layoutParams.topMargin = this.f44759c;
            } else {
                layoutParams.leftMargin = this.f44758b;
            }
        }
        int childCount = getChildCount();
        if (indexOfChild == childCount - 1 && e(childCount)) {
            if (orientation == 1) {
                layoutParams.bottomMargin = this.f44759c;
            } else {
                layoutParams.rightMargin = this.f44758b;
            }
        }
        super.measureChildWithMargins(child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f44757a != null) {
            if (getOrientation() == 1) {
                b(canvas);
            } else {
                a(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.LinearLayout
    public void setDividerDrawable(Drawable divider) {
        if (divider == this.f44757a) {
            return;
        }
        this.f44757a = divider;
        if (divider != null) {
            this.f44758b = divider.getIntrinsicWidth();
            this.f44759c = divider.getIntrinsicHeight();
        } else {
            this.f44758b = 0;
            this.f44759c = 0;
        }
        setWillNotDraw(divider == null);
        requestLayout();
    }
}
