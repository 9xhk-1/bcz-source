package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class q extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f56420a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final BottomSheetLayout f56421b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56422c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56423d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56424e;

    public q(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, BottomSheetLayout bottomsheet, FrameLayout fragmentContainer, FrameLayout root, FrameLayout videoContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56420a = actionBar;
        this.f56421b = bottomsheet;
        this.f56422c = fragmentContainer;
        this.f56423d = root;
        this.f56424e = videoContainer;
    }

    public static q b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static q c(@NonNull View view, @Nullable Object component) {
        return (q) ViewDataBinding.bind(component, view, R.layout.activity_bcz_web_landscape);
    }

    @NonNull
    public static q d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static q e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static q g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (q) ViewDataBinding.inflateInternal(inflater, R.layout.activity_bcz_web_landscape, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static q h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (q) ViewDataBinding.inflateInternal(inflater, R.layout.activity_bcz_web_landscape, null, false, component);
    }
}
