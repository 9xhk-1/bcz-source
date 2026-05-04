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
public abstract class b7 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f54249a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54250b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54251c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54252d;

    public b7(Object _bindingComponent, View _root, int _localFieldCount, TextView tvNegative, TextView tvPositive, TextView tvSubtitle, TextView tvTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54249a = tvNegative;
        this.f54250b = tvPositive;
        this.f54251c = tvSubtitle;
        this.f54252d = tvTitle;
    }

    public static b7 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static b7 c(@NonNull View view, @Nullable Object component) {
        return (b7) ViewDataBinding.bind(component, view, R.layout.dialog_word_list_action);
    }

    @NonNull
    public static b7 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static b7 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static b7 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (b7) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_word_list_action, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static b7 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (b7) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_word_list_action, null, false, component);
    }
}
