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
import com.baicizhan.client.business.widget.RecycleableImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ll implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55789a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55790b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecycleableImageView f55791c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55792d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55793e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f55794f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55795g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f55796h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55797i;

    public ll(@NonNull RelativeLayout rootView, @NonNull TextView phraseTrainingExample, @NonNull RecycleableImageView phraseTrainingImage, @NonNull TextView phraseTrainingMean, @NonNull TextView phraseTrainingNextQ, @NonNull ImageView phraseTrainingSound, @NonNull RelativeLayout phraseTrainingSoundFrame, @NonNull TextView phraseTrainingTestFrom, @NonNull TextView phraseTrainingWord) {
        this.f55789a = rootView;
        this.f55790b = phraseTrainingExample;
        this.f55791c = phraseTrainingImage;
        this.f55792d = phraseTrainingMean;
        this.f55793e = phraseTrainingNextQ;
        this.f55794f = phraseTrainingSound;
        this.f55795g = phraseTrainingSoundFrame;
        this.f55796h = phraseTrainingTestFrom;
        this.f55797i = phraseTrainingWord;
    }

    @NonNull
    public static ll a(@NonNull View rootView) {
        int i11 = R.id.phrase_training_example;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_example);
        if (textView != null) {
            i11 = R.id.phrase_training_image;
            RecycleableImageView recycleableImageView = (RecycleableImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_image);
            if (recycleableImageView != null) {
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
                                i11 = R.id.phrase_training_test_from;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_test_from);
                                if (textView4 != null) {
                                    i11 = R.id.phrase_training_word;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word);
                                    if (textView5 != null) {
                                        return new ll((RelativeLayout) rootView, textView, recycleableImageView, textView2, textView3, imageView, relativeLayout, textView4, textView5);
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
    public static ll c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ll d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.phrase_training_fragment_66, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55789a;
    }
}
