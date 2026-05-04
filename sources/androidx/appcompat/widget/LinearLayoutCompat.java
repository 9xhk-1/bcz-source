package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DividerMode {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
        }

        public LayoutParams(int i11, int i12, float f11) {
            super(i11, i12, f11);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(@NonNull Context context) {
        this(context, null);
    }

    private void forceUniformHeight(int i11, int i12) {
        int i13;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i14 = 0;
        while (i14 < i11) {
            View virtualChildAt = getVirtualChildAt(i14);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                    int i15 = ((LinearLayout.LayoutParams) layoutParams).width;
                    ((LinearLayout.LayoutParams) layoutParams).width = virtualChildAt.getMeasuredWidth();
                    i13 = i12;
                    measureChildWithMargins(virtualChildAt, i13, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) layoutParams).width = i15;
                    i14++;
                    i12 = i13;
                }
            }
            i13 = i12;
            i14++;
            i12 = i13;
        }
    }

    private void forceUniformWidth(int i11, int i12) {
        int i13;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i14 = 0;
        while (i14 < i11) {
            View virtualChildAt = getVirtualChildAt(i14);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i15 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = virtualChildAt.getMeasuredHeight();
                    i13 = i12;
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i13, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i15;
                    i14++;
                    i12 = i13;
                }
            }
            i13 = i12;
            i14++;
            i12 = i13;
        }
    }

    private void setChildFrame(View view, int i11, int i12, int i13, int i14) {
        view.layout(i11, i12, i13 + i11, i14 + i12);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i11;
        int virtualChildCount = getVirtualChildCount();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        for (int i12 = 0; i12 < virtualChildCount; i12++) {
            View virtualChildAt = getVirtualChildAt(i12);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i12)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, isLayoutRtl ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (isLayoutRtl) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i11 = this.mDividerWidth;
                    right = left - i11;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (isLayoutRtl) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i11 = this.mDividerWidth;
                right = left - i11;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View virtualChildAt = getVirtualChildAt(i11);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i11)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i11) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i11, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i11);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i11) {
        this.mDivider.setBounds(i11, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i11, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i11;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i12 = this.mBaselineAlignedChildIndex;
        if (childCount <= i12) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i12);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i13 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i11 = this.mGravity & 112) != 48) {
            if (i11 == 16) {
                i13 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i11 == 80) {
                i13 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return i13 + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i11) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @GravityInt
    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i11) {
        return getChildAt(i11);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasDividerBeforeChildAt(int i11) {
        if (i11 == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i11 == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                if (getChildAt(i12).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void layoutHorizontal(int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.layoutHorizontal(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void layoutVertical(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r11.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r11.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r11.getVirtualChildCount()
            int r2 = r11.mGravity
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L35
            r4 = 80
            if (r3 == r4) goto L2a
            int r13 = r11.getPaddingTop()
            goto L41
        L2a:
            int r3 = r11.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r11.mTotalLength
            int r13 = r3 - r13
            goto L41
        L35:
            int r3 = r11.getPaddingTop()
            int r15 = r15 - r13
            int r13 = r11.mTotalLength
            int r15 = r15 - r13
            int r15 = r15 / 2
            int r13 = r3 + r15
        L41:
            r15 = 0
        L42:
            if (r15 >= r1) goto Lb9
            android.view.View r4 = r11.getVirtualChildAt(r15)
            r9 = 1
            if (r4 != 0) goto L52
            int r3 = r11.measureNullChild(r15)
            int r13 = r13 + r3
        L50:
            r3 = r11
            goto Lb7
        L52:
            int r3 = r4.getVisibility()
            r5 = 8
            if (r3 == r5) goto L50
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            r10 = r3
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10
            int r3 = r10.gravity
            if (r3 >= 0) goto L6e
            r3 = r2
        L6e:
            int r5 = androidx.core.view.ViewCompat.getLayoutDirection(r11)
            int r3 = androidx.core.view.GravityCompat.getAbsoluteGravity(r3, r5)
            r3 = r3 & 7
            if (r3 == r9) goto L88
            r5 = 5
            if (r3 == r5) goto L82
            int r3 = r10.leftMargin
            int r3 = r3 + r0
        L80:
            r5 = r3
            goto L93
        L82:
            int r3 = r12 - r7
            int r5 = r10.rightMargin
        L86:
            int r3 = r3 - r5
            goto L80
        L88:
            int r3 = r14 - r7
            int r3 = r3 / 2
            int r3 = r3 + r0
            int r5 = r10.leftMargin
            int r3 = r3 + r5
            int r5 = r10.rightMargin
            goto L86
        L93:
            boolean r3 = r11.hasDividerBeforeChildAt(r15)
            if (r3 == 0) goto L9c
            int r3 = r11.mDividerHeight
            int r13 = r13 + r3
        L9c:
            int r3 = r10.topMargin
            int r13 = r13 + r3
            int r3 = r11.getLocationOffset(r4)
            int r6 = r13 + r3
            r3 = r11
            r3.setChildFrame(r4, r5, r6, r7, r8)
            int r5 = r10.bottomMargin
            int r8 = r8 + r5
            int r5 = r11.getNextLocationOffset(r4)
            int r8 = r8 + r5
            int r13 = r13 + r8
            int r4 = r11.getChildrenSkipCount(r4, r15)
            int r15 = r15 + r4
        Lb7:
            int r15 = r15 + r9
            goto L42
        Lb9:
            r3 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.layoutVertical(int, int, int, int):void");
    }

    public void measureChildBeforeLayout(View view, int i11, int i12, int i13, int i14, int i15) {
        measureChildWithMargins(view, i12, i13, i14, i15);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0461  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void measureHorizontal(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.measureHorizontal(int, int):void");
    }

    public int measureNullChild(int i11) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void measureVertical(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.measureVertical(int, int):void");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.mOrientation == 1) {
            layoutVertical(i11, i12, i13, i14);
        } else {
            layoutHorizontal(i11, i12, i13, i14);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.mOrientation == 1) {
            measureVertical(i11, i12);
        } else {
            measureHorizontal(i11, i12);
        }
    }

    public void setBaselineAligned(boolean z11) {
        this.mBaselineAligned = z11;
    }

    public void setBaselineAlignedChildIndex(int i11) {
        if (i11 >= 0 && i11 < getChildCount()) {
            this.mBaselineAlignedChildIndex = i11;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + pn.j.f81007d);
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i11) {
        this.mDividerPadding = i11;
    }

    public void setGravity(@GravityInt int i11) {
        if (this.mGravity != i11) {
            if ((8388615 & i11) == 0) {
                i11 |= GravityCompat.START;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            this.mGravity = i11;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i11) {
        int i12 = i11 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i13 = this.mGravity;
        if ((8388615 & i13) != i12) {
            this.mGravity = i12 | ((-8388616) & i13);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z11) {
        this.mUseLargestChild = z11;
    }

    public void setOrientation(int i11) {
        if (this.mOrientation != i11) {
            this.mOrientation = i11;
            requestLayout();
        }
    }

    public void setShowDividers(int i11) {
        if (i11 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i11;
    }

    public void setVerticalGravity(int i11) {
        int i12 = i11 & 112;
        int i13 = this.mGravity;
        if ((i13 & 112) != i12) {
            this.mGravity = i12 | (i13 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f11) {
        this.mWeightSum = Math.max(0.0f, f11);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i11 = this.mOrientation;
        if (i11 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i11 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = R.styleable.LinearLayoutCompat;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i11, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i11, 0);
        int i12 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i12 >= 0) {
            setOrientation(i12);
        }
        int i13 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i13 >= 0) {
            setGravity(i13);
        }
        boolean z11 = obtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z11) {
            setBaselineAligned(z11);
        }
        this.mWeightSum = obtainStyledAttributes.getFloat(R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(obtainStyledAttributes.getDrawable(R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }
}
