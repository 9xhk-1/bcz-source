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
public abstract class w9 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final gk f57295a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final gk f57296b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final gk f57297c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final gk f57298d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final gk f57299e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final gk f57300f;

    /* renamed from: g, reason: collision with root package name */
    @Bindable
    public ze.s f57301g;

    public w9(Object _bindingComponent, View _root, int _localFieldCount, gk bluetooth, gk camera, gk location, gk microphone, gk network, gk storage) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57295a = bluetooth;
        this.f57296b = camera;
        this.f57297c = location;
        this.f57298d = microphone;
        this.f57299e = network;
        this.f57300f = storage;
    }

    public static w9 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static w9 c(@NonNull View view, @Nullable Object component) {
        return (w9) ViewDataBinding.bind(component, view, R.layout.fragment_permissions);
    }

    @NonNull
    public static w9 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static w9 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static w9 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (w9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_permissions, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static w9 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (w9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_permissions, null, false, component);
    }

    @Nullable
    public ze.s d() {
        return this.f57301g;
    }

    public abstract void j(@Nullable ze.s viewmodel);
}
