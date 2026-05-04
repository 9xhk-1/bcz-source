package gs;

import android.graphics.Typeface;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.main.customview.PopPointWindowLayout;
import com.baicizhan.main.wikiv2.study.model.ExtendedWordInfo;
import com.wefika.flowlayout.FlowLayout;
import hs.a;
import me.grantland.widget.AutofitTextView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class zl extends yl implements a.InterfaceC0684a {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts B = null;

    @Nullable
    public static final SparseIntArray C = null;
    public long A;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57800w;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57801x;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57802y;

    /* renamed from: z, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57803z;

    public zl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 14, B, C));
    }

    public final boolean A(ExtendedWordInfo ExtendedInfo, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 2;
        }
        return true;
    }

    public final boolean B(yg.j2 State, int fieldId) {
        if (fieldId == 0) {
            synchronized (this) {
                this.A |= 1;
            }
            return true;
        }
        if (fieldId != 78) {
            return false;
        }
        synchronized (this) {
            this.A |= 256;
        }
        return true;
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        PopPointWindowLayout.f fVar;
        if (sourceId == 1) {
            PopPointWindowLayout.f fVar2 = this.f57654v;
            if (fVar2 != null) {
                fVar2.e();
                return;
            }
            return;
        }
        if (sourceId == 2) {
            PopPointWindowLayout.f fVar3 = this.f57654v;
            if (fVar3 != null) {
                fVar3.c();
                return;
            }
            return;
        }
        if (sourceId != 3) {
            if (sourceId == 4 && (fVar = this.f57654v) != null) {
                fVar.d();
                return;
            }
            return;
        }
        PopPointWindowLayout.f fVar4 = this.f57654v;
        if (fVar4 != null) {
            fVar4.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x042d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0248  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 1279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.zl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.A = 512L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return B((yg.j2) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return A((ExtendedWordInfo) object, fieldId);
    }

    @Override // gs.yl
    public void r(@Nullable Typeface AccentFont) {
        this.f57649q = AccentFont;
        synchronized (this) {
            this.A |= 128;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // gs.yl
    public void s(boolean Collected) {
        this.f57653u = Collected;
        synchronized (this) {
            this.A |= 32;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (51 == variableId) {
            x((PopPointWindowLayout.f) variable);
            return true;
        }
        if (27 == variableId) {
            u(((Boolean) variable).booleanValue());
            return true;
        }
        if (78 == variableId) {
            y((yg.j2) variable);
            return true;
        }
        if (26 == variableId) {
            t((ExtendedWordInfo) variable);
            return true;
        }
        if (44 == variableId) {
            v(((Boolean) variable).booleanValue());
            return true;
        }
        if (15 == variableId) {
            s(((Boolean) variable).booleanValue());
            return true;
        }
        if (93 == variableId) {
            z((Word) variable);
            return true;
        }
        if (1 != variableId) {
            return false;
        }
        r((Typeface) variable);
        return true;
    }

    @Override // gs.yl
    public void t(@Nullable ExtendedWordInfo ExtendedInfo) {
        updateRegistration(1, ExtendedInfo);
        this.f57648p = ExtendedInfo;
        synchronized (this) {
            this.A |= 2;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    @Override // gs.yl
    public void u(boolean FloatTop) {
        this.f57650r = FloatTop;
        synchronized (this) {
            this.A |= 8;
        }
        notifyPropertyChanged(27);
        super.requestRebind();
    }

    @Override // gs.yl
    public void v(boolean MoreDisabled) {
        this.f57651s = MoreDisabled;
        synchronized (this) {
            this.A |= 16;
        }
        notifyPropertyChanged(44);
        super.requestRebind();
    }

    @Override // gs.yl
    public void x(@Nullable PopPointWindowLayout.f Presenter) {
        this.f57654v = Presenter;
        synchronized (this) {
            this.A |= 4;
        }
        notifyPropertyChanged(51);
        super.requestRebind();
    }

    @Override // gs.yl
    public void y(@Nullable yg.j2 State) {
        updateRegistration(0, State);
        this.f57652t = State;
        synchronized (this) {
            this.A |= 1;
        }
        notifyPropertyChanged(78);
        super.requestRebind();
    }

    @Override // gs.yl
    public void z(@Nullable Word Word) {
        this.f57647o = Word;
        synchronized (this) {
            this.A |= 64;
        }
        notifyPropertyChanged(93);
        super.requestRebind();
    }

    public zl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2, (TextView) bindings[6], (ImageView) bindings[7], (View) bindings[13], (ImageView) bindings[4], (RelativeLayout) bindings[2], (View) bindings[9], (TextView) bindings[12], (ProgressBar) bindings[11], (TextView) bindings[8], (TextView) bindings[10], (View) bindings[1], (FlowLayout) bindings[5], (LinearLayout) bindings[0], (AutofitTextView) bindings[3]);
        this.A = -1L;
        this.f57633a.setTag(null);
        this.f57634b.setTag(null);
        this.f57635c.setTag(null);
        this.f57636d.setTag(null);
        this.f57637e.setTag(null);
        this.f57638f.setTag(null);
        this.f57639g.setTag(null);
        this.f57640h.setTag(null);
        this.f57641i.setTag(null);
        this.f57642j.setTag(null);
        this.f57643k.setTag(null);
        this.f57644l.setTag(null);
        this.f57645m.setTag(null);
        this.f57646n.setTag(null);
        setRootTag(root);
        this.f57800w = new hs.a(this, 1);
        this.f57801x = new hs.a(this, 2);
        this.f57802y = new hs.a(this, 3);
        this.f57803z = new hs.a(this, 4);
        invalidateAll();
    }
}
