package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.jiongji.andriod.card.R;
import com.wefika.flowlayout.FlowLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class wi implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57336a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57337b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f57338c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f57339d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Barrier f57340e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57341f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57342g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f57343h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Space f57344i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final FlowLayout f57345j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f57346k;

    public wi(@NonNull ConstraintLayout rootView, @NonNull TextView accentUsa, @NonNull LottieAnimationView accentVoiceUsa, @NonNull ImageView collect, @NonNull Barrier examsBarrier, @NonNull TextView examsDesc, @NonNull LinearLayout noproguardMeaningsContainer, @NonNull TextView noproguardWordComparative, @NonNull Space noproguardWordComparativeBottomPadding, @NonNull FlowLayout phoneticsContainer, @NonNull AppCompatTextView word) {
        this.f57336a = rootView;
        this.f57337b = accentUsa;
        this.f57338c = accentVoiceUsa;
        this.f57339d = collect;
        this.f57340e = examsBarrier;
        this.f57341f = examsDesc;
        this.f57342g = noproguardMeaningsContainer;
        this.f57343h = noproguardWordComparative;
        this.f57344i = noproguardWordComparativeBottomPadding;
        this.f57345j = phoneticsContainer;
        this.f57346k = word;
    }

    @NonNull
    public static wi a(@NonNull View rootView) {
        int i11 = R.id.accent_usa;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.accent_usa);
        if (textView != null) {
            i11 = R.id.accent_voice_usa;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, R.id.accent_voice_usa);
            if (lottieAnimationView != null) {
                i11 = R.id.collect;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.collect);
                if (imageView != null) {
                    i11 = R.id.exams_barrier;
                    Barrier barrier = (Barrier) ViewBindings.findChildViewById(rootView, R.id.exams_barrier);
                    if (barrier != null) {
                        i11 = R.id.exams_desc;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exams_desc);
                        if (textView2 != null) {
                            i11 = R.id.noproguard_meanings_container;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.noproguard_meanings_container);
                            if (linearLayout != null) {
                                i11 = R.id.noproguard_word_comparative;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.noproguard_word_comparative);
                                if (textView3 != null) {
                                    i11 = R.id.noproguard_word_comparative_bottom_padding;
                                    Space space = (Space) ViewBindings.findChildViewById(rootView, R.id.noproguard_word_comparative_bottom_padding);
                                    if (space != null) {
                                        i11 = R.id.phonetics_container;
                                        FlowLayout flowLayout = (FlowLayout) ViewBindings.findChildViewById(rootView, R.id.phonetics_container);
                                        if (flowLayout != null) {
                                            i11 = R.id.word;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.word);
                                            if (appCompatTextView != null) {
                                                return new wi((ConstraintLayout) rootView, textView, lottieAnimationView, imageView, barrier, textView2, linearLayout, textView3, space, flowLayout, appCompatTextView);
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
    public static wi c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static wi d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_wiki_item_basic_word, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f57336a;
    }
}
