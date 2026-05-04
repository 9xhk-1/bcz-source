package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.main.customview.calendar.CalendarView;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;
import com.makeramen.roundedimageview.RoundedImageView;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class x extends w implements a.InterfaceC0684a {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts C;

    @Nullable
    public static final SparseIntArray D;

    @Nullable
    public final View.OnClickListener A;
    public long B;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57381u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final CalendarView f57382v;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public final c6 f57383w;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57384x;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57385y;

    /* renamed from: z, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57386z;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(22);
        C = includedLayouts;
        includedLayouts.setIncludes(2, new String[]{"daka_loading_layout"}, new int[]{14}, new int[]{R.layout.daka_loading_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.bottom_sheet, 15);
        sparseIntArray.put(R.id.bg_gradient, 16);
        sparseIntArray.put(R.id.celebration, 17);
        sparseIntArray.put(R.id.title, 18);
        sparseIntArray.put(R.id.words_title, 19);
        sparseIntArray.put(R.id.day_title, 20);
        sparseIntArray.put(R.id.daka_btn_bg, 21);
    }

    public x(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 22, C, D));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        od.n nVar;
        if (sourceId == 1) {
            od.n nVar2 = this.f57248t;
            if (nVar2 != null) {
                nVar2.o();
                return;
            }
            return;
        }
        if (sourceId == 2) {
            od.n nVar3 = this.f57248t;
            if (nVar3 != null) {
                nVar3.x();
                return;
            }
            return;
        }
        if (sourceId != 3) {
            if (sourceId == 4 && (nVar = this.f57248t) != null) {
                nVar.n();
                return;
            }
            return;
        }
        od.n nVar4 = this.f57248t;
        if (nVar4 != null) {
            nVar4.D();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.x.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.B != 0) {
                    return true;
                }
                return this.f57383w.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.B = 256L;
        }
        this.f57383w.invalidateAll();
        requestRebind();
    }

    @Override // gs.w
    public void j(@Nullable od.n Viewmodel) {
        this.f57248t = Viewmodel;
        synchronized (this) {
            this.B |= 128;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(MutableLiveData<String> ViewmodelAdImage, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 8;
        }
        return true;
    }

    public final boolean l(ObservableField<ld.b> ViewmodelCalendarData, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 64;
        }
        return true;
    }

    public final boolean m(ObservableField<String> ViewmodelCalendarTitle, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 2;
        }
        return true;
    }

    public final boolean n(ObservableField<String> ViewmodelDays, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 16;
        }
        return true;
    }

    public final boolean o(MutableLiveData<Boolean> ViewmodelShowShareBonusTips, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return p((ObservableInt) object, fieldId);
            case 1:
                return m((ObservableField) object, fieldId);
            case 2:
                return r((ObservableField) object, fieldId);
            case 3:
                return k((MutableLiveData) object, fieldId);
            case 4:
                return n((ObservableField) object, fieldId);
            case 5:
                return o((MutableLiveData) object, fieldId);
            case 6:
                return l((ObservableField) object, fieldId);
            default:
                return false;
        }
    }

    public final boolean p(ObservableInt ViewmodelStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 1;
        }
        return true;
    }

    public final boolean r(ObservableField<String> ViewmodelWords, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f57383w.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((od.n) variable);
        return true;
    }

    public x(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7, (ImageView) bindings[7], (RoundedImageView) bindings[6], (FrameLayout) bindings[5], (View) bindings[16], (BottomSheetLayout) bindings[15], (ImageView) bindings[17], (ImageView) bindings[1], (ConstraintLayout) bindings[2], (TextView) bindings[12], (View) bindings[21], (TextView) bindings[8], (TextView) bindings[20], (TextView) bindings[4], (ImageView) bindings[13], (FrameLayout) bindings[9], (TextView) bindings[18], (Group) bindings[11], (TextView) bindings[3], (TextView) bindings[19]);
        this.B = -1L;
        this.f57229a.setTag(null);
        this.f57230b.setTag(null);
        this.f57231c.setTag(null);
        this.f57235g.setTag(null);
        this.f57236h.setTag(null);
        this.f57237i.setTag(null);
        this.f57239k.setTag(null);
        this.f57241m.setTag(null);
        this.f57242n.setTag(null);
        this.f57243o.setTag(null);
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.f57381u = frameLayout;
        frameLayout.setTag(null);
        CalendarView calendarView = (CalendarView) bindings[10];
        this.f57382v = calendarView;
        calendarView.setTag(null);
        c6 c6Var = (c6) bindings[14];
        this.f57383w = c6Var;
        setContainedBinding(c6Var);
        this.f57245q.setTag(null);
        this.f57246r.setTag(null);
        setRootTag(root);
        this.f57384x = new hs.a(this, 4);
        this.f57385y = new hs.a(this, 1);
        this.f57386z = new hs.a(this, 2);
        this.A = new hs.a(this, 3);
        invalidateAll();
    }
}
