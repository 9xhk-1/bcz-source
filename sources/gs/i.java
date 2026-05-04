package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.widget.NoScrollViewPager;
import com.jiongji.andriod.card.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class i extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f55240a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final NoScrollViewPager f55241b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final SmartTabLayout f55242c;

    public i(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, NoScrollViewPager contentPager, SmartTabLayout contentTab) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55240a = actionBar;
        this.f55241b = contentPager;
        this.f55242c = contentTab;
    }

    public static i b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static i c(@NonNull View view, @Nullable Object component) {
        return (i) ViewDataBinding.bind(component, view, R.layout.activity_all_books);
    }

    @NonNull
    public static i d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static i e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static i g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (i) ViewDataBinding.inflateInternal(inflater, R.layout.activity_all_books, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static i h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (i) ViewDataBinding.inflateInternal(inflater, R.layout.activity_all_books, null, false, component);
    }
}
