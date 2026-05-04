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
public abstract class un extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f57064a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57065b;

    public un(Object _bindingComponent, View _root, int _localFieldCount, ImageView image, TextView name) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57064a = image;
        this.f57065b = name;
    }

    public static un b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static un c(@NonNull View view, @Nullable Object component) {
        return (un) ViewDataBinding.bind(component, view, R.layout.tab_daka_post);
    }

    @NonNull
    public static un d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static un e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static un g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (un) ViewDataBinding.inflateInternal(inflater, R.layout.tab_daka_post, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static un h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (un) ViewDataBinding.inflateInternal(inflater, R.layout.tab_daka_post, null, false, component);
    }
}
