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
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.main.customview.CountDownButton;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class o1 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f56150a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final EditText f56151b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f56152c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Button f56153d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56154e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56155f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final CountDownButton f56156g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final EditText f56157h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f56158i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56159j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final EditText f56160k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ImageView f56161l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final ImageView f56162m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f56163n;

    /* renamed from: o, reason: collision with root package name */
    @Bindable
    public boolean f56164o;

    public o1(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, EditText authCode, ImageView authCodeClear, Button bind, RelativeLayout container, TextView description, CountDownButton getAuthCode, EditText password, ImageView passwordClear, RelativeLayout passwordContainer, EditText phone, ImageView phoneClear, ImageView see, TextView title) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56150a = actionBar;
        this.f56151b = authCode;
        this.f56152c = authCodeClear;
        this.f56153d = bind;
        this.f56154e = container;
        this.f56155f = description;
        this.f56156g = getAuthCode;
        this.f56157h = password;
        this.f56158i = passwordClear;
        this.f56159j = passwordContainer;
        this.f56160k = phone;
        this.f56161l = phoneClear;
        this.f56162m = see;
        this.f56163n = title;
    }

    public static o1 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static o1 c(@NonNull View view, @Nullable Object component) {
        return (o1) ViewDataBinding.bind(component, view, R.layout.activity_phone_bind);
    }

    @NonNull
    public static o1 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static o1 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static o1 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (o1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_phone_bind, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static o1 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (o1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_phone_bind, null, false, component);
    }

    public boolean d() {
        return this.f56164o;
    }

    public abstract void j(boolean editmode);
}
