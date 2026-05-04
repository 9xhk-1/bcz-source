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
public abstract class r6 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56575a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56576b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f56577c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56578d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Guideline f56579e;

    /* renamed from: f, reason: collision with root package name */
    @Bindable
    public md.k f56580f;

    public r6(Object _bindingComponent, View _root, int _localFieldCount, TextView repairFinish, TextView repairMore, ImageView repairResultImg, TextView repairResultText, Guideline topGuide) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56575a = repairFinish;
        this.f56576b = repairMore;
        this.f56577c = repairResultImg;
        this.f56578d = repairResultText;
        this.f56579e = topGuide;
    }

    public static r6 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static r6 c(@NonNull View view, @Nullable Object component) {
        return (r6) ViewDataBinding.bind(component, view, R.layout.dialog_repair_daka_result);
    }

    @NonNull
    public static r6 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static r6 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static r6 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (r6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_repair_daka_result, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static r6 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (r6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_repair_daka_result, null, false, component);
    }

    @Nullable
    public md.k d() {
        return this.f56580f;
    }

    public abstract void j(@Nullable md.k resultViewModel);
}
