package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.a;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ChipGroup extends FlowLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final int f31015k = R.style.Widget_MaterialComponents_ChipGroup;

    /* renamed from: e, reason: collision with root package name */
    @Dimension
    public int f31016e;

    /* renamed from: f, reason: collision with root package name */
    @Dimension
    public int f31017f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public e f31018g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.android.material.internal.a<Chip> f31019h;

    /* renamed from: i, reason: collision with root package name */
    public final int f31020i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final f f31021j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements a.b {
        public a() {
        }

        @Override // com.google.android.material.internal.a.b
        public void a(Set<Integer> set) {
            if (ChipGroup.this.f31018g != null) {
                e eVar = ChipGroup.this.f31018g;
                ChipGroup chipGroup = ChipGroup.this;
                eVar.a(chipGroup, chipGroup.f31019h.j(ChipGroup.this));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f31023a;

        public b(d dVar) {
            this.f31023a = dVar;
        }

        @Override // com.google.android.material.chip.ChipGroup.e
        public void a(@NonNull ChipGroup chipGroup, @NonNull List<Integer> list) {
            if (ChipGroup.this.f31019h.m()) {
                this.f31023a.a(chipGroup, ChipGroup.this.getCheckedChipId());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i11, int i12) {
            super(i11, i12);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Deprecated
    public interface d {
        void a(@NonNull ChipGroup chipGroup, @IdRes int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        void a(@NonNull ChipGroup chipGroup, @NonNull List<Integer> list);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f31025a;

        public f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(ViewCompat.generateViewId());
                }
                ChipGroup.this.f31019h.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f31025a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f31019h.o((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f31025a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        public /* synthetic */ f(ChipGroup chipGroup, a aVar) {
            this();
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof Chip) && j(i12)) {
                i11++;
            }
        }
        return i11;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    public void g(@IdRes int i11) {
        this.f31019h.f(i11);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @IdRes
    public int getCheckedChipId() {
        return this.f31019h.k();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.f31019h.j(this);
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.f31016e;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.f31017f;
    }

    public void h() {
        this.f31019h.h();
    }

    public int i(@Nullable View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if ((childAt instanceof Chip) && j(i12)) {
                if (((Chip) childAt) == view) {
                    return i11;
                }
                i11++;
            }
        }
        return -1;
    }

    public final boolean j(int i11) {
        return getChildAt(i11).getVisibility() == 0;
    }

    public boolean k() {
        return this.f31019h.l();
    }

    public boolean l() {
        return this.f31019h.m();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.f31020i;
        if (i11 != -1) {
            this.f31019h.f(i11);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCount(), c() ? getVisibleChipCount() : -1, false, l() ? 1 : 2));
    }

    public void setChipSpacing(@Dimension int i11) {
        setChipSpacingHorizontal(i11);
        setChipSpacingVertical(i11);
    }

    public void setChipSpacingHorizontal(@Dimension int i11) {
        if (this.f31016e != i11) {
            this.f31016e = i11;
            setItemSpacing(i11);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int i11) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i11));
    }

    public void setChipSpacingResource(@DimenRes int i11) {
        setChipSpacing(getResources().getDimensionPixelOffset(i11));
    }

    public void setChipSpacingVertical(@Dimension int i11) {
        if (this.f31017f != i11) {
            this.f31017f = i11;
            setLineSpacing(i11);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int i11) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i11));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i11) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(@Nullable e eVar) {
        this.f31018g = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f31021j.f31025a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z11) {
        this.f31019h.q(z11);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i11) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i11) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z11) {
        super.setSingleLine(z11);
    }

    public void setSingleSelection(boolean z11) {
        this.f31019h.r(z11);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(@BoolRes int i11) {
        setSingleLine(getResources().getBoolean(i11));
    }

    public void setSingleSelection(@BoolRes int i11) {
        setSingleSelection(getResources().getBoolean(i11));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = com.google.android.material.chip.ChipGroup.f31015k
            android.content.Context r9 = zn.a.c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.google.android.material.internal.a r9 = new com.google.android.material.internal.a
            r9.<init>()
            r8.f31019h = r9
            com.google.android.material.chip.ChipGroup$f r6 = new com.google.android.material.chip.ChipGroup$f
            r0 = 0
            r6.<init>(r8, r0)
            r8.f31021j = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = com.google.android.material.R.styleable.ChipGroup
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.d0.k(r0, r1, r2, r3, r4, r5)
            int r11 = com.google.android.material.R.styleable.ChipGroup_chipSpacing
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            int r0 = com.google.android.material.R.styleable.ChipGroup_chipSpacingHorizontal
            int r0 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingHorizontal(r0)
            int r0 = com.google.android.material.R.styleable.ChipGroup_chipSpacingVertical
            int r11 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingVertical(r11)
            int r11 = com.google.android.material.R.styleable.ChipGroup_singleLine
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleLine(r11)
            int r11 = com.google.android.material.R.styleable.ChipGroup_singleSelection
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleSelection(r11)
            int r11 = com.google.android.material.R.styleable.ChipGroup_selectionRequired
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSelectionRequired(r11)
            int r11 = com.google.android.material.R.styleable.ChipGroup_checkedChip
            r0 = -1
            int r11 = r10.getResourceId(r11, r0)
            r8.f31020i = r11
            r10.recycle()
            com.google.android.material.chip.ChipGroup$a r10 = new com.google.android.material.chip.ChipGroup$a
            r10.<init>()
            r9.p(r10)
            super.setOnHierarchyChangeListener(r6)
            r9 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
