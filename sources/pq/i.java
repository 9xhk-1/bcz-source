package pq;

import android.content.Context;
import android.util.Log;

/* loaded from: classes7.dex */
public class i implements oq.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f81146a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81147b;

    /* renamed from: c, reason: collision with root package name */
    public oq.d f81148c;

    public i(Context context, String str) {
        Log.d("AGC_FixedDecrypt", "init");
        this.f81146a = context;
        this.f81147b = str;
    }

    @Override // oq.b
    public String a(String str, String str2) {
        if (this.f81148c == null) {
            this.f81148c = b();
        }
        return this.f81148c.a(n.b(this.f81146a, this.f81147b, "agc_", str), str2);
    }

    @Override // oq.b
    public oq.d b() {
        return new h(new f(n.b(this.f81146a, this.f81147b, "agc_", "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"), n.b(this.f81146a, this.f81147b, "agc_", "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"), n.b(this.f81146a, this.f81147b, "agc_", "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"), n.b(this.f81146a, this.f81147b, "agc_", "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"), qr.c.f82661b, 5000));
    }
}
