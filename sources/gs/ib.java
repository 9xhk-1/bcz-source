package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ib extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55293a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ek f55294b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ek f55295c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ek f55296d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ek f55297e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ek f55298f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ek f55299g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ek f55300h;

    /* renamed from: i, reason: collision with root package name */
    @Bindable
    public ef.l f55301i;

    public ib(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout avatar, ek birthday, ek gradle, ek ipDesc, ek location, ek nickname, ek school, ek sex) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55293a = avatar;
        this.f55294b = birthday;
        this.f55295c = gradle;
        this.f55296d = ipDesc;
        this.f55297e = location;
        this.f55298f = nickname;
        this.f55299g = school;
        this.f55300h = sex;
    }

    public static ib b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ib c(@NonNull View view, @Nullable Object component) {
        return (ib) ViewDataBinding.bind(component, view, R.layout.fragment_userinfo);
    }

    @NonNull
    public static ib e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ib g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ib h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ib) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_userinfo, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ib i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ib) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_userinfo, null, false, component);
    }

    @Nullable
    public ef.l d() {
        return this.f55301i;
    }

    public abstract void j(@Nullable ef.l viewmodel);
}
