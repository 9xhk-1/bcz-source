package com.q42.android.scrollingimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import ot.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ScrollingImageView extends View {

    /* renamed from: k, reason: collision with root package name */
    public static b f41552k = new a();

    /* renamed from: l, reason: collision with root package name */
    public static final int f41553l = 0;

    /* renamed from: a, reason: collision with root package name */
    public List<Bitmap> f41554a;

    /* renamed from: b, reason: collision with root package name */
    public float f41555b;

    /* renamed from: c, reason: collision with root package name */
    public int f41556c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f41557d;

    /* renamed from: e, reason: collision with root package name */
    public int f41558e;

    /* renamed from: f, reason: collision with root package name */
    public int f41559f;

    /* renamed from: g, reason: collision with root package name */
    public int f41560g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f41561h;

    /* renamed from: i, reason: collision with root package name */
    public float f41562i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41563j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements b {
        @Override // ot.b
        public Bitmap a(Context context, int resourceId) {
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), resourceId);
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                float f11 = displayMetrics.widthPixels;
                if (f11 > 0.0f && decodeResource.getWidth() > 0) {
                    float width = f11 / decodeResource.getWidth();
                    Matrix matrix = new Matrix();
                    matrix.preScale(width, width);
                    return Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
                }
            }
            return decodeResource;
        }
    }

    public ScrollingImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        int i11 = 0;
        this.f41556c = 0;
        this.f41558e = 0;
        this.f41559f = 0;
        this.f41560g = 0;
        this.f41561h = new Rect();
        this.f41562i = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.ScrollingImageView, 0, 0);
        try {
            int i12 = obtainStyledAttributes.getInt(R.styleable.ScrollingImageView_scrollingImageview_initialState, 0);
            this.f41555b = obtainStyledAttributes.getDimension(R.styleable.ScrollingImageView_scrollingImageview_speed, 10.0f);
            this.f41556c = obtainStyledAttributes.getInt(R.styleable.ScrollingImageView_scrollingImageview_orientation, 0);
            int i13 = obtainStyledAttributes.getInt(R.styleable.ScrollingImageView_scrollingImageview_sceneLength, 1000);
            int resourceId = obtainStyledAttributes.getResourceId(R.styleable.ScrollingImageView_scrollingImageview_randomness, 0);
            int[] intArray = resourceId > 0 ? getResources().getIntArray(resourceId) : new int[0];
            int i14 = isInEditMode() ? 3 : obtainStyledAttributes.peekValue(R.styleable.ScrollingImageView_scrollingImageview_src).type;
            if (i14 == 1) {
                TypedArray obtainTypedArray = getResources().obtainTypedArray(obtainStyledAttributes.getResourceId(R.styleable.ScrollingImageView_scrollingImageview_src, 0));
                try {
                    int i15 = 0;
                    for (int i16 : intArray) {
                        i15 += i16;
                    }
                    this.f41554a = new ArrayList(Math.max(obtainTypedArray.length(), i15));
                    int i17 = 0;
                    while (i17 < obtainTypedArray.length()) {
                        int max = (intArray.length <= 0 || i17 >= intArray.length) ? 1 : Math.max(1, intArray[i17]);
                        Bitmap a11 = f41552k.a(getContext(), obtainTypedArray.getResourceId(i17, 0));
                        for (int i18 = 0; i18 < max; i18++) {
                            this.f41554a.add(a11);
                        }
                        this.f41559f = Math.max(a11.getHeight(), this.f41559f);
                        this.f41560g = Math.max(a11.getWidth(), this.f41560g);
                        i17++;
                    }
                    Random random = new Random();
                    this.f41557d = new int[i13];
                    while (true) {
                        int[] iArr = this.f41557d;
                        if (i11 >= iArr.length) {
                            break;
                        }
                        iArr[i11] = random.nextInt(this.f41554a.size());
                        i11++;
                    }
                    obtainTypedArray.recycle();
                } catch (Throwable th2) {
                    obtainTypedArray.recycle();
                    throw th2;
                }
            } else if (i14 == 3) {
                Bitmap a12 = f41552k.a(getContext(), obtainStyledAttributes.getResourceId(R.styleable.ScrollingImageView_scrollingImageview_src, 0));
                if (a12 != null) {
                    List<Bitmap> singletonList = Collections.singletonList(a12);
                    this.f41554a = singletonList;
                    this.f41557d = new int[]{0};
                    this.f41559f = singletonList.get(0).getHeight();
                    this.f41560g = this.f41554a.get(0).getWidth();
                } else {
                    this.f41554a = Collections.EMPTY_LIST;
                }
            }
            obtainStyledAttributes.recycle();
            if (i12 == 0) {
                f();
            }
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }

    public final void a(Canvas canvas) {
        while (this.f41562i <= (-c(this.f41558e).getWidth())) {
            this.f41562i += c(this.f41558e).getWidth();
            this.f41558e = (this.f41558e + 1) % this.f41557d.length;
        }
        float f11 = this.f41562i;
        int i11 = 0;
        while (f11 < this.f41561h.width()) {
            Bitmap c11 = c((this.f41558e + i11) % this.f41557d.length);
            float width = c11.getWidth();
            canvas.drawBitmap(c11, d(width, f11), 0.0f, (Paint) null);
            f11 += width;
            i11++;
        }
    }

    public final void b(Canvas canvas) {
        while (this.f41562i <= (-c(this.f41558e).getHeight())) {
            this.f41562i += c(this.f41558e).getHeight();
            this.f41558e = (this.f41558e + 1) % this.f41557d.length;
        }
        float f11 = this.f41562i;
        int i11 = 0;
        while (f11 < this.f41561h.height()) {
            Bitmap c11 = c((this.f41558e + i11) % this.f41557d.length);
            float height = c11.getHeight();
            canvas.drawBitmap(c11, 0.0f, e(height, f11), (Paint) null);
            f11 += height;
            i11++;
        }
    }

    public final Bitmap c(int sceneIndex) {
        return this.f41554a.get(this.f41557d[sceneIndex]);
    }

    public final float d(float layerWidth, float left) {
        return this.f41555b < 0.0f ? (this.f41561h.width() - layerWidth) - left : left;
    }

    public final float e(float layerHeight, float top) {
        return this.f41555b < 0.0f ? (this.f41561h.height() - layerHeight) - top : top;
    }

    public void f() {
        if (this.f41563j) {
            return;
        }
        this.f41563j = true;
        postInvalidateOnAnimation();
    }

    public void g() {
        if (this.f41563j) {
            this.f41563j = false;
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            return;
        }
        super.onDraw(canvas);
        if (canvas == null || this.f41554a.isEmpty()) {
            return;
        }
        canvas.getClipBounds(this.f41561h);
        if (this.f41556c == 0) {
            a(canvas);
        } else {
            b(canvas);
        }
        if (this.f41563j) {
            float f11 = this.f41555b;
            if (f11 != 0.0f) {
                this.f41562i -= Math.abs(f11);
                postInvalidateOnAnimation();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f41556c == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), this.f41559f);
        } else {
            setMeasuredDimension(this.f41560g, View.MeasureSpec.getSize(heightMeasureSpec));
        }
    }

    public void setSpeed(float speed) {
        this.f41555b = speed;
        if (this.f41563j) {
            postInvalidateOnAnimation();
        }
    }
}
