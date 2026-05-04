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
public abstract class id extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f55309a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final CircleImageView f55310b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f55311c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f55312d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55313e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55314f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f55315g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f55316h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55317i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f55318j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final View f55319k;

    public id(Object _bindingComponent, View _root, int _localFieldCount, ImageView imgQrcode, CircleImageView ivHead, ImageView ivLogo, ImageView ivStreak, TextView tvDate, TextView tvDayDesc, TextView tvDays, TextView tvHeader, TextView tvName, TextView tvTitle, View vAvatar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55309a = imgQrcode;
        this.f55310b = ivHead;
        this.f55311c = ivLogo;
        this.f55312d = ivStreak;
        this.f55313e = tvDate;
        this.f55314f = tvDayDesc;
        this.f55315g = tvDays;
        this.f55316h = tvHeader;
        this.f55317i = tvName;
        this.f55318j = tvTitle;
        this.f55319k = vAvatar;
    }

    public static id b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static id c(@NonNull View view, @Nullable Object component) {
        return (id) ViewDataBinding.bind(component, view, R.layout.image_daka_content_win_day);
    }

    @NonNull
    public static id d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static id e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static id g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (id) ViewDataBinding.inflateInternal(inflater, R.layout.image_daka_content_win_day, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static id h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (id) ViewDataBinding.inflateInternal(inflater, R.layout.image_daka_content_win_day, null, false, component);
    }
}
