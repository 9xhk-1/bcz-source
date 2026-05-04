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
public final class ml implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55929a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecycleableImageView f55930b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecycleableImageView f55931c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecycleableImageView f55932d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final RecycleableImageView f55933e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f55934f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55935g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f55936h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f55937i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f55938j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f55939k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f55940l;

    public ml(@NonNull RelativeLayout rootView, @NonNull RecycleableImageView phraseTrainingImg0, @NonNull RecycleableImageView phraseTrainingImg1, @NonNull RecycleableImageView phraseTrainingImg2, @NonNull RecycleableImageView phraseTrainingImg3, @NonNull ImageView phraseTrainingSound, @NonNull RelativeLayout phraseTrainingSoundFrame, @NonNull ImageView phraseTrainingTag0, @NonNull ImageView phraseTrainingTag1, @NonNull ImageView phraseTrainingTag2, @NonNull ImageView phraseTrainingTag3, @NonNull TextView phraseTrainingWord) {
        this.f55929a = rootView;
        this.f55930b = phraseTrainingImg0;
        this.f55931c = phraseTrainingImg1;
        this.f55932d = phraseTrainingImg2;
        this.f55933e = phraseTrainingImg3;
        this.f55934f = phraseTrainingSound;
        this.f55935g = phraseTrainingSoundFrame;
        this.f55936h = phraseTrainingTag0;
        this.f55937i = phraseTrainingTag1;
        this.f55938j = phraseTrainingTag2;
        this.f55939k = phraseTrainingTag3;
        this.f55940l = phraseTrainingWord;
    }

    @NonNull
    public static ml a(@NonNull View rootView) {
        int i11 = R.id.phrase_training_img_0;
        RecycleableImageView recycleableImageView = (RecycleableImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_img_0);
        if (recycleableImageView != null) {
            i11 = R.id.phrase_training_img_1;
            RecycleableImageView recycleableImageView2 = (RecycleableImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_img_1);
            if (recycleableImageView2 != null) {
                i11 = R.id.phrase_training_img_2;
                RecycleableImageView recycleableImageView3 = (RecycleableImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_img_2);
                if (recycleableImageView3 != null) {
                    i11 = R.id.phrase_training_img_3;
                    RecycleableImageView recycleableImageView4 = (RecycleableImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_img_3);
                    if (recycleableImageView4 != null) {
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
                                                i11 = R.id.phrase_training_word;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word);
                                                if (textView != null) {
                                                    return new ml((RelativeLayout) rootView, recycleableImageView, recycleableImageView2, recycleableImageView3, recycleableImageView4, imageView, relativeLayout, imageView2, imageView3, imageView4, imageView5, textView);
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
    public static ml c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ml d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.phrase_training_fragment_67, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55929a;
    }
}
