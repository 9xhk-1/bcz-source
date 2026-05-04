package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public boolean N;
    public final List<Integer> O;

    public BottomNavigationMenuView(@NonNull Context context) {
        super(context);
        this.O = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.J = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.K = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.L = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.M = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public NavigationBarItemView f(@NonNull Context context) {
        return new BottomNavigationItemView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    int i19 = i15 - i17;
                    childAt.layout(i19 - childAt.getMeasuredWidth(), 0, i19, i16);
                } else {
                    childAt.layout(i17, 0, childAt.getMeasuredWidth() + i17, i16);
                }
                i17 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        MenuBuilder menu = getMenu();
        int size = View.MeasureSpec.getSize(i11);
        int size2 = menu.getVisibleItems().size();
        int childCount = getChildCount();
        this.O.clear();
        int size3 = View.MeasureSpec.getSize(i12);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (k(getLabelVisibilityMode(), size2) && t()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int i15 = this.M;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.L, Integer.MIN_VALUE), makeMeasureSpec);
                i15 = Math.max(i15, childAt.getMeasuredWidth());
            }
            int i16 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.K * i16), Math.min(i15, this.L));
            int i17 = size - min;
            int min2 = Math.min(i17 / (i16 != 0 ? i16 : 1), this.J);
            int i18 = i17 - (i16 * min2);
            int i19 = 0;
            while (i19 < childCount) {
                if (getChildAt(i19).getVisibility() != 8) {
                    i14 = i19 == getSelectedItemPosition() ? min : min2;
                    if (i18 > 0) {
                        i14++;
                        i18--;
                    }
                } else {
                    i14 = 0;
                }
                this.O.add(Integer.valueOf(i14));
                i19++;
            }
        } else {
            int min3 = Math.min(size / (size2 != 0 ? size2 : 1), this.L);
            int i21 = size - (size2 * min3);
            for (int i22 = 0; i22 < childCount; i22++) {
                if (getChildAt(i22).getVisibility() == 8) {
                    i13 = 0;
                } else if (i21 > 0) {
                    i13 = min3 + 1;
                    i21--;
                } else {
                    i13 = min3;
                }
                this.O.add(Integer.valueOf(i13));
            }
        }
        int i23 = 0;
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt2 = getChildAt(i24);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.O.get(i24).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i23 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(i23, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z11) {
        this.N = z11;
    }

    public boolean t() {
        return this.N;
    }
}
