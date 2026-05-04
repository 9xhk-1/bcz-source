package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class qm extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56529a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56530b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56531c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f56532d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56533e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f56534f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f56535g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56536h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f56537i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56538j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final View f56539k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56540l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f56541m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f56542n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f56543o;

    public qm(Object _bindingComponent, View _root, int _localFieldCount, TextView bookName, TextView dayBottomTitle, TextView days, View divider, TextView hintBottom, ImageView iconDays, ImageView iconWords, FrameLayout loading, TextView loadingHint, ProgressBar loadingProgress, View middle, FrameLayout showOffButton, TextView title, TextView wordBottomTitle, TextView words) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56529a = bookName;
        this.f56530b = dayBottomTitle;
        this.f56531c = days;
        this.f56532d = divider;
        this.f56533e = hintBottom;
        this.f56534f = iconDays;
        this.f56535g = iconWords;
        this.f56536h = loading;
        this.f56537i = loadingHint;
        this.f56538j = loadingProgress;
        this.f56539k = middle;
        this.f56540l = showOffButton;
        this.f56541m = title;
        this.f56542n = wordBottomTitle;
        this.f56543o = words;
    }

    public static qm b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static qm c(@NonNull View view, @Nullable Object component) {
        return (qm) ViewDataBinding.bind(component, view, R.layout.showoff_drag_view_card);
    }

    @NonNull
    public static qm d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static qm e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static qm g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (qm) ViewDataBinding.inflateInternal(inflater, R.layout.showoff_drag_view_card, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static qm h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (qm) ViewDataBinding.inflateInternal(inflater, R.layout.showoff_drag_view_card, null, false, component);
    }
}
