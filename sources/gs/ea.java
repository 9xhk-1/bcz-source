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
public abstract class ea extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ck f54760a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ck f54761b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ck f54762c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54763d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ck f54764e;

    /* renamed from: f, reason: collision with root package name */
    @Bindable
    public ze.s f54765f;

    public ea(Object _bindingComponent, View _root, int _localFieldCount, ck developer, ck microphone, ck privacy, TextView protocol, ck storage) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54760a = developer;
        this.f54761b = microphone;
        this.f54762c = privacy;
        this.f54763d = protocol;
        this.f54764e = storage;
    }

    public static ea b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ea c(@NonNull View view, @Nullable Object component) {
        return (ea) ViewDataBinding.bind(component, view, R.layout.fragment_privates_setting);
    }

    @NonNull
    public static ea e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ea g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ea h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ea) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_privates_setting, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ea i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ea) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_privates_setting, null, false, component);
    }

    @Nullable
    public ze.s d() {
        return this.f54765f;
    }

    public abstract void j(@Nullable ze.s viewmodel);
}
