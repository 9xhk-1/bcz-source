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
public abstract class a9 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54156a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54157b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f54158c;

    /* renamed from: d, reason: collision with root package name */
    @Bindable
    public td.b f54159d;

    public a9(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout changeBtn, ConstraintLayout imageContainer, ImageView imgBg) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54156a = changeBtn;
        this.f54157b = imageContainer;
        this.f54158c = imgBg;
    }

    public static a9 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static a9 c(@NonNull View view, @Nullable Object component) {
        return (a9) ViewDataBinding.bind(component, view, R.layout.fragment_image_photo_daka);
    }

    @NonNull
    public static a9 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static a9 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static a9 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (a9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_image_photo_daka, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static a9 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (a9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_image_photo_daka, null, false, component);
    }

    @Nullable
    public td.b d() {
        return this.f54159d;
    }

    public abstract void j(@Nullable td.b viewmodel);
}
