package rn;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.material.R;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import rn.b;
import rn.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class i<S extends b> extends f {

    /* renamed from: r, reason: collision with root package name */
    public g<S> f84392r;

    /* renamed from: s, reason: collision with root package name */
    public h<ObjectAnimator> f84393s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f84394t;

    public i(@NonNull Context context, @NonNull b bVar, @NonNull g<S> gVar, @NonNull h<ObjectAnimator> hVar) {
        super(context, bVar);
        E(gVar);
        D(hVar);
    }

    @NonNull
    public static i<CircularProgressIndicatorSpec> v(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return w(context, circularProgressIndicatorSpec, new c(circularProgressIndicatorSpec));
    }

    @NonNull
    public static i<CircularProgressIndicatorSpec> w(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec, @NonNull c cVar) {
        i<CircularProgressIndicatorSpec> iVar = new i<>(context, circularProgressIndicatorSpec, cVar, new d(circularProgressIndicatorSpec));
        iVar.F(VectorDrawableCompat.create(context.getResources(), R.drawable.indeterminate_static, null));
        return iVar;
    }

    @NonNull
    public static i<LinearProgressIndicatorSpec> x(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return y(context, linearProgressIndicatorSpec, new j(linearProgressIndicatorSpec));
    }

    @NonNull
    public static i<LinearProgressIndicatorSpec> y(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec, @NonNull j jVar) {
        return new i<>(context, linearProgressIndicatorSpec, jVar, linearProgressIndicatorSpec.f31874h == 0 ? new k(linearProgressIndicatorSpec) : new l(context, linearProgressIndicatorSpec));
    }

    @NonNull
    public g<S> A() {
        return this.f84392r;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Drawable B() {
        return this.f84394t;
    }

    public final boolean C() {
        a aVar = this.f84371c;
        return aVar != null && aVar.a(this.f84369a.getContentResolver()) == 0.0f;
    }

    public void D(@NonNull h<ObjectAnimator> hVar) {
        this.f84393s = hVar;
        hVar.e(this);
    }

    public void E(@NonNull g<S> gVar) {
        this.f84392r = gVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void F(@Nullable Drawable drawable) {
        this.f84394t = drawable;
    }

    @Override // rn.f, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i11;
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (C() && (drawable = this.f84394t) != null) {
                drawable.setBounds(getBounds());
                DrawableCompat.setTint(this.f84394t, this.f84370b.f84322c[0]);
                this.f84394t.draw(canvas);
                return;
            }
            canvas.save();
            this.f84392r.g(canvas, getBounds(), h(), l(), k());
            int i12 = this.f84370b.f84326g;
            int alpha = getAlpha();
            if (i12 == 0) {
                this.f84392r.d(canvas, this.f84381m, 0.0f, 1.0f, this.f84370b.f84323d, alpha, 0);
                i11 = i12;
            } else {
                g.a aVar = this.f84393s.f84391b.get(0);
                g.a aVar2 = this.f84393s.f84391b.get(r1.size() - 1);
                g<S> gVar = this.f84392r;
                if (gVar instanceof j) {
                    i11 = i12;
                    gVar.d(canvas, this.f84381m, 0.0f, aVar.f84386a, this.f84370b.f84323d, alpha, i11);
                    this.f84392r.d(canvas, this.f84381m, aVar2.f84387b, 1.0f, this.f84370b.f84323d, alpha, i11);
                } else {
                    i11 = i12;
                    alpha = 0;
                    gVar.d(canvas, this.f84381m, aVar2.f84387b, 1.0f + aVar.f84386a, this.f84370b.f84323d, 0, i11);
                }
            }
            for (int i13 = 0; i13 < this.f84393s.f84391b.size(); i13++) {
                g.a aVar3 = this.f84393s.f84391b.get(i13);
                this.f84392r.c(canvas, this.f84381m, aVar3, getAlpha());
                if (i13 > 0 && i11 > 0) {
                    this.f84392r.d(canvas, this.f84381m, this.f84393s.f84391b.get(i13 - 1).f84387b, aVar3.f84386a, this.f84370b.f84323d, alpha, i11);
                }
            }
            canvas.restore();
        }
    }

    @Override // rn.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f84392r.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f84392r.f();
    }

    @Override // rn.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // rn.f, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // rn.f
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // rn.f
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // rn.f
    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // rn.f, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
    }

    @Override // rn.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(@IntRange(from = 0, to = 255) int i11) {
        super.setAlpha(i11);
    }

    @Override // rn.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // rn.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z11, boolean z12) {
        return super.setVisible(z11, z12);
    }

    @Override // rn.f, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // rn.f, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // rn.f
    public /* bridge */ /* synthetic */ boolean t(boolean z11, boolean z12, boolean z13) {
        return super.t(z11, z12, z13);
    }

    @Override // rn.f
    public boolean u(boolean z11, boolean z12, boolean z13) {
        Drawable drawable;
        boolean u11 = super.u(z11, z12, z13);
        if (C() && (drawable = this.f84394t) != null) {
            return drawable.setVisible(z11, z12);
        }
        if (!isRunning()) {
            this.f84393s.a();
        }
        if (z11) {
            if (!z13) {
                return u11;
            }
            this.f84393s.i();
        }
        return u11;
    }

    @Override // rn.f, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        return super.unregisterAnimationCallback(animationCallback);
    }

    @NonNull
    public h<ObjectAnimator> z() {
        return this.f84393s;
    }
}
