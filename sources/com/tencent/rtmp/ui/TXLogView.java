package com.tencent.rtmp.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXLogView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    StringBuffer f44704a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f44705b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f44706c;

    /* renamed from: d, reason: collision with root package name */
    private ScrollView f44707d;

    /* renamed from: e, reason: collision with root package name */
    private ScrollView f44708e;

    /* renamed from: f, reason: collision with root package name */
    private final int f44709f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f44710g;

    public TXLogView(Context context) {
        this(context, null);
    }

    public static int a(Context context, float f11) {
        return (int) ((f11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public TXLogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44704a = new StringBuffer("");
        this.f44709f = 3000;
        this.f44710g = false;
        setOrientation(1);
        this.f44705b = new TextView(context);
        this.f44706c = new TextView(context);
        this.f44707d = new ScrollView(context);
        this.f44708e = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 0.2f;
        this.f44707d.setLayoutParams(layoutParams);
        this.f44707d.setBackgroundColor(1627389951);
        this.f44707d.setVerticalScrollBarEnabled(true);
        this.f44707d.setScrollbarFadingEnabled(true);
        this.f44705b.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f44705b.setTextSize(2, 11.0f);
        this.f44705b.setTextColor(-16777216);
        this.f44705b.setTypeface(Typeface.MONOSPACE, 1);
        this.f44705b.setLineSpacing(4.0f, 1.0f);
        this.f44705b.setPadding(a(context, 2.0f), a(context, 2.0f), a(context, 2.0f), a(context, 2.0f));
        this.f44707d.addView(this.f44705b);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 0.8f;
        layoutParams2.topMargin = a(context, 2.0f);
        this.f44708e.setLayoutParams(layoutParams2);
        this.f44708e.setBackgroundColor(1627389951);
        this.f44708e.setVerticalScrollBarEnabled(true);
        this.f44708e.setScrollbarFadingEnabled(true);
        this.f44706c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f44706c.setTextSize(2, 13.0f);
        this.f44706c.setTextColor(-16777216);
        this.f44706c.setPadding(a(context, 2.0f), a(context, 2.0f), a(context, 2.0f), a(context, 2.0f));
        this.f44708e.addView(this.f44706c);
        addView(this.f44707d);
        addView(this.f44708e);
        setVisibility(8);
    }
}
