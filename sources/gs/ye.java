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
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ye extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f57596a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57597b;

    public ye(Object _bindingComponent, View _root, int _localFieldCount, ImageView shareIcon, TextView shareTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57596a = shareIcon;
        this.f57597b = shareTitle;
    }

    public static ye b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ye c(@NonNull View view, @Nullable Object component) {
        return (ye) ViewDataBinding.bind(component, view, R.layout.item_share_channel);
    }

    @NonNull
    public static ye d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ye e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ye g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ye) ViewDataBinding.inflateInternal(inflater, R.layout.item_share_channel, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ye h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ye) ViewDataBinding.inflateInternal(inflater, R.layout.item_share_channel, null, false, component);
    }
}
