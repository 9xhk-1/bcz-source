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
public class fk extends ek {

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54945t = null;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54946u = null;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54947o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final ImageView f54948p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final View f54949q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final View f54950r;

    /* renamed from: s, reason: collision with root package name */
    public long f54951s;

    public fk(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 8, f54945t, f54946u));
    }

    @Override // gs.ek
    public void A(boolean RightRedDot) {
        this.f54823n = RightRedDot;
        synchronized (this) {
            this.f54951s |= 64;
        }
        notifyPropertyChanged(66);
        super.requestRebind();
    }

    @Override // gs.ek
    public void B(@Nullable Boolean Selected) {
        this.f54822m = Selected;
        synchronized (this) {
            this.f54951s |= 512;
        }
        notifyPropertyChanged(69);
        super.requestRebind();
    }

    @Override // gs.ek
    public void C(@Nullable String SubTitle) {
        this.f54818i = SubTitle;
        synchronized (this) {
            this.f54951s |= 1;
        }
        notifyPropertyChanged(82);
        super.requestRebind();
    }

    @Override // gs.ek
    public void D(@Nullable String Title) {
        this.f54817h = Title;
        synchronized (this) {
            this.f54951s |= 256;
        }
        notifyPropertyChanged(86);
        super.requestRebind();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016c  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.fk.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54951s != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54951s = 1024L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (82 == variableId) {
            C((String) variable);
            return true;
        }
        if (24 == variableId) {
            t((Drawable) variable);
            return true;
        }
        if (48 == variableId) {
            y((View.OnClickListener) variable);
            return true;
        }
        if (45 == variableId) {
            x(((Boolean) variable).booleanValue());
            return true;
        }
        if (25 == variableId) {
            u(((Integer) variable).intValue());
            return true;
        }
        if (54 == variableId) {
            z(((Boolean) variable).booleanValue());
            return true;
        }
        if (66 == variableId) {
            A(((Boolean) variable).booleanValue());
            return true;
        }
        if (29 == variableId) {
            v((Drawable) variable);
            return true;
        }
        if (86 == variableId) {
            D((String) variable);
            return true;
        }
        if (69 != variableId) {
            return false;
        }
        B((Boolean) variable);
        return true;
    }

    @Override // gs.ek
    public void t(@Nullable Drawable EndIcon) {
        this.f54820k = EndIcon;
        synchronized (this) {
            this.f54951s |= 2;
        }
        notifyPropertyChanged(24);
        super.requestRebind();
    }

    @Override // gs.ek
    public void u(int EndIconVisibility) {
        this.f54819j = EndIconVisibility;
        synchronized (this) {
            this.f54951s |= 16;
        }
        notifyPropertyChanged(25);
        super.requestRebind();
    }

    @Override // gs.ek
    public void v(@Nullable Drawable IconLeft) {
        this.f54815f = IconLeft;
        synchronized (this) {
            this.f54951s |= 128;
        }
        notifyPropertyChanged(29);
        super.requestRebind();
    }

    @Override // gs.ek
    public void x(boolean NewByIcon) {
        this.f54816g = NewByIcon;
        synchronized (this) {
            this.f54951s |= 8;
        }
        notifyPropertyChanged(45);
        super.requestRebind();
    }

    @Override // gs.ek
    public void y(@Nullable View.OnClickListener OnClickListener) {
        this.f54814e = OnClickListener;
        synchronized (this) {
            this.f54951s |= 4;
        }
        notifyPropertyChanged(48);
        super.requestRebind();
    }

    @Override // gs.ek
    public void z(boolean RedDot) {
        this.f54821l = RedDot;
        synchronized (this) {
            this.f54951s |= 32;
        }
        notifyPropertyChanged(54);
        super.requestRebind();
    }

    public fk(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[7], (ImageView) bindings[1], (TextView) bindings[5], (TextView) bindings[3]);
        this.f54951s = -1L;
        this.f54810a.setTag(null);
        this.f54811b.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54947o = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) bindings[2];
        this.f54948p = imageView;
        imageView.setTag(null);
        View view = (View) bindings[4];
        this.f54949q = view;
        view.setTag(null);
        View view2 = (View) bindings[6];
        this.f54950r = view2;
        view2.setTag(null);
        this.f54812c.setTag(null);
        this.f54813d.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
