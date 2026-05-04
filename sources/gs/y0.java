package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class y0 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57523a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57524b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f57525c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57526d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57527e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57528f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57529g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57530h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f57531i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57532j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f57533k;

    /* renamed from: l, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f57534l;

    /* renamed from: m, reason: collision with root package name */
    @Bindable
    public String f57535m;

    public y0(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout buttonArea, TextView haveATry, ImageView header, FrameLayout loginHw, TextView loginOther, FrameLayout loginQq, TextView loginTip, FrameLayout loginWeixin, TextView protocol, LinearLayout protocolContainer, ImageView protocolIcon) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57523a = buttonArea;
        this.f57524b = haveATry;
        this.f57525c = header;
        this.f57526d = loginHw;
        this.f57527e = loginOther;
        this.f57528f = loginQq;
        this.f57529g = loginTip;
        this.f57530h = loginWeixin;
        this.f57531i = protocol;
        this.f57532j = protocolContainer;
        this.f57533k = protocolIcon;
    }

    public static y0 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static y0 c(@NonNull View view, @Nullable Object component) {
        return (y0) ViewDataBinding.bind(component, view, R.layout.activity_introduction_page);
    }

    @NonNull
    public static y0 g(@NonNull LayoutInflater inflater) {
        return j(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static y0 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return i(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static y0 i(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (y0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_introduction_page, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static y0 j(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (y0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_introduction_page, null, false, component);
    }

    @Nullable
    public View.OnClickListener d() {
        return this.f57534l;
    }

    @Nullable
    public String e() {
        return this.f57535m;
    }

    public abstract void k(@Nullable View.OnClickListener clickListener);

    public abstract void l(@Nullable String tipsContent);
}
