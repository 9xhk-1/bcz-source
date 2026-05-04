package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class m2 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f55835a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55836b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55837c;

    public m2(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, ConstraintLayout container, FrameLayout wordWiki) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55835a = actionBar;
        this.f55836b = container;
        this.f55837c = wordWiki;
    }

    public static m2 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static m2 c(@NonNull View view, @Nullable Object component) {
        return (m2) ViewDataBinding.bind(component, view, R.layout.activity_study_wiki_v2);
    }

    @NonNull
    public static m2 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static m2 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static m2 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (m2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_study_wiki_v2, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static m2 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (m2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_study_wiki_v2, null, false, component);
    }
}
