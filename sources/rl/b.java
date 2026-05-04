package rl;

import androidx.annotation.Nullable;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f84237a;

    /* renamed from: b, reason: collision with root package name */
    public String f84238b;

    /* renamed from: c, reason: collision with root package name */
    public String f84239c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f84240d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f84241e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f84242a;

        /* renamed from: b, reason: collision with root package name */
        public String f84243b;

        /* renamed from: c, reason: collision with root package name */
        public String f84244c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f84245d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f84246e;

        public a a(boolean z11) {
            this.f84242a = z11;
            return this;
        }

        public b b() {
            return new b(this.f84242a, this.f84243b, this.f84244c, this.f84245d, this.f84246e);
        }

        public a c(@Nullable String str) {
            this.f84244c = str;
            return this;
        }

        public a d() {
            this.f84245d = true;
            return this;
        }

        public a e() {
            this.f84246e = true;
            return this;
        }

        public a f(@Nullable String str) {
            this.f84243b = str;
            return this;
        }
    }

    public b() {
    }

    public static b a() {
        return new b();
    }

    @Nullable
    public String b() {
        return this.f84239c;
    }

    @Nullable
    public String c() {
        return this.f84238b;
    }

    public boolean d() {
        return this.f84237a;
    }

    public boolean e() {
        return this.f84240d;
    }

    public boolean f() {
        return this.f84241e;
    }

    public b(boolean z11, @Nullable String str, @Nullable String str2, boolean z12, boolean z13) {
        this.f84237a = z11;
        this.f84238b = str;
        this.f84239c = str2;
        this.f84240d = z12;
        this.f84241e = z13;
    }
}
