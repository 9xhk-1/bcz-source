package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        @ViewDebug.ExportedProperty
        public int cellsUsed;

        @ViewDebug.ExportedProperty
        public boolean expandable;
        boolean expanded;

        @ViewDebug.ExportedProperty
        public int extraPixels;

        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.isOverflowButton = false;
        }

        public LayoutParams(int i11, int i12, boolean z11) {
            super(i11, i12);
            this.isOverflowButton = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class MenuBuilderCallback implements MenuBuilder.Callback {
        public MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.mOnMenuItemClickListener;
            return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
            MenuBuilder.Callback callback = ActionMenuView.this.mMenuBuilderCallback;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    public static int measureChildForCells(View view, int i11, int i12, int i13, int i14) {
        int i15;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i13) - i14, View.MeasureSpec.getMode(i13));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z11 = false;
        boolean z12 = actionMenuItemView != null && actionMenuItemView.hasText();
        if (i12 > 0) {
            i15 = 2;
            if (!z12 || i12 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i12 * i11, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i16 = measuredWidth / i11;
                if (measuredWidth % i11 != 0) {
                    i16++;
                }
                if (!z12 || i16 >= 2) {
                    i15 = i16;
                }
                if (!layoutParams.isOverflowButton && z12) {
                    z11 = true;
                }
                layoutParams.expandable = z11;
                layoutParams.cellsUsed = i15;
                view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i15, 1073741824), makeMeasureSpec);
                return i15;
            }
        }
        i15 = 0;
        if (!layoutParams.isOverflowButton) {
            z11 = true;
        }
        layoutParams.expandable = z11;
        layoutParams.cellsUsed = i15;
        view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i15, 1073741824), makeMeasureSpec);
        return i15;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    private void onMeasureExactFormat(int i11, int i12) {
        long j11;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        ?? r32;
        int i15;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, paddingTop, -2);
        int i16 = size - paddingLeft;
        int i17 = this.mMinCellSize;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i21 = i17 + (i19 / i18);
        int childCount = getChildCount();
        int i22 = 0;
        int i23 = 0;
        boolean z13 = false;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        long j12 = 0;
        while (i23 < childCount) {
            View childAt = getChildAt(i23);
            int i27 = size2;
            if (childAt.getVisibility() == 8) {
                i15 = i21;
            } else {
                boolean z14 = childAt instanceof ActionMenuItemView;
                i24++;
                if (z14) {
                    int i28 = this.mGeneratedItemPadding;
                    z12 = z14;
                    r32 = 0;
                    childAt.setPadding(i28, 0, i28, 0);
                } else {
                    z12 = z14;
                    r32 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.expanded = r32;
                layoutParams.extraPixels = r32;
                layoutParams.cellsUsed = r32;
                layoutParams.expandable = r32;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r32;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r32;
                layoutParams.preventEdgeOffset = z12 && ((ActionMenuItemView) childAt).hasText();
                int measureChildForCells = measureChildForCells(childAt, i21, layoutParams.isOverflowButton ? 1 : i18, childMeasureSpec, paddingTop);
                i25 = Math.max(i25, measureChildForCells);
                i15 = i21;
                if (layoutParams.expandable) {
                    i26++;
                }
                if (layoutParams.isOverflowButton) {
                    z13 = true;
                }
                i18 -= measureChildForCells;
                i22 = Math.max(i22, childAt.getMeasuredHeight());
                if (measureChildForCells == 1) {
                    j12 |= 1 << i23;
                }
            }
            i23++;
            size2 = i27;
            i21 = i15;
        }
        int i29 = size2;
        int i31 = i21;
        char c11 = 2;
        boolean z15 = z13 && i24 == 2;
        boolean z16 = false;
        while (i26 > 0 && i18 > 0) {
            int i32 = Integer.MAX_VALUE;
            long j13 = 0;
            char c12 = c11;
            int i33 = 0;
            int i34 = 0;
            j11 = 1;
            while (i34 < childCount) {
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i34).getLayoutParams();
                boolean z17 = z15;
                if (layoutParams2.expandable) {
                    int i35 = layoutParams2.cellsUsed;
                    if (i35 < i32) {
                        j13 = 1 << i34;
                        i32 = i35;
                        i33 = 1;
                    } else if (i35 == i32) {
                        j13 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                z15 = z17;
            }
            boolean z18 = z15;
            j12 |= j13;
            if (i33 > i18) {
                break;
            }
            int i36 = i32 + 1;
            int i37 = 0;
            while (i37 < childCount) {
                View childAt2 = getChildAt(i37);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                long j14 = 1 << i37;
                if ((j13 & j14) == 0) {
                    if (layoutParams3.cellsUsed == i36) {
                        j12 |= j14;
                    }
                    i14 = i37;
                } else {
                    if (!z18 || !layoutParams3.preventEdgeOffset) {
                        i14 = i37;
                        z11 = true;
                    } else if (i18 == 1) {
                        int i38 = this.mGeneratedItemPadding;
                        z11 = true;
                        i14 = i37;
                        childAt2.setPadding(i38 + i31, 0, i38, 0);
                    } else {
                        i14 = i37;
                        z11 = true;
                    }
                    layoutParams3.cellsUsed++;
                    layoutParams3.expanded = z11;
                    i18--;
                }
                i37 = i14 + 1;
            }
            c11 = c12;
            z15 = z18;
            z16 = true;
        }
        j11 = 1;
        boolean z19 = !z13 && i24 == 1;
        if (i18 <= 0 || j12 == 0 || (i18 >= i24 - 1 && !z19 && i25 <= 1)) {
            i13 = 0;
        } else {
            float bitCount = Long.bitCount(j12);
            if (z19) {
                i13 = 0;
            } else {
                if ((j12 & j11) != 0) {
                    i13 = 0;
                    if (!((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                        bitCount -= 0.5f;
                    }
                } else {
                    i13 = 0;
                }
                int i39 = childCount - 1;
                if ((j12 & (1 << i39)) != 0 && !((LayoutParams) getChildAt(i39).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
            }
            int i41 = bitCount > 0.0f ? (int) ((i18 * i31) / bitCount) : i13;
            boolean z21 = z16;
            for (int i42 = i13; i42 < childCount; i42++) {
                if ((j12 & (1 << i42)) != 0) {
                    View childAt3 = getChildAt(i42);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.extraPixels = i41;
                        layoutParams4.expanded = true;
                        if (i42 == 0 && !layoutParams4.preventEdgeOffset) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i41) / 2;
                        }
                        z21 = true;
                    } else {
                        if (layoutParams4.isOverflowButton) {
                            layoutParams4.extraPixels = i41;
                            layoutParams4.expanded = true;
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i41) / 2;
                            z21 = true;
                        } else {
                            if (i42 != 0) {
                                ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i41 / 2;
                            }
                            if (i42 != childCount - 1) {
                                ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i41 / 2;
                            }
                        }
                    }
                }
            }
            z16 = z21;
        }
        if (z16) {
            for (int i43 = i13; i43 < childCount; i43++) {
                View childAt4 = getChildAt(i43);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.expanded) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.cellsUsed * i31) + layoutParams5.extraPixels, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? i22 : i29);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.isOverflowButton = true;
        return generateDefaultLayoutParams;
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.mMenu = menuBuilder;
            menuBuilder.setCallback(new MenuBuilderCallback());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.mPresenter = actionMenuPresenter;
            actionMenuPresenter.setReserveOverflow(true);
            ActionMenuPresenter actionMenuPresenter2 = this.mPresenter;
            MenuPresenter.Callback callback = this.mActionMenuPresenterCallback;
            if (callback == null) {
                callback = new ActionMenuPresenterCallback();
            }
            actionMenuPresenter2.setCallback(callback);
            this.mMenu.addMenuPresenter(this.mPresenter, this.mPopupContext);
            this.mPresenter.setMenuView(this);
        }
        return this.mMenu;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        return this.mPresenter.getOverflowIcon();
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean hasSupportDividerBeforeChildAt(int i11) {
        boolean z11 = false;
        if (i11 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i11 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i11);
        if (i11 < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            z11 = ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        return (i11 <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? z11 : ((ActionMenuChildView) childAt2).needsDividerBefore() | z11;
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.hideOverflowMenu();
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowing();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.mPresenter.isOverflowMenuShowing()) {
                this.mPresenter.hideOverflowMenu();
                this.mPresenter.showOverflowMenu();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int width;
        int i15;
        if (!this.mFormatItems) {
            super.onLayout(z11, i11, i12, i13, i14);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i14 - i12) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i13 - i11;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i18 = 0;
        int i19 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i21)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (isLayoutRtl) {
                        i15 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i15 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i15 = width - measuredWidth;
                    }
                    int i22 = i16 - (measuredHeight / 2);
                    childAt.layout(i15, i22, width, measuredHeight + i22);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    hasSupportDividerBeforeChildAt(i21);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i23 = (i17 / 2) - (measuredWidth2 / 2);
            int i24 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i23, i24, measuredWidth2 + i23, measuredHeight2 + i24);
            return;
        }
        int i25 = i19 - (i18 ^ 1);
        int max = Math.max(0, i25 > 0 ? paddingRight / i25 : 0);
        if (isLayoutRtl) {
            int width2 = getWidth() - getPaddingRight();
            for (int i26 = 0; i26 < childCount; i26++) {
                View childAt3 = getChildAt(i26);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.isOverflowButton) {
                    int i27 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i28 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i27 - measuredWidth3, i28, i27, measuredHeight3 + i28);
                    width2 = i27 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt4 = getChildAt(i29);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.isOverflowButton) {
                int i31 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i32 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i31, i32, i31 + measuredWidth4, measuredHeight4 + i32);
                paddingLeft = i31 + measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i11, int i12) {
        MenuBuilder menuBuilder;
        boolean z11 = this.mFormatItems;
        boolean z12 = View.MeasureSpec.getMode(i11) == 1073741824;
        this.mFormatItems = z12;
        if (z11 != z12) {
            this.mFormatItemsWidth = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (this.mFormatItems && (menuBuilder = this.mMenu) != null && size != this.mFormatItemsWidth) {
            this.mFormatItemsWidth = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.mFormatItems && childCount > 0) {
            onMeasureExactFormat(i11, i12);
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i13).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i11, i12);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public MenuBuilder peekMenu() {
        return this.mMenu;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z11) {
        this.mPresenter.setExpandedActionViewsExclusive(z11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        this.mPresenter.setOverflowIcon(drawable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z11) {
        this.mReserveOverflow = z11;
    }

    public void setPopupTheme(@StyleRes int i11) {
        if (this.mPopupTheme != i11) {
            this.mPopupTheme = i11;
            if (i11 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.mPresenter = actionMenuPresenter;
        actionMenuPresenter.setMenuView(this);
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.showOverflowMenu();
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f11);
        this.mGeneratedItemPadding = (int) (f11 * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams != null) {
            if (layoutParams instanceof LayoutParams) {
                layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
            } else {
                layoutParams2 = new LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
                ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
            }
            return layoutParams2;
        }
        return generateDefaultLayoutParams();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z11) {
        }
    }
}
