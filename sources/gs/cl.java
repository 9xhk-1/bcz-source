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
public final class cl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54489a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54490b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54491c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f54492d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54493e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f54494f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54495g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54496h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f54497i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f54498j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f54499k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f54500l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54501m;

    public cl(@NonNull RelativeLayout rootView, @NonNull RelativeLayout phraseGroupCard, @NonNull TextView phraseGroupIndex, @NonNull View phraseGroupLearnt, @NonNull TextView phraseGroupPhrase0, @NonNull TextView phraseGroupPhrase1, @NonNull TextView phraseGroupPhrase2, @NonNull TextView phraseGroupPhrase3, @NonNull TextView phraseGroupPhrase4, @NonNull TextView phraseGroupPhrase5, @NonNull TextView phraseGroupPhrase6, @NonNull TextView phraseGroupPhrase7, @NonNull LinearLayout phraseGroupPhrases) {
        this.f54489a = rootView;
        this.f54490b = phraseGroupCard;
        this.f54491c = phraseGroupIndex;
        this.f54492d = phraseGroupLearnt;
        this.f54493e = phraseGroupPhrase0;
        this.f54494f = phraseGroupPhrase1;
        this.f54495g = phraseGroupPhrase2;
        this.f54496h = phraseGroupPhrase3;
        this.f54497i = phraseGroupPhrase4;
        this.f54498j = phraseGroupPhrase5;
        this.f54499k = phraseGroupPhrase6;
        this.f54500l = phraseGroupPhrase7;
        this.f54501m = phraseGroupPhrases;
    }

    @NonNull
    public static cl a(@NonNull View rootView) {
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
                                                        return new cl((RelativeLayout) rootView, relativeLayout, textView, findChildViewById, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, linearLayout);
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
    public static cl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static cl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.phrase_group_card_left, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f54489a;
    }
}
