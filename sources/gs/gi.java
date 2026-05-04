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
public final class gi implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f55076a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f55077b;

    public gi(@NonNull FragmentContainerView rootView, @NonNull FragmentContainerView homeMine) {
        this.f55076a = rootView;
        this.f55077b = homeMine;
    }

    @NonNull
    public static gi a(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) rootView;
        return new gi(fragmentContainerView, fragmentContainerView);
    }

    @NonNull
    public static gi c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static gi d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_home_mine, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FragmentContainerView getRoot() {
        return this.f55076a;
    }
}
