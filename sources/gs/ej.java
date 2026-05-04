package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.baicizhan.client.business.widget.WordTextView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ej implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54796a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54797b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Barrier f54798c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Guideline f54799d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54800e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Barrier f54801f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Guideline f54802g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54803h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f54804i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f54805j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f54806k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f54807l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final WordTextView f54808m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f54809n;

    public ej(@NonNull ConstraintLayout rootView, @NonNull ImageView btnRecord, @NonNull Barrier cnMeaningBarrier, @NonNull Guideline cnMeaningGuideline, @NonNull TextView hintPhonetic, @NonNull Barrier hintPhoneticBarrier, @NonNull Guideline hintPhoneticGuideline, @NonNull TextView hintWord, @NonNull TextView nextBtn, @NonNull LottieAnimationView recordAnim, @NonNull TextView recordTip, @NonNull TextView tip, @NonNull WordTextView word, @NonNull TextView wordMeaning) {
        this.f54796a = rootView;
        this.f54797b = btnRecord;
        this.f54798c = cnMeaningBarrier;
        this.f54799d = cnMeaningGuideline;
        this.f54800e = hintPhonetic;
        this.f54801f = hintPhoneticBarrier;
        this.f54802g = hintPhoneticGuideline;
        this.f54803h = hintWord;
        this.f54804i = nextBtn;
        this.f54805j = recordAnim;
        this.f54806k = recordTip;
        this.f54807l = tip;
        this.f54808m = word;
        this.f54809n = wordMeaning;
    }

    @NonNull
    public static ej a(@NonNull View rootView) {
        int i11 = R.id.btn_record;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.btn_record);
        if (imageView != null) {
            i11 = R.id.cn_meaning_barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(rootView, R.id.cn_meaning_barrier);
            if (barrier != null) {
                i11 = R.id.cn_meaning_guideline;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.cn_meaning_guideline);
                if (guideline != null) {
                    i11 = R.id.hint_phonetic;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.hint_phonetic);
                    if (textView != null) {
                        i11 = R.id.hint_phonetic_barrier;
                        Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(rootView, R.id.hint_phonetic_barrier);
                        if (barrier2 != null) {
                            i11 = R.id.hint_phonetic_guideline;
                            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(rootView, R.id.hint_phonetic_guideline);
                            if (guideline2 != null) {
                                i11 = R.id.hint_word;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.hint_word);
                                if (textView2 != null) {
                                    i11 = R.id.next_btn;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.next_btn);
                                    if (textView3 != null) {
                                        i11 = R.id.record_anim;
                                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, R.id.record_anim);
                                        if (lottieAnimationView != null) {
                                            i11 = R.id.record_tip;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.record_tip);
                                            if (textView4 != null) {
                                                i11 = R.id.tip;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tip);
                                                if (textView5 != null) {
                                                    i11 = R.id.word;
                                                    WordTextView wordTextView = (WordTextView) ViewBindings.findChildViewById(rootView, R.id.word);
                                                    if (wordTextView != null) {
                                                        i11 = R.id.word_meaning;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.word_meaning);
                                                        if (textView6 != null) {
                                                            return new ej((ConstraintLayout) rootView, imageView, barrier, guideline, textView, barrier2, guideline2, textView2, textView3, lottieAnimationView, textView4, textView5, wordTextView, textView6);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ej c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ej d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_word_reading_fragment, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f54796a;
    }
}
