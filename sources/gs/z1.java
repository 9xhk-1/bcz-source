package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
public abstract class z1 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57693a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57694b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57695c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f57696d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57697e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57698f;

    /* renamed from: g, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f57699g;

    /* renamed from: h, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f57700h;

    public z1(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout activityMain, TextView cancelBtn, TextView confirmBtn, ImageView imageWatch, TextView subTitle, TextView titleMain) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57693a = activityMain;
        this.f57694b = cancelBtn;
        this.f57695c = confirmBtn;
        this.f57696d = imageWatch;
        this.f57697e = subTitle;
        this.f57698f = titleMain;
    }

    public static z1 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static z1 c(@NonNull View view, @Nullable Object component) {
        return (z1) ViewDataBinding.bind(component, view, R.layout.activity_scan_login_confirm);
    }

    @NonNull
    public static z1 g(@NonNull LayoutInflater inflater) {
        return j(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static z1 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return i(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static z1 i(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (z1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_scan_login_confirm, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static z1 j(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (z1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_scan_login_confirm, null, false, component);
    }

    @Nullable
    public View.OnClickListener d() {
        return this.f57700h;
    }

    @Nullable
    public View.OnClickListener e() {
        return this.f57699g;
    }

    public abstract void k(@Nullable View.OnClickListener cancel);

    public abstract void l(@Nullable View.OnClickListener confirm);
}
