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
public abstract class yd extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f57592a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f57593b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57594c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f57595d;

    public yd(Object _bindingComponent, View _root, int _localFieldCount, TextView desc, ImageView newTag, TextView title, ImageView typeImage) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57592a = desc;
        this.f57593b = newTag;
        this.f57594c = title;
        this.f57595d = typeImage;
    }

    public static yd b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static yd c(@NonNull View view, @Nullable Object component) {
        return (yd) ViewDataBinding.bind(component, view, R.layout.item_discovery_widget);
    }

    @NonNull
    public static yd d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static yd e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static yd g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (yd) ViewDataBinding.inflateInternal(inflater, R.layout.item_discovery_widget, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static yd h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (yd) ViewDataBinding.inflateInternal(inflater, R.layout.item_discovery_widget, null, false, component);
    }
}
