package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class k6 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ComposeView f55577a;

    public k6(Object _bindingComponent, View _root, int _localFieldCount, ComposeView compose) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55577a = compose;
    }

    public static k6 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static k6 c(@NonNull View view, @Nullable Object component) {
        return (k6) ViewDataBinding.bind(component, view, R.layout.dialog_mode_des);
    }

    @NonNull
    public static k6 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static k6 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static k6 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (k6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_mode_des, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static k6 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (k6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_mode_des, null, false, component);
    }
}
