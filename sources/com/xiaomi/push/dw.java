package com.xiaomi.push;

/* loaded from: classes8.dex */
public final class dw {

    public static final class a extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f274a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f276b;

        /* renamed from: c, reason: collision with other field name */
        private boolean f278c;

        /* renamed from: d, reason: collision with other field name */
        private boolean f280d;

        /* renamed from: e, reason: collision with other field name */
        private boolean f282e;

        /* renamed from: f, reason: collision with other field name */
        private boolean f283f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f45414g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f45415h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f45416i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f45417j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f45418k;

        /* renamed from: a, reason: collision with root package name */
        private int f45408a = 0;

        /* renamed from: a, reason: collision with other field name */
        private long f272a = 0;

        /* renamed from: a, reason: collision with other field name */
        private String f273a = "";

        /* renamed from: b, reason: collision with other field name */
        private String f275b = "";

        /* renamed from: c, reason: collision with other field name */
        private String f277c = "";

        /* renamed from: d, reason: collision with other field name */
        private String f279d = "";

        /* renamed from: e, reason: collision with other field name */
        private String f281e = "";

        /* renamed from: b, reason: collision with root package name */
        private int f45409b = 1;

        /* renamed from: c, reason: collision with root package name */
        private int f45410c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f45411d = 0;

        /* renamed from: f, reason: collision with root package name */
        private String f45413f = "";

        /* renamed from: e, reason: collision with root package name */
        private int f45412e = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f45412e < 0) {
                b();
            }
            return this.f45412e;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a11 = m5839a() ? com.xiaomi.push.c.a(1, c()) : 0;
            if (m5841b()) {
                a11 += com.xiaomi.push.c.b(2, m5836a());
            }
            if (m5843c()) {
                a11 += com.xiaomi.push.c.a(3, m5838a());
            }
            if (m5845d()) {
                a11 += com.xiaomi.push.c.a(4, m5840b());
            }
            if (m5847e()) {
                a11 += com.xiaomi.push.c.a(5, m5842c());
            }
            if (m5849f()) {
                a11 += com.xiaomi.push.c.a(6, m5844d());
            }
            if (g()) {
                a11 += com.xiaomi.push.c.a(7, m5846e());
            }
            if (h()) {
                a11 += com.xiaomi.push.c.a(8, d());
            }
            if (i()) {
                a11 += com.xiaomi.push.c.a(9, e());
            }
            if (j()) {
                a11 += com.xiaomi.push.c.a(10, f());
            }
            if (k()) {
                a11 += com.xiaomi.push.c.a(11, m5848f());
            }
            this.f45412e = a11;
            return a11;
        }

        public int c() {
            return this.f45408a;
        }

        public int d() {
            return this.f45409b;
        }

        public int e() {
            return this.f45410c;
        }

        public int f() {
            return this.f45411d;
        }

        public boolean g() {
            return this.f45414g;
        }

        public boolean h() {
            return this.f45415h;
        }

        public boolean i() {
            return this.f45416i;
        }

        public boolean j() {
            return this.f45417j;
        }

        public boolean k() {
            return this.f45418k;
        }

        /* renamed from: a, reason: collision with other method in class */
        public long m5836a() {
            return this.f272a;
        }

        public a b(int i11) {
            this.f45415h = true;
            this.f45409b = i11;
            return this;
        }

        public a c(int i11) {
            this.f45416i = true;
            this.f45410c = i11;
            return this;
        }

        public a d(int i11) {
            this.f45417j = true;
            this.f45411d = i11;
            return this;
        }

        public a e(String str) {
            this.f45414g = true;
            this.f281e = str;
            return this;
        }

        public a f(String str) {
            this.f45418k = true;
            this.f45413f = str;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public a m5837a() {
            this.f283f = false;
            this.f279d = "";
            return this;
        }

        public a b(String str) {
            this.f280d = true;
            this.f275b = str;
            return this;
        }

        public a c(String str) {
            this.f282e = true;
            this.f277c = str;
            return this;
        }

        public a d(String str) {
            this.f283f = true;
            this.f279d = str;
            return this;
        }

        /* renamed from: e, reason: collision with other method in class */
        public String m5846e() {
            return this.f281e;
        }

        /* renamed from: f, reason: collision with other method in class */
        public String m5848f() {
            return this.f45413f;
        }

        public a a(int i11) {
            this.f274a = true;
            this.f45408a = i11;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m5840b() {
            return this.f275b;
        }

        /* renamed from: c, reason: collision with other method in class */
        public String m5842c() {
            return this.f277c;
        }

        /* renamed from: d, reason: collision with other method in class */
        public String m5844d() {
            return this.f279d;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m5847e() {
            return this.f282e;
        }

        /* renamed from: f, reason: collision with other method in class */
        public boolean m5849f() {
            return this.f283f;
        }

        public a a(long j11) {
            this.f276b = true;
            this.f272a = j11;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m5841b() {
            return this.f276b;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m5843c() {
            return this.f278c;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m5845d() {
            return this.f280d;
        }

        @Override // com.xiaomi.push.e
        public a a(com.xiaomi.push.b bVar) {
            while (true) {
                int m5727a = bVar.m5727a();
                switch (m5727a) {
                    case 0:
                        break;
                    case 8:
                        a(bVar.m5736b());
                        break;
                    case 16:
                        a(bVar.m5737b());
                        break;
                    case 26:
                        a(bVar.m5730a());
                        break;
                    case 34:
                        b(bVar.m5730a());
                        break;
                    case 42:
                        c(bVar.m5730a());
                        break;
                    case 50:
                        d(bVar.m5730a());
                        break;
                    case 58:
                        e(bVar.m5730a());
                        break;
                    case 64:
                        b(bVar.m5736b());
                        break;
                    case 72:
                        c(bVar.m5736b());
                        break;
                    case 80:
                        d(bVar.m5736b());
                        break;
                    case 90:
                        f(bVar.m5730a());
                        break;
                    default:
                        if (!a(bVar, m5727a)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }

        public a a(String str) {
            this.f278c = true;
            this.f273a = str;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m5838a() {
            return this.f273a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m5839a()) {
                cVar.m5770a(1, c());
            }
            if (m5841b()) {
                cVar.m5784b(2, m5836a());
            }
            if (m5843c()) {
                cVar.m5774a(3, m5838a());
            }
            if (m5845d()) {
                cVar.m5774a(4, m5840b());
            }
            if (m5847e()) {
                cVar.m5774a(5, m5842c());
            }
            if (m5849f()) {
                cVar.m5774a(6, m5844d());
            }
            if (g()) {
                cVar.m5774a(7, m5846e());
            }
            if (h()) {
                cVar.m5770a(8, d());
            }
            if (i()) {
                cVar.m5770a(9, e());
            }
            if (j()) {
                cVar.m5770a(10, f());
            }
            if (k()) {
                cVar.m5774a(11, m5848f());
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5839a() {
            return this.f274a;
        }
    }

    public static final class b extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f284a;

        /* renamed from: c, reason: collision with other field name */
        private boolean f286c;

        /* renamed from: d, reason: collision with other field name */
        private boolean f287d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f45423e;

        /* renamed from: b, reason: collision with other field name */
        private boolean f285b = false;

        /* renamed from: a, reason: collision with root package name */
        private int f45419a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f45420b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f45421c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f45422d = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f45422d < 0) {
                b();
            }
            return this.f45422d;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a11 = m5851b() ? com.xiaomi.push.c.a(1, m5850a()) : 0;
            if (m5852c()) {
                a11 += com.xiaomi.push.c.a(3, c());
            }
            if (m5853d()) {
                a11 += com.xiaomi.push.c.a(4, d());
            }
            if (m5854e()) {
                a11 += com.xiaomi.push.c.a(5, e());
            }
            this.f45422d = a11;
            return a11;
        }

        public int c() {
            return this.f45419a;
        }

        public int d() {
            return this.f45420b;
        }

        public int e() {
            return this.f45421c;
        }

        public b a(int i11) {
            this.f286c = true;
            this.f45419a = i11;
            return this;
        }

        public b b(int i11) {
            this.f287d = true;
            this.f45420b = i11;
            return this;
        }

        public b c(int i11) {
            this.f45423e = true;
            this.f45421c = i11;
            return this;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m5853d() {
            return this.f287d;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m5854e() {
            return this.f45423e;
        }

        @Override // com.xiaomi.push.e
        public b a(com.xiaomi.push.b bVar) {
            while (true) {
                int m5727a = bVar.m5727a();
                if (m5727a == 0) {
                    break;
                }
                if (m5727a == 8) {
                    a(bVar.m5733a());
                } else if (m5727a == 24) {
                    a(bVar.m5736b());
                } else if (m5727a == 32) {
                    b(bVar.m5736b());
                } else if (m5727a == 40) {
                    c(bVar.m5736b());
                } else if (!a(bVar, m5727a)) {
                    break;
                }
            }
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m5851b() {
            return this.f284a;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m5852c() {
            return this.f286c;
        }

        public b a(boolean z11) {
            this.f284a = true;
            this.f285b = z11;
            return this;
        }

        public static b a(byte[] bArr) {
            return (b) new b().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m5851b()) {
                cVar.m5775a(1, m5850a());
            }
            if (m5852c()) {
                cVar.m5770a(3, c());
            }
            if (m5853d()) {
                cVar.m5770a(4, d());
            }
            if (m5854e()) {
                cVar.m5770a(5, e());
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5850a() {
            return this.f285b;
        }
    }

    public static final class c extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f289a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f290b;

        /* renamed from: c, reason: collision with other field name */
        private boolean f291c;

        /* renamed from: d, reason: collision with other field name */
        private boolean f292d;

        /* renamed from: e, reason: collision with other field name */
        private boolean f293e;

        /* renamed from: f, reason: collision with other field name */
        private boolean f294f;

        /* renamed from: a, reason: collision with other field name */
        private String f288a = "";

        /* renamed from: b, reason: collision with root package name */
        private String f45425b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f45426c = "";

        /* renamed from: d, reason: collision with root package name */
        private String f45427d = "";

        /* renamed from: e, reason: collision with root package name */
        private String f45428e = "";

        /* renamed from: f, reason: collision with root package name */
        private String f45429f = "";

        /* renamed from: a, reason: collision with root package name */
        private int f45424a = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f45424a < 0) {
                b();
            }
            return this.f45424a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a11 = m5856a() ? com.xiaomi.push.c.a(1, m5855a()) : 0;
            if (m5858b()) {
                a11 += com.xiaomi.push.c.a(2, m5857b());
            }
            if (m5859c()) {
                a11 += com.xiaomi.push.c.a(3, c());
            }
            if (m5860d()) {
                a11 += com.xiaomi.push.c.a(4, d());
            }
            if (m5861e()) {
                a11 += com.xiaomi.push.c.a(5, e());
            }
            if (m5862f()) {
                a11 += com.xiaomi.push.c.a(6, f());
            }
            this.f45424a = a11;
            return a11;
        }

        public c c(String str) {
            this.f291c = true;
            this.f45426c = str;
            return this;
        }

        public c d(String str) {
            this.f292d = true;
            this.f45427d = str;
            return this;
        }

        public c e(String str) {
            this.f293e = true;
            this.f45428e = str;
            return this;
        }

        public c f(String str) {
            this.f294f = true;
            this.f45429f = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        public c a(com.xiaomi.push.b bVar) {
            while (true) {
                int m5727a = bVar.m5727a();
                if (m5727a == 0) {
                    break;
                }
                if (m5727a == 10) {
                    a(bVar.m5730a());
                } else if (m5727a == 18) {
                    b(bVar.m5730a());
                } else if (m5727a == 26) {
                    c(bVar.m5730a());
                } else if (m5727a == 34) {
                    d(bVar.m5730a());
                } else if (m5727a == 42) {
                    e(bVar.m5730a());
                } else if (m5727a == 50) {
                    f(bVar.m5730a());
                } else if (!a(bVar, m5727a)) {
                    break;
                }
            }
            return this;
        }

        public c b(String str) {
            this.f290b = true;
            this.f45425b = str;
            return this;
        }

        public String c() {
            return this.f45426c;
        }

        public String d() {
            return this.f45427d;
        }

        public String e() {
            return this.f45428e;
        }

        public String f() {
            return this.f45429f;
        }

        public c a(String str) {
            this.f289a = true;
            this.f288a = str;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m5857b() {
            return this.f45425b;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m5859c() {
            return this.f291c;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m5860d() {
            return this.f292d;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m5861e() {
            return this.f293e;
        }

        /* renamed from: f, reason: collision with other method in class */
        public boolean m5862f() {
            return this.f294f;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m5858b() {
            return this.f290b;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m5855a() {
            return this.f288a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m5856a()) {
                cVar.m5774a(1, m5855a());
            }
            if (m5858b()) {
                cVar.m5774a(2, m5857b());
            }
            if (m5859c()) {
                cVar.m5774a(3, c());
            }
            if (m5860d()) {
                cVar.m5774a(4, d());
            }
            if (m5861e()) {
                cVar.m5774a(5, e());
            }
            if (m5862f()) {
                cVar.m5774a(6, f());
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5856a() {
            return this.f289a;
        }
    }

    public static final class d extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f296a;

        /* renamed from: c, reason: collision with other field name */
        private boolean f298c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f45433d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f45434e;

        /* renamed from: b, reason: collision with other field name */
        private boolean f297b = false;

        /* renamed from: a, reason: collision with other field name */
        private String f295a = "";

        /* renamed from: b, reason: collision with root package name */
        private String f45431b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f45432c = "";

        /* renamed from: a, reason: collision with root package name */
        private int f45430a = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f45430a < 0) {
                b();
            }
            return this.f45430a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a11 = m5866b() ? com.xiaomi.push.c.a(1, m5864a()) : 0;
            if (m5867c()) {
                a11 += com.xiaomi.push.c.a(2, m5863a());
            }
            if (d()) {
                a11 += com.xiaomi.push.c.a(3, m5865b());
            }
            if (e()) {
                a11 += com.xiaomi.push.c.a(4, c());
            }
            this.f45430a = a11;
            return a11;
        }

        public d c(String str) {
            this.f45434e = true;
            this.f45432c = str;
            return this;
        }

        public boolean d() {
            return this.f45433d;
        }

        public boolean e() {
            return this.f45434e;
        }

        @Override // com.xiaomi.push.e
        public d a(com.xiaomi.push.b bVar) {
            while (true) {
                int m5727a = bVar.m5727a();
                if (m5727a == 0) {
                    break;
                }
                if (m5727a == 8) {
                    a(bVar.m5733a());
                } else if (m5727a == 18) {
                    a(bVar.m5730a());
                } else if (m5727a == 26) {
                    b(bVar.m5730a());
                } else if (m5727a == 34) {
                    c(bVar.m5730a());
                } else if (!a(bVar, m5727a)) {
                    break;
                }
            }
            return this;
        }

        public d b(String str) {
            this.f45433d = true;
            this.f45431b = str;
            return this;
        }

        public String c() {
            return this.f45432c;
        }

        public d a(String str) {
            this.f298c = true;
            this.f295a = str;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m5865b() {
            return this.f45431b;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m5867c() {
            return this.f298c;
        }

        public d a(boolean z11) {
            this.f296a = true;
            this.f297b = z11;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m5866b() {
            return this.f296a;
        }

        public static d a(byte[] bArr) {
            return (d) new d().a(bArr);
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m5863a() {
            return this.f295a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m5866b()) {
                cVar.m5775a(1, m5864a());
            }
            if (m5867c()) {
                cVar.m5774a(2, m5863a());
            }
            if (d()) {
                cVar.m5774a(3, m5865b());
            }
            if (e()) {
                cVar.m5774a(4, c());
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5864a() {
            return this.f297b;
        }
    }

    public static final class e extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f301a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f303b;

        /* renamed from: c, reason: collision with other field name */
        private boolean f305c;

        /* renamed from: d, reason: collision with other field name */
        private boolean f307d;

        /* renamed from: e, reason: collision with other field name */
        private boolean f308e;

        /* renamed from: f, reason: collision with other field name */
        private boolean f309f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f45441g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f45442h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f45443i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f45444j;

        /* renamed from: a, reason: collision with root package name */
        private int f45435a = 0;

        /* renamed from: a, reason: collision with other field name */
        private String f300a = "";

        /* renamed from: b, reason: collision with other field name */
        private String f302b = "";

        /* renamed from: c, reason: collision with other field name */
        private String f304c = "";

        /* renamed from: b, reason: collision with root package name */
        private int f45436b = 0;

        /* renamed from: d, reason: collision with other field name */
        private String f306d = "";

        /* renamed from: e, reason: collision with root package name */
        private String f45439e = "";

        /* renamed from: f, reason: collision with root package name */
        private String f45440f = "";

        /* renamed from: a, reason: collision with other field name */
        private b f299a = null;

        /* renamed from: c, reason: collision with root package name */
        private int f45437c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f45438d = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f45438d < 0) {
                b();
            }
            return this.f45438d;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int b11 = m5870a() ? com.xiaomi.push.c.b(1, c()) : 0;
            if (m5872b()) {
                b11 += com.xiaomi.push.c.a(2, m5869a());
            }
            if (m5874c()) {
                b11 += com.xiaomi.push.c.a(3, m5871b());
            }
            if (m5876d()) {
                b11 += com.xiaomi.push.c.a(4, m5873c());
            }
            if (m5878e()) {
                b11 += com.xiaomi.push.c.a(5, d());
            }
            if (m5879f()) {
                b11 += com.xiaomi.push.c.a(6, m5875d());
            }
            if (g()) {
                b11 += com.xiaomi.push.c.a(7, m5877e());
            }
            if (h()) {
                b11 += com.xiaomi.push.c.a(8, f());
            }
            if (i()) {
                b11 += com.xiaomi.push.c.a(9, (com.xiaomi.push.e) m5868a());
            }
            if (j()) {
                b11 += com.xiaomi.push.c.a(10, e());
            }
            this.f45438d = b11;
            return b11;
        }

        public int c() {
            return this.f45435a;
        }

        public int d() {
            return this.f45436b;
        }

        public int e() {
            return this.f45437c;
        }

        public e f(String str) {
            this.f45442h = true;
            this.f45440f = str;
            return this;
        }

        public boolean g() {
            return this.f45441g;
        }

        public boolean h() {
            return this.f45442h;
        }

        public boolean i() {
            return this.f45443i;
        }

        public boolean j() {
            return this.f45444j;
        }

        /* renamed from: a, reason: collision with other method in class */
        public b m5868a() {
            return this.f299a;
        }

        public e b(int i11) {
            this.f308e = true;
            this.f45436b = i11;
            return this;
        }

        public e c(int i11) {
            this.f45444j = true;
            this.f45437c = i11;
            return this;
        }

        public e d(String str) {
            this.f309f = true;
            this.f306d = str;
            return this;
        }

        public e e(String str) {
            this.f45441g = true;
            this.f45439e = str;
            return this;
        }

        public String f() {
            return this.f45440f;
        }

        public e a(int i11) {
            this.f301a = true;
            this.f45435a = i11;
            return this;
        }

        public e b(String str) {
            this.f305c = true;
            this.f302b = str;
            return this;
        }

        public e c(String str) {
            this.f307d = true;
            this.f304c = str;
            return this;
        }

        /* renamed from: d, reason: collision with other method in class */
        public String m5875d() {
            return this.f306d;
        }

        /* renamed from: e, reason: collision with other method in class */
        public String m5877e() {
            return this.f45439e;
        }

        /* renamed from: f, reason: collision with other method in class */
        public boolean m5879f() {
            return this.f309f;
        }

        @Override // com.xiaomi.push.e
        public e a(com.xiaomi.push.b bVar) {
            while (true) {
                int m5727a = bVar.m5727a();
                switch (m5727a) {
                    case 0:
                        break;
                    case 8:
                        a(bVar.c());
                        break;
                    case 18:
                        a(bVar.m5730a());
                        break;
                    case 26:
                        b(bVar.m5730a());
                        break;
                    case 34:
                        c(bVar.m5730a());
                        break;
                    case 40:
                        b(bVar.m5736b());
                        break;
                    case 50:
                        d(bVar.m5730a());
                        break;
                    case 58:
                        e(bVar.m5730a());
                        break;
                    case 66:
                        f(bVar.m5730a());
                        break;
                    case 74:
                        b bVar2 = new b();
                        bVar.a(bVar2);
                        a(bVar2);
                        break;
                    case 80:
                        c(bVar.m5736b());
                        break;
                    default:
                        if (!a(bVar, m5727a)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m5871b() {
            return this.f302b;
        }

        /* renamed from: c, reason: collision with other method in class */
        public String m5873c() {
            return this.f304c;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m5876d() {
            return this.f307d;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m5878e() {
            return this.f308e;
        }

        public e a(b bVar) {
            bVar.getClass();
            this.f45443i = true;
            this.f299a = bVar;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m5872b() {
            return this.f303b;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m5874c() {
            return this.f305c;
        }

        public e a(String str) {
            this.f303b = true;
            this.f300a = str;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m5869a() {
            return this.f300a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m5870a()) {
                cVar.m5783b(1, c());
            }
            if (m5872b()) {
                cVar.m5774a(2, m5869a());
            }
            if (m5874c()) {
                cVar.m5774a(3, m5871b());
            }
            if (m5876d()) {
                cVar.m5774a(4, m5873c());
            }
            if (m5878e()) {
                cVar.m5770a(5, d());
            }
            if (m5879f()) {
                cVar.m5774a(6, m5875d());
            }
            if (g()) {
                cVar.m5774a(7, m5877e());
            }
            if (h()) {
                cVar.m5774a(8, f());
            }
            if (i()) {
                cVar.m5773a(9, (com.xiaomi.push.e) m5868a());
            }
            if (j()) {
                cVar.m5770a(10, e());
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5870a() {
            return this.f301a;
        }
    }

    public static final class f extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f312a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f313b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f45447c;

        /* renamed from: a, reason: collision with other field name */
        private String f311a = "";

        /* renamed from: b, reason: collision with root package name */
        private String f45446b = "";

        /* renamed from: a, reason: collision with other field name */
        private b f310a = null;

        /* renamed from: a, reason: collision with root package name */
        private int f45445a = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f45445a < 0) {
                b();
            }
            return this.f45445a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a11 = m5882a() ? com.xiaomi.push.c.a(1, m5881a()) : 0;
            if (m5884b()) {
                a11 += com.xiaomi.push.c.a(2, m5883b());
            }
            if (c()) {
                a11 += com.xiaomi.push.c.a(3, (com.xiaomi.push.e) m5880a());
            }
            this.f45445a = a11;
            return a11;
        }

        public boolean c() {
            return this.f45447c;
        }

        /* renamed from: a, reason: collision with other method in class */
        public b m5880a() {
            return this.f310a;
        }

        public f b(String str) {
            this.f313b = true;
            this.f45446b = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        public f a(com.xiaomi.push.b bVar) {
            while (true) {
                int m5727a = bVar.m5727a();
                if (m5727a == 0) {
                    break;
                }
                if (m5727a == 10) {
                    a(bVar.m5730a());
                } else if (m5727a == 18) {
                    b(bVar.m5730a());
                } else if (m5727a == 26) {
                    b bVar2 = new b();
                    bVar.a(bVar2);
                    a(bVar2);
                } else if (!a(bVar, m5727a)) {
                    break;
                }
            }
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m5883b() {
            return this.f45446b;
        }

        public f a(b bVar) {
            bVar.getClass();
            this.f45447c = true;
            this.f310a = bVar;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m5884b() {
            return this.f313b;
        }

        public f a(String str) {
            this.f312a = true;
            this.f311a = str;
            return this;
        }

        public static f a(byte[] bArr) {
            return (f) new f().a(bArr);
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m5881a() {
            return this.f311a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m5882a()) {
                cVar.m5774a(1, m5881a());
            }
            if (m5884b()) {
                cVar.m5774a(2, m5883b());
            }
            if (c()) {
                cVar.m5773a(3, (com.xiaomi.push.e) m5880a());
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5882a() {
            return this.f312a;
        }
    }

    public static final class g extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f315a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f316b;

        /* renamed from: c, reason: collision with other field name */
        private boolean f317c;

        /* renamed from: a, reason: collision with other field name */
        private String f314a = "";

        /* renamed from: b, reason: collision with root package name */
        private String f45449b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f45450c = "";

        /* renamed from: a, reason: collision with root package name */
        private int f45448a = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f45448a < 0) {
                b();
            }
            return this.f45448a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a11 = m5886a() ? com.xiaomi.push.c.a(1, m5885a()) : 0;
            if (m5888b()) {
                a11 += com.xiaomi.push.c.a(2, m5887b());
            }
            if (m5889c()) {
                a11 += com.xiaomi.push.c.a(3, c());
            }
            this.f45448a = a11;
            return a11;
        }

        public g c(String str) {
            this.f317c = true;
            this.f45450c = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        public g a(com.xiaomi.push.b bVar) {
            while (true) {
                int m5727a = bVar.m5727a();
                if (m5727a == 0) {
                    break;
                }
                if (m5727a == 10) {
                    a(bVar.m5730a());
                } else if (m5727a == 18) {
                    b(bVar.m5730a());
                } else if (m5727a == 26) {
                    c(bVar.m5730a());
                } else if (!a(bVar, m5727a)) {
                    break;
                }
            }
            return this;
        }

        public g b(String str) {
            this.f316b = true;
            this.f45449b = str;
            return this;
        }

        public String c() {
            return this.f45450c;
        }

        public g a(String str) {
            this.f315a = true;
            this.f314a = str;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m5887b() {
            return this.f45449b;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m5889c() {
            return this.f317c;
        }

        public static g a(byte[] bArr) {
            return (g) new g().a(bArr);
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m5888b() {
            return this.f316b;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m5885a() {
            return this.f314a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m5886a()) {
                cVar.m5774a(1, m5885a());
            }
            if (m5888b()) {
                cVar.m5774a(2, m5887b());
            }
            if (m5889c()) {
                cVar.m5774a(3, c());
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5886a() {
            return this.f315a;
        }
    }

    public static final class h extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f319a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f320b;

        /* renamed from: a, reason: collision with root package name */
        private int f45451a = 0;

        /* renamed from: a, reason: collision with other field name */
        private String f318a = "";

        /* renamed from: b, reason: collision with root package name */
        private int f45452b = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f45452b < 0) {
                b();
            }
            return this.f45452b;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a11 = m5891a() ? com.xiaomi.push.c.a(1, c()) : 0;
            if (m5892b()) {
                a11 += com.xiaomi.push.c.a(2, m5890a());
            }
            this.f45452b = a11;
            return a11;
        }

        public int c() {
            return this.f45451a;
        }

        public h a(int i11) {
            this.f319a = true;
            this.f45451a = i11;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m5892b() {
            return this.f320b;
        }

        @Override // com.xiaomi.push.e
        public h a(com.xiaomi.push.b bVar) {
            while (true) {
                int m5727a = bVar.m5727a();
                if (m5727a == 0) {
                    break;
                }
                if (m5727a == 8) {
                    a(bVar.m5736b());
                } else if (m5727a == 18) {
                    a(bVar.m5730a());
                } else if (!a(bVar, m5727a)) {
                    break;
                }
            }
            return this;
        }

        public h a(String str) {
            this.f320b = true;
            this.f318a = str;
            return this;
        }

        public static h a(byte[] bArr) {
            return (h) new h().a(bArr);
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m5890a() {
            return this.f318a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m5891a()) {
                cVar.m5770a(1, c());
            }
            if (m5892b()) {
                cVar.m5774a(2, m5890a());
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5891a() {
            return this.f319a;
        }
    }

    public static final class i extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f322a;

        /* renamed from: a, reason: collision with other field name */
        private com.xiaomi.push.a f321a = com.xiaomi.push.a.f45238a;

        /* renamed from: a, reason: collision with root package name */
        private int f45453a = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f45453a < 0) {
                b();
            }
            return this.f45453a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a11 = m5894a() ? com.xiaomi.push.c.a(1, m5893a()) : 0;
            this.f45453a = a11;
            return a11;
        }

        /* renamed from: a, reason: collision with other method in class */
        public com.xiaomi.push.a m5893a() {
            return this.f321a;
        }

        public i a(com.xiaomi.push.a aVar) {
            this.f322a = true;
            this.f321a = aVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public i a(com.xiaomi.push.b bVar) {
            while (true) {
                int m5727a = bVar.m5727a();
                if (m5727a == 0) {
                    break;
                }
                if (m5727a == 10) {
                    a(bVar.m5729a());
                } else if (!a(bVar, m5727a)) {
                    break;
                }
            }
            return this;
        }

        public static i a(byte[] bArr) {
            return (i) new i().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m5894a()) {
                cVar.m5772a(1, m5893a());
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5894a() {
            return this.f322a;
        }
    }

    public static final class j extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f325a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f45455b;

        /* renamed from: a, reason: collision with other field name */
        private com.xiaomi.push.a f323a = com.xiaomi.push.a.f45238a;

        /* renamed from: a, reason: collision with other field name */
        private b f324a = null;

        /* renamed from: a, reason: collision with root package name */
        private int f45454a = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f45454a < 0) {
                b();
            }
            return this.f45454a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a11 = m5897a() ? com.xiaomi.push.c.a(1, m5895a()) : 0;
            if (m5898b()) {
                a11 += com.xiaomi.push.c.a(2, (com.xiaomi.push.e) m5896a());
            }
            this.f45454a = a11;
            return a11;
        }

        /* renamed from: a, reason: collision with other method in class */
        public com.xiaomi.push.a m5895a() {
            return this.f323a;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m5898b() {
            return this.f45455b;
        }

        /* renamed from: a, reason: collision with other method in class */
        public b m5896a() {
            return this.f324a;
        }

        public j a(com.xiaomi.push.a aVar) {
            this.f325a = true;
            this.f323a = aVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public j a(com.xiaomi.push.b bVar) {
            while (true) {
                int m5727a = bVar.m5727a();
                if (m5727a == 0) {
                    break;
                }
                if (m5727a == 10) {
                    a(bVar.m5729a());
                } else if (m5727a == 18) {
                    b bVar2 = new b();
                    bVar.a(bVar2);
                    a(bVar2);
                } else if (!a(bVar, m5727a)) {
                    break;
                }
            }
            return this;
        }

        public j a(b bVar) {
            bVar.getClass();
            this.f45455b = true;
            this.f324a = bVar;
            return this;
        }

        public static j a(byte[] bArr) {
            return (j) new j().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m5897a()) {
                cVar.m5772a(1, m5895a());
            }
            if (m5898b()) {
                cVar.m5773a(2, (com.xiaomi.push.e) m5896a());
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5897a() {
            return this.f325a;
        }
    }

    public static final class k extends com.xiaomi.push.e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f328a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f331b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f45458c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f45459d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f45460e;

        /* renamed from: g, reason: collision with root package name */
        private boolean f45462g;

        /* renamed from: a, reason: collision with other field name */
        private String f327a = "";

        /* renamed from: b, reason: collision with other field name */
        private String f330b = "";

        /* renamed from: a, reason: collision with other field name */
        private long f326a = 0;

        /* renamed from: b, reason: collision with other field name */
        private long f329b = 0;

        /* renamed from: f, reason: collision with root package name */
        private boolean f45461f = false;

        /* renamed from: a, reason: collision with root package name */
        private int f45456a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f45457b = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f45457b < 0) {
                b();
            }
            return this.f45457b;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int a11 = m5901a() ? com.xiaomi.push.c.a(1, m5900a()) : 0;
            if (m5904b()) {
                a11 += com.xiaomi.push.c.a(2, m5903b());
            }
            if (m5905c()) {
                a11 += com.xiaomi.push.c.a(3, m5899a());
            }
            if (d()) {
                a11 += com.xiaomi.push.c.a(4, m5902b());
            }
            if (f()) {
                a11 += com.xiaomi.push.c.a(5, e());
            }
            if (g()) {
                a11 += com.xiaomi.push.c.a(6, c());
            }
            this.f45457b = a11;
            return a11;
        }

        public int c() {
            return this.f45456a;
        }

        public boolean d() {
            return this.f45459d;
        }

        public boolean e() {
            return this.f45461f;
        }

        public boolean f() {
            return this.f45460e;
        }

        public boolean g() {
            return this.f45462g;
        }

        /* renamed from: a, reason: collision with other method in class */
        public long m5899a() {
            return this.f326a;
        }

        /* renamed from: b, reason: collision with other method in class */
        public long m5902b() {
            return this.f329b;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m5905c() {
            return this.f45458c;
        }

        public k a(int i11) {
            this.f45462g = true;
            this.f45456a = i11;
            return this;
        }

        public k b(long j11) {
            this.f45459d = true;
            this.f329b = j11;
            return this;
        }

        public k a(long j11) {
            this.f45458c = true;
            this.f326a = j11;
            return this;
        }

        public k b(String str) {
            this.f331b = true;
            this.f330b = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        public k a(com.xiaomi.push.b bVar) {
            while (true) {
                int m5727a = bVar.m5727a();
                if (m5727a == 0) {
                    break;
                }
                if (m5727a == 10) {
                    a(bVar.m5730a());
                } else if (m5727a == 18) {
                    b(bVar.m5730a());
                } else if (m5727a == 24) {
                    a(bVar.m5728a());
                } else if (m5727a == 32) {
                    b(bVar.m5728a());
                } else if (m5727a == 40) {
                    a(bVar.m5733a());
                } else if (m5727a == 48) {
                    a(bVar.m5736b());
                } else if (!a(bVar, m5727a)) {
                    break;
                }
            }
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m5903b() {
            return this.f330b;
        }

        public k a(String str) {
            this.f328a = true;
            this.f327a = str;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m5904b() {
            return this.f331b;
        }

        public k a(boolean z11) {
            this.f45460e = true;
            this.f45461f = z11;
            return this;
        }

        public static k a(byte[] bArr) {
            return (k) new k().a(bArr);
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m5900a() {
            return this.f327a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (m5901a()) {
                cVar.m5774a(1, m5900a());
            }
            if (m5904b()) {
                cVar.m5774a(2, m5903b());
            }
            if (m5905c()) {
                cVar.m5771a(3, m5899a());
            }
            if (d()) {
                cVar.m5771a(4, m5902b());
            }
            if (f()) {
                cVar.m5775a(5, e());
            }
            if (g()) {
                cVar.m5770a(6, c());
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5901a() {
            return this.f328a;
        }
    }
}
