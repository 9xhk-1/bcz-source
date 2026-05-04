package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class lo extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55804a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55805b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55806c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55807d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55808e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55809f;

    /* renamed from: g, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f55810g;

    public lo(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout item, TextView s100, TextView s125, TextView s150, TextView s502, TextView s75) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55804a = item;
        this.f55805b = s100;
        this.f55806c = s125;
        this.f55807d = s150;
        this.f55808e = s502;
        this.f55809f = s75;
    }

    public static lo b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static lo c(@NonNull View view, @Nullable Object component) {
        return (lo) ViewDataBinding.bind(component, view, R.layout.walk_listen_speed_window);
    }

    @NonNull
    public static lo e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static lo g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static lo h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (lo) ViewDataBinding.inflateInternal(inflater, R.layout.walk_listen_speed_window, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static lo i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (lo) ViewDataBinding.inflateInternal(inflater, R.layout.walk_listen_speed_window, null, false, component);
    }

    @Nullable
    public View.OnClickListener d() {
        return this.f55810g;
    }

    public abstract void j(@Nullable View.OnClickListener itemClick);
}
