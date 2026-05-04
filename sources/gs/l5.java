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
public abstract class l5 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f55713a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f55714b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f55715c;

    public l5(Object _bindingComponent, View _root, int _localFieldCount, ImageView closed, ImageView closed2, ImageView image) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55713a = closed;
        this.f55714b = closed2;
        this.f55715c = image;
    }

    public static l5 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static l5 c(@NonNull View view, @Nullable Object component) {
        return (l5) ViewDataBinding.bind(component, view, R.layout.celebrate_dialog);
    }

    @NonNull
    public static l5 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static l5 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static l5 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (l5) ViewDataBinding.inflateInternal(inflater, R.layout.celebrate_dialog, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static l5 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (l5) ViewDataBinding.inflateInternal(inflater, R.layout.celebrate_dialog, null, false, component);
    }
}
