package lc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.baicizhan.framework.common.magicdialog.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f71081a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Guideline f71082b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f71083c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f71084d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f71085e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f71086f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Space f71087g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Space f71088h;

    public i(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull Space space, @NonNull Space space2) {
        this.f71081a = constraintLayout;
        this.f71082b = guideline;
        this.f71083c = guideline2;
        this.f71084d = textView;
        this.f71085e = textView2;
        this.f71086f = textView3;
        this.f71087g = space;
        this.f71088h = space2;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i11 = R.id.guide_left;
        Guideline guideline = (Guideline) view.findViewById(i11);
        if (guideline != null) {
            i11 = R.id.guide_right;
            Guideline guideline2 = (Guideline) view.findViewById(i11);
            if (guideline2 != null) {
                i11 = R.id.magic_button_negative;
                TextView textView = (TextView) view.findViewById(i11);
                if (textView != null) {
                    i11 = R.id.magic_button_neutral;
                    TextView textView2 = (TextView) view.findViewById(i11);
                    if (textView2 != null) {
                        i11 = R.id.magic_button_positive;
                        TextView textView3 = (TextView) view.findViewById(i11);
                        if (textView3 != null) {
                            i11 = R.id.magic_buttons_gap_bottom;
                            Space space = (Space) view.findViewById(i11);
                            if (space != null) {
                                i11 = R.id.magic_buttons_gap_top;
                                Space space2 = (Space) view.findViewById(i11);
                                if (space2 != null) {
                                    return new i((ConstraintLayout) view, guideline, guideline2, textView, textView2, textView3, space, space2);
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
    public static i c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static i d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.layout_action_buttons, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f71081a;
    }
}
