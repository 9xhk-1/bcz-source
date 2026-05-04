package ht;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends gt.b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f59779f = "FragmentPagerItem";

    /* renamed from: g, reason: collision with root package name */
    public static final String f59780g = "FragmentPagerItem:Position";

    /* renamed from: d, reason: collision with root package name */
    public final String f59781d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f59782e;

    public b(CharSequence charSequence, float f11, String str, Bundle bundle) {
        super(charSequence, f11);
        this.f59781d = str;
        this.f59782e = bundle;
    }

    public static int c(Bundle bundle) {
        if (d(bundle)) {
            return bundle.getInt(f59780g);
        }
        return 0;
    }

    public static boolean d(Bundle bundle) {
        return bundle != null && bundle.containsKey(f59780g);
    }

    public static b f(CharSequence charSequence, float f11, Class<? extends Fragment> cls) {
        return g(charSequence, f11, cls, new Bundle());
    }

    public static b g(CharSequence charSequence, float f11, Class<? extends Fragment> cls, Bundle bundle) {
        return new b(charSequence, f11, cls.getName(), bundle);
    }

    public static b h(CharSequence charSequence, Class<? extends Fragment> cls) {
        return f(charSequence, 1.0f, cls);
    }

    public static b i(CharSequence charSequence, Class<? extends Fragment> cls, Bundle bundle) {
        return g(charSequence, 1.0f, cls, bundle);
    }

    public static void j(Bundle bundle, int i11) {
        bundle.putInt(f59780g, i11);
    }

    public Fragment e(Context context, int i11) {
        j(this.f59782e, i11);
        return Fragment.instantiate(context, this.f59781d, this.f59782e);
    }
}
