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
public abstract class tf extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56883a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56884b;

    public tf(Object _bindingComponent, View _root, int _localFieldCount, TextView phraseCh, TextView phraseEn) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56883a = phraseCh;
        this.f56884b = phraseEn;
    }

    public static tf b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static tf c(@NonNull View view, @Nullable Object component) {
        return (tf) ViewDataBinding.bind(component, view, R.layout.item_wiki_ext_phrase);
    }

    @NonNull
    public static tf d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static tf e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static tf g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (tf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_ext_phrase, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static tf h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (tf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_ext_phrase, null, false, component);
    }
}
