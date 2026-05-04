package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class u7 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56968a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final a f56969b;

    public u7(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout container, a topBar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56968a = container;
        this.f56969b = topBar;
    }

    public static u7 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static u7 c(@NonNull View view, @Nullable Object component) {
        return (u7) ViewDataBinding.bind(component, view, R.layout.fragment_base_top_bar);
    }

    @NonNull
    public static u7 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static u7 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static u7 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (u7) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_base_top_bar, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static u7 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (u7) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_base_top_bar, null, false, component);
    }
}
