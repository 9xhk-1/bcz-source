package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.view.QuizStateProgressBar;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class wl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57354a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57355b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final QuizStateProgressBar f57356c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57357d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Button f57358e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f57359f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ProgressBar f57360g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57361h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Button f57362i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57363j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57364k;

    public wl(@NonNull RelativeLayout rootView, @NonNull FrameLayout plusereviewMatchQaContainer, @NonNull QuizStateProgressBar plusereviewMatchQsp, @NonNull LinearLayout plusreviewMatchBottom, @NonNull Button plusreviewMatchContinue, @NonNull ImageView plusreviewMatchHome, @NonNull ProgressBar plusreviewMatchProgress, @NonNull FrameLayout plusreviewMatchProgressLayout, @NonNull Button plusreviewMatchToWiki, @NonNull RelativeLayout plusreviewMatchTop, @NonNull FrameLayout plusreviewMatchWikiContainer) {
        this.f57354a = rootView;
        this.f57355b = plusereviewMatchQaContainer;
        this.f57356c = plusereviewMatchQsp;
        this.f57357d = plusreviewMatchBottom;
        this.f57358e = plusreviewMatchContinue;
        this.f57359f = plusreviewMatchHome;
        this.f57360g = plusreviewMatchProgress;
        this.f57361h = plusreviewMatchProgressLayout;
        this.f57362i = plusreviewMatchToWiki;
        this.f57363j = plusreviewMatchTop;
        this.f57364k = plusreviewMatchWikiContainer;
    }

    @NonNull
    public static wl a(@NonNull View rootView) {
        int i11 = R.id.plusereview_match_qa_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.plusereview_match_qa_container);
        if (frameLayout != null) {
            i11 = R.id.plusereview_match_qsp;
            QuizStateProgressBar quizStateProgressBar = (QuizStateProgressBar) ViewBindings.findChildViewById(rootView, R.id.plusereview_match_qsp);
            if (quizStateProgressBar != null) {
                i11 = R.id.plusreview_match_bottom;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_bottom);
                if (linearLayout != null) {
                    i11 = R.id.plusreview_match_continue;
                    Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_continue);
                    if (button != null) {
                        i11 = R.id.plusreview_match_home;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_home);
                        if (imageView != null) {
                            i11 = R.id.plusreview_match_progress;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_progress);
                            if (progressBar != null) {
                                i11 = R.id.plusreview_match_progress_layout;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_progress_layout);
                                if (frameLayout2 != null) {
                                    i11 = R.id.plusreview_match_to_wiki;
                                    Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_to_wiki);
                                    if (button2 != null) {
                                        i11 = R.id.plusreview_match_top;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_top);
                                        if (relativeLayout != null) {
                                            i11 = R.id.plusreview_match_wiki_container;
                                            FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_wiki_container);
                                            if (frameLayout3 != null) {
                                                return new wl((RelativeLayout) rootView, frameLayout, quizStateProgressBar, linearLayout, button, imageView, progressBar, frameLayout2, button2, relativeLayout, frameLayout3);
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
    public static wl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static wl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.plusreview_match, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f57354a;
    }
}
