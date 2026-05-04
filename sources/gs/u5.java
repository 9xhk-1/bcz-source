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
public final class u5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56958a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56959b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final DisableMultilineIMEEditText f56960c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56961d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56962e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56963f;

    public u5(@NonNull RelativeLayout rootView, @NonNull TextView cancel, @NonNull DisableMultilineIMEEditText edit, @NonNull TextView submit, @NonNull TextView title, @NonNull RelativeLayout window) {
        this.f56958a = rootView;
        this.f56959b = cancel;
        this.f56960c = edit;
        this.f56961d = submit;
        this.f56962e = title;
        this.f56963f = window;
    }

    @NonNull
    public static u5 a(@NonNull View rootView) {
        int i11 = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel);
        if (textView != null) {
            i11 = R.id.edit;
            DisableMultilineIMEEditText disableMultilineIMEEditText = (DisableMultilineIMEEditText) ViewBindings.findChildViewById(rootView, R.id.edit);
            if (disableMultilineIMEEditText != null) {
                i11 = R.id.submit;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.submit);
                if (textView2 != null) {
                    i11 = R.id.title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                    if (textView3 != null) {
                        i11 = R.id.window;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.window);
                        if (relativeLayout != null) {
                            return new u5((RelativeLayout) rootView, textView, disableMultilineIMEEditText, textView2, textView3, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static u5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static u5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.comment_fragment_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56958a;
    }
}
