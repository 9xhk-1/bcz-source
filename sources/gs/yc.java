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
public abstract class yc extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f57587a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f57588b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f57589c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57590d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f57591e;

    public yc(Object _bindingComponent, View _root, int _localFieldCount, ImageView guideContent, ImageView guideDot, View guideLine, TextView guideText, ImageView next) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57587a = guideContent;
        this.f57588b = guideDot;
        this.f57589c = guideLine;
        this.f57590d = guideText;
        this.f57591e = next;
    }

    public static yc b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static yc c(@NonNull View view, @Nullable Object component) {
        return (yc) ViewDataBinding.bind(component, view, R.layout.guide_image_daka_v2_1);
    }

    @NonNull
    public static yc d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static yc e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static yc g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (yc) ViewDataBinding.inflateInternal(inflater, R.layout.guide_image_daka_v2_1, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static yc h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (yc) ViewDataBinding.inflateInternal(inflater, R.layout.guide_image_daka_v2_1, null, false, component);
    }
}
