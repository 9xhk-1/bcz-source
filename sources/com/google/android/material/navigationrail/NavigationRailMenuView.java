package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import qn.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {

    @Px
    public int J;
    public final FrameLayout.LayoutParams K;

    public NavigationRailMenuView(@NonNull Context context) {
        super(context);
        this.J = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.K = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public NavigationBarItemView f(@NonNull Context context) {
        return new a(context);
    }

    @Px
    public int getItemMinimumHeight() {
        return this.J;
    }

    public int getMenuGravity() {
        return this.K.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                childAt.layout(0, i16, i15, measuredHeight);
                i16 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i12);
        int size2 = getMenu().getVisibleItems().size();
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.resolveSizeAndState((size2 <= 1 || !k(getLabelVisibilityMode(), size2)) ? w(i11, size, size2, null) : x(i11, size, size2), i12, 0));
    }

    public void setItemMinimumHeight(@Px int i11) {
        if (this.J != i11) {
            this.J = i11;
            requestLayout();
        }
    }

    public void setMenuGravity(int i11) {
        FrameLayout.LayoutParams layoutParams = this.K;
        if (layoutParams.gravity != i11) {
            layoutParams.gravity = i11;
            setLayoutParams(layoutParams);
        }
    }

    public boolean t() {
        return (this.K.gravity & 112) == 48;
    }

    public final int u(int i11, int i12, int i13) {
        int max = i12 / Math.max(1, i13);
        int i14 = this.J;
        if (i14 == -1) {
            i14 = View.MeasureSpec.getSize(i11);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i14, max), 0);
    }

    public final int v(View view, int i11, int i12) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i11, i12);
        return view.getMeasuredHeight();
    }

    public final int w(int i11, int i12, int i13, View view) {
        int u11 = view == null ? u(i11, i12, i13) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int childCount = getChildCount();
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt != view) {
                i14 += v(childAt, i11, u11);
            }
        }
        return i14;
    }

    public final int x(int i11, int i12, int i13) {
        int i14;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i14 = v(childAt, i11, u(i11, i12, i13));
            i12 -= i14;
            i13--;
        } else {
            i14 = 0;
        }
        return i14 + w(i11, i12, i13, childAt);
    }
}
