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
public abstract class ad extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f54172a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54173b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54174c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f54175d;

    public ad(Object _bindingComponent, View _root, int _localFieldCount, ImageView guideContent, ImageView guideLine, TextView guideText, ImageView next) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54172a = guideContent;
        this.f54173b = guideLine;
        this.f54174c = guideText;
        this.f54175d = next;
    }

    public static ad b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ad c(@NonNull View view, @Nullable Object component) {
        return (ad) ViewDataBinding.bind(component, view, R.layout.guide_image_daka_v2_2);
    }

    @NonNull
    public static ad d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ad e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ad g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ad) ViewDataBinding.inflateInternal(inflater, R.layout.guide_image_daka_v2_2, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ad h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ad) ViewDataBinding.inflateInternal(inflater, R.layout.guide_image_daka_v2_2, null, false, component);
    }
}
