package wn;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f96514a;

    public b(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f96514a = sideSheetBehavior;
    }

    @Override // wn.e
    public int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // wn.e
    public float b(int i11) {
        float e11 = e();
        return (e11 - i11) / (e11 - d());
    }

    @Override // wn.e
    public int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // wn.e
    public int d() {
        return Math.max(0, (e() - this.f96514a.G()) - this.f96514a.N());
    }

    @Override // wn.e
    public int e() {
        return this.f96514a.R();
    }

    @Override // wn.e
    public int f() {
        return this.f96514a.R();
    }

    @Override // wn.e
    public int g() {
        return d();
    }

    @Override // wn.e
    public <V extends View> int h(@NonNull V v11) {
        return v11.getLeft() - this.f96514a.N();
    }

    @Override // wn.e
    public int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // wn.e
    public int j() {
        return 0;
    }

    @Override // wn.e
    public boolean k(float f11) {
        return f11 < 0.0f;
    }

    @Override // wn.e
    public boolean l(@NonNull View view) {
        return view.getLeft() > (e() + d()) / 2;
    }

    @Override // wn.e
    public boolean m(float f11, float f12) {
        return h.a(f11, f12) && Math.abs(f11) > ((float) this.f96514a.S());
    }

    @Override // wn.e
    public boolean n(@NonNull View view, float f11) {
        return Math.abs(((float) view.getRight()) + (f11 * this.f96514a.L())) > this.f96514a.M();
    }

    @Override // wn.e
    public void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.rightMargin = i11;
    }

    @Override // wn.e
    public void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12) {
        int R = this.f96514a.R();
        if (i11 <= R) {
            marginLayoutParams.rightMargin = R - i11;
        }
    }
}
