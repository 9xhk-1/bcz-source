package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class g6 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54999a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Button f55000b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f55001c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Button f55002d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Button f55003e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f55004f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Button f55005g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Button f55006h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Button f55007i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final Button f55008j;

    public g6(@NonNull LinearLayout rootView, @NonNull Button button00, @NonNull Button button01, @NonNull Button button02, @NonNull Button button10, @NonNull Button button11, @NonNull Button button12, @NonNull Button button20, @NonNull Button button21, @NonNull Button button22) {
        this.f54999a = rootView;
        this.f55000b = button00;
        this.f55001c = button01;
        this.f55002d = button02;
        this.f55003e = button10;
        this.f55004f = button11;
        this.f55005g = button12;
        this.f55006h = button20;
        this.f55007i = button21;
        this.f55008j = button22;
    }

    @NonNull
    public static g6 a(@NonNull View rootView) {
        int i11 = R.id.button00;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.button00);
        if (button != null) {
            i11 = R.id.button01;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.button01);
            if (button2 != null) {
                i11 = R.id.button02;
                Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.button02);
                if (button3 != null) {
                    i11 = R.id.button10;
                    Button button4 = (Button) ViewBindings.findChildViewById(rootView, R.id.button10);
                    if (button4 != null) {
                        i11 = R.id.button11;
                        Button button5 = (Button) ViewBindings.findChildViewById(rootView, R.id.button11);
                        if (button5 != null) {
                            i11 = R.id.button12;
                            Button button6 = (Button) ViewBindings.findChildViewById(rootView, R.id.button12);
                            if (button6 != null) {
                                i11 = R.id.button20;
                                Button button7 = (Button) ViewBindings.findChildViewById(rootView, R.id.button20);
                                if (button7 != null) {
                                    i11 = R.id.button21;
                                    Button button8 = (Button) ViewBindings.findChildViewById(rootView, R.id.button21);
                                    if (button8 != null) {
                                        i11 = R.id.button22;
                                        Button button9 = (Button) ViewBindings.findChildViewById(rootView, R.id.button22);
                                        if (button9 != null) {
                                            return new g6((LinearLayout) rootView, button, button2, button3, button4, button5, button6, button7, button8, button9);
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
    public static g6 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static g6 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dial_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f54999a;
    }
}
