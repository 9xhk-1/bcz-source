package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class hh extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55199a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55200b;

    public hh(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout swipeLayout, TextView tvCategory) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55199a = swipeLayout;
        this.f55200b = tvCategory;
    }

    public static hh b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static hh c(@NonNull View view, @Nullable Object component) {
        return (hh) ViewDataBinding.bind(component, view, R.layout.item_word_list_v2_category);
    }

    @NonNull
    public static hh d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static hh e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static hh g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (hh) ViewDataBinding.inflateInternal(inflater, R.layout.item_word_list_v2_category, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static hh h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (hh) ViewDataBinding.inflateInternal(inflater, R.layout.item_word_list_v2_category, null, false, component);
    }
}
