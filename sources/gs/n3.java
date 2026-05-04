package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class n3 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f55979a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55980b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55981c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55982d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55983e;

    public n3(Object _bindingComponent, View _root, int _localFieldCount, ImageView bookBg, TextView bookDesc, TextView bookName, TextView bookWordCount, ConstraintLayout root) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55979a = bookBg;
        this.f55980b = bookDesc;
        this.f55981c = bookName;
        this.f55982d = bookWordCount;
        this.f55983e = root;
    }

    public static n3 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static n3 c(@NonNull View view, @Nullable Object component) {
        return (n3) ViewDataBinding.bind(component, view, R.layout.adjust_schedule_new);
    }

    @NonNull
    public static n3 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static n3 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static n3 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (n3) ViewDataBinding.inflateInternal(inflater, R.layout.adjust_schedule_new, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static n3 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (n3) ViewDataBinding.inflateInternal(inflater, R.layout.adjust_schedule_new, null, false, component);
    }
}
