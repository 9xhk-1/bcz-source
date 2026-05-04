package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a4 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54124a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54125b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54126c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f54127d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f54128e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54129f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f54130g;

    public a4(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout bczDialogContentView, TextView bczDialogTitleText, FrameLayout buttonArea, ImageView close, View imgPadding, FrameLayout titleContainer, ImageView titleImg) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54124a = bczDialogContentView;
        this.f54125b = bczDialogTitleText;
        this.f54126c = buttonArea;
        this.f54127d = close;
        this.f54128e = imgPadding;
        this.f54129f = titleContainer;
        this.f54130g = titleImg;
    }

    public static a4 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static a4 c(@NonNull View view, @Nullable Object component) {
        return (a4) ViewDataBinding.bind(component, view, R.layout.bcz_dialog_base);
    }

    @NonNull
    public static a4 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static a4 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static a4 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (a4) ViewDataBinding.inflateInternal(inflater, R.layout.bcz_dialog_base, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static a4 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (a4) ViewDataBinding.inflateInternal(inflater, R.layout.bcz_dialog_base, null, false, component);
    }
}
