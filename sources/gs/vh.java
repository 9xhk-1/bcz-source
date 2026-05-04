package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class vh implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57181a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Guideline f57182b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f57183c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f57184d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f57185e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final EditText f57186f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57187g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Space f57188h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Space f57189i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final Space f57190j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f57191k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f57192l;

    public vh(@NonNull ConstraintLayout rootView, @NonNull Guideline guideLeft, @NonNull Guideline guideRight, @NonNull View magicEditBackground, @NonNull ImageView magicEditClear, @NonNull EditText magicEditText, @NonNull TextView magicPromptTitle, @NonNull Space s12, @NonNull Space s22, @NonNull Space s32, @NonNull TextView shareCodeFeatureIntro, @NonNull TextView shareCodeSubtitle) {
        this.f57181a = rootView;
        this.f57182b = guideLeft;
        this.f57183c = guideRight;
        this.f57184d = magicEditBackground;
        this.f57185e = magicEditClear;
        this.f57186f = magicEditText;
        this.f57187g = magicPromptTitle;
        this.f57188h = s12;
        this.f57189i = s22;
        this.f57190j = s32;
        this.f57191k = shareCodeFeatureIntro;
        this.f57192l = shareCodeSubtitle;
    }

    @NonNull
    public static vh a(@NonNull View rootView) {
        int i11 = R.id.guide_left;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.guide_left);
        if (guideline != null) {
            i11 = R.id.guide_right;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(rootView, R.id.guide_right);
            if (guideline2 != null) {
                i11 = R.id.magic_edit_background;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.magic_edit_background);
                if (findChildViewById != null) {
                    i11 = R.id.magic_edit_clear;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.magic_edit_clear);
                    if (imageView != null) {
                        i11 = R.id.magic_edit_text;
                        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.magic_edit_text);
                        if (editText != null) {
                            i11 = R.id.magic_prompt_title;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.magic_prompt_title);
                            if (textView != null) {
                                i11 = R.id.f39032s1;
                                Space space = (Space) ViewBindings.findChildViewById(rootView, R.id.f39032s1);
                                if (space != null) {
                                    i11 = R.id.f39033s2;
                                    Space space2 = (Space) ViewBindings.findChildViewById(rootView, R.id.f39033s2);
                                    if (space2 != null) {
                                        i11 = R.id.f39034s3;
                                        Space space3 = (Space) ViewBindings.findChildViewById(rootView, R.id.f39034s3);
                                        if (space3 != null) {
                                            i11 = R.id.share_code_feature_intro;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.share_code_feature_intro);
                                            if (textView2 != null) {
                                                i11 = R.id.share_code_subtitle;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.share_code_subtitle);
                                                if (textView3 != null) {
                                                    return new vh((ConstraintLayout) rootView, guideline, guideline2, findChildViewById, imageView, editText, textView, space, space2, space3, textView2, textView3);
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
    public static vh c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static vh d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_dialog_edit_share_code, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f57181a;
    }
}
