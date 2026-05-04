package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class en extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54830a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54831b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final qn f54832c;

    public en(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout item, ImageView pictogram, qn title) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54830a = item;
        this.f54831b = pictogram;
        this.f54832c = title;
    }

    public static en b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static en c(@NonNull View view, @Nullable Object component) {
        return (en) ViewDataBinding.bind(component, view, R.layout.study_wiki_item_word_deformation);
    }

    @NonNull
    public static en d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static en e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static en g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (en) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_word_deformation, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static en h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (en) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_word_deformation, null, false, component);
    }
}
