package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class yh implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57604a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Barrier f57605b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f57606c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Guideline f57607d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final CheckBox f57608e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57609f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f57610g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f57611h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f57612i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f57613j;

    public yh(@NonNull ConstraintLayout rootView, @NonNull Barrier contentBarrier, @NonNull Guideline guideLeft, @NonNull Guideline guideRight, @NonNull CheckBox magicPromptCheckbox, @NonNull TextView magicPromptCheckboxTip, @NonNull View magicPromptDivider, @NonNull TextView magicPromptMessage, @NonNull ImageView magicPromptPic, @NonNull TextView magicPromptTitle) {
        this.f57604a = rootView;
        this.f57605b = contentBarrier;
        this.f57606c = guideLeft;
        this.f57607d = guideRight;
        this.f57608e = magicPromptCheckbox;
        this.f57609f = magicPromptCheckboxTip;
        this.f57610g = magicPromptDivider;
        this.f57611h = magicPromptMessage;
        this.f57612i = magicPromptPic;
        this.f57613j = magicPromptTitle;
    }

    @NonNull
    public static yh a(@NonNull View rootView) {
        int i11 = R.id.content_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(rootView, R.id.content_barrier);
        if (barrier != null) {
            i11 = R.id.guide_left;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.guide_left);
            if (guideline != null) {
                i11 = R.id.guide_right;
                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(rootView, R.id.guide_right);
                if (guideline2 != null) {
                    i11 = R.id.magic_prompt_checkbox;
                    CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.magic_prompt_checkbox);
                    if (checkBox != null) {
                        i11 = R.id.magic_prompt_checkbox_tip;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.magic_prompt_checkbox_tip);
                        if (textView != null) {
                            i11 = R.id.magic_prompt_divider;
                            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.magic_prompt_divider);
                            if (findChildViewById != null) {
                                i11 = R.id.magic_prompt_message;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.magic_prompt_message);
                                if (textView2 != null) {
                                    i11 = R.id.magic_prompt_pic;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.magic_prompt_pic);
                                    if (imageView != null) {
                                        i11 = R.id.magic_prompt_title;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.magic_prompt_title);
                                        if (textView3 != null) {
                                            return new yh((ConstraintLayout) rootView, barrier, guideline, guideline2, checkBox, textView, findChildViewById, textView2, imageView, textView3);
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
    public static yh c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static yh d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_dialog_prompt_content, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f57604a;
    }
}
