package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class m extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final EmailAutoCompleteEditText f55811a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f55812b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final a f55813c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55814d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f55815e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55816f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f55817g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Button f55818h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f55819i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final EditText f55820j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f55821k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f55822l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final ImageView f55823m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f55824n;

    public m(Object _bindingComponent, View _root, int _localFieldCount, EmailAutoCompleteEditText account, ImageView accountClear, a actionBar, RelativeLayout content, View divider, TextView forgetPassword, TextView goRegister, Button login, ImageView loginWeibo, EditText password, ImageView passwordClear, TextView protocol, ImageView see, TextView title) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55811a = account;
        this.f55812b = accountClear;
        this.f55813c = actionBar;
        this.f55814d = content;
        this.f55815e = divider;
        this.f55816f = forgetPassword;
        this.f55817g = goRegister;
        this.f55818h = login;
        this.f55819i = loginWeibo;
        this.f55820j = password;
        this.f55821k = passwordClear;
        this.f55822l = protocol;
        this.f55823m = see;
        this.f55824n = title;
    }

    public static m b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static m c(@NonNull View view, @Nullable Object component) {
        return (m) ViewDataBinding.bind(component, view, R.layout.activity_baicizhan_login);
    }

    @NonNull
    public static m d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static m e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static m g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (m) ViewDataBinding.inflateInternal(inflater, R.layout.activity_baicizhan_login, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static m h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (m) ViewDataBinding.inflateInternal(inflater, R.layout.activity_baicizhan_login, null, false, component);
    }
}
