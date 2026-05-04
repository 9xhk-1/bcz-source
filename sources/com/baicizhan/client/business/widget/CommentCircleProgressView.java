package com.baicizhan.client.business.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jiongji.andriod.card.R;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CommentCircleProgressView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public CircleProgressView f16999a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f17000b;

    public CommentCircleProgressView(Context context) {
        super(context);
        a(context, null);
    }

    public final void a(Context context, AttributeSet attrs) {
        setOrientation(1);
        setGravity(1);
        CircleProgressView circleProgressView = new CircleProgressView(context, attrs);
        this.f16999a = circleProgressView;
        addView(circleProgressView, -2, -2);
        TextView textView = new TextView(context);
        this.f17000b = textView;
        textView.setPadding(0, f.a(context, 4.0f), 0, 0);
        this.f17000b.setIncludeFontPadding(false);
        this.f17000b.setGravity(17);
        this.f17000b.setTextColor(getResources().getColor(R.color.main_color_word_b8));
        this.f17000b.setTextSize(1, 8.0f);
        addView(this.f17000b, -2, -2);
    }

    public void setComment(CharSequence comment) {
        this.f17000b.setText(comment);
    }

    public void setCommentColor(int color) {
        this.f17000b.setTextColor(color);
    }

    public void setCommentSize(int sizePx) {
        this.f17000b.setTextSize(0, sizePx);
    }

    public void setDividerHeight(int height) {
        TextView textView = this.f17000b;
        textView.setPadding(textView.getPaddingLeft(), height, this.f17000b.getPaddingRight(), this.f17000b.getPaddingBottom());
    }

    public void setMaxProgress(int maxProgress) {
        this.f16999a.setMaxProgress(maxProgress);
    }

    public void setProgress(int progress) {
        this.f16999a.setProgress(progress);
    }

    public void setComment(int resId) {
        this.f17000b.setText(resId);
    }

    public CommentCircleProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);
        a(context, attrs);
    }
}
