package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.SwipeViewPager;
import com.baicizhan.main.customview.PatternContainer;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class s implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56678a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final PatternContainer f56679b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f56680c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f56681d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f56682e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56683f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56684g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f56685h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56686i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f56687j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final SwipeViewPager f56688k;

    public s(@NonNull FrameLayout rootView, @NonNull PatternContainer container, @NonNull View disableClick, @NonNull ImageView hint, @NonNull ImageView home, @NonNull TextView lastTopic, @NonNull LinearLayout learningFooter, @NonNull TextView remainCount, @NonNull FrameLayout topicReviewContainer, @NonNull ImageView voice, @NonNull SwipeViewPager wikiPager) {
        this.f56678a = rootView;
        this.f56679b = container;
        this.f56680c = disableClick;
        this.f56681d = hint;
        this.f56682e = home;
        this.f56683f = lastTopic;
        this.f56684g = learningFooter;
        this.f56685h = remainCount;
        this.f56686i = topicReviewContainer;
        this.f56687j = voice;
        this.f56688k = wikiPager;
    }

    @NonNull
    public static s a(@NonNull View rootView) {
        int i11 = R.id.container;
        PatternContainer patternContainer = (PatternContainer) ViewBindings.findChildViewById(rootView, R.id.container);
        if (patternContainer != null) {
            i11 = R.id.disable_click;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.disable_click);
            if (findChildViewById != null) {
                i11 = R.id.hint;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.hint);
                if (imageView != null) {
                    i11 = R.id.home;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.home);
                    if (imageView2 != null) {
                        i11 = R.id.last_topic;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.last_topic);
                        if (textView != null) {
                            i11 = R.id.learning_footer;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.learning_footer);
                            if (linearLayout != null) {
                                i11 = R.id.remain_count;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.remain_count);
                                if (textView2 != null) {
                                    i11 = R.id.topic_review_container;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.topic_review_container);
                                    if (frameLayout != null) {
                                        i11 = R.id.voice;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.voice);
                                        if (imageView3 != null) {
                                            i11 = R.id.wiki_pager;
                                            SwipeViewPager swipeViewPager = (SwipeViewPager) ViewBindings.findChildViewById(rootView, R.id.wiki_pager);
                                            if (swipeViewPager != null) {
                                                return new s((FrameLayout) rootView, patternContainer, findChildViewById, imageView, imageView2, textView, linearLayout, textView2, frameLayout, imageView3, swipeViewPager);
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
    public static s c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static s d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_collect_review, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f56678a;
    }
}
