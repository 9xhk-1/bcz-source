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
public abstract class ek extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f54810a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54811b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54812c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54813d;

    /* renamed from: e, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f54814e;

    /* renamed from: f, reason: collision with root package name */
    @Bindable
    public Drawable f54815f;

    /* renamed from: g, reason: collision with root package name */
    @Bindable
    public boolean f54816g;

    /* renamed from: h, reason: collision with root package name */
    @Bindable
    public String f54817h;

    /* renamed from: i, reason: collision with root package name */
    @Bindable
    public String f54818i;

    /* renamed from: j, reason: collision with root package name */
    @Bindable
    public int f54819j;

    /* renamed from: k, reason: collision with root package name */
    @Bindable
    public Drawable f54820k;

    /* renamed from: l, reason: collision with root package name */
    @Bindable
    public boolean f54821l;

    /* renamed from: m, reason: collision with root package name */
    @Bindable
    public Boolean f54822m;

    /* renamed from: n, reason: collision with root package name */
    @Bindable
    public boolean f54823n;

    public ek(Object _bindingComponent, View _root, int _localFieldCount, ImageView arrowRight, ImageView icon, TextView subTitleValue, TextView titleValue) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54810a = arrowRight;
        this.f54811b = icon;
        this.f54812c = subTitleValue;
        this.f54813d = titleValue;
    }

    public static ek b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ek c(@NonNull View view, @Nullable Object component) {
        return (ek) ViewDataBinding.bind(component, view, R.layout.mytab_setting_basic_item_trans);
    }

    @NonNull
    public static ek o(@NonNull LayoutInflater inflater) {
        return s(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ek p(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return r(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ek r(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ek) ViewDataBinding.inflateInternal(inflater, R.layout.mytab_setting_basic_item_trans, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ek s(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ek) ViewDataBinding.inflateInternal(inflater, R.layout.mytab_setting_basic_item_trans, null, false, component);
    }

    public abstract void A(boolean rightRedDot);

    public abstract void B(@Nullable Boolean selected);

    public abstract void C(@Nullable String subTitle);

    public abstract void D(@Nullable String title);

    @Nullable
    public Drawable d() {
        return this.f54820k;
    }

    public int e() {
        return this.f54819j;
    }

    @Nullable
    public Drawable g() {
        return this.f54815f;
    }

    public boolean h() {
        return this.f54816g;
    }

    @Nullable
    public View.OnClickListener i() {
        return this.f54814e;
    }

    public boolean j() {
        return this.f54821l;
    }

    public boolean k() {
        return this.f54823n;
    }

    @Nullable
    public Boolean l() {
        return this.f54822m;
    }

    @Nullable
    public String m() {
        return this.f54818i;
    }

    @Nullable
    public String n() {
        return this.f54817h;
    }

    public abstract void t(@Nullable Drawable endIcon);

    public abstract void u(int endIconVisibility);

    public abstract void v(@Nullable Drawable iconLeft);

    public abstract void x(boolean newByIcon);

    public abstract void y(@Nullable View.OnClickListener onClickListener);

    public abstract void z(boolean redDot);
}
