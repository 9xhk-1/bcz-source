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
import com.airbnb.lottie.LottieAnimationView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class og extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56223a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56224b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f56225c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56226d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f56227e;

    public og(Object _bindingComponent, View _root, int _localFieldCount, TextView sentenceCh, TextView sentenceEn, ImageView sentenceImg, TextView sentenceSource, LottieAnimationView sentenceVoice) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56223a = sentenceCh;
        this.f56224b = sentenceEn;
        this.f56225c = sentenceImg;
        this.f56226d = sentenceSource;
        this.f56227e = sentenceVoice;
    }

    public static og b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static og c(@NonNull View view, @Nullable Object component) {
        return (og) ViewDataBinding.bind(component, view, R.layout.item_wiki_sentence_sub_info);
    }

    @NonNull
    public static og d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static og e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static og g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (og) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_sentence_sub_info, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static og h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (og) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_sentence_sub_info, null, false, component);
    }
}
