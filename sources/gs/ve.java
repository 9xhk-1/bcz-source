package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ve extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f57169a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57170b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f57171c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57172d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57173e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f57174f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57175g;

    public ve(Object _bindingComponent, View _root, int _localFieldCount, TextView sentenceCh, TextView sentenceEn, ImageView sentenceImg, TextView sentenceSource, LinearLayout sentenceTagsContainer, LottieAnimationView sentenceVoice, LinearLayout tagSourceContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57169a = sentenceCh;
        this.f57170b = sentenceEn;
        this.f57171c = sentenceImg;
        this.f57172d = sentenceSource;
        this.f57173e = sentenceTagsContainer;
        this.f57174f = sentenceVoice;
        this.f57175g = tagSourceContainer;
    }

    public static ve b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ve c(@NonNull View view, @Nullable Object component) {
        return (ve) ViewDataBinding.bind(component, view, R.layout.item_scene_wiki_sentence_info);
    }

    @NonNull
    public static ve d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ve e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ve g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ve) ViewDataBinding.inflateInternal(inflater, R.layout.item_scene_wiki_sentence_info, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ve h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ve) ViewDataBinding.inflateInternal(inflater, R.layout.item_scene_wiki_sentence_info, null, false, component);
    }
}
