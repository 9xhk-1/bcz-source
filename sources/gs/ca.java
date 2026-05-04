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
public abstract class ca extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ck f54415a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54416b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ck f54417c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ck f54418d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ck f54419e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final kk f54420f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final kk f54421g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ck f54422h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f54423i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final kk f54424j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ck f54425k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ck f54426l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final kk f54427m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final ck f54428n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final kk f54429o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final kk f54430p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f54431q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final ck f54432r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final ck f54433s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final ck f54434t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final ck f54435u;

    /* renamed from: v, reason: collision with root package name */
    @Bindable
    public com.baicizhan.main.activity.setting.privatessetting.debug.j2 f54436v;

    public ca(Object _bindingComponent, View _root, int _localFieldCount, ck adCacheDetail, TextView adCacheSection, ck apiTest, ck copyCode, ck crash, kk debugStudyMode, kk debugWhitelistMode, ck hwPay, TextView hwSection, kk minuteAsSecond, ck network, ck newGuideFlag, kk secondAsMinute, ck spineTest, kk vldCameraAdding, kk vldEntry, TextView vldSection, ck watchTest, ck web, ck webUrl, ck wordList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54415a = adCacheDetail;
        this.f54416b = adCacheSection;
        this.f54417c = apiTest;
        this.f54418d = copyCode;
        this.f54419e = crash;
        this.f54420f = debugStudyMode;
        this.f54421g = debugWhitelistMode;
        this.f54422h = hwPay;
        this.f54423i = hwSection;
        this.f54424j = minuteAsSecond;
        this.f54425k = network;
        this.f54426l = newGuideFlag;
        this.f54427m = secondAsMinute;
        this.f54428n = spineTest;
        this.f54429o = vldCameraAdding;
        this.f54430p = vldEntry;
        this.f54431q = vldSection;
        this.f54432r = watchTest;
        this.f54433s = web;
        this.f54434t = webUrl;
        this.f54435u = wordList;
    }

    public static ca b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ca c(@NonNull View view, @Nullable Object component) {
        return (ca) ViewDataBinding.bind(component, view, R.layout.fragment_privates_debug_setting);
    }

    @NonNull
    public static ca e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ca g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ca h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ca) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_privates_debug_setting, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ca i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ca) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_privates_debug_setting, null, false, component);
    }

    @Nullable
    public com.baicizhan.main.activity.setting.privatessetting.debug.j2 d() {
        return this.f54436v;
    }

    public abstract void j(@Nullable com.baicizhan.main.activity.setting.privatessetting.debug.j2 viewmodel);
}
