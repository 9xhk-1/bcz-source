package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class TabItem extends View {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f32228a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f32229b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32230c;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.TabItem);
        this.f32228a = obtainStyledAttributes.getText(R.styleable.TabItem_android_text);
        this.f32229b = obtainStyledAttributes.getDrawable(R.styleable.TabItem_android_icon);
        this.f32230c = obtainStyledAttributes.getResourceId(R.styleable.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}
