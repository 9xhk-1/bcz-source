package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class j2 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f55398a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final BottomSheetLayout f55399b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55400c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55401d;

    /* renamed from: e, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f55402e;

    /* renamed from: f, reason: collision with root package name */
    @Bindable
    public String f55403f;

    /* renamed from: g, reason: collision with root package name */
    @Bindable
    public boolean f55404g;

    /* renamed from: h, reason: collision with root package name */
    @Bindable
    public boolean f55405h;

    public j2(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, BottomSheetLayout bottomsheet, LinearLayout contentContainer, FrameLayout fragmentContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55398a = actionBar;
        this.f55399b = bottomsheet;
        this.f55400c = contentContainer;
        this.f55401d = fragmentContainer;
    }

    public static j2 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static j2 c(@NonNull View view, @Nullable Object component) {
        return (j2) ViewDataBinding.bind(component, view, R.layout.activity_single_setting_fragment);
    }

    @NonNull
    public static j2 i(@NonNull LayoutInflater inflater) {
        return l(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static j2 j(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return k(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static j2 k(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (j2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_single_setting_fragment, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static j2 l(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (j2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_single_setting_fragment, null, false, component);
    }

    @Nullable
    public View.OnClickListener d() {
        return this.f55402e;
    }

    public boolean e() {
        return this.f55404g;
    }

    public boolean g() {
        return this.f55405h;
    }

    @Nullable
    public String h() {
        return this.f55403f;
    }

    public abstract void m(@Nullable View.OnClickListener backListener);

    public abstract void n(boolean dark);

    public abstract void o(boolean showDivider);

    public abstract void p(@Nullable String title);
}
