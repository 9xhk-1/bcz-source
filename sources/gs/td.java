package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.util.report.ExposureFrameLayout;
import com.baicizhan.main.customview.banner.CarousalBannerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class td implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ExposureFrameLayout f56877a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final CarousalBannerView f56878b;

    public td(@NonNull ExposureFrameLayout rootView, @NonNull CarousalBannerView homeAdCarousal) {
        this.f56877a = rootView;
        this.f56878b = homeAdCarousal;
    }

    @NonNull
    public static td a(@NonNull View rootView) {
        CarousalBannerView carousalBannerView = (CarousalBannerView) ViewBindings.findChildViewById(rootView, R.id.home_ad_carousal);
        if (carousalBannerView != null) {
            return new td((ExposureFrameLayout) rootView, carousalBannerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.home_ad_carousal)));
    }

    @NonNull
    public static td c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static td d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_carousal_ad_card, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExposureFrameLayout getRoot() {
        return this.f56877a;
    }
}
