package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ya extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f57573a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f57574b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57575c;

    /* renamed from: d, reason: collision with root package name */
    @Bindable
    public com.baicizhan.main.activity.schedule_v2.switchschedule.f0 f57576d;

    public ya(Object _bindingComponent, View _root, int _localFieldCount, TextView addSchedule, View addScheduleBg, RecyclerView scheduleList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57573a = addSchedule;
        this.f57574b = addScheduleBg;
        this.f57575c = scheduleList;
    }

    public static ya b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ya c(@NonNull View view, @Nullable Object component) {
        return (ya) ViewDataBinding.bind(component, view, R.layout.fragment_switch_schedule);
    }

    @NonNull
    public static ya e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ya g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ya h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ya) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_switch_schedule, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ya i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ya) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_switch_schedule, null, false, component);
    }

    @Nullable
    public com.baicizhan.main.activity.schedule_v2.switchschedule.f0 d() {
        return this.f57576d;
    }

    public abstract void j(@Nullable com.baicizhan.main.activity.schedule_v2.switchschedule.f0 viewmodel);
}
