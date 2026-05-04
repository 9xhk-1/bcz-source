package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class dg extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TabLayout f54629a;

    public dg(Object _bindingComponent, View _root, int _localFieldCount, TabLayout wikiTab) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54629a = wikiTab;
    }

    public static dg b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static dg c(@NonNull View view, @Nullable Object component) {
        return (dg) ViewDataBinding.bind(component, view, R.layout.item_wiki_list_tab);
    }

    @NonNull
    public static dg d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static dg e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static dg g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (dg) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_list_tab, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static dg h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (dg) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_list_tab, null, false, component);
    }
}
