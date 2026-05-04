package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54729a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54730b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54731c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54732d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54733e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f54734f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54735g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54736h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54737i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54738j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54739k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54740l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54741m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54742n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54743o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54744p;

    public e5(@NonNull LinearLayout rootView, @NonNull TextView day29, @NonNull TextView day30, @NonNull TextView day31, @NonNull TextView day32, @NonNull TextView day33, @NonNull TextView day34, @NonNull TextView day35, @NonNull RelativeLayout dayShell29, @NonNull RelativeLayout dayShell30, @NonNull RelativeLayout dayShell31, @NonNull RelativeLayout dayShell32, @NonNull RelativeLayout dayShell33, @NonNull RelativeLayout dayShell34, @NonNull RelativeLayout dayShell35, @NonNull LinearLayout weekRow5) {
        this.f54729a = rootView;
        this.f54730b = day29;
        this.f54731c = day30;
        this.f54732d = day31;
        this.f54733e = day32;
        this.f54734f = day33;
        this.f54735g = day34;
        this.f54736h = day35;
        this.f54737i = dayShell29;
        this.f54738j = dayShell30;
        this.f54739k = dayShell31;
        this.f54740l = dayShell32;
        this.f54741m = dayShell33;
        this.f54742n = dayShell34;
        this.f54743o = dayShell35;
        this.f54744p = weekRow5;
    }

    @NonNull
    public static e5 a(@NonNull View rootView) {
        int i11 = R.id.day_29;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_29);
        if (textView != null) {
            i11 = R.id.day_30;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_30);
            if (textView2 != null) {
                i11 = R.id.day_31;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_31);
                if (textView3 != null) {
                    i11 = R.id.day_32;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_32);
                    if (textView4 != null) {
                        i11 = R.id.day_33;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_33);
                        if (textView5 != null) {
                            i11 = R.id.day_34;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_34);
                            if (textView6 != null) {
                                i11 = R.id.day_35;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_35);
                                if (textView7 != null) {
                                    i11 = R.id.day_shell_29;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_29);
                                    if (relativeLayout != null) {
                                        i11 = R.id.day_shell_30;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_30);
                                        if (relativeLayout2 != null) {
                                            i11 = R.id.day_shell_31;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_31);
                                            if (relativeLayout3 != null) {
                                                i11 = R.id.day_shell_32;
                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_32);
                                                if (relativeLayout4 != null) {
                                                    i11 = R.id.day_shell_33;
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_33);
                                                    if (relativeLayout5 != null) {
                                                        i11 = R.id.day_shell_34;
                                                        RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_34);
                                                        if (relativeLayout6 != null) {
                                                            i11 = R.id.day_shell_35;
                                                            RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_35);
                                                            if (relativeLayout7 != null) {
                                                                LinearLayout linearLayout = (LinearLayout) rootView;
                                                                return new e5(linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, relativeLayout7, linearLayout);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static e5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static e5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.calendar_week_row_5, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f54729a;
    }
}
