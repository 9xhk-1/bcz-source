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
public abstract class hf extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55193a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55194b;

    public hf(Object _bindingComponent, View _root, int _localFieldCount, TextView content, TextView type) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55193a = content;
        this.f55194b = type;
    }

    public static hf b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static hf c(@NonNull View view, @Nullable Object component) {
        return (hf) ViewDataBinding.bind(component, view, R.layout.item_wiki_all_mean_sub);
    }

    @NonNull
    public static hf d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static hf e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static hf g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (hf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_all_mean_sub, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static hf h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (hf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_all_mean_sub, null, false, component);
    }
}
