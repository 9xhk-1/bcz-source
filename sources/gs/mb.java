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
public abstract class mb extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55882a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f55883b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55884c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55885d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55886e;

    /* renamed from: f, reason: collision with root package name */
    @Bindable
    public ef.a f55887f;

    public mb(Object _bindingComponent, View _root, int _localFieldCount, TextView cancel, View divider, TextView man, TextView secret, TextView women) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55882a = cancel;
        this.f55883b = divider;
        this.f55884c = man;
        this.f55885d = secret;
        this.f55886e = women;
    }

    public static mb b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static mb c(@NonNull View view, @Nullable Object component) {
        return (mb) ViewDataBinding.bind(component, view, R.layout.fragment_userinfo_edit_sex);
    }

    @NonNull
    public static mb e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static mb g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static mb h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (mb) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_userinfo_edit_sex, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static mb i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (mb) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_userinfo_edit_sex, null, false, component);
    }

    @Nullable
    public ef.a d() {
        return this.f55887f;
    }

    public abstract void j(@Nullable ef.a viewmodel);
}
