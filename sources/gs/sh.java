package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.view.WebBlankView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class sh implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final WebBlankView f56758a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Group f56759b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f56760c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56761d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56762e;

    public sh(@NonNull WebBlankView rootView, @NonNull Group group, @NonNull ImageView noproguardIcon, @NonNull TextView noproguardRetry, @NonNull TextView noproguardTip) {
        this.f56758a = rootView;
        this.f56759b = group;
        this.f56760c = noproguardIcon;
        this.f56761d = noproguardRetry;
        this.f56762e = noproguardTip;
    }

    @NonNull
    public static sh a(@NonNull View rootView) {
        int i11 = R.id.group;
        Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.group);
        if (group != null) {
            i11 = R.id.noproguard_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.noproguard_icon);
            if (imageView != null) {
                i11 = R.id.noproguard_retry;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.noproguard_retry);
                if (textView != null) {
                    i11 = R.id.noproguard_tip;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.noproguard_tip);
                    if (textView2 != null) {
                        return new sh((WebBlankView) rootView, group, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static sh c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static sh d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_bcz_web_error, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public WebBlankView getRoot() {
        return this.f56758a;
    }
}
