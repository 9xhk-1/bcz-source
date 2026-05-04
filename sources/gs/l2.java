package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class l2 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55692a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55693b;

    public l2(@NonNull FrameLayout rootView, @NonNull FrameLayout frame) {
        this.f55692a = rootView;
        this.f55693b = frame;
    }

    @NonNull
    public static l2 a(@NonNull View rootView) {
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.frame);
        if (frameLayout != null) {
            return new l2((FrameLayout) rootView, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.frame)));
    }

    @NonNull
    public static l2 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static l2 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_single_wiki, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f55692a;
    }
}
