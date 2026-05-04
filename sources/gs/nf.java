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
public abstract class nf extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56062a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56063b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56064c;

    public nf(Object _bindingComponent, View _root, int _localFieldCount, TextView content, TextView percent, TextView type) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56062a = content;
        this.f56063b = percent;
        this.f56064c = type;
    }

    public static nf b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static nf c(@NonNull View view, @Nullable Object component) {
        return (nf) ViewDataBinding.bind(component, view, R.layout.item_wiki_exam_mean_sub);
    }

    @NonNull
    public static nf d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static nf e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static nf g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (nf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_exam_mean_sub, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static nf h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (nf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_exam_mean_sub, null, false, component);
    }
}
