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
public abstract class r5 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f56572a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56573b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56574c;

    public r5(Object _bindingComponent, View _root, int _localFieldCount, View bottomBg, TextView continueLearn, FrameLayout lookUpWiki) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56572a = bottomBg;
        this.f56573b = continueLearn;
        this.f56574c = lookUpWiki;
    }

    public static r5 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static r5 c(@NonNull View view, @Nullable Object component) {
        return (r5) ViewDataBinding.bind(component, view, R.layout.collection_wiki_fragment);
    }

    @NonNull
    public static r5 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static r5 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static r5 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (r5) ViewDataBinding.inflateInternal(inflater, R.layout.collection_wiki_fragment, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static r5 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (r5) ViewDataBinding.inflateInternal(inflater, R.layout.collection_wiki_fragment, null, false, component);
    }
}
