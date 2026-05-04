package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class em extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54828a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54829b;

    public em(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout mapLearnTip, ImageView tipClose) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54828a = mapLearnTip;
        this.f54829b = tipClose;
    }

    public static em b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static em c(@NonNull View view, @Nullable Object component) {
        return (em) ViewDataBinding.bind(component, view, R.layout.popup_word_list_tip);
    }

    @NonNull
    public static em d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static em e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static em g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (em) ViewDataBinding.inflateInternal(inflater, R.layout.popup_word_list_tip, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static em h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (em) ViewDataBinding.inflateInternal(inflater, R.layout.popup_word_list_tip, null, false, component);
    }
}
