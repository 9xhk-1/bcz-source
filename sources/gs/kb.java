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
public abstract class kb extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55591a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55592b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55593c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f55594d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55595e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55596f;

    /* renamed from: g, reason: collision with root package name */
    @Bindable
    public mf.m f55597g;

    public kb(Object _bindingComponent, View _root, int _localFieldCount, TextView bachelor, TextView cancel, TextView college, View divider, TextView phd, TextView post) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55591a = bachelor;
        this.f55592b = cancel;
        this.f55593c = college;
        this.f55594d = divider;
        this.f55595e = phd;
        this.f55596f = post;
    }

    public static kb b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static kb c(@NonNull View view, @Nullable Object component) {
        return (kb) ViewDataBinding.bind(component, view, R.layout.fragment_userinfo_edit_education);
    }

    @NonNull
    public static kb e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static kb g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static kb h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (kb) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_userinfo_edit_education, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static kb i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (kb) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_userinfo_edit_education, null, false, component);
    }

    @Nullable
    public mf.m d() {
        return this.f55597g;
    }

    public abstract void j(@Nullable mf.m viewmodel);
}
