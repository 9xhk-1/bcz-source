package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.baicizhan.main.wordlistv2.view.WordListTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class d3 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54558a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f54559b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f54560c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f54561d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54562e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final a f54563f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f54564g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54565h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f54566i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f54567j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f54568k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f54569l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f54570m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f54571n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f54572o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f54573p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f54574q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final WordListTabLayout f54575r;

    /* renamed from: s, reason: collision with root package name */
    @Bindable
    public com.baicizhan.main.wordlistv2.w0 f54576s;

    public d3(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout clBottomEdit, CoordinatorLayout coContent, ImageView ivNoNet, ImageView ivTip, ConstraintLayout rlTopEdit, a titleBar, AppBarLayout topAppBar, TextView tvCancelEdit, TextView tvEditAction, TextView tvHideShow, TextView tvNoNet, TextView tvOption, TextView tvRetry, TextView tvSelect, TextView tvSelectCount, TextView tvWordCount, ViewPager2 vpList, WordListTabLayout wordTab) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54558a = clBottomEdit;
        this.f54559b = coContent;
        this.f54560c = ivNoNet;
        this.f54561d = ivTip;
        this.f54562e = rlTopEdit;
        this.f54563f = titleBar;
        this.f54564g = topAppBar;
        this.f54565h = tvCancelEdit;
        this.f54566i = tvEditAction;
        this.f54567j = tvHideShow;
        this.f54568k = tvNoNet;
        this.f54569l = tvOption;
        this.f54570m = tvRetry;
        this.f54571n = tvSelect;
        this.f54572o = tvSelectCount;
        this.f54573p = tvWordCount;
        this.f54574q = vpList;
        this.f54575r = wordTab;
    }

    public static d3 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static d3 c(@NonNull View view, @Nullable Object component) {
        return (d3) ViewDataBinding.bind(component, view, R.layout.activity_word_list_v2);
    }

    @NonNull
    public static d3 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static d3 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static d3 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (d3) ViewDataBinding.inflateInternal(inflater, R.layout.activity_word_list_v2, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static d3 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (d3) ViewDataBinding.inflateInternal(inflater, R.layout.activity_word_list_v2, null, false, component);
    }

    @Nullable
    public com.baicizhan.main.wordlistv2.w0 d() {
        return this.f54576s;
    }

    public abstract void j(@Nullable com.baicizhan.main.wordlistv2.w0 vm2);
}
