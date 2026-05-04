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
public abstract class ga extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ck f55022a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ck f55023b;

    /* renamed from: c, reason: collision with root package name */
    @Bindable
    public bf.c f55024c;

    public ga(Object _bindingComponent, View _root, int _localFieldCount, ck reminderSystem, ck reminderWechart) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55022a = reminderSystem;
        this.f55023b = reminderWechart;
    }

    public static ga b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ga c(@NonNull View view, @Nullable Object component) {
        return (ga) ViewDataBinding.bind(component, view, R.layout.fragment_reminder_setting);
    }

    @NonNull
    public static ga e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ga g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ga h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ga) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_reminder_setting, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ga i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ga) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_reminder_setting, null, false, component);
    }

    @Nullable
    public bf.c d() {
        return this.f55024c;
    }

    public abstract void j(@Nullable bf.c viewmodel);
}
