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
public abstract class a1 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final BottomSheetLayout f54115a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54116b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54117c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54118d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54119e;

    public a1(Object _bindingComponent, View _root, int _localFieldCount, BottomSheetLayout bottomsheet, ImageView close, FrameLayout fragmentContainer, FrameLayout root, FrameLayout videoContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54115a = bottomsheet;
        this.f54116b = close;
        this.f54117c = fragmentContainer;
        this.f54118d = root;
        this.f54119e = videoContainer;
    }

    public static a1 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static a1 c(@NonNull View view, @Nullable Object component) {
        return (a1) ViewDataBinding.bind(component, view, R.layout.activity_landscape_bcz_web);
    }

    @NonNull
    public static a1 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static a1 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static a1 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (a1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_landscape_bcz_web, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static a1 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (a1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_landscape_bcz_web, null, false, component);
    }
}
