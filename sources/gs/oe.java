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
public abstract class oe extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f56216a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56217b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56218c;

    public oe(Object _bindingComponent, View _root, int _localFieldCount, ImageView tipContentImage, TextView tipContentText, TextView tipTypeTag) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56216a = tipContentImage;
        this.f56217b = tipContentText;
        this.f56218c = tipTypeTag;
    }

    public static oe b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static oe c(@NonNull View view, @Nullable Object component) {
        return (oe) ViewDataBinding.bind(component, view, R.layout.item_lookup_wiki_tip);
    }

    @NonNull
    public static oe d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static oe e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static oe g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (oe) ViewDataBinding.inflateInternal(inflater, R.layout.item_lookup_wiki_tip, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static oe h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (oe) ViewDataBinding.inflateInternal(inflater, R.layout.item_lookup_wiki_tip, null, false, component);
    }
}
