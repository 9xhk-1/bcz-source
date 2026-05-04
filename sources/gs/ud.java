package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.util.report.ExposureFrameLayout;
import com.baicizhan.main.view.AspectRoundImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ud implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ExposureFrameLayout f57003a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AspectRoundImageView f57004b;

    public ud(@NonNull ExposureFrameLayout rootView, @NonNull AspectRoundImageView ad2) {
        this.f57003a = rootView;
        this.f57004b = ad2;
    }

    @NonNull
    public static ud a(@NonNull View rootView) {
        AspectRoundImageView aspectRoundImageView = (AspectRoundImageView) ViewBindings.findChildViewById(rootView, R.id.ad);
        if (aspectRoundImageView != null) {
            return new ud((ExposureFrameLayout) rootView, aspectRoundImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.ad)));
    }

    @NonNull
    public static ud c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ud d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_carousal_ad_content, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExposureFrameLayout getRoot() {
        return this.f57003a;
    }
}
