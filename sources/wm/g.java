package wm;

import android.view.View;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final View f96505a;

    /* renamed from: b, reason: collision with root package name */
    public int f96506b;

    /* renamed from: c, reason: collision with root package name */
    public int f96507c;

    /* renamed from: d, reason: collision with root package name */
    public int f96508d;

    /* renamed from: e, reason: collision with root package name */
    public int f96509e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96510f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f96511g = true;

    public g(View view) {
        this.f96505a = view;
    }

    public void a() {
        View view = this.f96505a;
        ViewCompat.offsetTopAndBottom(view, this.f96508d - (view.getTop() - this.f96506b));
        View view2 = this.f96505a;
        ViewCompat.offsetLeftAndRight(view2, this.f96509e - (view2.getLeft() - this.f96507c));
    }

    public int b() {
        return this.f96507c;
    }

    public int c() {
        return this.f96506b;
    }

    public int d() {
        return this.f96509e;
    }

    public int e() {
        return this.f96508d;
    }

    public boolean f() {
        return this.f96511g;
    }

    public boolean g() {
        return this.f96510f;
    }

    public void h() {
        this.f96506b = this.f96505a.getTop();
        this.f96507c = this.f96505a.getLeft();
    }

    public void i(boolean z11) {
        this.f96511g = z11;
    }

    public boolean j(int i11) {
        if (!this.f96511g || this.f96509e == i11) {
            return false;
        }
        this.f96509e = i11;
        a();
        return true;
    }

    public boolean k(int i11) {
        if (!this.f96510f || this.f96508d == i11) {
            return false;
        }
        this.f96508d = i11;
        a();
        return true;
    }

    public void l(boolean z11) {
        this.f96510f = z11;
    }
}
