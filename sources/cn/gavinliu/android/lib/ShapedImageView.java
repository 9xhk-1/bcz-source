package cn.gavinliu.android.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ShapedImageView extends AppCompatImageView {

    /* renamed from: o, reason: collision with root package name */
    public static final int f9281o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f9282p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f9283q = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f9284a;

    /* renamed from: b, reason: collision with root package name */
    public float f9285b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f9286c;

    /* renamed from: d, reason: collision with root package name */
    public int f9287d;

    /* renamed from: e, reason: collision with root package name */
    public float f9288e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9289f;

    /* renamed from: g, reason: collision with root package name */
    public Path f9290g;

    /* renamed from: h, reason: collision with root package name */
    public Shape f9291h;

    /* renamed from: i, reason: collision with root package name */
    public Shape f9292i;

    /* renamed from: j, reason: collision with root package name */
    public Paint f9293j;

    /* renamed from: k, reason: collision with root package name */
    public Paint f9294k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f9295l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f9296m;

    /* renamed from: n, reason: collision with root package name */
    public a f9297n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(Path path, int width, int height);
    }

    public ShapedImageView(Context context) {
        super(context);
        this.f9284a = 0;
        this.f9285b = 0.0f;
        this.f9286c = new float[8];
        this.f9287d = 637534208;
        this.f9288e = 0.0f;
        a(null);
    }

    private void a(AttributeSet attrs) {
        setLayerType(2, null);
        Paint paint = new Paint(1);
        this.f9293j = paint;
        paint.setFilterBitmap(true);
        this.f9293j.setColor(-16777216);
        this.f9293j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint2 = new Paint(1);
        this.f9294k = paint2;
        paint2.setFilterBitmap(true);
        this.f9294k.setColor(-16777216);
        Paint paint3 = new Paint(1);
        this.f9295l = paint3;
        paint3.setFilterBitmap(true);
        this.f9295l.setColor(-16777216);
        this.f9295l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f9290g = new Path();
    }

    public final Bitmap b() {
        if (this.f9288e <= 0.0f) {
            return null;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return null;
        }
        c();
        this.f9296m = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f9296m);
        Paint paint = new Paint(1);
        paint.setColor(this.f9287d);
        canvas.drawRect(new RectF(0.0f, 0.0f, measuredWidth, measuredHeight), paint);
        return this.f9296m;
    }

    public final void c() {
        Bitmap bitmap = this.f9296m;
        if (bitmap != null) {
            bitmap.recycle();
            this.f9296m = null;
        }
    }

    public void d(int shapeMode, float radius) {
        boolean z11 = (this.f9284a == shapeMode && this.f9285b == radius) ? false : true;
        this.f9289f = z11;
        if (z11) {
            this.f9284a = shapeMode;
            this.f9285b = radius;
            this.f9291h = null;
            this.f9292i = null;
            requestLayout();
        }
    }

    public void e(float lt2, float rt2, float rb2, float lb2) {
        float[] fArr = this.f9286c;
        fArr[0] = lt2;
        fArr[1] = lt2;
        fArr[2] = rt2;
        fArr[3] = rt2;
        fArr[4] = rb2;
        fArr[5] = rb2;
        fArr[6] = lb2;
        fArr[7] = lb2;
    }

    public void f(int strokeColor, float strokeWidth) {
        float f11 = this.f9288e;
        if (f11 <= 0.0f) {
            return;
        }
        if (f11 != strokeWidth) {
            this.f9288e = strokeWidth;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Shape shape = this.f9292i;
            float f12 = this.f9288e;
            shape.resize(measuredWidth - (f12 * 2.0f), measuredHeight - (f12 * 2.0f));
            postInvalidate();
        }
        if (this.f9287d != strokeColor) {
            this.f9287d = strokeColor;
            b();
            postInvalidate();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9296m == null) {
            b();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Shape shape;
        super.onDraw(canvas);
        if (this.f9288e <= 0.0f || this.f9292i == null || this.f9296m == null) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            int saveLayer = canvas2.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 0);
            this.f9294k.setXfermode(null);
            canvas2.drawBitmap(this.f9296m, 0.0f, 0.0f, this.f9294k);
            float f11 = this.f9288e;
            canvas2.translate(f11, f11);
            this.f9294k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.f9292i.draw(canvas2, this.f9294k);
            canvas2.restoreToCount(saveLayer);
        }
        if (this.f9297n != null) {
            canvas2.drawPath(this.f9290g, this.f9295l);
        }
        int i11 = this.f9284a;
        if ((i11 == 1 || i11 == 2) && (shape = this.f9291h) != null) {
            shape.draw(canvas2, this.f9293j);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed || this.f9289f) {
            this.f9289f = false;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (this.f9284a == 2) {
                this.f9285b = Math.min(measuredWidth, measuredHeight) / 2.0f;
            }
            if (this.f9284a == 1) {
                this.f9291h = new RoundRectShape(this.f9286c, null, null);
                this.f9292i = new RoundRectShape(this.f9286c, null, null);
            } else if (this.f9291h == null || this.f9285b != 0.0f) {
                float[] fArr = new float[8];
                Arrays.fill(fArr, this.f9285b);
                this.f9291h = new RoundRectShape(fArr, null, null);
                this.f9292i = new RoundRectShape(fArr, null, null);
            }
            float f11 = measuredWidth;
            float f12 = measuredHeight;
            this.f9291h.resize(f11, f12);
            Shape shape = this.f9292i;
            float f13 = this.f9288e;
            shape.resize(f11 - (f13 * 2.0f), f12 - (f13 * 2.0f));
            b();
            a aVar = this.f9297n;
            if (aVar != null) {
                aVar.a(this.f9290g, measuredWidth, measuredHeight);
            }
        }
    }

    public void setExtension(a extension) {
        this.f9297n = extension;
        requestLayout();
    }

    public void setShape(int shapeMode) {
        this.f9289f = true;
        this.f9284a = shapeMode;
    }

    public void setShapeMode(int shapeMode) {
        d(shapeMode, this.f9285b);
    }

    public void setShapeRadius(float radius) {
        d(this.f9284a, radius);
    }

    public void setStrokeColor(int strokeColor) {
        f(strokeColor, this.f9288e);
    }

    public void setStrokeWidth(float strokeWidth) {
        f(this.f9287d, strokeWidth);
    }

    public ShapedImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f9284a = 0;
        this.f9285b = 0.0f;
        this.f9286c = new float[8];
        this.f9287d = 637534208;
        this.f9288e = 0.0f;
        a(attrs);
    }

    public ShapedImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f9284a = 0;
        this.f9285b = 0.0f;
        this.f9286c = new float[8];
        this.f9287d = 637534208;
        this.f9288e = 0.0f;
        a(attrs);
    }
}
