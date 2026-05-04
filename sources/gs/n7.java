package gs;

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
import com.baicizhan.main.view.PreferenceView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class n7 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final PreferenceView f55997a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f55998b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f55999c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f56000d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final PreferenceView f56001e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final PreferenceView f56002f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f56003g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f56004h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final PreferenceView f56005i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f56006j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final PreferenceView f56007k;

    /* renamed from: l, reason: collision with root package name */
    @Bindable
    public ue.v f56008l;

    public n7(Object _bindingComponent, View _root, int _localFieldCount, PreferenceView currentVersion, View debug1, View debug2, View divider1, PreferenceView feedbackEmail, PreferenceView feedbackPhone, TextView icp, ImageView image, PreferenceView joinUs, TextView protocol, PreferenceView versionUpdate) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55997a = currentVersion;
        this.f55998b = debug1;
        this.f55999c = debug2;
        this.f56000d = divider1;
        this.f56001e = feedbackEmail;
        this.f56002f = feedbackPhone;
        this.f56003g = icp;
        this.f56004h = image;
        this.f56005i = joinUs;
        this.f56006j = protocol;
        this.f56007k = versionUpdate;
    }

    public static n7 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static n7 c(@NonNull View view, @Nullable Object component) {
        return (n7) ViewDataBinding.bind(component, view, R.layout.fragment_about_us_v2);
    }

    @NonNull
    public static n7 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static n7 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static n7 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (n7) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_about_us_v2, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static n7 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (n7) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_about_us_v2, null, false, component);
    }

    @Nullable
    public ue.v d() {
        return this.f56008l;
    }

    public abstract void j(@Nullable ue.v viewmodel);
}
