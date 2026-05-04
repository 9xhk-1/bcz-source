package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.aigestudio.wheelpicker.WheelPicker;
import com.baicizhan.main.activity.schedule_v2.mutimode.ModelListView;
import com.baicizhan.main.customview.FixBugGroup;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class p7 extends ViewDataBinding {

    @Bindable
    public ta.b A;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56317a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FixBugGroup f56318b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Group f56319c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56320d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f56321e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56322f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final WheelPicker f56323g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f56324h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f56325i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f56326j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f56327k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f56328l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f56329m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f56330n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f56331o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f56332p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f56333q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextView f56334r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final WheelPicker f56335s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final TextView f56336t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56337u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final ModelListView f56338v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    public final Barrier f56339w;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public final Group f56340x;

    /* renamed from: y, reason: collision with root package name */
    @NonNull
    public final Group f56341y;

    /* renamed from: z, reason: collision with root package name */
    @Bindable
    public com.baicizhan.main.activity.schedule_v2.adjustschedule.e f56342z;

    public p7(Object _bindingComponent, View _root, int _localFieldCount, TextView allKillTips, FixBugGroup commom, Group groupExpectedTime, ConstraintLayout mainContent, View noproguardConfirmBg, TextView noproguardConfirmBtn, WheelPicker noproguardDayCountPicker, TextView noproguardDayTitle, View noproguardDivider, View noproguardPickerArea, NestedScrollView noproguardScroll, TextView noproguardTipsEverydayCost, TextView noproguardTipsExpectedTime, TextView noproguardTipsExpectedTimeTitle, TextView noproguardTipsFinishDate, TextView noproguardTipsFinishDateTitle, TextView noproguardTipsSelectBook, TextView noproguardTipsSelectBookInfo, WheelPicker noproguardWordCountPicker, TextView noproguardWordTitle, FrameLayout scheduleContainer, ModelListView taskLayout, Barrier tipsBarrier, Group tipsDateGroup, Group tipsNewTimeGroup) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56317a = allKillTips;
        this.f56318b = commom;
        this.f56319c = groupExpectedTime;
        this.f56320d = mainContent;
        this.f56321e = noproguardConfirmBg;
        this.f56322f = noproguardConfirmBtn;
        this.f56323g = noproguardDayCountPicker;
        this.f56324h = noproguardDayTitle;
        this.f56325i = noproguardDivider;
        this.f56326j = noproguardPickerArea;
        this.f56327k = noproguardScroll;
        this.f56328l = noproguardTipsEverydayCost;
        this.f56329m = noproguardTipsExpectedTime;
        this.f56330n = noproguardTipsExpectedTimeTitle;
        this.f56331o = noproguardTipsFinishDate;
        this.f56332p = noproguardTipsFinishDateTitle;
        this.f56333q = noproguardTipsSelectBook;
        this.f56334r = noproguardTipsSelectBookInfo;
        this.f56335s = noproguardWordCountPicker;
        this.f56336t = noproguardWordTitle;
        this.f56337u = scheduleContainer;
        this.f56338v = taskLayout;
        this.f56339w = tipsBarrier;
        this.f56340x = tipsDateGroup;
        this.f56341y = tipsNewTimeGroup;
    }

    public static p7 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static p7 c(@NonNull View view, @Nullable Object component) {
        return (p7) ViewDataBinding.bind(component, view, R.layout.fragment_adjust_schedule);
    }

    @NonNull
    public static p7 g(@NonNull LayoutInflater inflater) {
        return j(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static p7 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return i(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static p7 i(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (p7) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_adjust_schedule, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static p7 j(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (p7) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_adjust_schedule, null, false, component);
    }

    @Nullable
    public ta.b d() {
        return this.A;
    }

    @Nullable
    public com.baicizhan.main.activity.schedule_v2.adjustschedule.e e() {
        return this.f56342z;
    }

    public abstract void k(@Nullable ta.b loadingVm);

    public abstract void l(@Nullable com.baicizhan.main.activity.schedule_v2.adjustschedule.e model);
}
