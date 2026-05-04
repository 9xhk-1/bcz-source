package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class v6 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f57132a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f57133b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57134c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57135d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57136e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57137f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57138g;

    public v6(Object _bindingComponent, View _root, int _localFieldCount, TextView btnStart, View card, TextView modeDesc, TextView planDesc, TextView tip, TextView title, TextView wordsCount) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57132a = btnStart;
        this.f57133b = card;
        this.f57134c = modeDesc;
        this.f57135d = planDesc;
        this.f57136e = tip;
        this.f57137f = title;
        this.f57138g = wordsCount;
    }

    public static v6 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static v6 c(@NonNull View view, @Nullable Object component) {
        return (v6) ViewDataBinding.bind(component, view, R.layout.dialog_user_learning_guide_new);
    }

    @NonNull
    public static v6 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static v6 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static v6 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (v6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_user_learning_guide_new, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static v6 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (v6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_user_learning_guide_new, null, false, component);
    }
}
