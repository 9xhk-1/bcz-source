package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class gc implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55051a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55052b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ProgressBar f55053c;

    public gc(@NonNull FrameLayout rootView, @NonNull TextView loadNoMore, @NonNull ProgressBar loadProgress) {
        this.f55051a = rootView;
        this.f55052b = loadNoMore;
        this.f55053c = loadProgress;
    }

    @NonNull
    public static gc a(@NonNull View rootView) {
        int i11 = R.id.load_no_more;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.load_no_more);
        if (textView != null) {
            i11 = R.id.load_progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.load_progress);
            if (progressBar != null) {
                return new gc((FrameLayout) rootView, textView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static gc c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static gc d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.friend_feed_more_loading_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f55051a;
    }
}
