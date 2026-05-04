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
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class rb implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56629a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56630b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56631c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56632d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56633e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56634f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f56635g;

    public rb(@NonNull RelativeLayout rootView, @NonNull ImageView accentVoice, @NonNull TextView topicMeanCn, @NonNull TextView topicPhonetic, @NonNull TextView topicSentence, @NonNull TextView topicSentenceMeanCn, @NonNull TextView topicWord) {
        this.f56629a = rootView;
        this.f56630b = accentVoice;
        this.f56631c = topicMeanCn;
        this.f56632d = topicPhonetic;
        this.f56633e = topicSentence;
        this.f56634f = topicSentenceMeanCn;
        this.f56635g = topicWord;
    }

    @NonNull
    public static rb a(@NonNull View rootView) {
        int i11 = R.id.accent_voice;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.accent_voice);
        if (imageView != null) {
            i11 = R.id.topic_mean_cn;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_mean_cn);
            if (textView != null) {
                i11 = R.id.topic_phonetic;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_phonetic);
                if (textView2 != null) {
                    i11 = R.id.topic_sentence;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_sentence);
                    if (textView3 != null) {
                        i11 = R.id.topic_sentence_mean_cn;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_sentence_mean_cn);
                        if (textView4 != null) {
                            i11 = R.id.topic_word;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.topic_word);
                            if (textView5 != null) {
                                return new rb((RelativeLayout) rootView, imageView, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static rb c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static rb d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_wiki_diff_topic_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56629a;
    }
}
