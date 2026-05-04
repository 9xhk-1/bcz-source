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
public final class b5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54229a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54230b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54231c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54232d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54233e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f54234f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54235g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54236h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54237i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54238j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54239k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54240l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54241m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54242n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54243o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54244p;

    public b5(@NonNull LinearLayout rootView, @NonNull TextView day10, @NonNull TextView day11, @NonNull TextView day12, @NonNull TextView day13, @NonNull TextView day14, @NonNull TextView day8, @NonNull TextView day9, @NonNull RelativeLayout dayShell10, @NonNull RelativeLayout dayShell11, @NonNull RelativeLayout dayShell12, @NonNull RelativeLayout dayShell13, @NonNull RelativeLayout dayShell14, @NonNull RelativeLayout dayShell8, @NonNull RelativeLayout dayShell9, @NonNull LinearLayout weekRow2) {
        this.f54229a = rootView;
        this.f54230b = day10;
        this.f54231c = day11;
        this.f54232d = day12;
        this.f54233e = day13;
        this.f54234f = day14;
        this.f54235g = day8;
        this.f54236h = day9;
        this.f54237i = dayShell10;
        this.f54238j = dayShell11;
        this.f54239k = dayShell12;
        this.f54240l = dayShell13;
        this.f54241m = dayShell14;
        this.f54242n = dayShell8;
        this.f54243o = dayShell9;
        this.f54244p = weekRow2;
    }

    @NonNull
    public static b5 a(@NonNull View rootView) {
        int i11 = R.id.day_10;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_10);
        if (textView != null) {
            i11 = R.id.day_11;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_11);
            if (textView2 != null) {
                i11 = R.id.day_12;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_12);
                if (textView3 != null) {
                    i11 = R.id.day_13;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_13);
                    if (textView4 != null) {
                        i11 = R.id.day_14;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_14);
                        if (textView5 != null) {
                            i11 = R.id.day_8;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_8);
                            if (textView6 != null) {
                                i11 = R.id.day_9;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_9);
                                if (textView7 != null) {
                                    i11 = R.id.day_shell_10;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_10);
                                    if (relativeLayout != null) {
                                        i11 = R.id.day_shell_11;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_11);
                                        if (relativeLayout2 != null) {
                                            i11 = R.id.day_shell_12;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_12);
                                            if (relativeLayout3 != null) {
                                                i11 = R.id.day_shell_13;
                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_13);
                                                if (relativeLayout4 != null) {
                                                    i11 = R.id.day_shell_14;
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_14);
                                                    if (relativeLayout5 != null) {
                                                        i11 = R.id.day_shell_8;
                                                        RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_8);
                                                        if (relativeLayout6 != null) {
                                                            i11 = R.id.day_shell_9;
                                                            RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_9);
                                                            if (relativeLayout7 != null) {
                                                                LinearLayout linearLayout = (LinearLayout) rootView;
                                                                return new b5(linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, relativeLayout7, linearLayout);
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
    public static b5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static b5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.calendar_week_row_2, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f54229a;
    }
}
