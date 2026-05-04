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
import androidx.lifecycle.MutableLiveData;
import com.jiongji.andriod.card.R;
import com.kyleduo.switchbutton.SwitchButton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class kk extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final SwitchButton f55629a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55630b;

    /* renamed from: c, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f55631c;

    /* renamed from: d, reason: collision with root package name */
    @Bindable
    public String f55632d;

    /* renamed from: e, reason: collision with root package name */
    @Bindable
    public MutableLiveData<Boolean> f55633e;

    public kk(Object _bindingComponent, View _root, int _localFieldCount, SwitchButton switcher, TextView titleItem) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55629a = switcher;
        this.f55630b = titleItem;
    }

    public static kk b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static kk c(@NonNull View view, @Nullable Object component) {
        return (kk) ViewDataBinding.bind(component, view, R.layout.mytab_setting_switch_item);
    }

    @NonNull
    public static kk h(@NonNull LayoutInflater inflater) {
        return k(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static kk i(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return j(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static kk j(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (kk) ViewDataBinding.inflateInternal(inflater, R.layout.mytab_setting_switch_item, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static kk k(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (kk) ViewDataBinding.inflateInternal(inflater, R.layout.mytab_setting_switch_item, null, false, component);
    }

    @Nullable
    public MutableLiveData<Boolean> d() {
        return this.f55633e;
    }

    @Nullable
    public View.OnClickListener e() {
        return this.f55631c;
    }

    @Nullable
    public String g() {
        return this.f55632d;
    }

    public abstract void l(@Nullable MutableLiveData<Boolean> checked);

    public abstract void m(@Nullable View.OnClickListener onClickListener);

    public abstract void n(@Nullable String title);
}
