package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class pf extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56375a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56376b;

    public pf(Object _bindingComponent, View _root, int _localFieldCount, TextView derivationCh, TextView derivationEn) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56375a = derivationCh;
        this.f56376b = derivationEn;
    }

    public static pf b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static pf c(@NonNull View view, @Nullable Object component) {
        return (pf) ViewDataBinding.bind(component, view, R.layout.item_wiki_ext_derivation);
    }

    @NonNull
    public static pf d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static pf e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static pf g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (pf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_ext_derivation, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static pf h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (pf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_ext_derivation, null, false, component);
    }
}
