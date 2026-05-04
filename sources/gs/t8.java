package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.aigestudio.wheelpicker.WheelPicker;
import com.baicizhan.main.customview.FixBugGroup;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class t8 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56841a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56842b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f56843c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56844d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f56845e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f56846f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f56847g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Group f56848h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f56849i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f56850j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f56851k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final WheelPicker f56852l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f56853m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final WheelPicker f56854n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final FixBugGroup f56855o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56856p;

    /* renamed from: q, reason: collision with root package name */
    @Bindable
    public ta.b f56857q;

    public t8(Object _bindingComponent, View _root, int _localFieldCount, TextView allKillTips, ConstraintLayout mainContent, View noproguardConfirmBg, TextView noproguardConfirmBtn, View noproguardDivider, View noproguardPickerArea, NestedScrollView noproguardScroll, Group noproguardTipsGroup, TextView noproguardTipsOne, TextView noproguardTipsTwo, TextView noproguardWheelLeft, WheelPicker noproguardWheelLeftPicker, TextView noproguardWheelRight, WheelPicker noproguardWheelRightPicker, FixBugGroup pickers, FrameLayout scheduleContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56841a = allKillTips;
        this.f56842b = mainContent;
        this.f56843c = noproguardConfirmBg;
        this.f56844d = noproguardConfirmBtn;
        this.f56845e = noproguardDivider;
        this.f56846f = noproguardPickerArea;
        this.f56847g = noproguardScroll;
        this.f56848h = noproguardTipsGroup;
        this.f56849i = noproguardTipsOne;
        this.f56850j = noproguardTipsTwo;
        this.f56851k = noproguardWheelLeft;
        this.f56852l = noproguardWheelLeftPicker;
        this.f56853m = noproguardWheelRight;
        this.f56854n = noproguardWheelRightPicker;
        this.f56855o = pickers;
        this.f56856p = scheduleContainer;
    }

    public static t8 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static t8 c(@NonNull View view, @Nullable Object component) {
        return (t8) ViewDataBinding.bind(component, view, R.layout.fragment_gaming_plan);
    }

    @NonNull
    public static t8 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static t8 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static t8 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (t8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_gaming_plan, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static t8 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (t8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_gaming_plan, null, false, component);
    }

    @Nullable
    public ta.b d() {
        return this.f56857q;
    }

    public abstract void j(@Nullable ta.b loadingVm);
}
