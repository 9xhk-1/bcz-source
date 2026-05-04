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
public abstract class ra extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f56620a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56621b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56622c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f56623d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f56624e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f56625f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f56626g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f56627h;

    /* renamed from: i, reason: collision with root package name */
    @Bindable
    public we.d f56628i;

    public ra(Object _bindingComponent, View _root, int _localFieldCount, View classicDakaBg, TextView classicDakaTitle, TextView classicDakaTitle1, View divider, View divider2, View imageDakaBg, TextView imageDakaTitle, TextView imageDakaTitle1) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56620a = classicDakaBg;
        this.f56621b = classicDakaTitle;
        this.f56622c = classicDakaTitle1;
        this.f56623d = divider;
        this.f56624e = divider2;
        this.f56625f = imageDakaBg;
        this.f56626g = imageDakaTitle;
        this.f56627h = imageDakaTitle1;
    }

    public static ra b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ra c(@NonNull View view, @Nullable Object component) {
        return (ra) ViewDataBinding.bind(component, view, R.layout.fragment_setting_daka_mode_setting);
    }

    @NonNull
    public static ra e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ra g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ra h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ra) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_setting_daka_mode_setting, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ra i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ra) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_setting_daka_mode_setting, null, false, component);
    }

    @Nullable
    public we.d d() {
        return this.f56628i;
    }

    public abstract void j(@Nullable we.d viewmodel);
}
