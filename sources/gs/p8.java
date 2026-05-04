package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class p8 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @Bindable
    public String f56343a;

    /* renamed from: b, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f56344b;

    public p8(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public static p8 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static p8 c(@NonNull View view, @Nullable Object component) {
        return (p8) ViewDataBinding.bind(component, view, R.layout.fragment_edit_school_item_report);
    }

    @NonNull
    public static p8 g(@NonNull LayoutInflater inflater) {
        return j(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static p8 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return i(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static p8 i(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (p8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_edit_school_item_report, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static p8 j(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (p8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_edit_school_item_report, null, false, component);
    }

    @Nullable
    public View.OnClickListener d() {
        return this.f56344b;
    }

    @Nullable
    public String e() {
        return this.f56343a;
    }

    public abstract void k(@Nullable View.OnClickListener click);

    public abstract void l(@Nullable String text);
}
