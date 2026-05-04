package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class md extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ProgressBar f55894a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55895b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55896c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55897d;

    /* renamed from: e, reason: collision with root package name */
    @Bindable
    public ObservableInt f55898e;

    /* renamed from: f, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f55899f;

    public md(Object _bindingComponent, View _root, int _localFieldCount, ProgressBar dakaProgress, TextView dakaRetry, TextView dakaTip, TextView errorTitle1) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55894a = dakaProgress;
        this.f55895b = dakaRetry;
        this.f55896c = dakaTip;
        this.f55897d = errorTitle1;
    }

    public static md b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static md c(@NonNull View view, @Nullable Object component) {
        return (md) ViewDataBinding.bind(component, view, R.layout.image_daka_loading_layout);
    }

    @NonNull
    public static md g(@NonNull LayoutInflater inflater) {
        return j(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static md h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return i(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static md i(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (md) ViewDataBinding.inflateInternal(inflater, R.layout.image_daka_loading_layout, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static md j(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (md) ViewDataBinding.inflateInternal(inflater, R.layout.image_daka_loading_layout, null, false, component);
    }

    @Nullable
    public View.OnClickListener d() {
        return this.f55899f;
    }

    @Nullable
    public ObservableInt e() {
        return this.f55898e;
    }

    public abstract void k(@Nullable View.OnClickListener retry);

    public abstract void l(@Nullable ObservableInt status);
}
