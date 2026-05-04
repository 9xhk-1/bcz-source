package r0;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a<T extends View> implements d<T>, t0.d, DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f82773a;

    @Override // r0.c
    public void a(@k Drawable drawable) {
        q(drawable);
    }

    @Override // r0.c
    public void b(@l Drawable drawable) {
        q(drawable);
    }

    @Override // r0.c
    public void g(@l Drawable drawable) {
        q(drawable);
    }

    @Override // t0.d
    @l
    public abstract Drawable h();

    public abstract void o(@l Drawable drawable);

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@k LifecycleOwner lifecycleOwner) {
        this.f82773a = true;
        p();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@k LifecycleOwner lifecycleOwner) {
        this.f82773a = false;
        p();
    }

    public final void p() {
        Object h11 = h();
        Animatable animatable = h11 instanceof Animatable ? (Animatable) h11 : null;
        if (animatable == null) {
            return;
        }
        if (this.f82773a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void q(@l Drawable drawable) {
        Object h11 = h();
        Animatable animatable = h11 instanceof Animatable ? (Animatable) h11 : null;
        if (animatable != null) {
            animatable.stop();
        }
        o(drawable);
        p();
    }
}
