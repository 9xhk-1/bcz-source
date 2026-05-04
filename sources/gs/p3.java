package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class p3 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56288a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56289b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f56290c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56291d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56292e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56293f;

    public p3(@NonNull ConstraintLayout rootView, @NonNull ImageView adCard, @NonNull View adClickRect, @NonNull ConstraintLayout adContent, @NonNull ProgressBar adLoading, @NonNull TextView tip) {
        this.f56288a = rootView;
        this.f56289b = adCard;
        this.f56290c = adClickRect;
        this.f56291d = adContent;
        this.f56292e = adLoading;
        this.f56293f = tip;
    }

    @NonNull
    public static p3 a(@NonNull View rootView) {
        int i11 = R.id.ad_card;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ad_card);
        if (imageView != null) {
            i11 = R.id.ad_click_rect;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.ad_click_rect);
            if (findChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                i11 = R.id.ad_loading;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.ad_loading);
                if (progressBar != null) {
                    i11 = R.id.tip;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tip);
                    if (textView != null) {
                        return new p3(constraintLayout, imageView, findChildViewById, constraintLayout, progressBar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static p3 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static p3 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.advertisement_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f56288a;
    }
}
