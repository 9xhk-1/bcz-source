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
public final class ul implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57061a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final vk f57062b;

    public ul(@NonNull ConstraintLayout rootView, @NonNull vk include) {
        this.f57061a = rootView;
        this.f57062b = include;
    }

    @NonNull
    public static ul a(@NonNull View rootView) {
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.include);
        if (findChildViewById == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.include)));
        }
        return new ul((ConstraintLayout) rootView, vk.a(findChildViewById));
    }

    @NonNull
    public static ul c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ul d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.plusreview_fragment_mean_to_word_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f57061a;
    }
}
