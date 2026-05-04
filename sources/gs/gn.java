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
public abstract class gn extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55108a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55109b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final qn f55110c;

    public gn(Object _bindingComponent, View _root, int _localFieldCount, TextView enMean, ConstraintLayout item, qn title) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55108a = enMean;
        this.f55109b = item;
        this.f55110c = title;
    }

    public static gn b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static gn c(@NonNull View view, @Nullable Object component) {
        return (gn) ViewDataBinding.bind(component, view, R.layout.study_wiki_item_word_enmean);
    }

    @NonNull
    public static gn d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static gn e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static gn g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (gn) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_word_enmean, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static gn h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (gn) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_word_enmean, null, false, component);
    }
}
