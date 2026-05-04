package lc;

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
import com.baicizhan.framework.common.magicdialog.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f71064a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Barrier f71065b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f71066c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Guideline f71067d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final CheckBox f71068e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f71069f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f71070g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f71071h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f71072i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f71073j;

    public f(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull CheckBox checkBox, @NonNull TextView textView, @NonNull View view, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull TextView textView3) {
        this.f71064a = constraintLayout;
        this.f71065b = barrier;
        this.f71066c = guideline;
        this.f71067d = guideline2;
        this.f71068e = checkBox;
        this.f71069f = textView;
        this.f71070g = view;
        this.f71071h = textView2;
        this.f71072i = imageView;
        this.f71073j = textView3;
    }

    @NonNull
    public static f a(@NonNull View view) {
        View findViewById;
        int i11 = R.id.content_barrier;
        Barrier barrier = (Barrier) view.findViewById(i11);
        if (barrier != null) {
            i11 = R.id.guide_left;
            Guideline guideline = (Guideline) view.findViewById(i11);
            if (guideline != null) {
                i11 = R.id.guide_right;
                Guideline guideline2 = (Guideline) view.findViewById(i11);
                if (guideline2 != null) {
                    i11 = R.id.magic_prompt_checkbox;
                    CheckBox checkBox = (CheckBox) view.findViewById(i11);
                    if (checkBox != null) {
                        i11 = R.id.magic_prompt_checkbox_tip;
                        TextView textView = (TextView) view.findViewById(i11);
                        if (textView != null && (findViewById = view.findViewById((i11 = R.id.magic_prompt_divider))) != null) {
                            i11 = R.id.magic_prompt_message;
                            TextView textView2 = (TextView) view.findViewById(i11);
                            if (textView2 != null) {
                                i11 = R.id.magic_prompt_pic;
                                ImageView imageView = (ImageView) view.findViewById(i11);
                                if (imageView != null) {
                                    i11 = R.id.magic_prompt_title;
                                    TextView textView3 = (TextView) view.findViewById(i11);
                                    if (textView3 != null) {
                                        return new f((ConstraintLayout) view, barrier, guideline, guideline2, checkBox, textView, findViewById, textView2, imageView, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static f c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dialog_prompt, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f71064a;
    }
}
