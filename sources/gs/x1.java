package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class x1 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f57394a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57395b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57396c;

    public x1(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, FrameLayout container, TextView title) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57394a = actionBar;
        this.f57395b = container;
        this.f57396c = title;
    }

    public static x1 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static x1 c(@NonNull View view, @Nullable Object component) {
        return (x1) ViewDataBinding.bind(component, view, R.layout.activity_register);
    }

    @NonNull
    public static x1 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static x1 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static x1 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (x1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_register, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static x1 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (x1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_register, null, false, component);
    }
}
