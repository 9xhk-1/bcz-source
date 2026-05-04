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
public final class f5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54865a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54866b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54867c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54868d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54869e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f54870f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54871g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54872h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54873i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54874j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54875k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54876l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54877m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54878n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54879o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54880p;

    public f5(@NonNull LinearLayout rootView, @NonNull TextView day36, @NonNull TextView day37, @NonNull TextView day38, @NonNull TextView day39, @NonNull TextView day40, @NonNull TextView day41, @NonNull TextView day42, @NonNull RelativeLayout dayShell36, @NonNull RelativeLayout dayShell37, @NonNull RelativeLayout dayShell38, @NonNull RelativeLayout dayShell39, @NonNull RelativeLayout dayShell40, @NonNull RelativeLayout dayShell41, @NonNull RelativeLayout dayShell42, @NonNull LinearLayout weekRow6) {
        this.f54865a = rootView;
        this.f54866b = day36;
        this.f54867c = day37;
        this.f54868d = day38;
        this.f54869e = day39;
        this.f54870f = day40;
        this.f54871g = day41;
        this.f54872h = day42;
        this.f54873i = dayShell36;
        this.f54874j = dayShell37;
        this.f54875k = dayShell38;
        this.f54876l = dayShell39;
        this.f54877m = dayShell40;
        this.f54878n = dayShell41;
        this.f54879o = dayShell42;
        this.f54880p = weekRow6;
    }

    @NonNull
    public static f5 a(@NonNull View rootView) {
        int i11 = R.id.day_36;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_36);
        if (textView != null) {
            i11 = R.id.day_37;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_37);
            if (textView2 != null) {
                i11 = R.id.day_38;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_38);
                if (textView3 != null) {
                    i11 = R.id.day_39;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_39);
                    if (textView4 != null) {
                        i11 = R.id.day_40;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_40);
                        if (textView5 != null) {
                            i11 = R.id.day_41;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_41);
                            if (textView6 != null) {
                                i11 = R.id.day_42;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_42);
                                if (textView7 != null) {
                                    i11 = R.id.day_shell_36;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_36);
                                    if (relativeLayout != null) {
                                        i11 = R.id.day_shell_37;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_37);
                                        if (relativeLayout2 != null) {
                                            i11 = R.id.day_shell_38;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_38);
                                            if (relativeLayout3 != null) {
                                                i11 = R.id.day_shell_39;
                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_39);
                                                if (relativeLayout4 != null) {
                                                    i11 = R.id.day_shell_40;
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_40);
                                                    if (relativeLayout5 != null) {
                                                        i11 = R.id.day_shell_41;
                                                        RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_41);
                                                        if (relativeLayout6 != null) {
                                                            i11 = R.id.day_shell_42;
                                                            RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_shell_42);
                                                            if (relativeLayout7 != null) {
                                                                LinearLayout linearLayout = (LinearLayout) rootView;
                                                                return new f5(linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, relativeLayout7, linearLayout);
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
    public static f5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static f5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.calendar_week_row_6, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f54865a;
    }
}
