package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class qc extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f56484a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f56485b;

    public qc(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, RecyclerView searchResultList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56484a = actionBar;
        this.f56485b = searchResultList;
    }

    public static qc b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static qc c(@NonNull View view, @Nullable Object component) {
        return (qc) ViewDataBinding.bind(component, view, R.layout.friend_search_result_activity_portrait);
    }

    @NonNull
    public static qc d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static qc e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static qc g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (qc) ViewDataBinding.inflateInternal(inflater, R.layout.friend_search_result_activity_portrait, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static qc h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (qc) ViewDataBinding.inflateInternal(inflater, R.layout.friend_search_result_activity_portrait, null, false, component);
    }
}
