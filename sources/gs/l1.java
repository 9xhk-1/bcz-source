package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class l1 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f55672a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55673b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55674c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55675d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55676e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Guideline f55677f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Guideline f55678g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55679h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55680i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f55681j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f55682k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f55683l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f55684m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final Barrier f55685n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final ImageView f55686o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final Barrier f55687p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f55688q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55689r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final Guideline f55690s;

    /* renamed from: t, reason: collision with root package name */
    @Bindable
    public tf.a0 f55691t;

    public l1(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, TextView agreement, LinearLayout agreementLayout, TextView carrierServiceDesc, ConstraintLayout contentContainer, Guideline guideLineLeft, Guideline guideLineRight, FrameLayout mailBtn, TextView noproguardDesc, TextView noproguardSecurePhone, TextView noproguardTip, TextView noproguardTitle, TextView otherWay, Barrier phoneTipBarrier, ImageView protocolCheck, Barrier serviceBarrier, TextView verify, FrameLayout weiboBtn, Guideline weiboMail) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55672a = actionBar;
        this.f55673b = agreement;
        this.f55674c = agreementLayout;
        this.f55675d = carrierServiceDesc;
        this.f55676e = contentContainer;
        this.f55677f = guideLineLeft;
        this.f55678g = guideLineRight;
        this.f55679h = mailBtn;
        this.f55680i = noproguardDesc;
        this.f55681j = noproguardSecurePhone;
        this.f55682k = noproguardTip;
        this.f55683l = noproguardTitle;
        this.f55684m = otherWay;
        this.f55685n = phoneTipBarrier;
        this.f55686o = protocolCheck;
        this.f55687p = serviceBarrier;
        this.f55688q = verify;
        this.f55689r = weiboBtn;
        this.f55690s = weiboMail;
    }

    public static l1 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static l1 c(@NonNull View view, @Nullable Object component) {
        return (l1) ViewDataBinding.bind(component, view, R.layout.activity_onekey_login);
    }

    @NonNull
    public static l1 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static l1 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static l1 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (l1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_onekey_login, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static l1 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (l1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_onekey_login, null, false, component);
    }

    @Nullable
    public tf.a0 d() {
        return this.f55691t;
    }

    public abstract void j(@Nullable tf.a0 oneKeyModel);
}
