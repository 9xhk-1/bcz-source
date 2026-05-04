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
public abstract class fg extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f54929a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54930b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54931c;

    public fg(Object _bindingComponent, View _root, int _localFieldCount, TextView mnemonicContent, ImageView mnemonicImg, TextView mnemonicType) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54929a = mnemonicContent;
        this.f54930b = mnemonicImg;
        this.f54931c = mnemonicType;
    }

    public static fg b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static fg c(@NonNull View view, @Nullable Object component) {
        return (fg) ViewDataBinding.bind(component, view, R.layout.item_wiki_mnemonic_info);
    }

    @NonNull
    public static fg d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static fg e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static fg g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (fg) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_mnemonic_info, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static fg h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (fg) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_mnemonic_info, null, false, component);
    }
}
