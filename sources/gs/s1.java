package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class s1 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56692a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56693b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56694c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56695d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56696e;

    /* renamed from: f, reason: collision with root package name */
    @Bindable
    public td.g f56697f;

    public s1(Object _bindingComponent, View _root, int _localFieldCount, TextView album, TextView cancel, LinearLayout container, FrameLayout containerBg, TextView takePhoto) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56692a = album;
        this.f56693b = cancel;
        this.f56694c = container;
        this.f56695d = containerBg;
        this.f56696e = takePhoto;
    }

    public static s1 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static s1 c(@NonNull View view, @Nullable Object component) {
        return (s1) ViewDataBinding.bind(component, view, R.layout.activity_pick_photo_dialog);
    }

    @NonNull
    public static s1 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static s1 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static s1 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (s1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_pick_photo_dialog, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static s1 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (s1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_pick_photo_dialog, null, false, component);
    }

    @Nullable
    public td.g d() {
        return this.f56697f;
    }

    public abstract void j(@Nullable td.g viewmodel);
}
