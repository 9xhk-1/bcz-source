package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
public final class k5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55572a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f55573b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55574c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55575d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55576e;

    public k5(@NonNull RelativeLayout rootView, @NonNull ImageView image, @NonNull FrameLayout imageContainer, @NonNull TextView name, @NonNull RelativeLayout root) {
        this.f55572a = rootView;
        this.f55573b = image;
        this.f55574c = imageContainer;
        this.f55575d = name;
        this.f55576e = root;
    }

    @NonNull
    public static k5 a(@NonNull View rootView) {
        int i11 = R.id.image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
        if (imageView != null) {
            i11 = R.id.image_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.image_container);
            if (frameLayout != null) {
                i11 = R.id.name;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                if (textView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) rootView;
                    return new k5(relativeLayout, imageView, frameLayout, textView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static k5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static k5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.category_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55572a;
    }
}
