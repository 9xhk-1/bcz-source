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
public abstract class y9 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f57565a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57566b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57567c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57568d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57569e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57570f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57571g;

    /* renamed from: h, reason: collision with root package name */
    @Bindable
    public of.a f57572h;

    public y9(Object _bindingComponent, View _root, int _localFieldCount, TextView college, TextView high, TextView highVocation, TextView hint, TextView middle, TextView primary, TextView search) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57565a = college;
        this.f57566b = high;
        this.f57567c = highVocation;
        this.f57568d = hint;
        this.f57569e = middle;
        this.f57570f = primary;
        this.f57571g = search;
    }

    public static y9 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static y9 c(@NonNull View view, @Nullable Object component) {
        return (y9) ViewDataBinding.bind(component, view, R.layout.fragment_pick_up_school);
    }

    @NonNull
    public static y9 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static y9 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static y9 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (y9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_pick_up_school, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static y9 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (y9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_pick_up_school, null, false, component);
    }

    @Nullable
    public of.a d() {
        return this.f57572h;
    }

    public abstract void j(@Nullable of.a viewmodel);
}
