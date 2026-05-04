package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class u0 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f56931a;

    public u0(Object _bindingComponent, View _root, int _localFieldCount, a actionBar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56931a = actionBar;
    }

    public static u0 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static u0 c(@NonNull View view, @Nullable Object component) {
        return (u0) ViewDataBinding.bind(component, view, R.layout.activity_identity_books);
    }

    @NonNull
    public static u0 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static u0 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static u0 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (u0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_identity_books, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static u0 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (u0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_identity_books, null, false, component);
    }
}
