package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class eb extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final kk f54766a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54767b;

    /* renamed from: c, reason: collision with root package name */
    @Bindable
    public df.c f54768c;

    public eb(Object _bindingComponent, View _root, int _localFieldCount, kk autoSize, TextView autoSizeHint) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54766a = autoSize;
        this.f54767b = autoSizeHint;
    }

    public static eb b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static eb c(@NonNull View view, @Nullable Object component) {
        return (eb) ViewDataBinding.bind(component, view, R.layout.fragment_ui_setting);
    }

    @NonNull
    public static eb e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static eb g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static eb h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (eb) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_ui_setting, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static eb i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (eb) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_ui_setting, null, false, component);
    }

    @Nullable
    public df.c d() {
        return this.f54768c;
    }

    public abstract void j(@Nullable df.c viewmodel);
}
