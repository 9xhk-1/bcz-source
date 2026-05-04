package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;
import com.makeramen.roundedimageview.RoundedImageView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class xa implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f57429a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57430b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f57431c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f57432d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final tm f57433e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final tm f57434f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final tm f57435g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57436h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final tm f57437i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final tm f57438j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final tm f57439k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final tm f57440l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final tm f57441m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final tm f57442n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f57443o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f57444p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final tm f57445q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final sm f57446r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final sm f57447s;

    public xa(@NonNull NestedScrollView rootView, @NonNull FrameLayout adContainer, @NonNull RoundedImageView adImage, @NonNull View center, @NonNull tm cnWord, @NonNull tm enMean, @NonNull tm fullSpell, @NonNull LinearLayout headContainer, @NonNull tm hearRecognize, @NonNull tm phraseReview, @NonNull tm readReview, @NonNull tm selfTest, @NonNull tm spell, @NonNull tm spellReview, @NonNull TextView title, @NonNull TextView titleFastReview, @NonNull tm walkListen, @NonNull sm wordFm, @NonNull sm wordTv) {
        this.f57429a = rootView;
        this.f57430b = adContainer;
        this.f57431c = adImage;
        this.f57432d = center;
        this.f57433e = cnWord;
        this.f57434f = enMean;
        this.f57435g = fullSpell;
        this.f57436h = headContainer;
        this.f57437i = hearRecognize;
        this.f57438j = phraseReview;
        this.f57439k = readReview;
        this.f57440l = selfTest;
        this.f57441m = spell;
        this.f57442n = spellReview;
        this.f57443o = title;
        this.f57444p = titleFastReview;
        this.f57445q = walkListen;
        this.f57446r = wordFm;
        this.f57447s = wordTv;
    }

    @NonNull
    public static xa a(@NonNull View rootView) {
        int i11 = R.id.ad_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.ad_container);
        if (frameLayout != null) {
            i11 = R.id.ad_image;
            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.ad_image);
            if (roundedImageView != null) {
                i11 = R.id.center;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.center);
                if (findChildViewById != null) {
                    i11 = R.id.cn_word;
                    View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.cn_word);
                    if (findChildViewById2 != null) {
                        tm a11 = tm.a(findChildViewById2);
                        i11 = R.id.en_mean;
                        View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.en_mean);
                        if (findChildViewById3 != null) {
                            tm a12 = tm.a(findChildViewById3);
                            i11 = R.id.full_spell;
                            View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.full_spell);
                            if (findChildViewById4 != null) {
                                tm a13 = tm.a(findChildViewById4);
                                i11 = R.id.head_container;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.head_container);
                                if (linearLayout != null) {
                                    i11 = R.id.hear_recognize;
                                    View findChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.hear_recognize);
                                    if (findChildViewById5 != null) {
                                        tm a14 = tm.a(findChildViewById5);
                                        i11 = R.id.phrase_review;
                                        View findChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.phrase_review);
                                        if (findChildViewById6 != null) {
                                            tm a15 = tm.a(findChildViewById6);
                                            i11 = R.id.read_review;
                                            View findChildViewById7 = ViewBindings.findChildViewById(rootView, R.id.read_review);
                                            if (findChildViewById7 != null) {
                                                tm a16 = tm.a(findChildViewById7);
                                                i11 = R.id.self_test;
                                                View findChildViewById8 = ViewBindings.findChildViewById(rootView, R.id.self_test);
                                                if (findChildViewById8 != null) {
                                                    tm a17 = tm.a(findChildViewById8);
                                                    i11 = R.id.spell;
                                                    View findChildViewById9 = ViewBindings.findChildViewById(rootView, R.id.spell);
                                                    if (findChildViewById9 != null) {
                                                        tm a18 = tm.a(findChildViewById9);
                                                        i11 = R.id.spell_review;
                                                        View findChildViewById10 = ViewBindings.findChildViewById(rootView, R.id.spell_review);
                                                        if (findChildViewById10 != null) {
                                                            tm a19 = tm.a(findChildViewById10);
                                                            i11 = R.id.title;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                                            if (textView != null) {
                                                                i11 = R.id.title_fast_review;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_fast_review);
                                                                if (textView2 != null) {
                                                                    i11 = R.id.walk_listen;
                                                                    View findChildViewById11 = ViewBindings.findChildViewById(rootView, R.id.walk_listen);
                                                                    if (findChildViewById11 != null) {
                                                                        tm a21 = tm.a(findChildViewById11);
                                                                        i11 = R.id.word_fm;
                                                                        View findChildViewById12 = ViewBindings.findChildViewById(rootView, R.id.word_fm);
                                                                        if (findChildViewById12 != null) {
                                                                            sm a22 = sm.a(findChildViewById12);
                                                                            i11 = R.id.word_tv;
                                                                            View findChildViewById13 = ViewBindings.findChildViewById(rootView, R.id.word_tv);
                                                                            if (findChildViewById13 != null) {
                                                                                return new xa((NestedScrollView) rootView, frameLayout, roundedImageView, findChildViewById, a11, a12, a13, linearLayout, a14, a15, a16, a17, a18, a19, textView, textView2, a21, a22, sm.a(findChildViewById13));
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
    public static xa c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static xa d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_skill_train, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f57429a;
    }
}
