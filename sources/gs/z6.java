package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class z6 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57738a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57739b;

    public z6(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView rvList, TextView tvTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57738a = rvList;
        this.f57739b = tvTitle;
    }

    public static z6 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static z6 c(@NonNull View view, @Nullable Object component) {
        return (z6) ViewDataBinding.bind(component, view, R.layout.dialog_word_bottom_option);
    }

    @NonNull
    public static z6 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static z6 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static z6 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (z6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_word_bottom_option, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static z6 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (z6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_word_bottom_option, null, false, component);
    }
}
