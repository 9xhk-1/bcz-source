package hm;

import fm.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c implements f {
    @Override // hm.f
    public float a(km.f fVar, jm.g gVar) {
        float yChartMax = gVar.getYChartMax();
        float yChartMin = gVar.getYChartMin();
        m lineData = gVar.getLineData();
        if (fVar.m0() > 0.0f && fVar.q0() < 0.0f) {
            return 0.0f;
        }
        if (lineData.z() > 0.0f) {
            yChartMax = 0.0f;
        }
        if (lineData.B() < 0.0f) {
            yChartMin = 0.0f;
        }
        return fVar.q0() >= 0.0f ? yChartMin : yChartMax;
    }
}
