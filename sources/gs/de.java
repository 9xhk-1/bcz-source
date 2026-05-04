package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.util.report.ExposureConstraintLayout;
import com.baicizhan.main.view.AspectRoundImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class de implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ExposureConstraintLayout f54622a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AspectRoundImageView f54623b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final AspectRoundImageView f54624c;

    public de(@NonNull ExposureConstraintLayout rootView, @NonNull AspectRoundImageView gridAdLeft, @NonNull AspectRoundImageView gridAdRight) {
        this.f54622a = rootView;
        this.f54623b = gridAdLeft;
        this.f54624c = gridAdRight;
    }

    @NonNull
    public static de a(@NonNull View rootView) {
        int i11 = R.id.grid_ad_left;
        AspectRoundImageView aspectRoundImageView = (AspectRoundImageView) ViewBindings.findChildViewById(rootView, R.id.grid_ad_left);
        if (aspectRoundImageView != null) {
            i11 = R.id.grid_ad_right;
            AspectRoundImageView aspectRoundImageView2 = (AspectRoundImageView) ViewBindings.findChildViewById(rootView, R.id.grid_ad_right);
            if (aspectRoundImageView2 != null) {
                return new de((ExposureConstraintLayout) rootView, aspectRoundImageView, aspectRoundImageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static de c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static de d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_grid_ad_card, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExposureConstraintLayout getRoot() {
        return this.f54622a;
    }
}
