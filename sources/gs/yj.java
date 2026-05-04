package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.view.RotatingImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class yj extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57616a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57617b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f57618c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57619d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57620e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RotatingImageView f57621f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57622g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f57623h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f57624i;

    public yj(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout content, TextView dakaButton, View dakaDivider, LinearLayout finishButtons, TextView iReadButtonBeta, RotatingImageView loadingIcon, TextView scheduleInstruction, TextView startStudy, TextView wantMoreButton) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57616a = content;
        this.f57617b = dakaButton;
        this.f57618c = dakaDivider;
        this.f57619d = finishButtons;
        this.f57620e = iReadButtonBeta;
        this.f57621f = loadingIcon;
        this.f57622g = scheduleInstruction;
        this.f57623h = startStudy;
        this.f57624i = wantMoreButton;
    }

    public static yj b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static yj c(@NonNull View view, @Nullable Object component) {
        return (yj) ViewDataBinding.bind(component, view, R.layout.maintab_button_area);
    }

    @NonNull
    public static yj d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static yj e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static yj g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (yj) ViewDataBinding.inflateInternal(inflater, R.layout.maintab_button_area, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static yj h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (yj) ViewDataBinding.inflateInternal(inflater, R.layout.maintab_button_area, null, false, component);
    }
}
