package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.view.RotatingImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class q1 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f56430a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f56431b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RotatingImageView f56432c;

    public q1(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, RecyclerView phraseGroupGrid, RotatingImageView phraseGroupLoadProgress) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56430a = actionBar;
        this.f56431b = phraseGroupGrid;
        this.f56432c = phraseGroupLoadProgress;
    }

    public static q1 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static q1 c(@NonNull View view, @Nullable Object component) {
        return (q1) ViewDataBinding.bind(component, view, R.layout.activity_phrase_training_group_portrait);
    }

    @NonNull
    public static q1 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static q1 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static q1 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (q1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_phrase_training_group_portrait, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static q1 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (q1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_phrase_training_group_portrait, null, false, component);
    }
}
