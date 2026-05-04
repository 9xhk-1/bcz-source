package cl;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dl.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class j<Z> extends r<ImageView, Z> implements f.a {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public Animatable f8759j;

    public j(ImageView imageView) {
        super(imageView);
    }

    @Override // dl.f.a
    @Nullable
    public Drawable a() {
        return ((ImageView) this.f8775b).getDrawable();
    }

    @Override // dl.f.a
    public void b(Drawable drawable) {
        ((ImageView) this.f8775b).setImageDrawable(drawable);
    }

    @Override // cl.p
    public void h(@NonNull Z z11, @Nullable dl.f<? super Z> fVar) {
        if (fVar == null || !fVar.a(z11, this)) {
            v(z11);
        } else {
            t(z11);
        }
    }

    @Override // cl.r, cl.b, cl.p
    public void i(@Nullable Drawable drawable) {
        super.i(drawable);
        Animatable animatable = this.f8759j;
        if (animatable != null) {
            animatable.stop();
        }
        v(null);
        b(drawable);
    }

    @Override // cl.r, cl.b, cl.p
    public void l(@Nullable Drawable drawable) {
        super.l(drawable);
        v(null);
        b(drawable);
    }

    @Override // cl.b, cl.p
    public void m(@Nullable Drawable drawable) {
        super.m(drawable);
        v(null);
        b(drawable);
    }

    @Override // cl.b, yk.l
    public void onStart() {
        Animatable animatable = this.f8759j;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // cl.b, yk.l
    public void onStop() {
        Animatable animatable = this.f8759j;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void t(@Nullable Z z11) {
        if (!(z11 instanceof Animatable)) {
            this.f8759j = null;
            return;
        }
        Animatable animatable = (Animatable) z11;
        this.f8759j = animatable;
        animatable.start();
    }

    public abstract void u(@Nullable Z z11);

    public final void v(@Nullable Z z11) {
        u(z11);
        t(z11);
    }

    @Deprecated
    public j(ImageView imageView, boolean z11) {
        super(imageView, z11);
    }
}
