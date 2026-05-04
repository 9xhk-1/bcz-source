package com.baicizhan.main.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class NumberView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public int[] f20085a;

    /* renamed from: b, reason: collision with root package name */
    public int f20086b;

    /* renamed from: c, reason: collision with root package name */
    public int f20087c;

    public NumberView(Context context) {
        super(context);
        this.f20085a = new int[]{R.drawable.daka_poster_mix_0, R.drawable.daka_poster_mix_1, R.drawable.daka_poster_mix_2, R.drawable.daka_poster_mix_3, R.drawable.daka_poster_mix_4, R.drawable.daka_poster_mix_5, R.drawable.daka_poster_mix_6, R.drawable.daka_poster_mix_7, R.drawable.daka_poster_mix_8, R.drawable.daka_poster_mix_9};
        b(context, null, R.style.DefaultNumberView);
    }

    public final void a(int index) {
        ImageView imageView = new ImageView(getContext());
        imageView.setBackgroundResource(this.f20085a[index]);
        addView(imageView, 0, new LinearLayout.LayoutParams(this.f20086b, this.f20087c));
    }

    public final void b(Context context, AttributeSet attrs, int defStyleRes) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.NumberView, 0, defStyleRes);
        this.f20086b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f20087c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(17);
    }

    public void setNumber(int number) {
        removeAllViews();
        if (number < 0) {
            number = 0;
        } else if (number >= 100000) {
            number = DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE;
        }
        do {
            a(number % 10);
            number /= 10;
        } while (number > 0);
    }

    public NumberView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f20085a = new int[]{R.drawable.daka_poster_mix_0, R.drawable.daka_poster_mix_1, R.drawable.daka_poster_mix_2, R.drawable.daka_poster_mix_3, R.drawable.daka_poster_mix_4, R.drawable.daka_poster_mix_5, R.drawable.daka_poster_mix_6, R.drawable.daka_poster_mix_7, R.drawable.daka_poster_mix_8, R.drawable.daka_poster_mix_9};
        b(context, attrs, R.style.DefaultNumberView);
    }

    public NumberView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f20085a = new int[]{R.drawable.daka_poster_mix_0, R.drawable.daka_poster_mix_1, R.drawable.daka_poster_mix_2, R.drawable.daka_poster_mix_3, R.drawable.daka_poster_mix_4, R.drawable.daka_poster_mix_5, R.drawable.daka_poster_mix_6, R.drawable.daka_poster_mix_7, R.drawable.daka_poster_mix_8, R.drawable.daka_poster_mix_9};
        b(context, attrs, R.style.DefaultNumberView);
    }
}
