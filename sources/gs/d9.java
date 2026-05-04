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
public final class d9 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54606a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final wk f54607b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final yk f54608c;

    public d9(@NonNull ConstraintLayout rootView, @NonNull wk options, @NonNull yk subject) {
        this.f54606a = rootView;
        this.f54607b = options;
        this.f54608c = subject;
    }

    @NonNull
    public static d9 a(@NonNull View rootView) {
        int i11 = R.id.options;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.options);
        if (findChildViewById != null) {
            wk a11 = wk.a(findChildViewById);
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.subject);
            if (findChildViewById2 != null) {
                return new d9((ConstraintLayout) rootView, a11, yk.a(findChildViewById2));
            }
            i11 = R.id.subject;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static d9 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static d9 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_learning_example_pattern_sen_to_chin_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f54606a;
    }
}
