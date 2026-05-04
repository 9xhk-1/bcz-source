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
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class r0 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final BottomSheetLayout f56553a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56554b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56555c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56556d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56557e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56558f;

    public r0(Object _bindingComponent, View _root, int _localFieldCount, BottomSheetLayout bottomsheet, ImageView close, FrameLayout directContainer, FrameLayout fragmentContainer, FrameLayout root, FrameLayout videoContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56553a = bottomsheet;
        this.f56554b = close;
        this.f56555c = directContainer;
        this.f56556d = fragmentContainer;
        this.f56557e = root;
        this.f56558f = videoContainer;
    }

    public static r0 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static r0 c(@NonNull View view, @Nullable Object component) {
        return (r0) ViewDataBinding.bind(component, view, R.layout.activity_fullscreen_bcz_web);
    }

    @NonNull
    public static r0 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static r0 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static r0 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (r0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_fullscreen_bcz_web, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static r0 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (r0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_fullscreen_bcz_web, null, false, component);
    }
}
