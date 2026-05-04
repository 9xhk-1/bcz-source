package zg;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f102628a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    /* renamed from: zg.a$a, reason: collision with other inner class name */
    public static final class C1395a extends a {

        /* renamed from: f, reason: collision with root package name */
        public static final int f102629f = 8;

        /* renamed from: b, reason: collision with root package name */
        public final int f102630b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Drawable f102631c;

        /* renamed from: d, reason: collision with root package name */
        public final int f102632d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f102633e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1395a(int i11, @k Drawable icon, @d int i12, @k String intent) {
            super(null);
            g0.p(icon, "icon");
            g0.p(intent, "intent");
            this.f102630b = i11;
            this.f102631c = icon;
            this.f102632d = i12;
            this.f102633e = intent;
        }

        public static /* synthetic */ C1395a f(C1395a c1395a, int i11, Drawable drawable, int i12, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = c1395a.f102630b;
            }
            if ((i13 & 2) != 0) {
                drawable = c1395a.f102631c;
            }
            if ((i13 & 4) != 0) {
                i12 = c1395a.f102632d;
            }
            if ((i13 & 8) != 0) {
                str = c1395a.f102633e;
            }
            return c1395a.e(i11, drawable, i12, str);
        }

        public final int a() {
            return this.f102630b;
        }

        @k
        public final Drawable b() {
            return this.f102631c;
        }

        public final int c() {
            return this.f102632d;
        }

        @k
        public final String d() {
            return this.f102633e;
        }

        @k
        public final C1395a e(int i11, @k Drawable icon, @d int i12, @k String intent) {
            g0.p(icon, "icon");
            g0.p(intent, "intent");
            return new C1395a(i11, icon, i12, intent);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1395a)) {
                return false;
            }
            C1395a c1395a = (C1395a) obj;
            return this.f102630b == c1395a.f102630b && g0.g(this.f102631c, c1395a.f102631c) && this.f102632d == c1395a.f102632d && g0.g(this.f102633e, c1395a.f102633e);
        }

        public final int g() {
            return this.f102630b;
        }

        @k
        public final Drawable h() {
            return this.f102631c;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f102630b) * 31) + this.f102631c.hashCode()) * 31) + Integer.hashCode(this.f102632d)) * 31) + this.f102633e.hashCode();
        }

        @k
        public final String i() {
            return this.f102633e;
        }

        public final int j() {
            return this.f102632d;
        }

        @k
        public String toString() {
            return "GoldenBanner(aid=" + this.f102630b + ", icon=" + this.f102631c + ", type=" + this.f102632d + ", intent=" + this.f102633e + j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class b extends a {

        /* renamed from: g, reason: collision with root package name */
        public static final int f102634g = 8;

        /* renamed from: b, reason: collision with root package name */
        public final int f102635b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Drawable f102636c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f102637d;

        /* renamed from: e, reason: collision with root package name */
        public final int f102638e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f102639f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, @k Drawable icon, @k String name, @d int i12, @k String intent) {
            super(null);
            g0.p(icon, "icon");
            g0.p(name, "name");
            g0.p(intent, "intent");
            this.f102635b = i11;
            this.f102636c = icon;
            this.f102637d = name;
            this.f102638e = i12;
            this.f102639f = intent;
        }

        public static /* synthetic */ b g(b bVar, int i11, Drawable drawable, String str, int i12, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = bVar.f102635b;
            }
            if ((i13 & 2) != 0) {
                drawable = bVar.f102636c;
            }
            if ((i13 & 4) != 0) {
                str = bVar.f102637d;
            }
            if ((i13 & 8) != 0) {
                i12 = bVar.f102638e;
            }
            if ((i13 & 16) != 0) {
                str2 = bVar.f102639f;
            }
            String str3 = str2;
            String str4 = str;
            return bVar.f(i11, drawable, str4, i12, str3);
        }

        public final int a() {
            return this.f102635b;
        }

        @k
        public final Drawable b() {
            return this.f102636c;
        }

        @k
        public final String c() {
            return this.f102637d;
        }

        public final int d() {
            return this.f102638e;
        }

        @k
        public final String e() {
            return this.f102639f;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f102635b == bVar.f102635b && g0.g(this.f102636c, bVar.f102636c) && g0.g(this.f102637d, bVar.f102637d) && this.f102638e == bVar.f102638e && g0.g(this.f102639f, bVar.f102639f);
        }

        @k
        public final b f(int i11, @k Drawable icon, @k String name, @d int i12, @k String intent) {
            g0.p(icon, "icon");
            g0.p(name, "name");
            g0.p(intent, "intent");
            return new b(i11, icon, name, i12, intent);
        }

        public final int h() {
            return this.f102635b;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f102635b) * 31) + this.f102636c.hashCode()) * 31) + this.f102637d.hashCode()) * 31) + Integer.hashCode(this.f102638e)) * 31) + this.f102639f.hashCode();
        }

        @k
        public final Drawable i() {
            return this.f102636c;
        }

        @k
        public final String j() {
            return this.f102639f;
        }

        @k
        public final String k() {
            return this.f102637d;
        }

        public final int l() {
            return this.f102638e;
        }

        @k
        public String toString() {
            return "GoldenItemSimple(aid=" + this.f102635b + ", icon=" + this.f102636c + ", name=" + this.f102637d + ", type=" + this.f102638e + ", intent=" + this.f102639f + j.f81007d;
        }
    }

    public /* synthetic */ a(v vVar) {
        this();
    }

    public a() {
    }
}
