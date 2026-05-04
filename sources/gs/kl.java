package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
public final class kl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55634a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecycleableImageView f55635b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecycleableImageView f55636c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecycleableImageView f55637d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55638e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f55639f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Button f55640g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Button f55641h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55642i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f55643j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f55644k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f55645l;

    public kl(@NonNull RelativeLayout rootView, @NonNull RecycleableImageView phraseTrainingImage0, @NonNull RecycleableImageView phraseTrainingImage1, @NonNull RecycleableImageView phraseTrainingImage2, @NonNull TextView phraseTrainingNextQ, @NonNull Button phraseTrainingSelect0, @NonNull Button phraseTrainingSelect1, @NonNull Button phraseTrainingSelect2, @NonNull TextView phraseTrainingSelectWordTip, @NonNull TextView phraseTrainingWord0, @NonNull TextView phraseTrainingWord1, @NonNull TextView phraseTrainingWord2) {
        this.f55634a = rootView;
        this.f55635b = phraseTrainingImage0;
        this.f55636c = phraseTrainingImage1;
        this.f55637d = phraseTrainingImage2;
        this.f55638e = phraseTrainingNextQ;
        this.f55639f = phraseTrainingSelect0;
        this.f55640g = phraseTrainingSelect1;
        this.f55641h = phraseTrainingSelect2;
        this.f55642i = phraseTrainingSelectWordTip;
        this.f55643j = phraseTrainingWord0;
        this.f55644k = phraseTrainingWord1;
        this.f55645l = phraseTrainingWord2;
    }

    @NonNull
    public static kl a(@NonNull View rootView) {
        int i11 = R.id.phrase_training_image_0;
        RecycleableImageView recycleableImageView = (RecycleableImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_image_0);
        if (recycleableImageView != null) {
            i11 = R.id.phrase_training_image_1;
            RecycleableImageView recycleableImageView2 = (RecycleableImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_image_1);
            if (recycleableImageView2 != null) {
                i11 = R.id.phrase_training_image_2;
                RecycleableImageView recycleableImageView3 = (RecycleableImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_image_2);
                if (recycleableImageView3 != null) {
                    i11 = R.id.phrase_training_next_q;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_next_q);
                    if (textView != null) {
                        i11 = R.id.phrase_training_select_0;
                        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.phrase_training_select_0);
                        if (button != null) {
                            i11 = R.id.phrase_training_select_1;
                            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.phrase_training_select_1);
                            if (button2 != null) {
                                i11 = R.id.phrase_training_select_2;
                                Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.phrase_training_select_2);
                                if (button3 != null) {
                                    i11 = R.id.phrase_training_select_word_tip;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_select_word_tip);
                                    if (textView2 != null) {
                                        i11 = R.id.phrase_training_word_0;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_0);
                                        if (textView3 != null) {
                                            i11 = R.id.phrase_training_word_1;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_1);
                                            if (textView4 != null) {
                                                i11 = R.id.phrase_training_word_2;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_2);
                                                if (textView5 != null) {
                                                    return new kl((RelativeLayout) rootView, recycleableImageView, recycleableImageView2, recycleableImageView3, textView, button, button2, button3, textView2, textView3, textView4, textView5);
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
    public static kl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static kl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.phrase_training_fragment_65, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55634a;
    }
}
