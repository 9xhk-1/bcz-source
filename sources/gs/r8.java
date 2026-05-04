package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class r8 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f56584a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final EditText f56585b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f56586c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56587d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final EmailAutoCompleteEditText f56588e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f56589f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final EditText f56590g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f56591h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Button f56592i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f56593j;

    public r8(@NonNull NestedScrollView rootView, @NonNull EditText confirmPassword, @NonNull ImageView confirmPasswordClear, @NonNull RelativeLayout container, @NonNull EmailAutoCompleteEditText email, @NonNull ImageView emailClear, @NonNull EditText password, @NonNull ImageView passwordClear, @NonNull Button register, @NonNull NestedScrollView scroll) {
        this.f56584a = rootView;
        this.f56585b = confirmPassword;
        this.f56586c = confirmPasswordClear;
        this.f56587d = container;
        this.f56588e = email;
        this.f56589f = emailClear;
        this.f56590g = password;
        this.f56591h = passwordClear;
        this.f56592i = register;
        this.f56593j = scroll;
    }

    @NonNull
    public static r8 a(@NonNull View rootView) {
        int i11 = R.id.confirm_password;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.confirm_password);
        if (editText != null) {
            i11 = R.id.confirm_password_clear;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.confirm_password_clear);
            if (imageView != null) {
                i11 = R.id.container;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                if (relativeLayout != null) {
                    i11 = R.id.email;
                    EmailAutoCompleteEditText emailAutoCompleteEditText = (EmailAutoCompleteEditText) ViewBindings.findChildViewById(rootView, R.id.email);
                    if (emailAutoCompleteEditText != null) {
                        i11 = R.id.email_clear;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.email_clear);
                        if (imageView2 != null) {
                            i11 = R.id.password;
                            EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.password);
                            if (editText2 != null) {
                                i11 = R.id.password_clear;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.password_clear);
                                if (imageView3 != null) {
                                    i11 = R.id.register;
                                    Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.register);
                                    if (button != null) {
                                        NestedScrollView nestedScrollView = (NestedScrollView) rootView;
                                        return new r8(nestedScrollView, editText, imageView, relativeLayout, emailAutoCompleteEditText, imageView2, editText2, imageView3, button, nestedScrollView);
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
    public static r8 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static r8 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_email_register, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f56584a;
    }
}
