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
import com.baicizhan.client.business.widget.CircleImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class kd extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final CircleImageView f55602a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f55603b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55604c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f55605d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f55606e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f55607f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f55608g;

    public kd(Object _bindingComponent, View _root, int _localFieldCount, CircleImageView avatar, View colorBg, TextView date, ImageView imgBg, ImageView imgHeader, ImageView imgQrcode, TextView name) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55602a = avatar;
        this.f55603b = colorBg;
        this.f55604c = date;
        this.f55605d = imgBg;
        this.f55606e = imgHeader;
        this.f55607f = imgQrcode;
        this.f55608g = name;
    }

    public static kd b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static kd c(@NonNull View view, @Nullable Object component) {
        return (kd) ViewDataBinding.bind(component, view, R.layout.image_daka_content_words);
    }

    @NonNull
    public static kd d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static kd e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static kd g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (kd) ViewDataBinding.inflateInternal(inflater, R.layout.image_daka_content_words, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static kd h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (kd) ViewDataBinding.inflateInternal(inflater, R.layout.image_daka_content_words, null, false, component);
    }
}
