package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class sn extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f56783a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56784b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56785c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56786d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56787e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56788f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f56789g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56790h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f56791i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56792j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final View f56793k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f56794l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f56795m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f56796n;

    public sn(Object _bindingComponent, View _root, int _localFieldCount, View animationBg, ImageView bookBg, TextView bookFinishTips, TextView bookName, ConstraintLayout container, TextView currentLearn, TextView delete, ProgressBar planProgressBar, View planProgressBarLearnedDot, ProgressBar planProgressBarMasted, View planProgressBarMastedDot, TextView wpPlanLearnedDesc, TextView wpPlanMasterDesc, TextView wpPlanProgressValue) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56783a = animationBg;
        this.f56784b = bookBg;
        this.f56785c = bookFinishTips;
        this.f56786d = bookName;
        this.f56787e = container;
        this.f56788f = currentLearn;
        this.f56789g = delete;
        this.f56790h = planProgressBar;
        this.f56791i = planProgressBarLearnedDot;
        this.f56792j = planProgressBarMasted;
        this.f56793k = planProgressBarMastedDot;
        this.f56794l = wpPlanLearnedDesc;
        this.f56795m = wpPlanMasterDesc;
        this.f56796n = wpPlanProgressValue;
    }

    public static sn b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static sn c(@NonNull View view, @Nullable Object component) {
        return (sn) ViewDataBinding.bind(component, view, R.layout.switch_schedule_item);
    }

    @NonNull
    public static sn d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static sn e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static sn g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (sn) ViewDataBinding.inflateInternal(inflater, R.layout.switch_schedule_item, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static sn h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (sn) ViewDataBinding.inflateInternal(inflater, R.layout.switch_schedule_item, null, false, component);
    }
}
