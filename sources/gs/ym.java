package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ym extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f57655a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Group f57656b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57657c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f57658d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ProgressBar f57659e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57660f;

    /* renamed from: g, reason: collision with root package name */
    @Bindable
    public StudyWikiV2ViewModel f57661g;

    public ym(Object _bindingComponent, View _root, int _localFieldCount, View noproguardBottomBg, Group noproguardBottomGroup, TextView noproguardContinueLearn, ImageView noproguardKill, ProgressBar progress, RecyclerView wikiList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57655a = noproguardBottomBg;
        this.f57656b = noproguardBottomGroup;
        this.f57657c = noproguardContinueLearn;
        this.f57658d = noproguardKill;
        this.f57659e = progress;
        this.f57660f = wikiList;
    }

    public static ym b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ym c(@NonNull View view, @Nullable Object component) {
        return (ym) ViewDataBinding.bind(component, view, R.layout.study_wiki_fragment_v2);
    }

    @NonNull
    public static ym e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ym g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ym h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ym) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_fragment_v2, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ym i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ym) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_fragment_v2, null, false, component);
    }

    @Nullable
    public StudyWikiV2ViewModel d() {
        return this.f57661g;
    }

    public abstract void j(@Nullable StudyWikiV2ViewModel viewmodel);
}
