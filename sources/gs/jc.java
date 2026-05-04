package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class jc extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f55485a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55486b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f55487c;

    public jc(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, TextView emptyView, RecyclerView notifications) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55485a = actionBar;
        this.f55486b = emptyView;
        this.f55487c = notifications;
    }

    public static jc b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static jc c(@NonNull View view, @Nullable Object component) {
        return (jc) ViewDataBinding.bind(component, view, R.layout.friend_notification_activity_portrait);
    }

    @NonNull
    public static jc d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static jc e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static jc g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (jc) ViewDataBinding.inflateInternal(inflater, R.layout.friend_notification_activity_portrait, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static jc h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (jc) ViewDataBinding.inflateInternal(inflater, R.layout.friend_notification_activity_portrait, null, false, component);
    }
}
