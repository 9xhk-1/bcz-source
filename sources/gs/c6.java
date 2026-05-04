package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class c6 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54397a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ProgressBar f54398b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54399c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54400d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54401e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f54402f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Group f54403g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Group f54404h;

    /* renamed from: i, reason: collision with root package name */
    @Bindable
    public ObservableInt f54405i;

    /* renamed from: j, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f54406j;

    public c6(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout constrainLayoutDakaLoading, ProgressBar dakaProgress, TextView dakaRetry, TextView dakaTip, TextView errorTitle1, TextView errorTitle2, Group visibleGroupError, Group visibleGroupLoading) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54397a = constrainLayoutDakaLoading;
        this.f54398b = dakaProgress;
        this.f54399c = dakaRetry;
        this.f54400d = dakaTip;
        this.f54401e = errorTitle1;
        this.f54402f = errorTitle2;
        this.f54403g = visibleGroupError;
        this.f54404h = visibleGroupLoading;
    }

    public static c6 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static c6 c(@NonNull View view, @Nullable Object component) {
        return (c6) ViewDataBinding.bind(component, view, R.layout.daka_loading_layout);
    }

    @NonNull
    public static c6 g(@NonNull LayoutInflater inflater) {
        return j(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static c6 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return i(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static c6 i(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (c6) ViewDataBinding.inflateInternal(inflater, R.layout.daka_loading_layout, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static c6 j(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (c6) ViewDataBinding.inflateInternal(inflater, R.layout.daka_loading_layout, null, false, component);
    }

    @Nullable
    public View.OnClickListener d() {
        return this.f54406j;
    }

    @Nullable
    public ObservableInt e() {
        return this.f54405i;
    }

    public abstract void k(@Nullable View.OnClickListener retry);

    public abstract void l(@Nullable ObservableInt status);
}
