package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.DisableMultilineIMEEditText;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ub implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56985a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f56986b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56987c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final DisableMultilineIMEEditText f56988d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56989e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56990f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f56991g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56992h;

    public ub(@NonNull RelativeLayout rootView, @NonNull View fbBgMask, @NonNull TextView fbCancel, @NonNull DisableMultilineIMEEditText fbEdit, @NonNull TextView fbLimit, @NonNull TextView fbSubmit, @NonNull TextView fbTitle, @NonNull RelativeLayout fbWindow) {
        this.f56985a = rootView;
        this.f56986b = fbBgMask;
        this.f56987c = fbCancel;
        this.f56988d = fbEdit;
        this.f56989e = fbLimit;
        this.f56990f = fbSubmit;
        this.f56991g = fbTitle;
        this.f56992h = fbWindow;
    }

    @NonNull
    public static ub a(@NonNull View rootView) {
        int i11 = R.id.fb_bg_mask;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.fb_bg_mask);
        if (findChildViewById != null) {
            i11 = R.id.fb_cancel;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.fb_cancel);
            if (textView != null) {
                i11 = R.id.fb_edit;
                DisableMultilineIMEEditText disableMultilineIMEEditText = (DisableMultilineIMEEditText) ViewBindings.findChildViewById(rootView, R.id.fb_edit);
                if (disableMultilineIMEEditText != null) {
                    i11 = R.id.fb_limit;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.fb_limit);
                    if (textView2 != null) {
                        i11 = R.id.fb_submit;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.fb_submit);
                        if (textView3 != null) {
                            i11 = R.id.fb_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.fb_title);
                            if (textView4 != null) {
                                i11 = R.id.fb_window;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.fb_window);
                                if (relativeLayout != null) {
                                    return new ub((RelativeLayout) rootView, findChildViewById, textView, disableMultilineIMEEditText, textView2, textView3, textView4, relativeLayout);
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
    public static ub c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ub d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_word_error_feedback, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56985a;
    }
}
