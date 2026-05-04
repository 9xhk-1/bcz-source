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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.widget.RoundedButton;
import com.baicizhan.main.customview.OfflineDownloadView;
import com.baicizhan.main.customview.WordListNavigation;
import com.baicizhan.main.view.AspectRoundImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class j3 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f55406a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f55407b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f55408c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f55409d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final AspectRoundImageView f55410e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55411f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final OfflineDownloadView f55412g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55413h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55414i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f55415j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f55416k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final RoundedButton f55417l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final WordListNavigation f55418m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55419n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final RoundedButton f55420o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f55421p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55422q;

    public j3(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, View bgBottomArea, ImageView bgCover, View bgCoverFront, AspectRoundImageView bookCover, TextView bookDesc, OfflineDownloadView bookDownload, ConstraintLayout bookInfoArea, TextView bookLink, TextView bookSummary, TextView collectWordReview, RoundedButton edit, WordListNavigation navigator, FrameLayout placeholder, RoundedButton sort, TextView wordCountHeader, RelativeLayout wordlistEditBar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55406a = actionBar;
        this.f55407b = bgBottomArea;
        this.f55408c = bgCover;
        this.f55409d = bgCoverFront;
        this.f55410e = bookCover;
        this.f55411f = bookDesc;
        this.f55412g = bookDownload;
        this.f55413h = bookInfoArea;
        this.f55414i = bookLink;
        this.f55415j = bookSummary;
        this.f55416k = collectWordReview;
        this.f55417l = edit;
        this.f55418m = navigator;
        this.f55419n = placeholder;
        this.f55420o = sort;
        this.f55421p = wordCountHeader;
        this.f55422q = wordlistEditBar;
    }

    public static j3 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static j3 c(@NonNull View view, @Nullable Object component) {
        return (j3) ViewDataBinding.bind(component, view, R.layout.activity_wordlist_without_theme);
    }

    @NonNull
    public static j3 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static j3 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static j3 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (j3) ViewDataBinding.inflateInternal(inflater, R.layout.activity_wordlist_without_theme, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static j3 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (j3) ViewDataBinding.inflateInternal(inflater, R.layout.activity_wordlist_without_theme, null, false, component);
    }
}
