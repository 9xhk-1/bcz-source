package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class t extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f56798a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56799b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final BottomSheetLayout f56800c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56801d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final RecyclerView f56802e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Guideline f56803f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56804g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f56805h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f56806i;

    /* renamed from: j, reason: collision with root package name */
    @Bindable
    public ld.g f56807j;

    /* renamed from: k, reason: collision with root package name */
    @Bindable
    public boolean f56808k;

    public t(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, ConstraintLayout activityMain, BottomSheetLayout bottomsheet, TextView itemDataTitle, RecyclerView learningRecordList, Guideline loadingGuideline, ProgressBar wordListProgress, TextView wordListRetry, TextView wordListTips) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56798a = actionBar;
        this.f56799b = activityMain;
        this.f56800c = bottomsheet;
        this.f56801d = itemDataTitle;
        this.f56802e = learningRecordList;
        this.f56803f = loadingGuideline;
        this.f56804g = wordListProgress;
        this.f56805h = wordListRetry;
        this.f56806i = wordListTips;
    }

    public static t b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static t c(@NonNull View view, @Nullable Object component) {
        return (t) ViewDataBinding.bind(component, view, R.layout.activity_daka_calendar);
    }

    @NonNull
    public static t g(@NonNull LayoutInflater inflater) {
        return j(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static t h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return i(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static t i(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (t) ViewDataBinding.inflateInternal(inflater, R.layout.activity_daka_calendar, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static t j(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (t) ViewDataBinding.inflateInternal(inflater, R.layout.activity_daka_calendar, null, false, component);
    }

    public boolean d() {
        return this.f56808k;
    }

    @Nullable
    public ld.g e() {
        return this.f56807j;
    }

    public abstract void k(boolean dark);

    public abstract void l(@Nullable ld.g viewmodel);
}
