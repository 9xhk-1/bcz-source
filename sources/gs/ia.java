package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ia extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55291a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55292b;

    public ia(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout root, TextView topTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55291a = root;
        this.f55292b = topTitle;
    }

    public static ia b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ia c(@NonNull View view, @Nullable Object component) {
        return (ia) ViewDataBinding.bind(component, view, R.layout.fragment_review);
    }

    @NonNull
    public static ia d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ia e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ia g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ia) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_review, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ia h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ia) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_review, null, false, component);
    }
}
