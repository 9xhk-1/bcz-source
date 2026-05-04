package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class o4 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f56176a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56177b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56178c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56179d;

    /* renamed from: e, reason: collision with root package name */
    @Bindable
    public ta.b f56180e;

    public o4(Object _bindingComponent, View _root, int _localFieldCount, ImageView image, ProgressBar progress, TextView retry, TextView text) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56176a = image;
        this.f56177b = progress;
        this.f56178c = retry;
        this.f56179d = text;
    }

    public static o4 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static o4 c(@NonNull View view, @Nullable Object component) {
        return (o4) ViewDataBinding.bind(component, view, R.layout.bcz_loading_view);
    }

    @NonNull
    public static o4 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static o4 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static o4 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (o4) ViewDataBinding.inflateInternal(inflater, R.layout.bcz_loading_view, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static o4 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (o4) ViewDataBinding.inflateInternal(inflater, R.layout.bcz_loading_view, null, false, component);
    }

    @Nullable
    public ta.b d() {
        return this.f56180e;
    }

    public abstract void j(@Nullable ta.b viewmodel);
}
