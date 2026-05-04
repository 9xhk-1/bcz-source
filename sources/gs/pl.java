package gs;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.main.customview.OfflineDownloadView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class pl extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56393a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56394b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56395c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56396d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f56397e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56398f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Guideline f56399g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Guideline f56400h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final OfflineDownloadView f56401i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f56402j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final Space f56403k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56404l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f56405m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f56406n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f56407o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f56408p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final View f56409q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextView f56410r;

    /* renamed from: s, reason: collision with root package name */
    @Bindable
    public boolean f56411s;

    /* renamed from: t, reason: collision with root package name */
    @Bindable
    public Typeface f56412t;

    public pl(Object _bindingComponent, View _root, int _localFieldCount, TextView bookAd, TextView bookName, TextView daysLeft, TextView daysLeftTag, View divider, TextView errorTip, Guideline guideline, Guideline guidelineCenter, OfflineDownloadView offlineDownloadView, TextView planAdjust, Space planPadding, ProgressBar progressBar, TextView progressTag, TextView refresh, TextView todayCount, TextView todayCountTag, View topPadding, TextView wordlist) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56393a = bookAd;
        this.f56394b = bookName;
        this.f56395c = daysLeft;
        this.f56396d = daysLeftTag;
        this.f56397e = divider;
        this.f56398f = errorTip;
        this.f56399g = guideline;
        this.f56400h = guidelineCenter;
        this.f56401i = offlineDownloadView;
        this.f56402j = planAdjust;
        this.f56403k = planPadding;
        this.f56404l = progressBar;
        this.f56405m = progressTag;
        this.f56406n = refresh;
        this.f56407o = todayCount;
        this.f56408p = todayCountTag;
        this.f56409q = topPadding;
        this.f56410r = wordlist;
    }

    public static pl b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static pl c(@NonNull View view, @Nullable Object component) {
        return (pl) ViewDataBinding.bind(component, view, R.layout.plan_words_learn);
    }

    @NonNull
    public static pl g(@NonNull LayoutInflater inflater) {
        return j(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static pl h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return i(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static pl i(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (pl) ViewDataBinding.inflateInternal(inflater, R.layout.plan_words_learn, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static pl j(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (pl) ViewDataBinding.inflateInternal(inflater, R.layout.plan_words_learn, null, false, component);
    }

    @Nullable
    public Typeface d() {
        return this.f56412t;
    }

    public boolean e() {
        return this.f56411s;
    }

    public abstract void k(@Nullable Typeface accentFont);

    public abstract void l(boolean showBookUpdate);
}
