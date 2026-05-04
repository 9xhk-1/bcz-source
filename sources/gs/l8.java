package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class l8 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ck f55727a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ck f55728b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ck f55729c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ck f55730d;

    /* renamed from: e, reason: collision with root package name */
    @Bindable
    public mf.l f55731e;

    public l8(Object _bindingComponent, View _root, int _localFieldCount, ck education, ck enrollmentDate, ck major, ck shcool) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55727a = education;
        this.f55728b = enrollmentDate;
        this.f55729c = major;
        this.f55730d = shcool;
    }

    public static l8 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static l8 c(@NonNull View view, @Nullable Object component) {
        return (l8) ViewDataBinding.bind(component, view, R.layout.fragment_edit_school);
    }

    @NonNull
    public static l8 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static l8 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static l8 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (l8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_edit_school, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static l8 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (l8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_edit_school, null, false, component);
    }

    @Nullable
    public mf.l d() {
        return this.f55731e;
    }

    public abstract void j(@Nullable mf.l viewmodel);
}
