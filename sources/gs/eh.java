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
public abstract class eh extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f54790a;

    public eh(Object _bindingComponent, View _root, int _localFieldCount, TextView sectionText) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54790a = sectionText;
    }

    public static eh b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static eh c(@NonNull View view, @Nullable Object component) {
        return (eh) ViewDataBinding.bind(component, view, R.layout.item_word_book_list_section);
    }

    @NonNull
    public static eh d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static eh e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static eh g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (eh) ViewDataBinding.inflateInternal(inflater, R.layout.item_word_book_list_section, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static eh h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (eh) ViewDataBinding.inflateInternal(inflater, R.layout.item_word_book_list_section, null, false, component);
    }
}
