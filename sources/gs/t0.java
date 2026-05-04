package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.jiongji.andriod.card.R;
import com.rd.PageIndicatorView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class t0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56809a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final PageIndicatorView f56810b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ViewPager f56811c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56812d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56813e;

    public t0(@NonNull RelativeLayout rootView, @NonNull PageIndicatorView bannerIndicator, @NonNull ViewPager pages, @NonNull TextView skip, @NonNull TextView start) {
        this.f56809a = rootView;
        this.f56810b = bannerIndicator;
        this.f56811c = pages;
        this.f56812d = skip;
        this.f56813e = start;
    }

    @NonNull
    public static t0 a(@NonNull View rootView) {
        int i11 = R.id.banner_indicator;
        PageIndicatorView pageIndicatorView = (PageIndicatorView) ViewBindings.findChildViewById(rootView, R.id.banner_indicator);
        if (pageIndicatorView != null) {
            i11 = R.id.pages;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.pages);
            if (viewPager != null) {
                i11 = R.id.skip;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.skip);
                if (textView != null) {
                    i11 = R.id.start;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.start);
                    if (textView2 != null) {
                        return new t0((RelativeLayout) rootView, pageIndicatorView, viewPager, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static t0 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static t0 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_guide, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56809a;
    }
}
