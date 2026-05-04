package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;
import com.wefika.flowlayout.FlowLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class kn extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55650a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FlowLayout f55651b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f55652c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55653d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55654e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f55655f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55656g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f55657h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f55658i;

    public kn(Object _bindingComponent, View _root, int _localFieldCount, TextView accent, FlowLayout accentContainer, ImageView accentVoice, TextView cnmean, FrameLayout collect, ImageView collectIcon, ConstraintLayout item, TextView variant, AppCompatTextView word) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55650a = accent;
        this.f55651b = accentContainer;
        this.f55652c = accentVoice;
        this.f55653d = cnmean;
        this.f55654e = collect;
        this.f55655f = collectIcon;
        this.f55656g = item;
        this.f55657h = variant;
        this.f55658i = word;
    }

    public static kn b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static kn c(@NonNull View view, @Nullable Object component) {
        return (kn) ViewDataBinding.bind(component, view, R.layout.study_wiki_item_word_topic);
    }

    @NonNull
    public static kn d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static kn e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static kn g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (kn) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_word_topic, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static kn h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (kn) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_word_topic, null, false, component);
    }
}
