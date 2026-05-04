package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d1 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54528a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54529b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f54530c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54531d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageButton f54532e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ProgressBar f54533f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54534g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54535h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Space f54536i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f54537j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f54538k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ImageView f54539l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f54540m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54541n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54542o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f54543p;

    public d1(@NonNull RelativeLayout rootView, @NonNull ConstraintLayout adBottom, @NonNull View adClickRect, @NonNull TextView adClickText, @NonNull ImageButton close, @NonNull ProgressBar copyRootProgress, @NonNull TextView copyRootProgressText, @NonNull LinearLayout copyRootProgressWrap, @NonNull Space extraPaddingTop, @NonNull ImageView ivCopyright, @NonNull ImageView logo, @NonNull ImageView sloganOfS, @NonNull TextView splashAdMark, @NonNull LinearLayout thirdAd, @NonNull ConstraintLayout thirdAdContainner, @NonNull TextView thridExitButton) {
        this.f54528a = rootView;
        this.f54529b = adBottom;
        this.f54530c = adClickRect;
        this.f54531d = adClickText;
        this.f54532e = close;
        this.f54533f = copyRootProgress;
        this.f54534g = copyRootProgressText;
        this.f54535h = copyRootProgressWrap;
        this.f54536i = extraPaddingTop;
        this.f54537j = ivCopyright;
        this.f54538k = logo;
        this.f54539l = sloganOfS;
        this.f54540m = splashAdMark;
        this.f54541n = thirdAd;
        this.f54542o = thirdAdContainner;
        this.f54543p = thridExitButton;
    }

    @NonNull
    public static d1 a(@NonNull View rootView) {
        int i11 = R.id.ad_bottom;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.ad_bottom);
        if (constraintLayout != null) {
            i11 = R.id.ad_click_rect;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.ad_click_rect);
            if (findChildViewById != null) {
                i11 = R.id.ad_click_text;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.ad_click_text);
                if (textView != null) {
                    i11 = R.id.close;
                    ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.close);
                    if (imageButton != null) {
                        i11 = R.id.copy_root_progress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.copy_root_progress);
                        if (progressBar != null) {
                            i11 = R.id.copy_root_progress_text;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.copy_root_progress_text);
                            if (textView2 != null) {
                                i11 = R.id.copy_root_progress_wrap;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.copy_root_progress_wrap);
                                if (linearLayout != null) {
                                    i11 = R.id.extra_padding_top;
                                    Space space = (Space) ViewBindings.findChildViewById(rootView, R.id.extra_padding_top);
                                    if (space != null) {
                                        i11 = R.id.iv_copyright;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_copyright);
                                        if (imageView != null) {
                                            i11 = R.id.logo;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.logo);
                                            if (imageView2 != null) {
                                                i11 = R.id.slogan_of_s;
                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.slogan_of_s);
                                                if (imageView3 != null) {
                                                    i11 = R.id.splash_ad_mark;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.splash_ad_mark);
                                                    if (textView3 != null) {
                                                        i11 = R.id.third_ad;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.third_ad);
                                                        if (linearLayout2 != null) {
                                                            i11 = R.id.third_ad_containner;
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.third_ad_containner);
                                                            if (constraintLayout2 != null) {
                                                                i11 = R.id.thrid_exit_button;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.thrid_exit_button);
                                                                if (textView4 != null) {
                                                                    return new d1((RelativeLayout) rootView, constraintLayout, findChildViewById, textView, imageButton, progressBar, textView2, linearLayout, space, imageView, imageView2, imageView3, textView3, linearLayout2, constraintLayout2, textView4);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static d1 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static d1 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_loading_page, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f54528a;
    }
}
