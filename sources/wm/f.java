package wm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    public g f96502a;

    /* renamed from: b, reason: collision with root package name */
    public int f96503b;

    /* renamed from: c, reason: collision with root package name */
    public int f96504c;

    public f() {
        this.f96503b = 0;
        this.f96504c = 0;
    }

    public int h() {
        g gVar = this.f96502a;
        if (gVar != null) {
            return gVar.d();
        }
        return 0;
    }

    public int i() {
        g gVar = this.f96502a;
        if (gVar != null) {
            return gVar.e();
        }
        return 0;
    }

    public boolean j() {
        g gVar = this.f96502a;
        return gVar != null && gVar.f();
    }

    public boolean k() {
        g gVar = this.f96502a;
        return gVar != null && gVar.g();
    }

    public void l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        coordinatorLayout.onLayoutChild(v11, i11);
    }

    public void m(boolean z11) {
        g gVar = this.f96502a;
        if (gVar != null) {
            gVar.i(z11);
        }
    }

    public boolean n(int i11) {
        g gVar = this.f96502a;
        if (gVar != null) {
            return gVar.j(i11);
        }
        this.f96504c = i11;
        return false;
    }

    public boolean o(int i11) {
        g gVar = this.f96502a;
        if (gVar != null) {
            return gVar.k(i11);
        }
        this.f96503b = i11;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        l(coordinatorLayout, v11, i11);
        if (this.f96502a == null) {
            this.f96502a = new g(v11);
        }
        this.f96502a.h();
        this.f96502a.a();
        int i12 = this.f96503b;
        if (i12 != 0) {
            this.f96502a.k(i12);
            this.f96503b = 0;
        }
        int i13 = this.f96504c;
        if (i13 == 0) {
            return true;
        }
        this.f96502a.j(i13);
        this.f96504c = 0;
        return true;
    }

    public void p(boolean z11) {
        g gVar = this.f96502a;
        if (gVar != null) {
            gVar.l(z11);
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f96503b = 0;
        this.f96504c = 0;
    }
}
