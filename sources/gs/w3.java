package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class w3 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f57264a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f57265b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57266c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57267d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f57268e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57269f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f57270g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f57271h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f57272i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f57273j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final View f57274k;

    public w3(Object _bindingComponent, View _root, int _localFieldCount, TextView bad, ImageView closed, TextView easy, TextView hard, ImageView icon, TextView notReady, View optionBg, TextView other, TextView subtitle, TextView title, View titleBg) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57264a = bad;
        this.f57265b = closed;
        this.f57266c = easy;
        this.f57267d = hard;
        this.f57268e = icon;
        this.f57269f = notReady;
        this.f57270g = optionBg;
        this.f57271h = other;
        this.f57272i = subtitle;
        this.f57273j = title;
        this.f57274k = titleBg;
    }

    public static w3 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static w3 c(@NonNull View view, @Nullable Object component) {
        return (w3) ViewDataBinding.bind(component, view, R.layout.ai_class_quit_reason_dialog);
    }

    @NonNull
    public static w3 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static w3 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static w3 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (w3) ViewDataBinding.inflateInternal(inflater, R.layout.ai_class_quit_reason_dialog, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static w3 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (w3) ViewDataBinding.inflateInternal(inflater, R.layout.ai_class_quit_reason_dialog, null, false, component);
    }
}
