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
public final class gl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55092a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecycleableImageView f55093b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f55094c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55095d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f55096e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f55097f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f55098g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f55099h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55100i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f55101j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f55102k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f55103l;

    public gl(@NonNull RelativeLayout rootView, @NonNull RecycleableImageView phraseTrainingImage, @NonNull ImageView phraseTrainingSound, @NonNull RelativeLayout phraseTrainingSoundFrame, @NonNull ImageView phraseTrainingTag0, @NonNull ImageView phraseTrainingTag1, @NonNull ImageView phraseTrainingTag2, @NonNull ImageView phraseTrainingTag3, @NonNull TextView phraseTrainingWord0, @NonNull TextView phraseTrainingWord1, @NonNull TextView phraseTrainingWord2, @NonNull TextView phraseTrainingWord3) {
        this.f55092a = rootView;
        this.f55093b = phraseTrainingImage;
        this.f55094c = phraseTrainingSound;
        this.f55095d = phraseTrainingSoundFrame;
        this.f55096e = phraseTrainingTag0;
        this.f55097f = phraseTrainingTag1;
        this.f55098g = phraseTrainingTag2;
        this.f55099h = phraseTrainingTag3;
        this.f55100i = phraseTrainingWord0;
        this.f55101j = phraseTrainingWord1;
        this.f55102k = phraseTrainingWord2;
        this.f55103l = phraseTrainingWord3;
    }

    @NonNull
    public static gl a(@NonNull View rootView) {
        int i11 = R.id.phrase_training_image;
        RecycleableImageView recycleableImageView = (RecycleableImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_image);
        if (recycleableImageView != null) {
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
                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_0);
                                    if (textView != null) {
                                        i11 = R.id.phrase_training_word_1;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_1);
                                        if (textView2 != null) {
                                            i11 = R.id.phrase_training_word_2;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_2);
                                            if (textView3 != null) {
                                                i11 = R.id.phrase_training_word_3;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_3);
                                                if (textView4 != null) {
                                                    return new gl((RelativeLayout) rootView, recycleableImageView, imageView, relativeLayout, imageView2, imageView3, imageView4, imageView5, textView, textView2, textView3, textView4);
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
    public static gl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static gl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.phrase_training_fragment_60_64, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55092a;
    }
}
