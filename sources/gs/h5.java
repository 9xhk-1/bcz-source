package gs;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import cn.hugo.android.scanner.view.ViewfinderView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class h5 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f55138a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final SurfaceView f55139b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ViewfinderView f55140c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55141d;

    public h5(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, SurfaceView capturePreviewView, ViewfinderView captureViewfinderView, ConstraintLayout root) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55138a = actionBar;
        this.f55139b = capturePreviewView;
        this.f55140c = captureViewfinderView;
        this.f55141d = root;
    }

    public static h5 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static h5 c(@NonNull View view, @Nullable Object component) {
        return (h5) ViewDataBinding.bind(component, view, R.layout.capture);
    }

    @NonNull
    public static h5 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static h5 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static h5 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (h5) ViewDataBinding.inflateInternal(inflater, R.layout.capture, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static h5 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (h5) ViewDataBinding.inflateInternal(inflater, R.layout.capture, null, false, component);
    }
}
