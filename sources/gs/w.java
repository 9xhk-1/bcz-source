package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;
import com.makeramen.roundedimageview.RoundedImageView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class w extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f57229a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f57230b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57231c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f57232d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final BottomSheetLayout f57233e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f57234f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f57235g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57236h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f57237i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f57238j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f57239k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f57240l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f57241m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final ImageView f57242n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57243o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f57244p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final Group f57245q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextView f57246r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final TextView f57247s;

    /* renamed from: t, reason: collision with root package name */
    @Bindable
    public od.n f57248t;

    public w(Object _bindingComponent, View _root, int _localFieldCount, ImageView adClosed, RoundedImageView adImage, FrameLayout adImageContainer, View bgGradient, BottomSheetLayout bottomSheet, ImageView celebration, ImageView close, ConstraintLayout constrainLayout, TextView dakaBtn, View dakaBtnBg, TextView dateTitle, TextView dayTitle, TextView days, ImageView icShareTip, FrameLayout learningCalendarContainer, TextView title, Group visibleGroup, TextView words, TextView wordsTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57229a = adClosed;
        this.f57230b = adImage;
        this.f57231c = adImageContainer;
        this.f57232d = bgGradient;
        this.f57233e = bottomSheet;
        this.f57234f = celebration;
        this.f57235g = close;
        this.f57236h = constrainLayout;
        this.f57237i = dakaBtn;
        this.f57238j = dakaBtnBg;
        this.f57239k = dateTitle;
        this.f57240l = dayTitle;
        this.f57241m = days;
        this.f57242n = icShareTip;
        this.f57243o = learningCalendarContainer;
        this.f57244p = title;
        this.f57245q = visibleGroup;
        this.f57246r = words;
        this.f57247s = wordsTitle;
    }

    public static w b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static w c(@NonNull View view, @Nullable Object component) {
        return (w) ViewDataBinding.bind(component, view, R.layout.activity_daka_page);
    }

    @NonNull
    public static w e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static w g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static w h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (w) ViewDataBinding.inflateInternal(inflater, R.layout.activity_daka_page, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static w i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (w) ViewDataBinding.inflateInternal(inflater, R.layout.activity_daka_page, null, false, component);
    }

    @Nullable
    public od.n d() {
        return this.f57248t;
    }

    public abstract void j(@Nullable od.n viewmodel);
}
