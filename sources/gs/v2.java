package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.widget.SwipeViewPager;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class v2 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f57119a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final SwipeViewPager f57120b;

    public v2(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, SwipeViewPager wikiPager) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57119a = actionBar;
        this.f57120b = wikiPager;
    }

    public static v2 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static v2 c(@NonNull View view, @Nullable Object component) {
        return (v2) ViewDataBinding.bind(component, view, R.layout.activity_wiki_pager);
    }

    @NonNull
    public static v2 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static v2 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static v2 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (v2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_wiki_pager, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static v2 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (v2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_wiki_pager, null, false, component);
    }
}
