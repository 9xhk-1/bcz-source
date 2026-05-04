package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.main.customview.MainPopdownMessageView;
import com.jiongji.andriod.card.R;
import com.makeramen.roundedimageview.RoundedImageView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ti implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final MainPopdownMessageView f56887a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f56888b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f56889c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f56890d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56891e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56892f;

    public ti(@NonNull MainPopdownMessageView rootView, @NonNull RoundedImageView adImage, @NonNull ImageView icon, @NonNull ImageView notificationClose, @NonNull ConstraintLayout notificationContainer, @NonNull TextView notificationTitle) {
        this.f56887a = rootView;
        this.f56888b = adImage;
        this.f56889c = icon;
        this.f56890d = notificationClose;
        this.f56891e = notificationContainer;
        this.f56892f = notificationTitle;
    }

    @NonNull
    public static ti a(@NonNull View rootView) {
        int i11 = R.id.ad_image;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.ad_image);
        if (roundedImageView != null) {
            i11 = R.id.icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
            if (imageView != null) {
                i11 = R.id.notification_close;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.notification_close);
                if (imageView2 != null) {
                    i11 = R.id.notification_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.notification_container);
                    if (constraintLayout != null) {
                        i11 = R.id.notification_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.notification_title);
                        if (textView != null) {
                            return new ti((MainPopdownMessageView) rootView, roundedImageView, imageView, imageView2, constraintLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ti c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ti d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_pop_down_message, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public MainPopdownMessageView getRoot() {
        return this.f56887a;
    }
}
