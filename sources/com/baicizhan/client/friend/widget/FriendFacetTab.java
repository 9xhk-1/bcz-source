package com.baicizhan.client.friend.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.jiongji.andriod.card.R;
import xb.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FriendFacetTab extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f17701a;

    /* renamed from: b, reason: collision with root package name */
    public View f17702b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17703c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17704d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f17705e;

    /* renamed from: f, reason: collision with root package name */
    public int f17706f;

    /* renamed from: g, reason: collision with root package name */
    public int f17707g;

    public FriendFacetTab(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int right = this.f17701a.getRight() + this.f17706f + this.f17707g;
        Paint.FontMetrics fontMetrics = this.f17701a.getPaint().getFontMetrics();
        float top = (this.f17701a.getTop() + fontMetrics.ascent) - fontMetrics.top;
        int i11 = this.f17706f;
        int i12 = (int) (top + i11);
        if (this.f17704d) {
            canvas.drawCircle(right, i12, i11, this.f17705e);
        }
    }

    public void setHasIndicator(boolean hasIndicator) {
        this.f17703c = hasIndicator;
        setSelected(isSelected());
    }

    public void setNeedCheck(boolean needCheck) {
        if (this.f17704d != needCheck) {
            this.f17704d = needCheck;
            invalidate();
        }
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        this.f17701a.setSelected(selected);
        if (!this.f17703c) {
            this.f17702b.setVisibility(8);
        } else if (selected) {
            this.f17702b.setVisibility(0);
        } else {
            this.f17702b.setVisibility(4);
        }
        setNeedCheck(false);
    }

    public void setText(CharSequence text) {
        this.f17701a.setText(text);
        invalidate();
    }

    public FriendFacetTab(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FriendFacetTab(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17703c = false;
        this.f17704d = false;
        LayoutInflater.from(context).inflate(R.layout.friend_facet_tab, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.FriendFacetTab);
        this.f17703c = obtainStyledAttributes.getBoolean(4, false);
        CharSequence text = obtainStyledAttributes.getText(0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f17706f = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        int color = obtainStyledAttributes.getColor(2, 0);
        obtainStyledAttributes.recycle();
        TextView textView = (TextView) findViewById(R.id.tab_content);
        this.f17701a = textView;
        textView.setText(text);
        if (dimensionPixelSize > 0) {
            this.f17701a.setTextSize(0, dimensionPixelSize);
        }
        View findViewById = findViewById(R.id.tab_indicator);
        this.f17702b = findViewById;
        if (this.f17703c) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(4);
        }
        Paint paint = new Paint(1);
        this.f17705e = paint;
        paint.setColor(color);
        this.f17707g = i.a(context, 1.0f);
    }
}
