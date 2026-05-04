package wn;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.R;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class n extends g<m> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f96538k = R.attr.sideSheetDialogTheme;

    /* renamed from: l, reason: collision with root package name */
    public static final int f96539l = R.style.Theme_Material3_Light_SideSheetDialog;

    public n(@NonNull Context context) {
        this(context, 0);
    }

    @Override // wn.g
    public void c(c<m> cVar) {
        cVar.e(new a());
    }

    @Override // wn.g, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // wn.g
    @NonNull
    public c<m> f(@NonNull FrameLayout frameLayout) {
        return SideSheetBehavior.D(frameLayout);
    }

    @Override // wn.g
    @IdRes
    public int h() {
        return R.id.m3_side_sheet;
    }

    @Override // wn.g
    @LayoutRes
    public int i() {
        return R.layout.m3_side_sheet_dialog;
    }

    @Override // wn.g
    public int k() {
        return 3;
    }

    @Override // wn.g
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // wn.g
    public /* bridge */ /* synthetic */ void o(boolean z11) {
        super.o(z11);
    }

    @Override // wn.g, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // wn.g, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // wn.g
    public /* bridge */ /* synthetic */ void p(@GravityInt int i11) {
        super.p(i11);
    }

    @Override // wn.g, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z11) {
        super.setCancelable(z11);
    }

    @Override // wn.g, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z11) {
        super.setCanceledOnTouchOutside(z11);
    }

    @Override // wn.g, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@LayoutRes int i11) {
        super.setContentView(i11);
    }

    @Override // wn.g
    @NonNull
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public SideSheetBehavior<? extends View> e() {
        c e11 = super.e();
        if (e11 instanceof SideSheetBehavior) {
            return (SideSheetBehavior) e11;
        }
        throw new IllegalStateException("The view is not associated with SideSheetBehavior");
    }

    public n(@NonNull Context context, @StyleRes int i11) {
        super(context, i11, f96538k, f96539l);
    }

    @Override // wn.g, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@Nullable View view) {
        super.setContentView(view);
    }

    @Override // wn.g, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends m {
        public a() {
        }

        @Override // wn.m, wn.d
        public void a(@NonNull View view, int i11) {
            if (i11 == 5) {
                n.this.cancel();
            }
        }

        @Override // wn.m, wn.d
        public void b(@NonNull View view, float f11) {
        }
    }
}
