package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class x2 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f57397a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57398b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57399c;

    public x2(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, FrameLayout container, FrameLayout fragmentContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57397a = actionBar;
        this.f57398b = container;
        this.f57399c = fragmentContainer;
    }

    public static x2 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static x2 c(@NonNull View view, @Nullable Object component) {
        return (x2) ViewDataBinding.bind(component, view, R.layout.activity_wiki_scene);
    }

    @NonNull
    public static x2 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static x2 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static x2 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (x2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_wiki_scene, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static x2 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (x2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_wiki_scene, null, false, component);
    }
}
