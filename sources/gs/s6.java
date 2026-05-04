package gs;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class s6 extends r6 {

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56711i = null;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56712j;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56713g;

    /* renamed from: h, reason: collision with root package name */
    public long f56714h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56712j = sparseIntArray;
        sparseIntArray.put(R.id.top_guide, 5);
    }

    public s6(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, f56711i, f56712j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        Drawable drawable;
        String str;
        String str2;
        Context context;
        int i11;
        Resources resources;
        int i12;
        synchronized (this) {
            j11 = this.f56714h;
            this.f56714h = 0L;
        }
        md.k kVar = this.f56580f;
        String str3 = null;
        Drawable drawable2 = null;
        if ((15 & j11) != 0) {
            long j12 = j11 & 13;
            if (j12 != 0) {
                MutableLiveData<Boolean> a11 = kVar != null ? kVar.a() : null;
                updateLiveDataRegistration(0, a11);
                boolean safeUnbox = ViewDataBinding.safeUnbox(a11 != null ? a11.getValue() : null);
                if (j12 != 0) {
                    j11 |= safeUnbox ? 2592L : 1296L;
                }
                r10 = safeUnbox ? 8 : 0;
                str = this.f56578d.getResources().getString(safeUnbox ? R.string.calendar_repair_result_success : R.string.calendar_repair_result_fail);
                if (safeUnbox) {
                    resources = this.f56575a.getResources();
                    i12 = R.string.calendar_repair_result_finish;
                } else {
                    resources = this.f56575a.getResources();
                    i12 = R.string.calendar_repair_result_known;
                }
                str2 = resources.getString(i12);
            } else {
                str = null;
                str2 = null;
            }
            long j13 = j11 & 14;
            if (j13 != 0) {
                MutableLiveData<Boolean> a12 = kVar != null ? kVar.a() : null;
                updateLiveDataRegistration(1, a12);
                boolean safeUnbox2 = ViewDataBinding.safeUnbox(a12 != null ? a12.getValue() : null);
                if (j13 != 0) {
                    j11 |= safeUnbox2 ? 128L : 64L;
                }
                if (safeUnbox2) {
                    context = this.f56577c.getContext();
                    i11 = R.drawable.ic_calendar_repair_success;
                } else {
                    context = this.f56577c.getContext();
                    i11 = R.drawable.ic_calendar_repair_fail;
                }
                drawable2 = AppCompatResources.getDrawable(context, i11);
            }
            drawable = drawable2;
            str3 = str2;
        } else {
            drawable = null;
            str = null;
        }
        if ((13 & j11) != 0) {
            TextViewBindingAdapter.setText(this.f56575a, str3);
            this.f56576b.setVisibility(r10);
            TextViewBindingAdapter.setText(this.f56578d, str);
        }
        if ((j11 & 14) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.f56577c, drawable);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56714h != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56714h = 8L;
        }
        requestRebind();
    }

    @Override // gs.r6
    public void j(@Nullable md.k ResultViewModel) {
        this.f56580f = ResultViewModel;
        synchronized (this) {
            this.f56714h |= 4;
        }
        notifyPropertyChanged(57);
        super.requestRebind();
    }

    public final boolean k(MutableLiveData<Boolean> ResultViewModelIsRepairSuccess, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56714h |= 1;
        }
        return true;
    }

    public final boolean l(MutableLiveData<Boolean> ResultViewModelIsRepairSuccess, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56714h |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return k((MutableLiveData) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return l((MutableLiveData) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (57 != variableId) {
            return false;
        }
        j((md.k) variable);
        return true;
    }

    public s6(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2, (TextView) bindings[3], (TextView) bindings[4], (ImageView) bindings[1], (TextView) bindings[2], (Guideline) bindings[5]);
        this.f56714h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56713g = constraintLayout;
        constraintLayout.setTag(null);
        this.f56575a.setTag(null);
        this.f56576b.setTag(null);
        this.f56577c.setTag(null);
        this.f56578d.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
