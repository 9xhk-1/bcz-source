package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.SwipeViewPager;
import com.baicizhan.main.customview.FrameLayoutAutoSizeFix;
import com.baicizhan.main.customview.PatternContainer;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c1 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayoutAutoSizeFix f54349a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54350b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayoutAutoSizeFix f54351c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54352d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54353e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f54354f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f54355g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f54356h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f54357i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54358j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final PatternContainer f54359k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ProgressBar f54360l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f54361m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54362n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final ImageView f54363o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final SwipeViewPager f54364p;

    public c1(@NonNull FrameLayoutAutoSizeFix rootView, @NonNull TextView cancelLoading, @NonNull FrameLayoutAutoSizeFix content, @NonNull FrameLayout examplePlaceholder, @NonNull FrameLayout fullscreenPlaceholder, @NonNull ImageView hint, @NonNull ImageView home, @NonNull ImageView kill, @NonNull TextView lastTopic, @NonNull LinearLayout learningFooter, @NonNull PatternContainer learningPage, @NonNull ProgressBar loadingProgress, @NonNull TextView newCount, @NonNull RelativeLayout progressLayout, @NonNull ImageView voice, @NonNull SwipeViewPager wikiPager) {
        this.f54349a = rootView;
        this.f54350b = cancelLoading;
        this.f54351c = content;
        this.f54352d = examplePlaceholder;
        this.f54353e = fullscreenPlaceholder;
        this.f54354f = hint;
        this.f54355g = home;
        this.f54356h = kill;
        this.f54357i = lastTopic;
        this.f54358j = learningFooter;
        this.f54359k = learningPage;
        this.f54360l = loadingProgress;
        this.f54361m = newCount;
        this.f54362n = progressLayout;
        this.f54363o = voice;
        this.f54364p = wikiPager;
    }

    @NonNull
    public static c1 a(@NonNull View rootView) {
        int i11 = R.id.cancel_loading;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel_loading);
        if (textView != null) {
            FrameLayoutAutoSizeFix frameLayoutAutoSizeFix = (FrameLayoutAutoSizeFix) rootView;
            i11 = R.id.example_placeholder;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.example_placeholder);
            if (frameLayout != null) {
                i11 = R.id.fullscreen_placeholder;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fullscreen_placeholder);
                if (frameLayout2 != null) {
                    i11 = R.id.hint;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.hint);
                    if (imageView != null) {
                        i11 = R.id.home;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.home);
                        if (imageView2 != null) {
                            i11 = R.id.kill;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.kill);
                            if (imageView3 != null) {
                                i11 = R.id.last_topic;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.last_topic);
                                if (textView2 != null) {
                                    i11 = R.id.learning_footer;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.learning_footer);
                                    if (linearLayout != null) {
                                        i11 = R.id.learning_page;
                                        PatternContainer patternContainer = (PatternContainer) ViewBindings.findChildViewById(rootView, R.id.learning_page);
                                        if (patternContainer != null) {
                                            i11 = R.id.loading_progress;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.loading_progress);
                                            if (progressBar != null) {
                                                i11 = R.id.new_count;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_count);
                                                if (textView3 != null) {
                                                    i11 = R.id.progress_layout;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.progress_layout);
                                                    if (relativeLayout != null) {
                                                        i11 = R.id.voice;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.voice);
                                                        if (imageView4 != null) {
                                                            i11 = R.id.wiki_pager;
                                                            SwipeViewPager swipeViewPager = (SwipeViewPager) ViewBindings.findChildViewById(rootView, R.id.wiki_pager);
                                                            if (swipeViewPager != null) {
                                                                return new c1(frameLayoutAutoSizeFix, textView, frameLayoutAutoSizeFix, frameLayout, frameLayout2, imageView, imageView2, imageView3, textView2, linearLayout, patternContainer, progressBar, textView3, relativeLayout, imageView4, swipeViewPager);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static c1 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static c1 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_learning_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayoutAutoSizeFix getRoot() {
        return this.f54349a;
    }
}
