package gs;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b extends a {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts E = null;

    @Nullable
    public static final SparseIntArray F = null;

    @NonNull
    public final View C;
    public long D;

    public b(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 10, E, F));
    }

    @Override // gs.a
    public void D(@Nullable View.OnClickListener BackOnclick) {
        this.f54094j = BackOnclick;
        synchronized (this) {
            this.D |= 32768;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    @Override // gs.a
    public void F(int BgColor) {
        this.A = BgColor;
        synchronized (this) {
            this.D |= 4;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    @Override // gs.a
    public void G(@Nullable Drawable LeftIcon) {
        this.f54102r = LeftIcon;
        synchronized (this) {
            this.D |= 128;
        }
        notifyPropertyChanged(37);
        super.requestRebind();
    }

    @Override // gs.a
    public void H(@Nullable Drawable RightBadge2) {
        this.f54108x = RightBadge2;
        synchronized (this) {
            this.D |= 1;
        }
        notifyPropertyChanged(60);
        super.requestRebind();
    }

    @Override // gs.a
    public void I(@Nullable Drawable RightIcon) {
        this.f54103s = RightIcon;
        synchronized (this) {
            this.D |= PlaybackStateCompat.E;
        }
        notifyPropertyChanged(61);
        super.requestRebind();
    }

    @Override // gs.a
    public void J(@Nullable Drawable RightIcon2) {
        this.f54107w = RightIcon2;
        synchronized (this) {
            this.D |= 2;
        }
        notifyPropertyChanged(62);
        super.requestRebind();
    }

    @Override // gs.a
    public void K(@Nullable View.OnLongClickListener RightOnLongClick2) {
        this.f54105u = RightOnLongClick2;
        synchronized (this) {
            this.D |= 4096;
        }
        notifyPropertyChanged(63);
        super.requestRebind();
    }

    @Override // gs.a
    public void L(@Nullable View.OnClickListener RightOnclick) {
        this.f54096l = RightOnclick;
        synchronized (this) {
            this.D |= 256;
        }
        notifyPropertyChanged(64);
        super.requestRebind();
    }

    @Override // gs.a
    public void M(@Nullable View.OnClickListener RightOnclick2) {
        this.f54104t = RightOnclick2;
        synchronized (this) {
            this.D |= 2048;
        }
        notifyPropertyChanged(65);
        super.requestRebind();
    }

    @Override // gs.a
    public void N(@Nullable String RightTitle) {
        this.f54098n = RightTitle;
        synchronized (this) {
            this.D |= 1024;
        }
        notifyPropertyChanged(67);
        super.requestRebind();
    }

    @Override // gs.a
    public void O(int RightTitleColor) {
        this.B = RightTitleColor;
        synchronized (this) {
            this.D |= 16;
        }
        notifyPropertyChanged(68);
        super.requestRebind();
    }

    @Override // gs.a
    public void P(@Nullable Boolean ShowBack) {
        this.f54099o = ShowBack;
        synchronized (this) {
            this.D |= 8;
        }
        notifyPropertyChanged(70);
        super.requestRebind();
    }

    @Override // gs.a
    public void Q(@Nullable Boolean ShowClose) {
        this.f54109y = ShowClose;
        synchronized (this) {
            this.D |= 8192;
        }
        notifyPropertyChanged(72);
        super.requestRebind();
    }

    @Override // gs.a
    public void R(boolean ShowDivider) {
        this.f54110z = ShowDivider;
        synchronized (this) {
            this.D |= 64;
        }
        notifyPropertyChanged(74);
        super.requestRebind();
    }

    @Override // gs.a
    public void S(boolean ShowRight) {
        this.f54101q = ShowRight;
        synchronized (this) {
            this.D |= 32;
        }
        notifyPropertyChanged(76);
        super.requestRebind();
    }

    @Override // gs.a
    public void T(boolean ShowRight2) {
        this.f54106v = ShowRight2;
        synchronized (this) {
            this.D |= 512;
        }
        notifyPropertyChanged(77);
        super.requestRebind();
    }

    @Override // gs.a
    public void U(@Nullable View.OnClickListener StopOnclick) {
        this.f54095k = StopOnclick;
        synchronized (this) {
            this.D |= 65536;
        }
        notifyPropertyChanged(80);
        super.requestRebind();
    }

    @Override // gs.a
    public void V(@Nullable String Title) {
        this.f54097m = Title;
        synchronized (this) {
            this.D |= 131072;
        }
        notifyPropertyChanged(86);
        super.requestRebind();
    }

    @Override // gs.a
    public void W(boolean WhiteMode) {
        this.f54100p = WhiteMode;
        synchronized (this) {
            this.D |= 16384;
        }
        notifyPropertyChanged(92);
        super.requestRebind();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01aa  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.b.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.D = PlaybackStateCompat.F;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (60 == variableId) {
            H((Drawable) variable);
            return true;
        }
        if (62 == variableId) {
            J((Drawable) variable);
            return true;
        }
        if (5 == variableId) {
            F(((Integer) variable).intValue());
            return true;
        }
        if (70 == variableId) {
            P((Boolean) variable);
            return true;
        }
        if (68 == variableId) {
            O(((Integer) variable).intValue());
            return true;
        }
        if (76 == variableId) {
            S(((Boolean) variable).booleanValue());
            return true;
        }
        if (74 == variableId) {
            R(((Boolean) variable).booleanValue());
            return true;
        }
        if (37 == variableId) {
            G((Drawable) variable);
            return true;
        }
        if (64 == variableId) {
            L((View.OnClickListener) variable);
            return true;
        }
        if (77 == variableId) {
            T(((Boolean) variable).booleanValue());
            return true;
        }
        if (67 == variableId) {
            N((String) variable);
            return true;
        }
        if (65 == variableId) {
            M((View.OnClickListener) variable);
            return true;
        }
        if (63 == variableId) {
            K((View.OnLongClickListener) variable);
            return true;
        }
        if (72 == variableId) {
            Q((Boolean) variable);
            return true;
        }
        if (92 == variableId) {
            W(((Boolean) variable).booleanValue());
            return true;
        }
        if (4 == variableId) {
            D((View.OnClickListener) variable);
            return true;
        }
        if (80 == variableId) {
            U((View.OnClickListener) variable);
            return true;
        }
        if (86 == variableId) {
            V((String) variable);
            return true;
        }
        if (61 != variableId) {
            return false;
        }
        I((Drawable) variable);
        return true;
    }

    public b(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[1], (ImageView) bindings[2], (ConstraintLayout) bindings[0], (ImageView) bindings[7], (FrameLayout) bindings[4], (ImageView) bindings[6], (ImageView) bindings[5], (TextView) bindings[8], (TextView) bindings[3]);
        this.D = -1L;
        this.f54085a.setTag(null);
        this.f54086b.setTag(null);
        this.f54087c.setTag(null);
        this.f54088d.setTag(null);
        this.f54089e.setTag(null);
        this.f54090f.setTag(null);
        this.f54091g.setTag(null);
        this.f54092h.setTag(null);
        View view = (View) bindings[9];
        this.C = view;
        view.setTag(null);
        this.f54093i.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
