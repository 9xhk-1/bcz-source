package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.widget.WikiVideoView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class pk extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final WikiVideoView f56391a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56392b;

    public pk(Object _bindingComponent, View _root, int _localFieldCount, WikiVideoView extVideo, FrameLayout videoContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56391a = extVideo;
        this.f56392b = videoContainer;
    }

    public static pk b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static pk c(@NonNull View view, @Nullable Object component) {
        return (pk) ViewDataBinding.bind(component, view, R.layout.pager_wiki_ext_video);
    }

    @NonNull
    public static pk d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static pk e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static pk g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (pk) ViewDataBinding.inflateInternal(inflater, R.layout.pager_wiki_ext_video, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static pk h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (pk) ViewDataBinding.inflateInternal(inflater, R.layout.pager_wiki_ext_video, null, false, component);
    }
}
