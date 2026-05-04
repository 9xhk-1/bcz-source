package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class rk extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56660a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56661b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Group f56662c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f56663d;

    public rk(Object _bindingComponent, View _root, int _localFieldCount, TextView meanContent, TextView meanType, Group noproguardTitleGroup, RecyclerView sentenceList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56660a = meanContent;
        this.f56661b = meanType;
        this.f56662c = noproguardTitleGroup;
        this.f56663d = sentenceList;
    }

    public static rk b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static rk c(@NonNull View view, @Nullable Object component) {
        return (rk) ViewDataBinding.bind(component, view, R.layout.pager_wiki_sentence_item);
    }

    @NonNull
    public static rk d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static rk e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static rk g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (rk) ViewDataBinding.inflateInternal(inflater, R.layout.pager_wiki_sentence_item, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static rk h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (rk) ViewDataBinding.inflateInternal(inflater, R.layout.pager_wiki_sentence_item, null, false, component);
    }
}
