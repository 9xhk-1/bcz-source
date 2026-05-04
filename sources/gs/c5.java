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
public final class c5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54381a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54382b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54383c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54384d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54385e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f54386f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54387g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54388h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54389i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54390j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54391k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54392l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54393m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54394n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54395o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54396p;

    public c5(@NonNull LinearLayout rootView, @NonNull TextView day15, @NonNull TextView day16, @NonNull TextView day17, @NonNull TextView day18, @NonNull TextView day19, @NonNull TextView day20, @NonNull TextView day21, @NonNull RelativeLayout dayShell15, @NonNull RelativeLayout dayShell16, @NonNull RelativeLayout dayShell17, @NonNull RelativeLayout dayShell18, @NonNull RelativeLayout dayShell19, @NonNull RelativeLayout dayShell20, @NonNull RelativeLayout dayShell21, @NonNull LinearLayout weekRow3) {
        this.f54381a = rootView;
        this.f54382b = day15;
        this.f54383c = day16;
        this.f54384d = day17;
        this.f54385e = day18;
        this.f54386f = day19;
        this.f54387g = day20;
        this.f54388h = day21;
        this.f54389i = dayShell15;
        this.f54390j = dayShell16;
        this.f54391k = dayShell17;
        this.f54392l = dayShell18;
        this.f54393m = dayShell19;
        this.f54394n = dayShell20;
        this.f54395o = dayShell21;
        this.f54396p = weekRow3;
    }

    @NonNull
    public static c5 a(@NonNull View rootView) {
        int i11 = R.id.day_15;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_15);
        if (textView != null) {
            i11 = R.id.day_16;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_16);
            if (textView2 != null) {
                i11 = R.id.day_17;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_17);
                if (textView3 != null) {
                    i11 = R.id.day_18;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_18);
                    if (textView4 != null) {
                        i11 = R.id.day_19;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_19);
                        if (textView5 != null) {
                            i11 = R.id.day_20;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_20);
                            if (textView6 != null) {
                                i11 = R.id.day_21;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_21);
                                if (textView7 != null) {
                                    i11 = R.id.day_shell_15;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_15);
                                    if (relativeLayout != null) {
                                        i11 = R.id.day_shell_16;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_16);
                                        if (relativeLayout2 != null) {
                                            i11 = R.id.day_shell_17;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_17);
                                            if (relativeLayout3 != null) {
                                                i11 = R.id.day_shell_18;
                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_18);
                                                if (relativeLayout4 != null) {
                                                    i11 = R.id.day_shell_19;
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_19);
                                                    if (relativeLayout5 != null) {
                                                        i11 = R.id.day_shell_20;
                                                        RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_20);
                                                        if (relativeLayout6 != null) {
                                                            i11 = R.id.day_shell_21;
                                                            RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_21);
                                                            if (relativeLayout7 != null) {
                                                                LinearLayout linearLayout = (LinearLayout) rootView;
                                                                return new c5(linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, relativeLayout7, linearLayout);
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
    public static c5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static c5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.calendar_week_row_3, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f54381a;
    }
}
