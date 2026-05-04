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
public abstract class f8 extends ViewDataBinding {
    public f8(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public static f8 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static f8 c(@NonNull View view, @Nullable Object component) {
        return (f8) ViewDataBinding.bind(component, view, R.layout.fragment_daka_sentence);
    }

    @NonNull
    public static f8 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static f8 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static f8 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (f8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_daka_sentence, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static f8 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (f8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_daka_sentence, null, false, component);
    }
}
