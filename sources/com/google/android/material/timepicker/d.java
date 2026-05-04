package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d extends DialogFragment implements TimePickerView.d {
    public static final String A = "TIME_PICKER_TITLE_RES";
    public static final String B = "TIME_PICKER_TITLE_TEXT";
    public static final String C = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";
    public static final String D = "TIME_PICKER_POSITIVE_BUTTON_TEXT";
    public static final String E = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";
    public static final String F = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";
    public static final String G = "TIME_PICKER_OVERRIDE_THEME_RES_ID";

    /* renamed from: w, reason: collision with root package name */
    public static final int f32613w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final int f32614x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static final String f32615y = "TIME_PICKER_TIME_MODEL";

    /* renamed from: z, reason: collision with root package name */
    public static final String f32616z = "TIME_PICKER_INPUT_MODE";

    /* renamed from: e, reason: collision with root package name */
    public TimePickerView f32621e;

    /* renamed from: f, reason: collision with root package name */
    public ViewStub f32622f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public h f32623g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public m f32624h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public j f32625i;

    /* renamed from: j, reason: collision with root package name */
    @DrawableRes
    public int f32626j;

    /* renamed from: k, reason: collision with root package name */
    @DrawableRes
    public int f32627k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f32629m;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f32631o;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f32633q;

    /* renamed from: r, reason: collision with root package name */
    public MaterialButton f32634r;

    /* renamed from: s, reason: collision with root package name */
    public Button f32635s;

    /* renamed from: u, reason: collision with root package name */
    public TimeModel f32637u;

    /* renamed from: a, reason: collision with root package name */
    public final Set<View.OnClickListener> f32617a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Set<View.OnClickListener> f32618b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public final Set<DialogInterface.OnCancelListener> f32619c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public final Set<DialogInterface.OnDismissListener> f32620d = new LinkedHashSet();

    /* renamed from: l, reason: collision with root package name */
    @StringRes
    public int f32628l = 0;

    /* renamed from: n, reason: collision with root package name */
    @StringRes
    public int f32630n = 0;

    /* renamed from: p, reason: collision with root package name */
    @StringRes
    public int f32632p = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f32636t = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f32638v = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = d.this.f32617a.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            d.this.dismiss();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = d.this.f32618b.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            d.this.dismiss();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            dVar.f32636t = dVar.f32636t == 0 ? 1 : 0;
            d dVar2 = d.this;
            dVar2.b0(dVar2.f32634r);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.timepicker.d$d, reason: collision with other inner class name */
    public static final class C0379d {

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public Integer f32643b;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f32645d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f32647f;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f32649h;

        /* renamed from: a, reason: collision with root package name */
        public TimeModel f32642a = new TimeModel();

        /* renamed from: c, reason: collision with root package name */
        @StringRes
        public int f32644c = 0;

        /* renamed from: e, reason: collision with root package name */
        @StringRes
        public int f32646e = 0;

        /* renamed from: g, reason: collision with root package name */
        @StringRes
        public int f32648g = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f32650i = 0;

        @NonNull
        public d j() {
            return d.R(this);
        }

        @NonNull
        @uo.a
        public C0379d k(@IntRange(from = 0, to = 23) int i11) {
            this.f32642a.j(i11);
            return this;
        }

        @NonNull
        @uo.a
        public C0379d l(int i11) {
            this.f32643b = Integer.valueOf(i11);
            return this;
        }

        @NonNull
        @uo.a
        public C0379d m(@IntRange(from = 0, to = 59) int i11) {
            this.f32642a.k(i11);
            return this;
        }

        @NonNull
        @uo.a
        public C0379d n(@StringRes int i11) {
            this.f32648g = i11;
            return this;
        }

        @NonNull
        @uo.a
        public C0379d o(@Nullable CharSequence charSequence) {
            this.f32649h = charSequence;
            return this;
        }

        @NonNull
        @uo.a
        public C0379d p(@StringRes int i11) {
            this.f32646e = i11;
            return this;
        }

        @NonNull
        @uo.a
        public C0379d q(@Nullable CharSequence charSequence) {
            this.f32647f = charSequence;
            return this;
        }

        @NonNull
        @uo.a
        public C0379d r(@StyleRes int i11) {
            this.f32650i = i11;
            return this;
        }

        @NonNull
        @uo.a
        public C0379d s(int i11) {
            TimeModel timeModel = this.f32642a;
            int i12 = timeModel.f32592d;
            int i13 = timeModel.f32593e;
            TimeModel timeModel2 = new TimeModel(i11);
            this.f32642a = timeModel2;
            timeModel2.k(i13);
            this.f32642a.j(i12);
            return this;
        }

        @NonNull
        @uo.a
        public C0379d t(@StringRes int i11) {
            this.f32644c = i11;
            return this;
        }

        @NonNull
        @uo.a
        public C0379d u(@Nullable CharSequence charSequence) {
            this.f32645d = charSequence;
            return this;
        }
    }

    @NonNull
    public static d R(@NonNull C0379d c0379d) {
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putParcelable(f32615y, c0379d.f32642a);
        if (c0379d.f32643b != null) {
            bundle.putInt(f32616z, c0379d.f32643b.intValue());
        }
        bundle.putInt(A, c0379d.f32644c);
        if (c0379d.f32645d != null) {
            bundle.putCharSequence(B, c0379d.f32645d);
        }
        bundle.putInt(C, c0379d.f32646e);
        if (c0379d.f32647f != null) {
            bundle.putCharSequence(D, c0379d.f32647f);
        }
        bundle.putInt(E, c0379d.f32648g);
        if (c0379d.f32649h != null) {
            bundle.putCharSequence(F, c0379d.f32649h);
        }
        bundle.putInt(G, c0379d.f32650i);
        dVar.setArguments(bundle);
        return dVar;
    }

    public static /* synthetic */ void t(d dVar) {
        j jVar = dVar.f32625i;
        if (jVar instanceof m) {
            ((m) jVar).g();
        }
    }

    public boolean C(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.f32619c.add(onCancelListener);
    }

    public boolean D(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.f32620d.add(onDismissListener);
    }

    public boolean E(@NonNull View.OnClickListener onClickListener) {
        return this.f32618b.add(onClickListener);
    }

    public boolean F(@NonNull View.OnClickListener onClickListener) {
        return this.f32617a.add(onClickListener);
    }

    public void G() {
        this.f32619c.clear();
    }

    public void H() {
        this.f32620d.clear();
    }

    public void I() {
        this.f32618b.clear();
    }

    public void J() {
        this.f32617a.clear();
    }

    public final Pair<Integer, Integer> K(int i11) {
        if (i11 == 0) {
            return new Pair<>(Integer.valueOf(this.f32626j), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        }
        if (i11 == 1) {
            return new Pair<>(Integer.valueOf(this.f32627k), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        }
        throw new IllegalArgumentException("no icon for mode: " + i11);
    }

    @IntRange(from = 0, to = 23)
    public int L() {
        return this.f32637u.f32592d % 24;
    }

    public int M() {
        return this.f32636t;
    }

    @IntRange(from = 0, to = 59)
    public int N() {
        return this.f32637u.f32593e;
    }

    public final int O() {
        int i11 = this.f32638v;
        if (i11 != 0) {
            return i11;
        }
        TypedValue a11 = sn.b.a(requireContext(), R.attr.materialTimePickerTheme);
        if (a11 == null) {
            return 0;
        }
        return a11.data;
    }

    @Nullable
    public h P() {
        return this.f32623g;
    }

    public final j Q(int i11, @NonNull TimePickerView timePickerView, @NonNull ViewStub viewStub) {
        if (i11 != 0) {
            if (this.f32624h == null) {
                this.f32624h = new m((LinearLayout) viewStub.inflate(), this.f32637u);
            }
            this.f32624h.e();
            return this.f32624h;
        }
        h hVar = this.f32623g;
        if (hVar == null) {
            hVar = new h(timePickerView, this.f32637u);
        }
        this.f32623g = hVar;
        return hVar;
    }

    public boolean S(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.f32619c.remove(onCancelListener);
    }

    public boolean T(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.f32620d.remove(onDismissListener);
    }

    public boolean U(@NonNull View.OnClickListener onClickListener) {
        return this.f32618b.remove(onClickListener);
    }

    public boolean V(@NonNull View.OnClickListener onClickListener) {
        return this.f32617a.remove(onClickListener);
    }

    public final void W(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable(f32615y);
        this.f32637u = timeModel;
        if (timeModel == null) {
            this.f32637u = new TimeModel();
        }
        this.f32636t = bundle.getInt(f32616z, this.f32637u.f32591c != 1 ? 0 : 1);
        this.f32628l = bundle.getInt(A, 0);
        this.f32629m = bundle.getCharSequence(B);
        this.f32630n = bundle.getInt(C, 0);
        this.f32631o = bundle.getCharSequence(D);
        this.f32632p = bundle.getInt(E, 0);
        this.f32633q = bundle.getCharSequence(F);
        this.f32638v = bundle.getInt(G, 0);
    }

    @VisibleForTesting
    public void X(@Nullable j jVar) {
        this.f32625i = jVar;
    }

    public void Y(@IntRange(from = 0, to = 23) int i11) {
        this.f32637u.i(i11);
        j jVar = this.f32625i;
        if (jVar != null) {
            jVar.invalidate();
        }
    }

    public void Z(@IntRange(from = 0, to = 59) int i11) {
        this.f32637u.k(i11);
        j jVar = this.f32625i;
        if (jVar != null) {
            jVar.invalidate();
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerView.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void a() {
        this.f32636t = 1;
        b0(this.f32634r);
        this.f32624h.g();
    }

    public final void a0() {
        Button button = this.f32635s;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    public final void b0(MaterialButton materialButton) {
        if (materialButton == null || this.f32621e == null || this.f32622f == null) {
            return;
        }
        j jVar = this.f32625i;
        if (jVar != null) {
            jVar.hide();
        }
        j Q = Q(this.f32636t, this.f32621e, this.f32622f);
        this.f32625i = Q;
        Q.show();
        this.f32625i.invalidate();
        Pair<Integer, Integer> K = K(this.f32636t);
        materialButton.setIconResource(((Integer) K.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) K.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f32619c.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        W(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), O());
        Context context = dialog.getContext();
        int i11 = R.attr.materialTimePickerStyle;
        int i12 = R.style.Widget_MaterialComponents_TimePicker;
        vn.k kVar = new vn.k(context, null, i11, i12);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.MaterialTimePicker, i11, i12);
        this.f32627k = obtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_clockIcon, 0);
        this.f32626j = obtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_keyboardIcon, 0);
        int color = obtainStyledAttributes.getColor(R.styleable.MaterialTimePicker_backgroundTint, 0);
        obtainStyledAttributes.recycle();
        kVar.a0(context);
        kVar.p0(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(kVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        kVar.o0(ViewCompat.getElevation(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.f32621e = timePickerView;
        timePickerView.r(this);
        this.f32622f = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.f32634r = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i11 = this.f32628l;
        if (i11 != 0) {
            textView.setText(i11);
        } else if (!TextUtils.isEmpty(this.f32629m)) {
            textView.setText(this.f32629m);
        }
        b0(this.f32634r);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new a());
        int i12 = this.f32630n;
        if (i12 != 0) {
            button.setText(i12);
        } else if (!TextUtils.isEmpty(this.f32631o)) {
            button.setText(this.f32631o);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.f32635s = button2;
        button2.setOnClickListener(new b());
        int i13 = this.f32632p;
        if (i13 != 0) {
            this.f32635s.setText(i13);
        } else if (!TextUtils.isEmpty(this.f32633q)) {
            this.f32635s.setText(this.f32633q);
        }
        a0();
        this.f32634r.setOnClickListener(new c());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f32625i = null;
        this.f32623g = null;
        this.f32624h = null;
        TimePickerView timePickerView = this.f32621e;
        if (timePickerView != null) {
            timePickerView.r(null);
            this.f32621e = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f32620d.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(f32615y, this.f32637u);
        bundle.putInt(f32616z, this.f32636t);
        bundle.putInt(A, this.f32628l);
        bundle.putCharSequence(B, this.f32629m);
        bundle.putInt(C, this.f32630n);
        bundle.putCharSequence(D, this.f32631o);
        bundle.putInt(E, this.f32632p);
        bundle.putCharSequence(F, this.f32633q);
        bundle.putInt(G, this.f32638v);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f32625i instanceof m) {
            view.postDelayed(new Runnable() { // from class: com.google.android.material.timepicker.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.t(d.this);
                }
            }, 100L);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z11) {
        super.setCancelable(z11);
        a0();
    }
}
