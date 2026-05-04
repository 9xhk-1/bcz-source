package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ol implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56246a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56247b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f56248c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56249d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56250e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56251f;

    public ol(@NonNull RelativeLayout rootView, @NonNull RelativeLayout phraseTrainingHead, @NonNull ImageView phraseTrainingHome, @NonNull ProgressBar phraseTrainingLoadProgress, @NonNull ProgressBar phraseTrainingProgress, @NonNull FrameLayout phraseTrainingQaContainer) {
        this.f56246a = rootView;
        this.f56247b = phraseTrainingHead;
        this.f56248c = phraseTrainingHome;
        this.f56249d = phraseTrainingLoadProgress;
        this.f56250e = phraseTrainingProgress;
        this.f56251f = phraseTrainingQaContainer;
    }

    @NonNull
    public static ol a(@NonNull View rootView) {
        int i11 = R.id.phrase_training_head;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.phrase_training_head);
        if (relativeLayout != null) {
            i11 = R.id.phrase_training_home;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_home);
            if (imageView != null) {
                i11 = R.id.phrase_training_load_progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.phrase_training_load_progress);
                if (progressBar != null) {
                    i11 = R.id.phrase_training_progress;
                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.phrase_training_progress);
                    if (progressBar2 != null) {
                        i11 = R.id.phrase_training_qa_container;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.phrase_training_qa_container);
                        if (frameLayout != null) {
                            return new ol((RelativeLayout) rootView, relativeLayout, imageView, progressBar, progressBar2, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ol c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ol d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.phrase_training_main, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56246a;
    }
}
