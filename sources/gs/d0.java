package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class d0 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54521a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54522b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54523c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f54524d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54525e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TabLayout f54526f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54527g;

    public d0(Object _bindingComponent, View _root, int _localFieldCount, RelativeLayout actionBar, ImageView backImg, TextView badgeText, ViewPager2 pager, FrameLayout singleContainer, TabLayout tab, TextView title) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54521a = actionBar;
        this.f54522b = backImg;
        this.f54523c = badgeText;
        this.f54524d = pager;
        this.f54525e = singleContainer;
        this.f54526f = tab;
        this.f54527g = title;
    }

    public static d0 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static d0 c(@NonNull View view, @Nullable Object component) {
        return (d0) ViewDataBinding.bind(component, view, R.layout.activity_edit_schedule);
    }

    @NonNull
    public static d0 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static d0 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static d0 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (d0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_edit_schedule, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static d0 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (d0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_edit_schedule, null, false, component);
    }
}
