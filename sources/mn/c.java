package mn;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f73481a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f73482b = false;

    /* renamed from: c, reason: collision with root package name */
    @IdRes
    public int f73483c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public c(b bVar) {
        this.f73481a = (View) bVar;
    }

    public final void a() {
        ViewParent parent = this.f73481a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(this.f73481a);
        }
    }

    @IdRes
    public int b() {
        return this.f73483c;
    }

    public boolean c() {
        return this.f73482b;
    }

    public void d(@NonNull Bundle bundle) {
        this.f73482b = bundle.getBoolean("expanded", false);
        this.f73483c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f73482b) {
            a();
        }
    }

    @NonNull
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f73482b);
        bundle.putInt("expandedComponentIdHint", this.f73483c);
        return bundle;
    }

    public boolean f(boolean z11) {
        if (this.f73482b == z11) {
            return false;
        }
        this.f73482b = z11;
        a();
        return true;
    }

    public void g(@IdRes int i11) {
        this.f73483c = i11;
    }
}
