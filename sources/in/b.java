package in;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import en.u;
import vn.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b extends AlertDialog.Builder {

    /* renamed from: c, reason: collision with root package name */
    @AttrRes
    public static final int f60717c = R.attr.alertDialogStyle;

    /* renamed from: d, reason: collision with root package name */
    @StyleRes
    public static final int f60718d = R.style.MaterialAlertDialog_MaterialComponents;

    /* renamed from: e, reason: collision with root package name */
    @AttrRes
    public static final int f60719e = R.attr.materialAlertDialogTheme;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public Drawable f60720a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Rect f60721b;

    public b(@NonNull Context context) {
        this(context, 0);
    }

    public static Context a(@NonNull Context context) {
        int c11 = c(context);
        Context c12 = zn.a.c(context, null, f60717c, f60718d);
        return c11 == 0 ? c12 : new ContextThemeWrapper(c12, c11);
    }

    public static int c(@NonNull Context context) {
        TypedValue a11 = sn.b.a(context, f60719e);
        if (a11 == null) {
            return 0;
        }
        return a11.data;
    }

    public static int d(@NonNull Context context, int i11) {
        return i11 == 0 ? c(context) : i11;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public b setNeutralButton(@StringRes int i11, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNeutralButton(i11, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public b setNeutralButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public b setNeutralButtonIcon(@Nullable Drawable drawable) {
        return (b) super.setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public b setOnCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
        return (b) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public b setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        return (b) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public b setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (b) super.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public b setOnKeyListener(@Nullable DialogInterface.OnKeyListener onKeyListener) {
        return (b) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public b setPositiveButton(@StringRes int i11, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(i11, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public b setPositiveButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public b setPositiveButtonIcon(@Nullable Drawable drawable) {
        return (b) super.setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public b setSingleChoiceItems(@ArrayRes int i11, int i12, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (b) super.setSingleChoiceItems(i11, i12, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public b setSingleChoiceItems(@Nullable Cursor cursor, int i11, @NonNull String str, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (b) super.setSingleChoiceItems(cursor, i11, str, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b setSingleChoiceItems(@Nullable ListAdapter listAdapter, int i11, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (b) super.setSingleChoiceItems(listAdapter, i11, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public b setSingleChoiceItems(@Nullable CharSequence[] charSequenceArr, int i11, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (b) super.setSingleChoiceItems(charSequenceArr, i11, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public b setTitle(@StringRes int i11) {
        return (b) super.setTitle(i11);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public b setTitle(@Nullable CharSequence charSequence) {
        return (b) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public b setView(int i11) {
        return (b) super.setView(i11);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public b setView(@Nullable View view) {
        return (b) super.setView(view);
    }

    @Nullable
    public Drawable b() {
        return this.f60720a;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public AlertDialog create() {
        AlertDialog create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f60720a;
        if (drawable instanceof k) {
            ((k) drawable).o0(ViewCompat.getElevation(decorView));
        }
        window.setBackgroundDrawable(c.b(this.f60720a, this.f60721b));
        decorView.setOnTouchListener(new a(create, this.f60721b));
        return create;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b setAdapter(@Nullable ListAdapter listAdapter, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (b) super.setAdapter(listAdapter, onClickListener);
    }

    @NonNull
    @uo.a
    public b f(@Nullable Drawable drawable) {
        this.f60720a = drawable;
        return this;
    }

    @NonNull
    @uo.a
    public b g(@Px int i11) {
        this.f60721b.bottom = i11;
        return this;
    }

    @NonNull
    @uo.a
    public b h(@Px int i11) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f60721b.left = i11;
            return this;
        }
        this.f60721b.right = i11;
        return this;
    }

    @NonNull
    @uo.a
    public b i(@Px int i11) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f60721b.right = i11;
            return this;
        }
        this.f60721b.left = i11;
        return this;
    }

    @NonNull
    @uo.a
    public b j(@Px int i11) {
        this.f60721b.top = i11;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b setCancelable(boolean z11) {
        return (b) super.setCancelable(z11);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b setCursor(@Nullable Cursor cursor, @Nullable DialogInterface.OnClickListener onClickListener, @NonNull String str) {
        return (b) super.setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public b setCustomTitle(@Nullable View view) {
        return (b) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public b setIcon(@DrawableRes int i11) {
        return (b) super.setIcon(i11);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public b setIcon(@Nullable Drawable drawable) {
        return (b) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public b setIconAttribute(@AttrRes int i11) {
        return (b) super.setIconAttribute(i11);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public b setItems(@ArrayRes int i11, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (b) super.setItems(i11, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public b setItems(@Nullable CharSequence[] charSequenceArr, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (b) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public b setMessage(@StringRes int i11) {
        return (b) super.setMessage(i11);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public b setMessage(@Nullable CharSequence charSequence) {
        return (b) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public b setMultiChoiceItems(@ArrayRes int i11, @Nullable boolean[] zArr, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.setMultiChoiceItems(i11, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public b setMultiChoiceItems(@Nullable Cursor cursor, @NonNull String str, @NonNull String str2, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public b setMultiChoiceItems(@Nullable CharSequence[] charSequenceArr, @Nullable boolean[] zArr, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public b setNegativeButton(@StringRes int i11, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNegativeButton(i11, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public b setNegativeButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @uo.a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public b setNegativeButtonIcon(@Nullable Drawable drawable) {
        return (b) super.setNegativeButtonIcon(drawable);
    }

    public b(@NonNull Context context, int i11) {
        super(a(context), d(context, i11));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i12 = f60717c;
        int i13 = f60718d;
        this.f60721b = c.a(context2, i12, i13);
        int c11 = u.c(context2, R.attr.colorSurface, getClass().getCanonicalName());
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, R.styleable.MaterialAlertDialog, i12, i13);
        int color = obtainStyledAttributes.getColor(R.styleable.MaterialAlertDialog_backgroundTint, c11);
        obtainStyledAttributes.recycle();
        k kVar = new k(context2, null, i12, i13);
        kVar.a0(context2);
        kVar.p0(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                kVar.l0(dimension);
            }
        }
        this.f60720a = kVar;
    }
}
