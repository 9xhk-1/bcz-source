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
public abstract class gd extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f55054a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f55055b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55056c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f55057d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f55058e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55059f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f55060g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f55061h;

    public gd(Object _bindingComponent, View _root, int _localFieldCount, ImageView imgBg, ImageView imgQrcode, TextView ivHeader, ImageView ivLogo, ImageView ivPicture, TextView tvSentenceCh, TextView tvSentenceEn, TextView tvSource) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55054a = imgBg;
        this.f55055b = imgQrcode;
        this.f55056c = ivHeader;
        this.f55057d = ivLogo;
        this.f55058e = ivPicture;
        this.f55059f = tvSentenceCh;
        this.f55060g = tvSentenceEn;
        this.f55061h = tvSource;
    }

    public static gd b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static gd c(@NonNull View view, @Nullable Object component) {
        return (gd) ViewDataBinding.bind(component, view, R.layout.image_daka_content_sentence);
    }

    @NonNull
    public static gd d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static gd e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static gd g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (gd) ViewDataBinding.inflateInternal(inflater, R.layout.image_daka_content_sentence, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static gd h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (gd) ViewDataBinding.inflateInternal(inflater, R.layout.image_daka_content_sentence, null, false, component);
    }
}
