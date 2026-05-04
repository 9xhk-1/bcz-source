package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class g1 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final BottomSheetLayout f54975a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AHBottomNavigation f54976b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54977c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54978d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f54979e;

    public g1(Object _bindingComponent, View _root, int _localFieldCount, BottomSheetLayout bottom, AHBottomNavigation bottomNavigation, FrameLayout container, FrameLayout placeholder, ViewPager2 viewPager) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54975a = bottom;
        this.f54976b = bottomNavigation;
        this.f54977c = container;
        this.f54978d = placeholder;
        this.f54979e = viewPager;
    }

    public static g1 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static g1 c(@NonNull View view, @Nullable Object component) {
        return (g1) ViewDataBinding.bind(component, view, R.layout.activity_main_tab);
    }

    @NonNull
    public static g1 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static g1 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static g1 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (g1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_main_tab, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static g1 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (g1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_main_tab, null, false, component);
    }
}
