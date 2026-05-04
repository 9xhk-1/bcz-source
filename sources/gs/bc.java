package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class bc extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f54280a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54281b;

    public bc(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, FrameLayout fragmentContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54280a = actionBar;
        this.f54281b = fragmentContainer;
    }

    public static bc b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static bc c(@NonNull View view, @Nullable Object component) {
        return (bc) ViewDataBinding.bind(component, view, R.layout.friend_activity_unified_fragment);
    }

    @NonNull
    public static bc d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static bc e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static bc g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (bc) ViewDataBinding.inflateInternal(inflater, R.layout.friend_activity_unified_fragment, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static bc h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (bc) ViewDataBinding.inflateInternal(inflater, R.layout.friend_activity_unified_fragment, null, false, component);
    }
}
