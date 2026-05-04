package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a8 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f54151a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f54152b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54153c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final EditText f54154d;

    /* renamed from: e, reason: collision with root package name */
    @Bindable
    public kf.p f54155e;

    public a8(Object _bindingComponent, View _root, int _localFieldCount, View divider, RecyclerView lists, TextView route, EditText search) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54151a = divider;
        this.f54152b = lists;
        this.f54153c = route;
        this.f54154d = search;
    }

    public static a8 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static a8 c(@NonNull View view, @Nullable Object component) {
        return (a8) ViewDataBinding.bind(component, view, R.layout.fragment_category_pick_up_school);
    }

    @NonNull
    public static a8 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static a8 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static a8 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (a8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_category_pick_up_school, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static a8 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (a8) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_category_pick_up_school, null, false, component);
    }

    @Nullable
    public kf.p d() {
        return this.f54155e;
    }

    public abstract void j(@Nullable kf.p viewmodel);
}
