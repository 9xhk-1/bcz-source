package fm;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.jiongji.andriod.card.R;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class n<T extends Entry> extends o<T> implements km.g<T> {
    public int C;
    public Drawable D;
    public int E;
    public float F;
    public boolean G;

    public n(List<T> list, String str) {
        super(list, str);
        this.C = Color.rgb(140, R.styleable.Theme_drawable_tab_lecture_new, 255);
        this.E = 85;
        this.F = 2.5f;
        this.G = false;
    }

    @Override // km.g
    public int G() {
        return this.C;
    }

    @Override // km.g
    public boolean W0() {
        return this.G;
    }

    public void a2(n nVar) {
        super.S1(nVar);
        nVar.G = this.G;
        nVar.E = this.E;
        nVar.C = this.C;
        nVar.D = this.D;
        nVar.F = this.F;
    }

    public void b2(int i11) {
        this.E = i11;
    }

    @Override // km.g
    public void c1(boolean z11) {
        this.G = z11;
    }

    public void c2(int i11) {
        this.C = i11;
        this.D = null;
    }

    @TargetApi(18)
    public void d2(Drawable drawable) {
        this.D = drawable;
    }

    public void e2(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 10.0f) {
            f11 = 10.0f;
        }
        this.F = rm.k.e(f11);
    }

    @Override // km.g
    public Drawable k() {
        return this.D;
    }

    @Override // km.g
    public int l0() {
        return this.E;
    }

    @Override // km.g
    public float o0() {
        return this.F;
    }
}
