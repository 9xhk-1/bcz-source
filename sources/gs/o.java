package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class o extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final c f56138a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final BottomSheetLayout f56139b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f56140c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56141d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56142e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56143f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56144g;

    public o(Object _bindingComponent, View _root, int _localFieldCount, c actionBar, BottomSheetLayout bottomsheet, ImageView close, FrameLayout fragmentContainer, LinearLayout fragmentLayout, FrameLayout root, FrameLayout videoContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56138a = actionBar;
        this.f56139b = bottomsheet;
        this.f56140c = close;
        this.f56141d = fragmentContainer;
        this.f56142e = fragmentLayout;
        this.f56143f = root;
        this.f56144g = videoContainer;
    }

    public static o b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static o c(@NonNull View view, @Nullable Object component) {
        return (o) ViewDataBinding.bind(component, view, R.layout.activity_bcz_web);
    }

    @NonNull
    public static o d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static o e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static o g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (o) ViewDataBinding.inflateInternal(inflater, R.layout.activity_bcz_web, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static o h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (o) ViewDataBinding.inflateInternal(inflater, R.layout.activity_bcz_web, null, false, component);
    }
}
