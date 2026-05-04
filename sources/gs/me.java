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
public abstract class me extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55900a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55901b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55902c;

    public me(Object _bindingComponent, View _root, int _localFieldCount, TextView meanText, TextView meanType, LinearLayout sentencesContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55900a = meanText;
        this.f55901b = meanType;
        this.f55902c = sentencesContainer;
    }

    public static me b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static me c(@NonNull View view, @Nullable Object component) {
        return (me) ViewDataBinding.bind(component, view, R.layout.item_lookup_wiki_sentence);
    }

    @NonNull
    public static me d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static me e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static me g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (me) ViewDataBinding.inflateInternal(inflater, R.layout.item_lookup_wiki_sentence, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static me h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (me) ViewDataBinding.inflateInternal(inflater, R.layout.item_lookup_wiki_sentence, null, false, component);
    }
}
