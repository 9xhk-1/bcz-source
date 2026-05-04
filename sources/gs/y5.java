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
public abstract class y5 extends ViewDataBinding {
    public y5(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public static y5 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static y5 c(@NonNull View view, @Nullable Object component) {
        return (y5) ViewDataBinding.bind(component, view, R.layout.daka_activity_wordlist_head);
    }

    @NonNull
    public static y5 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static y5 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static y5 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (y5) ViewDataBinding.inflateInternal(inflater, R.layout.daka_activity_wordlist_head, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static y5 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (y5) ViewDataBinding.inflateInternal(inflater, R.layout.daka_activity_wordlist_head, null, false, component);
    }
}
