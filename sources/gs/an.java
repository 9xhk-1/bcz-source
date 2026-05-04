package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class an extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54203a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54204b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f54205c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54206d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final qn f54207e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f54208f;

    public an(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout item, TextView sentence, ImageView sentenceImg, TextView sentenceTranslate, qn title, ImageView voice) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54203a = item;
        this.f54204b = sentence;
        this.f54205c = sentenceImg;
        this.f54206d = sentenceTranslate;
        this.f54207e = title;
        this.f54208f = voice;
    }

    public static an b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static an c(@NonNull View view, @Nullable Object component) {
        return (an) ViewDataBinding.bind(component, view, R.layout.study_wiki_item_image_sentence);
    }

    @NonNull
    public static an d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static an e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static an g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (an) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_image_sentence, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static an h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (an) ViewDataBinding.inflateInternal(inflater, R.layout.study_wiki_item_image_sentence, null, false, component);
    }
}
