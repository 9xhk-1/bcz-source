package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ke extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55609a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55610b;

    public ke(Object _bindingComponent, View _root, int _localFieldCount, TextView groupTitle, LinearLayout phrasesContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55609a = groupTitle;
        this.f55610b = phrasesContainer;
    }

    public static ke b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ke c(@NonNull View view, @Nullable Object component) {
        return (ke) ViewDataBinding.bind(component, view, R.layout.item_lookup_wiki_phrase_group);
    }

    @NonNull
    public static ke d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ke e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ke g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ke) ViewDataBinding.inflateInternal(inflater, R.layout.item_lookup_wiki_phrase_group, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ke h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ke) ViewDataBinding.inflateInternal(inflater, R.layout.item_lookup_wiki_phrase_group, null, false, component);
    }
}
