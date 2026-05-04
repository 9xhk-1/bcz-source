package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ug extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f57010a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f57011b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57012c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57013d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f57014e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f57015f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57016g;

    public ug(Object _bindingComponent, View _root, int _localFieldCount, TextView examText, ImageView imgCollect, TextView phonetic, LinearLayout splitTextLayout, LottieAnimationView voiceImg, AppCompatTextView word, FrameLayout wordLayout) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57010a = examText;
        this.f57011b = imgCollect;
        this.f57012c = phonetic;
        this.f57013d = splitTextLayout;
        this.f57014e = voiceImg;
        this.f57015f = word;
        this.f57016g = wordLayout;
    }

    public static ug b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ug c(@NonNull View view, @Nullable Object component) {
        return (ug) ViewDataBinding.bind(component, view, R.layout.item_wiki_word_info);
    }

    @NonNull
    public static ug d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ug e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ug g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ug) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_word_info, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ug h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ug) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_word_info, null, false, component);
    }
}
