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
public final class vb implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57153a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f57154b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57155c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final DisableMultilineIMEEditText f57156d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57157e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57158f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57159g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57160h;

    public vb(@NonNull RelativeLayout rootView, @NonNull View fbBgMask, @NonNull TextView fbCancel, @NonNull DisableMultilineIMEEditText fbEdit, @NonNull TextView fbLimit, @NonNull TextView fbSubmit, @NonNull TextView fbTitle, @NonNull RelativeLayout fbWindow) {
        this.f57153a = rootView;
        this.f57154b = fbBgMask;
        this.f57155c = fbCancel;
        this.f57156d = fbEdit;
        this.f57157e = fbLimit;
        this.f57158f = fbSubmit;
        this.f57159g = fbTitle;
        this.f57160h = fbWindow;
    }

    @NonNull
    public static vb a(@NonNull View rootView) {
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
                                    return new vb((RelativeLayout) rootView, findChildViewById, textView, disableMultilineIMEEditText, textView2, textView3, textView4, relativeLayout);
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
    public static vb c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static vb d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_word_error_feedback_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f57153a;
    }
}
