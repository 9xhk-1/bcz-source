package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class qg extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView f56509a;

    public qg(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView meanList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56509a = meanList;
    }

    public static qg b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static qg c(@NonNull View view, @Nullable Object component) {
        return (qg) ViewDataBinding.bind(component, view, R.layout.item_wiki_tradition_all_mean);
    }

    @NonNull
    public static qg d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static qg e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static qg g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (qg) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_tradition_all_mean, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static qg h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (qg) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_tradition_all_mean, null, false, component);
    }
}
