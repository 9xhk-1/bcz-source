package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class e1 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final BottomSheetLayout f54695a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54696b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54697c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54698d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54699e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54700f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f54701g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54702h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final EditText f54703i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f54704j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ProgressBar f54705k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f54706l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54707m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final ImageView f54708n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54709o;

    public e1(Object _bindingComponent, View _root, int _localFieldCount, BottomSheetLayout bottomsheet, ImageView cameraImg, LinearLayout cameraTip, TextView cancelLookup, FrameLayout dragHighlight, FrameLayout fragmentContainer, ImageView lookupClear, ConstraintLayout lookupContentRoot, EditText lookupEdit, View lookupEditBg, ProgressBar lookupProgress, TextView lookupTip, RelativeLayout relativeLayout, ImageView tipClose, RelativeLayout topBar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54695a = bottomsheet;
        this.f54696b = cameraImg;
        this.f54697c = cameraTip;
        this.f54698d = cancelLookup;
        this.f54699e = dragHighlight;
        this.f54700f = fragmentContainer;
        this.f54701g = lookupClear;
        this.f54702h = lookupContentRoot;
        this.f54703i = lookupEdit;
        this.f54704j = lookupEditBg;
        this.f54705k = lookupProgress;
        this.f54706l = lookupTip;
        this.f54707m = relativeLayout;
        this.f54708n = tipClose;
        this.f54709o = topBar;
    }

    public static e1 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static e1 c(@NonNull View view, @Nullable Object component) {
        return (e1) ViewDataBinding.bind(component, view, R.layout.activity_lookup_word);
    }

    @NonNull
    public static e1 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static e1 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static e1 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (e1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_lookup_word, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static e1 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (e1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_lookup_word, null, false, component);
    }
}
