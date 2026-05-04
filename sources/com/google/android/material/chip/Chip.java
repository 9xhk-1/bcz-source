package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.google.android.material.R;
import com.google.android.material.chip.a;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.m;
import com.google.android.material.internal.m0;
import java.util.List;
import sn.d;
import sn.f;
import vm.i;
import vn.l;
import vn.p;
import vn.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0369a, t, m<Chip> {
    public static final String A = "http://schemas.android.com/apk/res/android";
    public static final int B = 48;
    public static final String C = "android.widget.Button";
    public static final String D = "android.widget.RadioButton";
    public static final String E = "android.view.View";

    /* renamed from: t, reason: collision with root package name */
    public static final String f30986t = "Chip";

    /* renamed from: v, reason: collision with root package name */
    public static final int f30988v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final int f30989w = 1;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public com.google.android.material.chip.a f30993a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public InsetDrawable f30994b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public RippleDrawable f30995c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public View.OnClickListener f30996d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public CompoundButton.OnCheckedChangeListener f30997e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public m.a<Chip> f30998f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30999g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f31000h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f31001i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f31002j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f31003k;

    /* renamed from: l, reason: collision with root package name */
    public int f31004l;

    /* renamed from: m, reason: collision with root package name */
    @Dimension(unit = 1)
    public int f31005m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public CharSequence f31006n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final c f31007o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f31008p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f31009q;

    /* renamed from: r, reason: collision with root package name */
    public final RectF f31010r;

    /* renamed from: s, reason: collision with root package name */
    public final f f31011s;

    /* renamed from: u, reason: collision with root package name */
    public static final int f30987u = R.style.Widget_MaterialComponents_Chip_Action;

    /* renamed from: x, reason: collision with root package name */
    public static final Rect f30990x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f30991y = {android.R.attr.state_selected};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f30992z = {android.R.attr.state_checkable};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, @NonNull Outline outline) {
            if (Chip.this.f30993a != null) {
                Chip.this.f30993a.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends ExploreByTouchHelper {
        public c(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f11, float f12) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f11, f12)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(@NonNull List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.x() && Chip.this.f30996d != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i11, int i12, Bundle bundle) {
            if (i12 != 16) {
                return false;
            }
            if (i11 == 0) {
                return Chip.this.performClick();
            }
            if (i11 == 1) {
                return Chip.this.y();
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.setCheckable(Chip.this.r());
            accessibilityNodeInfoCompat.setClickable(Chip.this.isClickable());
            accessibilityNodeInfoCompat.setClassName(Chip.this.getAccessibilityClassName());
            accessibilityNodeInfoCompat.setText(Chip.this.getText());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i11, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (i11 != 1) {
                accessibilityNodeInfoCompat.setContentDescription("");
                accessibilityNodeInfoCompat.setBoundsInParent(Chip.f30990x);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfoCompat.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                accessibilityNodeInfoCompat.setContentDescription(Chip.this.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfoCompat.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            accessibilityNodeInfoCompat.setEnabled(Chip.this.isEnabled());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onVirtualViewKeyboardFocusChanged(int i11, boolean z11) {
            if (i11 == 1) {
                Chip.this.f31002j = z11;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    private void H(@Nullable AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue(A, SingleFragmentActivity.f18194n) != null) {
            Log.w(f30986t, "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue(A, "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue(A, "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue(A, "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue(A, "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue(A, "singleLine", true) || attributeSet.getAttributeIntValue(A, "lines", 1) != 1 || attributeSet.getAttributeIntValue(A, "minLines", 1) != 1 || attributeSet.getAttributeIntValue(A, "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue(A, "gravity", 8388627) != 8388627) {
            Log.w(f30986t, "Chip text must be vertically center and start aligned");
        }
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z11) {
        m.a<Chip> aVar = chip.f30998f;
        if (aVar != null) {
            aVar.a(chip, z11);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f30997e;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.f31010r.setEmpty();
        if (n() && this.f30996d != null) {
            this.f30993a.G1(this.f31010r);
        }
        return this.f31010r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f31009q.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f31009q;
    }

    @Nullable
    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.R1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z11) {
        if (this.f31001i != z11) {
            this.f31001i = z11;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z11) {
        if (this.f31000h != z11) {
            this.f31000h = z11;
            refreshDrawableState();
        }
    }

    public boolean A() {
        return this.f31003k;
    }

    public final void B(@Nullable com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.l3(null);
        }
    }

    public final void C() {
        if (n() && x() && this.f30996d != null) {
            ViewCompat.setAccessibilityDelegate(this, this.f31007o);
            this.f31008p = true;
        } else {
            ViewCompat.setAccessibilityDelegate(this, null);
            this.f31008p = false;
        }
    }

    public final void D() {
        if (tn.b.f90831a) {
            E();
            return;
        }
        this.f30993a.K3(true);
        ViewCompat.setBackground(this, getBackgroundDrawable());
        F();
        m();
    }

    public final void E() {
        this.f30995c = new RippleDrawable(tn.b.e(this.f30993a.O1()), getBackgroundDrawable(), null);
        this.f30993a.K3(false);
        ViewCompat.setBackground(this, this.f30995c);
        F();
    }

    public final void F() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f30993a) == null) {
            return;
        }
        int q12 = (int) (aVar.q1() + this.f30993a.S1() + this.f30993a.W0());
        int v12 = (int) (this.f30993a.v1() + this.f30993a.T1() + this.f30993a.S0());
        if (this.f30994b != null) {
            Rect rect = new Rect();
            this.f30994b.getPadding(rect);
            v12 += rect.left;
            q12 += rect.right;
        }
        ViewCompat.setPaddingRelative(this, v12, getPaddingTop(), q12, getPaddingBottom());
    }

    public final void G() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f31011s);
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0369a
    public void a() {
        l(this.f31005m);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return !this.f31008p ? super.dispatchHoverEvent(motionEvent) : this.f31007o.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f31008p) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f31007o.dispatchKeyEvent(keyEvent) || this.f31007o.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f30993a;
        if ((aVar == null || !aVar.d2()) ? false : this.f30993a.g3(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f31006n)) {
            return this.f31006n;
        }
        if (!r()) {
            return isClickable() ? C : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).l()) ? D : C;
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f30994b;
        return insetDrawable == null ? this.f30993a : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.m1();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.n1();
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.o1();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return Math.max(0.0f, aVar.p1());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f30993a;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.q1();
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.r1();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.s1();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.t1();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.u1();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.v1();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.w1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.x1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.z1();
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.A1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.B1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.C1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.D1();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.F1();
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.J1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@NonNull Rect rect) {
        if (this.f31008p && (this.f31007o.getKeyboardFocusedVirtualViewId() == 1 || this.f31007o.getAccessibilityFocusedVirtualViewId() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @Nullable
    public i getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.K1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.L1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.M1();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.O1();
        }
        return null;
    }

    @Override // vn.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.f30993a.getShapeAppearanceModel();
    }

    @Nullable
    public i getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.P1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.S1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            return aVar.T1();
        }
        return 0.0f;
    }

    public final void j(@NonNull com.google.android.material.chip.a aVar) {
        aVar.l3(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @NonNull
    public final int[] k() {
        ?? isEnabled = isEnabled();
        int i11 = isEnabled;
        if (this.f31002j) {
            i11 = isEnabled + 1;
        }
        int i12 = i11;
        if (this.f31001i) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (this.f31000h) {
            i13 = i12 + 1;
        }
        int i14 = i13;
        if (isChecked()) {
            i14 = i13 + 1;
        }
        int[] iArr = new int[i14];
        int i15 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i15 = 1;
        }
        if (this.f31002j) {
            iArr[i15] = 16842908;
            i15++;
        }
        if (this.f31001i) {
            iArr[i15] = 16843623;
            i15++;
        }
        if (this.f31000h) {
            iArr[i15] = 16842919;
            i15++;
        }
        if (isChecked()) {
            iArr[i15] = 16842913;
        }
        return iArr;
    }

    public boolean l(@Dimension int i11) {
        this.f31005m = i11;
        if (!A()) {
            if (this.f30994b != null) {
                z();
            } else {
                D();
            }
            return false;
        }
        int max = Math.max(0, i11 - this.f30993a.getIntrinsicHeight());
        int max2 = Math.max(0, i11 - this.f30993a.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f30994b != null) {
                z();
            } else {
                D();
            }
            return false;
        }
        int i12 = max2 > 0 ? max2 / 2 : 0;
        int i13 = max > 0 ? max / 2 : 0;
        if (this.f30994b != null) {
            Rect rect = new Rect();
            this.f30994b.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i12 && rect.right == i12) {
                D();
                return true;
            }
        }
        if (getMinHeight() != i11) {
            setMinHeight(i11);
        }
        if (getMinWidth() != i11) {
            setMinWidth(i11);
        }
        q(i12, i13, i12, i13);
        D();
        return true;
    }

    public final void m() {
        if (getBackgroundDrawable() == this.f30994b && this.f30993a.getCallback() == null) {
            this.f30993a.setCallback(this.f30994b);
        }
    }

    public final boolean n() {
        com.google.android.material.chip.a aVar = this.f30993a;
        return (aVar == null || aVar.z1() == null) ? false : true;
    }

    public final void o(Context context, @Nullable AttributeSet attributeSet, int i11) {
        TypedArray k11 = d0.k(context, attributeSet, R.styleable.Chip, i11, f30987u, new int[0]);
        this.f31003k = k11.getBoolean(R.styleable.Chip_ensureMinTouchTargetSize, false);
        this.f31005m = (int) Math.ceil(k11.getDimension(R.styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil(m0.i(getContext(), 48))));
        k11.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.f(this, this.f30993a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f30991y);
        }
        if (r()) {
            View.mergeDrawableStates(onCreateDrawableState, f30992z);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (this.f31008p) {
            this.f31007o.onFocusChanged(z11, i11, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.i(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @Nullable
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i11) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i11);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        if (this.f31004l != i11) {
            this.f31004l = i11;
            F();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f31000h
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f31000h
            if (r0 == 0) goto L35
            r5.y()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            return r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        setOutlineProvider(new b());
    }

    public final void q(int i11, int i12, int i13, int i14) {
        this.f30994b = new InsetDrawable((Drawable) this.f30993a, i11, i12, i13, i14);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f30993a;
        return aVar != null && aVar.X1();
    }

    @Deprecated
    public boolean s() {
        return t();
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.f31006n = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f30995c) {
            super.setBackground(drawable);
        } else {
            Log.w(f30986t, "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        Log.w(f30986t, "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f30995c) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w(f30986t, "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i11) {
        Log.w(f30986t, "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w(f30986t, "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w(f30986t, "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.m2(z11);
        }
    }

    public void setCheckableResource(@BoolRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.n2(i11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar == null) {
            this.f30999g = z11;
        } else if (aVar.X1()) {
            super.setChecked(z11);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.o2(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z11) {
        setCheckedIconVisible(z11);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i11) {
        setCheckedIconVisible(i11);
    }

    public void setCheckedIconResource(@DrawableRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.r2(i11);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.s2(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.t2(i11);
        }
    }

    public void setCheckedIconVisible(@BoolRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.u2(i11);
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.w2(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.x2(i11);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.y2(f11);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.z2(i11);
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f30993a;
        if (aVar2 != aVar) {
            B(aVar2);
            this.f30993a = aVar;
            aVar.w3(false);
            j(this.f30993a);
            l(this.f31005m);
        }
    }

    public void setChipEndPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.A2(f11);
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.B2(i11);
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.C2(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z11) {
        setChipIconVisible(z11);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i11) {
        setChipIconVisible(i11);
    }

    public void setChipIconResource(@DrawableRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.F2(i11);
        }
    }

    public void setChipIconSize(float f11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.G2(f11);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.H2(i11);
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.I2(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.J2(i11);
        }
    }

    public void setChipIconVisible(@BoolRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.K2(i11);
        }
    }

    public void setChipMinHeight(float f11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.M2(f11);
        }
    }

    public void setChipMinHeightResource(@DimenRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.N2(i11);
        }
    }

    public void setChipStartPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.O2(f11);
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.P2(i11);
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.Q2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.R2(i11);
        }
    }

    public void setChipStrokeWidth(float f11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.S2(f11);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.T2(i11);
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i11) {
        setText(getResources().getString(i11));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.V2(drawable);
        }
        C();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.W2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z11) {
        setCloseIconVisible(z11);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i11) {
        setCloseIconVisible(i11);
    }

    public void setCloseIconEndPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.Z2(f11);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.a3(i11);
        }
    }

    public void setCloseIconResource(@DrawableRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.b3(i11);
        }
        C();
    }

    public void setCloseIconSize(float f11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.c3(f11);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.d3(i11);
        }
    }

    public void setCloseIconStartPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.e3(f11);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.f3(i11);
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.h3(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.i3(i11);
        }
    }

    public void setCloseIconVisible(@BoolRes int i11) {
        setCloseIconVisible(getResources().getBoolean(i11));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i13 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i11, i12, i13, i14);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i13 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i11, i12, i13, i14);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f11) {
        super.setElevation(f11);
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.o0(f11);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f30993a == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.m3(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z11) {
        this.f31003k = z11;
        l(this.f31005m);
    }

    @Override // android.widget.TextView
    public void setGravity(int i11) {
        if (i11 != 8388627) {
            Log.w(f30986t, "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i11);
        }
    }

    public void setHideMotionSpec(@Nullable i iVar) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.n3(iVar);
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.o3(i11);
        }
    }

    public void setIconEndPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.p3(f11);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.q3(i11);
        }
    }

    public void setIconStartPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.r3(f11);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.s3(i11);
        }
    }

    @Override // com.google.android.material.internal.m
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@Nullable m.a<Chip> aVar) {
        this.f30998f = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i11) {
        if (this.f30993a == null) {
            return;
        }
        super.setLayoutDirection(i11);
    }

    @Override // android.widget.TextView
    public void setLines(int i11) {
        if (i11 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i11);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i11) {
        if (i11 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i11);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@Px int i11) {
        super.setMaxWidth(i11);
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.t3(i11);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i11) {
        if (i11 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i11);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f30997e = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f30996d = onClickListener;
        C();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.u3(colorStateList);
        }
        if (this.f30993a.V1()) {
            return;
        }
        E();
    }

    public void setRippleColorResource(@ColorRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.v3(i11);
            if (this.f30993a.V1()) {
                return;
            }
            E();
        }
    }

    @Override // vn.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        this.f30993a.setShapeAppearanceModel(pVar);
    }

    public void setShowMotionSpec(@Nullable i iVar) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.x3(iVar);
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.y3(i11);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z11) {
        if (!z11) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z11);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.L3() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f30993a;
        if (aVar2 != null) {
            aVar2.z3(charSequence);
        }
    }

    public void setTextAppearance(@Nullable d dVar) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.A3(dVar);
        }
        G();
    }

    public void setTextAppearanceResource(@StyleRes int i11) {
        setTextAppearance(getContext(), i11);
    }

    public void setTextEndPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.E3(f11);
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.F3(i11);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f11) {
        super.setTextSize(i11, f11);
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.H3(TypedValue.applyDimension(i11, f11, getResources().getDisplayMetrics()));
        }
        G();
    }

    public void setTextStartPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.I3(f11);
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.J3(i11);
        }
    }

    public boolean t() {
        com.google.android.material.chip.a aVar = this.f30993a;
        return aVar != null && aVar.Z1();
    }

    @Deprecated
    public boolean u() {
        return v();
    }

    public boolean v() {
        com.google.android.material.chip.a aVar = this.f30993a;
        return aVar != null && aVar.b2();
    }

    @Deprecated
    public boolean w() {
        return x();
    }

    public boolean x() {
        com.google.android.material.chip.a aVar = this.f30993a;
        return aVar != null && aVar.e2();
    }

    @CallSuper
    public boolean y() {
        boolean z11 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f30996d;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z11 = true;
        }
        if (this.f31008p) {
            this.f31007o.sendEventForVirtualView(1, 1);
        }
        return z11;
    }

    public final void z() {
        if (this.f30994b != null) {
            this.f30994b = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            D();
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    public void setCloseIconVisible(boolean z11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.k3(z11);
        }
        C();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.chip.Chip.f30987u
            android.content.Context r7 = zn.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f31009q = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f31010r = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f31011s = r7
            android.content.Context r0 = r6.getContext()
            r6.H(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.a.b1(r0, r8, r9, r4)
            r6.o(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = androidx.core.view.ViewCompat.getElevation(r6)
            r7.o0(r1)
            int[] r2 = com.google.android.material.R.styleable.Chip
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.d0.k(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.Chip_shapeAppearance
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$c r8 = new com.google.android.material.chip.Chip$c
            r8.<init>(r6)
            r6.f31007o = r8
            r6.C()
            if (r9 != 0) goto L59
            r6.p()
        L59:
            boolean r8 = r6.f30999g
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.Q1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.J1()
            r6.setEllipsize(r7)
            r6.G()
            com.google.android.material.chip.a r7 = r6.f30993a
            boolean r7 = r7.L3()
            if (r7 != 0) goto L7e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L7e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.F()
            boolean r7 = r6.A()
            if (r7 == 0) goto L92
            int r7 = r6.f31005m
            r6.setMinHeight(r7)
        L92:
            int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r6)
            r6.f31004l = r7
            dn.a r7 = new dn.a
            r7.<init>()
            super.setOnCheckedChangeListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedIconVisible(boolean z11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.v2(z11);
        }
    }

    public void setChipIconVisible(boolean z11) {
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.L2(z11);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.B3(i11);
        }
        G();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i11) {
        super.setTextAppearance(i11);
        com.google.android.material.chip.a aVar = this.f30993a;
        if (aVar != null) {
            aVar.B3(i11);
        }
        G();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends f {
        public a() {
        }

        @Override // sn.f
        public void b(@NonNull Typeface typeface, boolean z11) {
            Chip chip = Chip.this;
            chip.setText(chip.f30993a.L3() ? Chip.this.f30993a.Q1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }

        @Override // sn.f
        public void a(int i11) {
        }
    }
}
