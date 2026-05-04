package wn;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f96513a;

    public a(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f96513a = sideSheetBehavior;
    }

    @Override // wn.e
    public int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // wn.e
    public float b(int i11) {
        float e11 = e();
        return (i11 - e11) / (d() - e11);
    }

    @Override // wn.e
    public int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // wn.e
    public int d() {
        return Math.max(0, this.f96513a.Q() + this.f96513a.N());
    }

    @Override // wn.e
    public int e() {
        return (-this.f96513a.G()) - this.f96513a.N();
    }

    @Override // wn.e
    public int f() {
        return this.f96513a.N();
    }

    @Override // wn.e
    public int g() {
        return -this.f96513a.G();
    }

    @Override // wn.e
    public <V extends View> int h(@NonNull V v11) {
        return v11.getRight() + this.f96513a.N();
    }

    @Override // wn.e
    public int i(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // wn.e
    public int j() {
        return 1;
    }

    @Override // wn.e
    public boolean k(float f11) {
        return f11 > 0.0f;
    }

    @Override // wn.e
    public boolean l(@NonNull View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // wn.e
    public boolean m(float f11, float f12) {
        return h.a(f11, f12) && Math.abs(f11) > ((float) this.f96513a.S());
    }

    @Override // wn.e
    public boolean n(@NonNull View view, float f11) {
        return Math.abs(((float) view.getLeft()) + (f11 * this.f96513a.L())) > this.f96513a.M();
    }

    @Override // wn.e
    public void o(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.leftMargin = i11;
    }

    @Override // wn.e
    public void p(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12) {
        if (i11 <= this.f96513a.R()) {
            marginLayoutParams.leftMargin = i12;
        }
    }
}
