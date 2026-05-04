package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import vn.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final String f30827k = "MButtonToggleGroup";

    /* renamed from: l, reason: collision with root package name */
    public static final int f30828l = R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: a, reason: collision with root package name */
    public final List<c> f30829a;

    /* renamed from: b, reason: collision with root package name */
    public final e f30830b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet<d> f30831c;

    /* renamed from: d, reason: collision with root package name */
    public final Comparator<MaterialButton> f30832d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f30833e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30834f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30835g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30836h;

    /* renamed from: i, reason: collision with root package name */
    @IdRes
    public final int f30837i;

    /* renamed from: j, reason: collision with root package name */
    public Set<Integer> f30838j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AccessibilityDelegateCompat {
        public b() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, MaterialButtonToggleGroup.this.k(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: e, reason: collision with root package name */
        public static final vn.e f30841e = new vn.a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        public vn.e f30842a;

        /* renamed from: b, reason: collision with root package name */
        public vn.e f30843b;

        /* renamed from: c, reason: collision with root package name */
        public vn.e f30844c;

        /* renamed from: d, reason: collision with root package name */
        public vn.e f30845d;

        public c(vn.e eVar, vn.e eVar2, vn.e eVar3, vn.e eVar4) {
            this.f30842a = eVar;
            this.f30843b = eVar3;
            this.f30844c = eVar4;
            this.f30845d = eVar2;
        }

        public static c a(c cVar) {
            vn.e eVar = f30841e;
            return new c(eVar, cVar.f30845d, eVar, cVar.f30844c);
        }

        public static c b(c cVar, View view) {
            return m0.s(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            vn.e eVar = cVar.f30842a;
            vn.e eVar2 = cVar.f30845d;
            vn.e eVar3 = f30841e;
            return new c(eVar, eVar2, eVar3, eVar3);
        }

        public static c d(c cVar) {
            vn.e eVar = f30841e;
            return new c(eVar, eVar, cVar.f30843b, cVar.f30844c);
        }

        public static c e(c cVar, View view) {
            return m0.s(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            vn.e eVar = cVar.f30842a;
            vn.e eVar2 = f30841e;
            return new c(eVar, eVar2, cVar.f30843b, eVar2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, @IdRes int i11, boolean z11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements MaterialButton.c {
        public e() {
        }

        @Override // com.google.android.material.button.MaterialButton.c
        public void a(@NonNull MaterialButton materialButton, boolean z11) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
        this(context, null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (m(i11)) {
                return i11;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof MaterialButton) && m(i12)) {
                i11++;
            }
        }
        return i11;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ViewCompat.generateViewId());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f30830b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public static void u(p.b bVar, @Nullable c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.L(cVar.f30842a).y(cVar.f30845d).Q(cVar.f30843b).D(cVar.f30844c);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f30827k, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i11, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.isChecked());
        p shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f30829a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        ViewCompat.setAccessibilityDelegate(materialButton, new b());
    }

    public void b(@NonNull d dVar) {
        this.f30831c.add(dVar);
    }

    public final void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i11 = firstVisibleChildIndex + 1; i11 < getChildCount(); i11++) {
            MaterialButton j11 = j(i11);
            int min = Math.min(j11.getStrokeWidth(), j(i11 - 1).getStrokeWidth());
            LinearLayout.LayoutParams d11 = d(j11);
            if (getOrientation() == 0) {
                MarginLayoutParamsCompat.setMarginEnd(d11, 0);
                MarginLayoutParamsCompat.setMarginStart(d11, -min);
                d11.topMargin = 0;
            } else {
                d11.bottomMargin = 0;
                d11.topMargin = -min;
                MarginLayoutParamsCompat.setMarginStart(d11, 0);
            }
            j11.setLayoutParams(d11);
        }
        r(firstVisibleChildIndex);
    }

    @NonNull
    public final LinearLayout.LayoutParams d(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        w();
        super.dispatchDraw(canvas);
    }

    public void e(@IdRes int i11) {
        f(i11, true);
    }

    public final void f(@IdRes int i11, boolean z11) {
        if (i11 == -1) {
            Log.e(f30827k, "Button ID is not valid: " + i11);
            return;
        }
        HashSet hashSet = new HashSet(this.f30838j);
        if (z11 && !hashSet.contains(Integer.valueOf(i11))) {
            if (this.f30835g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i11));
        } else {
            if (z11 || !hashSet.contains(Integer.valueOf(i11))) {
                return;
            }
            if (!this.f30836h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i11));
            }
        }
        v(hashSet);
    }

    public void g() {
        v(new HashSet());
    }

    @IdRes
    public int getCheckedButtonId() {
        if (!this.f30835g || this.f30838j.isEmpty()) {
            return -1;
        }
        return this.f30838j.iterator().next().intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int id2 = j(i11).getId();
            if (this.f30838j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i11, int i12) {
        Integer[] numArr = this.f30833e;
        if (numArr != null && i12 < numArr.length) {
            return numArr[i12].intValue();
        }
        Log.w(f30827k, "Child order wasn't updated");
        return i12;
    }

    public void h() {
        this.f30831c.clear();
    }

    public final void i(@IdRes int i11, boolean z11) {
        Iterator<d> it = this.f30831c.iterator();
        while (it.hasNext()) {
            it.next().a(this, i11, z11);
        }
    }

    public final MaterialButton j(int i11) {
        return (MaterialButton) getChildAt(i11);
    }

    public final int k(@Nullable View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == view) {
                return i11;
            }
            if ((getChildAt(i12) instanceof MaterialButton) && m(i12)) {
                i11++;
            }
        }
        return -1;
    }

    @Nullable
    public final c l(int i11, int i12, int i13) {
        c cVar = this.f30829a.get(i11);
        if (i12 == i13) {
            return cVar;
        }
        boolean z11 = getOrientation() == 0;
        if (i11 == i12) {
            return z11 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i11 == i13) {
            return z11 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    public final boolean m(int i11) {
        return getChildAt(i11).getVisibility() != 8;
    }

    public boolean n() {
        return this.f30836h;
    }

    public boolean o() {
        return this.f30835g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.f30837i;
        if (i11 != -1) {
            v(Collections.singleton(Integer.valueOf(i11)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getVisibleButtonCount(), false, o() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        x();
        c();
        super.onMeasure(i11, i12);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f30829a.remove(indexOfChild);
        }
        x();
        c();
    }

    public void p(@NonNull MaterialButton materialButton, boolean z11) {
        if (this.f30834f) {
            return;
        }
        f(materialButton.getId(), z11);
    }

    public void q(@NonNull d dVar) {
        this.f30831c.remove(dVar);
    }

    public final void r(int i11) {
        if (getChildCount() == 0 || i11 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) j(i11).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            MarginLayoutParamsCompat.setMarginEnd(layoutParams, 0);
            MarginLayoutParamsCompat.setMarginStart(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void s(@IdRes int i11, boolean z11) {
        View findViewById = findViewById(i11);
        if (findViewById instanceof MaterialButton) {
            this.f30834f = true;
            ((MaterialButton) findViewById).setChecked(z11);
            this.f30834f = false;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            j(i11).setEnabled(z11);
        }
    }

    public void setSelectionRequired(boolean z11) {
        this.f30836h = z11;
    }

    public void setSingleSelection(boolean z11) {
        if (this.f30835g != z11) {
            this.f30835g = z11;
            g();
        }
        y();
    }

    public void t(@IdRes int i11) {
        f(i11, false);
    }

    public final void v(Set<Integer> set) {
        Set<Integer> set2 = this.f30838j;
        this.f30838j = new HashSet(set);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int id2 = j(i11).getId();
            s(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                i(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    public final void w() {
        TreeMap treeMap = new TreeMap(this.f30832d);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            treeMap.put(j(i11), Integer.valueOf(i11));
        }
        this.f30833e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @VisibleForTesting
    public void x() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i11 = 0; i11 < childCount; i11++) {
            MaterialButton j11 = j(i11);
            if (j11.getVisibility() != 8) {
                p.b v11 = j11.getShapeAppearanceModel().v();
                u(v11, l(i11, firstVisibleChildIndex, lastVisibleChildIndex));
                j11.setShapeAppearanceModel(v11.m());
            }
        }
    }

    public final void y() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            j(i11).setA11yClassName((this.f30835g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButtonToggleGroup(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f30828l
            android.content.Context r7 = zn.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f30829a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f30830b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f30831c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f30832d = r7
            r7 = 0
            r6.f30834f = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f30838j = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.d0.k(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.MaterialButtonToggleGroup_singleSelection
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = com.google.android.material.R.styleable.MaterialButtonToggleGroup_checkedButton
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f30837i = r9
            int r9 = com.google.android.material.R.styleable.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f30836h = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            int r9 = com.google.android.material.R.styleable.MaterialButtonToggleGroup_android_enabled
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setEnabled(r9)
            r8.recycle()
            androidx.core.view.ViewCompat.setImportantForAccessibility(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(@BoolRes int i11) {
        setSingleSelection(getResources().getBoolean(i11));
    }
}
