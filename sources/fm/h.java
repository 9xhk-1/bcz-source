package fm;

import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.DataSet;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h extends d<BubbleEntry> implements km.c {
    public float A;

    /* renamed from: y, reason: collision with root package name */
    public float f52057y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f52058z;

    public h(List<BubbleEntry> list, String str) {
        super(list, str);
        this.f52058z = true;
        this.A = 2.5f;
    }

    @Override // km.c
    public float D0() {
        return this.A;
    }

    @Override // km.c
    public boolean E() {
        return this.f52058z;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet<BubbleEntry> L1() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f30249s.size(); i11++) {
            arrayList.add(((BubbleEntry) this.f30249s.get(i11)).h());
        }
        h hVar = new h(arrayList, getLabel());
        T1(hVar);
        return hVar;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    /* renamed from: S1, reason: merged with bridge method [inline-methods] */
    public void I1(BubbleEntry bubbleEntry) {
        super.I1(bubbleEntry);
        float m11 = bubbleEntry.m();
        if (m11 > this.f52057y) {
            this.f52057y = m11;
        }
    }

    public void T1(h hVar) {
        hVar.A = this.A;
        hVar.f52058z = this.f52058z;
    }

    public void U1(boolean z11) {
        this.f52058z = z11;
    }

    @Override // km.c
    public void Z0(float f11) {
        this.A = rm.k.e(f11);
    }

    @Override // km.c
    public float a() {
        return this.f52057y;
    }
}
