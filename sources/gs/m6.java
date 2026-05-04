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
public abstract class m6 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55850a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f55851b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55852c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55853d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55854e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55855f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f55856g;

    public m6(Object _bindingComponent, View _root, int _localFieldCount, TextView btnStart, View card, TextView modeDesc, TextView planDesc, TextView tip, TextView title, TextView wordsCount) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55850a = btnStart;
        this.f55851b = card;
        this.f55852c = modeDesc;
        this.f55853d = planDesc;
        this.f55854e = tip;
        this.f55855f = title;
        this.f55856g = wordsCount;
    }

    public static m6 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static m6 c(@NonNull View view, @Nullable Object component) {
        return (m6) ViewDataBinding.bind(component, view, R.layout.dialog_new_user_learning_guide);
    }

    @NonNull
    public static m6 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static m6 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static m6 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (m6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_new_user_learning_guide, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static m6 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (m6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_new_user_learning_guide, null, false, component);
    }
}
