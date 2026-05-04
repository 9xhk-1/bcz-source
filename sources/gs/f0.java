package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.aigestudio.wheelpicker.WheelPicker;
import com.jiongji.andriod.card.R;
import com.kyleduo.switchbutton.SwitchButton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class f0 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f54844a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final WheelPicker f54845b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54846c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final WheelPicker f54847d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final WheelPicker f54848e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54849f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54850g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final SwitchButton f54851h;

    /* renamed from: i, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f54852i;

    public f0(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, WheelPicker noticeAm, LinearLayout noticeDatePicker, WheelPicker noticeHour, WheelPicker noticeMinute, RelativeLayout pickDateBtn, TextView selectTime, SwitchButton switcher) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54844a = actionBar;
        this.f54845b = noticeAm;
        this.f54846c = noticeDatePicker;
        this.f54847d = noticeHour;
        this.f54848e = noticeMinute;
        this.f54849f = pickDateBtn;
        this.f54850g = selectTime;
        this.f54851h = switcher;
    }

    public static f0 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static f0 c(@NonNull View view, @Nullable Object component) {
        return (f0) ViewDataBinding.bind(component, view, R.layout.activity_everyday_notice_setting);
    }

    @NonNull
    public static f0 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static f0 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static f0 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (f0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_everyday_notice_setting, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static f0 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (f0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_everyday_notice_setting, null, false, component);
    }

    @Nullable
    public View.OnClickListener d() {
        return this.f54852i;
    }

    public abstract void j(@Nullable View.OnClickListener backListener);
}
