package com.baicizhan.main.customview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SkillTrainingMainItemView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public ImageView f20168a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f20169b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f20170c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f20171d;

    public SkillTrainingMainItemView(Context context) {
        super(context);
    }

    public SkillTrainingMainItemView a(int resId) {
        this.f20168a.setImageResource(resId);
        return this;
    }

    public SkillTrainingMainItemView b(View.OnClickListener listener) {
        setOnClickListener(listener);
        return this;
    }

    public SkillTrainingMainItemView c(int subtitle) {
        this.f20170c.setText(subtitle);
        if (!TextUtils.isEmpty(this.f20170c.getText())) {
            this.f20170c.setVisibility(0);
        }
        return this;
    }

    public SkillTrainingMainItemView d(int count, int max) {
        if (max == 0) {
            count = 0;
        }
        this.f20171d.setText(count + "/" + max);
        this.f20171d.setVisibility(0);
        return this;
    }

    public SkillTrainingMainItemView e(int title) {
        this.f20169b.setText(title);
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f20168a = (ImageView) findViewById(R.id.type_img);
        this.f20169b = (TextView) findViewById(R.id.title);
        this.f20170c = (TextView) findViewById(R.id.category);
        this.f20171d = (TextView) findViewById(R.id.progress_text);
    }

    public SkillTrainingMainItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SkillTrainingMainItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
