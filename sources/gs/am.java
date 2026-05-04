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
public abstract class am extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f54200a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54201b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54202c;

    public am(Object _bindingComponent, View _root, int _localFieldCount, TextView collect, TextView showHideChinese, TextView timeOrder) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54200a = collect;
        this.f54201b = showHideChinese;
        this.f54202c = timeOrder;
    }

    public static am b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static am c(@NonNull View view, @Nullable Object component) {
        return (am) ViewDataBinding.bind(component, view, R.layout.popup_marked_word_menu);
    }

    @NonNull
    public static am d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static am e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static am g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (am) ViewDataBinding.inflateInternal(inflater, R.layout.popup_marked_word_menu, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static am h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (am) ViewDataBinding.inflateInternal(inflater, R.layout.popup_marked_word_menu, null, false, component);
    }
}
