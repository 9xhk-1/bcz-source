package gs;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class f7 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f54888a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54889b;

    /* renamed from: c, reason: collision with root package name */
    @Bindable
    public Drawable f54890c;

    /* renamed from: d, reason: collision with root package name */
    @Bindable
    public String f54891d;

    /* renamed from: e, reason: collision with root package name */
    @Bindable
    public String f54892e;

    /* renamed from: f, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f54893f;

    public f7(Object _bindingComponent, View _root, int _localFieldCount, ImageView defaultImg, TextView tipContent) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54888a = defaultImg;
        this.f54889b = tipContent;
    }

    public static f7 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static f7 c(@NonNull View view, @Nullable Object component) {
        return (f7) ViewDataBinding.bind(component, view, R.layout.fail_and_retry_layout);
    }

    @NonNull
    public static f7 i(@NonNull LayoutInflater inflater) {
        return l(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static f7 j(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return k(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static f7 k(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (f7) ViewDataBinding.inflateInternal(inflater, R.layout.fail_and_retry_layout, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static f7 l(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (f7) ViewDataBinding.inflateInternal(inflater, R.layout.fail_and_retry_layout, null, false, component);
    }

    @Nullable
    public String d() {
        return this.f54891d;
    }

    @Nullable
    public Drawable e() {
        return this.f54890c;
    }

    @Nullable
    public String g() {
        return this.f54892e;
    }

    @Nullable
    public View.OnClickListener h() {
        return this.f54893f;
    }

    public abstract void m(@Nullable String content);

    public abstract void n(@Nullable Drawable img);

    public abstract void o(@Nullable String retry);

    public abstract void p(@Nullable View.OnClickListener retryClick);
}
