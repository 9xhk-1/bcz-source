package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.widget.CircleImageView;
import com.baicizhan.main.customview.calendar.CalendarView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class dd extends cd {

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54618k = null;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54619l;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54620i;

    /* renamed from: j, reason: collision with root package name */
    public long f54621j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54619l = sparseIntArray;
        sparseIntArray.put(R.id.color_bg, 2);
        sparseIntArray.put(R.id.img_header, 3);
        sparseIntArray.put(R.id.calendar_date_title, 4);
        sparseIntArray.put(R.id.img_qrcode, 5);
        sparseIntArray.put(R.id.avatar, 6);
        sparseIntArray.put(R.id.name, 7);
        sparseIntArray.put(R.id.date, 8);
    }

    public dd(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 9, f54618k, f54619l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f54621j;
            this.f54621j = 0L;
        }
        if ((j11 & 1) != 0) {
            this.f54445b.setTitleVisibility(8);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54621j != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54621j = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public dd(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (CircleImageView) bindings[6], (CalendarView) bindings[1], (TextView) bindings[4], (View) bindings[2], (TextView) bindings[8], (ImageView) bindings[3], (ImageView) bindings[5], (TextView) bindings[7]);
        this.f54621j = -1L;
        this.f54445b.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54620i = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
