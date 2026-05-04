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
public abstract class nk extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView f56085a;

    public nk(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView extList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56085a = extList;
    }

    public static nk b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static nk c(@NonNull View view, @Nullable Object component) {
        return (nk) ViewDataBinding.bind(component, view, R.layout.pager_wiki_ext_list);
    }

    @NonNull
    public static nk d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static nk e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static nk g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (nk) ViewDataBinding.inflateInternal(inflater, R.layout.pager_wiki_ext_list, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static nk h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (nk) ViewDataBinding.inflateInternal(inflater, R.layout.pager_wiki_ext_list, null, false, component);
    }
}
