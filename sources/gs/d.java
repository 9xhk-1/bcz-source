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
public class d extends c {

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54517v = null;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54518w = null;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final View f54519t;

    /* renamed from: u, reason: collision with root package name */
    public long f54520u;

    public d(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f54517v, f54518w));
    }

    @Override // gs.c
    public void A(@Nullable View.OnClickListener RightOnclick) {
        this.f54334i = RightOnclick;
        synchronized (this) {
            this.f54520u |= 32;
        }
        notifyPropertyChanged(64);
        super.requestRebind();
    }

    @Override // gs.c
    public void B(@Nullable String RightTitle) {
        this.f54336k = RightTitle;
        synchronized (this) {
            this.f54520u |= 64;
        }
        notifyPropertyChanged(67);
        super.requestRebind();
    }

    @Override // gs.c
    public void C(int RightTitleColor) {
        this.f54344s = RightTitleColor;
        synchronized (this) {
            this.f54520u |= 4;
        }
        notifyPropertyChanged(68);
        super.requestRebind();
    }

    @Override // gs.c
    public void D(@Nullable Boolean ShowBack) {
        this.f54337l = ShowBack;
        synchronized (this) {
            this.f54520u |= 2;
        }
        notifyPropertyChanged(70);
        super.requestRebind();
    }

    @Override // gs.c
    public void F(@Nullable Boolean ShowClose) {
        this.f54341p = ShowClose;
        synchronized (this) {
            this.f54520u |= 128;
        }
        notifyPropertyChanged(72);
        super.requestRebind();
    }

    @Override // gs.c
    public void G(boolean ShowDivider) {
        this.f54342q = ShowDivider;
        synchronized (this) {
            this.f54520u |= 16;
        }
        notifyPropertyChanged(74);
        super.requestRebind();
    }

    @Override // gs.c
    public void H(boolean ShowRight) {
        this.f54339n = ShowRight;
        synchronized (this) {
            this.f54520u |= 8;
        }
        notifyPropertyChanged(76);
        super.requestRebind();
    }

    @Override // gs.c
    public void I(@Nullable View.OnClickListener StopOnclick) {
        this.f54333h = StopOnclick;
        synchronized (this) {
            this.f54520u |= 1024;
        }
        notifyPropertyChanged(80);
        super.requestRebind();
    }

    @Override // gs.c
    public void J(@Nullable String Title) {
        this.f54335j = Title;
        synchronized (this) {
            this.f54520u |= 2048;
        }
        notifyPropertyChanged(86);
        super.requestRebind();
    }

    @Override // gs.c
    public void K(boolean WhiteMode) {
        this.f54338m = WhiteMode;
        synchronized (this) {
            this.f54520u |= 256;
        }
        notifyPropertyChanged(92);
        super.requestRebind();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ae  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.d.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54520u != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54520u = 8192L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (5 == variableId) {
            y(((Integer) variable).intValue());
            return true;
        }
        if (70 == variableId) {
            D((Boolean) variable);
            return true;
        }
        if (68 == variableId) {
            C(((Integer) variable).intValue());
            return true;
        }
        if (76 == variableId) {
            H(((Boolean) variable).booleanValue());
            return true;
        }
        if (74 == variableId) {
            G(((Boolean) variable).booleanValue());
            return true;
        }
        if (64 == variableId) {
            A((View.OnClickListener) variable);
            return true;
        }
        if (67 == variableId) {
            B((String) variable);
            return true;
        }
        if (72 == variableId) {
            F((Boolean) variable);
            return true;
        }
        if (92 == variableId) {
            K(((Boolean) variable).booleanValue());
            return true;
        }
        if (4 == variableId) {
            x((View.OnClickListener) variable);
            return true;
        }
        if (80 == variableId) {
            I((View.OnClickListener) variable);
            return true;
        }
        if (86 == variableId) {
            J((String) variable);
            return true;
        }
        if (61 != variableId) {
            return false;
        }
        z((Drawable) variable);
        return true;
    }

    @Override // gs.c
    public void x(@Nullable View.OnClickListener BackOnclick) {
        this.f54332g = BackOnclick;
        synchronized (this) {
            this.f54520u |= 512;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    @Override // gs.c
    public void y(int BgColor) {
        this.f54343r = BgColor;
        synchronized (this) {
            this.f54520u |= 1;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    @Override // gs.c
    public void z(@Nullable Drawable RightIcon) {
        this.f54340o = RightIcon;
        synchronized (this) {
            this.f54520u |= 4096;
        }
        notifyPropertyChanged(61);
        super.requestRebind();
    }

    public d(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[1], (ImageView) bindings[2], (ConstraintLayout) bindings[0], (ImageView) bindings[4], (TextView) bindings[5], (TextView) bindings[3]);
        this.f54520u = -1L;
        this.f54326a.setTag(null);
        this.f54327b.setTag(null);
        this.f54328c.setTag(null);
        this.f54329d.setTag(null);
        this.f54330e.setTag(null);
        View view = (View) bindings[6];
        this.f54519t = view;
        view.setTag(null);
        this.f54331f.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
