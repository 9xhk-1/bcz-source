package lc;

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
import com.baicizhan.framework.common.magicdialog.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f71052a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Guideline f71053b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f71054c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f71055d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f71056e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final EditText f71057f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f71058g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Space f71059h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Space f71060i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final Space f71061j;

    public d(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull View view, @NonNull ImageView imageView, @NonNull EditText editText, @NonNull TextView textView, @NonNull Space space, @NonNull Space space2, @NonNull Space space3) {
        this.f71052a = constraintLayout;
        this.f71053b = guideline;
        this.f71054c = guideline2;
        this.f71055d = view;
        this.f71056e = imageView;
        this.f71057f = editText;
        this.f71058g = textView;
        this.f71059h = space;
        this.f71060i = space2;
        this.f71061j = space3;
    }

    @NonNull
    public static d a(@NonNull View view) {
        View findViewById;
        int i11 = R.id.guide_left;
        Guideline guideline = (Guideline) view.findViewById(i11);
        if (guideline != null) {
            i11 = R.id.guide_right;
            Guideline guideline2 = (Guideline) view.findViewById(i11);
            if (guideline2 != null && (findViewById = view.findViewById((i11 = R.id.magic_edit_background))) != null) {
                i11 = R.id.magic_edit_clear;
                ImageView imageView = (ImageView) view.findViewById(i11);
                if (imageView != null) {
                    i11 = R.id.magic_edit_text;
                    EditText editText = (EditText) view.findViewById(i11);
                    if (editText != null) {
                        i11 = R.id.magic_prompt_title;
                        TextView textView = (TextView) view.findViewById(i11);
                        if (textView != null) {
                            i11 = R.id.f17795s1;
                            Space space = (Space) view.findViewById(i11);
                            if (space != null) {
                                i11 = R.id.f17796s2;
                                Space space2 = (Space) view.findViewById(i11);
                                if (space2 != null) {
                                    i11 = R.id.f17797s3;
                                    Space space3 = (Space) view.findViewById(i11);
                                    if (space3 != null) {
                                        return new d((ConstraintLayout) view, guideline, guideline2, findViewById, imageView, editText, textView, space, space2, space3);
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
    public static d c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static d d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dialog_edit, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f71052a;
    }
}
