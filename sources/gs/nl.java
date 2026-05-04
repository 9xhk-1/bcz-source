package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class nl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56086a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Button f56087b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f56088c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56089d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f56090e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56091f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f56092g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f56093h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f56094i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f56095j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f56096k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f56097l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f56098m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f56099n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f56100o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f56101p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f56102q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextView f56103r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final TextView f56104s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final TextView f56105t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final TextView f56106u;

    public nl(@NonNull RelativeLayout rootView, @NonNull Button phraseTrainingBackList, @NonNull Button phraseTrainingContinueNextCourse, @NonNull TextView phraseTrainingCourseFinished, @NonNull View phraseTrainingDiv, @NonNull TextView phraseTrainingMean0, @NonNull TextView phraseTrainingMean1, @NonNull TextView phraseTrainingMean2, @NonNull TextView phraseTrainingMean3, @NonNull TextView phraseTrainingMean4, @NonNull TextView phraseTrainingMean5, @NonNull TextView phraseTrainingMean6, @NonNull TextView phraseTrainingMean7, @NonNull TextView phraseTrainingWord0, @NonNull TextView phraseTrainingWord1, @NonNull TextView phraseTrainingWord2, @NonNull TextView phraseTrainingWord3, @NonNull TextView phraseTrainingWord4, @NonNull TextView phraseTrainingWord5, @NonNull TextView phraseTrainingWord6, @NonNull TextView phraseTrainingWord7) {
        this.f56086a = rootView;
        this.f56087b = phraseTrainingBackList;
        this.f56088c = phraseTrainingContinueNextCourse;
        this.f56089d = phraseTrainingCourseFinished;
        this.f56090e = phraseTrainingDiv;
        this.f56091f = phraseTrainingMean0;
        this.f56092g = phraseTrainingMean1;
        this.f56093h = phraseTrainingMean2;
        this.f56094i = phraseTrainingMean3;
        this.f56095j = phraseTrainingMean4;
        this.f56096k = phraseTrainingMean5;
        this.f56097l = phraseTrainingMean6;
        this.f56098m = phraseTrainingMean7;
        this.f56099n = phraseTrainingWord0;
        this.f56100o = phraseTrainingWord1;
        this.f56101p = phraseTrainingWord2;
        this.f56102q = phraseTrainingWord3;
        this.f56103r = phraseTrainingWord4;
        this.f56104s = phraseTrainingWord5;
        this.f56105t = phraseTrainingWord6;
        this.f56106u = phraseTrainingWord7;
    }

    @NonNull
    public static nl a(@NonNull View rootView) {
        int i11 = R.id.phrase_training_back_list;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.phrase_training_back_list);
        if (button != null) {
            i11 = R.id.phrase_training_continue_next_course;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.phrase_training_continue_next_course);
            if (button2 != null) {
                i11 = R.id.phrase_training_course_finished;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_course_finished);
                if (textView != null) {
                    i11 = R.id.phrase_training_div;
                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.phrase_training_div);
                    if (findChildViewById != null) {
                        i11 = R.id.phrase_training_mean_0;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_mean_0);
                        if (textView2 != null) {
                            i11 = R.id.phrase_training_mean_1;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_mean_1);
                            if (textView3 != null) {
                                i11 = R.id.phrase_training_mean_2;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_mean_2);
                                if (textView4 != null) {
                                    i11 = R.id.phrase_training_mean_3;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_mean_3);
                                    if (textView5 != null) {
                                        i11 = R.id.phrase_training_mean_4;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_mean_4);
                                        if (textView6 != null) {
                                            i11 = R.id.phrase_training_mean_5;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_mean_5);
                                            if (textView7 != null) {
                                                i11 = R.id.phrase_training_mean_6;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_mean_6);
                                                if (textView8 != null) {
                                                    i11 = R.id.phrase_training_mean_7;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_mean_7);
                                                    if (textView9 != null) {
                                                        i11 = R.id.phrase_training_word_0;
                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_0);
                                                        if (textView10 != null) {
                                                            i11 = R.id.phrase_training_word_1;
                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_1);
                                                            if (textView11 != null) {
                                                                i11 = R.id.phrase_training_word_2;
                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_2);
                                                                if (textView12 != null) {
                                                                    i11 = R.id.phrase_training_word_3;
                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_3);
                                                                    if (textView13 != null) {
                                                                        i11 = R.id.phrase_training_word_4;
                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_4);
                                                                        if (textView14 != null) {
                                                                            i11 = R.id.phrase_training_word_5;
                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_5);
                                                                            if (textView15 != null) {
                                                                                i11 = R.id.phrase_training_word_6;
                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_6);
                                                                                if (textView16 != null) {
                                                                                    i11 = R.id.phrase_training_word_7;
                                                                                    TextView textView17 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_training_word_7);
                                                                                    if (textView17 != null) {
                                                                                        return new nl((RelativeLayout) rootView, button, button2, textView, findChildViewById, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17);
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
    public static nl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static nl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.phrase_training_fragment_over, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56086a;
    }
}
