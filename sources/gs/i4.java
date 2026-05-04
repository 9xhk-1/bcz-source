package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class i4 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f55268a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55269b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55270c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final DatePicker f55271d;

    public i4(Object _bindingComponent, View _root, int _localFieldCount, View background, TextView cancel, TextView confirm, DatePicker picker) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55268a = background;
        this.f55269b = cancel;
        this.f55270c = confirm;
        this.f55271d = picker;
    }

    public static i4 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static i4 c(@NonNull View view, @Nullable Object component) {
        return (i4) ViewDataBinding.bind(component, view, R.layout.bcz_dialog_date_pick_up);
    }

    @NonNull
    public static i4 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static i4 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static i4 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (i4) ViewDataBinding.inflateInternal(inflater, R.layout.bcz_dialog_date_pick_up, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static i4 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (i4) ViewDataBinding.inflateInternal(inflater, R.layout.bcz_dialog_date_pick_up, null, false, component);
    }
}
