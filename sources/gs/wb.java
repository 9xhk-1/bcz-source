package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.wordlistv2.sidebar.IndexSideBar;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class wb extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57308a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f57309b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57310c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final IndexSideBar f57311d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57312e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57313f;

    /* renamed from: g, reason: collision with root package name */
    @Bindable
    public com.baicizhan.main.wordlistv2.t f57314g;

    public wb(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout clEmpty, ImageView emptyImg, RecyclerView rvList, IndexSideBar sideBar, TextView tvDesc, TextView tvTips) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57308a = clEmpty;
        this.f57309b = emptyImg;
        this.f57310c = rvList;
        this.f57311d = sideBar;
        this.f57312e = tvDesc;
        this.f57313f = tvTips;
    }

    public static wb b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static wb c(@NonNull View view, @Nullable Object component) {
        return (wb) ViewDataBinding.bind(component, view, R.layout.fragment_word_list_v2_content);
    }

    @NonNull
    public static wb e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static wb g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static wb h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (wb) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_word_list_v2_content, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static wb i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (wb) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_word_list_v2_content, null, false, component);
    }

    @Nullable
    public com.baicizhan.main.wordlistv2.t d() {
        return this.f57314g;
    }

    public abstract void j(@Nullable com.baicizhan.main.wordlistv2.t vm2);
}
