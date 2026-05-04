package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.DotIndicator;
import com.baicizhan.client.business.widget.LockableViewPager;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class uc implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56993a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final DotIndicator f56994b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f56995c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56996d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LockableViewPager f56997e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f56998f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f56999g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f57000h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57001i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f57002j;

    public uc(@NonNull RelativeLayout rootView, @NonNull DotIndicator indicator, @NonNull ImageView leftIndicator, @NonNull ProgressBar loadProgress, @NonNull LockableViewPager rankListPager, @NonNull ImageView rightIndicator, @NonNull TextView singleTip, @NonNull TextView week, @NonNull RelativeLayout weekContainer, @NonNull TextView weekDate) {
        this.f56993a = rootView;
        this.f56994b = indicator;
        this.f56995c = leftIndicator;
        this.f56996d = loadProgress;
        this.f56997e = rankListPager;
        this.f56998f = rightIndicator;
        this.f56999g = singleTip;
        this.f57000h = week;
        this.f57001i = weekContainer;
        this.f57002j = weekDate;
    }

    @NonNull
    public static uc a(@NonNull View rootView) {
        int i11 = R.id.indicator;
        DotIndicator dotIndicator = (DotIndicator) ViewBindings.findChildViewById(rootView, R.id.indicator);
        if (dotIndicator != null) {
            i11 = R.id.left_indicator;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.left_indicator);
            if (imageView != null) {
                i11 = R.id.load_progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.load_progress);
                if (progressBar != null) {
                    i11 = R.id.rank_list_pager;
                    LockableViewPager lockableViewPager = (LockableViewPager) ViewBindings.findChildViewById(rootView, R.id.rank_list_pager);
                    if (lockableViewPager != null) {
                        i11 = R.id.right_indicator;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.right_indicator);
                        if (imageView2 != null) {
                            i11 = R.id.single_tip;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.single_tip);
                            if (textView != null) {
                                i11 = R.id.week;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.week);
                                if (textView2 != null) {
                                    i11 = R.id.week_container;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.week_container);
                                    if (relativeLayout != null) {
                                        i11 = R.id.week_date;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.week_date);
                                        if (textView3 != null) {
                                            return new uc((RelativeLayout) rootView, dotIndicator, imageView, progressBar, lockableViewPager, imageView2, textView, textView2, relativeLayout, textView3);
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
    public static uc c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static uc d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.friend_week_fragment, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56993a;
    }
}
