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
public abstract class vj extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f57201a;

    /* renamed from: b, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f57202b;

    public vj(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public static vj b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static vj c(@NonNull View view, @Nullable Object component) {
        return (vj) ViewDataBinding.bind(component, view, R.layout.lookup_wiki_error_msg);
    }

    @NonNull
    public static vj g(@NonNull LayoutInflater inflater) {
        return j(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static vj h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return i(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static vj i(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (vj) ViewDataBinding.inflateInternal(inflater, R.layout.lookup_wiki_error_msg, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static vj j(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (vj) ViewDataBinding.inflateInternal(inflater, R.layout.lookup_wiki_error_msg, null, false, component);
    }

    @Nullable
    public View.OnClickListener d() {
        return this.f57201a;
    }

    @Nullable
    public View.OnClickListener e() {
        return this.f57202b;
    }

    public abstract void k(@Nullable View.OnClickListener backClick);

    public abstract void l(@Nullable View.OnClickListener refreshClick);
}
