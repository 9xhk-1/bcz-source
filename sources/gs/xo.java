package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.jiongji.andriod.card.R;
import me.grantland.widget.AutofitTextView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class xo implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final SwipeRevealLayout f57501a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57502b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f57503c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f57504d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f57505e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f57506f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f57507g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f57508h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f57509i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f57510j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f57511k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57512l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57513m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57514n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f57515o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57516p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final SwipeRevealLayout f57517q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final AutofitTextView f57518r;

    public xo(@NonNull SwipeRevealLayout rootView, @NonNull RelativeLayout bottomView, @NonNull ImageView cancelKill, @NonNull ImageView cancelKillR, @NonNull ImageView collect, @NonNull ImageView collectR, @NonNull ImageView detail, @NonNull View divider, @NonNull View dividerBottom, @NonNull ImageView kill, @NonNull ImageView killR, @NonNull FrameLayout killSwitcher, @NonNull FrameLayout killSwitcherR, @NonNull RelativeLayout mainItem, @NonNull TextView meanCn, @NonNull LinearLayout right, @NonNull SwipeRevealLayout swipeLayout, @NonNull AutofitTextView word) {
        this.f57501a = rootView;
        this.f57502b = bottomView;
        this.f57503c = cancelKill;
        this.f57504d = cancelKillR;
        this.f57505e = collect;
        this.f57506f = collectR;
        this.f57507g = detail;
        this.f57508h = divider;
        this.f57509i = dividerBottom;
        this.f57510j = kill;
        this.f57511k = killR;
        this.f57512l = killSwitcher;
        this.f57513m = killSwitcherR;
        this.f57514n = mainItem;
        this.f57515o = meanCn;
        this.f57516p = right;
        this.f57517q = swipeLayout;
        this.f57518r = word;
    }

    @NonNull
    public static xo a(@NonNull View rootView) {
        int i11 = R.id.bottom_view;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.bottom_view);
        if (relativeLayout != null) {
            i11 = R.id.cancel_kill;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cancel_kill);
            if (imageView != null) {
                i11 = R.id.cancel_kill_r;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cancel_kill_r);
                if (imageView2 != null) {
                    i11 = R.id.collect;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.collect);
                    if (imageView3 != null) {
                        i11 = R.id.collect_r;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.collect_r);
                        if (imageView4 != null) {
                            i11 = R.id.detail;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.detail);
                            if (imageView5 != null) {
                                i11 = R.id.divider;
                                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
                                if (findChildViewById != null) {
                                    i11 = R.id.divider_bottom;
                                    View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.divider_bottom);
                                    if (findChildViewById2 != null) {
                                        i11 = R.id.kill;
                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.kill);
                                        if (imageView6 != null) {
                                            i11 = R.id.kill_r;
                                            ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.kill_r);
                                            if (imageView7 != null) {
                                                i11 = R.id.kill_switcher;
                                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.kill_switcher);
                                                if (frameLayout != null) {
                                                    i11 = R.id.kill_switcher_r;
                                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.kill_switcher_r);
                                                    if (frameLayout2 != null) {
                                                        i11 = R.id.main_item;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.main_item);
                                                        if (relativeLayout2 != null) {
                                                            i11 = R.id.mean_cn;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.mean_cn);
                                                            if (textView != null) {
                                                                i11 = R.id.right;
                                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.right);
                                                                if (linearLayout != null) {
                                                                    SwipeRevealLayout swipeRevealLayout = (SwipeRevealLayout) rootView;
                                                                    i11 = R.id.word;
                                                                    AutofitTextView autofitTextView = (AutofitTextView) ViewBindings.findChildViewById(rootView, R.id.word);
                                                                    if (autofitTextView != null) {
                                                                        return new xo(swipeRevealLayout, relativeLayout, imageView, imageView2, imageView3, imageView4, imageView5, findChildViewById, findChildViewById2, imageView6, imageView7, frameLayout, frameLayout2, relativeLayout2, textView, linearLayout, swipeRevealLayout, autofitTextView);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static xo c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static xo d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.wordlist_item_without_theme, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SwipeRevealLayout getRoot() {
        return this.f57501a;
    }
}
