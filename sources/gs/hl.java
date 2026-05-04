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
public final class hl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55215a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55216b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55217c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55218d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f55219e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55220f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f55221g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f55222h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f55223i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f55224j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f55225k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f55226l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f55227m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f55228n;

    public hl(@NonNull RelativeLayout rootView, @NonNull TextView phraseTrainingExample, @NonNull TextView phraseTrainingMean, @NonNull TextView phraseTrainingNextQ, @NonNull ImageView phraseTrainingSound, @NonNull RelativeLayout phraseTrainingSoundFrame, @NonNull ImageView phraseTrainingTag0, @NonNull ImageView phraseTrainingTag1, @NonNull ImageView phraseTrainingTag2, @NonNull ImageView phraseTrainingTag3, @NonNull TextView phraseTrainingWord0, @NonNull TextView phraseTrainingWord1, @NonNull TextView phraseTrainingWord2, @NonNull TextView phraseTrainingWord3) {
        this.f55215a = rootView;
        this.f55216b = phraseTrainingExample;
        this.f55217c = phraseTrainingMean;
        this.f55218d = phraseTrainingNextQ;
        this.f55219e = phraseTrainingSound;
        this.f55220f = phraseTrainingSoundFrame;
        this.f55221g = phraseTrainingTag0;
        this.f55222h = phraseTrainingTag1;
        this.f55223i = phraseTrainingTag2;
        this.f55224j = phraseTrainingTag3;
        this.f55225k = phraseTrainingWord0;
        this.f55226l = phraseTrainingWord1;
        this.f55227m = phraseTrainingWord2;
        this.f55228n = phraseTrainingWord3;
    }

    @NonNull
    public static hl a(@NonNull View rootView) {
        int i11 = R.id.phrase_training_example;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_example);
        if (textView != null) {
            i11 = R.id.phrase_training_mean;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_mean);
            if (textView2 != null) {
                i11 = R.id.phrase_training_next_q;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_next_q);
                if (textView3 != null) {
                    i11 = R.id.phrase_training_sound;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_sound);
                    if (imageView != null) {
                        i11 = R.id.phrase_training_sound_frame;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.phrase_training_sound_frame);
                        if (relativeLayout != null) {
                            i11 = R.id.phrase_training_tag_0;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_tag_0);
                            if (imageView2 != null) {
                                i11 = R.id.phrase_training_tag_1;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_tag_1);
                                if (imageView3 != null) {
                                    i11 = R.id.phrase_training_tag_2;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_tag_2);
                                    if (imageView4 != null) {
                                        i11 = R.id.phrase_training_tag_3;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_tag_3);
                                        if (imageView5 != null) {
                                            i11 = R.id.phrase_training_word_0;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_0);
                                            if (textView4 != null) {
                                                i11 = R.id.phrase_training_word_1;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_1);
                                                if (textView5 != null) {
                                                    i11 = R.id.phrase_training_word_2;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_2);
                                                    if (textView6 != null) {
                                                        i11 = R.id.phrase_training_word_3;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_3);
                                                        if (textView7 != null) {
                                                            return new hl((RelativeLayout) rootView, textView, textView2, textView3, imageView, relativeLayout, imageView2, imageView3, imageView4, imageView5, textView4, textView5, textView6, textView7);
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
    public static hl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static hl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.phrase_training_fragment_61_68, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55215a;
    }
}
