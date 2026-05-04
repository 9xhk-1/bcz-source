package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class wm extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f57365a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57366b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f57367c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57368d;

    public wm(Object _bindingComponent, View _root, int _localFieldCount, View bottomBg, TextView continueLearn, ImageView kill, RecyclerView wikiList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57365a = bottomBg;
        this.f57366b = continueLearn;
        this.f57367c = kill;
        this.f57368d = wikiList;
    }

    public static wm b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static wm c(@NonNull View view, @Nullable Object component) {
        return (wm) ViewDataBinding.bind(component, view, R.layout.study_wiki_fragment);
    }

    @NonNull
    public static wm d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static wm e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static wm g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (wm) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_fragment, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static wm h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (wm) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_fragment, null, false, component);
    }
}
