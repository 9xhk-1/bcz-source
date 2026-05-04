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
public abstract class oa extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView f56205a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final EditText f56206b;

    /* renamed from: c, reason: collision with root package name */
    @Bindable
    public pf.i f56207c;

    public oa(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView schools, EditText search) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56205a = schools;
        this.f56206b = search;
    }

    public static oa b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static oa c(@NonNull View view, @Nullable Object component) {
        return (oa) ViewDataBinding.bind(component, view, R.layout.fragment_search_school);
    }

    @NonNull
    public static oa e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static oa g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static oa h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (oa) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_search_school, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static oa i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (oa) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_search_school, null, false, component);
    }

    @Nullable
    public pf.i d() {
        return this.f56207c;
    }

    public abstract void j(@Nullable pf.i viewmodel);
}
