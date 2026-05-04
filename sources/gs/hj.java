package gs;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class hj extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f55203a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55204b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55205c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55206d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55207e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55208f;

    /* renamed from: g, reason: collision with root package name */
    @Bindable
    public Typeface f55209g;

    public hj(Object _bindingComponent, View _root, int _localFieldCount, ImageView bgImg, TextView bookName, LinearLayout bookTip, TextView continueToOthers, TextView subTip, TextView tip) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55203a = bgImg;
        this.f55204b = bookName;
        this.f55205c = bookTip;
        this.f55206d = continueToOthers;
        this.f55207e = subTip;
        this.f55208f = tip;
    }

    public static hj b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static hj c(@NonNull View view, @Nullable Object component) {
        return (hj) ViewDataBinding.bind(component, view, R.layout.layout_words_book_done);
    }

    @NonNull
    public static hj e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static hj g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static hj h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (hj) ViewDataBinding.inflateInternal(inflater, R.layout.layout_words_book_done, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static hj i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (hj) ViewDataBinding.inflateInternal(inflater, R.layout.layout_words_book_done, null, false, component);
    }

    @Nullable
    public Typeface d() {
        return this.f55209g;
    }

    public abstract void j(@Nullable Typeface accentFont);
}
