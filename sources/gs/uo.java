package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.view.RotatingImageView;
import com.baicizhan.main.home.plan.view.WordPlanInfoView;
import com.baicizhan.main.view.AspectRoundImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class uo implements ViewBinding {

    @NonNull
    public final Group A;

    @NonNull
    public final RotatingImageView B;

    @NonNull
    public final ImageView C;

    @NonNull
    public final Barrier D;

    @NonNull
    public final TextView E;

    @NonNull
    public final TextView F;

    @NonNull
    public final TextView G;

    @NonNull
    public final TextView H;

    @NonNull
    public final ProgressBar I;

    @NonNull
    public final TextView J;

    @NonNull
    public final FrameLayout K;

    @NonNull
    public final TextView L;

    @NonNull
    public final TextView M;

    @NonNull
    public final ImageView N;

    @NonNull
    public final TextView O;

    @NonNull
    public final TextView P;

    @NonNull
    public final TextView Q;

    @NonNull
    public final TextView R;

    @NonNull
    public final TextView S;

    @NonNull
    public final Guideline T;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final WordPlanInfoView f57066a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57067b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f57068c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f57069d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f57070e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f57071f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final AspectRoundImageView f57072g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f57073h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f57074i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final AspectRoundImageView f57075j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final AspectRoundImageView f57076k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ImageView f57077l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f57078m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f57079n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f57080o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f57081p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f57082q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextView f57083r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final TextView f57084s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final TextView f57085t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final Guideline f57086u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final View f57087v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    public final zh f57088w;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public final Group f57089x;

    /* renamed from: y, reason: collision with root package name */
    @NonNull
    public final Group f57090y;

    /* renamed from: z, reason: collision with root package name */
    @NonNull
    public final Group f57091z;

    public uo(@NonNull WordPlanInfoView rootView, @NonNull LinearLayout mapLearnTip, @NonNull ImageView tipClose, @NonNull View wpAdjustClickView, @NonNull View wpAdjustGroup, @NonNull ImageView wpAdjustImg, @NonNull AspectRoundImageView wpBgDone, @NonNull ImageView wpBgDoneToday, @NonNull View wpBookAreaDivider, @NonNull AspectRoundImageView wpBookCover, @NonNull AspectRoundImageView wpBookCoverDone, @NonNull ImageView wpBookDetailMessage, @NonNull TextView wpBookLink, @NonNull TextView wpBookName, @NonNull TextView wpBookNameDone, @NonNull TextView wpBtnLeft, @NonNull TextView wpBtnMain, @NonNull TextView wpBtnMainDone, @NonNull TextView wpBtnMainLight, @NonNull TextView wpBtnRight, @NonNull Guideline wpButtonAreaBottom, @NonNull View wpCoverAnchor, @NonNull zh wpErrorView, @NonNull Group wpGroupDoneBtnMain, @NonNull Group wpGroupPlanDoing, @NonNull Group wpGroupPlanDone, @NonNull Group wpGroupReviewCounts, @NonNull RotatingImageView wpLoadingView, @NonNull ImageView wpMultiModeTips, @NonNull Barrier wpNewAreaBarrier, @NonNull TextView wpNewCount, @NonNull TextView wpNewLabel, @NonNull TextView wpPlanAdjust, @NonNull TextView wpPlanPeriodDesc, @NonNull ProgressBar wpPlanProgressBar, @NonNull TextView wpPlanProgressValue, @NonNull FrameLayout wpPlanQuizzerPunchCard, @NonNull TextView wpPlanSummaryDone, @NonNull TextView wpPlanTitle, @NonNull ImageView wpPlanUpdate, @NonNull TextView wpReviewCount, @NonNull TextView wpReviewLabel, @NonNull TextView wpReviewRoundTip, @NonNull TextView wpTipOfAll, @NonNull TextView wpTipOfDone, @NonNull Guideline wpVerticalCenter) {
        this.f57066a = rootView;
        this.f57067b = mapLearnTip;
        this.f57068c = tipClose;
        this.f57069d = wpAdjustClickView;
        this.f57070e = wpAdjustGroup;
        this.f57071f = wpAdjustImg;
        this.f57072g = wpBgDone;
        this.f57073h = wpBgDoneToday;
        this.f57074i = wpBookAreaDivider;
        this.f57075j = wpBookCover;
        this.f57076k = wpBookCoverDone;
        this.f57077l = wpBookDetailMessage;
        this.f57078m = wpBookLink;
        this.f57079n = wpBookName;
        this.f57080o = wpBookNameDone;
        this.f57081p = wpBtnLeft;
        this.f57082q = wpBtnMain;
        this.f57083r = wpBtnMainDone;
        this.f57084s = wpBtnMainLight;
        this.f57085t = wpBtnRight;
        this.f57086u = wpButtonAreaBottom;
        this.f57087v = wpCoverAnchor;
        this.f57088w = wpErrorView;
        this.f57089x = wpGroupDoneBtnMain;
        this.f57090y = wpGroupPlanDoing;
        this.f57091z = wpGroupPlanDone;
        this.A = wpGroupReviewCounts;
        this.B = wpLoadingView;
        this.C = wpMultiModeTips;
        this.D = wpNewAreaBarrier;
        this.E = wpNewCount;
        this.F = wpNewLabel;
        this.G = wpPlanAdjust;
        this.H = wpPlanPeriodDesc;
        this.I = wpPlanProgressBar;
        this.J = wpPlanProgressValue;
        this.K = wpPlanQuizzerPunchCard;
        this.L = wpPlanSummaryDone;
        this.M = wpPlanTitle;
        this.N = wpPlanUpdate;
        this.O = wpReviewCount;
        this.P = wpReviewLabel;
        this.Q = wpReviewRoundTip;
        this.R = wpTipOfAll;
        this.S = wpTipOfDone;
        this.T = wpVerticalCenter;
    }

    @NonNull
    public static uo a(@NonNull View rootView) {
        int i11 = R.id.map_learn_tip;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.map_learn_tip);
        if (linearLayout != null) {
            i11 = R.id.tip_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tip_close);
            if (imageView != null) {
                i11 = R.id.wp_adjust_click_view;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.wp_adjust_click_view);
                if (findChildViewById != null) {
                    i11 = R.id.wp_adjust_group;
                    View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.wp_adjust_group);
                    if (findChildViewById2 != null) {
                        i11 = R.id.wp_adjust_img;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.wp_adjust_img);
                        if (imageView2 != null) {
                            i11 = R.id.wp_bg_done;
                            AspectRoundImageView aspectRoundImageView = (AspectRoundImageView) ViewBindings.findChildViewById(rootView, R.id.wp_bg_done);
                            if (aspectRoundImageView != null) {
                                i11 = R.id.wp_bg_done_today;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.wp_bg_done_today);
                                if (imageView3 != null) {
                                    i11 = R.id.wp_book_area_divider;
                                    View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.wp_book_area_divider);
                                    if (findChildViewById3 != null) {
                                        i11 = R.id.wp_book_cover;
                                        AspectRoundImageView aspectRoundImageView2 = (AspectRoundImageView) ViewBindings.findChildViewById(rootView, R.id.wp_book_cover);
                                        if (aspectRoundImageView2 != null) {
                                            i11 = R.id.wp_book_cover_done;
                                            AspectRoundImageView aspectRoundImageView3 = (AspectRoundImageView) ViewBindings.findChildViewById(rootView, R.id.wp_book_cover_done);
                                            if (aspectRoundImageView3 != null) {
                                                i11 = R.id.wp_book_detail_message;
                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.wp_book_detail_message);
                                                if (imageView4 != null) {
                                                    i11 = R.id.wp_book_link;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_book_link);
                                                    if (textView != null) {
                                                        i11 = R.id.wp_book_name;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_book_name);
                                                        if (textView2 != null) {
                                                            i11 = R.id.wp_book_name_done;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_book_name_done);
                                                            if (textView3 != null) {
                                                                i11 = R.id.wp_btn_left;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_btn_left);
                                                                if (textView4 != null) {
                                                                    i11 = R.id.wp_btn_main;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_btn_main);
                                                                    if (textView5 != null) {
                                                                        i11 = R.id.wp_btn_main_done;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_btn_main_done);
                                                                        if (textView6 != null) {
                                                                            i11 = R.id.wp_btn_main_light;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_btn_main_light);
                                                                            if (textView7 != null) {
                                                                                i11 = R.id.wp_btn_right;
                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_btn_right);
                                                                                if (textView8 != null) {
                                                                                    i11 = R.id.wp_button_area_bottom;
                                                                                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.wp_button_area_bottom);
                                                                                    if (guideline != null) {
                                                                                        i11 = R.id.wp_cover_anchor;
                                                                                        View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.wp_cover_anchor);
                                                                                        if (findChildViewById4 != null) {
                                                                                            i11 = R.id.wp_error_view;
                                                                                            View findChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.wp_error_view);
                                                                                            if (findChildViewById5 != null) {
                                                                                                zh a11 = zh.a(findChildViewById5);
                                                                                                i11 = R.id.wp_group_done_btn_main;
                                                                                                Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.wp_group_done_btn_main);
                                                                                                if (group != null) {
                                                                                                    i11 = R.id.wp_group_plan_doing;
                                                                                                    Group group2 = (Group) ViewBindings.findChildViewById(rootView, R.id.wp_group_plan_doing);
                                                                                                    if (group2 != null) {
                                                                                                        i11 = R.id.wp_group_plan_done;
                                                                                                        Group group3 = (Group) ViewBindings.findChildViewById(rootView, R.id.wp_group_plan_done);
                                                                                                        if (group3 != null) {
                                                                                                            i11 = R.id.wp_group_review_counts;
                                                                                                            Group group4 = (Group) ViewBindings.findChildViewById(rootView, R.id.wp_group_review_counts);
                                                                                                            if (group4 != null) {
                                                                                                                i11 = R.id.wp_loading_view;
                                                                                                                RotatingImageView rotatingImageView = (RotatingImageView) ViewBindings.findChildViewById(rootView, R.id.wp_loading_view);
                                                                                                                if (rotatingImageView != null) {
                                                                                                                    i11 = R.id.wp_multi_mode_tips;
                                                                                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.wp_multi_mode_tips);
                                                                                                                    if (imageView5 != null) {
                                                                                                                        i11 = R.id.wp_new_area_barrier;
                                                                                                                        Barrier barrier = (Barrier) ViewBindings.findChildViewById(rootView, R.id.wp_new_area_barrier);
                                                                                                                        if (barrier != null) {
                                                                                                                            i11 = R.id.wp_new_count;
                                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_new_count);
                                                                                                                            if (textView9 != null) {
                                                                                                                                i11 = R.id.wp_new_label;
                                                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_new_label);
                                                                                                                                if (textView10 != null) {
                                                                                                                                    i11 = R.id.wp_plan_adjust;
                                                                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_plan_adjust);
                                                                                                                                    if (textView11 != null) {
                                                                                                                                        i11 = R.id.wp_plan_period_desc;
                                                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_plan_period_desc);
                                                                                                                                        if (textView12 != null) {
                                                                                                                                            i11 = R.id.wp_plan_progress_bar;
                                                                                                                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.wp_plan_progress_bar);
                                                                                                                                            if (progressBar != null) {
                                                                                                                                                i11 = R.id.wp_plan_progress_value;
                                                                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_plan_progress_value);
                                                                                                                                                if (textView13 != null) {
                                                                                                                                                    i11 = R.id.wp_plan_quizzer_punch_card;
                                                                                                                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.wp_plan_quizzer_punch_card);
                                                                                                                                                    if (frameLayout != null) {
                                                                                                                                                        i11 = R.id.wp_plan_summary_done;
                                                                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_plan_summary_done);
                                                                                                                                                        if (textView14 != null) {
                                                                                                                                                            i11 = R.id.wp_plan_title;
                                                                                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_plan_title);
                                                                                                                                                            if (textView15 != null) {
                                                                                                                                                                i11 = R.id.wp_plan_update;
                                                                                                                                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.wp_plan_update);
                                                                                                                                                                if (imageView6 != null) {
                                                                                                                                                                    i11 = R.id.wp_review_count;
                                                                                                                                                                    TextView textView16 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_review_count);
                                                                                                                                                                    if (textView16 != null) {
                                                                                                                                                                        i11 = R.id.wp_review_label;
                                                                                                                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_review_label);
                                                                                                                                                                        if (textView17 != null) {
                                                                                                                                                                            i11 = R.id.wp_review_round_tip;
                                                                                                                                                                            TextView textView18 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_review_round_tip);
                                                                                                                                                                            if (textView18 != null) {
                                                                                                                                                                                i11 = R.id.wp_tip_of_all;
                                                                                                                                                                                TextView textView19 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_tip_of_all);
                                                                                                                                                                                if (textView19 != null) {
                                                                                                                                                                                    i11 = R.id.wp_tip_of_done;
                                                                                                                                                                                    TextView textView20 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wp_tip_of_done);
                                                                                                                                                                                    if (textView20 != null) {
                                                                                                                                                                                        i11 = R.id.wp_vertical_center;
                                                                                                                                                                                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(rootView, R.id.wp_vertical_center);
                                                                                                                                                                                        if (guideline2 != null) {
                                                                                                                                                                                            return new uo((WordPlanInfoView) rootView, linearLayout, imageView, findChildViewById, findChildViewById2, imageView2, aspectRoundImageView, imageView3, findChildViewById3, aspectRoundImageView2, aspectRoundImageView3, imageView4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, guideline, findChildViewById4, a11, group, group2, group3, group4, rotatingImageView, imageView5, barrier, textView9, textView10, textView11, textView12, progressBar, textView13, frameLayout, textView14, textView15, imageView6, textView16, textView17, textView18, textView19, textView20, guideline2);
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
    public static uo c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static uo d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.word_plan_info, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public WordPlanInfoView getRoot() {
        return this.f57066a;
    }
}
