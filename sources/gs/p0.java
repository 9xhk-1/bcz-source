package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class p0 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f56279a;

    public p0(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public static p0 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static p0 c(@NonNull View view, @Nullable Object component) {
        return (p0) ViewDataBinding.bind(component, view, R.layout.activity_friends);
    }

    @NonNull
    public static p0 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static p0 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static p0 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (p0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_friends, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static p0 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (p0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_friends, null, false, component);
    }

    @Nullable
    public View.OnClickListener d() {
        return this.f56279a;
    }

    public abstract void j(@Nullable View.OnClickListener backListener);
}
