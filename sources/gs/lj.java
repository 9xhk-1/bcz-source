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
public abstract class lj extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55780a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55781b;

    /* renamed from: c, reason: collision with root package name */
    @Bindable
    public ld.g f55782c;

    public lj(Object _bindingComponent, View _root, int _localFieldCount, TextView retry, TextView tips) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55780a = retry;
        this.f55781b = tips;
    }

    public static lj b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static lj c(@NonNull View view, @Nullable Object component) {
        return (lj) ViewDataBinding.bind(component, view, R.layout.learning_calendarview_tail_item);
    }

    @NonNull
    public static lj e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static lj g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static lj h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (lj) ViewDataBinding.inflateInternal(inflater, R.layout.learning_calendarview_tail_item, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static lj i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (lj) ViewDataBinding.inflateInternal(inflater, R.layout.learning_calendarview_tail_item, null, false, component);
    }

    @Nullable
    public ld.g d() {
        return this.f55782c;
    }

    public abstract void j(@Nullable ld.g viewmodel);
}
