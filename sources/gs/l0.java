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
public abstract class l0 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f55670a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55671b;

    public l0(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, FrameLayout navContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55670a = actionBar;
        this.f55671b = navContainer;
    }

    public static l0 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static l0 c(@NonNull View view, @Nullable Object component) {
        return (l0) ViewDataBinding.bind(component, view, R.layout.activity_force_auth);
    }

    @NonNull
    public static l0 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static l0 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static l0 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (l0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_force_auth, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static l0 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (l0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_force_auth, null, false, component);
    }
}
