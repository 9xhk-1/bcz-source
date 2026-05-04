package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorInt;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: i, reason: collision with root package name */
    public static final int f32333i = 15;

    /* renamed from: j, reason: collision with root package name */
    public static final String f32334j = "SwitchAccess";

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ListPopupWindow f32335a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f32336b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Rect f32337c;

    /* renamed from: d, reason: collision with root package name */
    @LayoutRes
    public final int f32338d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32339e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public ColorStateList f32340f;

    /* renamed from: g, reason: collision with root package name */
    public int f32341g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public ColorStateList f32342h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.this.k(i11 < 0 ? materialAutoCompleteTextView.f32335a.getSelectedItem() : materialAutoCompleteTextView.getAdapter().getItem(i11));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i11 < 0) {
                    view = MaterialAutoCompleteTextView.this.f32335a.getSelectedView();
                    i11 = MaterialAutoCompleteTextView.this.f32335a.getSelectedItemPosition();
                    j11 = MaterialAutoCompleteTextView.this.f32335a.getSelectedItemId();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f32335a.getListView(), view, i11, j11);
            }
            MaterialAutoCompleteTextView.this.f32335a.dismiss();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> extends ArrayAdapter<String> {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public ColorStateList f32344a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public ColorStateList f32345b;

        public b(@NonNull Context context, int i11, @NonNull String[] strArr) {
            super(context, i11, strArr);
            g();
        }

        @Nullable
        public final ColorStateList b() {
            if (!d() || !e()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = MaterialAutoCompleteTextView.this.f32342h.getColorForState(iArr2, 0);
            int colorForState2 = MaterialAutoCompleteTextView.this.f32342h.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{en.u.s(MaterialAutoCompleteTextView.this.f32341g, colorForState), en.u.s(MaterialAutoCompleteTextView.this.f32341g, colorForState2), MaterialAutoCompleteTextView.this.f32341g});
        }

        @Nullable
        public final Drawable c() {
            if (!d()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f32341g);
            if (this.f32345b == null) {
                return colorDrawable;
            }
            DrawableCompat.setTintList(colorDrawable, this.f32344a);
            return new RippleDrawable(this.f32345b, colorDrawable, null);
        }

        public final boolean d() {
            return MaterialAutoCompleteTextView.this.f32341g != 0;
        }

        public final boolean e() {
            return MaterialAutoCompleteTextView.this.f32342h != null;
        }

        public final ColorStateList f() {
            if (!e()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f32342h.getColorForState(iArr, 0), 0});
        }

        public void g() {
            this.f32345b = f();
            this.f32344a = b();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i11, @Nullable View view, ViewGroup viewGroup) {
            View view2 = super.getView(i11, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                ViewCompat.setBackground(textView, MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? c() : null);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (f()) {
            this.f32335a.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Nullable
    public final TextInputLayout e() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean f() {
        return h() || g();
    }

    public final boolean g() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f32336b;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f32336b.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains(f32334j)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public ColorStateList getDropDownBackgroundTintList() {
        return this.f32340f;
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout e11 = e();
        return (e11 == null || !e11.c0()) ? super.getHint() : e11.getHint();
    }

    public float getPopupElevation() {
        return this.f32339e;
    }

    public int getSimpleItemSelectedColor() {
        return this.f32341g;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f32342h;
    }

    public final boolean h() {
        AccessibilityManager accessibilityManager = this.f32336b;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    public final int i() {
        ListAdapter adapter = getAdapter();
        TextInputLayout e11 = e();
        int i11 = 0;
        if (adapter == null || e11 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f32335a.getSelectedItemPosition()) + 15);
        View view = null;
        int i12 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(max, view, e11);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = Math.max(i12, view.getMeasuredWidth());
        }
        Drawable background = this.f32335a.getBackground();
        if (background != null) {
            background.getPadding(this.f32337c);
            Rect rect = this.f32337c;
            i12 += rect.left + rect.right;
        }
        return i12 + e11.getEndIconView().getMeasuredWidth();
    }

    public final void j() {
        TextInputLayout e11 = e();
        if (e11 != null) {
            e11.J0();
        }
    }

    public final <T extends ListAdapter & Filterable> void k(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout e11 = e();
        if (e11 != null && e11.c0() && super.getHint() == null && com.google.android.material.internal.l.d()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32335a.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), i()), View.MeasureSpec.getSize(i11)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z11) {
        if (f()) {
            return;
        }
        super.onWindowFocusChanged(z11);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t11) {
        super.setAdapter(t11);
        this.f32335a.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f32335a;
        if (listPopupWindow != null) {
            listPopupWindow.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(@ColorInt int i11) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i11));
    }

    public void setDropDownBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.f32340f = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof vn.k) {
            ((vn.k) dropDownBackground).p0(this.f32340f);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f32335a.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i11) {
        super.setRawInputType(i11);
        j();
    }

    public void setSimpleItemSelectedColor(int i11) {
        this.f32341g = i11;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).g();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.f32342h = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).g();
        }
    }

    public void setSimpleItems(@ArrayRes int i11) {
        setSimpleItems(getResources().getStringArray(i11));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (f()) {
            this.f32335a.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new b(getContext(), this.f32338d, strArr));
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(zn.a.c(context, attributeSet, i11, 0), attributeSet, i11);
        this.f32337c = new Rect();
        Context context2 = getContext();
        TypedArray k11 = com.google.android.material.internal.d0.k(context2, attributeSet, com.google.android.material.R.styleable.MaterialAutoCompleteTextView, i11, com.google.android.material.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i12 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_inputType;
        if (k11.hasValue(i12) && k11.getInt(i12, 0) == 0) {
            setKeyListener(null);
        }
        this.f32338d = k11.getResourceId(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemLayout, com.google.android.material.R.layout.mtrl_auto_complete_simple_item);
        this.f32339e = k11.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_popupElevation, com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int i13 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint;
        if (k11.hasValue(i13)) {
            this.f32340f = ColorStateList.valueOf(k11.getColor(i13, 0));
        }
        this.f32341g = k11.getColor(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f32342h = sn.c.a(context2, k11, com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f32336b = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f32335a = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new a());
        int i14 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItems;
        if (k11.hasValue(i14)) {
            setSimpleItems(k11.getResourceId(i14, 0));
        }
        k11.recycle();
    }
}
