package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f65670a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f65671b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Integer f65672c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final x[] f65673d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final Integer f65674e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f65675f;

    public w(int i11, @m80.l String str, @m80.l Integer num, @m80.l x[] xVarArr, @m80.l Integer num2, @m80.l String str2) {
        this.f65670a = i11;
        this.f65671b = str;
        this.f65672c = num;
        this.f65673d = xVarArr;
        this.f65674e = num2;
        this.f65675f = str2;
    }

    public static /* synthetic */ w h(w wVar, int i11, String str, Integer num, x[] xVarArr, Integer num2, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = wVar.f65670a;
        }
        if ((i12 & 2) != 0) {
            str = wVar.f65671b;
        }
        if ((i12 & 4) != 0) {
            num = wVar.f65672c;
        }
        if ((i12 & 8) != 0) {
            xVarArr = wVar.f65673d;
        }
        if ((i12 & 16) != 0) {
            num2 = wVar.f65674e;
        }
        if ((i12 & 32) != 0) {
            str2 = wVar.f65675f;
        }
        Integer num3 = num2;
        String str3 = str2;
        return wVar.g(i11, str, num, xVarArr, num3, str3);
    }

    public final int a() {
        return this.f65670a;
    }

    @m80.l
    public final String b() {
        return this.f65671b;
    }

    @m80.l
    public final Integer c() {
        return this.f65672c;
    }

    @m80.l
    public final x[] d() {
        return this.f65673d;
    }

    @m80.l
    public final Integer e() {
        return this.f65674e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f65670a != wVar.f65670a || !kotlin.jvm.internal.g0.g(this.f65671b, wVar.f65671b) || !kotlin.jvm.internal.g0.g(this.f65672c, wVar.f65672c)) {
            return false;
        }
        x[] xVarArr = this.f65673d;
        if (xVarArr != null) {
            x[] xVarArr2 = wVar.f65673d;
            if (xVarArr2 == null || !Arrays.equals(xVarArr, xVarArr2)) {
                return false;
            }
        } else if (wVar.f65673d != null) {
            return false;
        }
        return kotlin.jvm.internal.g0.g(this.f65674e, wVar.f65674e) && kotlin.jvm.internal.g0.g(this.f65675f, wVar.f65675f);
    }

    @m80.l
    public final String f() {
        return this.f65675f;
    }

    @m80.k
    public final w g(int i11, @m80.l String str, @m80.l Integer num, @m80.l x[] xVarArr, @m80.l Integer num2, @m80.l String str2) {
        return new w(i11, str, num, xVarArr, num2, str2);
    }

    public int hashCode() {
        int i11 = this.f65670a * 31;
        String str = this.f65671b;
        int hashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f65672c;
        int intValue = (hashCode + (num != null ? num.intValue() : 0)) * 31;
        x[] xVarArr = this.f65673d;
        int hashCode2 = (intValue + (xVarArr != null ? Arrays.hashCode(xVarArr) : 0)) * 31;
        Integer num2 = this.f65674e;
        int intValue2 = (hashCode2 + (num2 != null ? num2.intValue() : 0)) * 31;
        String str2 = this.f65675f;
        return intValue2 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.l
    public final Integer i() {
        return this.f65672c;
    }

    @m80.l
    public final String j() {
        return this.f65671b;
    }

    @m80.l
    public final String k() {
        return this.f65675f;
    }

    @m80.l
    public final Integer l() {
        return this.f65674e;
    }

    public final int m() {
        return this.f65670a;
    }

    @m80.l
    public final x[] n() {
        return this.f65673d;
    }

    @m80.k
    public String toString() {
        return "CalendarDailyInfo(state=" + this.f65670a + ", hint=" + this.f65671b + ", dailyWordCount=" + this.f65672c + ", words=" + Arrays.toString(this.f65673d) + ", resignState=" + this.f65674e + ", resignMessage=" + this.f65675f + ')';
    }
}
