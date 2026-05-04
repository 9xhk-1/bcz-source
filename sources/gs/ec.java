package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ec implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54769a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54770b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f54771c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final SwipeRefreshLayout f54772d;

    public ec(@NonNull FrameLayout rootView, @NonNull LinearLayout emptyView, @NonNull RecyclerView feedList, @NonNull SwipeRefreshLayout feedListSwipe) {
        this.f54769a = rootView;
        this.f54770b = emptyView;
        this.f54771c = feedList;
        this.f54772d = feedListSwipe;
    }

    @NonNull
    public static ec a(@NonNull View rootView) {
        int i11 = R.id.empty_view;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty_view);
        if (linearLayout != null) {
            i11 = R.id.feed_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.feed_list);
            if (recyclerView != null) {
                i11 = R.id.feed_list_swipe;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.feed_list_swipe);
                if (swipeRefreshLayout != null) {
                    return new ec((FrameLayout) rootView, linearLayout, recyclerView, swipeRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ec c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ec d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.friend_feed_fragment_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f54769a;
    }
}
