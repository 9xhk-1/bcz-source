package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class gf implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55064a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f55065b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55066c;

    public gf(@NonNull FrameLayout rootView, @NonNull AppCompatImageView identityIcon, @NonNull TextView identityName) {
        this.f55064a = rootView;
        this.f55065b = identityIcon;
        this.f55066c = identityName;
    }

    @NonNull
    public static gf a(@NonNull View rootView) {
        int i11 = R.id.identity_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.identity_icon);
        if (appCompatImageView != null) {
            i11 = R.id.identity_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.identity_name);
            if (textView != null) {
                return new gf((FrameLayout) rootView, appCompatImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static gf c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static gf d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_user_identity, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f55064a;
    }
}
