package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.RawRes;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f11314a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f11315b;

    /* renamed from: c, reason: collision with root package name */
    public int f11316c;

    /* renamed from: d, reason: collision with root package name */
    @StringRes
    public int f11317d;

    /* renamed from: e, reason: collision with root package name */
    @DrawableRes
    public int f11318e;

    /* renamed from: f, reason: collision with root package name */
    @ColorRes
    public int f11319f;

    /* renamed from: g, reason: collision with root package name */
    @RawRes
    public int f11320g;

    /* renamed from: h, reason: collision with root package name */
    public Object f11321h;

    /* renamed from: i, reason: collision with root package name */
    public C0186a f11322i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11323j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.aurelhubert.ahbottomnavigation.a$a, reason: collision with other inner class name */
    public static class C0186a {

        /* renamed from: a, reason: collision with root package name */
        public String f11324a;

        /* renamed from: b, reason: collision with root package name */
        @DrawableRes
        public int f11325b = 0;
    }

    public a(String title, @DrawableRes int resource) {
        this.f11316c = -7829368;
        this.f11317d = 0;
        this.f11319f = 0;
        this.f11320g = 0;
        this.f11323j = false;
        this.f11314a = title;
        this.f11318e = resource;
    }

    public C0186a a() {
        return this.f11322i;
    }

    public int b(Context context) {
        int i11 = this.f11319f;
        return i11 != 0 ? ContextCompat.getColor(context, i11) : this.f11316c;
    }

    public Drawable c(Context context) {
        int i11 = this.f11318e;
        if (i11 == 0) {
            return this.f11315b;
        }
        try {
            return AppCompatResources.getDrawable(context, i11);
        } catch (Resources.NotFoundException unused) {
            return ContextCompat.getDrawable(context, this.f11318e);
        }
    }

    public int d() {
        return this.f11320g;
    }

    public Object e() {
        return this.f11321h;
    }

    public String f(Context context) {
        int i11 = this.f11317d;
        return i11 != 0 ? context.getString(i11) : this.f11314a;
    }

    public boolean g() {
        return this.f11323j;
    }

    public void h(C0186a badge) {
        this.f11322i = badge;
    }

    public void i(@ColorInt int color) {
        this.f11316c = color;
        this.f11319f = 0;
    }

    public void j(@ColorRes int colorRes) {
        this.f11319f = colorRes;
        this.f11316c = 0;
    }

    public void k(@DrawableRes int drawableRes) {
        this.f11318e = drawableRes;
        this.f11315b = null;
    }

    public void l(Drawable drawable) {
        this.f11315b = drawable;
        this.f11318e = 0;
    }

    public void m(Object tag) {
        this.f11321h = tag;
    }

    public void n(@StringRes int titleRes) {
        this.f11317d = titleRes;
        this.f11314a = "";
    }

    public void o(String title) {
        this.f11314a = title;
        this.f11317d = 0;
    }

    public void p(boolean useOriginalDrawable) {
        this.f11323j = useOriginalDrawable;
    }

    public a(String title, @RawRes int resource, boolean lottie) {
        this.f11316c = -7829368;
        this.f11317d = 0;
        this.f11318e = 0;
        this.f11319f = 0;
        this.f11320g = 0;
        this.f11323j = false;
        this.f11314a = title;
        if (lottie) {
            this.f11320g = resource;
        }
    }

    @Deprecated
    public a(String title, @DrawableRes int resource, @ColorRes int color) {
        this.f11317d = 0;
        this.f11319f = 0;
        this.f11320g = 0;
        this.f11323j = false;
        this.f11314a = title;
        this.f11318e = resource;
        this.f11316c = color;
    }

    public a(@StringRes int titleRes, @DrawableRes int drawableRes, @ColorRes int colorRes) {
        this.f11314a = "";
        this.f11316c = -7829368;
        this.f11320g = 0;
        this.f11323j = false;
        this.f11317d = titleRes;
        this.f11318e = drawableRes;
        this.f11319f = colorRes;
    }

    public a(String title, Drawable drawable) {
        this.f11316c = -7829368;
        this.f11317d = 0;
        this.f11318e = 0;
        this.f11319f = 0;
        this.f11320g = 0;
        this.f11323j = false;
        this.f11314a = title;
        this.f11315b = drawable;
    }

    public a(String title, Drawable drawable, @ColorInt int color) {
        this.f11317d = 0;
        this.f11318e = 0;
        this.f11319f = 0;
        this.f11320g = 0;
        this.f11323j = false;
        this.f11314a = title;
        this.f11315b = drawable;
        this.f11316c = color;
    }
}
