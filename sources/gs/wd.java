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
public abstract class wd extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f57317a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f57318b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57319c;

    public wd(Object _bindingComponent, View _root, int _localFieldCount, ImageView checked, ImageView icon, TextView option) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57317a = checked;
        this.f57318b = icon;
        this.f57319c = option;
    }

    public static wd b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static wd c(@NonNull View view, @Nullable Object component) {
        return (wd) ViewDataBinding.bind(component, view, R.layout.item_dialog_word_favorite_option);
    }

    @NonNull
    public static wd d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static wd e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static wd g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (wd) ViewDataBinding.inflateInternal(inflater, R.layout.item_dialog_word_favorite_option, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static wd h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (wd) ViewDataBinding.inflateInternal(inflater, R.layout.item_dialog_word_favorite_option, null, false, component);
    }
}
