package gs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class bk extends ak {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54300j = null;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54301k = null;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54302e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f54303f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f54304g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f54305h;

    /* renamed from: i, reason: collision with root package name */
    public long f54306i;

    public bk(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f54300j, f54301k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        Drawable drawable;
        Drawable drawable2;
        Context context;
        int i11;
        Context context2;
        int i12;
        Context context3;
        int i13;
        synchronized (this) {
            j11 = this.f54306i;
            this.f54306i = 0L;
        }
        boolean z11 = this.f54189c;
        boolean z12 = this.f54190d;
        boolean z13 = this.f54188b;
        View.OnClickListener onClickListener = this.f54187a;
        long j12 = j11 & 17;
        Drawable drawable3 = null;
        if (j12 != 0) {
            if (j12 != 0) {
                j11 |= z11 ? 1024L : 512L;
            }
            if (z11) {
                context3 = this.f54303f.getContext();
                i13 = R.drawable.ic_app_phone;
            } else {
                context3 = this.f54303f.getContext();
                i13 = R.drawable.ic_app_phone_disable;
            }
            drawable = AppCompatResources.getDrawable(context3, i13);
        } else {
            drawable = null;
        }
        long j13 = j11 & 18;
        if (j13 != 0) {
            if (j13 != 0) {
                j11 |= z12 ? 256L : 128L;
            }
            if (z12) {
                context2 = this.f54305h.getContext();
                i12 = R.drawable.ic_app_qq;
            } else {
                context2 = this.f54305h.getContext();
                i12 = R.drawable.ic_app_qq_disable;
            }
            drawable2 = AppCompatResources.getDrawable(context2, i12);
        } else {
            drawable2 = null;
        }
        long j14 = j11 & 20;
        if (j14 != 0) {
            if (j14 != 0) {
                j11 |= z13 ? 64L : 32L;
            }
            if (z13) {
                context = this.f54304g.getContext();
                i11 = R.drawable.ic_app_wechat;
            } else {
                context = this.f54304g.getContext();
                i11 = R.drawable.ic_app_wechat_disable;
            }
            drawable3 = AppCompatResources.getDrawable(context, i11);
        }
        if ((j11 & 24) != 0) {
            this.f54302e.setOnClickListener(onClickListener);
        }
        if ((j11 & 17) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.f54303f, drawable);
        }
        if ((j11 & 20) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.f54304g, drawable3);
        }
        if ((j11 & 18) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.f54305h, drawable2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54306i != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54306i = 16L;
        }
        requestRebind();
    }

    @Override // gs.ak
    public void m(boolean BindPhone) {
        this.f54189c = BindPhone;
        synchronized (this) {
            this.f54306i |= 1;
        }
        notifyPropertyChanged(6);
        super.requestRebind();
    }

    @Override // gs.ak
    public void n(boolean BindQQ) {
        this.f54190d = BindQQ;
        synchronized (this) {
            this.f54306i |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // gs.ak
    public void o(boolean BindWx) {
        this.f54188b = BindWx;
        synchronized (this) {
            this.f54306i |= 4;
        }
        notifyPropertyChanged(8);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // gs.ak
    public void p(@Nullable View.OnClickListener OnClickListener) {
        this.f54187a = OnClickListener;
        synchronized (this) {
            this.f54306i |= 8;
        }
        notifyPropertyChanged(48);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (6 == variableId) {
            m(((Boolean) variable).booleanValue());
            return true;
        }
        if (7 == variableId) {
            n(((Boolean) variable).booleanValue());
            return true;
        }
        if (8 == variableId) {
            o(((Boolean) variable).booleanValue());
            return true;
        }
        if (48 != variableId) {
            return false;
        }
        p((View.OnClickListener) variable);
        return true;
    }

    public bk(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0);
        this.f54306i = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.f54302e = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) bindings[1];
        this.f54303f = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) bindings[2];
        this.f54304g = imageView2;
        imageView2.setTag(null);
        ImageView imageView3 = (ImageView) bindings[3];
        this.f54305h = imageView3;
        imageView3.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
