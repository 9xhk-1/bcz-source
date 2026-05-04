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
public abstract class a6 extends ViewDataBinding {
    public a6(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public static a6 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static a6 c(@NonNull View view, @Nullable Object component) {
        return (a6) ViewDataBinding.bind(component, view, R.layout.daka_activity_wordlist_tail);
    }

    @NonNull
    public static a6 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static a6 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static a6 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (a6) ViewDataBinding.inflateInternal(inflater, R.layout.daka_activity_wordlist_tail, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static a6 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (a6) ViewDataBinding.inflateInternal(inflater, R.layout.daka_activity_wordlist_tail, null, false, component);
    }
}
