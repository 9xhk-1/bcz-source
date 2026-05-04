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
public final class fl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54952a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54953b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecycleableImageView f54954c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecycleableImageView f54955d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f54956e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54957f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f54958g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f54959h;

    public fl(@NonNull RelativeLayout rootView, @NonNull TextView phraseTrainingExample, @NonNull RecycleableImageView phraseTrainingImg0, @NonNull RecycleableImageView phraseTrainingImg1, @NonNull ImageView phraseTrainingSound, @NonNull RelativeLayout phraseTrainingSoundFrame, @NonNull ImageView phraseTrainingTag0, @NonNull ImageView phraseTrainingTag1) {
        this.f54952a = rootView;
        this.f54953b = phraseTrainingExample;
        this.f54954c = phraseTrainingImg0;
        this.f54955d = phraseTrainingImg1;
        this.f54956e = phraseTrainingSound;
        this.f54957f = phraseTrainingSoundFrame;
        this.f54958g = phraseTrainingTag0;
        this.f54959h = phraseTrainingTag1;
    }

    @NonNull
    public static fl a(@NonNull View rootView) {
        int i11 = R.id.phrase_training_example;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_example);
        if (textView != null) {
            i11 = R.id.phrase_training_img_0;
            RecycleableImageView recycleableImageView = (RecycleableImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_img_0);
            if (recycleableImageView != null) {
                i11 = R.id.phrase_training_img_1;
                RecycleableImageView recycleableImageView2 = (RecycleableImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_img_1);
                if (recycleableImageView2 != null) {
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
                                    return new fl((RelativeLayout) rootView, textView, recycleableImageView, recycleableImageView2, imageView, relativeLayout, imageView2, imageView3);
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
    public static fl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static fl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.phrase_training_fragment_59, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f54952a;
    }
}
