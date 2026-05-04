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
public final class mm implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55941a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f55942b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55943c;

    public mm(@NonNull RelativeLayout rootView, @NonNull ImageView posterSelectIcon, @NonNull LinearLayout posterTitle) {
        this.f55941a = rootView;
        this.f55942b = posterSelectIcon;
        this.f55943c = posterTitle;
    }

    @NonNull
    public static mm a(@NonNull View rootView) {
        int i11 = R.id.poster_select_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.poster_select_icon);
        if (imageView != null) {
            i11 = R.id.poster_title;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.poster_title);
            if (linearLayout != null) {
                return new mm((RelativeLayout) rootView, imageView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static mm c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static mm d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.setting_share_item_daka_poster, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55941a;
    }
}
