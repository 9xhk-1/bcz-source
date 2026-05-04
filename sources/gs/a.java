package gs;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
public abstract class a extends ViewDataBinding {

    @Bindable
    public int A;

    @Bindable
    public int B;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f54085a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54086b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54087c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f54088d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54089e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f54090f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f54091g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54092h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f54093i;

    /* renamed from: j, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f54094j;

    /* renamed from: k, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f54095k;

    /* renamed from: l, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f54096l;

    /* renamed from: m, reason: collision with root package name */
    @Bindable
    public String f54097m;

    /* renamed from: n, reason: collision with root package name */
    @Bindable
    public String f54098n;

    /* renamed from: o, reason: collision with root package name */
    @Bindable
    public Boolean f54099o;

    /* renamed from: p, reason: collision with root package name */
    @Bindable
    public boolean f54100p;

    /* renamed from: q, reason: collision with root package name */
    @Bindable
    public boolean f54101q;

    /* renamed from: r, reason: collision with root package name */
    @Bindable
    public Drawable f54102r;

    /* renamed from: s, reason: collision with root package name */
    @Bindable
    public Drawable f54103s;

    /* renamed from: t, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f54104t;

    /* renamed from: u, reason: collision with root package name */
    @Bindable
    public View.OnLongClickListener f54105u;

    /* renamed from: v, reason: collision with root package name */
    @Bindable
    public boolean f54106v;

    /* renamed from: w, reason: collision with root package name */
    @Bindable
    public Drawable f54107w;

    /* renamed from: x, reason: collision with root package name */
    @Bindable
    public Drawable f54108x;

    /* renamed from: y, reason: collision with root package name */
    @Bindable
    public Boolean f54109y;

    /* renamed from: z, reason: collision with root package name */
    @Bindable
    public boolean f54110z;

    public a(Object _bindingComponent, View _root, int _localFieldCount, ImageView actionBarBack, ImageView actionBarClose, ConstraintLayout actionBarContainer, ImageView actionBarOperateRight, FrameLayout actionBarOperateRight2, ImageView actionBarRight2Badge, ImageView actionBarRight2Icon, TextView actionBarTextOperateRight, TextView title) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54085a = actionBarBack;
        this.f54086b = actionBarClose;
        this.f54087c = actionBarContainer;
        this.f54088d = actionBarOperateRight;
        this.f54089e = actionBarOperateRight2;
        this.f54090f = actionBarRight2Badge;
        this.f54091g = actionBarRight2Icon;
        this.f54092h = actionBarTextOperateRight;
        this.f54093i = title;
    }

    @NonNull
    public static a A(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return B(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static a B(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (a) ViewDataBinding.inflateInternal(inflater, R.layout.action_bar_basic, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static a C(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (a) ViewDataBinding.inflateInternal(inflater, R.layout.action_bar_basic, null, false, component);
    }

    public static a b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static a c(@NonNull View view, @Nullable Object component) {
        return (a) ViewDataBinding.bind(component, view, R.layout.action_bar_basic);
    }

    @NonNull
    public static a z(@NonNull LayoutInflater inflater) {
        return C(inflater, DataBindingUtil.getDefaultComponent());
    }

    public abstract void D(@Nullable View.OnClickListener backOnclick);

    public abstract void F(int bgColor);

    public abstract void G(@Nullable Drawable leftIcon);

    public abstract void H(@Nullable Drawable rightBadge2);

    public abstract void I(@Nullable Drawable rightIcon);

    public abstract void J(@Nullable Drawable rightIcon2);

    public abstract void K(@Nullable View.OnLongClickListener rightOnLongClick2);

    public abstract void L(@Nullable View.OnClickListener rightOnclick);

    public abstract void M(@Nullable View.OnClickListener rightOnclick2);

    public abstract void N(@Nullable String rightTitle);

    public abstract void O(int rightTitleColor);

    public abstract void P(@Nullable Boolean showBack);

    public abstract void Q(@Nullable Boolean showClose);

    public abstract void R(boolean showDivider);

    public abstract void S(boolean showRight);

    public abstract void T(boolean showRight2);

    public abstract void U(@Nullable View.OnClickListener stopOnclick);

    public abstract void V(@Nullable String title);

    public abstract void W(boolean whiteMode);

    @Nullable
    public View.OnClickListener d() {
        return this.f54094j;
    }

    public int e() {
        return this.A;
    }

    @Nullable
    public Drawable g() {
        return this.f54102r;
    }

    @Nullable
    public Drawable h() {
        return this.f54108x;
    }

    @Nullable
    public Drawable i() {
        return this.f54103s;
    }

    @Nullable
    public Drawable j() {
        return this.f54107w;
    }

    @Nullable
    public View.OnLongClickListener k() {
        return this.f54105u;
    }

    @Nullable
    public View.OnClickListener l() {
        return this.f54096l;
    }

    @Nullable
    public View.OnClickListener m() {
        return this.f54104t;
    }

    @Nullable
    public String n() {
        return this.f54098n;
    }

    public int o() {
        return this.B;
    }

    @Nullable
    public Boolean p() {
        return this.f54099o;
    }

    @Nullable
    public Boolean r() {
        return this.f54109y;
    }

    public boolean s() {
        return this.f54110z;
    }

    public boolean t() {
        return this.f54101q;
    }

    public boolean u() {
        return this.f54106v;
    }

    @Nullable
    public View.OnClickListener v() {
        return this.f54095k;
    }

    @Nullable
    public String x() {
        return this.f54097m;
    }

    public boolean y() {
        return this.f54100p;
    }
}
