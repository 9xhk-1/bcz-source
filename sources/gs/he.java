package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.WikiVideoView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class he implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55190a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final WikiVideoView f55191b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55192c;

    public he(@NonNull FrameLayout rootView, @NonNull WikiVideoView tvVideoView, @NonNull FrameLayout videoContainer) {
        this.f55190a = rootView;
        this.f55191b = tvVideoView;
        this.f55192c = videoContainer;
    }

    @NonNull
    public static he a(@NonNull View rootView) {
        WikiVideoView wikiVideoView = (WikiVideoView) ViewBindings.findChildViewById(rootView, R.id.tv_video_view);
        if (wikiVideoView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv_video_view)));
        }
        FrameLayout frameLayout = (FrameLayout) rootView;
        return new he(frameLayout, wikiVideoView, frameLayout);
    }

    @NonNull
    public static he c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static he d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_lookup_other_tv, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f55190a;
    }
}
