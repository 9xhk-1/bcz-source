package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.PullToRefreshPinnedSectionListView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class db implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54613a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final PullToRefreshPinnedSectionListView f54614b;

    public db(@NonNull FrameLayout rootView, @NonNull PullToRefreshPinnedSectionListView timelineListView) {
        this.f54613a = rootView;
        this.f54614b = timelineListView;
    }

    @NonNull
    public static db a(@NonNull View rootView) {
        PullToRefreshPinnedSectionListView pullToRefreshPinnedSectionListView = (PullToRefreshPinnedSectionListView) ViewBindings.findChildViewById(rootView, R.id.timeline_list_view);
        if (pullToRefreshPinnedSectionListView != null) {
            return new db((FrameLayout) rootView, pullToRefreshPinnedSectionListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.timeline_list_view)));
    }

    @NonNull
    public static db c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static db d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_tv_timeline, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f54613a;
    }
}
