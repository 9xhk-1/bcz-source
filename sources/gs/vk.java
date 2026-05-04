package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class vk implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57203a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewAnimator f57204b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f57205c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57206d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57207e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57208f;

    public vk(@NonNull RelativeLayout rootView, @NonNull ViewAnimator hintSwitcher, @NonNull ImageView topicImage, @NonNull TextView topicSentence, @NonNull LinearLayout topicSentenceHint, @NonNull TextView topicWordMeanCn) {
        this.f57203a = rootView;
        this.f57204b = hintSwitcher;
        this.f57205c = topicImage;
        this.f57206d = topicSentence;
        this.f57207e = topicSentenceHint;
        this.f57208f = topicWordMeanCn;
    }

    @NonNull
    public static vk a(@NonNull View rootView) {
        int i11 = R.id.hint_switcher;
        ViewAnimator viewAnimator = (ViewAnimator) ViewBindings.findChildViewById(rootView, R.id.hint_switcher);
        if (viewAnimator != null) {
            i11 = R.id.topic_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.topic_image);
            if (imageView != null) {
                i11 = R.id.topic_sentence;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_sentence);
                if (textView != null) {
                    i11 = R.id.topic_sentence_hint;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.topic_sentence_hint);
                    if (linearLayout != null) {
                        i11 = R.id.topic_word_mean_cn;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_word_mean_cn);
                        if (textView2 != null) {
                            return new vk((RelativeLayout) rootView, viewAnimator, imageView, textView, linearLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static vk c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static vk d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.pattern_mean_to_word_subject, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f57203a;
    }
}
