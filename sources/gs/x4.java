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
public abstract class x4 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f57404a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57405b;

    /* renamed from: c, reason: collision with root package name */
    @Bindable
    public String f57406c;

    public x4(Object _bindingComponent, View _root, int _localFieldCount, View confirmBg, TextView confirmBtn) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57404a = confirmBg;
        this.f57405b = confirmBtn;
    }

    public static x4 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static x4 c(@NonNull View view, @Nullable Object component) {
        return (x4) ViewDataBinding.bind(component, view, R.layout.bottom_blue_btn);
    }

    @NonNull
    public static x4 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static x4 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static x4 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (x4) ViewDataBinding.inflateInternal(inflater, R.layout.bottom_blue_btn, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static x4 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (x4) ViewDataBinding.inflateInternal(inflater, R.layout.bottom_blue_btn, null, false, component);
    }

    @Nullable
    public String d() {
        return this.f57406c;
    }

    public abstract void j(@Nullable String btnTitle);
}
