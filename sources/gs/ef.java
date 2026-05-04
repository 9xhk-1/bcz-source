package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ef extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f54785a;

    public ef(Object _bindingComponent, View _root, int _localFieldCount, TextView displayName) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54785a = displayName;
    }

    public static ef b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ef c(@NonNull View view, @Nullable Object component) {
        return (ef) ViewDataBinding.bind(component, view, R.layout.item_user_grade_title);
    }

    @NonNull
    public static ef d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ef e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ef g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ef) ViewDataBinding.inflateInternal(inflater, R.layout.item_user_grade_title, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ef h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ef) ViewDataBinding.inflateInternal(inflater, R.layout.item_user_grade_title, null, false, component);
    }
}
