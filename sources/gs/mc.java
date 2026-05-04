package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class mc extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f55888a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55889b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final EditText f55890c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f55891d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55892e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f55893f;

    public mc(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, FrameLayout searchBar, EditText searchBox, ImageView searchClear, RelativeLayout searchFrame, ImageView searchSmallLens) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55888a = actionBar;
        this.f55889b = searchBar;
        this.f55890c = searchBox;
        this.f55891d = searchClear;
        this.f55892e = searchFrame;
        this.f55893f = searchSmallLens;
    }

    public static mc b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static mc c(@NonNull View view, @Nullable Object component) {
        return (mc) ViewDataBinding.bind(component, view, R.layout.friend_search_activity_portrait);
    }

    @NonNull
    public static mc d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static mc e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static mc g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (mc) ViewDataBinding.inflateInternal(inflater, R.layout.friend_search_activity_portrait, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static mc h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (mc) ViewDataBinding.inflateInternal(inflater, R.layout.friend_search_activity_portrait, null, false, component);
    }
}
