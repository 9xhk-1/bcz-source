package o90;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class x<C extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> implements z<C> {

    /* renamed from: a, reason: collision with root package name */
    public final z[] f76713a;

    public x(z... zVarArr) {
        this.f76713a = zVarArr;
    }

    @Override // o90.z
    public void h(C c11) {
        int i11 = 0;
        while (true) {
            z[] zVarArr = this.f76713a;
            if (i11 >= zVarArr.length) {
                return;
            }
            zVarArr[i11].h(c11);
            i11++;
        }
    }

    @Override // o90.z
    public void i(C c11) {
        int i11 = 0;
        while (true) {
            z[] zVarArr = this.f76713a;
            if (i11 >= zVarArr.length) {
                return;
            }
            zVarArr[i11].i(c11);
            i11++;
        }
    }

    @Override // o90.z
    public void q(String[] strArr, C c11) {
        int i11 = 0;
        while (true) {
            z[] zVarArr = this.f76713a;
            if (i11 >= zVarArr.length) {
                return;
            }
            zVarArr[i11].q(strArr, c11);
            i11++;
        }
    }
}
