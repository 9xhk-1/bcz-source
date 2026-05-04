package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ng implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56065a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56066b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56067c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56068d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f56069e;

    public ng(@NonNull RelativeLayout rootView, @NonNull ImageView illustration, @NonNull TextView sentence, @NonNull TextView translation, @NonNull LottieAnimationView voice) {
        this.f56065a = rootView;
        this.f56066b = illustration;
        this.f56067c = sentence;
        this.f56068d = translation;
        this.f56069e = voice;
    }

    @NonNull
    public static ng a(@NonNull View rootView) {
        int i11 = R.id.illustration;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.illustration);
        if (imageView != null) {
            i11 = R.id.sentence;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sentence);
            if (textView != null) {
                i11 = R.id.translation;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.translation);
                if (textView2 != null) {
                    i11 = R.id.voice;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, R.id.voice);
                    if (lottieAnimationView != null) {
                        return new ng((RelativeLayout) rootView, imageView, textView, textView2, lottieAnimationView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ng c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ng d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_wiki_sentence_illustration, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56065a;
    }
}
