package gs;

import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class z0 extends y0 {

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57689p = null;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57690q;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57691n;

    /* renamed from: o, reason: collision with root package name */
    public long f57692o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57690q = sparseIntArray;
        sparseIntArray.put(R.id.header, 2);
        sparseIntArray.put(R.id.have_a_try, 3);
        sparseIntArray.put(R.id.button_area, 4);
        sparseIntArray.put(R.id.login_hw, 5);
        sparseIntArray.put(R.id.login_weixin, 6);
        sparseIntArray.put(R.id.login_qq, 7);
        sparseIntArray.put(R.id.login_other, 8);
        sparseIntArray.put(R.id.protocol_container, 9);
        sparseIntArray.put(R.id.protocol_icon, 10);
        sparseIntArray.put(R.id.protocol, 11);
    }

    public z0(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 12, f57689p, f57690q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f57692o;
            this.f57692o = 0L;
        }
        String str = this.f57535m;
        long j12 = j11 & 6;
        int i11 = 0;
        if (j12 != 0) {
            boolean isEmpty = TextUtils.isEmpty(str);
            if (j12 != 0) {
                j11 |= !isEmpty ? 16L : 8L;
            }
            if (isEmpty) {
                i11 = 8;
            }
        }
        if ((j11 & 6) != 0) {
            TextViewBindingAdapter.setText(this.f57529g, str);
            this.f57529g.setVisibility(i11);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57692o != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57692o = 4L;
        }
        requestRebind();
    }

    @Override // gs.y0
    public void k(@Nullable View.OnClickListener ClickListener) {
        this.f57534l = ClickListener;
    }

    @Override // gs.y0
    public void l(@Nullable String TipsContent) {
        this.f57535m = TipsContent;
        synchronized (this) {
            this.f57692o |= 2;
        }
        notifyPropertyChanged(85);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (14 == variableId) {
            k((View.OnClickListener) variable);
            return true;
        }
        if (85 != variableId) {
            return false;
        }
        l((String) variable);
        return true;
    }

    public z0(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (LinearLayout) bindings[4], (TextView) bindings[3], (ImageView) bindings[2], (FrameLayout) bindings[5], (TextView) bindings[8], (FrameLayout) bindings[7], (TextView) bindings[1], (FrameLayout) bindings[6], (TextView) bindings[11], (LinearLayout) bindings[9], (ImageView) bindings[10]);
        this.f57692o = -1L;
        this.f57529g.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) bindings[0];
        this.f57691n = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
