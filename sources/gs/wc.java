package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class wc implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57315a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57316b;

    public wc(@NonNull FrameLayout rootView, @NonNull RecyclerView rankList) {
        this.f57315a = rootView;
        this.f57316b = rankList;
    }

    @NonNull
    public static wc a(@NonNull View rootView) {
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rank_list);
        if (recyclerView != null) {
            return new wc((FrameLayout) rootView, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.rank_list)));
    }

    @NonNull
    public static wc c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static wc d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.friend_week_page_fragment, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f57315a;
    }
}
