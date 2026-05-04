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
public abstract class b3 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f54223a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54224b;

    public b3(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, TextView submit) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54223a = actionBar;
        this.f54224b = submit;
    }

    public static b3 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static b3 c(@NonNull View view, @Nullable Object component) {
        return (b3) ViewDataBinding.bind(component, view, R.layout.activity_word_error_feedback);
    }

    @NonNull
    public static b3 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static b3 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static b3 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (b3) ViewDataBinding.inflateInternal(inflater, R.layout.activity_word_error_feedback, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static b3 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (b3) ViewDataBinding.inflateInternal(inflater, R.layout.activity_word_error_feedback, null, false, component);
    }
}
