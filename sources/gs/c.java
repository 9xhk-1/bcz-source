package gs;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class c extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f54326a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54327b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54328c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f54329d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54330e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f54331f;

    /* renamed from: g, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f54332g;

    /* renamed from: h, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f54333h;

    /* renamed from: i, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f54334i;

    /* renamed from: j, reason: collision with root package name */
    @Bindable
    public String f54335j;

    /* renamed from: k, reason: collision with root package name */
    @Bindable
    public String f54336k;

    /* renamed from: l, reason: collision with root package name */
    @Bindable
    public Boolean f54337l;

    /* renamed from: m, reason: collision with root package name */
    @Bindable
    public boolean f54338m;

    /* renamed from: n, reason: collision with root package name */
    @Bindable
    public boolean f54339n;

    /* renamed from: o, reason: collision with root package name */
    @Bindable
    public Drawable f54340o;

    /* renamed from: p, reason: collision with root package name */
    @Bindable
    public Boolean f54341p;

    /* renamed from: q, reason: collision with root package name */
    @Bindable
    public boolean f54342q;

    /* renamed from: r, reason: collision with root package name */
    @Bindable
    public int f54343r;

    /* renamed from: s, reason: collision with root package name */
    @Bindable
    public int f54344s;

    public c(Object _bindingComponent, View _root, int _localFieldCount, ImageView actionBarBack, ImageView actionBarClose, ConstraintLayout actionBarContainer, ImageView actionBarOperateRight, TextView actionBarTextOperateRight, TextView title) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54326a = actionBarBack;
        this.f54327b = actionBarClose;
        this.f54328c = actionBarContainer;
        this.f54329d = actionBarOperateRight;
        this.f54330e = actionBarTextOperateRight;
        this.f54331f = title;
    }

    public static c b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static c c(@NonNull View view, @Nullable Object component) {
        return (c) ViewDataBinding.bind(component, view, R.layout.action_bar_basic_without_fit);
    }

    @NonNull
    public static c s(@NonNull LayoutInflater inflater) {
        return v(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static c t(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return u(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static c u(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (c) ViewDataBinding.inflateInternal(inflater, R.layout.action_bar_basic_without_fit, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static c v(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (c) ViewDataBinding.inflateInternal(inflater, R.layout.action_bar_basic_without_fit, null, false, component);
    }

    public abstract void A(@Nullable View.OnClickListener rightOnclick);

    public abstract void B(@Nullable String rightTitle);

    public abstract void C(int rightTitleColor);

    public abstract void D(@Nullable Boolean showBack);

    public abstract void F(@Nullable Boolean showClose);

    public abstract void G(boolean showDivider);

    public abstract void H(boolean showRight);

    public abstract void I(@Nullable View.OnClickListener stopOnclick);

    public abstract void J(@Nullable String title);

    public abstract void K(boolean whiteMode);

    @Nullable
    public View.OnClickListener d() {
        return this.f54332g;
    }

    public int e() {
        return this.f54343r;
    }

    @Nullable
    public Drawable g() {
        return this.f54340o;
    }

    @Nullable
    public View.OnClickListener h() {
        return this.f54334i;
    }

    @Nullable
    public String i() {
        return this.f54336k;
    }

    public int j() {
        return this.f54344s;
    }

    @Nullable
    public Boolean k() {
        return this.f54337l;
    }

    @Nullable
    public Boolean l() {
        return this.f54341p;
    }

    public boolean m() {
        return this.f54342q;
    }

    public boolean n() {
        return this.f54339n;
    }

    @Nullable
    public View.OnClickListener o() {
        return this.f54333h;
    }

    @Nullable
    public String p() {
        return this.f54335j;
    }

    public boolean r() {
        return this.f54338m;
    }

    public abstract void x(@Nullable View.OnClickListener backOnclick);

    public abstract void y(int bgColor);

    public abstract void z(@Nullable Drawable rightIcon);
}
