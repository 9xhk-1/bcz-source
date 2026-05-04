package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c9 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54413a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final xk f54414b;

    public c9(@NonNull ConstraintLayout rootView, @NonNull xk include) {
        this.f54413a = rootView;
        this.f54414b = include;
    }

    @NonNull
    public static c9 a(@NonNull View rootView) {
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.include);
        if (findChildViewById == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.include)));
        }
        return new c9((ConstraintLayout) rootView, xk.a(findChildViewById));
    }

    @NonNull
    public static c9 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static c9 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_learning_example_pattern_pic_to_chin_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f54413a;
    }
}
