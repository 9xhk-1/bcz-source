package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c2 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f54365a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f54366b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f54367c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final lm f54368d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final mm f54369e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f54370f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54371g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54372h;

    public c2(@NonNull CoordinatorLayout rootView, @NonNull AppBarLayout appBar, @NonNull ImageView back, @NonNull lm classic, @NonNull mm poster, @NonNull Button settingDaka, @NonNull TextView settingDakaHint, @NonNull TextView title) {
        this.f54365a = rootView;
        this.f54366b = appBar;
        this.f54367c = back;
        this.f54368d = classic;
        this.f54369e = poster;
        this.f54370f = settingDaka;
        this.f54371g = settingDakaHint;
        this.f54372h = title;
    }

    @NonNull
    public static c2 a(@NonNull View rootView) {
        int i11 = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(rootView, R.id.app_bar);
        if (appBarLayout != null) {
            i11 = R.id.back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back);
            if (imageView != null) {
                i11 = R.id.classic;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.classic);
                if (findChildViewById != null) {
                    lm a11 = lm.a(findChildViewById);
                    i11 = R.id.poster;
                    View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.poster);
                    if (findChildViewById2 != null) {
                        mm a12 = mm.a(findChildViewById2);
                        i11 = R.id.setting_daka;
                        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.setting_daka);
                        if (button != null) {
                            i11 = R.id.setting_daka_hint;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.setting_daka_hint);
                            if (textView != null) {
                                i11 = android.R.id.title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, android.R.id.title);
                                if (textView2 != null) {
                                    return new c2((CoordinatorLayout) rootView, appBarLayout, imageView, a11, a12, button, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static c2 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static c2 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_settings_share_daka_poster, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f54365a;
    }
}
