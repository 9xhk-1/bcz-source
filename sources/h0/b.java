package h0;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import coil.size.Scale;
import f0.g;
import g10.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCrossfadeDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadeDrawable.kt\ncoil/drawable/CrossfadeDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n+ 4 Collections.kt\ncoil/util/-Collections\n*L\n1#1,277:1\n1#2:278\n30#3,7:279\n30#3,7:286\n30#3,7:293\n30#3,7:300\n12#4,4:307\n12#4,4:311\n*S KotlinDebug\n*F\n+ 1 CrossfadeDrawable.kt\ncoil/drawable/CrossfadeDrawable\n*L\n71#1:279,7\n79#1:286,7\n93#1:293,7\n100#1:300,7\n211#1:307,4\n266#1:311,4\n*E\n"})
/* loaded from: classes3.dex */
public final class b extends Drawable implements Drawable.Callback, Animatable2Compat {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f57840m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f57841n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f57842o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f57843p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f57844q = 100;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Scale f57845a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57846b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f57847c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f57848d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Animatable2Compat.AnimationCallback> f57849e;

    /* renamed from: f, reason: collision with root package name */
    public final int f57850f;

    /* renamed from: g, reason: collision with root package name */
    public final int f57851g;

    /* renamed from: h, reason: collision with root package name */
    public long f57852h;

    /* renamed from: i, reason: collision with root package name */
    public int f57853i;

    /* renamed from: j, reason: collision with root package name */
    public int f57854j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public Drawable f57855k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Drawable f57856l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    @w00.k
    public b(@l Drawable drawable, @l Drawable drawable2) {
        this(drawable, drawable2, null, 0, false, false, 60, null);
    }

    public final int a(Integer num, Integer num2) {
        if (this.f57848d || ((num == null || num.intValue() != -1) && (num2 == null || num2.intValue() != -1))) {
            return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        }
        return -1;
    }

    public final int b() {
        return this.f57846b;
    }

    @l
    public final Drawable c() {
        return this.f57856l;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        this.f57849e.clear();
    }

    public final boolean d() {
        return this.f57847c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@k Canvas canvas) {
        int save;
        Drawable drawable;
        int i11 = this.f57854j;
        if (i11 == 0) {
            Drawable drawable2 = this.f57855k;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f57853i);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        if (i11 == 2) {
            Drawable drawable3 = this.f57856l;
            if (drawable3 != null) {
                drawable3.setAlpha(this.f57853i);
                save = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double uptimeMillis = (SystemClock.uptimeMillis() - this.f57852h) / this.f57846b;
        double G = u.G(uptimeMillis, 0.0d, 1.0d);
        int i12 = this.f57853i;
        int i13 = (int) (G * i12);
        if (this.f57847c) {
            i12 -= i13;
        }
        boolean z11 = uptimeMillis >= 1.0d;
        if (!z11 && (drawable = this.f57855k) != null) {
            drawable.setAlpha(i12);
            save = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        Drawable drawable4 = this.f57856l;
        if (drawable4 != null) {
            drawable4.setAlpha(i13);
            save = canvas.save();
            try {
                drawable4.draw(canvas);
            } finally {
            }
        }
        if (z11) {
            h();
        } else {
            invalidateSelf();
        }
    }

    public final boolean e() {
        return this.f57848d;
    }

    @k
    public final Scale f() {
        return this.f57845a;
    }

    @l
    public final Drawable g() {
        return this.f57855k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f57853i;
    }

    @Override // android.graphics.drawable.Drawable
    @l
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i11 = this.f57854j;
        if (i11 == 0) {
            Drawable drawable2 = this.f57855k;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (i11 != 1) {
            if (i11 == 2 && (drawable = this.f57856l) != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable3 = this.f57856l;
        if (drawable3 != null && (colorFilter = drawable3.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable4 = this.f57855k;
        if (drawable4 != null) {
            return drawable4.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f57851g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f57850f;
    }

    @Override // android.graphics.drawable.Drawable
    @n(message = "Deprecated in Java")
    public int getOpacity() {
        Drawable drawable = this.f57855k;
        Drawable drawable2 = this.f57856l;
        int i11 = this.f57854j;
        if (i11 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        if (i11 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    public final void h() {
        this.f57854j = 2;
        this.f57855k = null;
        List<Animatable2Compat.AnimationCallback> list = this.f57849e;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).onAnimationEnd(this);
        }
    }

    @VisibleForTesting
    public final void i(@k Drawable drawable, @k Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double c11 = g.c(intrinsicWidth, intrinsicHeight, width, height, this.f57845a);
        double d11 = 2;
        int K0 = c10.d.K0((width - (intrinsicWidth * c11)) / d11);
        int K02 = c10.d.K0((height - (c11 * intrinsicHeight)) / d11);
        drawable.setBounds(rect.left + K0, rect.top + K02, rect.right - K0, rect.bottom - K02);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@k Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f57854j == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@k Rect rect) {
        Drawable drawable = this.f57855k;
        if (drawable != null) {
            i(drawable, rect);
        }
        Drawable drawable2 = this.f57856l;
        if (drawable2 != null) {
            i(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i11) {
        Drawable drawable = this.f57855k;
        boolean level = drawable != null ? drawable.setLevel(i11) : false;
        Drawable drawable2 = this.f57856l;
        return level || (drawable2 != null ? drawable2.setLevel(i11) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@k int[] iArr) {
        Drawable drawable = this.f57855k;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f57856l;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@k Animatable2Compat.AnimationCallback animationCallback) {
        this.f57849e.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@k Drawable drawable, @k Runnable runnable, long j11) {
        scheduleSelf(runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 >= 0 && i11 < 256) {
            this.f57853i = i11;
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + i11).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@l ColorFilter colorFilter) {
        Drawable drawable = this.f57855k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f57856l;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i11) {
        Drawable drawable = this.f57855k;
        if (drawable != null) {
            drawable.setTint(i11);
        }
        Drawable drawable2 = this.f57856l;
        if (drawable2 != null) {
            drawable2.setTint(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(29)
    public void setTintBlendMode(@l BlendMode blendMode) {
        Drawable drawable = this.f57855k;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f57856l;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@l ColorStateList colorStateList) {
        Drawable drawable = this.f57855k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f57856l;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@l PorterDuff.Mode mode) {
        Drawable drawable = this.f57855k;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f57856l;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.f57855k;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f57856l;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f57854j != 0) {
            return;
        }
        this.f57854j = 1;
        this.f57852h = SystemClock.uptimeMillis();
        List<Animatable2Compat.AnimationCallback> list = this.f57849e;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.f57855k;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f57856l;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f57854j != 2) {
            h();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@k Animatable2Compat.AnimationCallback animationCallback) {
        return this.f57849e.remove(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@k Drawable drawable, @k Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @w00.k
    public b(@l Drawable drawable, @l Drawable drawable2, @k Scale scale) {
        this(drawable, drawable2, scale, 0, false, false, 56, null);
    }

    @w00.k
    public b(@l Drawable drawable, @l Drawable drawable2, @k Scale scale, int i11) {
        this(drawable, drawable2, scale, i11, false, false, 48, null);
    }

    @w00.k
    public b(@l Drawable drawable, @l Drawable drawable2, @k Scale scale, int i11, boolean z11) {
        this(drawable, drawable2, scale, i11, z11, false, 32, null);
    }

    public /* synthetic */ b(Drawable drawable, Drawable drawable2, Scale scale, int i11, boolean z11, boolean z12, int i12, v vVar) {
        this(drawable, drawable2, (i12 & 4) != 0 ? Scale.FIT : scale, (i12 & 8) != 0 ? 100 : i11, (i12 & 16) != 0 ? true : z11, (i12 & 32) != 0 ? false : z12);
    }

    @w00.k
    public b(@l Drawable drawable, @l Drawable drawable2, @k Scale scale, int i11, boolean z11, boolean z12) {
        this.f57845a = scale;
        this.f57846b = i11;
        this.f57847c = z11;
        this.f57848d = z12;
        this.f57849e = new ArrayList();
        this.f57850f = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f57851g = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f57853i = 255;
        this.f57855k = drawable != null ? drawable.mutate() : null;
        Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
        this.f57856l = mutate;
        if (i11 > 0) {
            Drawable drawable3 = this.f57855k;
            if (drawable3 != null) {
                drawable3.setCallback(this);
            }
            if (mutate == null) {
                return;
            }
            mutate.setCallback(this);
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.");
    }
}
