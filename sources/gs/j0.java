package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.baicizhan.main.customview.PageDotIndicator;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class j0 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f55379a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Guideline f55380b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final x4 f55381c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55382d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f55383e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f55384f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f55385g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f55386h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55387i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final PageDotIndicator f55388j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f55389k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final f7 f55390l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f55391m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f55392n;

    /* renamed from: o, reason: collision with root package name */
    @Bindable
    public qj.n f55393o;

    public j0(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, Guideline bottomGuide, x4 confirmBtn, FrameLayout costBottomContainer, View costBtn, ImageView costBtnIcon, TextView costBtnText, TextView costRemainingBadge, TextView nextTitle, PageDotIndicator pageIndicator, TextView preTitle, f7 retryLayout, TextView selectedTitle, ViewPager2 templatePager) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55379a = actionBar;
        this.f55380b = bottomGuide;
        this.f55381c = confirmBtn;
        this.f55382d = costBottomContainer;
        this.f55383e = costBtn;
        this.f55384f = costBtnIcon;
        this.f55385g = costBtnText;
        this.f55386h = costRemainingBadge;
        this.f55387i = nextTitle;
        this.f55388j = pageIndicator;
        this.f55389k = preTitle;
        this.f55390l = retryLayout;
        this.f55391m = selectedTitle;
        this.f55392n = templatePager;
    }

    public static j0 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static j0 c(@NonNull View view, @Nullable Object component) {
        return (j0) ViewDataBinding.bind(component, view, R.layout.activity_export_template);
    }

    @NonNull
    public static j0 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static j0 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static j0 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (j0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_export_template, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static j0 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (j0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_export_template, null, false, component);
    }

    @Nullable
    public qj.n d() {
        return this.f55393o;
    }

    public abstract void j(@Nullable qj.n model);
}
