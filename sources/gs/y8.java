package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class y8 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57561a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57562b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f57563c;

    /* renamed from: d, reason: collision with root package name */
    @Bindable
    public rd.b f57564d;

    public y8(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout changeBtn, ConstraintLayout imageContainer, ImageView imgBg) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57561a = changeBtn;
        this.f57562b = imageContainer;
        this.f57563c = imgBg;
    }

    public static y8 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static y8 c(@NonNull View view, @Nullable Object component) {
        return (y8) ViewDataBinding.bind(component, view, R.layout.fragment_image_daka);
    }

    @NonNull
    public static y8 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static y8 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static y8 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (y8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_image_daka, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static y8 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (y8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_image_daka, null, false, component);
    }

    @Nullable
    public rd.b d() {
        return this.f57564d;
    }

    public abstract void j(@Nullable rd.b viewmodel);
}
