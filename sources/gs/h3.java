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
public abstract class h3 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f55132a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55133b;

    public h3(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, FrameLayout container) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55132a = actionBar;
        this.f55133b = container;
    }

    public static h3 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static h3 c(@NonNull View view, @Nullable Object component) {
        return (h3) ViewDataBinding.bind(component, view, R.layout.activity_word_wiki);
    }

    @NonNull
    public static h3 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static h3 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static h3 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (h3) ViewDataBinding.inflateInternal(inflater, R.layout.activity_word_wiki, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static h3 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (h3) ViewDataBinding.inflateInternal(inflater, R.layout.activity_word_wiki, null, false, component);
    }
}
