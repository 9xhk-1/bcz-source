package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.main.activity.userinfo.data.AccountBindingMgr;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class gb extends ViewDataBinding {

    @NonNull
    public final ImageView A;

    @NonNull
    public final TextView B;

    @Bindable
    public int C;

    @Bindable
    public boolean D;

    @Bindable
    public View.OnClickListener E;

    @Bindable
    public boolean F;

    @Bindable
    public AccountBindingMgr.BindInfo G;

    @Bindable
    public AccountBindingMgr.BindInfo H;

    @Bindable
    public AccountBindingMgr.BindInfo I;

    @Bindable
    public ta.b J;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55025a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55026b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f55027c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55028d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55029e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55030f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f55031g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f55032h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55033i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f55034j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f55035k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f55036l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f55037m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f55038n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f55039o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final ImageView f55040p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f55041q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55042r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final TextView f55043s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final ImageView f55044t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final TextView f55045u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final TextView f55046v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    public final ImageView f55047w;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public final TextView f55048x;

    /* renamed from: y, reason: collision with root package name */
    @NonNull
    public final TextView f55049y;

    /* renamed from: z, reason: collision with root package name */
    @NonNull
    public final TextView f55050z;

    public gb(Object _bindingComponent, View _root, int _localFieldCount, TextView bindPhoneButton, TextView bindPhoneContent, ImageView bindPhoneImage, TextView bindPhoneTitle, TextView bindQqButton, TextView bindQqContent, ImageView bindQqImage, TextView bindQqTitle, TextView bindWechartContent, TextView bindWechatButton, ImageView bindWechatImage, TextView bindWechatTitle, TextView bindedTitle, TextView currentButton, TextView currentContent, ImageView currentImage, TextView currentTitle, LinearLayout main, TextView unbindPhoneButton, ImageView unbindPhoneImage, TextView unbindPhoneTitle, TextView unbindQqButton, ImageView unbindQqImage, TextView unbindQqTitle, TextView unbindTitle, TextView unbindWechatButton, ImageView unbindWechatImage, TextView unbindWechatTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55025a = bindPhoneButton;
        this.f55026b = bindPhoneContent;
        this.f55027c = bindPhoneImage;
        this.f55028d = bindPhoneTitle;
        this.f55029e = bindQqButton;
        this.f55030f = bindQqContent;
        this.f55031g = bindQqImage;
        this.f55032h = bindQqTitle;
        this.f55033i = bindWechartContent;
        this.f55034j = bindWechatButton;
        this.f55035k = bindWechatImage;
        this.f55036l = bindWechatTitle;
        this.f55037m = bindedTitle;
        this.f55038n = currentButton;
        this.f55039o = currentContent;
        this.f55040p = currentImage;
        this.f55041q = currentTitle;
        this.f55042r = main;
        this.f55043s = unbindPhoneButton;
        this.f55044t = unbindPhoneImage;
        this.f55045u = unbindPhoneTitle;
        this.f55046v = unbindQqButton;
        this.f55047w = unbindQqImage;
        this.f55048x = unbindQqTitle;
        this.f55049y = unbindTitle;
        this.f55050z = unbindWechatButton;
        this.A = unbindWechatImage;
        this.B = unbindWechatTitle;
    }

    public static gb b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static gb c(@NonNull View view, @Nullable Object component) {
        return (gb) ViewDataBinding.bind(component, view, R.layout.fragment_usercenter_accountbind);
    }

    @NonNull
    public static gb m(@NonNull LayoutInflater inflater) {
        return p(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static gb n(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return o(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static gb o(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (gb) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_usercenter_accountbind, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static gb p(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (gb) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_usercenter_accountbind, null, false, component);
    }

    @Nullable
    public View.OnClickListener d() {
        return this.E;
    }

    public int e() {
        return this.C;
    }

    @Nullable
    public ta.b g() {
        return this.J;
    }

    @Nullable
    public AccountBindingMgr.BindInfo h() {
        return this.I;
    }

    @Nullable
    public AccountBindingMgr.BindInfo i() {
        return this.G;
    }

    public boolean j() {
        return this.D;
    }

    public boolean k() {
        return this.F;
    }

    @Nullable
    public AccountBindingMgr.BindInfo l() {
        return this.H;
    }

    public abstract void r(@Nullable View.OnClickListener clickListener);

    public abstract void s(int currentType);

    public abstract void t(@Nullable ta.b loadingVm);

    public abstract void u(@Nullable AccountBindingMgr.BindInfo phone);

    public abstract void v(@Nullable AccountBindingMgr.BindInfo qq2);

    public abstract void x(boolean showCurrent);

    public abstract void y(boolean showQQ);

    public abstract void z(@Nullable AccountBindingMgr.BindInfo wechat);
}
