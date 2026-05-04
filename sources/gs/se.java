package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.main.view.AspectRoundImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class se extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final AspectRoundImageView f56750a;

    public se(Object _bindingComponent, View _root, int _localFieldCount, AspectRoundImageView templateImg) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56750a = templateImg;
    }

    public static se b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static se c(@NonNull View view, @Nullable Object component) {
        return (se) ViewDataBinding.bind(component, view, R.layout.item_pager_template);
    }

    @NonNull
    public static se d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static se e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static se g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (se) ViewDataBinding.inflateInternal(inflater, R.layout.item_pager_template, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static se h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (se) ViewDataBinding.inflateInternal(inflater, R.layout.item_pager_template, null, false, component);
    }
}
