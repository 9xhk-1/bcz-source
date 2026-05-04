package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ma extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView f55878a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final EditText f55879b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55880c;

    /* renamed from: d, reason: collision with root package name */
    @Bindable
    public lf.k f55881d;

    public ma(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView schools, EditText search, TextView text) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55878a = schools;
        this.f55879b = search;
        this.f55880c = text;
    }

    public static ma b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ma c(@NonNull View view, @Nullable Object component) {
        return (ma) ViewDataBinding.bind(component, view, R.layout.fragment_search_position);
    }

    @NonNull
    public static ma e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ma g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ma h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ma) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_search_position, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ma i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ma) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_search_position, null, false, component);
    }

    @Nullable
    public lf.k d() {
        return this.f55881d;
    }

    public abstract void j(@Nullable lf.k viewmodel);
}
