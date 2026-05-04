package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.main.customview.ClozeTextView;
import com.baicizhan.main.customview.ClozeTraditionHintView;
import com.baicizhan.main.customview.DialView;
import com.baicizhan.main.customview.HighlightTextView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class uk implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57047a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ClozeTextView f57048b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57049c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final DialView f57050d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57051e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57052f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57053g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final HighlightTextView f57054h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final HighlightTextView f57055i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f57056j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57057k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final HighlightTextView f57058l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final ClozeTraditionHintView f57059m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f57060n;

    public uk(@NonNull ConstraintLayout rootView, @NonNull ClozeTextView clozeText, @NonNull TextView cnmean, @NonNull DialView dialView, @NonNull LinearLayout doubleHint, @NonNull FrameLayout frameLayout, @NonNull FrameLayout hintPlaceholder, @NonNull HighlightTextView leftHint, @NonNull HighlightTextView mediaHint, @NonNull TextView phoneticHint, @NonNull RelativeLayout relativeLayout2, @NonNull HighlightTextView rightHint, @NonNull ClozeTraditionHintView tranditionHint, @NonNull NestedScrollView tranditionHintContainer) {
        this.f57047a = rootView;
        this.f57048b = clozeText;
        this.f57049c = cnmean;
        this.f57050d = dialView;
        this.f57051e = doubleHint;
        this.f57052f = frameLayout;
        this.f57053g = hintPlaceholder;
        this.f57054h = leftHint;
        this.f57055i = mediaHint;
        this.f57056j = phoneticHint;
        this.f57057k = relativeLayout2;
        this.f57058l = rightHint;
        this.f57059m = tranditionHint;
        this.f57060n = tranditionHintContainer;
    }

    @NonNull
    public static uk a(@NonNull View rootView) {
        int i11 = R.id.cloze_text;
        ClozeTextView clozeTextView = (ClozeTextView) ViewBindings.findChildViewById(rootView, R.id.cloze_text);
        if (clozeTextView != null) {
            i11 = R.id.cnmean;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cnmean);
            if (textView != null) {
                i11 = R.id.dial_view;
                DialView dialView = (DialView) ViewBindings.findChildViewById(rootView, R.id.dial_view);
                if (dialView != null) {
                    i11 = R.id.double_hint;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.double_hint);
                    if (linearLayout != null) {
                        i11 = R.id.frameLayout;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.frameLayout);
                        if (frameLayout != null) {
                            i11 = R.id.hint_placeholder;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.hint_placeholder);
                            if (frameLayout2 != null) {
                                i11 = R.id.left_hint;
                                HighlightTextView highlightTextView = (HighlightTextView) ViewBindings.findChildViewById(rootView, R.id.left_hint);
                                if (highlightTextView != null) {
                                    i11 = R.id.media_hint;
                                    HighlightTextView highlightTextView2 = (HighlightTextView) ViewBindings.findChildViewById(rootView, R.id.media_hint);
                                    if (highlightTextView2 != null) {
                                        i11 = R.id.phonetic_hint;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phonetic_hint);
                                        if (textView2 != null) {
                                            i11 = R.id.relativeLayout2;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.relativeLayout2);
                                            if (relativeLayout != null) {
                                                i11 = R.id.right_hint;
                                                HighlightTextView highlightTextView3 = (HighlightTextView) ViewBindings.findChildViewById(rootView, R.id.right_hint);
                                                if (highlightTextView3 != null) {
                                                    i11 = R.id.trandition_hint;
                                                    ClozeTraditionHintView clozeTraditionHintView = (ClozeTraditionHintView) ViewBindings.findChildViewById(rootView, R.id.trandition_hint);
                                                    if (clozeTraditionHintView != null) {
                                                        i11 = R.id.trandition_hint_container;
                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.trandition_hint_container);
                                                        if (nestedScrollView != null) {
                                                            return new uk((ConstraintLayout) rootView, clozeTextView, textView, dialView, linearLayout, frameLayout, frameLayout2, highlightTextView, highlightTextView2, textView2, relativeLayout, highlightTextView3, clozeTraditionHintView, nestedScrollView);
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
    public static uk c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static uk d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.pattern_cloze_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f57047a;
    }
}
