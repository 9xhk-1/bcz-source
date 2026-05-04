package p2;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.net.InetAddress;
import java.net.ServerSocket;
import q1.g;
import q1.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c implements Runnable, Input {

    /* renamed from: w, reason: collision with root package name */
    public static final int f78670w = 20;

    /* renamed from: x, reason: collision with root package name */
    public static int f78671x = 8190;

    /* renamed from: a, reason: collision with root package name */
    public ServerSocket f78672a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f78673b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f78674c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f78675d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f78676e;

    /* renamed from: f, reason: collision with root package name */
    public float f78677f;

    /* renamed from: g, reason: collision with root package name */
    public float f78678g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f78679h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0968c f78680i;

    /* renamed from: j, reason: collision with root package name */
    public int f78681j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f78682k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f78683l;

    /* renamed from: m, reason: collision with root package name */
    public boolean[] f78684m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f78685n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f78686o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f78687p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f78688q;

    /* renamed from: r, reason: collision with root package name */
    public boolean[] f78689r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f78690s;

    /* renamed from: t, reason: collision with root package name */
    public k f78691t;

    /* renamed from: u, reason: collision with root package name */
    public final int f78692u;

    /* renamed from: v, reason: collision with root package name */
    public final String[] f78693v;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public d f78694a;

        /* renamed from: b, reason: collision with root package name */
        public b f78695b;

        public a(d dVar, b bVar) {
            this.f78694a = dVar;
            this.f78695b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            cVar.f78690s = false;
            if (cVar.f78683l) {
                cVar.f78683l = false;
                int i11 = 0;
                while (true) {
                    boolean[] zArr = c.this.f78684m;
                    if (i11 >= zArr.length) {
                        break;
                    }
                    zArr[i11] = false;
                    i11++;
                }
            }
            c cVar2 = c.this;
            k kVar = cVar2.f78691t;
            if (kVar == null) {
                d dVar = this.f78694a;
                if (dVar != null) {
                    int i12 = dVar.f78709b;
                    if (i12 == 0) {
                        int[] iArr = cVar2.f78685n;
                        int i13 = dVar.f78712e;
                        iArr[i13] = 0;
                        cVar2.f78686o[i13] = 0;
                        cVar2.f78689r[i13] = true;
                        cVar2.f78690s = true;
                    } else if (i12 == 1) {
                        int[] iArr2 = cVar2.f78685n;
                        int i14 = dVar.f78712e;
                        iArr2[i14] = 0;
                        cVar2.f78686o[i14] = 0;
                        cVar2.f78689r[i14] = false;
                    } else if (i12 == 2) {
                        int[] iArr3 = cVar2.f78685n;
                        int i15 = dVar.f78712e;
                        iArr3[i15] = dVar.f78710c - cVar2.f78687p[i15];
                        cVar2.f78686o[i15] = dVar.f78711d - cVar2.f78688q[i15];
                    }
                    int[] iArr4 = cVar2.f78687p;
                    int i16 = dVar.f78712e;
                    iArr4[i16] = dVar.f78710c;
                    cVar2.f78688q[i16] = dVar.f78711d;
                }
                b bVar = this.f78695b;
                if (bVar != null) {
                    int i17 = bVar.f78701b;
                    if (i17 == 0) {
                        boolean[] zArr2 = cVar2.f78682k;
                        int i18 = bVar.f78702c;
                        if (!zArr2[i18]) {
                            cVar2.f78681j++;
                            zArr2[i18] = true;
                        }
                        cVar2.f78683l = true;
                        cVar2.f78684m[i18] = true;
                    }
                    if (i17 == 1) {
                        boolean[] zArr3 = cVar2.f78682k;
                        int i19 = bVar.f78702c;
                        if (zArr3[i19]) {
                            cVar2.f78681j--;
                            zArr3[i19] = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            d dVar2 = this.f78694a;
            if (dVar2 != null) {
                int i21 = dVar2.f78709b;
                if (i21 == 0) {
                    int[] iArr5 = cVar2.f78685n;
                    int i22 = dVar2.f78712e;
                    iArr5[i22] = 0;
                    cVar2.f78686o[i22] = 0;
                    kVar.o(dVar2.f78710c, dVar2.f78711d, i22, 0);
                    c cVar3 = c.this;
                    cVar3.f78689r[this.f78694a.f78712e] = true;
                    cVar3.f78690s = true;
                } else if (i21 == 1) {
                    int[] iArr6 = cVar2.f78685n;
                    int i23 = dVar2.f78712e;
                    iArr6[i23] = 0;
                    cVar2.f78686o[i23] = 0;
                    kVar.b(dVar2.f78710c, dVar2.f78711d, i23, 0);
                    c.this.f78689r[this.f78694a.f78712e] = false;
                } else if (i21 == 2) {
                    int[] iArr7 = cVar2.f78685n;
                    int i24 = dVar2.f78712e;
                    int i25 = dVar2.f78710c;
                    iArr7[i24] = i25 - cVar2.f78687p[i24];
                    int[] iArr8 = cVar2.f78686o;
                    int i26 = dVar2.f78711d;
                    iArr8[i24] = i26 - cVar2.f78688q[i24];
                    kVar.I(i25, i26, i24);
                }
                c cVar4 = c.this;
                int[] iArr9 = cVar4.f78687p;
                d dVar3 = this.f78694a;
                int i27 = dVar3.f78712e;
                iArr9[i27] = dVar3.f78710c;
                cVar4.f78688q[i27] = dVar3.f78711d;
            }
            b bVar2 = this.f78695b;
            if (bVar2 != null) {
                int i28 = bVar2.f78701b;
                if (i28 == 0) {
                    c.this.f78691t.Z(bVar2.f78702c);
                    c cVar5 = c.this;
                    boolean[] zArr4 = cVar5.f78682k;
                    int i29 = this.f78695b.f78702c;
                    if (!zArr4[i29]) {
                        cVar5.f78681j++;
                        zArr4[i29] = true;
                    }
                    cVar5.f78683l = true;
                    cVar5.f78684m[i29] = true;
                    return;
                }
                if (i28 != 1) {
                    if (i28 != 2) {
                        return;
                    }
                    c.this.f78691t.i0(bVar2.f78703d);
                    return;
                }
                c.this.f78691t.X(bVar2.f78702c);
                c cVar6 = c.this;
                boolean[] zArr5 = cVar6.f78682k;
                int i31 = this.f78695b.f78702c;
                if (zArr5[i31]) {
                    cVar6.f78681j--;
                    zArr5[i31] = false;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b {

        /* renamed from: f, reason: collision with root package name */
        public static final int f78697f = 0;

        /* renamed from: g, reason: collision with root package name */
        public static final int f78698g = 1;

        /* renamed from: h, reason: collision with root package name */
        public static final int f78699h = 2;

        /* renamed from: a, reason: collision with root package name */
        public long f78700a;

        /* renamed from: b, reason: collision with root package name */
        public int f78701b;

        /* renamed from: c, reason: collision with root package name */
        public int f78702c;

        /* renamed from: d, reason: collision with root package name */
        public char f78703d;

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: p2.c$c, reason: collision with other inner class name */
    public interface InterfaceC0968c {
        void a();

        void onConnected();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d {

        /* renamed from: g, reason: collision with root package name */
        public static final int f78705g = 0;

        /* renamed from: h, reason: collision with root package name */
        public static final int f78706h = 1;

        /* renamed from: i, reason: collision with root package name */
        public static final int f78707i = 2;

        /* renamed from: a, reason: collision with root package name */
        public long f78708a;

        /* renamed from: b, reason: collision with root package name */
        public int f78709b;

        /* renamed from: c, reason: collision with root package name */
        public int f78710c;

        /* renamed from: d, reason: collision with root package name */
        public int f78711d;

        /* renamed from: e, reason: collision with root package name */
        public int f78712e;

        public d() {
        }
    }

    public c() {
        this(f78671x);
    }

    @Override // com.badlogic.gdx.Input
    public float B() {
        return this.f78675d[1];
    }

    @Override // com.badlogic.gdx.Input
    public int C() {
        return this.f78687p[0];
    }

    @Override // com.badlogic.gdx.Input
    public float D() {
        return this.f78673b[0];
    }

    @Override // com.badlogic.gdx.Input
    public boolean E(int i11) {
        if (i11 != 0) {
            return false;
        }
        int i12 = 0;
        while (true) {
            boolean[] zArr = this.f78689r;
            if (i12 >= zArr.length) {
                return false;
            }
            if (zArr[i12]) {
                return true;
            }
            i12++;
        }
    }

    @Override // com.badlogic.gdx.Input
    public float F() {
        return N(0);
    }

    @Override // com.badlogic.gdx.Input
    public boolean H(int i11) {
        return this.f78689r[i11];
    }

    @Override // com.badlogic.gdx.Input
    public boolean J(int i11) {
        return false;
    }

    @Override // com.badlogic.gdx.Input
    public Input.Orientation K() {
        return Input.Orientation.Landscape;
    }

    @Override // com.badlogic.gdx.Input
    public float L() {
        return this.f78675d[0];
    }

    @Override // com.badlogic.gdx.Input
    public void M(Input.e eVar, String str, String str2, String str3, Input.OnscreenKeyboardType onscreenKeyboardType) {
        g.f81378a.getInput().M(eVar, str, str2, str3, onscreenKeyboardType);
    }

    @Override // com.badlogic.gdx.Input
    public float N(int i11) {
        return H(i11) ? 1.0f : 0.0f;
    }

    @Override // com.badlogic.gdx.Input
    public int P() {
        return this.f78686o[0];
    }

    @Override // com.badlogic.gdx.Input
    public float R() {
        return this.f78673b[2];
    }

    @Override // com.badlogic.gdx.Input
    public int S() {
        return 0;
    }

    @Override // com.badlogic.gdx.Input
    public void T(k kVar) {
        this.f78691t = kVar;
    }

    @Override // com.badlogic.gdx.Input
    public int U(int i11) {
        return this.f78686o[i11];
    }

    @Override // com.badlogic.gdx.Input
    public float V() {
        return this.f78673b[1];
    }

    @Override // com.badlogic.gdx.Input
    public int W(int i11) {
        return this.f78685n[i11];
    }

    public String[] X() {
        return this.f78693v;
    }

    public boolean Y() {
        return this.f78679h;
    }

    @Override // com.badlogic.gdx.Input
    public void b(Input.e eVar, String str, String str2, String str3) {
        g.f81378a.getInput().b(eVar, str, str2, str3);
    }

    @Override // com.badlogic.gdx.Input
    public boolean c(int i11) {
        if (i11 == -1) {
            return this.f78681j > 0;
        }
        if (i11 < 0 || i11 > 255) {
            return false;
        }
        return this.f78682k[i11];
    }

    @Override // com.badlogic.gdx.Input
    public boolean d() {
        return false;
    }

    @Override // com.badlogic.gdx.Input
    public long f() {
        return 0L;
    }

    @Override // com.badlogic.gdx.Input
    public int g() {
        return this.f78685n[0];
    }

    @Override // com.badlogic.gdx.Input
    public int getY() {
        return this.f78688q[0];
    }

    @Override // com.badlogic.gdx.Input
    public boolean h() {
        return this.f78689r[0];
    }

    @Override // com.badlogic.gdx.Input
    public boolean j() {
        return this.f78690s;
    }

    @Override // com.badlogic.gdx.Input
    public int k(int i11) {
        return this.f78688q[i11];
    }

    @Override // com.badlogic.gdx.Input
    public boolean m(int i11) {
        return i11 == 0 && this.f78690s;
    }

    @Override // com.badlogic.gdx.Input
    public float n() {
        return this.f78674c[1];
    }

    @Override // com.badlogic.gdx.Input
    public int o() {
        return 20;
    }

    @Override // com.badlogic.gdx.Input
    public boolean q(Input.Peripheral peripheral) {
        if (peripheral == Input.Peripheral.Accelerometer || peripheral == Input.Peripheral.Compass) {
            return true;
        }
        if (peripheral == Input.Peripheral.MultitouchScreen) {
            return this.f78676e;
        }
        return false;
    }

    @Override // com.badlogic.gdx.Input
    public float r() {
        return this.f78674c[2];
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getId()" because "imPostDom" is null
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:169)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: Infinite loop detected, blocks: 35, insns: 0 */
    @Override // java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.c.run():void");
    }

    @Override // com.badlogic.gdx.Input
    public boolean t(int i11) {
        if (i11 == -1) {
            return this.f78683l;
        }
        if (i11 < 0 || i11 > 255) {
            return false;
        }
        return this.f78684m[i11];
    }

    @Override // com.badlogic.gdx.Input
    public k w() {
        return this.f78691t;
    }

    @Override // com.badlogic.gdx.Input
    public float x() {
        return this.f78675d[2];
    }

    @Override // com.badlogic.gdx.Input
    public float y() {
        return this.f78674c[0];
    }

    @Override // com.badlogic.gdx.Input
    public int z(int i11) {
        return this.f78687p[i11];
    }

    public c(InterfaceC0968c interfaceC0968c) {
        this(f78671x, interfaceC0968c);
    }

    public c(int i11) {
        this(i11, null);
    }

    public c(int i11, InterfaceC0968c interfaceC0968c) {
        this.f78673b = new float[3];
        this.f78674c = new float[3];
        this.f78675d = new float[3];
        this.f78676e = false;
        this.f78677f = 0.0f;
        this.f78678g = 0.0f;
        this.f78679h = false;
        this.f78681j = 0;
        this.f78682k = new boolean[256];
        this.f78683l = false;
        this.f78684m = new boolean[256];
        this.f78685n = new int[20];
        this.f78686o = new int[20];
        this.f78687p = new int[20];
        this.f78688q = new int[20];
        this.f78689r = new boolean[20];
        this.f78690s = false;
        this.f78691t = null;
        this.f78680i = interfaceC0968c;
        try {
            this.f78692u = i11;
            this.f78672a = new ServerSocket(i11);
            Thread thread = new Thread(this);
            thread.setDaemon(true);
            thread.start();
            InetAddress[] allByName = InetAddress.getAllByName(InetAddress.getLocalHost().getHostName());
            this.f78693v = new String[allByName.length];
            for (int i12 = 0; i12 < allByName.length; i12++) {
                this.f78693v[i12] = allByName[i12].getHostAddress();
            }
        } catch (Exception e11) {
            throw new GdxRuntimeException("Couldn't open listening socket at port '" + i11 + "'", e11);
        }
    }

    @Override // com.badlogic.gdx.Input
    public void G(boolean z11) {
    }

    @Override // com.badlogic.gdx.Input
    public void Q(p2.b bVar) {
    }

    @Override // com.badlogic.gdx.Input
    public void i(Input.VibrationType vibrationType) {
    }

    @Override // com.badlogic.gdx.Input
    public void l(float[] fArr) {
    }

    @Override // com.badlogic.gdx.Input
    public void p(int i11) {
    }

    @Override // com.badlogic.gdx.Input
    public void s(boolean z11) {
    }

    @Override // com.badlogic.gdx.Input
    public void u(boolean z11) {
    }

    @Override // com.badlogic.gdx.Input
    public void v(Input.c cVar) {
    }

    @Override // com.badlogic.gdx.Input
    public void I(boolean z11, Input.OnscreenKeyboardType onscreenKeyboardType) {
    }

    @Override // com.badlogic.gdx.Input
    public void O(int i11, boolean z11) {
    }

    @Override // com.badlogic.gdx.Input
    public void a(int i11, int i12) {
    }

    @Override // com.badlogic.gdx.Input
    public void e(int i11, boolean z11) {
    }

    @Override // com.badlogic.gdx.Input
    public void A(int i11, int i12, boolean z11) {
    }
}
