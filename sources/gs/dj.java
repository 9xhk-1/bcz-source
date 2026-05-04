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
public final class dj implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54637a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final WikiVideoView f54638b;

    public dj(@NonNull FrameLayout rootView, @NonNull WikiVideoView video) {
        this.f54637a = rootView;
        this.f54638b = video;
    }

    @NonNull
    public static dj a(@NonNull View rootView) {
        WikiVideoView wikiVideoView = (WikiVideoView) ViewBindings.findChildViewById(rootView, R.id.video);
        if (wikiVideoView != null) {
            return new dj((FrameLayout) rootView, wikiVideoView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.video)));
    }

    @NonNull
    public static dj c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static dj d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_wiki_word_video, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f54637a;
    }
}
