package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class dl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54645a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54646b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54647c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f54648d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54649e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f54650f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54651g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54652h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f54653i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f54654j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f54655k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f54656l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54657m;

    public dl(@NonNull RelativeLayout rootView, @NonNull RelativeLayout phraseGroupCard, @NonNull TextView phraseGroupIndex, @NonNull View phraseGroupLearnt, @NonNull TextView phraseGroupPhrase0, @NonNull TextView phraseGroupPhrase1, @NonNull TextView phraseGroupPhrase2, @NonNull TextView phraseGroupPhrase3, @NonNull TextView phraseGroupPhrase4, @NonNull TextView phraseGroupPhrase5, @NonNull TextView phraseGroupPhrase6, @NonNull TextView phraseGroupPhrase7, @NonNull LinearLayout phraseGroupPhrases) {
        this.f54645a = rootView;
        this.f54646b = phraseGroupCard;
        this.f54647c = phraseGroupIndex;
        this.f54648d = phraseGroupLearnt;
        this.f54649e = phraseGroupPhrase0;
        this.f54650f = phraseGroupPhrase1;
        this.f54651g = phraseGroupPhrase2;
        this.f54652h = phraseGroupPhrase3;
        this.f54653i = phraseGroupPhrase4;
        this.f54654j = phraseGroupPhrase5;
        this.f54655k = phraseGroupPhrase6;
        this.f54656l = phraseGroupPhrase7;
        this.f54657m = phraseGroupPhrases;
    }

    @NonNull
    public static dl a(@NonNull View rootView) {
        int i11 = R.id.phrase_group_card;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.phrase_group_card);
        if (relativeLayout != null) {
            i11 = R.id.phrase_group_index;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_group_index);
            if (textView != null) {
                i11 = R.id.phrase_group_learnt;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.phrase_group_learnt);
                if (findChildViewById != null) {
                    i11 = R.id.phrase_group_phrase_0;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_group_phrase_0);
                    if (textView2 != null) {
                        i11 = R.id.phrase_group_phrase_1;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_group_phrase_1);
                        if (textView3 != null) {
                            i11 = R.id.phrase_group_phrase_2;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_group_phrase_2);
                            if (textView4 != null) {
                                i11 = R.id.phrase_group_phrase_3;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_group_phrase_3);
                                if (textView5 != null) {
                                    i11 = R.id.phrase_group_phrase_4;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_group_phrase_4);
                                    if (textView6 != null) {
                                        i11 = R.id.phrase_group_phrase_5;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_group_phrase_5);
                                        if (textView7 != null) {
                                            i11 = R.id.phrase_group_phrase_6;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_group_phrase_6);
                                            if (textView8 != null) {
                                                i11 = R.id.phrase_group_phrase_7;
                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_group_phrase_7);
                                                if (textView9 != null) {
                                                    i11 = R.id.phrase_group_phrases;
                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.phrase_group_phrases);
                                                    if (linearLayout != null) {
                                                        return new dl((RelativeLayout) rootView, relativeLayout, textView, findChildViewById, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, linearLayout);
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
    public static dl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static dl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.phrase_group_card_right, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f54645a;
    }
}
