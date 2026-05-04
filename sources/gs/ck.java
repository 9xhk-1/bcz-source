package gs;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ck extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f54479a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54480b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54481c;

    /* renamed from: d, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f54482d;

    /* renamed from: e, reason: collision with root package name */
    @Bindable
    public Drawable f54483e;

    /* renamed from: f, reason: collision with root package name */
    @Bindable
    public String f54484f;

    /* renamed from: g, reason: collision with root package name */
    @Bindable
    public String f54485g;

    /* renamed from: h, reason: collision with root package name */
    @Bindable
    public int f54486h;

    /* renamed from: i, reason: collision with root package name */
    @Bindable
    public boolean f54487i;

    /* renamed from: j, reason: collision with root package name */
    @Bindable
    public Boolean f54488j;

    public ck(Object _bindingComponent, View _root, int _localFieldCount, ImageView arrowRight, ImageView icon, TextView titleValue) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54479a = arrowRight;
        this.f54480b = icon;
        this.f54481c = titleValue;
    }

    public static ck b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ck c(@NonNull View view, @Nullable Object component) {
        return (ck) ViewDataBinding.bind(component, view, R.layout.mytab_setting_basic_item);
    }

    @NonNull
    public static ck l(@NonNull LayoutInflater inflater) {
        return o(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ck m(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return n(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ck n(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ck) ViewDataBinding.inflateInternal(inflater, R.layout.mytab_setting_basic_item, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ck o(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ck) ViewDataBinding.inflateInternal(inflater, R.layout.mytab_setting_basic_item, null, false, component);
    }

    public int d() {
        return this.f54486h;
    }

    @Nullable
    public Drawable e() {
        return this.f54483e;
    }

    @Nullable
    public View.OnClickListener g() {
        return this.f54482d;
    }

    public boolean h() {
        return this.f54487i;
    }

    @Nullable
    public Boolean i() {
        return this.f54488j;
    }

    @Nullable
    public String j() {
        return this.f54485g;
    }

    @Nullable
    public String k() {
        return this.f54484f;
    }

    public abstract void p(int endIconVisibility);

    public abstract void r(@Nullable Drawable iconLeft);

    public abstract void s(@Nullable View.OnClickListener onClickListener);

    public abstract void t(boolean redDot);

    public abstract void u(@Nullable Boolean selected);

    public abstract void v(@Nullable String subTitle);

    public abstract void x(@Nullable String title);
}
