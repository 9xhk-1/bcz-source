package gq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f53995a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f53996b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f53997c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f53998d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f53999e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f54000f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f54001g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f54002h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ c[] f54003i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a extends c {
        public a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // gq.c
        public boolean a(int i11, int i12) {
            return ((i11 + i12) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        f53995a = aVar;
        c cVar = new c("DATA_MASK_001", 1) { // from class: gq.c.b
            {
                a aVar2 = null;
            }

            @Override // gq.c
            public boolean a(int i11, int i12) {
                return (i11 & 1) == 0;
            }
        };
        f53996b = cVar;
        c cVar2 = new c("DATA_MASK_010", 2) { // from class: gq.c.c
            {
                a aVar2 = null;
            }

            @Override // gq.c
            public boolean a(int i11, int i12) {
                return i12 % 3 == 0;
            }
        };
        f53997c = cVar2;
        c cVar3 = new c("DATA_MASK_011", 3) { // from class: gq.c.d
            {
                a aVar2 = null;
            }

            @Override // gq.c
            public boolean a(int i11, int i12) {
                return (i11 + i12) % 3 == 0;
            }
        };
        f53998d = cVar3;
        c cVar4 = new c("DATA_MASK_100", 4) { // from class: gq.c.e
            {
                a aVar2 = null;
            }

            @Override // gq.c
            public boolean a(int i11, int i12) {
                return (((i11 / 2) + (i12 / 3)) & 1) == 0;
            }
        };
        f53999e = cVar4;
        c cVar5 = new c("DATA_MASK_101", 5) { // from class: gq.c.f
            {
                a aVar2 = null;
            }

            @Override // gq.c
            public boolean a(int i11, int i12) {
                return (i11 * i12) % 6 == 0;
            }
        };
        f54000f = cVar5;
        c cVar6 = new c("DATA_MASK_110", 6) { // from class: gq.c.g
            {
                a aVar2 = null;
            }

            @Override // gq.c
            public boolean a(int i11, int i12) {
                return (i11 * i12) % 6 < 3;
            }
        };
        f54001g = cVar6;
        c cVar7 = new c("DATA_MASK_111", 7) { // from class: gq.c.h
            {
                a aVar2 = null;
            }

            @Override // gq.c
            public boolean a(int i11, int i12) {
                return (((i11 + i12) + ((i11 * i12) % 3)) & 1) == 0;
            }
        };
        f54002h = cVar7;
        f54003i = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
    }

    public c(String str, int i11) {
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f54003i.clone();
    }

    public abstract boolean a(int i11, int i12);

    public final void b(kp.b bVar, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                if (a(i12, i13)) {
                    bVar.d(i13, i12);
                }
            }
        }
    }

    public /* synthetic */ c(String str, int i11, a aVar) {
        this(str, i11);
    }
}
