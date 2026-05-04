package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.util.Pair;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.m0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class l<S> extends DialogFragment {
    public static final String E = "OVERRIDE_THEME_RES_ID";
    public static final String F = "DATE_SELECTOR_KEY";
    public static final String G = "CALENDAR_CONSTRAINTS_KEY";
    public static final String H = "DAY_VIEW_DECORATOR_KEY";
    public static final String I = "TITLE_TEXT_RES_ID_KEY";
    public static final String J = "TITLE_TEXT_KEY";
    public static final String K = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";
    public static final String L = "POSITIVE_BUTTON_TEXT_KEY";
    public static final String M = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    public static final String N = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    public static final String O = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";
    public static final String P = "NEGATIVE_BUTTON_TEXT_KEY";
    public static final String Q = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    public static final String R = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    public static final String S = "INPUT_MODE_KEY";
    public static final Object T = "CONFIRM_BUTTON_TAG";
    public static final Object U = "CANCEL_BUTTON_TAG";
    public static final Object V = "TOGGLE_BUTTON_TAG";
    public static final int W = 0;
    public static final int X = 1;
    public Button A;
    public boolean B;

    @Nullable
    public CharSequence C;

    @Nullable
    public CharSequence D;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<m<? super S>> f31216a = new LinkedHashSet<>();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f31217b = new LinkedHashSet<>();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f31218c = new LinkedHashSet<>();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f31219d = new LinkedHashSet<>();

    /* renamed from: e, reason: collision with root package name */
    @StyleRes
    public int f31220e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public DateSelector<S> f31221f;

    /* renamed from: g, reason: collision with root package name */
    public s<S> f31222g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public CalendarConstraints f31223h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public DayViewDecorator f31224i;

    /* renamed from: j, reason: collision with root package name */
    public j<S> f31225j;

    /* renamed from: k, reason: collision with root package name */
    @StringRes
    public int f31226k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f31227l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31228m;

    /* renamed from: n, reason: collision with root package name */
    public int f31229n;

    /* renamed from: o, reason: collision with root package name */
    @StringRes
    public int f31230o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f31231p;

    /* renamed from: q, reason: collision with root package name */
    @StringRes
    public int f31232q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f31233r;

    /* renamed from: s, reason: collision with root package name */
    @StringRes
    public int f31234s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f31235t;

    /* renamed from: u, reason: collision with root package name */
    @StringRes
    public int f31236u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f31237v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f31238w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f31239x;

    /* renamed from: y, reason: collision with root package name */
    public CheckableImageButton f31240y;

    /* renamed from: z, reason: collision with root package name */
    @Nullable
    public vn.k f31241z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = l.this.f31216a.iterator();
            while (it.hasNext()) {
                ((m) it.next()).a(l.this.P());
            }
            l.this.dismiss();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = l.this.f31217b.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            l.this.dismiss();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements OnApplyWindowInsetsListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f31244a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f31245b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f31246c;

        public c(int i11, View view, int i12) {
            this.f31244a = i11;
            this.f31245b = view;
            this.f31246c = i12;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            int i11 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top;
            if (this.f31244a >= 0) {
                this.f31245b.getLayoutParams().height = this.f31244a + i11;
                View view2 = this.f31245b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f31245b;
            view3.setPadding(view3.getPaddingLeft(), this.f31246c + i11, this.f31245b.getPaddingRight(), this.f31245b.getPaddingBottom());
            return windowInsetsCompat;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends r<S> {
        public d() {
        }

        @Override // com.google.android.material.datepicker.r
        public void a() {
            l.this.A.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.r
        public void b(S s11) {
            l lVar = l.this;
            lVar.e0(lVar.M());
            l.this.A.setEnabled(l.this.J().h0());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<S> {

        /* renamed from: a, reason: collision with root package name */
        public final DateSelector<S> f31249a;

        /* renamed from: c, reason: collision with root package name */
        public CalendarConstraints f31251c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public DayViewDecorator f31252d;

        /* renamed from: b, reason: collision with root package name */
        public int f31250b = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f31253e = 0;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f31254f = null;

        /* renamed from: g, reason: collision with root package name */
        public int f31255g = 0;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f31256h = null;

        /* renamed from: i, reason: collision with root package name */
        public int f31257i = 0;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f31258j = null;

        /* renamed from: k, reason: collision with root package name */
        public int f31259k = 0;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f31260l = null;

        /* renamed from: m, reason: collision with root package name */
        public int f31261m = 0;

        /* renamed from: n, reason: collision with root package name */
        public CharSequence f31262n = null;

        /* renamed from: o, reason: collision with root package name */
        @Nullable
        public S f31263o = null;

        /* renamed from: p, reason: collision with root package name */
        public int f31264p = 0;

        public e(DateSelector<S> dateSelector) {
            this.f31249a = dateSelector;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static <S> e<S> c(@NonNull DateSelector<S> dateSelector) {
            return new e<>(dateSelector);
        }

        @NonNull
        public static e<Long> d() {
            return new e<>(new SingleDateSelector());
        }

        @NonNull
        public static e<Pair<Long, Long>> e() {
            return new e<>(new RangeDateSelector());
        }

        public static boolean f(Month month, CalendarConstraints calendarConstraints) {
            return month.compareTo(calendarConstraints.o()) >= 0 && month.compareTo(calendarConstraints.i()) <= 0;
        }

        @NonNull
        public l<S> a() {
            if (this.f31251c == null) {
                this.f31251c = new CalendarConstraints.b().a();
            }
            if (this.f31253e == 0) {
                this.f31253e = this.f31249a.q();
            }
            S s11 = this.f31263o;
            if (s11 != null) {
                this.f31249a.Z(s11);
            }
            if (this.f31251c.m() == null) {
                this.f31251c.t(b());
            }
            return l.V(this);
        }

        public final Month b() {
            if (!this.f31249a.m0().isEmpty()) {
                Month c11 = Month.c(this.f31249a.m0().iterator().next().longValue());
                if (f(c11, this.f31251c)) {
                    return c11;
                }
            }
            Month d11 = Month.d();
            return f(d11, this.f31251c) ? d11 : this.f31251c.o();
        }

        @NonNull
        @uo.a
        public e<S> g(CalendarConstraints calendarConstraints) {
            this.f31251c = calendarConstraints;
            return this;
        }

        @NonNull
        @uo.a
        public e<S> h(@Nullable DayViewDecorator dayViewDecorator) {
            this.f31252d = dayViewDecorator;
            return this;
        }

        @NonNull
        @uo.a
        public e<S> i(int i11) {
            this.f31264p = i11;
            return this;
        }

        @NonNull
        @uo.a
        public e<S> j(@StringRes int i11) {
            this.f31261m = i11;
            this.f31262n = null;
            return this;
        }

        @NonNull
        @uo.a
        public e<S> k(@Nullable CharSequence charSequence) {
            this.f31262n = charSequence;
            this.f31261m = 0;
            return this;
        }

        @NonNull
        @uo.a
        public e<S> l(@StringRes int i11) {
            this.f31259k = i11;
            this.f31260l = null;
            return this;
        }

        @NonNull
        @uo.a
        public e<S> m(@Nullable CharSequence charSequence) {
            this.f31260l = charSequence;
            this.f31259k = 0;
            return this;
        }

        @NonNull
        @uo.a
        public e<S> n(@StringRes int i11) {
            this.f31257i = i11;
            this.f31258j = null;
            return this;
        }

        @NonNull
        @uo.a
        public e<S> o(@Nullable CharSequence charSequence) {
            this.f31258j = charSequence;
            this.f31257i = 0;
            return this;
        }

        @NonNull
        @uo.a
        public e<S> p(@StringRes int i11) {
            this.f31255g = i11;
            this.f31256h = null;
            return this;
        }

        @NonNull
        @uo.a
        public e<S> q(@Nullable CharSequence charSequence) {
            this.f31256h = charSequence;
            this.f31255g = 0;
            return this;
        }

        @NonNull
        @uo.a
        public e<S> r(S s11) {
            this.f31263o = s11;
            return this;
        }

        @NonNull
        @uo.a
        public e<S> s(@Nullable SimpleDateFormat simpleDateFormat) {
            this.f31249a.f0(simpleDateFormat);
            return this;
        }

        @NonNull
        @uo.a
        public e<S> t(@StyleRes int i11) {
            this.f31250b = i11;
            return this;
        }

        @NonNull
        @uo.a
        public e<S> u(@StringRes int i11) {
            this.f31253e = i11;
            this.f31254f = null;
            return this;
        }

        @NonNull
        @uo.a
        public e<S> v(@Nullable CharSequence charSequence) {
            this.f31254f = charSequence;
            this.f31253e = 0;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface f {
    }

    @NonNull
    public static Drawable H(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AppCompatResources.getDrawable(context, com.google.android.material.R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AppCompatResources.getDrawable(context, com.google.android.material.R.drawable.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector<S> J() {
        if (this.f31221f == null) {
            this.f31221f = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f31221f;
    }

    @Nullable
    public static CharSequence K(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
        return split.length > 1 ? split[0] : charSequence;
    }

    public static int O(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_content_padding);
        int i11 = Month.d().f31111d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_day_width) * i11) + ((i11 - 1) * resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    public static boolean S(@NonNull Context context) {
        return W(context, R.attr.windowFullscreen);
    }

    public static boolean U(@NonNull Context context) {
        return W(context, com.google.android.material.R.attr.nestedScrollable);
    }

    @NonNull
    public static <S> l<S> V(@NonNull e<S> eVar) {
        l<S> lVar = new l<>();
        Bundle bundle = new Bundle();
        bundle.putInt(E, eVar.f31250b);
        bundle.putParcelable("DATE_SELECTOR_KEY", eVar.f31249a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", eVar.f31251c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", eVar.f31252d);
        bundle.putInt(I, eVar.f31253e);
        bundle.putCharSequence(J, eVar.f31254f);
        bundle.putInt(S, eVar.f31264p);
        bundle.putInt(K, eVar.f31255g);
        bundle.putCharSequence(L, eVar.f31256h);
        bundle.putInt(M, eVar.f31257i);
        bundle.putCharSequence(N, eVar.f31258j);
        bundle.putInt(O, eVar.f31259k);
        bundle.putCharSequence(P, eVar.f31260l);
        bundle.putInt(Q, eVar.f31261m);
        bundle.putCharSequence(R, eVar.f31262n);
        lVar.setArguments(bundle);
        return lVar;
    }

    public static boolean W(@NonNull Context context, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(sn.b.g(context, com.google.android.material.R.attr.materialCalendarStyle, j.class.getCanonicalName()), new int[]{i11});
        boolean z11 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z11;
    }

    public static long c0() {
        return Month.d().f31113f;
    }

    public static long d0() {
        return v.v().getTimeInMillis();
    }

    public static /* synthetic */ void t(l lVar, View view) {
        lVar.A.setEnabled(lVar.J().h0());
        lVar.f31240y.toggle();
        lVar.f31229n = lVar.f31229n == 1 ? 0 : 1;
        lVar.g0(lVar.f31240y);
        lVar.b0();
    }

    public boolean A(DialogInterface.OnDismissListener onDismissListener) {
        return this.f31219d.add(onDismissListener);
    }

    public boolean B(View.OnClickListener onClickListener) {
        return this.f31217b.add(onClickListener);
    }

    public boolean C(m<? super S> mVar) {
        return this.f31216a.add(mVar);
    }

    public void D() {
        this.f31218c.clear();
    }

    public void E() {
        this.f31219d.clear();
    }

    public void F() {
        this.f31217b.clear();
    }

    public void G() {
        this.f31216a.clear();
    }

    public final void I(Window window) {
        if (this.B) {
            return;
        }
        View findViewById = requireView().findViewById(com.google.android.material.R.id.fullscreen_header);
        com.google.android.material.internal.e.b(window, true, m0.j(findViewById), null);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById, new c(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.B = true;
    }

    public final String L() {
        return J().A0(requireContext());
    }

    public String M() {
        return J().F0(getContext());
    }

    public int N() {
        return this.f31229n;
    }

    @Nullable
    public final S P() {
        return J().o0();
    }

    public final int Q(Context context) {
        int i11 = this.f31220e;
        return i11 != 0 ? i11 : J().w(context);
    }

    public final void R(Context context) {
        this.f31240y.setTag(V);
        this.f31240y.setImageDrawable(H(context));
        this.f31240y.setChecked(this.f31229n != 0);
        ViewCompat.setAccessibilityDelegate(this.f31240y, null);
        g0(this.f31240y);
        this.f31240y.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.t(l.this, view);
            }
        });
    }

    public final boolean T() {
        return getResources().getConfiguration().orientation == 2;
    }

    public boolean X(DialogInterface.OnCancelListener onCancelListener) {
        return this.f31218c.remove(onCancelListener);
    }

    public boolean Y(DialogInterface.OnDismissListener onDismissListener) {
        return this.f31219d.remove(onDismissListener);
    }

    public boolean Z(View.OnClickListener onClickListener) {
        return this.f31217b.remove(onClickListener);
    }

    public boolean a0(m<? super S> mVar) {
        return this.f31216a.remove(mVar);
    }

    public final void b0() {
        int Q2 = Q(requireContext());
        o O2 = j.O(J(), Q2, this.f31223h, this.f31224i);
        this.f31225j = O2;
        if (this.f31229n == 1) {
            O2 = o.y(J(), Q2, this.f31223h);
        }
        this.f31222g = O2;
        f0();
        e0(M());
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        beginTransaction.replace(com.google.android.material.R.id.mtrl_calendar_frame, this.f31222g);
        beginTransaction.commitNow();
        this.f31222g.t(new d());
    }

    @VisibleForTesting
    public void e0(String str) {
        this.f31239x.setContentDescription(L());
        this.f31239x.setText(str);
    }

    public final void f0() {
        this.f31238w.setText((this.f31229n == 1 && T()) ? this.D : this.C);
    }

    public final void g0(@NonNull CheckableImageButton checkableImageButton) {
        this.f31240y.setContentDescription(this.f31229n == 1 ? checkableImageButton.getContext().getString(com.google.android.material.R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(com.google.android.material.R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f31218c.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f31220e = bundle.getInt(E);
        this.f31221f = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f31223h = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f31224i = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f31226k = bundle.getInt(I);
        this.f31227l = bundle.getCharSequence(J);
        this.f31229n = bundle.getInt(S);
        this.f31230o = bundle.getInt(K);
        this.f31231p = bundle.getCharSequence(L);
        this.f31232q = bundle.getInt(M);
        this.f31233r = bundle.getCharSequence(N);
        this.f31234s = bundle.getInt(O);
        this.f31235t = bundle.getCharSequence(P);
        this.f31236u = bundle.getInt(Q);
        this.f31237v = bundle.getCharSequence(R);
        CharSequence charSequence = this.f31227l;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f31226k);
        }
        this.C = charSequence;
        this.D = K(charSequence);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), Q(requireContext()));
        Context context = dialog.getContext();
        this.f31228m = S(context);
        int i11 = com.google.android.material.R.attr.materialCalendarStyle;
        int i12 = com.google.android.material.R.style.Widget_MaterialComponents_MaterialCalendar;
        this.f31241z = new vn.k(context, null, i11, i12);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, com.google.android.material.R.styleable.MaterialCalendar, i11, i12);
        int color = obtainStyledAttributes.getColor(com.google.android.material.R.styleable.MaterialCalendar_backgroundTint, 0);
        obtainStyledAttributes.recycle();
        this.f31241z.a0(context);
        this.f31241z.p0(ColorStateList.valueOf(color));
        this.f31241z.o0(ViewCompat.getElevation(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f31228m ? com.google.android.material.R.layout.mtrl_picker_fullscreen : com.google.android.material.R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        DayViewDecorator dayViewDecorator = this.f31224i;
        if (dayViewDecorator != null) {
            dayViewDecorator.i(context);
        }
        if (this.f31228m) {
            inflate.findViewById(com.google.android.material.R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(O(context), -2));
        } else {
            inflate.findViewById(com.google.android.material.R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(O(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(com.google.android.material.R.id.mtrl_picker_header_selection_text);
        this.f31239x = textView;
        ViewCompat.setAccessibilityLiveRegion(textView, 1);
        this.f31240y = (CheckableImageButton) inflate.findViewById(com.google.android.material.R.id.mtrl_picker_header_toggle);
        this.f31238w = (TextView) inflate.findViewById(com.google.android.material.R.id.mtrl_picker_title_text);
        R(context);
        this.A = (Button) inflate.findViewById(com.google.android.material.R.id.confirm_button);
        if (J().h0()) {
            this.A.setEnabled(true);
        } else {
            this.A.setEnabled(false);
        }
        this.A.setTag(T);
        CharSequence charSequence = this.f31231p;
        if (charSequence != null) {
            this.A.setText(charSequence);
        } else {
            int i11 = this.f31230o;
            if (i11 != 0) {
                this.A.setText(i11);
            }
        }
        CharSequence charSequence2 = this.f31233r;
        if (charSequence2 != null) {
            this.A.setContentDescription(charSequence2);
        } else if (this.f31232q != 0) {
            this.A.setContentDescription(getContext().getResources().getText(this.f31232q));
        }
        this.A.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(com.google.android.material.R.id.cancel_button);
        button.setTag(U);
        CharSequence charSequence3 = this.f31235t;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i12 = this.f31234s;
            if (i12 != 0) {
                button.setText(i12);
            }
        }
        CharSequence charSequence4 = this.f31237v;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f31236u != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f31236u));
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f31219d.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(E, this.f31220e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f31221f);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f31223h);
        j<S> jVar = this.f31225j;
        Month J2 = jVar == null ? null : jVar.J();
        if (J2 != null) {
            bVar.d(J2.f31113f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f31224i);
        bundle.putInt(I, this.f31226k);
        bundle.putCharSequence(J, this.f31227l);
        bundle.putInt(S, this.f31229n);
        bundle.putInt(K, this.f31230o);
        bundle.putCharSequence(L, this.f31231p);
        bundle.putInt(M, this.f31232q);
        bundle.putCharSequence(N, this.f31233r);
        bundle.putInt(O, this.f31234s);
        bundle.putCharSequence(P, this.f31235t);
        bundle.putInt(Q, this.f31236u);
        bundle.putCharSequence(R, this.f31237v);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f31228m) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f31241z);
            I(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f31241z, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new in.a(requireDialog(), rect));
        }
        b0();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.f31222g.v();
        super.onStop();
    }

    public boolean z(DialogInterface.OnCancelListener onCancelListener) {
        return this.f31218c.add(onCancelListener);
    }
}
