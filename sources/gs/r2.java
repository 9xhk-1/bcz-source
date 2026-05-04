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
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class r2 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f56563a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f56564b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56565c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56566d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56567e;

    public r2(Object _bindingComponent, View _root, int _localFieldCount, ImageView back, RecyclerView grades, TextView skip, TextView title, TextView titleTip) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56563a = back;
        this.f56564b = grades;
        this.f56565c = skip;
        this.f56566d = title;
        this.f56567e = titleTip;
    }

    public static r2 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static r2 c(@NonNull View view, @Nullable Object component) {
        return (r2) ViewDataBinding.bind(component, view, R.layout.activity_user_grade);
    }

    @NonNull
    public static r2 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static r2 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static r2 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (r2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_user_grade, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static r2 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (r2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_user_grade, null, false, component);
    }
}
