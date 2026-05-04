package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public abstract class l3 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f55694a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55695b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55696c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProgressBar f55697d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f55698e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ProgressBar f55699f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f55700g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f55701h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55702i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f55703j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f55704k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f55705l;

    public l3(Object _bindingComponent, View _root, int _localFieldCount, ImageView bookBg, TextView bookFinishTips, TextView bookName, ProgressBar planProgressBar, View planProgressBarLearnedDot, ProgressBar planProgressBarMasted, View planProgressBarMastedDot, TextView reset, TextView reviewRound, TextView wpPlanLearnedDesc, TextView wpPlanMasterDesc, TextView wpPlanProgressValue) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55694a = bookBg;
        this.f55695b = bookFinishTips;
        this.f55696c = bookName;
        this.f55697d = planProgressBar;
        this.f55698e = planProgressBarLearnedDot;
        this.f55699f = planProgressBarMasted;
        this.f55700g = planProgressBarMastedDot;
        this.f55701h = reset;
        this.f55702i = reviewRound;
        this.f55703j = wpPlanLearnedDesc;
        this.f55704k = wpPlanMasterDesc;
        this.f55705l = wpPlanProgressValue;
    }

    public static l3 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static l3 c(@NonNull View view, @Nullable Object component) {
        return (l3) ViewDataBinding.bind(component, view, R.layout.adjust_schedule_adjust);
    }

    @NonNull
    public static l3 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static l3 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static l3 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (l3) ViewDataBinding.inflateInternal(inflater, R.layout.adjust_schedule_adjust, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static l3 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (l3) ViewDataBinding.inflateInternal(inflater, R.layout.adjust_schedule_adjust, null, false, component);
    }
}
