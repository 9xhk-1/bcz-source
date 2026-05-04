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
public abstract class lh extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55776a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55777b;

    public lh(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout swipeLayout, TextView tvOrderValue) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55776a = swipeLayout;
        this.f55777b = tvOrderValue;
    }

    public static lh b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static lh c(@NonNull View view, @Nullable Object component) {
        return (lh) ViewDataBinding.bind(component, view, R.layout.item_word_list_v2_order);
    }

    @NonNull
    public static lh d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static lh e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static lh g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (lh) ViewDataBinding.inflateInternal(inflater, R.layout.item_word_list_v2_order, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static lh h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (lh) ViewDataBinding.inflateInternal(inflater, R.layout.item_word_list_v2_order, null, false, component);
    }
}
