package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class dv {

    public static final class a extends e {

        /* renamed from: a, reason: collision with other field name */
        private boolean f269a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f270b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f45405d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f45406e;

        /* renamed from: a, reason: collision with root package name */
        private int f45402a = 0;

        /* renamed from: c, reason: collision with other field name */
        private boolean f271c = false;

        /* renamed from: b, reason: collision with root package name */
        private int f45403b = 0;

        /* renamed from: f, reason: collision with root package name */
        private boolean f45407f = false;

        /* renamed from: a, reason: collision with other field name */
        private List<String> f268a = Collections.EMPTY_LIST;

        /* renamed from: c, reason: collision with root package name */
        private int f45404c = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f45404c < 0) {
                b();
            }
            return this.f45404c;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int i11 = 0;
            int b11 = m5831a() ? c.b(1, c()) : 0;
            if (m5833c()) {
                b11 += c.a(2, m5832b());
            }
            if (m5834d()) {
                b11 += c.a(3, d());
            }
            if (f()) {
                b11 += c.a(4, m5835e());
            }
            Iterator<String> it = m5830a().iterator();
            while (it.hasNext()) {
                i11 += c.a(it.next());
            }
            int size = b11 + i11 + m5830a().size();
            this.f45404c = size;
            return size;
        }

        public int c() {
            return this.f45402a;
        }

        public int d() {
            return this.f45403b;
        }

        public int e() {
            return this.f268a.size();
        }

        public boolean f() {
            return this.f45406e;
        }

        public a a(int i11) {
            this.f269a = true;
            this.f45402a = i11;
            return this;
        }

        public a b(int i11) {
            this.f45405d = true;
            this.f45403b = i11;
            return this;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m5833c() {
            return this.f270b;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m5834d() {
            return this.f45405d;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m5835e() {
            return this.f45407f;
        }

        public static a b(b bVar) {
            return new a().a(bVar);
        }

        @Override // com.xiaomi.push.e
        public a a(b bVar) {
            while (true) {
                int m5727a = bVar.m5727a();
                if (m5727a == 0) {
                    break;
                }
                if (m5727a == 8) {
                    a(bVar.c());
                } else if (m5727a == 16) {
                    a(bVar.m5733a());
                } else if (m5727a == 24) {
                    b(bVar.m5736b());
                } else if (m5727a == 32) {
                    b(bVar.m5733a());
                } else if (m5727a == 42) {
                    a(bVar.m5730a());
                } else if (!a(bVar, m5727a)) {
                    break;
                }
            }
            return this;
        }

        public a a(String str) {
            str.getClass();
            if (this.f268a.isEmpty()) {
                this.f268a = new ArrayList();
            }
            this.f268a.add(str);
            return this;
        }

        public a b(boolean z11) {
            this.f45406e = true;
            this.f45407f = z11;
            return this;
        }

        public a a(boolean z11) {
            this.f270b = true;
            this.f271c = z11;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m5832b() {
            return this.f271c;
        }

        public static a a(byte[] bArr) {
            return (a) new a().a(bArr);
        }

        /* renamed from: a, reason: collision with other method in class */
        public List<String> m5830a() {
            return this.f268a;
        }

        @Override // com.xiaomi.push.e
        public void a(c cVar) {
            if (m5831a()) {
                cVar.m5783b(1, c());
            }
            if (m5833c()) {
                cVar.m5775a(2, m5832b());
            }
            if (m5834d()) {
                cVar.m5770a(3, d());
            }
            if (f()) {
                cVar.m5775a(4, m5835e());
            }
            Iterator<String> it = m5830a().iterator();
            while (it.hasNext()) {
                cVar.m5774a(5, it.next());
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5831a() {
            return this.f269a;
        }
    }
}
