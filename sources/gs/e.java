package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.baicizhan.main.customview.CountDownButton;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class e extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final EmailAutoCompleteEditText f54665a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Barrier f54666b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f54667c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final a f54668d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54669e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54670f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54671g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f54672h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f54673i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54674j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final CountDownButton f54675k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final Guideline f54676l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final EditText f54677m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final ImageView f54678n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final ImageView f54679o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final ImageView f54680p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final Barrier f54681q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final EditText f54682r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final Barrier f54683s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final Barrier f54684t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final TextView f54685u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final Button f54686v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    public final ImageView f54687w;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public final View f54688x;

    /* renamed from: y, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54689y;

    /* renamed from: z, reason: collision with root package name */
    @NonNull
    public final Guideline f54690z;

    public e(Object _bindingComponent, View _root, int _localFieldCount, EmailAutoCompleteEditText account, Barrier accountBarrier, ImageView accountClear, a actionBar, TextView agreement, ConstraintLayout container, TextView desc, View dividerNewPwd, TextView forgetPassword, FrameLayout mailBtn, CountDownButton noproguardAuthCode, Guideline noproguardClearGuideline, EditText noproguardNewPassword, ImageView noproguardNewPasswordClear, ImageView noproguardPwdSee, ImageView noproguardSee, Barrier noproguardVerifyBarrier, EditText noproguardVerifyCode, Barrier passwordBarrier, Barrier passwordNewBarrier, TextView title, Button verify, ImageView verifyCodeClear, View view, FrameLayout weiboBtn, Guideline weiboMail) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54665a = account;
        this.f54666b = accountBarrier;
        this.f54667c = accountClear;
        this.f54668d = actionBar;
        this.f54669e = agreement;
        this.f54670f = container;
        this.f54671g = desc;
        this.f54672h = dividerNewPwd;
        this.f54673i = forgetPassword;
        this.f54674j = mailBtn;
        this.f54675k = noproguardAuthCode;
        this.f54676l = noproguardClearGuideline;
        this.f54677m = noproguardNewPassword;
        this.f54678n = noproguardNewPasswordClear;
        this.f54679o = noproguardPwdSee;
        this.f54680p = noproguardSee;
        this.f54681q = noproguardVerifyBarrier;
        this.f54682r = noproguardVerifyCode;
        this.f54683s = passwordBarrier;
        this.f54684t = passwordNewBarrier;
        this.f54685u = title;
        this.f54686v = verify;
        this.f54687w = verifyCodeClear;
        this.f54688x = view;
        this.f54689y = weiboBtn;
        this.f54690z = weiboMail;
    }

    public static e b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static e c(@NonNull View view, @Nullable Object component) {
        return (e) ViewDataBinding.bind(component, view, R.layout.activity_account_verification);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static e e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static e g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (e) ViewDataBinding.inflateInternal(inflater, R.layout.activity_account_verification, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static e h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (e) ViewDataBinding.inflateInternal(inflater, R.layout.activity_account_verification, null, false, component);
    }
}
