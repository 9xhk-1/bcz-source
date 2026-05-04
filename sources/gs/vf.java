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
public abstract class vf extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f57176a;

    public vf(Object _bindingComponent, View _root, int _localFieldCount, TextView word) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57176a = word;
    }

    public static vf b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static vf c(@NonNull View view, @Nullable Object component) {
        return (vf) ViewDataBinding.bind(component, view, R.layout.item_wiki_ext_similar);
    }

    @NonNull
    public static vf d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static vf e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static vf g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (vf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_ext_similar, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static vf h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (vf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_ext_similar, null, false, component);
    }
}
