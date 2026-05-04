package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class al implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54191a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ControllableViewAnimator f54192b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54193c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54194d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54195e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f54196f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54197g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f54198h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54199i;

    public al(@NonNull LinearLayout rootView, @NonNull ControllableViewAnimator hintSwitcher, @NonNull TextView topicEtyma, @NonNull TextView topicMeanCn, @NonNull TextView topicMeanEn, @NonNull AppCompatTextView topicPhonetic, @NonNull TextView topicSentence, @NonNull AppCompatTextView topicWord, @NonNull LinearLayout wordTpPicSubject) {
        this.f54191a = rootView;
        this.f54192b = hintSwitcher;
        this.f54193c = topicEtyma;
        this.f54194d = topicMeanCn;
        this.f54195e = topicMeanEn;
        this.f54196f = topicPhonetic;
        this.f54197g = topicSentence;
        this.f54198h = topicWord;
        this.f54199i = wordTpPicSubject;
    }

    @NonNull
    public static al a(@NonNull View rootView) {
        int i11 = R.id.hint_switcher;
        ControllableViewAnimator controllableViewAnimator = (ControllableViewAnimator) ViewBindings.findChildViewById(rootView, R.id.hint_switcher);
        if (controllableViewAnimator != null) {
            i11 = R.id.topic_etyma;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_etyma);
            if (textView != null) {
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
                                i11 = R.id.topic_word;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.topic_word);
                                if (appCompatTextView2 != null) {
                                    LinearLayout linearLayout = (LinearLayout) rootView;
                                    return new al(linearLayout, controllableViewAnimator, textView, textView2, textView3, appCompatTextView, textView4, appCompatTextView2, linearLayout);
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
    public static al c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static al d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.pattern_word_to_pic_subject, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f54191a;
    }
}
