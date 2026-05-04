package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ii implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f55329a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f55330b;

    public ii(@NonNull FragmentContainerView rootView, @NonNull FragmentContainerView homeTogetherLearning) {
        this.f55329a = rootView;
        this.f55330b = homeTogetherLearning;
    }

    @NonNull
    public static ii a(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) rootView;
        return new ii(fragmentContainerView, fragmentContainerView);
    }

    @NonNull
    public static ii c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ii d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_home_together_learning, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FragmentContainerView getRoot() {
        return this.f55329a;
    }
}
