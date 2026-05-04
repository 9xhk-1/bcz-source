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
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ob extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56208a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56209b;

    public ob(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout container, ConstraintLayout root) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56208a = container;
        this.f56209b = root;
    }

    public static ob b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ob c(@NonNull View view, @Nullable Object component) {
        return (ob) ViewDataBinding.bind(component, view, R.layout.fragment_web_review);
    }

    @NonNull
    public static ob d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ob e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ob g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ob) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_web_review, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ob h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ob) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_web_review, null, false, component);
    }
}
