package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.main.customview.calendar.CalendarView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class jj extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ProgressBar f55515a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55516b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f55517c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55518d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55519e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final CalendarView f55520f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55521g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f55522h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55523i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f55524j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f55525k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55526l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f55527m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final ImageView f55528n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f55529o;

    /* renamed from: p, reason: collision with root package name */
    @Bindable
    public ld.l f55530p;

    public jj(Object _bindingComponent, View _root, int _localFieldCount, ProgressBar calendarProgress, TextView doRepair, View headBg, TextView itemDataTitle, TextView learnWordListTips, CalendarView learningCalendar, FrameLayout learningCalendarContainer, ImageView leftBtn, TextView loadingRetry, TextView loadingTips, TextView monthTitle, RelativeLayout repairDakaLayout, TextView repairDakaTitle, ImageView rightBtn, TextView yearTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55515a = calendarProgress;
        this.f55516b = doRepair;
        this.f55517c = headBg;
        this.f55518d = itemDataTitle;
        this.f55519e = learnWordListTips;
        this.f55520f = learningCalendar;
        this.f55521g = learningCalendarContainer;
        this.f55522h = leftBtn;
        this.f55523i = loadingRetry;
        this.f55524j = loadingTips;
        this.f55525k = monthTitle;
        this.f55526l = repairDakaLayout;
        this.f55527m = repairDakaTitle;
        this.f55528n = rightBtn;
        this.f55529o = yearTitle;
    }

    public static jj b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static jj c(@NonNull View view, @Nullable Object component) {
        return (jj) ViewDataBinding.bind(component, view, R.layout.learning_calendarview_header_item);
    }

    @NonNull
    public static jj e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static jj g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static jj h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (jj) ViewDataBinding.inflateInternal(inflater, R.layout.learning_calendarview_header_item, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static jj i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (jj) ViewDataBinding.inflateInternal(inflater, R.layout.learning_calendarview_header_item, null, false, component);
    }

    @Nullable
    public ld.l d() {
        return this.f55530p;
    }

    public abstract void j(@Nullable ld.l viewmodel);
}
