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
public abstract class l9 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final n9 f55732a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final n9 f55733b;

    /* renamed from: c, reason: collision with root package name */
    @Bindable
    public ge.d f55734c;

    public l9(Object _bindingComponent, View _root, int _localFieldCount, n9 listener, n9 read) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55732a = listener;
        this.f55733b = read;
    }

    public static l9 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static l9 c(@NonNull View view, @Nullable Object component) {
        return (l9) ViewDataBinding.bind(component, view, R.layout.fragment_my_evaluation);
    }

    @NonNull
    public static l9 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static l9 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static l9 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (l9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_my_evaluation, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static l9 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (l9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_my_evaluation, null, false, component);
    }

    @Nullable
    public ge.d d() {
        return this.f55734c;
    }

    public abstract void j(@Nullable ge.d viewmodel);
}
