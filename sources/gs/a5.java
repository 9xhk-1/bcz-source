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
public final class a5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54131a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54132b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54133c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54134d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54135e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f54136f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54137g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54138h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54139i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54140j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54141k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54142l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54143m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54144n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54145o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54146p;

    public a5(@NonNull LinearLayout rootView, @NonNull TextView day1, @NonNull TextView day2, @NonNull TextView day3, @NonNull TextView day4, @NonNull TextView day5, @NonNull TextView day6, @NonNull TextView day7, @NonNull RelativeLayout dayShell1, @NonNull RelativeLayout dayShell2, @NonNull RelativeLayout dayShell3, @NonNull RelativeLayout dayShell4, @NonNull RelativeLayout dayShell5, @NonNull RelativeLayout dayShell6, @NonNull RelativeLayout dayShell7, @NonNull LinearLayout weekRow1) {
        this.f54131a = rootView;
        this.f54132b = day1;
        this.f54133c = day2;
        this.f54134d = day3;
        this.f54135e = day4;
        this.f54136f = day5;
        this.f54137g = day6;
        this.f54138h = day7;
        this.f54139i = dayShell1;
        this.f54140j = dayShell2;
        this.f54141k = dayShell3;
        this.f54142l = dayShell4;
        this.f54143m = dayShell5;
        this.f54144n = dayShell6;
        this.f54145o = dayShell7;
        this.f54146p = weekRow1;
    }

    @NonNull
    public static a5 a(@NonNull View rootView) {
        int i11 = R.id.day_1;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_1);
        if (textView != null) {
            i11 = R.id.day_2;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_2);
            if (textView2 != null) {
                i11 = R.id.day_3;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_3);
                if (textView3 != null) {
                    i11 = R.id.day_4;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_4);
                    if (textView4 != null) {
                        i11 = R.id.day_5;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_5);
                        if (textView5 != null) {
                            i11 = R.id.day_6;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_6);
                            if (textView6 != null) {
                                i11 = R.id.day_7;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_7);
                                if (textView7 != null) {
                                    i11 = R.id.day_shell_1;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_1);
                                    if (relativeLayout != null) {
                                        i11 = R.id.day_shell_2;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_2);
                                        if (relativeLayout2 != null) {
                                            i11 = R.id.day_shell_3;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_3);
                                            if (relativeLayout3 != null) {
                                                i11 = R.id.day_shell_4;
                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_4);
                                                if (relativeLayout4 != null) {
                                                    i11 = R.id.day_shell_5;
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_5);
                                                    if (relativeLayout5 != null) {
                                                        i11 = R.id.day_shell_6;
                                                        RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_6);
                                                        if (relativeLayout6 != null) {
                                                            i11 = R.id.day_shell_7;
                                                            RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_7);
                                                            if (relativeLayout7 != null) {
                                                                LinearLayout linearLayout = (LinearLayout) rootView;
                                                                return new a5(linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, relativeLayout7, linearLayout);
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
    public static a5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static a5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.calendar_week_row_1, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f54131a;
    }
}
