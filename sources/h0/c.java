package h0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import coil.size.Scale;
import coil.transform.PixelOpacity;
import f0.g;
import g10.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMovieDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MovieDrawable.kt\ncoil/drawable/MovieDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n+ 4 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 5 Utils.kt\ncoil/util/-GifUtils\n*L\n1#1,288:1\n1#2:289\n30#3,7:290\n30#3,7:297\n30#3,7:304\n95#4:311\n50#5,4:312\n50#5,4:316\n*S KotlinDebug\n*F\n+ 1 MovieDrawable.kt\ncoil/drawable/MovieDrawable\n*L\n78#1:290,7\n130#1:297,7\n137#1:304,7\n229#1:311\n260#1:312,4\n268#1:316,4\n*E\n"})
/* loaded from: classes3.dex */
public final class c extends Drawable implements Animatable2Compat {

    /* renamed from: w, reason: collision with root package name */
    @k
    public static final a f57857w = new a(null);

    /* renamed from: x, reason: collision with root package name */
    public static final int f57858x = -1;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Movie f57859a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Bitmap.Config f57860b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Scale f57861c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Paint f57862d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Animatable2Compat.AnimationCallback> f57863e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Rect f57864f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Rect f57865g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Canvas f57866h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public Bitmap f57867i;

    /* renamed from: j, reason: collision with root package name */
    public float f57868j;

    /* renamed from: k, reason: collision with root package name */
    public float f57869k;

    /* renamed from: l, reason: collision with root package name */
    public float f57870l;

    /* renamed from: m, reason: collision with root package name */
    public float f57871m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f57872n;

    /* renamed from: o, reason: collision with root package name */
    public long f57873o;

    /* renamed from: p, reason: collision with root package name */
    public long f57874p;

    /* renamed from: q, reason: collision with root package name */
    public int f57875q;

    /* renamed from: r, reason: collision with root package name */
    public int f57876r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public s0.a f57877s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public Picture f57878t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public PixelOpacity f57879u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f57880v;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    @w00.k
    public c(@k Movie movie) {
        this(movie, null, null, 6, null);
    }

    public final void a(Canvas canvas) {
        Canvas canvas2 = this.f57866h;
        Bitmap bitmap = this.f57867i;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int save = canvas2.save();
        try {
            float f11 = this.f57868j;
            canvas2.scale(f11, f11);
            this.f57859a.draw(canvas2, 0.0f, 0.0f, this.f57862d);
            Picture picture = this.f57878t;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(save);
            int save2 = canvas.save();
            try {
                canvas.translate(this.f57870l, this.f57871m);
                float f12 = this.f57869k;
                canvas.scale(f12, f12);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f57862d);
            } finally {
                canvas.restoreToCount(save2);
            }
        } catch (Throwable th2) {
            canvas2.restoreToCount(save);
            throw th2;
        }
    }

    @l
    public final s0.a b() {
        return this.f57877s;
    }

    public final Rect c(Canvas canvas) {
        Rect rect = this.f57865g;
        rect.set(0, 0, canvas.getWidth(), canvas.getHeight());
        return rect;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        this.f57863e.clear();
    }

    @k
    public final Bitmap.Config d() {
        return this.f57860b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@k Canvas canvas) {
        boolean j11 = j();
        if (this.f57880v) {
            i(c(canvas));
            int save = canvas.save();
            try {
                float f11 = 1 / this.f57868j;
                canvas.scale(f11, f11);
                a(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            i(getBounds());
            a(canvas);
        }
        if (this.f57872n && j11) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    public final int e() {
        return this.f57875q;
    }

    @k
    public final Scale f() {
        return this.f57861c;
    }

    public final void g(@l s0.a aVar) {
        this.f57877s = aVar;
        if (aVar == null || this.f57859a.width() <= 0 || this.f57859a.height() <= 0) {
            this.f57878t = null;
            this.f57879u = PixelOpacity.UNCHANGED;
            this.f57880v = false;
        } else {
            Picture picture = new Picture();
            this.f57879u = aVar.a(picture.beginRecording(this.f57859a.width(), this.f57859a.height()));
            picture.endRecording();
            this.f57878t = picture;
            this.f57880v = true;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f57859a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f57859a.width();
    }

    @Override // android.graphics.drawable.Drawable
    @n(message = "Deprecated in Java")
    public int getOpacity() {
        if (this.f57862d.getAlpha() != 255) {
            return -3;
        }
        PixelOpacity pixelOpacity = this.f57879u;
        if (pixelOpacity != PixelOpacity.OPAQUE) {
            return (pixelOpacity == PixelOpacity.UNCHANGED && this.f57859a.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    public final void h(int i11) {
        if (i11 >= -1) {
            this.f57875q = i11;
            return;
        }
        throw new IllegalArgumentException(("Invalid repeatCount: " + i11).toString());
    }

    public final void i(Rect rect) {
        if (g0.g(this.f57864f, rect)) {
            return;
        }
        this.f57864f.set(rect);
        int width = rect.width();
        int height = rect.height();
        int width2 = this.f57859a.width();
        int height2 = this.f57859a.height();
        if (width2 <= 0 || height2 <= 0) {
            return;
        }
        double c11 = g.c(width2, height2, width, height, this.f57861c);
        if (!this.f57880v) {
            c11 = u.z(c11, 1.0d);
        }
        float f11 = (float) c11;
        this.f57868j = f11;
        int i11 = (int) (width2 * f11);
        int i12 = (int) (f11 * height2);
        Bitmap createBitmap = Bitmap.createBitmap(i11, i12, this.f57860b);
        Bitmap bitmap = this.f57867i;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f57867i = createBitmap;
        this.f57866h = new Canvas(createBitmap);
        if (this.f57880v) {
            this.f57869k = 1.0f;
            this.f57870l = 0.0f;
            this.f57871m = 0.0f;
        } else {
            float c12 = (float) g.c(i11, i12, width, height, this.f57861c);
            this.f57869k = c12;
            float f12 = width - (i11 * c12);
            float f13 = 2;
            this.f57870l = rect.left + (f12 / f13);
            this.f57871m = rect.top + ((height - (c12 * i12)) / f13);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f57872n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j() {
        boolean z11;
        int duration = this.f57859a.duration();
        if (duration == 0) {
            z11 = 0;
        } else {
            if (this.f57872n) {
                this.f57874p = SystemClock.uptimeMillis();
            }
            int i11 = (int) (this.f57874p - this.f57873o);
            int i12 = i11 / duration;
            this.f57876r = i12;
            int i13 = this.f57875q;
            r1 = (i13 == -1 || i12 <= i13) ? 1 : 0;
            if (r1 != 0) {
                duration = i11 - (i12 * duration);
            }
            int i14 = r1;
            r1 = duration;
            z11 = i14;
        }
        this.f57859a.setTime(r1);
        return z11;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@k Animatable2Compat.AnimationCallback animationCallback) {
        this.f57863e.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 >= 0 && i11 < 256) {
            this.f57862d.setAlpha(i11);
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + i11).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@l ColorFilter colorFilter) {
        this.f57862d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f57872n) {
            return;
        }
        this.f57872n = true;
        this.f57876r = 0;
        this.f57873o = SystemClock.uptimeMillis();
        List<Animatable2Compat.AnimationCallback> list = this.f57863e;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f57872n) {
            this.f57872n = false;
            List<Animatable2Compat.AnimationCallback> list = this.f57863e;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).onAnimationEnd(this);
            }
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@k Animatable2Compat.AnimationCallback animationCallback) {
        return this.f57863e.remove(animationCallback);
    }

    @w00.k
    public c(@k Movie movie, @k Bitmap.Config config) {
        this(movie, config, null, 4, null);
    }

    public /* synthetic */ c(Movie movie, Bitmap.Config config, Scale scale, int i11, v vVar) {
        this(movie, (i11 & 2) != 0 ? Bitmap.Config.ARGB_8888 : config, (i11 & 4) != 0 ? Scale.FIT : scale);
    }

    @w00.k
    public c(@k Movie movie, @k Bitmap.Config config, @k Scale scale) {
        this.f57859a = movie;
        this.f57860b = config;
        this.f57861c = scale;
        this.f57862d = new Paint(3);
        this.f57863e = new ArrayList();
        this.f57864f = new Rect();
        this.f57865g = new Rect();
        this.f57868j = 1.0f;
        this.f57869k = 1.0f;
        this.f57875q = -1;
        this.f57879u = PixelOpacity.UNCHANGED;
        if (u0.g.i(config)) {
            throw new IllegalArgumentException("Bitmap config must not be hardware.");
        }
    }
}
