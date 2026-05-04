package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class p6 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56304a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56305b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56306c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56307d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f56308e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56309f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f56310g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f56311h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f56312i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f56313j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f56314k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final Guideline f56315l;

    /* renamed from: m, reason: collision with root package name */
    @Bindable
    public md.q f56316m;

    public p6(Object _bindingComponent, View _root, int _localFieldCount, TextView desc, ImageView expandCollapse, TextView repairCancel, TextView repairConfirm, ImageView repairCooperImage, TextView repairCopperNum, View repairGrayLine, ImageView repairImage, TextView repairNum, TextView repairTitle, TextView repairUserCooperNum, Guideline topGuide) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56304a = desc;
        this.f56305b = expandCollapse;
        this.f56306c = repairCancel;
        this.f56307d = repairConfirm;
        this.f56308e = repairCooperImage;
        this.f56309f = repairCopperNum;
        this.f56310g = repairGrayLine;
        this.f56311h = repairImage;
        this.f56312i = repairNum;
        this.f56313j = repairTitle;
        this.f56314k = repairUserCooperNum;
        this.f56315l = topGuide;
    }

    public static p6 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static p6 c(@NonNull View view, @Nullable Object component) {
        return (p6) ViewDataBinding.bind(component, view, R.layout.dialog_repair_daka);
    }

    @NonNull
    public static p6 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static p6 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static p6 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (p6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_repair_daka, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static p6 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (p6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_repair_daka, null, false, component);
    }

    @Nullable
    public md.q d() {
        return this.f56316m;
    }

    public abstract void j(@Nullable md.q repairModel);
}
