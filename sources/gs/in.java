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
public abstract class in extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55357a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final qn f55358b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55359c;

    public in(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout item, qn title, TextView wordRoot) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55357a = item;
        this.f55358b = title;
        this.f55359c = wordRoot;
    }

    public static in b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static in c(@NonNull View view, @Nullable Object component) {
        return (in) ViewDataBinding.bind(component, view, R.layout.study_wiki_item_word_root);
    }

    @NonNull
    public static in d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static in e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static in g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (in) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_word_root, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static in h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (in) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_word_root, null, false, component);
    }
}
