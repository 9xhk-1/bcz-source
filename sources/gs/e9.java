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
public final class e9 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54758a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final yk f54759b;

    public e9(@NonNull ConstraintLayout rootView, @NonNull yk include) {
        this.f54758a = rootView;
        this.f54759b = include;
    }

    @NonNull
    public static e9 a(@NonNull View rootView) {
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.include);
        if (findChildViewById == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.include)));
        }
        return new e9((ConstraintLayout) rootView, yk.a(findChildViewById));
    }

    @NonNull
    public static e9 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static e9 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_learning_example_pattern_sen_to_pic_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f54758a;
    }
}
