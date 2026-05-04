package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.widget.WikiVideoView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class zf extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57783a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final WikiVideoView f57784b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57785c;

    public zf(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView extList, WikiVideoView extVideo, FrameLayout videoContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57783a = extList;
        this.f57784b = extVideo;
        this.f57785c = videoContainer;
    }

    public static zf b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static zf c(@NonNull View view, @Nullable Object component) {
        return (zf) ViewDataBinding.bind(component, view, R.layout.item_wiki_extension);
    }

    @NonNull
    public static zf d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static zf e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static zf g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (zf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_extension, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static zf h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (zf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_extension, null, false, component);
    }
}
