package com.baicizhan.main.customview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.baicizhan.client.business.widget.CircleProgressView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class OfflineDownloadView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public ImageView f20088a;

    /* renamed from: b, reason: collision with root package name */
    public CircleProgressView f20089b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f20090c;

    /* renamed from: d, reason: collision with root package name */
    public int f20091d;

    public OfflineDownloadView(Context context) {
        this(context, null, 0);
    }

    public void a() {
        this.f20088a.setVisibility(0);
        this.f20089b.setVisibility(4);
        this.f20088a.setImageResource(R.drawable.ic_cloud_downloaded);
    }

    public void b() {
        this.f20088a.setVisibility(0);
        this.f20088a.setImageResource(R.drawable.ic_cloud_download);
        this.f20089b.setVisibility(4);
        this.f20089b.setProgress(0);
    }

    public void c() {
        this.f20088a.setVisibility(0);
        this.f20089b.setVisibility(4);
        this.f20088a.setImageResource(R.drawable.ic_cloud_download_resume);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f20088a = (ImageView) findViewById(R.id.state_image);
        this.f20089b = (CircleProgressView) findViewById(R.id.progress);
        this.f20090c = (TextView) findViewById(R.id.text);
        this.f20088a.setImageTintList(ColorStateList.valueOf(this.f20091d));
        this.f20089b.a(this.f20091d);
        this.f20090c.setTextColor(this.f20091d);
    }

    public void setProgress(int progress) {
        this.f20088a.setVisibility(4);
        this.f20089b.setVisibility(0);
        this.f20089b.setProgress(progress);
    }

    public void setText(CharSequence text) {
        this.f20090c.setText(text);
    }

    public OfflineDownloadView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public void setText(int resId) {
        this.f20090c.setText(resId);
    }

    public OfflineDownloadView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LayoutInflater.from(context).inflate(R.layout.offline_download_view, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.OfflineDownloadView);
        this.f20091d = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
    }
}
