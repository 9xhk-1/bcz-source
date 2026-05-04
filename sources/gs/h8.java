package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class h8 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView f55146a;

    public h8(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView optionList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55146a = optionList;
    }

    public static h8 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static h8 c(@NonNull View view, @Nullable Object component) {
        return (h8) ViewDataBinding.bind(component, view, R.layout.fragment_dialog_word_favorites_option);
    }

    @NonNull
    public static h8 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static h8 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static h8 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (h8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_dialog_word_favorites_option, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static h8 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (h8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_dialog_word_favorites_option, null, false, component);
    }
}
