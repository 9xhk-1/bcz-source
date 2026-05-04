package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class il implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55342a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55343b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55344c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55345d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55346e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55347f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f55348g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f55349h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55350i;

    public il(@NonNull RelativeLayout rootView, @NonNull TextView phraseTraining62AEndTip, @NonNull TextView phraseTraining62AMiddleMean, @NonNull TextView phraseTraining62AMiddleTip, @NonNull TextView phraseTraining62AWord0, @NonNull TextView phraseTraining62AWord1, @NonNull TextView phraseTraining62AWord2, @NonNull TextView phraseTraining62AWord3, @NonNull TextView phraseTrainingNextQ) {
        this.f55342a = rootView;
        this.f55343b = phraseTraining62AEndTip;
        this.f55344c = phraseTraining62AMiddleMean;
        this.f55345d = phraseTraining62AMiddleTip;
        this.f55346e = phraseTraining62AWord0;
        this.f55347f = phraseTraining62AWord1;
        this.f55348g = phraseTraining62AWord2;
        this.f55349h = phraseTraining62AWord3;
        this.f55350i = phraseTrainingNextQ;
    }

    @NonNull
    public static il a(@NonNull View rootView) {
        int i11 = R.id.phrase_training_62_a_end_tip;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_62_a_end_tip);
        if (textView != null) {
            i11 = R.id.phrase_training_62_a_middle_mean;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_62_a_middle_mean);
            if (textView2 != null) {
                i11 = R.id.phrase_training_62_a_middle_tip;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_62_a_middle_tip);
                if (textView3 != null) {
                    i11 = R.id.phrase_training_62_a_word_0;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_62_a_word_0);
                    if (textView4 != null) {
                        i11 = R.id.phrase_training_62_a_word_1;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_62_a_word_1);
                        if (textView5 != null) {
                            i11 = R.id.phrase_training_62_a_word_2;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_62_a_word_2);
                            if (textView6 != null) {
                                i11 = R.id.phrase_training_62_a_word_3;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_62_a_word_3);
                                if (textView7 != null) {
                                    i11 = R.id.phrase_training_next_q;
                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_next_q);
                                    if (textView8 != null) {
                                        return new il((RelativeLayout) rootView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
    public static il c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static il d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.phrase_training_fragment_62_answer, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55342a;
    }
}
