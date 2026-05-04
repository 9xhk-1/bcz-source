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
public abstract class c4 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f54379a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54380b;

    public c4(Object _bindingComponent, View _root, int _localFieldCount, TextView bottomLeft, TextView bottomRight) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54379a = bottomLeft;
        this.f54380b = bottomRight;
    }

    public static c4 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static c4 c(@NonNull View view, @Nullable Object component) {
        return (c4) ViewDataBinding.bind(component, view, R.layout.bcz_dialog_button_double);
    }

    @NonNull
    public static c4 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static c4 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static c4 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (c4) ViewDataBinding.inflateInternal(inflater, R.layout.bcz_dialog_button_double, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static c4 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (c4) ViewDataBinding.inflateInternal(inflater, R.layout.bcz_dialog_button_double, null, false, component);
    }
}
