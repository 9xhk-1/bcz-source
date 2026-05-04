package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class j5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55427a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f55428b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55429c;

    public j5(@NonNull ConstraintLayout rootView, @NonNull ViewPager2 bannerViewpager, @NonNull LinearLayout indicatorLayout) {
        this.f55427a = rootView;
        this.f55428b = bannerViewpager;
        this.f55429c = indicatorLayout;
    }

    @NonNull
    public static j5 a(@NonNull View rootView) {
        int i11 = R.id.banner_viewpager;
        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(rootView, R.id.banner_viewpager);
        if (viewPager2 != null) {
            i11 = R.id.indicator_layout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.indicator_layout);
            if (linearLayout != null) {
                return new j5((ConstraintLayout) rootView, viewPager2, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static j5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static j5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.carousal_banner_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f55427a;
    }
}
