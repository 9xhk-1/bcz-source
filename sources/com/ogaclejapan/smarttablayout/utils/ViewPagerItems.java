package com.ogaclejapan.smarttablayout.utils;

import android.content.Context;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import gt.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ViewPagerItems extends PagerItems<c> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPagerItems f41546a;

        public a(Context context) {
            this.f41546a = new ViewPagerItems(context);
        }

        public a a(@StringRes int i11, float f11, @LayoutRes int i12) {
            return c(c.d(this.f41546a.getContext().getString(i11), f11, i12));
        }

        public a b(@StringRes int i11, @LayoutRes int i12) {
            return c(c.e(this.f41546a.getContext().getString(i11), i12));
        }

        public a c(c cVar) {
            this.f41546a.add(cVar);
            return this;
        }

        public a d(CharSequence charSequence, @LayoutRes int i11) {
            return c(c.e(charSequence, i11));
        }

        public ViewPagerItems e() {
            return this.f41546a;
        }
    }

    public ViewPagerItems(Context context) {
        super(context);
    }

    public static a with(Context context) {
        return new a(context);
    }
}
