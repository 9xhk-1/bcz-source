package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class f2 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54856a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54857b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f54858c;

    public f2(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout cardView, FrameLayout container, ImageView shareIm) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54856a = cardView;
        this.f54857b = container;
        this.f54858c = shareIm;
    }

    public static f2 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static f2 c(@NonNull View view, @Nullable Object component) {
        return (f2) ViewDataBinding.bind(component, view, R.layout.activity_share_image);
    }

    @NonNull
    public static f2 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static f2 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static f2 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (f2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_share_image, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static f2 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (f2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_share_image, null, false, component);
    }
}
