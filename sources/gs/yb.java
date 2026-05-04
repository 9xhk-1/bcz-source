package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.RedDotImageView;
import com.baicizhan.main.home.plan.winningStreak.WinningStreakBarView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class yb implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f57577a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f57578b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RedDotImageView f57579c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57580d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ti f57581e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f57582f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57583g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final WinningStreakBarView f57584h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f57585i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f57586j;

    public yb(@NonNull CoordinatorLayout rootView, @NonNull View divider, @NonNull RedDotImageView messages, @NonNull RecyclerView planCards, @NonNull ti popDownMessage, @NonNull View spaceWinning, @NonNull ConstraintLayout topBar, @NonNull WinningStreakBarView winning, @NonNull CoordinatorLayout wordPlanTab, @NonNull ImageView wordsSearch) {
        this.f57577a = rootView;
        this.f57578b = divider;
        this.f57579c = messages;
        this.f57580d = planCards;
        this.f57581e = popDownMessage;
        this.f57582f = spaceWinning;
        this.f57583g = topBar;
        this.f57584h = winning;
        this.f57585i = wordPlanTab;
        this.f57586j = wordsSearch;
    }

    @NonNull
    public static yb a(@NonNull View rootView) {
        int i11 = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
        if (findChildViewById != null) {
            i11 = R.id.messages;
            RedDotImageView redDotImageView = (RedDotImageView) ViewBindings.findChildViewById(rootView, R.id.messages);
            if (redDotImageView != null) {
                i11 = R.id.plan_cards;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.plan_cards);
                if (recyclerView != null) {
                    i11 = R.id.pop_down_message;
                    View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.pop_down_message);
                    if (findChildViewById2 != null) {
                        ti a11 = ti.a(findChildViewById2);
                        i11 = R.id.space_winning;
                        View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.space_winning);
                        if (findChildViewById3 != null) {
                            i11 = R.id.top_bar;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.top_bar);
                            if (constraintLayout != null) {
                                i11 = R.id.winning;
                                WinningStreakBarView winningStreakBarView = (WinningStreakBarView) ViewBindings.findChildViewById(rootView, R.id.winning);
                                if (winningStreakBarView != null) {
                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) rootView;
                                    i11 = R.id.words_search;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.words_search);
                                    if (imageView != null) {
                                        return new yb(coordinatorLayout, findChildViewById, redDotImageView, recyclerView, a11, findChildViewById3, constraintLayout, winningStreakBarView, coordinatorLayout, imageView);
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
    public static yb c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static yb d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_word_plan, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f57577a;
    }
}
