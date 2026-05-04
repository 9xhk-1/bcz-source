package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;
import com.wefika.flowlayout.FlowLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class mn extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55944a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FlowLayout f55945b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f55946c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55947d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55948e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f55949f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55950g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f55951h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55952i;

    public mn(Object _bindingComponent, View _root, int _localFieldCount, TextView accent, FlowLayout accentContainer, ImageView accentVoice, TextView cnmean, FrameLayout collect, ImageView collectIcon, ConstraintLayout item, TextView variant, TextView word) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55944a = accent;
        this.f55945b = accentContainer;
        this.f55946c = accentVoice;
        this.f55947d = cnmean;
        this.f55948e = collect;
        this.f55949f = collectIcon;
        this.f55950g = item;
        this.f55951h = variant;
        this.f55952i = word;
    }

    public static mn b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static mn c(@NonNull View view, @Nullable Object component) {
        return (mn) ViewDataBinding.bind(component, view, R.layout.study_wiki_item_word_topic_mipad);
    }

    @NonNull
    public static mn d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static mn e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static mn g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (mn) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_word_topic_mipad, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static mn h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (mn) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_word_topic_mipad, null, false, component);
    }
}
