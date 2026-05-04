package wk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import fl.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import wk.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c extends Drawable implements g.b, Animatable, Animatable2Compat {

    /* renamed from: l, reason: collision with root package name */
    public static final int f96425l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f96426m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f96427n = 119;

    /* renamed from: a, reason: collision with root package name */
    public final a f96428a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f96429b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f96430c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f96431d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f96432e;

    /* renamed from: f, reason: collision with root package name */
    public int f96433f;

    /* renamed from: g, reason: collision with root package name */
    public int f96434g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f96435h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f96436i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f96437j;

    /* renamed from: k, reason: collision with root package name */
    public List<Animatable2Compat.AnimationCallback> f96438k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @VisibleForTesting
        public final g f96439a;

        public a(g gVar) {
            this.f96439a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    @Deprecated
    public c(Context context, hk.a aVar, lk.e eVar, ik.h<Bitmap> hVar, int i11, int i12, Bitmap bitmap) {
        this(context, aVar, hVar, i11, i12, bitmap);
    }

    @Override // wk.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f96433f++;
        }
        int i11 = this.f96434g;
        if (i11 == -1 || this.f96433f < i11) {
            return;
        }
        stop();
        l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    public ByteBuffer c() {
        return this.f96428a.f96439a.b();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List<Animatable2Compat.AnimationCallback> list = this.f96438k;
        if (list != null) {
            list.clear();
        }
    }

    public final Rect d() {
        if (this.f96437j == null) {
            this.f96437j = new Rect();
        }
        return this.f96437j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f96431d) {
            return;
        }
        if (this.f96435h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f96435h = false;
        }
        canvas.drawBitmap(this.f96428a.f96439a.c(), (Rect) null, d(), i());
    }

    public Bitmap e() {
        return this.f96428a.f96439a.e();
    }

    public int f() {
        return this.f96428a.f96439a.f();
    }

    public int g() {
        return this.f96428a.f96439a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f96428a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f96428a.f96439a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f96428a.f96439a.m();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public ik.h<Bitmap> h() {
        return this.f96428a.f96439a.h();
    }

    public final Paint i() {
        if (this.f96436i == null) {
            this.f96436i = new Paint(2);
        }
        return this.f96436i;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f96429b;
    }

    public int j() {
        return this.f96428a.f96439a.l();
    }

    public boolean k() {
        return this.f96431d;
    }

    public final void l() {
        List<Animatable2Compat.AnimationCallback> list = this.f96438k;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f96438k.get(i11).onAnimationEnd(this);
            }
        }
    }

    public void m() {
        this.f96431d = true;
        this.f96428a.f96439a.a();
    }

    public final void n() {
        this.f96433f = 0;
    }

    public void o(ik.h<Bitmap> hVar, Bitmap bitmap) {
        this.f96428a.f96439a.q(hVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f96435h = true;
    }

    public void p(boolean z11) {
        this.f96429b = z11;
    }

    public void q(int i11) {
        if (i11 <= 0 && i11 != -1 && i11 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i11 != 0) {
            this.f96434g = i11;
        } else {
            int j11 = this.f96428a.f96439a.j();
            this.f96434g = j11 != 0 ? j11 : -1;
        }
    }

    public void r() {
        m.b(!this.f96429b, "You cannot restart a currently running animation.");
        this.f96428a.f96439a.r();
        start();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.f96438k == null) {
            this.f96438k = new ArrayList();
        }
        this.f96438k.add(animationCallback);
    }

    public final void s() {
        m.b(!this.f96431d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f96428a.f96439a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f96429b) {
                return;
            }
            this.f96429b = true;
            this.f96428a.f96439a.v(this);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        i().setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        i().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        m.b(!this.f96431d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f96432e = z11;
        if (!z11) {
            t();
        } else if (this.f96430c) {
            s();
        }
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f96430c = true;
        n();
        if (this.f96432e) {
            s();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f96430c = false;
        t();
    }

    public final void t() {
        this.f96429b = false;
        this.f96428a.f96439a.w(this);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.f96438k;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    public c(Context context, hk.a aVar, ik.h<Bitmap> hVar, int i11, int i12, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.c.e(context), aVar, i11, i12, hVar, bitmap)));
    }

    public c(a aVar) {
        this.f96432e = true;
        this.f96434g = -1;
        this.f96428a = (a) m.e(aVar);
    }

    @VisibleForTesting
    public c(g gVar, Paint paint) {
        this(new a(gVar));
        this.f96436i = paint;
    }
}
