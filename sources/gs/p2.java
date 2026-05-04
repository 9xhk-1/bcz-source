package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class p2 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f56284a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56285b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final EditText f56286c;

    /* renamed from: d, reason: collision with root package name */
    @Bindable
    public hf.d f56287d;

    public p2(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, TextView desc, EditText editName) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56284a = actionBar;
        this.f56285b = desc;
        this.f56286c = editName;
    }

    public static p2 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static p2 c(@NonNull View view, @Nullable Object component) {
        return (p2) ViewDataBinding.bind(component, view, R.layout.activity_user_edit);
    }

    @NonNull
    public static p2 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static p2 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static p2 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (p2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_user_edit, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static p2 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (p2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_user_edit, null, false, component);
    }

    @Nullable
    public hf.d d() {
        return this.f56287d;
    }

    public abstract void j(@Nullable hf.d viewModel);
}
