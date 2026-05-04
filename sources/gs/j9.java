package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.tabs.TabLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class j9 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55446a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55447b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55448c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55449d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f55450e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55451f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f55452g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55453h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55454i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ProgressBar f55455j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55456k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f55457l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55458m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f55459n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f55460o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55461p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55462q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final TabLayout f55463r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f55464s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f55465t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f55466u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55467v;

    /* renamed from: w, reason: collision with root package name */
    @Bindable
    public com.baicizhan.main.wikiv2.lookup.wikiv2.o0 f55468w;

    public j9(Object _bindingComponent, View _root, int _localFieldCount, TextView applicableScopes, LinearLayout bottomButtons, TextView btnReport, TextView btnReportWord, ImageView collect, LinearLayout contentContainer, View customIndicator, FrameLayout errorStateContainer, TextView examInfo, ProgressBar loadingProgress, LinearLayout meaningsContainer, NestedScrollView nestedScrollView, LinearLayout phoneticContainer, TextView phoneticUk, TextView phoneticUs, FrameLayout tabContainer, FrameLayout tabContentContainer, TabLayout tabLayout, LottieAnimationView voiceUk, LottieAnimationView voiceUs, AppCompatTextView word, ConstraintLayout wordInfoContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55446a = applicableScopes;
        this.f55447b = bottomButtons;
        this.f55448c = btnReport;
        this.f55449d = btnReportWord;
        this.f55450e = collect;
        this.f55451f = contentContainer;
        this.f55452g = customIndicator;
        this.f55453h = errorStateContainer;
        this.f55454i = examInfo;
        this.f55455j = loadingProgress;
        this.f55456k = meaningsContainer;
        this.f55457l = nestedScrollView;
        this.f55458m = phoneticContainer;
        this.f55459n = phoneticUk;
        this.f55460o = phoneticUs;
        this.f55461p = tabContainer;
        this.f55462q = tabContentContainer;
        this.f55463r = tabLayout;
        this.f55464s = voiceUk;
        this.f55465t = voiceUs;
        this.f55466u = word;
        this.f55467v = wordInfoContainer;
    }

    public static j9 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static j9 c(@NonNull View view, @Nullable Object component) {
        return (j9) ViewDataBinding.bind(component, view, R.layout.fragment_lookup_wiki_v2);
    }

    @NonNull
    public static j9 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static j9 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static j9 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (j9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_lookup_wiki_v2, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static j9 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (j9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_lookup_wiki_v2, null, false, component);
    }

    @Nullable
    public com.baicizhan.main.wikiv2.lookup.wikiv2.o0 d() {
        return this.f55468w;
    }

    public abstract void j(@Nullable com.baicizhan.main.wikiv2.lookup.wikiv2.o0 viewmodel);
}
