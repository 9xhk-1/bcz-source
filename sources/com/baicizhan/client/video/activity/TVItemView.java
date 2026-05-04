package com.baicizhan.client.video.activity;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.baicizhan.client.business.widget.AspectImageView;
import com.baicizhan.client.video.data.WordTVInfo;
import com.jiongji.andriod.card.R;
import hc.c;
import i9.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class TVItemView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f17726a;

    /* renamed from: b, reason: collision with root package name */
    public AspectImageView f17727b;

    /* renamed from: c, reason: collision with root package name */
    public GradientDrawable f17728c;

    public TVItemView(Context context) {
        this(context, null, 0);
    }

    public void a(WordTVInfo tvInfo) {
        this.f17726a.setText(tvInfo.n());
        if (TextUtils.isEmpty(tvInfo.k())) {
            this.f17727b.setImageResource(R.drawable.tv_default_normal_default);
        } else {
            c.l(tvInfo.k()).j(R.drawable.tv_default_normal_default).f(R.drawable.tv_default_normal_default).o(this.f17727b);
        }
        if (o.q(getContext(), tvInfo.l())) {
            setForeground(this.f17728c);
        } else {
            setForeground(null);
        }
    }

    public TVItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TVItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.tv_item_view, (ViewGroup) this, true);
        this.f17726a = (TextView) findViewById(R.id.topic_word);
        AspectImageView aspectImageView = (AspectImageView) findViewById(R.id.snapshot);
        this.f17727b = aspectImageView;
        aspectImageView.a(16, 9);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f17728c = gradientDrawable;
        gradientDrawable.setShape(0);
        this.f17728c.setColor(-1504081998);
    }
}
