package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.main.customview.calendar.CalendarView;
import com.jiongji.andriod.card.R;
import hs.a;
import java.util.Calendar;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class kj extends jj implements a.InterfaceC0684a {

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55621w = null;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55622x;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55623q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55624r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55625s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55626t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55627u;

    /* renamed from: v, reason: collision with root package name */
    public long f55628v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55622x = sparseIntArray;
        sparseIntArray.put(R.id.head_bg, 14);
        sparseIntArray.put(R.id.learning_calendar_container, 15);
    }

    public kj(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 16, f55621w, f55622x));
    }

    private boolean l(ObservableField<ld.b> ViewmodelCalendarData, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55628v |= 512;
        }
        return true;
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        ld.l lVar;
        if (sourceId == 1) {
            ld.l lVar2 = this.f55530p;
            if (lVar2 != null) {
                lVar2.s();
                return;
            }
            return;
        }
        if (sourceId == 2) {
            ld.l lVar3 = this.f55530p;
            if (lVar3 != null) {
                lVar3.n();
                return;
            }
            return;
        }
        if (sourceId != 3) {
            if (sourceId == 4 && (lVar = this.f55530p) != null) {
                lVar.h();
                return;
            }
            return;
        }
        ld.l lVar4 = this.f55530p;
        if (lVar4 != null) {
            lVar4.r();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.kj.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55628v != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55628v = 4096L;
        }
        requestRebind();
    }

    @Override // gs.jj
    public void j(@Nullable ld.l Viewmodel) {
        this.f55530p = Viewmodel;
        synchronized (this) {
            this.f55628v |= 2048;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(ObservableField<Calendar> ViewmodelActivieCalendar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55628v |= 2;
        }
        return true;
    }

    public final boolean m(ObservableInt ViewmodelEndStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55628v |= 1024;
        }
        return true;
    }

    public final boolean n(ObservableBoolean ViewmodelHasDaka, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55628v |= 1;
        }
        return true;
    }

    public final boolean o(ObservableField<String> ViewmodelLearnWordsListTips, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55628v |= 64;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return n((ObservableBoolean) object, fieldId);
            case 1:
                return k((ObservableField) object, fieldId);
            case 2:
                return u((ObservableField) object, fieldId);
            case 3:
                return v((ObservableField) object, fieldId);
            case 4:
                return r((ObservableField) object, fieldId);
            case 5:
                return p((ObservableInt) object, fieldId);
            case 6:
                return o((ObservableField) object, fieldId);
            case 7:
                return s((ObservableField) object, fieldId);
            case 8:
                return t((ObservableBoolean) object, fieldId);
            case 9:
                return l((ObservableField) object, fieldId);
            case 10:
                return m((ObservableInt) object, fieldId);
            default:
                return false;
        }
    }

    public final boolean p(ObservableInt ViewmodelLoadingStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55628v |= 32;
        }
        return true;
    }

    public final boolean r(ObservableField<String> ViewmodelMonth, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55628v |= 16;
        }
        return true;
    }

    public final boolean s(ObservableField<String> ViewmodelRepairBtnText, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55628v |= 128;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((ld.l) variable);
        return true;
    }

    public final boolean t(ObservableBoolean ViewmodelShowRepair, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55628v |= 256;
        }
        return true;
    }

    public final boolean u(ObservableField<String> ViewmodelYear, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55628v |= 4;
        }
        return true;
    }

    public final boolean v(ObservableField<String> ViewmodelYearMonthDay, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55628v |= 8;
        }
        return true;
    }

    public kj(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 11, (ProgressBar) bindings[6], (TextView) bindings[12], (View) bindings[14], (TextView) bindings[9], (TextView) bindings[13], (CalendarView) bindings[5], (FrameLayout) bindings[15], (ImageView) bindings[4], (TextView) bindings[8], (TextView) bindings[7], (TextView) bindings[1], (RelativeLayout) bindings[10], (TextView) bindings[11], (ImageView) bindings[3], (TextView) bindings[2]);
        this.f55628v = -1L;
        this.f55515a.setTag(null);
        this.f55516b.setTag(null);
        this.f55518d.setTag(null);
        this.f55519e.setTag(null);
        this.f55520f.setTag(null);
        this.f55522h.setTag(null);
        this.f55523i.setTag(null);
        this.f55524j.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55623q = constraintLayout;
        constraintLayout.setTag(null);
        this.f55525k.setTag(null);
        this.f55526l.setTag(null);
        this.f55527m.setTag(null);
        this.f55528n.setTag(null);
        this.f55529o.setTag(null);
        setRootTag(root);
        this.f55624r = new hs.a(this, 4);
        this.f55625s = new hs.a(this, 1);
        this.f55626t = new hs.a(this, 2);
        this.f55627u = new hs.a(this, 3);
        invalidateAll();
    }
}
