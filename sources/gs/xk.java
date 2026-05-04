package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.main.view.ControllableViewAnimator;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class xk implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57476a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ControllableViewAnimator f57477b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f57478c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57479d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f57480e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57481f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57482g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f57483h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f57484i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57485j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f57486k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57487l;

    public xk(@NonNull LinearLayout rootView, @NonNull ControllableViewAnimator hintSwitcher, @NonNull ImageView topicDeformationImage, @NonNull TextView topicEtyma, @NonNull ImageView topicImage, @NonNull TextView topicMeanCn, @NonNull TextView topicMeanEn, @NonNull AppCompatTextView topicPhonetic, @NonNull TextView topicSentence, @NonNull LinearLayout topicSentenceHint, @NonNull AppCompatTextView topicWord, @NonNull LinearLayout wordContainer) {
        this.f57476a = rootView;
        this.f57477b = hintSwitcher;
        this.f57478c = topicDeformationImage;
        this.f57479d = topicEtyma;
        this.f57480e = topicImage;
        this.f57481f = topicMeanCn;
        this.f57482g = topicMeanEn;
        this.f57483h = topicPhonetic;
        this.f57484i = topicSentence;
        this.f57485j = topicSentenceHint;
        this.f57486k = topicWord;
        this.f57487l = wordContainer;
    }

    @NonNull
    public static xk a(@NonNull View rootView) {
        int i11 = R.id.hint_switcher;
        ControllableViewAnimator controllableViewAnimator = (ControllableViewAnimator) ViewBindings.findChildViewById(rootView, R.id.hint_switcher);
        if (controllableViewAnimator != null) {
            i11 = R.id.topic_deformation_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.topic_deformation_image);
            if (imageView != null) {
                i11 = R.id.topic_etyma;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_etyma);
                if (textView != null) {
                    i11 = R.id.topic_image;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.topic_image);
                    if (imageView2 != null) {
                        i11 = R.id.topic_mean_cn;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_mean_cn);
                        if (textView2 != null) {
                            i11 = R.id.topic_mean_en;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_mean_en);
                            if (textView3 != null) {
                                i11 = R.id.topic_phonetic;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.topic_phonetic);
                                if (appCompatTextView != null) {
                                    i11 = R.id.topic_sentence;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_sentence);
                                    if (textView4 != null) {
                                        i11 = R.id.topic_sentence_hint;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.topic_sentence_hint);
                                        if (linearLayout != null) {
                                            i11 = R.id.topic_word;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.topic_word);
                                            if (appCompatTextView2 != null) {
                                                i11 = R.id.word_container;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.word_container);
                                                if (linearLayout2 != null) {
                                                    return new xk((LinearLayout) rootView, controllableViewAnimator, imageView, textView, imageView2, textView2, textView3, appCompatTextView, textView4, linearLayout, appCompatTextView2, linearLayout2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static xk c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static xk d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.pattern_pic_to_chin_subject, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f57476a;
    }
}
