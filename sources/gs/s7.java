package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.widget.RedDotImageView;
import com.google.android.material.appbar.AppBarLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class s7 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f56715a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RedDotImageView f56716b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f56717c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56718d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56719e;

    public s7(Object _bindingComponent, View _root, int _localFieldCount, AppBarLayout appBar, RedDotImageView buttonRight, NestedScrollView container, FrameLayout topBarContainer, TextView topTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56715a = appBar;
        this.f56716b = buttonRight;
        this.f56717c = container;
        this.f56718d = topBarContainer;
        this.f56719e = topTitle;
    }

    public static s7 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static s7 c(@NonNull View view, @Nullable Object component) {
        return (s7) ViewDataBinding.bind(component, view, R.layout.fragment_base_main);
    }

    @NonNull
    public static s7 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static s7 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static s7 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (s7) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_base_main, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static s7 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (s7) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_base_main, null, false, component);
    }
}
