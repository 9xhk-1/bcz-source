package com.baicizhan.client.wordtesting.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.jiongji.andriod.card.R;
import xb.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class BookIconView extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f17789d = {"初中", "高中", "新概念", "象形9000"};

    /* renamed from: a, reason: collision with root package name */
    public ImageView f17790a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f17791b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f17792c;

    public BookIconView(Context context) {
        super(context);
        c();
    }

    public final void a(View view, float widthDp, float heightDp) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = i.a(getContext(), widthDp);
        layoutParams.height = i.a(getContext(), heightDp);
        this.f17790a.setLayoutParams(layoutParams);
    }

    public final void b(View view, float topMarginDp) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i.a(getContext(), topMarginDp);
        view.setLayoutParams(layoutParams);
    }

    public final void c() {
        LayoutInflater.from(getContext()).inflate(R.layout.book_icon_view_layout, (ViewGroup) this, true);
        this.f17790a = (ImageView) findViewById(R.id.background);
        this.f17791b = (TextView) findViewById(R.id.title);
        TextView textView = (TextView) findViewById(R.id.subtitle);
        this.f17792c = textView;
        textView.setShadowLayer(10.0f, 0.0f, 0.0f, -3833842);
    }

    public void setBookName(String bookName) {
        String[] strArr;
        String str = "实体配套";
        if (bookName.startsWith("实体配套")) {
            bookName = bookName.substring(4);
        } else {
            int i11 = 0;
            while (true) {
                strArr = f17789d;
                if (i11 >= strArr.length) {
                    i11 = -1;
                    break;
                } else if (bookName.startsWith(strArr[i11])) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 >= 0) {
                String str2 = strArr[i11];
                str = bookName.substring(str2.length());
                bookName = str2;
            } else {
                str = "";
            }
        }
        if (bookName.length() <= 2) {
            bookName = bookName + "词汇";
        }
        Log.d("leijie", "title " + bookName + ", subtitle " + str);
        this.f17791b.setText(bookName);
        if (!TextUtils.isEmpty(str)) {
            this.f17790a.setImageResource(R.drawable.medal_2_normal_default);
            a(this.f17790a, 60.0f, 50.0f);
            this.f17791b.setText(bookName);
            b(this.f17791b, 21.0f);
            this.f17792c.setVisibility(0);
            this.f17792c.setText(str);
            b(this.f17792c, 34.5f);
            return;
        }
        this.f17792c.setVisibility(8);
        if (this.f17791b.length() <= 4) {
            this.f17790a.setImageResource(R.drawable.medal_1_normal_default);
            a(this.f17790a, 52.0f, 54.0f);
            this.f17791b.setText(bookName);
            b(this.f17791b, 23.0f);
            return;
        }
        this.f17790a.setImageResource(R.drawable.medal_3_normal_default);
        a(this.f17790a, 52.0f, 54.0f);
        this.f17791b.setText(bookName);
        b(this.f17791b, 20.5f);
        this.f17792c.setVisibility(8);
    }

    public BookIconView(Context context, AttributeSet attrs) {
        super(context, attrs);
        c();
    }

    public BookIconView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        c();
    }
}
