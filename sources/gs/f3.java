package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class f3 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f54859a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54860b;

    public f3(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, FrameLayout placeholder) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54859a = actionBar;
        this.f54860b = placeholder;
    }

    public static f3 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static f3 c(@NonNull View view, @Nullable Object component) {
        return (f3) ViewDataBinding.bind(component, view, R.layout.activity_word_tv);
    }

    @NonNull
    public static f3 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static f3 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static f3 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (f3) ViewDataBinding.inflateInternal(inflater, R.layout.activity_word_tv, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static f3 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (f3) ViewDataBinding.inflateInternal(inflater, R.layout.activity_word_tv, null, false, component);
    }
}
