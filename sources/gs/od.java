package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class od extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f56214a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56215b;

    public od(Object _bindingComponent, View _root, int _localFieldCount, ImageView closed, ImageView image) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56214a = closed;
        this.f56215b = image;
    }

    public static od b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static od c(@NonNull View view, @Nullable Object component) {
        return (od) ViewDataBinding.bind(component, view, R.layout.image_daka_user_hint_dialog);
    }

    @NonNull
    public static od d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static od e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static od g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (od) ViewDataBinding.inflateInternal(inflater, R.layout.image_daka_user_hint_dialog, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static od h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (od) ViewDataBinding.inflateInternal(inflater, R.layout.image_daka_user_hint_dialog, null, false, component);
    }
}
