package com.baicizhan.main.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ClozeTraditionHintView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f19999a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f20000b;

    public ClozeTraditionHintView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.cloze_tradition_hint_view, (ViewGroup) this, true);
    }

    public TextView getHintView() {
        return this.f19999a;
    }

    public ImageView getImageView() {
        return this.f20000b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f19999a = (TextView) findViewById(R.id.text);
        this.f20000b = (ImageView) findViewById(R.id.image);
    }

    public void setImage(Bitmap image) {
        this.f20000b.setImageBitmap(image);
    }

    public void setText(CharSequence text) {
        this.f19999a.setText(text);
    }
}
