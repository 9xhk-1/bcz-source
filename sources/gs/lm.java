package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class lm implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55798a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f55799b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55800c;

    public lm(@NonNull RelativeLayout rootView, @NonNull ImageView classicSelectIcon, @NonNull LinearLayout classicTitle) {
        this.f55798a = rootView;
        this.f55799b = classicSelectIcon;
        this.f55800c = classicTitle;
    }

    @NonNull
    public static lm a(@NonNull View rootView) {
        int i11 = R.id.classic_select_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.classic_select_icon);
        if (imageView != null) {
            i11 = R.id.classic_title;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.classic_title);
            if (linearLayout != null) {
                return new lm((RelativeLayout) rootView, imageView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static lm c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static lm d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.setting_share_item_daka_classic, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55798a;
    }
}
