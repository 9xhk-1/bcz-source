package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ak extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f54187a;

    /* renamed from: b, reason: collision with root package name */
    @Bindable
    public boolean f54188b;

    /* renamed from: c, reason: collision with root package name */
    @Bindable
    public boolean f54189c;

    /* renamed from: d, reason: collision with root package name */
    @Bindable
    public boolean f54190d;

    public ak(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public static ak b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ak c(@NonNull View view, @Nullable Object component) {
        return (ak) ViewDataBinding.bind(component, view, R.layout.mytab_setting_account_item);
    }

    @NonNull
    public static ak i(@NonNull LayoutInflater inflater) {
        return l(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ak j(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return k(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ak k(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ak) ViewDataBinding.inflateInternal(inflater, R.layout.mytab_setting_account_item, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ak l(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ak) ViewDataBinding.inflateInternal(inflater, R.layout.mytab_setting_account_item, null, false, component);
    }

    public boolean d() {
        return this.f54189c;
    }

    public boolean e() {
        return this.f54190d;
    }

    public boolean g() {
        return this.f54188b;
    }

    @Nullable
    public View.OnClickListener h() {
        return this.f54187a;
    }

    public abstract void m(boolean bindPhone);

    public abstract void n(boolean bindQQ);

    public abstract void o(boolean bindWx);

    public abstract void p(@Nullable View.OnClickListener onClickListener);
}
