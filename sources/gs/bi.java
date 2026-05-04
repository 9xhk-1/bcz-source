package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class bi implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54293a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f54294b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f54295c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54296d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54297e;

    public bi(@NonNull RelativeLayout rootView, @NonNull View anchor, @NonNull ImageView arrow, @NonNull RelativeLayout newUserExperience, @NonNull TextView tip) {
        this.f54293a = rootView;
        this.f54294b = anchor;
        this.f54295c = arrow;
        this.f54296d = newUserExperience;
        this.f54297e = tip;
    }

    @NonNull
    public static bi a(@NonNull View rootView) {
        int i11 = R.id.anchor;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.anchor);
        if (findChildViewById != null) {
            i11 = R.id.arrow;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.arrow);
            if (imageView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) rootView;
                i11 = R.id.tip;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tip);
                if (textView != null) {
                    return new bi(relativeLayout, findChildViewById, imageView, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static bi c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static bi d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_guide_new_user_experience, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f54293a;
    }
}
