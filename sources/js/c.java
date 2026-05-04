package js;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import java.util.HashSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c extends Drawable {

    /* renamed from: u, reason: collision with root package name */
    public static final String f64628u = "RoundedDrawable";

    /* renamed from: v, reason: collision with root package name */
    public static final int f64629v = -16777216;

    /* renamed from: a, reason: collision with root package name */
    public final RectF f64630a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f64631b = new RectF();

    /* renamed from: c, reason: collision with root package name */
    public final RectF f64632c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f64633d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f64634e;

    /* renamed from: f, reason: collision with root package name */
    public final int f64635f;

    /* renamed from: g, reason: collision with root package name */
    public final int f64636g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f64637h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f64638i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f64639j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f64640k;

    /* renamed from: l, reason: collision with root package name */
    public Shader.TileMode f64641l;

    /* renamed from: m, reason: collision with root package name */
    public Shader.TileMode f64642m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f64643n;

    /* renamed from: o, reason: collision with root package name */
    public float f64644o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f64645p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f64646q;

    /* renamed from: r, reason: collision with root package name */
    public float f64647r;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f64648s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView.ScaleType f64649t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64650a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f64650a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64650a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64650a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64650a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64650a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64650a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64650a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public c(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f64632c = rectF;
        this.f64637h = new RectF();
        this.f64639j = new Matrix();
        this.f64640k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f64641l = tileMode;
        this.f64642m = tileMode;
        this.f64643n = true;
        this.f64644o = 0.0f;
        this.f64645p = new boolean[]{true, true, true, true};
        this.f64646q = false;
        this.f64647r = 0.0f;
        this.f64648s = ColorStateList.valueOf(-16777216);
        this.f64649t = ImageView.ScaleType.FIT_CENTER;
        this.f64633d = bitmap;
        int width = bitmap.getWidth();
        this.f64635f = width;
        int height = bitmap.getHeight();
        this.f64636g = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f64634e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f64638i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f64648s.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.f64647r);
    }

    public static boolean a(boolean[] zArr) {
        for (boolean z11 : zArr) {
            if (z11) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(boolean[] zArr) {
        for (boolean z11 : zArr) {
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public static Bitmap c(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e11) {
            e11.printStackTrace();
            Log.w(f64628u, "Failed to create bitmap from drawable!");
            return null;
        }
    }

    public static c d(Bitmap bitmap) {
        if (bitmap != null) {
            return new c(bitmap);
        }
        return null;
    }

    public static Drawable e(Drawable drawable) {
        if (drawable == null) {
            return drawable;
        }
        if (drawable instanceof c) {
            return drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            Bitmap c11 = c(drawable);
            return c11 != null ? new c(c11) : drawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i11 = 0; i11 < numberOfLayers; i11++) {
            layerDrawable.setDrawableByLayerId(layerDrawable.getId(i11), e(layerDrawable.getDrawable(i11)));
        }
        return layerDrawable;
    }

    public static boolean p(int i11, boolean[] zArr) {
        int length = zArr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                return true;
            }
            if (zArr[i12] != (i12 == i11)) {
                return false;
            }
            i12++;
        }
    }

    public c A(Shader.TileMode tileMode) {
        if (this.f64641l != tileMode) {
            this.f64641l = tileMode;
            this.f64643n = true;
            invalidateSelf();
        }
        return this;
    }

    public c B(Shader.TileMode tileMode) {
        if (this.f64642m != tileMode) {
            this.f64642m = tileMode;
            this.f64643n = true;
            invalidateSelf();
        }
        return this;
    }

    public Bitmap C() {
        return c(this);
    }

    public final void D() {
        float width;
        float height;
        int i11 = a.f64650a[this.f64649t.ordinal()];
        if (i11 == 1) {
            this.f64637h.set(this.f64630a);
            RectF rectF = this.f64637h;
            float f11 = this.f64647r;
            rectF.inset(f11 / 2.0f, f11 / 2.0f);
            this.f64639j.reset();
            this.f64639j.setTranslate((int) (((this.f64637h.width() - this.f64635f) * 0.5f) + 0.5f), (int) (((this.f64637h.height() - this.f64636g) * 0.5f) + 0.5f));
        } else if (i11 == 2) {
            this.f64637h.set(this.f64630a);
            RectF rectF2 = this.f64637h;
            float f12 = this.f64647r;
            rectF2.inset(f12 / 2.0f, f12 / 2.0f);
            this.f64639j.reset();
            float f13 = 0.0f;
            if (this.f64635f * this.f64637h.height() > this.f64637h.width() * this.f64636g) {
                width = this.f64637h.height() / this.f64636g;
                height = 0.0f;
                f13 = (this.f64637h.width() - (this.f64635f * width)) * 0.5f;
            } else {
                width = this.f64637h.width() / this.f64635f;
                height = (this.f64637h.height() - (this.f64636g * width)) * 0.5f;
            }
            this.f64639j.setScale(width, width);
            Matrix matrix = this.f64639j;
            float f14 = this.f64647r;
            matrix.postTranslate(((int) (f13 + 0.5f)) + (f14 / 2.0f), ((int) (height + 0.5f)) + (f14 / 2.0f));
        } else if (i11 == 3) {
            this.f64639j.reset();
            float min = (((float) this.f64635f) > this.f64630a.width() || ((float) this.f64636g) > this.f64630a.height()) ? Math.min(this.f64630a.width() / this.f64635f, this.f64630a.height() / this.f64636g) : 1.0f;
            float width2 = (int) (((this.f64630a.width() - (this.f64635f * min)) * 0.5f) + 0.5f);
            float height2 = (int) (((this.f64630a.height() - (this.f64636g * min)) * 0.5f) + 0.5f);
            this.f64639j.setScale(min, min);
            this.f64639j.postTranslate(width2, height2);
            this.f64637h.set(this.f64632c);
            this.f64639j.mapRect(this.f64637h);
            RectF rectF3 = this.f64637h;
            float f15 = this.f64647r;
            rectF3.inset(f15 / 2.0f, f15 / 2.0f);
            this.f64639j.setRectToRect(this.f64632c, this.f64637h, Matrix.ScaleToFit.FILL);
        } else if (i11 == 5) {
            this.f64637h.set(this.f64632c);
            this.f64639j.setRectToRect(this.f64632c, this.f64630a, Matrix.ScaleToFit.END);
            this.f64639j.mapRect(this.f64637h);
            RectF rectF4 = this.f64637h;
            float f16 = this.f64647r;
            rectF4.inset(f16 / 2.0f, f16 / 2.0f);
            this.f64639j.setRectToRect(this.f64632c, this.f64637h, Matrix.ScaleToFit.FILL);
        } else if (i11 == 6) {
            this.f64637h.set(this.f64632c);
            this.f64639j.setRectToRect(this.f64632c, this.f64630a, Matrix.ScaleToFit.START);
            this.f64639j.mapRect(this.f64637h);
            RectF rectF5 = this.f64637h;
            float f17 = this.f64647r;
            rectF5.inset(f17 / 2.0f, f17 / 2.0f);
            this.f64639j.setRectToRect(this.f64632c, this.f64637h, Matrix.ScaleToFit.FILL);
        } else if (i11 != 7) {
            this.f64637h.set(this.f64632c);
            this.f64639j.setRectToRect(this.f64632c, this.f64630a, Matrix.ScaleToFit.CENTER);
            this.f64639j.mapRect(this.f64637h);
            RectF rectF6 = this.f64637h;
            float f18 = this.f64647r;
            rectF6.inset(f18 / 2.0f, f18 / 2.0f);
            this.f64639j.setRectToRect(this.f64632c, this.f64637h, Matrix.ScaleToFit.FILL);
        } else {
            this.f64637h.set(this.f64630a);
            RectF rectF7 = this.f64637h;
            float f19 = this.f64647r;
            rectF7.inset(f19 / 2.0f, f19 / 2.0f);
            this.f64639j.reset();
            this.f64639j.setRectToRect(this.f64632c, this.f64637h, Matrix.ScaleToFit.FILL);
        }
        this.f64631b.set(this.f64637h);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f64643n) {
            BitmapShader bitmapShader = new BitmapShader(this.f64633d, this.f64641l, this.f64642m);
            Shader.TileMode tileMode = this.f64641l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f64642m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f64639j);
            }
            this.f64634e.setShader(bitmapShader);
            this.f64643n = false;
        }
        if (this.f64646q) {
            if (this.f64647r <= 0.0f) {
                canvas.drawOval(this.f64631b, this.f64634e);
                return;
            } else {
                canvas.drawOval(this.f64631b, this.f64634e);
                canvas.drawOval(this.f64637h, this.f64638i);
                return;
            }
        }
        if (!b(this.f64645p)) {
            canvas.drawRect(this.f64631b, this.f64634e);
            if (this.f64647r > 0.0f) {
                canvas.drawRect(this.f64637h, this.f64638i);
                return;
            }
            return;
        }
        float f11 = this.f64644o;
        if (this.f64647r <= 0.0f) {
            canvas.drawRoundRect(this.f64631b, f11, f11, this.f64634e);
            q(canvas);
        } else {
            canvas.drawRoundRect(this.f64631b, f11, f11, this.f64634e);
            canvas.drawRoundRect(this.f64637h, f11, f11, this.f64638i);
            q(canvas);
            r(canvas);
        }
    }

    public int f() {
        return this.f64648s.getDefaultColor();
    }

    public ColorStateList g() {
        return this.f64648s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f64634e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f64634e.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f64636g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f64635f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.f64647r;
    }

    public float i() {
        return this.f64644o;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f64648s.isStateful();
    }

    public float j(int i11) {
        if (this.f64645p[i11]) {
            return this.f64644o;
        }
        return 0.0f;
    }

    public ImageView.ScaleType k() {
        return this.f64649t;
    }

    public Bitmap l() {
        return this.f64633d;
    }

    public Shader.TileMode m() {
        return this.f64641l;
    }

    public Shader.TileMode n() {
        return this.f64642m;
    }

    public boolean o() {
        return this.f64646q;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f64630a.set(rect);
        D();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.f64648s.getColorForState(iArr, 0);
        if (this.f64638i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f64638i.setColor(colorForState);
        return true;
    }

    public final void q(Canvas canvas) {
        if (a(this.f64645p) || this.f64644o == 0.0f) {
            return;
        }
        RectF rectF = this.f64631b;
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width() + f11;
        float height = this.f64631b.height() + f12;
        float f13 = this.f64644o;
        if (!this.f64645p[0]) {
            this.f64640k.set(f11, f12, f11 + f13, f12 + f13);
            canvas.drawRect(this.f64640k, this.f64634e);
        }
        if (!this.f64645p[1]) {
            this.f64640k.set(width - f13, f12, width, f13);
            canvas.drawRect(this.f64640k, this.f64634e);
        }
        if (!this.f64645p[2]) {
            this.f64640k.set(width - f13, height - f13, width, height);
            canvas.drawRect(this.f64640k, this.f64634e);
        }
        if (this.f64645p[3]) {
            return;
        }
        this.f64640k.set(f11, height - f13, f13 + f11, height);
        canvas.drawRect(this.f64640k, this.f64634e);
    }

    public final void r(Canvas canvas) {
        float f11;
        float f12;
        if (a(this.f64645p) || this.f64644o == 0.0f) {
            return;
        }
        RectF rectF = this.f64631b;
        float f13 = rectF.left;
        float f14 = rectF.top;
        float width = rectF.width() + f13;
        float height = f14 + this.f64631b.height();
        float f15 = this.f64644o;
        float f16 = this.f64647r / 2.0f;
        if (this.f64645p[0]) {
            f11 = f14;
        } else {
            f11 = f14;
            canvas.drawLine(f13 - f16, f14, f13 + f15, f11, this.f64638i);
            canvas.drawLine(f13, f11 - f16, f13, f11 + f15, this.f64638i);
        }
        if (!this.f64645p[1]) {
            float f17 = f11;
            canvas.drawLine((width - f15) - f16, f17, width, f11, this.f64638i);
            canvas.drawLine(width, f17 - f16, width, f17 + f15, this.f64638i);
            width = width;
        }
        if (this.f64645p[2]) {
            f12 = height;
        } else {
            canvas.drawLine((width - f15) - f16, height, width + f16, height, this.f64638i);
            float f18 = width;
            canvas.drawLine(f18, height - f15, width, height, this.f64638i);
            f12 = height;
        }
        if (this.f64645p[3]) {
            return;
        }
        canvas.drawLine(f13 - f16, f12, f13 + f15, f12, this.f64638i);
        canvas.drawLine(f13, f12 - f15, f13, f12, this.f64638i);
    }

    public c s(@ColorInt int i11) {
        return t(ColorStateList.valueOf(i11));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f64634e.setAlpha(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f64634e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        this.f64634e.setDither(z11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z11) {
        this.f64634e.setFilterBitmap(z11);
        invalidateSelf();
    }

    public c t(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f64648s = colorStateList;
        this.f64638i.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public c u(float f11) {
        this.f64647r = f11;
        this.f64638i.setStrokeWidth(f11);
        return this;
    }

    public c v(float f11) {
        w(f11, f11, f11, f11);
        return this;
    }

    public c w(float f11, float f12, float f13, float f14) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.add(Float.valueOf(f14));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (hashSet.isEmpty()) {
            this.f64644o = 0.0f;
        } else {
            float floatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: " + floatValue);
            }
            this.f64644o = floatValue;
        }
        boolean[] zArr = this.f64645p;
        zArr[0] = f11 > 0.0f;
        zArr[1] = f12 > 0.0f;
        zArr[2] = f13 > 0.0f;
        zArr[3] = f14 > 0.0f;
        return this;
    }

    public c x(int i11, float f11) {
        if (f11 != 0.0f) {
            float f12 = this.f64644o;
            if (f12 != 0.0f && f12 != f11) {
                throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
            }
        }
        if (f11 == 0.0f) {
            if (p(i11, this.f64645p)) {
                this.f64644o = 0.0f;
            }
            this.f64645p[i11] = false;
            return this;
        }
        if (this.f64644o == 0.0f) {
            this.f64644o = f11;
        }
        this.f64645p[i11] = true;
        return this;
    }

    public c y(boolean z11) {
        this.f64646q = z11;
        return this;
    }

    public c z(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f64649t != scaleType) {
            this.f64649t = scaleType;
            D();
        }
        return this;
    }
}
