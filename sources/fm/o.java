package fm;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class o<T extends Entry> extends d<T> implements km.h<T> {
    public float A;
    public DashPathEffect B;

    /* renamed from: y, reason: collision with root package name */
    public boolean f52073y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f52074z;

    public o(List<T> list, String str) {
        super(list, str);
        this.f52073y = true;
        this.f52074z = true;
        this.A = 0.5f;
        this.B = null;
        this.A = rm.k.e(0.5f);
    }

    @Override // km.h
    public boolean D() {
        return this.f52073y;
    }

    @Override // km.h
    public float Q0() {
        return this.A;
    }

    public void S1(o oVar) {
        super.Q1(oVar);
        oVar.f52074z = this.f52074z;
        oVar.f52073y = this.f52073y;
        oVar.A = this.A;
        oVar.B = this.B;
    }

    public void T1() {
        this.B = null;
    }

    public void U1(float f11, float f12, float f13) {
        this.B = new DashPathEffect(new float[]{f11, f12}, f13);
    }

    public boolean V1() {
        return this.B != null;
    }

    public void W1(boolean z11) {
        Y1(z11);
        X1(z11);
    }

    public void X1(boolean z11) {
        this.f52074z = z11;
    }

    public void Y1(boolean z11) {
        this.f52073y = z11;
    }

    public void Z1(float f11) {
        this.A = rm.k.e(f11);
    }

    @Override // km.h
    public DashPathEffect e1() {
        return this.B;
    }

    @Override // km.h
    public boolean o1() {
        return this.f52074z;
    }
}
