package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class v4 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57125a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f57126b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57127c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57128d;

    public v4(@NonNull FrameLayout rootView, @NonNull ImageView background, @NonNull TextView subtitle, @NonNull TextView title) {
        this.f57125a = rootView;
        this.f57126b = background;
        this.f57127c = subtitle;
        this.f57128d = title;
    }

    @NonNull
    public static v4 a(@NonNull View rootView) {
        int i11 = R.id.background;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.background);
        if (imageView != null) {
            i11 = R.id.subtitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.subtitle);
            if (textView != null) {
                i11 = R.id.title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                if (textView2 != null) {
                    return new v4((FrameLayout) rootView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static v4 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static v4 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.book_icon_view_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f57125a;
    }
}
