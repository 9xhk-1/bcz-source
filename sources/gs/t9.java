package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class t9 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f56858a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56859b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f56860c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f56861d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f56862e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56863f;

    public t9(Object _bindingComponent, View _root, int _localFieldCount, ImageView close, ConstraintLayout contentView, View mask, ImageView redPacketBg, ImageView redPacketButton, TextView redPacketContent) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56858a = close;
        this.f56859b = contentView;
        this.f56860c = mask;
        this.f56861d = redPacketBg;
        this.f56862e = redPacketButton;
        this.f56863f = redPacketContent;
    }

    public static t9 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static t9 c(@NonNull View view, @Nullable Object component) {
        return (t9) ViewDataBinding.bind(component, view, R.layout.fragment_new_year_coin);
    }

    @NonNull
    public static t9 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static t9 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static t9 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (t9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_new_year_coin, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static t9 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (t9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_new_year_coin, null, false, component);
    }
}
