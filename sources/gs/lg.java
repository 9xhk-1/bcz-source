package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class lg extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55774a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f55775b;

    public lg(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout indicatorLayout, ViewPager2 sentencePager) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55774a = indicatorLayout;
        this.f55775b = sentencePager;
    }

    public static lg b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static lg c(@NonNull View view, @Nullable Object component) {
        return (lg) ViewDataBinding.bind(component, view, R.layout.item_wiki_sentence);
    }

    @NonNull
    public static lg d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static lg e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static lg g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (lg) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_sentence, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static lg h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (lg) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_sentence, null, false, component);
    }
}
