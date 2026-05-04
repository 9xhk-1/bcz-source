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
public abstract class t6 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f56834a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56835b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56836c;

    public t6(Object _bindingComponent, View _root, int _localFieldCount, ImageView ivAd, ImageView ivClose, TextView tvAdd) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56834a = ivAd;
        this.f56835b = ivClose;
        this.f56836c = tvAdd;
    }

    public static t6 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static t6 c(@NonNull View view, @Nullable Object component) {
        return (t6) ViewDataBinding.bind(component, view, R.layout.dialog_special_free_book);
    }

    @NonNull
    public static t6 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static t6 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static t6 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (t6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_special_free_book, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static t6 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (t6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_special_free_book, null, false, component);
    }
}
