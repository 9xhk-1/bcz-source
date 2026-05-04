package hm;

import java.text.DecimalFormat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i extends l {

    /* renamed from: a, reason: collision with root package name */
    public String[] f59498a;

    /* renamed from: b, reason: collision with root package name */
    public int f59499b;

    /* renamed from: c, reason: collision with root package name */
    public DecimalFormat f59500c;

    /* renamed from: d, reason: collision with root package name */
    public String f59501d;

    public i() {
        this.f59498a = new String[]{"", "k", "m", yr.e.f100279a, "t"};
        this.f59499b = 5;
        this.f59501d = "";
        this.f59500c = new DecimalFormat("###E00");
    }

    @Override // hm.l
    public String h(float f11) {
        return m(f11) + this.f59501d;
    }

    public int l() {
        return 0;
    }

    public final String m(double d11) {
        String format = this.f59500c.format(d11);
        int numericValue = Character.getNumericValue(format.charAt(format.length() - 1));
        String replaceAll = format.replaceAll("E[0-9][0-9]", this.f59498a[Integer.valueOf(Character.getNumericValue(format.charAt(format.length() - 2)) + "" + numericValue).intValue() / 3]);
        while (true) {
            if (replaceAll.length() <= this.f59499b && !replaceAll.matches("[0-9]+\\.[a-z]")) {
                return replaceAll;
            }
            replaceAll = replaceAll.substring(0, replaceAll.length() - 2) + replaceAll.substring(replaceAll.length() - 1);
        }
    }

    public void n(String str) {
        this.f59501d = str;
    }

    public void o(int i11) {
        this.f59499b = i11;
    }

    public void p(String[] strArr) {
        this.f59498a = strArr;
    }

    public i(String str) {
        this();
        this.f59501d = str;
    }
}
