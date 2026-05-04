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
public abstract class d2 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ck f54544a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ak f54545b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final a f54546c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ck f54547d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final kk f54548e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ck f54549f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ck f54550g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ck f54551h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f54552i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ck f54553j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ck f54554k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ck f54555l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final ck f54556m;

    /* renamed from: n, reason: collision with root package name */
    @Bindable
    public com.baicizhan.main.activity.setting.a f54557n;

    public d2(Object _bindingComponent, View _root, int _localFieldCount, ck aboutUs, ak accountMgr, a actionBar, ck cacheMgr, kk careSetting, ck dakaMode, ck learningRemainder, ck learningSetting, TextView logout, ck personalInfoCollections, ck privatesSetting, ck thirdParties, ck uiSetting) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54544a = aboutUs;
        this.f54545b = accountMgr;
        this.f54546c = actionBar;
        this.f54547d = cacheMgr;
        this.f54548e = careSetting;
        this.f54549f = dakaMode;
        this.f54550g = learningRemainder;
        this.f54551h = learningSetting;
        this.f54552i = logout;
        this.f54553j = personalInfoCollections;
        this.f54554k = privatesSetting;
        this.f54555l = thirdParties;
        this.f54556m = uiSetting;
    }

    public static d2 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static d2 c(@NonNull View view, @Nullable Object component) {
        return (d2) ViewDataBinding.bind(component, view, R.layout.activity_settings_v2);
    }

    @NonNull
    public static d2 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static d2 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static d2 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (d2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_settings_v2, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static d2 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (d2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_settings_v2, null, false, component);
    }

    @Nullable
    public com.baicizhan.main.activity.setting.a d() {
        return this.f54557n;
    }

    public abstract void j(@Nullable com.baicizhan.main.activity.setting.a viewmodel);
}
