package fm;

import android.graphics.Color;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.DataSet;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b extends d<BarEntry> implements km.a {
    public float A;
    public int B;
    public int C;
    public int D;
    public String[] E;

    /* renamed from: y, reason: collision with root package name */
    public int f52033y;

    /* renamed from: z, reason: collision with root package name */
    public int f52034z;

    public b(List<BarEntry> list, String str) {
        super(list, str);
        this.f52033y = 1;
        this.f52034z = Color.rgb(R.styleable.Theme_drawable_revocation, R.styleable.Theme_drawable_revocation, R.styleable.Theme_drawable_revocation);
        this.A = 0.0f;
        this.B = -16777216;
        this.C = 120;
        this.D = 0;
        this.E = new String[]{"Stack"};
        this.f52035x = Color.rgb(0, 0, 0);
        U1(list);
        S1(list);
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet<BarEntry> L1() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f30249s.size(); i11++) {
            arrayList.add(((BarEntry) this.f30249s.get(i11)).h());
        }
        b bVar = new b(arrayList, getLabel());
        V1(bVar);
        return bVar;
    }

    @Override // km.a
    public float N() {
        return this.A;
    }

    public final void S1(List<BarEntry> list) {
        this.D = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            float[] v11 = list.get(i11).v();
            if (v11 == null) {
                this.D++;
            } else {
                this.D += v11.length;
            }
        }
    }

    @Override // com.github.mikephil.charting.data.DataSet
    /* renamed from: T1, reason: merged with bridge method [inline-methods] */
    public void I1(BarEntry barEntry) {
        if (barEntry == null || Float.isNaN(barEntry.c())) {
            return;
        }
        if (barEntry.v() == null) {
            if (barEntry.c() < this.f30251u) {
                this.f30251u = barEntry.c();
            }
            if (barEntry.c() > this.f30250t) {
                this.f30250t = barEntry.c();
            }
        } else {
            if ((-barEntry.r()) < this.f30251u) {
                this.f30251u = -barEntry.r();
            }
            if (barEntry.s() > this.f30250t) {
                this.f30250t = barEntry.s();
            }
        }
        J1(barEntry);
    }

    public final void U1(List<BarEntry> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            float[] v11 = list.get(i11).v();
            if (v11 != null && v11.length > this.f52033y) {
                this.f52033y = v11.length;
            }
        }
    }

    public void V1(b bVar) {
        super.Q1(bVar);
        bVar.f52033y = this.f52033y;
        bVar.f52034z = this.f52034z;
        bVar.A = this.A;
        bVar.E = this.E;
        bVar.C = this.C;
    }

    public int W1() {
        return this.D;
    }

    public void X1(int i11) {
        this.B = i11;
    }

    public void Y1(float f11) {
        this.A = f11;
    }

    public void Z1(int i11) {
        this.f52034z = i11;
    }

    @Override // km.a
    public int a1() {
        return this.f52034z;
    }

    public void a2(int i11) {
        this.C = i11;
    }

    public void b2(String[] strArr) {
        this.E = strArr;
    }

    @Override // km.a
    public boolean c0() {
        return this.f52033y > 1;
    }

    @Override // km.a
    public String[] d0() {
        return this.E;
    }

    @Override // km.a
    public int i1() {
        return this.C;
    }

    @Override // km.a
    public int p0() {
        return this.B;
    }

    @Override // km.a
    public int t() {
        return this.f52033y;
    }
}
