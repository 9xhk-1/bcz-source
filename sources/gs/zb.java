package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class zb extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57769a;

    /* renamed from: b, reason: collision with root package name */
    @Bindable
    public ta.b f57770b;

    public zb(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView infoList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57769a = infoList;
    }

    public static zb b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static zb c(@NonNull View view, @Nullable Object component) {
        return (zb) ViewDataBinding.bind(component, view, R.layout.fragment_word_wiki);
    }

    @NonNull
    public static zb e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static zb g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static zb h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (zb) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_word_wiki, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static zb i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (zb) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_word_wiki, null, false, component);
    }

    @Nullable
    public ta.b d() {
        return this.f57770b;
    }

    public abstract void j(@Nullable ta.b loadingModel);
}
