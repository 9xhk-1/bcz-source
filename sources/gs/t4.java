package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class t4 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f56828a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56829b;

    public t4(Object _bindingComponent, View _root, int _localFieldCount, ImageView image, TextView text) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56828a = image;
        this.f56829b = text;
    }

    public static t4 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static t4 c(@NonNull View view, @Nullable Object component) {
        return (t4) ViewDataBinding.bind(component, view, R.layout.bcz_toast_img);
    }

    @NonNull
    public static t4 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static t4 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static t4 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (t4) ViewDataBinding.inflateInternal(inflater, R.layout.bcz_toast_img, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static t4 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (t4) ViewDataBinding.inflateInternal(inflater, R.layout.bcz_toast_img, null, false, component);
    }
}
