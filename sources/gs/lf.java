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
public abstract class lf extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView f55772a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55773b;

    public lf(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView meanList, TextView noContentInfo) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55772a = meanList;
        this.f55773b = noContentInfo;
    }

    public static lf b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static lf c(@NonNull View view, @Nullable Object component) {
        return (lf) ViewDataBinding.bind(component, view, R.layout.item_wiki_exam_mean);
    }

    @NonNull
    public static lf d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static lf e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static lf g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (lf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_exam_mean, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static lf h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (lf) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_exam_mean, null, false, component);
    }
}
