package gs;

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
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a2 extends z1 {

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54120k = null;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54121l;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54122i;

    /* renamed from: j, reason: collision with root package name */
    public long f54123j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54121l = sparseIntArray;
        sparseIntArray.put(R.id.image_watch, 4);
        sparseIntArray.put(R.id.title_main, 5);
        sparseIntArray.put(R.id.sub_title, 6);
    }

    public a2(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f54120k, f54121l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f54123j;
            this.f54123j = 0L;
        }
        View.OnClickListener onClickListener = this.f57699g;
        View.OnClickListener onClickListener2 = this.f57700h;
        long j12 = 5 & j11;
        if ((j11 & 6) != 0) {
            this.f57694b.setOnClickListener(onClickListener2);
            this.f54122i.setOnClickListener(onClickListener2);
        }
        if (j12 != 0) {
            this.f57695c.setOnClickListener(onClickListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54123j != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54123j = 4L;
        }
        requestRebind();
    }

    @Override // gs.z1
    public void k(@Nullable View.OnClickListener Cancel) {
        this.f57700h = Cancel;
        synchronized (this) {
            this.f54123j |= 2;
        }
        notifyPropertyChanged(10);
        super.requestRebind();
    }

    @Override // gs.z1
    public void l(@Nullable View.OnClickListener Confirm) {
        this.f57699g = Confirm;
        synchronized (this) {
            this.f54123j |= 1;
        }
        notifyPropertyChanged(16);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (16 == variableId) {
            l((View.OnClickListener) variable);
            return true;
        }
        if (10 != variableId) {
            return false;
        }
        k((View.OnClickListener) variable);
        return true;
    }

    public a2(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ConstraintLayout) bindings[0], (TextView) bindings[2], (TextView) bindings[3], (ImageView) bindings[4], (TextView) bindings[6], (TextView) bindings[5]);
        this.f54123j = -1L;
        this.f57693a.setTag(null);
        this.f57694b.setTag(null);
        this.f57695c.setTag(null);
        FrameLayout frameLayout = (FrameLayout) bindings[1];
        this.f54122i = frameLayout;
        frameLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
