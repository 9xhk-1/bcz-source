package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class gk extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f55079a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Barrier f55080b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55081c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55082d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55083e;

    /* renamed from: f, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f55084f;

    /* renamed from: g, reason: collision with root package name */
    @Bindable
    public String f55085g;

    /* renamed from: h, reason: collision with root package name */
    @Bindable
    public String f55086h;

    /* renamed from: i, reason: collision with root package name */
    @Bindable
    public String f55087i;

    /* renamed from: j, reason: collision with root package name */
    @Bindable
    public int f55088j;

    /* renamed from: k, reason: collision with root package name */
    @Bindable
    public boolean f55089k;

    /* renamed from: l, reason: collision with root package name */
    @Bindable
    public Boolean f55090l;

    /* renamed from: m, reason: collision with root package name */
    @Bindable
    public Boolean f55091m;

    public gk(Object _bindingComponent, View _root, int _localFieldCount, ImageView arrowRight, Barrier barrier, TextView description, TextView subTitle, TextView titleValue) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55079a = arrowRight;
        this.f55080b = barrier;
        this.f55081c = description;
        this.f55082d = subTitle;
        this.f55083e = titleValue;
    }

    public static gk b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static gk c(@NonNull View view, @Nullable Object component) {
        return (gk) ViewDataBinding.bind(component, view, R.layout.mytab_setting_extended_item);
    }

    @NonNull
    public static gk m(@NonNull LayoutInflater inflater) {
        return p(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static gk n(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return o(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static gk o(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (gk) ViewDataBinding.inflateInternal(inflater, R.layout.mytab_setting_extended_item, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static gk p(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (gk) ViewDataBinding.inflateInternal(inflater, R.layout.mytab_setting_extended_item, null, false, component);
    }

    @Nullable
    public String d() {
        return this.f55087i;
    }

    @Nullable
    public Boolean e() {
        return this.f55090l;
    }

    public int g() {
        return this.f55088j;
    }

    @Nullable
    public View.OnClickListener h() {
        return this.f55084f;
    }

    public boolean i() {
        return this.f55089k;
    }

    @Nullable
    public Boolean j() {
        return this.f55091m;
    }

    @Nullable
    public String k() {
        return this.f55086h;
    }

    @Nullable
    public String l() {
        return this.f55085g;
    }

    public abstract void r(@Nullable String description);

    public abstract void s(@Nullable Boolean descriptionHighlight);

    public abstract void t(int endIconVisibility);

    public abstract void u(@Nullable View.OnClickListener onClickListener);

    public abstract void v(boolean redDot);

    public abstract void x(@Nullable Boolean selected);

    public abstract void y(@Nullable String subTitle);

    public abstract void z(@Nullable String title);
}
