package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class y7 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57558a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57559b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57560c;

    public y7(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView bookList, ConstraintLayout container, RecyclerView tabs) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57558a = bookList;
        this.f57559b = container;
        this.f57560c = tabs;
    }

    public static y7 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static y7 c(@NonNull View view, @Nullable Object component) {
        return (y7) ViewDataBinding.bind(component, view, R.layout.fragment_books);
    }

    @NonNull
    public static y7 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static y7 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static y7 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (y7) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_books, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static y7 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (y7) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_books, null, false, component);
    }
}
