package com.igexin.push.core.i.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.igexin.push.core.i.a.h;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public class e extends Drawable implements Animatable, h.b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38199a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f38200b = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f38201f = 119;

    /* renamed from: c, reason: collision with root package name */
    public final a f38202c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38203d;

    /* renamed from: e, reason: collision with root package name */
    boolean f38204e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f38205g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f38206h;

    /* renamed from: i, reason: collision with root package name */
    private int f38207i;

    /* renamed from: j, reason: collision with root package name */
    private int f38208j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f38209k;

    /* renamed from: l, reason: collision with root package name */
    private Paint f38210l;

    /* renamed from: m, reason: collision with root package name */
    private Rect f38211m;

    public static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final h f38212a;

        public a(h hVar) {
            this.f38212a = hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new e(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public e(d dVar, Bitmap bitmap) {
        this(new a(new h(dVar, bitmap)));
    }

    private int c() {
        h hVar = this.f38202c.f38212a;
        return hVar.f38228a.m() + hVar.f38237j;
    }

    private ByteBuffer d() {
        return this.f38202c.f38212a.f38228a.c().asReadOnlyBuffer();
    }

    private int e() {
        return this.f38202c.f38212a.a();
    }

    private int f() {
        h.a aVar = this.f38202c.f38212a.f38232e;
        if (aVar != null) {
            return aVar.f38243a;
        }
        return -1;
    }

    private void g() {
        this.f38207i = 0;
    }

    private void h() {
        k.a(!this.f38203d, "You cannot restart a currently running animation.");
        h hVar = this.f38202c.f38212a;
        k.a(!hVar.f38230c, "Can't restart a running animation");
        hVar.f38231d = true;
        if (hVar.f38236i != null) {
            hVar.f38236i = null;
        }
        start();
    }

    private void i() {
        k.a(!this.f38204e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f38202c.f38212a.a() == 1) {
            invalidateSelf();
        } else {
            if (this.f38203d) {
                return;
            }
            this.f38203d = true;
            this.f38202c.f38212a.a(this);
            invalidateSelf();
        }
    }

    private void j() {
        this.f38203d = false;
        this.f38202c.f38212a.b(this);
    }

    private Rect k() {
        if (this.f38211m == null) {
            this.f38211m = new Rect();
        }
        return this.f38211m;
    }

    private Paint l() {
        if (this.f38210l == null) {
            this.f38210l = new Paint(2);
        }
        return this.f38210l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback m() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private void n() {
        this.f38204e = true;
        h hVar = this.f38202c.f38212a;
        hVar.f38229b.clear();
        hVar.b();
        hVar.f38230c = false;
        if (hVar.f38232e != null) {
            hVar.f38232e = null;
        }
        if (hVar.f38234g != null) {
            hVar.f38234g = null;
        }
        if (hVar.f38236i != null) {
            hVar.f38236i = null;
        }
        hVar.f38228a.o();
        hVar.f38233f = true;
    }

    private boolean o() {
        return this.f38204e;
    }

    public final Bitmap a() {
        return this.f38202c.f38212a.f38235h;
    }

    @Override // com.igexin.push.core.i.a.h.b
    public final void b() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        h.a aVar = this.f38202c.f38212a.f38232e;
        if ((aVar != null ? aVar.f38243a : -1) == r0.a() - 1) {
            this.f38207i++;
        }
        int i11 = this.f38208j;
        if (i11 == -1 || this.f38207i < i11) {
            return;
        }
        stop();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f38204e) {
            return;
        }
        if (this.f38209k) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), k());
            this.f38209k = false;
        }
        h hVar = this.f38202c.f38212a;
        h.a aVar = hVar.f38232e;
        canvas.drawBitmap(aVar != null ? aVar.f38244b : hVar.f38235h, (Rect) null, k(), l());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f38202c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f38202c.f38212a.f38239l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f38202c.f38212a.f38238k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f38203d;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f38209k = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        l().setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        l().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        if (this.f38204e) {
            com.igexin.c.a.c.a.b("GifBitmapProvider", "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
            return super.setVisible(z11, z12);
        }
        this.f38206h = z11;
        if (!z11) {
            com.igexin.c.a.c.a.b("GifBitmapProvider", "invisible  stopRunning");
            j();
        } else if (this.f38205g) {
            i();
        }
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f38205g = true;
        this.f38207i = 0;
        if (this.f38206h) {
            i();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f38205g = false;
        j();
    }

    public e(a aVar) {
        this.f38206h = true;
        this.f38208j = -1;
        this.f38202c = (a) k.a(aVar);
    }

    private void a(int i11) {
        if (i11 <= 0 && i11 != -1 && i11 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i11 != 0) {
            this.f38208j = i11;
        } else {
            int l11 = this.f38202c.f38212a.f38228a.l();
            this.f38208j = l11 != 0 ? l11 : -1;
        }
    }

    private void a(boolean z11) {
        this.f38203d = z11;
    }
}
