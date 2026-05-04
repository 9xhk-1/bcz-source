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
public abstract class ik extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55335a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final SwitchButton f55336b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55337c;

    /* renamed from: d, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f55338d;

    /* renamed from: e, reason: collision with root package name */
    @Bindable
    public String f55339e;

    /* renamed from: f, reason: collision with root package name */
    @Bindable
    public MutableLiveData<Boolean> f55340f;

    /* renamed from: g, reason: collision with root package name */
    @Bindable
    public String f55341g;

    public ik(Object _bindingComponent, View _root, int _localFieldCount, TextView subTitle, SwitchButton switcher, TextView titleItem) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55335a = subTitle;
        this.f55336b = switcher;
        this.f55337c = titleItem;
    }

    public static ik b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ik c(@NonNull View view, @Nullable Object component) {
        return (ik) ViewDataBinding.bind(component, view, R.layout.mytab_setting_switch_extended_item);
    }

    @NonNull
    public static ik i(@NonNull LayoutInflater inflater) {
        return l(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ik j(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return k(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ik k(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ik) ViewDataBinding.inflateInternal(inflater, R.layout.mytab_setting_switch_extended_item, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ik l(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ik) ViewDataBinding.inflateInternal(inflater, R.layout.mytab_setting_switch_extended_item, null, false, component);
    }

    @Nullable
    public MutableLiveData<Boolean> d() {
        return this.f55340f;
    }

    @Nullable
    public View.OnClickListener e() {
        return this.f55338d;
    }

    @Nullable
    public String g() {
        return this.f55341g;
    }

    @Nullable
    public String h() {
        return this.f55339e;
    }

    public abstract void m(@Nullable MutableLiveData<Boolean> checked);

    public abstract void n(@Nullable View.OnClickListener onClickListener);

    public abstract void o(@Nullable String subTitle);

    public abstract void p(@Nullable String title);
}
