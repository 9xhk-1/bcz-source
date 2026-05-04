package com.ogaclejapan.smarttablayout.utils.v4;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.ogaclejapan.smarttablayout.utils.PagerItems;
import ht.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class FragmentPagerItems extends PagerItems<b> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final FragmentPagerItems f41547a;

        public a(Context context) {
            this.f41547a = new FragmentPagerItems(context);
        }

        public a a(@StringRes int i11, float f11, Class<? extends Fragment> cls) {
            return e(b.f(this.f41547a.getContext().getString(i11), f11, cls));
        }

        public a b(@StringRes int i11, float f11, Class<? extends Fragment> cls, Bundle bundle) {
            return e(b.g(this.f41547a.getContext().getString(i11), f11, cls, bundle));
        }

        public a c(@StringRes int i11, Class<? extends Fragment> cls) {
            return e(b.h(this.f41547a.getContext().getString(i11), cls));
        }

        public a d(@StringRes int i11, Class<? extends Fragment> cls, Bundle bundle) {
            return e(b.i(this.f41547a.getContext().getString(i11), cls, bundle));
        }

        public a e(b bVar) {
            this.f41547a.add(bVar);
            return this;
        }

        public a f(CharSequence charSequence, Class<? extends Fragment> cls) {
            return e(b.h(charSequence, cls));
        }

        public a g(CharSequence charSequence, Class<? extends Fragment> cls, Bundle bundle) {
            return e(b.i(charSequence, cls, bundle));
        }

        public FragmentPagerItems h() {
            return this.f41547a;
        }
    }

    public FragmentPagerItems(Context context) {
        super(context);
    }

    public static a with(Context context) {
        return new a(context);
    }
}
