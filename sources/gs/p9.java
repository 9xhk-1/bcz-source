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
public abstract class p9 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56345a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56346b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56347c;

    /* renamed from: d, reason: collision with root package name */
    @Bindable
    public je.a f56348d;

    public p9(Object _bindingComponent, View _root, int _localFieldCount, TextView article, TextView product, TextView words) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56345a = article;
        this.f56346b = product;
        this.f56347c = words;
    }

    public static p9 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static p9 c(@NonNull View view, @Nullable Object component) {
        return (p9) ViewDataBinding.bind(component, view, R.layout.fragment_mycollection);
    }

    @NonNull
    public static p9 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static p9 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static p9 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (p9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_mycollection, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static p9 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (p9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_mycollection, null, false, component);
    }

    @Nullable
    public je.a d() {
        return this.f56348d;
    }

    public abstract void j(@Nullable je.a viewmodel);
}
