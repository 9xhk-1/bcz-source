package com.github.mikephil.charting.data;

import java.util.ArrayList;
import java.util.List;
import km.i;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class PieDataSet extends DataSet<PieEntry> implements i {
    public ValuePosition A;
    public ValuePosition B;
    public boolean C;
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public boolean I;

    /* renamed from: x, reason: collision with root package name */
    public float f30255x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f30256y;

    /* renamed from: z, reason: collision with root package name */
    public float f30257z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ValuePosition {
        INSIDE_SLICE,
        OUTSIDE_SLICE
    }

    public PieDataSet(List<PieEntry> list, String str) {
        super(list, str);
        this.f30255x = 0.0f;
        this.f30257z = 18.0f;
        ValuePosition valuePosition = ValuePosition.INSIDE_SLICE;
        this.A = valuePosition;
        this.B = valuePosition;
        this.C = false;
        this.D = -16777216;
        this.E = 1.0f;
        this.F = 75.0f;
        this.G = 0.3f;
        this.H = 0.4f;
        this.I = true;
    }

    @Override // km.i
    public float J0() {
        return this.f30255x;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet<PieEntry> L1() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f30249s.size(); i11++) {
            arrayList.add(((PieEntry) this.f30249s.get(i11)).h());
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, getLabel());
        R1(pieDataSet);
        return pieDataSet;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    /* renamed from: Q1, reason: merged with bridge method [inline-methods] */
    public void I1(PieEntry pieEntry) {
        if (pieEntry == null) {
            return;
        }
        K1(pieEntry);
    }

    @Override // km.i
    public ValuePosition R() {
        return this.A;
    }

    public void R1(PieDataSet pieDataSet) {
        super.M1(pieDataSet);
    }

    public void S1(boolean z11) {
        this.f30256y = z11;
    }

    public void T1(float f11) {
        this.f30257z = k.e(f11);
    }

    public void U1(float f11) {
        if (f11 > 20.0f) {
            f11 = 20.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        this.f30255x = k.e(f11);
    }

    public void V1(boolean z11) {
        this.C = z11;
    }

    public void W1(int i11) {
        this.D = i11;
    }

    @Override // km.i
    public int X0() {
        return this.D;
    }

    public void X1(float f11) {
        this.G = f11;
    }

    public void Y1(float f11) {
        this.F = f11;
    }

    public void Z1(float f11) {
        this.H = f11;
    }

    public void a2(boolean z11) {
        this.I = z11;
    }

    @Override // km.i
    public float b0() {
        return this.F;
    }

    public void b2(float f11) {
        this.E = f11;
    }

    public void c2(ValuePosition valuePosition) {
        this.A = valuePosition;
    }

    public void d2(ValuePosition valuePosition) {
        this.B = valuePosition;
    }

    @Override // km.i
    public ValuePosition f1() {
        return this.B;
    }

    @Override // km.i
    public boolean g1() {
        return this.I;
    }

    @Override // km.i
    public boolean h1() {
        return this.C;
    }

    @Override // km.i
    public boolean l() {
        return this.f30256y;
    }

    @Override // km.i
    public float u() {
        return this.H;
    }

    @Override // km.i
    public float v0() {
        return this.E;
    }

    @Override // km.i
    public float w0() {
        return this.G;
    }

    @Override // km.i
    public float y() {
        return this.f30257z;
    }
}
