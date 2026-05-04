package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class oh implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56228a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56229b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56230c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56231d;

    public oh(@NonNull FrameLayout rootView, @NonNull ImageView expandArrow, @NonNull TextView expandText, @NonNull LinearLayout expandView) {
        this.f56228a = rootView;
        this.f56229b = expandArrow;
        this.f56230c = expandText;
        this.f56231d = expandView;
    }

    @NonNull
    public static oh a(@NonNull View rootView) {
        int i11 = R.id.expand_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.expand_arrow);
        if (imageView != null) {
            i11 = R.id.expand_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.expand_text);
            if (textView != null) {
                i11 = R.id.expand_view;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.expand_view);
                if (linearLayout != null) {
                    return new oh((FrameLayout) rootView, imageView, textView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static oh c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static oh d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_word_plan_search_expand, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f56228a;
    }
}
