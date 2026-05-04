package wm;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class e extends f<View> {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f96498d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f96499e;

    /* renamed from: f, reason: collision with root package name */
    public int f96500f;

    /* renamed from: g, reason: collision with root package name */
    public int f96501g;

    public e() {
        this.f96498d = new Rect();
        this.f96499e = new Rect();
        this.f96500f = 0;
    }

    public static int w(int i11) {
        if (i11 == 0) {
            return 8388659;
        }
        return i11;
    }

    @Override // wm.f
    public void l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11) {
        View q11 = q(coordinatorLayout.getDependencies(view));
        if (q11 == null) {
            super.l(coordinatorLayout, view, i11);
            this.f96500f = 0;
            return;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        Rect rect = this.f96498d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, q11.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((coordinatorLayout.getHeight() + q11.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
            rect.left += lastWindowInsets.getSystemWindowInsetLeft();
            rect.right -= lastWindowInsets.getSystemWindowInsetRight();
        }
        Rect rect2 = this.f96499e;
        GravityCompat.apply(w(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i11);
        int r11 = r(q11);
        view.layout(rect2.left, rect2.top - r11, rect2.right, rect2.bottom - r11);
        this.f96500f = rect2.top - q11.getBottom();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11, int i12, int i13, int i14) {
        View q11;
        WindowInsetsCompat lastWindowInsets;
        int i15 = view.getLayoutParams().height;
        if ((i15 != -1 && i15 != -2) || (q11 = q(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i13);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (ViewCompat.getFitsSystemWindows(q11) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
        }
        int u11 = size + u(q11);
        int measuredHeight = q11.getMeasuredHeight();
        if (y()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            u11 -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i11, i12, View.MeasureSpec.makeMeasureSpec(u11, i15 == -1 ? 1073741824 : Integer.MIN_VALUE), i14);
        return true;
    }

    @Nullable
    public abstract View q(List<View> list);

    public final int r(View view) {
        if (this.f96501g == 0) {
            return 0;
        }
        float s11 = s(view);
        int i11 = this.f96501g;
        return MathUtils.clamp((int) (s11 * i11), 0, i11);
    }

    public float s(View view) {
        return 1.0f;
    }

    public final int t() {
        return this.f96501g;
    }

    public int u(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    public final int v() {
        return this.f96500f;
    }

    public final void x(int i11) {
        this.f96501g = i11;
    }

    public boolean y() {
        return false;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f96498d = new Rect();
        this.f96499e = new Rect();
        this.f96500f = 0;
    }
}
