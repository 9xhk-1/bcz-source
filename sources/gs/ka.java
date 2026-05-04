package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ka extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView f55588a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final EditText f55589b;

    /* renamed from: c, reason: collision with root package name */
    @Bindable
    public nf.k f55590c;

    public ka(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView schools, EditText search) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55588a = schools;
        this.f55589b = search;
    }

    public static ka b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ka c(@NonNull View view, @Nullable Object component) {
        return (ka) ViewDataBinding.bind(component, view, R.layout.fragment_search_major);
    }

    @NonNull
    public static ka e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ka g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ka h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ka) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_search_major, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ka i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ka) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_search_major, null, false, component);
    }

    @Nullable
    public nf.k d() {
        return this.f55590c;
    }

    public abstract void j(@Nullable nf.k viewmodel);
}
