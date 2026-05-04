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
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class cf extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f54453a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54454b;

    public cf(Object _bindingComponent, View _root, int _localFieldCount, TextView identityName, ImageView imgGradeSelected) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54453a = identityName;
        this.f54454b = imgGradeSelected;
    }

    public static cf b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static cf c(@NonNull View view, @Nullable Object component) {
        return (cf) ViewDataBinding.bind(component, view, R.layout.item_user_grade);
    }

    @NonNull
    public static cf d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static cf e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static cf g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (cf) ViewDataBinding.inflateInternal(inflater, R.layout.item_user_grade, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static cf h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (cf) ViewDataBinding.inflateInternal(inflater, R.layout.item_user_grade, null, false, component);
    }
}
