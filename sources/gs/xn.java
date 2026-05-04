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
public final class xn implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57495a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57496b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f57497c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57498d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57499e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57500f;

    public xn(@NonNull RelativeLayout rootView, @NonNull LinearLayout shareQzone, @NonNull ImageView shareWeixinClose, @NonNull RelativeLayout shareWeixinContainer, @NonNull LinearLayout shareWeixinFriends, @NonNull LinearLayout shareWeixinTimeline) {
        this.f57495a = rootView;
        this.f57496b = shareQzone;
        this.f57497c = shareWeixinClose;
        this.f57498d = shareWeixinContainer;
        this.f57499e = shareWeixinFriends;
        this.f57500f = shareWeixinTimeline;
    }

    @NonNull
    public static xn a(@NonNull View rootView) {
        int i11 = R.id.share_qzone;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_qzone);
        if (linearLayout != null) {
            i11 = R.id.share_weixin_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_weixin_close);
            if (imageView != null) {
                i11 = R.id.share_weixin_container;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.share_weixin_container);
                if (relativeLayout != null) {
                    i11 = R.id.share_weixin_friends;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_weixin_friends);
                    if (linearLayout2 != null) {
                        i11 = R.id.share_weixin_timeline;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_weixin_timeline);
                        if (linearLayout3 != null) {
                            return new xn((RelativeLayout) rootView, linearLayout, imageView, relativeLayout, linearLayout2, linearLayout3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static xn c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static xn d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.tv_share_weixin_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f57495a;
    }
}
