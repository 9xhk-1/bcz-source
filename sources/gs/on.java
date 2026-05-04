package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.widget.WikiVideoView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class on extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56263a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final qn f56264b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final WikiVideoView f56265c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56266d;

    public on(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout item, qn title, WikiVideoView video, FrameLayout videoContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56263a = item;
        this.f56264b = title;
        this.f56265c = video;
        this.f56266d = videoContainer;
    }

    public static on b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static on c(@NonNull View view, @Nullable Object component) {
        return (on) ViewDataBinding.bind(component, view, R.layout.study_wiki_item_word_tv);
    }

    @NonNull
    public static on d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static on e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static on g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (on) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_word_tv, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static on h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (on) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_word_tv, null, false, component);
    }
}
