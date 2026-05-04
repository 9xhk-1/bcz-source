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
public final class d5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54581a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54582b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54583c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54584d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54585e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f54586f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54587g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54588h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54589i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54590j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54591k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54592l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54593m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54594n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54595o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54596p;

    public d5(@NonNull LinearLayout rootView, @NonNull TextView day22, @NonNull TextView day23, @NonNull TextView day24, @NonNull TextView day25, @NonNull TextView day26, @NonNull TextView day27, @NonNull TextView day28, @NonNull RelativeLayout dayShell22, @NonNull RelativeLayout dayShell23, @NonNull RelativeLayout dayShell24, @NonNull RelativeLayout dayShell25, @NonNull RelativeLayout dayShell26, @NonNull RelativeLayout dayShell27, @NonNull RelativeLayout dayShell28, @NonNull LinearLayout weekRow4) {
        this.f54581a = rootView;
        this.f54582b = day22;
        this.f54583c = day23;
        this.f54584d = day24;
        this.f54585e = day25;
        this.f54586f = day26;
        this.f54587g = day27;
        this.f54588h = day28;
        this.f54589i = dayShell22;
        this.f54590j = dayShell23;
        this.f54591k = dayShell24;
        this.f54592l = dayShell25;
        this.f54593m = dayShell26;
        this.f54594n = dayShell27;
        this.f54595o = dayShell28;
        this.f54596p = weekRow4;
    }

    @NonNull
    public static d5 a(@NonNull View rootView) {
        int i11 = R.id.day_22;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_22);
        if (textView != null) {
            i11 = R.id.day_23;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_23);
            if (textView2 != null) {
                i11 = R.id.day_24;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_24);
                if (textView3 != null) {
                    i11 = R.id.day_25;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_25);
                    if (textView4 != null) {
                        i11 = R.id.day_26;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_26);
                        if (textView5 != null) {
                            i11 = R.id.day_27;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_27);
                            if (textView6 != null) {
                                i11 = R.id.day_28;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_28);
                                if (textView7 != null) {
                                    i11 = R.id.day_shell_22;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_22);
                                    if (relativeLayout != null) {
                                        i11 = R.id.day_shell_23;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_23);
                                        if (relativeLayout2 != null) {
                                            i11 = R.id.day_shell_24;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_24);
                                            if (relativeLayout3 != null) {
                                                i11 = R.id.day_shell_25;
                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_25);
                                                if (relativeLayout4 != null) {
                                                    i11 = R.id.day_shell_26;
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_26);
                                                    if (relativeLayout5 != null) {
                                                        i11 = R.id.day_shell_27;
                                                        RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_27);
                                                        if (relativeLayout6 != null) {
                                                            i11 = R.id.day_shell_28;
                                                            RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_28);
                                                            if (relativeLayout7 != null) {
                                                                LinearLayout linearLayout = (LinearLayout) rootView;
                                                                return new d5(linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, relativeLayout7, linearLayout);
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
    public static d5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static d5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.calendar_week_row_4, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f54581a;
    }
}
