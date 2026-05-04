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
public abstract class xf extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f57461a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57462b;

    public xf(Object _bindingComponent, View _root, int _localFieldCount, TextView variantCh, TextView variantEn) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57461a = variantCh;
        this.f57462b = variantEn;
    }

    public static xf b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static xf c(@NonNull View view, @Nullable Object component) {
        return (xf) ViewDataBinding.bind(component, view, R.layout.item_wiki_ext_variant);
    }

    @NonNull
    public static xf d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static xf e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static xf g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (xf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_ext_variant, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static xf h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (xf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_ext_variant, null, false, component);
    }
}
