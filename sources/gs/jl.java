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
public final class jl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55537a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55538b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55539c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55540d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55541e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55542f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f55543g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f55544h;

    public jl(@NonNull RelativeLayout rootView, @NonNull TextView phraseTraining62QEndTip, @NonNull TextView phraseTraining62QStartTip, @NonNull TextView phraseTraining62QWord0, @NonNull TextView phraseTraining62QWord1, @NonNull TextView phraseTraining62QWord2, @NonNull TextView phraseTraining62QWord3, @NonNull TextView phraseTrainingNextQ) {
        this.f55537a = rootView;
        this.f55538b = phraseTraining62QEndTip;
        this.f55539c = phraseTraining62QStartTip;
        this.f55540d = phraseTraining62QWord0;
        this.f55541e = phraseTraining62QWord1;
        this.f55542f = phraseTraining62QWord2;
        this.f55543g = phraseTraining62QWord3;
        this.f55544h = phraseTrainingNextQ;
    }

    @NonNull
    public static jl a(@NonNull View rootView) {
        int i11 = R.id.phrase_training_62_q_end_tip;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_62_q_end_tip);
        if (textView != null) {
            i11 = R.id.phrase_training_62_q_start_tip;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_62_q_start_tip);
            if (textView2 != null) {
                i11 = R.id.phrase_training_62_q_word_0;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_62_q_word_0);
                if (textView3 != null) {
                    i11 = R.id.phrase_training_62_q_word_1;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_62_q_word_1);
                    if (textView4 != null) {
                        i11 = R.id.phrase_training_62_q_word_2;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_62_q_word_2);
                        if (textView5 != null) {
                            i11 = R.id.phrase_training_62_q_word_3;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_62_q_word_3);
                            if (textView6 != null) {
                                i11 = R.id.phrase_training_next_q;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_next_q);
                                if (textView7 != null) {
                                    return new jl((RelativeLayout) rootView, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
    public static jl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static jl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.phrase_training_fragment_62_question, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55537a;
    }
}
