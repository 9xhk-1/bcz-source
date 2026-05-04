package cn.hugo.android.scanner.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.l;
import com.jiongji.andriod.card.R;
import t.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ViewfinderView extends View {

    /* renamed from: q, reason: collision with root package name */
    public static final long f9337q = 30;

    /* renamed from: r, reason: collision with root package name */
    public static final int f9338r = 255;

    /* renamed from: s, reason: collision with root package name */
    public static final int f9339s = 20;

    /* renamed from: a, reason: collision with root package name */
    public int f9340a;

    /* renamed from: b, reason: collision with root package name */
    public int f9341b;

    /* renamed from: c, reason: collision with root package name */
    public int f9342c;

    /* renamed from: d, reason: collision with root package name */
    public int f9343d;

    /* renamed from: e, reason: collision with root package name */
    public int f9344e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f9345f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f9346g;

    /* renamed from: h, reason: collision with root package name */
    public Paint f9347h;

    /* renamed from: i, reason: collision with root package name */
    public TextPaint f9348i;

    /* renamed from: j, reason: collision with root package name */
    public int f9349j;

    /* renamed from: k, reason: collision with root package name */
    public long f9350k;

    /* renamed from: l, reason: collision with root package name */
    public int f9351l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f9352m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9353n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9354o;

    /* renamed from: p, reason: collision with root package name */
    public d f9355p;

    public ViewfinderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f9354o = true;
        this.f9340a = b(context, 2.0f);
        this.f9341b = b(context, 25.0f);
        this.f9342c = b(context, 32.0f);
        this.f9344e = b(context, 20.0f);
        this.f9343d = b(context, 2.0f);
        this.f9345f = new Paint(1);
        Paint paint = new Paint();
        this.f9346g = paint;
        paint.setColor(-1);
        this.f9346g.setStrokeWidth(this.f9343d);
        Paint paint2 = new Paint(1);
        this.f9347h = paint2;
        paint2.setStrokeWidth(this.f9340a);
        this.f9347h.setColor(-13256220);
        TextPaint textPaint = new TextPaint();
        this.f9348i = textPaint;
        textPaint.setTextSize(b(context, 12.0f));
        this.f9348i.setColor(-1);
        this.f9348i.setTextAlign(Paint.Align.CENTER);
        this.f9353n = getResources().getColor(R.color.C50);
    }

    public int b(Context context, float dipValue) {
        return (int) ((dipValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void c(Canvas canvas, Rect frame) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.f9345f.setColor(this.f9353n);
        float f11 = width;
        canvas.drawRect(0.0f, 0.0f, f11, frame.top, this.f9345f);
        canvas.drawRect(0.0f, frame.top, frame.left, frame.bottom + 1, this.f9345f);
        canvas.drawRect(frame.right + 1, frame.top, f11, frame.bottom + 1, this.f9345f);
        canvas.drawRect(0.0f, frame.bottom + 1, f11, height, this.f9345f);
    }

    public final void d(Canvas canvas, Rect frame) {
        int i11 = this.f9340a >> 1;
        int i12 = frame.left;
        canvas.drawLine(i12 + i11, this.f9341b + r4, i12 + i11, frame.top, this.f9347h);
        int i13 = frame.left;
        int i14 = frame.top;
        canvas.drawLine(i13, i14 + i11, i13 + this.f9341b, i14 + i11, this.f9347h);
        int i15 = frame.right;
        float f11 = i15 - this.f9341b;
        int i16 = frame.top;
        canvas.drawLine(f11, i16 + i11, i15, i16 + i11, this.f9347h);
        int i17 = frame.right;
        canvas.drawLine(i17 - i11, frame.top, i17 - i11, r4 + this.f9341b, this.f9347h);
        int i18 = frame.right;
        canvas.drawLine(i18 - i11, r4 - this.f9341b, i18 - i11, frame.bottom, this.f9347h);
        int i19 = frame.right;
        int i21 = frame.bottom;
        canvas.drawLine(i19, i21 - i11, i19 - this.f9341b, i21 - i11, this.f9347h);
        int i22 = frame.left;
        float f12 = this.f9341b + i22;
        int i23 = frame.bottom;
        canvas.drawLine(f12, i23 - i11, i22, i23 - i11, this.f9347h);
        int i24 = frame.left;
        canvas.drawLine(i24 + i11, frame.bottom, i24 + i11, r1 - this.f9341b, this.f9347h);
    }

    public void e(Bitmap barcode) {
        this.f9352m = barcode;
        invalidate();
    }

    public final void f(Canvas canvas, Rect frame) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f9354o) {
            this.f9354o = false;
            this.f9349j = frame.top;
            this.f9351l = frame.bottom;
        } else {
            this.f9349j = (int) (this.f9349j + ((currentTimeMillis - this.f9350k) * 0.2d));
        }
        this.f9350k = currentTimeMillis;
        if (this.f9349j >= this.f9351l) {
            this.f9349j = frame.top;
        }
        float f11 = frame.left + this.f9344e;
        int i11 = this.f9349j;
        int i12 = this.f9343d;
        canvas.drawLine(f11, (i12 / 2) + i11, frame.right - r1, i11 + (i12 / 2), this.f9346g);
    }

    public void g() {
        Bitmap bitmap = this.f9352m;
        this.f9352m = null;
        if (bitmap != null) {
            bitmap.recycle();
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Rect d11;
        d dVar = this.f9355p;
        if (dVar == null || (d11 = dVar.d()) == null) {
            return;
        }
        c(canvas, d11);
        if (this.f9352m != null) {
            this.f9345f.setAlpha(160);
            canvas.drawBitmap(this.f9352m, (Rect) null, d11, this.f9345f);
        } else {
            d(canvas, d11);
            f(canvas, d11);
            canvas.drawText("将二维码放入框内，即可自动扫描", d11.centerX(), d11.bottom + this.f9342c, this.f9348i);
            postInvalidateDelayed(30L, d11.left, d11.top, d11.right, d11.bottom);
        }
    }

    public void setCameraManager(d cameraManager) {
        this.f9355p = cameraManager;
    }

    public void a(l point) {
    }
}
