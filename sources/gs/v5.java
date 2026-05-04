package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;
import com.soundcloud.android.crop.CropImageView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class v5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57129a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final CropImageView f57130b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final w5 f57131c;

    public v5(@NonNull RelativeLayout rootView, @NonNull CropImageView cropImage, @NonNull w5 doneCancelBar) {
        this.f57129a = rootView;
        this.f57130b = cropImage;
        this.f57131c = doneCancelBar;
    }

    @NonNull
    public static v5 a(@NonNull View rootView) {
        int i11 = R.id.crop_image;
        CropImageView cropImageView = (CropImageView) ViewBindings.findChildViewById(rootView, R.id.crop_image);
        if (cropImageView != null) {
            i11 = R.id.done_cancel_bar;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.done_cancel_bar);
            if (findChildViewById != null) {
                return new v5((RelativeLayout) rootView, cropImageView, w5.a(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static v5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static v5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.crop__activity_crop, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f57129a;
    }
}
