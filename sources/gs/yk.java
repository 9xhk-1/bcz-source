package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.main.view.ControllableViewAnimator;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class yk implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57625a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f57626b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ControllableViewAnimator f57627c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57628d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57629e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57630f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57631g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f57632h;

    public yk(@NonNull LinearLayout rootView, @NonNull View dividerMid, @NonNull ControllableViewAnimator hintSwitcher, @NonNull TextView sentenceTestFrequency, @NonNull TextView topicMeanCn, @NonNull TextView topicMeanEn, @NonNull TextView topicSentence, @NonNull TextView topicSentenceTranslate) {
        this.f57625a = rootView;
        this.f57626b = dividerMid;
        this.f57627c = hintSwitcher;
        this.f57628d = sentenceTestFrequency;
        this.f57629e = topicMeanCn;
        this.f57630f = topicMeanEn;
        this.f57631g = topicSentence;
        this.f57632h = topicSentenceTranslate;
    }

    @NonNull
    public static yk a(@NonNull View rootView) {
        int i11 = R.id.divider_mid;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider_mid);
        if (findChildViewById != null) {
            i11 = R.id.hint_switcher;
            ControllableViewAnimator controllableViewAnimator = (ControllableViewAnimator) ViewBindings.findChildViewById(rootView, R.id.hint_switcher);
            if (controllableViewAnimator != null) {
                i11 = R.id.sentence_test_frequency;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sentence_test_frequency);
                if (textView != null) {
                    i11 = R.id.topic_mean_cn;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_mean_cn);
                    if (textView2 != null) {
                        i11 = R.id.topic_mean_en;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_mean_en);
                        if (textView3 != null) {
                            i11 = R.id.topic_sentence;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_sentence);
                            if (textView4 != null) {
                                i11 = R.id.topic_sentence_translate;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_sentence_translate);
                                if (textView5 != null) {
                                    return new yk((LinearLayout) rootView, findChildViewById, controllableViewAnimator, textView, textView2, textView3, textView4, textView5);
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
    public static yk c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static yk d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.pattern_sen_to_pic_subject, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f57625a;
    }
}
