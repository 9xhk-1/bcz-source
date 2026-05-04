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
public abstract class va extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final kk f57147a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ck f57148b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final kk f57149c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final kk f57150d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final kk f57151e;

    /* renamed from: f, reason: collision with root package name */
    @Bindable
    public cf.d f57152f;

    public va(Object _bindingComponent, View _root, int _localFieldCount, kk deformation, ck extraProblem, kk mean, kk sound, kk translate) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57147a = deformation;
        this.f57148b = extraProblem;
        this.f57149c = mean;
        this.f57150d = sound;
        this.f57151e = translate;
    }

    public static va b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static va c(@NonNull View view, @Nullable Object component) {
        return (va) ViewDataBinding.bind(component, view, R.layout.fragment_setting_study_setting);
    }

    @NonNull
    public static va e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static va g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static va h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (va) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_setting_study_setting, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static va i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (va) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_setting_study_setting, null, false, component);
    }

    @Nullable
    public cf.d d() {
        return this.f57152f;
    }

    public abstract void j(@Nullable cf.d viewmodel);
}
