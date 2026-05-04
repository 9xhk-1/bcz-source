package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class aa extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ik f54160a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54161b;

    /* renamed from: c, reason: collision with root package name */
    @Bindable
    public ze.i f54162c;

    public aa(Object _bindingComponent, View _root, int _localFieldCount, ik autoSize, TextView autoSizeHint) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54160a = autoSize;
        this.f54161b = autoSizeHint;
    }

    public static aa b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static aa c(@NonNull View view, @Nullable Object component) {
        return (aa) ViewDataBinding.bind(component, view, R.layout.fragment_privates_ad_setting);
    }

    @NonNull
    public static aa e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static aa g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static aa h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (aa) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_privates_ad_setting, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static aa i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (aa) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_privates_ad_setting, null, false, component);
    }

    @Nullable
    public ze.i d() {
        return this.f54162c;
    }

    public abstract void j(@Nullable ze.i viewmodel);
}
