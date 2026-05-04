package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f31143a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final a f31144b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final a f31145c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final a f31146d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final a f31147e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final a f31148f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final a f31149g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Paint f31150h;

    public b(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(sn.b.g(context, R.attr.materialCalendarStyle, j.class.getCanonicalName()), R.styleable.MaterialCalendar);
        this.f31143a = a.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayStyle, 0));
        this.f31149g = a.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f31144b = a.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f31145c = a.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a11 = sn.c.a(context, obtainStyledAttributes, R.styleable.MaterialCalendar_rangeFillColor);
        this.f31146d = a.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearStyle, 0));
        this.f31147e = a.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f31148f = a.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f31150h = paint;
        paint.setColor(a11.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
