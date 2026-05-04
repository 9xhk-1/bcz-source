package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class k extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f55554a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewPager f55555b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TabLayout f55556c;

    public k(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, ViewPager pager, TabLayout tablayout) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55554a = actionBar;
        this.f55555b = pager;
        this.f55556c = tablayout;
    }

    public static k b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static k c(@NonNull View view, @Nullable Object component) {
        return (k) ViewDataBinding.bind(component, view, R.layout.activity_audio_center);
    }

    @NonNull
    public static k d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static k e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static k g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (k) ViewDataBinding.inflateInternal(inflater, R.layout.activity_audio_center, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static k h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (k) ViewDataBinding.inflateInternal(inflater, R.layout.activity_audio_center, null, false, component);
    }
}
