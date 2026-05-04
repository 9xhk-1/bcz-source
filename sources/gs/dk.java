package gs;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class dk extends ck {

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54639o = null;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54640p = null;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54641k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final View f54642l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f54643m;

    /* renamed from: n, reason: collision with root package name */
    public long f54644n;

    public dk(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, f54639o, f54640p));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r23 != false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0091  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.dk.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54644n != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54644n = 128L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // gs.ck
    public void p(int EndIconVisibility) {
        this.f54486h = EndIconVisibility;
        synchronized (this) {
            this.f54644n |= 4;
        }
        notifyPropertyChanged(25);
        super.requestRebind();
    }

    @Override // gs.ck
    public void r(@Nullable Drawable IconLeft) {
        this.f54483e = IconLeft;
        synchronized (this) {
            this.f54644n |= 16;
        }
        notifyPropertyChanged(29);
        super.requestRebind();
    }

    @Override // gs.ck
    public void s(@Nullable View.OnClickListener OnClickListener) {
        this.f54482d = OnClickListener;
        synchronized (this) {
            this.f54644n |= 2;
        }
        notifyPropertyChanged(48);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (82 == variableId) {
            v((String) variable);
            return true;
        }
        if (48 == variableId) {
            s((View.OnClickListener) variable);
            return true;
        }
        if (25 == variableId) {
            p(((Integer) variable).intValue());
            return true;
        }
        if (54 == variableId) {
            t(((Boolean) variable).booleanValue());
            return true;
        }
        if (29 == variableId) {
            r((Drawable) variable);
            return true;
        }
        if (86 == variableId) {
            x((String) variable);
            return true;
        }
        if (69 != variableId) {
            return false;
        }
        u((Boolean) variable);
        return true;
    }

    @Override // gs.ck
    public void t(boolean RedDot) {
        this.f54487i = RedDot;
        synchronized (this) {
            this.f54644n |= 8;
        }
        notifyPropertyChanged(54);
        super.requestRebind();
    }

    @Override // gs.ck
    public void u(@Nullable Boolean Selected) {
        this.f54488j = Selected;
        synchronized (this) {
            this.f54644n |= 64;
        }
        notifyPropertyChanged(69);
        super.requestRebind();
    }

    @Override // gs.ck
    public void v(@Nullable String SubTitle) {
        this.f54485g = SubTitle;
        synchronized (this) {
            this.f54644n |= 1;
        }
        notifyPropertyChanged(82);
        super.requestRebind();
    }

    @Override // gs.ck
    public void x(@Nullable String Title) {
        this.f54484f = Title;
        synchronized (this) {
            this.f54644n |= 32;
        }
        notifyPropertyChanged(86);
        super.requestRebind();
    }

    public dk(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[5], (ImageView) bindings[1], (TextView) bindings[2]);
        this.f54644n = -1L;
        this.f54479a.setTag(null);
        this.f54480b.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54641k = constraintLayout;
        constraintLayout.setTag(null);
        View view = (View) bindings[3];
        this.f54642l = view;
        view.setTag(null);
        TextView textView = (TextView) bindings[4];
        this.f54643m = textView;
        textView.setTag(null);
        this.f54481c.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
