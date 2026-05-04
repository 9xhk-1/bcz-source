package sb;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f88259a;

    public j(int timeOut) {
        this.f88259a = new int[]{timeOut};
    }

    public int a() {
        int[] iArr = this.f88259a;
        if (iArr == null || iArr.length != 1) {
            return 0;
        }
        return iArr[0];
    }

    public int b() {
        int[] iArr = this.f88259a;
        if (iArr == null || iArr.length != 3) {
            return 0;
        }
        return iArr[0];
    }

    public int c() {
        int[] iArr = this.f88259a;
        if (iArr == null || iArr.length != 3) {
            return 0;
        }
        return iArr[1];
    }

    public int d() {
        int[] iArr = this.f88259a;
        if (iArr == null || iArr.length != 3) {
            return 0;
        }
        return iArr[2];
    }

    public j(int time2g, int time3g, int timeWifi) {
        this.f88259a = new int[]{time2g, time3g, timeWifi};
    }
}
