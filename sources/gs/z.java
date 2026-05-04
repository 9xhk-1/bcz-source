package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class z extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f57681a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57682b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57683c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57684d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57685e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57686f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57687g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f57688h;

    public z(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, TextView tvCopy, TextView tvPayConsumed, TextView tvPayNoConsumed, TextView tvResult, TextView tvResultContent, TextView tvService, TextView tvServiceContent) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57681a = actionBar;
        this.f57682b = tvCopy;
        this.f57683c = tvPayConsumed;
        this.f57684d = tvPayNoConsumed;
        this.f57685e = tvResult;
        this.f57686f = tvResultContent;
        this.f57687g = tvService;
        this.f57688h = tvServiceContent;
    }

    public static z b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static z c(@NonNull View view, @Nullable Object component) {
        return (z) ViewDataBinding.bind(component, view, R.layout.activity_debug_hw_pay);
    }

    @NonNull
    public static z d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static z e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static z g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (z) ViewDataBinding.inflateInternal(inflater, R.layout.activity_debug_hw_pay, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static z h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (z) ViewDataBinding.inflateInternal(inflater, R.layout.activity_debug_hw_pay, null, false, component);
    }
}
