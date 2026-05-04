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
import com.baicizhan.main.customview.CountDownButton;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class n0 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final EmailAutoCompleteEditText f55960a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f55961b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final a f55962c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final EditText f55963d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f55964e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f55965f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55966g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final CountDownButton f55967h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final EditText f55968i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f55969j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f55970k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f55971l;

    public n0(Object _bindingComponent, View _root, int _localFieldCount, EmailAutoCompleteEditText account, ImageView accountClear, a actionBar, EditText authCode, ImageView authCodeClear, Button confirm, RelativeLayout forgetPasswordContent, CountDownButton getAuthCode, EditText newPassword, ImageView passwordClear, ImageView see, TextView title) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55960a = account;
        this.f55961b = accountClear;
        this.f55962c = actionBar;
        this.f55963d = authCode;
        this.f55964e = authCodeClear;
        this.f55965f = confirm;
        this.f55966g = forgetPasswordContent;
        this.f55967h = getAuthCode;
        this.f55968i = newPassword;
        this.f55969j = passwordClear;
        this.f55970k = see;
        this.f55971l = title;
    }

    public static n0 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static n0 c(@NonNull View view, @Nullable Object component) {
        return (n0) ViewDataBinding.bind(component, view, R.layout.activity_forget_password_page);
    }

    @NonNull
    public static n0 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static n0 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static n0 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (n0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_forget_password_page, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static n0 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (n0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_forget_password_page, null, false, component);
    }
}
