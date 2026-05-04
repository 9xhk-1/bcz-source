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
public abstract class ed extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f54773a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54774b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54775c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f54776d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f54777e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f54778f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f54779g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54780h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f54781i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f54782j;

    public ed(Object _bindingComponent, View _root, int _localFieldCount, TextView date, TextView days, TextView daysTitle, ImageView drawableLeft, ImageView imgBg, ImageView imgHeader, ImageView imgQrcode, TextView legal, TextView words, TextView wordsTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54773a = date;
        this.f54774b = days;
        this.f54775c = daysTitle;
        this.f54776d = drawableLeft;
        this.f54777e = imgBg;
        this.f54778f = imgHeader;
        this.f54779g = imgQrcode;
        this.f54780h = legal;
        this.f54781i = words;
        this.f54782j = wordsTitle;
    }

    public static ed b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ed c(@NonNull View view, @Nullable Object component) {
        return (ed) ViewDataBinding.bind(component, view, R.layout.image_daka_content_poster);
    }

    @NonNull
    public static ed d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ed e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ed g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ed) ViewDataBinding.inflateInternal(inflater, R.layout.image_daka_content_poster, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ed h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ed) ViewDataBinding.inflateInternal(inflater, R.layout.image_daka_content_poster, null, false, component);
    }
}
