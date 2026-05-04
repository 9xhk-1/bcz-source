package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class r4 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56571a;

    public r4(Object _bindingComponent, View _root, int _localFieldCount, TextView text) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56571a = text;
    }

    public static r4 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static r4 c(@NonNull View view, @Nullable Object component) {
        return (r4) ViewDataBinding.bind(component, view, R.layout.bcz_toast);
    }

    @NonNull
    public static r4 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static r4 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static r4 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (r4) ViewDataBinding.inflateInternal(inflater, R.layout.bcz_toast, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static r4 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (r4) ViewDataBinding.inflateInternal(inflater, R.layout.bcz_toast, null, false, component);
    }
}
