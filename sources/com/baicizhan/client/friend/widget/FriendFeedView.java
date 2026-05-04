package com.baicizhan.client.friend.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jiongji.andriod.card.R;
import hc.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FriendFeedView extends RelativeLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final int f17708l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final int f17709m = -13882324;

    /* renamed from: n, reason: collision with root package name */
    public static final int f17710n = 12;

    /* renamed from: o, reason: collision with root package name */
    public static final int f17711o = 1;

    /* renamed from: a, reason: collision with root package name */
    public ImageView f17712a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f17713b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f17714c;

    /* renamed from: d, reason: collision with root package name */
    public int f17715d;

    /* renamed from: e, reason: collision with root package name */
    public int f17716e;

    /* renamed from: f, reason: collision with root package name */
    public int f17717f;

    /* renamed from: g, reason: collision with root package name */
    public int f17718g;

    /* renamed from: h, reason: collision with root package name */
    public int f17719h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f17720i;

    /* renamed from: j, reason: collision with root package name */
    public Paint f17721j;

    /* renamed from: k, reason: collision with root package name */
    public Paint f17722k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f17723a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f17724b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f17725c = 2;
    }

    public FriendFeedView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f11;
        super.dispatchDraw(canvas);
        float left = this.f17714c.getLeft();
        float height = getHeight() / 2.0f;
        if ((this.f17719h & 1) == 0) {
            f11 = height;
            canvas2 = canvas;
            canvas2.drawLine(left, 0.0f, left, f11, this.f17720i);
        } else {
            canvas2 = canvas;
            f11 = height;
        }
        if ((this.f17719h & 2) == 0) {
            float f12 = f11;
            canvas2.drawLine(left, f12, left, getHeight(), this.f17720i);
            f11 = f12;
        }
        canvas2.drawCircle(left, f11, this.f17717f, this.f17721j);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f17712a = (ImageView) findViewById(R.id.thumb);
        this.f17713b = (TextView) findViewById(R.id.content);
        this.f17714c = (TextView) findViewById(R.id.datetime);
    }

    public void setContent(Spanned content) {
        this.f17713b.setText(content);
    }

    public void setDateTime(String dateTime) {
        this.f17714c.setText(dateTime);
    }

    public void setLineColor(int lineColor) {
        if (lineColor != this.f17716e) {
            this.f17716e = lineColor;
            this.f17720i.setColor(lineColor);
            this.f17722k.setColor(this.f17716e);
            invalidate();
        }
    }

    public void setMarkerColor(int markerColor) {
        if (markerColor != this.f17718g) {
            this.f17718g = markerColor;
            this.f17721j.setColor(markerColor);
            invalidate();
        }
    }

    public void setMarkerMode(int markerMode) {
        this.f17719h = markerMode;
        invalidate();
    }

    public void setMarkerRadius(int markerRadius) {
        if (this.f17717f != markerRadius) {
            this.f17717f = markerRadius;
            this.f17721j.setStrokeWidth(markerRadius);
            invalidate();
        }
    }

    public void setThumb(String thumb) {
        if (TextUtils.isEmpty(thumb)) {
            thumb = "empty";
        }
        c.l(thumb).j(R.drawable.defaultavatarbig_normal_default).f(R.drawable.defaultavatarbig_normal_default).o(this.f17712a);
    }

    public FriendFeedView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FriendFeedView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.FriendFeedView);
        this.f17715d = obtainStyledAttributes.getDimensionPixelSize(2, 8);
        this.f17716e = obtainStyledAttributes.getColor(1, f17709m);
        this.f17717f = obtainStyledAttributes.getDimensionPixelOffset(5, 12);
        this.f17718g = obtainStyledAttributes.getColor(0, 0);
        this.f17719h = obtainStyledAttributes.getInt(3, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f17720i = paint;
        paint.setColor(this.f17716e);
        this.f17720i.setStrokeWidth(this.f17715d);
        Paint paint2 = this.f17720i;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f17722k = paint3;
        paint3.setColor(this.f17716e);
        this.f17722k.setStrokeWidth(1.0f);
        this.f17722k.setStyle(style);
        Paint paint4 = new Paint(1);
        this.f17721j = paint4;
        paint4.setColor(this.f17718g);
    }

    public void setThumb(int thumbId) {
        this.f17712a.setImageResource(thumbId);
    }
}
