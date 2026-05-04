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
public abstract class qn extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56544a;

    public qn(Object _bindingComponent, View _root, int _localFieldCount, TextView title) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56544a = title;
    }

    public static qn b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static qn c(@NonNull View view, @Nullable Object component) {
        return (qn) ViewDataBinding.bind(component, view, R.layout.study_wiki_subitem_title);
    }

    @NonNull
    public static qn d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static qn e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static qn g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (qn) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_subitem_title, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static qn h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (qn) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_subitem_title, null, false, component);
    }
}
