package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class h2 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final BottomSheetLayout f55130a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final om f55131b;

    public h2(Object _bindingComponent, View _root, int _localFieldCount, BottomSheetLayout bottomsheet, om showOffDragView) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55130a = bottomsheet;
        this.f55131b = showOffDragView;
    }

    public static h2 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static h2 c(@NonNull View view, @Nullable Object component) {
        return (h2) ViewDataBinding.bind(component, view, R.layout.activity_showoff);
    }

    @NonNull
    public static h2 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static h2 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static h2 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (h2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_showoff, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static h2 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (h2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_showoff, null, false, component);
    }
}
