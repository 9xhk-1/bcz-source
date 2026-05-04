package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class zi implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57792a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f57793b;

    public zi(@NonNull FrameLayout rootView, @NonNull ImageView pic) {
        this.f57792a = rootView;
        this.f57793b = pic;
    }

    @NonNull
    public static zi a(@NonNull View rootView) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pic);
        if (imageView != null) {
            return new zi((FrameLayout) rootView, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.pic)));
    }

    @NonNull
    public static zi c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static zi d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_wiki_item_pictogram, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f57792a;
    }
}
