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
import com.jiongji.andriod.card.R;
import com.kyleduo.switchbutton.SwitchButton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class no implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56120a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56121b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final SwitchButton f56122c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56123d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56124e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56125f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f56126g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56127h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f56128i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f56129j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f56130k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ImageView f56131l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f56132m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final SwitchButton f56133n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final ImageView f56134o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f56135p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56136q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextView f56137r;

    public no(@NonNull FrameLayout rootView, @NonNull LinearLayout circlePlayLayout, @NonNull SwitchButton circlePlaySwitch, @NonNull TextView playSpeed, @NonNull LinearLayout sentenceArea, @NonNull TextView sentenceCh, @NonNull TextView sentenceEn, @NonNull LinearLayout titleBar, @NonNull TextView toggle, @NonNull TextView walklistenAccent, @NonNull TextView walklistenCnmean, @NonNull ImageView walklistenHome, @NonNull TextView walklistenLastTopic, @NonNull SwitchButton walklistenSentenceSwitch, @NonNull ImageView walklistenSound, @NonNull TextView walklistenWaittingPass, @NonNull FrameLayout walklistenWikiContainer, @NonNull TextView walklistenWord) {
        this.f56120a = rootView;
        this.f56121b = circlePlayLayout;
        this.f56122c = circlePlaySwitch;
        this.f56123d = playSpeed;
        this.f56124e = sentenceArea;
        this.f56125f = sentenceCh;
        this.f56126g = sentenceEn;
        this.f56127h = titleBar;
        this.f56128i = toggle;
        this.f56129j = walklistenAccent;
        this.f56130k = walklistenCnmean;
        this.f56131l = walklistenHome;
        this.f56132m = walklistenLastTopic;
        this.f56133n = walklistenSentenceSwitch;
        this.f56134o = walklistenSound;
        this.f56135p = walklistenWaittingPass;
        this.f56136q = walklistenWikiContainer;
        this.f56137r = walklistenWord;
    }

    @NonNull
    public static no a(@NonNull View rootView) {
        int i11 = R.id.circle_play_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.circle_play_layout);
        if (linearLayout != null) {
            i11 = R.id.circle_play_switch;
            SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(rootView, R.id.circle_play_switch);
            if (switchButton != null) {
                i11 = R.id.play_speed;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.play_speed);
                if (textView != null) {
                    i11 = R.id.sentence_area;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sentence_area);
                    if (linearLayout2 != null) {
                        i11 = R.id.sentence_ch;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sentence_ch);
                        if (textView2 != null) {
                            i11 = R.id.sentence_en;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sentence_en);
                            if (textView3 != null) {
                                i11 = R.id.title_bar;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.title_bar);
                                if (linearLayout3 != null) {
                                    i11 = R.id.toggle;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.toggle);
                                    if (textView4 != null) {
                                        i11 = R.id.walklisten_accent;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.walklisten_accent);
                                        if (textView5 != null) {
                                            i11 = R.id.walklisten_cnmean;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.walklisten_cnmean);
                                            if (textView6 != null) {
                                                i11 = R.id.walklisten_home;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.walklisten_home);
                                                if (imageView != null) {
                                                    i11 = R.id.walklisten_last_topic;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.walklisten_last_topic);
                                                    if (textView7 != null) {
                                                        i11 = R.id.walklisten_sentence_switch;
                                                        SwitchButton switchButton2 = (SwitchButton) ViewBindings.findChildViewById(rootView, R.id.walklisten_sentence_switch);
                                                        if (switchButton2 != null) {
                                                            i11 = R.id.walklisten_sound;
                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.walklisten_sound);
                                                            if (imageView2 != null) {
                                                                i11 = R.id.walklisten_waitting_pass;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.walklisten_waitting_pass);
                                                                if (textView8 != null) {
                                                                    i11 = R.id.walklisten_wiki_container;
                                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.walklisten_wiki_container);
                                                                    if (frameLayout != null) {
                                                                        i11 = R.id.walklisten_word;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.walklisten_word);
                                                                        if (textView9 != null) {
                                                                            return new no((FrameLayout) rootView, linearLayout, switchButton, textView, linearLayout2, textView2, textView3, linearLayout3, textView4, textView5, textView6, imageView, textView7, switchButton2, imageView2, textView8, frameLayout, textView9);
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
    public static no c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static no d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.walklisten_play, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f56120a;
    }
}
