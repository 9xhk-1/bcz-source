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
public abstract class n8 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @Bindable
    public String f56009a;

    /* renamed from: b, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f56010b;

    /* renamed from: c, reason: collision with root package name */
    @Bindable
    public Boolean f56011c;

    public n8(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public static n8 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static n8 c(@NonNull View view, @Nullable Object component) {
        return (n8) ViewDataBinding.bind(component, view, R.layout.fragment_edit_school_item);
    }

    @NonNull
    public static n8 h(@NonNull LayoutInflater inflater) {
        return k(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static n8 i(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return j(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static n8 j(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (n8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_edit_school_item, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static n8 k(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (n8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_edit_school_item, null, false, component);
    }

    @Nullable
    public View.OnClickListener d() {
        return this.f56010b;
    }

    @Nullable
    public Boolean e() {
        return this.f56011c;
    }

    @Nullable
    public String g() {
        return this.f56009a;
    }

    public abstract void l(@Nullable View.OnClickListener click);

    public abstract void m(@Nullable Boolean showDivider);

    public abstract void n(@Nullable String text);
}
