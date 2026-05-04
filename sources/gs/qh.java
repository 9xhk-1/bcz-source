package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class qh extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f56510a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56511b;

    public qh(Object _bindingComponent, View _root, int _localFieldCount, ImageView ivSelected, TextView tvName) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56510a = ivSelected;
        this.f56511b = tvName;
    }

    public static qh b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static qh c(@NonNull View view, @Nullable Object component) {
        return (qh) ViewDataBinding.bind(component, view, R.layout.item_word_select_option);
    }

    @NonNull
    public static qh d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static qh e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static qh g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (qh) ViewDataBinding.inflateInternal(inflater, R.layout.item_word_select_option, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static qh h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (qh) ViewDataBinding.inflateInternal(inflater, R.layout.item_word_select_option, null, false, component);
    }
}
