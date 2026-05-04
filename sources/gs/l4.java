package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class l4 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f55706a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f55707b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55708c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Group f55709d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f55710e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f55711f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecyclerView f55712g;

    public l4(Object _bindingComponent, View _root, int _localFieldCount, ImageView closed, View dialogBg, TextView feedback, Group feedbackGroup, ImageView image, ImageView noproguardFeedbackArrow, RecyclerView noproguardFeedbackOptions) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55706a = closed;
        this.f55707b = dialogBg;
        this.f55708c = feedback;
        this.f55709d = feedbackGroup;
        this.f55710e = image;
        this.f55711f = noproguardFeedbackArrow;
        this.f55712g = noproguardFeedbackOptions;
    }

    public static l4 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static l4 c(@NonNull View view, @Nullable Object component) {
        return (l4) ViewDataBinding.bind(component, view, R.layout.bcz_img_dialog);
    }

    @NonNull
    public static l4 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static l4 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static l4 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (l4) ViewDataBinding.inflateInternal(inflater, R.layout.bcz_img_dialog, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static l4 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (l4) ViewDataBinding.inflateInternal(inflater, R.layout.bcz_img_dialog, null, false, component);
    }
}
