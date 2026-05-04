package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class cn extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54508a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54509b;

    public cn(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout item, TextView report) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54508a = item;
        this.f54509b = report;
    }

    public static cn b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static cn c(@NonNull View view, @Nullable Object component) {
        return (cn) ViewDataBinding.bind(component, view, R.layout.study_wiki_item_report);
    }

    @NonNull
    public static cn d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static cn e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static cn g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (cn) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_report, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static cn h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (cn) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_report, null, false, component);
    }
}
