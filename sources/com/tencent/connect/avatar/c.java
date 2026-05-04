package com.tencent.connect.avatar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    final String f42837a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f42838b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f42839c;

    /* renamed from: d, reason: collision with root package name */
    private Matrix f42840d;

    /* renamed from: e, reason: collision with root package name */
    private int f42841e;

    /* renamed from: f, reason: collision with root package name */
    private float f42842f;

    /* renamed from: g, reason: collision with root package name */
    private float f42843g;

    /* renamed from: h, reason: collision with root package name */
    private Bitmap f42844h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f42845i;

    /* renamed from: j, reason: collision with root package name */
    private float f42846j;

    /* renamed from: k, reason: collision with root package name */
    private float f42847k;

    /* renamed from: l, reason: collision with root package name */
    private PointF f42848l;

    /* renamed from: m, reason: collision with root package name */
    private PointF f42849m;

    /* renamed from: n, reason: collision with root package name */
    private float f42850n;

    /* renamed from: o, reason: collision with root package name */
    private float f42851o;

    /* renamed from: p, reason: collision with root package name */
    private Rect f42852p;

    public c(Context context) {
        super(context);
        this.f42839c = new Matrix();
        this.f42840d = new Matrix();
        this.f42841e = 0;
        this.f42842f = 1.0f;
        this.f42843g = 1.0f;
        this.f42845i = false;
        this.f42837a = "TouchView";
        this.f42848l = new PointF();
        this.f42849m = new PointF();
        this.f42850n = 1.0f;
        this.f42851o = 0.0f;
        this.f42838b = false;
        Rect rect = new Rect();
        this.f42852p = rect;
        getDrawingRect(rect);
        a();
    }

    private void a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Animation animation;
        if (this.f42844h == null) {
            return;
        }
        float width = this.f42852p.width();
        float height = this.f42852p.height();
        float[] fArr = new float[9];
        this.f42839c.getValues(fArr);
        float f11 = fArr[2];
        float f12 = fArr[5];
        boolean z11 = false;
        float f13 = fArr[0];
        float f14 = this.f42842f;
        if (f13 > f14) {
            float f15 = f14 / f13;
            this.f42851o = f15;
            Matrix matrix = this.f42839c;
            PointF pointF = this.f42849m;
            matrix.postScale(f15, f15, pointF.x, pointF.y);
            setImageMatrix(this.f42839c);
            float f16 = this.f42851o;
            float f17 = 1.0f / f16;
            float f18 = 1.0f / f16;
            PointF pointF2 = this.f42849m;
            animation = new ScaleAnimation(f17, 1.0f, f18, 1.0f, pointF2.x, pointF2.y);
        } else {
            float f19 = this.f42843g;
            if (f13 < f19) {
                float f21 = f19 / f13;
                this.f42851o = f21;
                Matrix matrix2 = this.f42839c;
                PointF pointF3 = this.f42849m;
                matrix2.postScale(f21, f21, pointF3.x, pointF3.y);
                float f22 = this.f42851o;
                PointF pointF4 = this.f42849m;
                animation = new ScaleAnimation(1.0f, f22, 1.0f, f22, pointF4.x, pointF4.y);
            } else {
                float width2 = this.f42844h.getWidth() * f13;
                float height2 = this.f42844h.getHeight() * f13;
                Rect rect = this.f42852p;
                int i11 = rect.left;
                float f23 = i11 - f11;
                int i12 = rect.top;
                float f24 = i12 - f12;
                if (f23 < 0.0f) {
                    f11 = i11;
                    z11 = true;
                }
                if (f24 < 0.0f) {
                    f12 = i12;
                    z11 = true;
                }
                float f25 = height2 - f24;
                if (width2 - f23 < width) {
                    f11 = i11 - (width2 - width);
                    z11 = true;
                }
                if (f25 < height) {
                    f12 = i12 - (height2 - height);
                    z11 = true;
                }
                if (z11) {
                    float f26 = fArr[2] - f11;
                    float f27 = fArr[5] - f12;
                    fArr[2] = f11;
                    fArr[5] = f12;
                    this.f42839c.setValues(fArr);
                    setImageMatrix(this.f42839c);
                    animation = new TranslateAnimation(f26, 0.0f, f27, 0.0f);
                } else {
                    setImageMatrix(this.f42839c);
                    animation = null;
                }
            }
        }
        if (animation != null) {
            this.f42845i = true;
            animation.setDuration(300L);
            startAnimation(animation);
            new Thread(new Runnable() { // from class: com.tencent.connect.avatar.c.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Thread.sleep(300L);
                    } catch (InterruptedException e11) {
                        e11.printStackTrace();
                    }
                    c.this.post(new Runnable() { // from class: com.tencent.connect.avatar.c.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            c.this.clearAnimation();
                            c.this.b();
                        }
                    });
                    c.this.f42845i = false;
                }
            }).start();
        }
    }

    private void c() {
        if (this.f42844h == null) {
            return;
        }
        float[] fArr = {r1, 0.0f, this.f42846j, 0.0f, r1, r2, 0.0f, 0.0f, 0.0f};
        this.f42839c.getValues(fArr);
        float max = Math.max(this.f42852p.width() / this.f42844h.getWidth(), this.f42852p.height() / this.f42844h.getHeight());
        this.f42846j = this.f42852p.left - (((this.f42844h.getWidth() * max) - this.f42852p.width()) / 2.0f);
        float height = this.f42852p.top - (((this.f42844h.getHeight() * max) - this.f42852p.height()) / 2.0f);
        this.f42847k = height;
        this.f42839c.setValues(fArr);
        float min = Math.min(2048.0f / this.f42844h.getWidth(), 2048.0f / this.f42844h.getHeight());
        this.f42842f = min;
        this.f42843g = max;
        if (min < max) {
            this.f42842f = max;
        }
        setImageMatrix(this.f42839c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        if (r0 != 6) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.f42845i
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L90
            if (r0 == r1) goto L89
            r2 = 1092616192(0x41200000, float:10.0)
            r3 = 2
            if (r0 == r3) goto L37
            r4 = 5
            if (r0 == r4) goto L1d
            r6 = 6
            if (r0 == r6) goto L89
            goto Laf
        L1d:
            float r6 = r5.a(r6)
            r5.f42850n = r6
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 <= 0) goto Laf
            android.graphics.Matrix r6 = r5.f42840d
            android.graphics.Matrix r0 = r5.f42839c
            r6.set(r0)
            android.graphics.PointF r6 = r5.f42849m
            r5.a(r6)
            r5.f42841e = r3
            goto Laf
        L37:
            int r0 = r5.f42841e
            if (r0 != r1) goto L5f
            android.graphics.Matrix r0 = r5.f42839c
            android.graphics.Matrix r2 = r5.f42840d
            r0.set(r2)
            float r0 = r6.getX()
            android.graphics.PointF r2 = r5.f42848l
            float r2 = r2.x
            float r0 = r0 - r2
            float r6 = r6.getY()
            android.graphics.PointF r2 = r5.f42848l
            float r2 = r2.y
            float r6 = r6 - r2
            android.graphics.Matrix r2 = r5.f42839c
            r2.postTranslate(r0, r6)
            android.graphics.Matrix r6 = r5.f42839c
            r5.setImageMatrix(r6)
            goto Laf
        L5f:
            if (r0 != r3) goto Laf
            android.graphics.Matrix r0 = r5.f42839c
            r0.set(r0)
            float r6 = r5.a(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L83
            android.graphics.Matrix r0 = r5.f42839c
            android.graphics.Matrix r2 = r5.f42840d
            r0.set(r2)
            float r0 = r5.f42850n
            float r6 = r6 / r0
            android.graphics.Matrix r0 = r5.f42839c
            android.graphics.PointF r2 = r5.f42849m
            float r3 = r2.x
            float r2 = r2.y
            r0.postScale(r6, r6, r3, r2)
        L83:
            android.graphics.Matrix r6 = r5.f42839c
            r5.setImageMatrix(r6)
            goto Laf
        L89:
            r5.b()
            r6 = 0
            r5.f42841e = r6
            goto Laf
        L90:
            android.graphics.Matrix r0 = r5.f42839c
            android.graphics.Matrix r2 = r5.getImageMatrix()
            r0.set(r2)
            android.graphics.Matrix r0 = r5.f42840d
            android.graphics.Matrix r2 = r5.f42839c
            r0.set(r2)
            android.graphics.PointF r0 = r5.f42848l
            float r2 = r6.getX()
            float r6 = r6.getY()
            r0.set(r2, r6)
            r5.f42841e = r1
        Laf:
            r5.f42838b = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.connect.avatar.c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f42844h = bitmap;
        if (bitmap != null) {
            this.f42844h = bitmap;
        }
    }

    private float a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return 0.0f;
        }
        float x11 = motionEvent.getX(0) - motionEvent.getX(1);
        float y11 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x11 * x11) + (y11 * y11));
    }

    public void a(Rect rect) {
        this.f42852p = rect;
        if (this.f42844h != null) {
            c();
        }
    }

    private void a(PointF pointF) {
        if (this.f42844h == null) {
            return;
        }
        float[] fArr = new float[9];
        this.f42839c.getValues(fArr);
        float f11 = fArr[2];
        float f12 = fArr[5];
        float f13 = fArr[0];
        float width = this.f42844h.getWidth() * f13;
        float height = this.f42844h.getHeight() * f13;
        Rect rect = this.f42852p;
        float f14 = rect.left - f11;
        if (f14 <= 1.0f) {
            f14 = 1.0f;
        }
        float f15 = (f11 + width) - rect.right;
        if (f15 <= 1.0f) {
            f15 = 1.0f;
        }
        float width2 = (rect.width() * f14) / (f15 + f14);
        Rect rect2 = this.f42852p;
        float f16 = width2 + rect2.left;
        float f17 = rect2.top - f12;
        float f18 = (f12 + height) - rect2.bottom;
        if (f17 <= 1.0f) {
            f17 = 1.0f;
        }
        pointF.set(f16, ((rect2.height() * f17) / ((f18 > 1.0f ? f18 : 1.0f) + f17)) + this.f42852p.top);
    }
}
