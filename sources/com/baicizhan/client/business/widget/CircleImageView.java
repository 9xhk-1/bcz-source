package com.baicizhan.client.business.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CircleImageView extends AppCompatImageView {

    /* renamed from: p, reason: collision with root package name */
    public static final ImageView.ScaleType f16965p = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: q, reason: collision with root package name */
    public static final Bitmap.Config f16966q = Bitmap.Config.ARGB_8888;

    /* renamed from: r, reason: collision with root package name */
    public static final int f16967r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f16968s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f16969t = -16777216;

    /* renamed from: a, reason: collision with root package name */
    public final RectF f16970a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f16971b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f16972c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f16973d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f16974e;

    /* renamed from: f, reason: collision with root package name */
    public int f16975f;

    /* renamed from: g, reason: collision with root package name */
    public int f16976g;

    /* renamed from: h, reason: collision with root package name */
    public Bitmap f16977h;

    /* renamed from: i, reason: collision with root package name */
    public BitmapShader f16978i;

    /* renamed from: j, reason: collision with root package name */
    public int f16979j;

    /* renamed from: k, reason: collision with root package name */
    public int f16980k;

    /* renamed from: l, reason: collision with root package name */
    public float f16981l;

    /* renamed from: m, reason: collision with root package name */
    public float f16982m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16983n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16984o;

    public CircleImageView(Context context) {
        super(context);
        this.f16970a = new RectF();
        this.f16971b = new RectF();
        this.f16972c = new Matrix();
        this.f16973d = new Paint();
        this.f16974e = new Paint();
        this.f16975f = -16777216;
        this.f16976g = 0;
        b();
    }

    private void b() {
        super.setScaleType(f16965p);
        this.f16983n = true;
        if (this.f16984o) {
            c();
            this.f16984o = false;
        }
    }

    public final Bitmap a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(1, 1, f16966q) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f16966q);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public final void c() {
        if (!this.f16983n) {
            this.f16984o = true;
            return;
        }
        if (this.f16977h == null) {
            return;
        }
        Bitmap bitmap = this.f16977h;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f16978i = new BitmapShader(bitmap, tileMode, tileMode);
        this.f16973d.setAntiAlias(true);
        this.f16973d.setShader(this.f16978i);
        this.f16974e.setStyle(Paint.Style.STROKE);
        this.f16974e.setAntiAlias(true);
        this.f16974e.setColor(this.f16975f);
        this.f16974e.setStrokeWidth(this.f16976g);
        this.f16980k = this.f16977h.getHeight();
        this.f16979j = this.f16977h.getWidth();
        this.f16971b.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f16982m = Math.min((this.f16971b.height() - this.f16976g) / 2.0f, (this.f16971b.width() - this.f16976g) / 2.0f);
        RectF rectF = this.f16970a;
        int i11 = this.f16976g;
        rectF.set(i11, i11, this.f16971b.width() - this.f16976g, this.f16971b.height() - this.f16976g);
        this.f16981l = Math.min(this.f16970a.height() / 2.0f, this.f16970a.width() / 2.0f);
        d();
        invalidate();
    }

    public final void d() {
        float width;
        float height;
        this.f16972c.set(null);
        float f11 = 0.0f;
        if (this.f16979j * this.f16970a.height() > this.f16970a.width() * this.f16980k) {
            width = this.f16970a.height() / this.f16980k;
            height = 0.0f;
            f11 = (this.f16970a.width() - (this.f16979j * width)) * 0.5f;
        } else {
            width = this.f16970a.width() / this.f16979j;
            height = (this.f16970a.height() - (this.f16980k * width)) * 0.5f;
        }
        this.f16972c.setScale(width, width);
        Matrix matrix = this.f16972c;
        int i11 = this.f16976g;
        matrix.postTranslate(((int) (f11 + 0.5f)) + i11, ((int) (height + 0.5f)) + i11);
        this.f16978i.setLocalMatrix(this.f16972c);
    }

    public int getBorderColor() {
        return this.f16975f;
    }

    public int getBorderWidth() {
        return this.f16976g;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f16965p;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f16981l, this.f16973d);
        if (this.f16976g != 0) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f16982m, this.f16974e);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        c();
    }

    public void setBorderColor(int borderColor) {
        if (borderColor == this.f16975f) {
            return;
        }
        this.f16975f = borderColor;
        this.f16974e.setColor(borderColor);
        invalidate();
    }

    public void setBorderWidth(int borderWidth) {
        if (borderWidth == this.f16976g) {
            return;
        }
        this.f16976g = borderWidth;
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bm2) {
        super.setImageBitmap(bm2);
        this.f16977h = bm2;
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f16977h = a(drawable);
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        super.setImageResource(resId);
        this.f16977h = a(getDrawable());
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f16977h = a(getDrawable());
        c();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f16965p) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public CircleImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircleImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f16970a = new RectF();
        this.f16971b = new RectF();
        this.f16972c = new Matrix();
        this.f16973d = new Paint();
        this.f16974e = new Paint();
        this.f16975f = -16777216;
        this.f16976g = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.CircleImageView, defStyle, 0);
        this.f16976g = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f16975f = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        b();
    }
}
