package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class bb implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54278a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final PullToRefreshGridView f54279b;

    public bb(@NonNull FrameLayout rootView, @NonNull PullToRefreshGridView exploreGridView) {
        this.f54278a = rootView;
        this.f54279b = exploreGridView;
    }

    @NonNull
    public static bb a(@NonNull View rootView) {
        PullToRefreshGridView pullToRefreshGridView = (PullToRefreshGridView) ViewBindings.findChildViewById(rootView, R.id.explore_grid_view);
        if (pullToRefreshGridView != null) {
            return new bb((FrameLayout) rootView, pullToRefreshGridView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.explore_grid_view)));
    }

    @NonNull
    public static bb c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static bb d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_tv_explore, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f54278a;
    }
}
