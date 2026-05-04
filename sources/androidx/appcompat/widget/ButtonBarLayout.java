package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    private static final int PEEK_BUTTON_DP = 16;
    private boolean mAllowStacking;
    private int mLastWidthSize;
    private boolean mStacked;

    public ButtonBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastWidthSize = -1;
        int[] iArr = R.styleable.ButtonBarLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.mAllowStacking = obtainStyledAttributes.getBoolean(R.styleable.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.mAllowStacking);
        }
    }

    private int getNextVisibleChildIndex(int i11) {
        int childCount = getChildCount();
        while (i11 < childCount) {
            if (getChildAt(i11).getVisibility() == 0) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    private boolean isStacked() {
        return this.mStacked;
    }

    private void setStacked(boolean z11) {
        if (this.mStacked != z11) {
            if (!z11 || this.mAllowStacking) {
                this.mStacked = z11;
                setOrientation(z11 ? 1 : 0);
                setGravity(z11 ? GravityCompat.END : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z11 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        boolean z11;
        int size = View.MeasureSpec.getSize(i11);
        int i14 = 0;
        if (this.mAllowStacking) {
            if (size > this.mLastWidthSize && isStacked()) {
                setStacked(false);
            }
            this.mLastWidthSize = size;
        }
        if (isStacked() || View.MeasureSpec.getMode(i11) != 1073741824) {
            i13 = i11;
            z11 = false;
        } else {
            i13 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z11 = true;
        }
        super.onMeasure(i13, i12);
        if (this.mAllowStacking && !isStacked() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z11 = true;
        }
        if (z11) {
            super.onMeasure(i11, i12);
        }
        int nextVisibleChildIndex = getNextVisibleChildIndex(0);
        if (nextVisibleChildIndex >= 0) {
            View childAt = getChildAt(nextVisibleChildIndex);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (isStacked()) {
                int nextVisibleChildIndex2 = getNextVisibleChildIndex(nextVisibleChildIndex + 1);
                if (nextVisibleChildIndex2 >= 0) {
                    paddingTop += getChildAt(nextVisibleChildIndex2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i14 = paddingTop;
            } else {
                i14 = paddingTop + getPaddingBottom();
            }
        }
        if (ViewCompat.getMinimumHeight(this) != i14) {
            setMinimumHeight(i14);
            if (i12 == 0) {
                super.onMeasure(i11, i12);
            }
        }
    }

    public void setAllowStacking(boolean z11) {
        if (this.mAllowStacking != z11) {
            this.mAllowStacking = z11;
            if (!z11 && isStacked()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
