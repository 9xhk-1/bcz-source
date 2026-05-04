package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class bo extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54318a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54319b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54320c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54321d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Group f54322e;

    public bo(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout banner, ImageView noproguardNotificationImg, TextView noproguardPermissionTitle, TextView permissionContent, Group titleArea) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54318a = banner;
        this.f54319b = noproguardNotificationImg;
        this.f54320c = noproguardPermissionTitle;
        this.f54321d = permissionContent;
        this.f54322e = titleArea;
    }

    public static bo b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static bo c(@NonNull View view, @Nullable Object component) {
        return (bo) ViewDataBinding.bind(component, view, R.layout.view_permission_banner);
    }

    @NonNull
    public static bo d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static bo e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static bo g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (bo) ViewDataBinding.inflateInternal(inflater, R.layout.view_permission_banner, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static bo h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (bo) ViewDataBinding.inflateInternal(inflater, R.layout.view_permission_banner, null, false, component);
    }
}
