package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class q3 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f56443a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56444b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56445c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56446d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56447e;

    public q3(Object _bindingComponent, View _root, int _localFieldCount, ImageView back, TextView content, ConstraintLayout loadingContainer, ProgressBar progressBar, TextView retry) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56443a = back;
        this.f56444b = content;
        this.f56445c = loadingContainer;
        this.f56446d = progressBar;
        this.f56447e = retry;
    }

    public static q3 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static q3 c(@NonNull View view, @Nullable Object component) {
        return (q3) ViewDataBinding.bind(component, view, R.layout.ai_class_loading);
    }

    @NonNull
    public static q3 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static q3 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static q3 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (q3) ViewDataBinding.inflateInternal(inflater, R.layout.ai_class_loading, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static q3 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (q3) ViewDataBinding.inflateInternal(inflater, R.layout.ai_class_loading, null, false, component);
    }
}
