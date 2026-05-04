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
public abstract class ta extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final kk f56864a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final kk f56865b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final kk f56866c;

    /* renamed from: d, reason: collision with root package name */
    @Bindable
    public xe.d f56867d;

    public ta(Object _bindingComponent, View _root, int _localFieldCount, kk cnWord, kk listener, kk spell) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56864a = cnWord;
        this.f56865b = listener;
        this.f56866c = spell;
    }

    public static ta b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ta c(@NonNull View view, @Nullable Object component) {
        return (ta) ViewDataBinding.bind(component, view, R.layout.fragment_setting_extra_problem_setting);
    }

    @NonNull
    public static ta e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ta g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ta h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ta) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_setting_extra_problem_setting, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ta i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ta) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_setting_extra_problem_setting, null, false, component);
    }

    @Nullable
    public xe.d d() {
        return this.f56867d;
    }

    public abstract void j(@Nullable xe.d viewmodel);
}
