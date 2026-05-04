package com.typesafe.config;

import com.typesafe.config.ConfigException;
import ju.r;
import ju.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final r f44722d = new a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f44723a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f44724b;

    /* renamed from: c, reason: collision with root package name */
    public final r f44725c;

    public b(boolean z11, boolean z12, r rVar) {
        this.f44723a = z11;
        this.f44724b = z12;
        this.f44725c = rVar;
    }

    public static b b() {
        return new b(true, false, f44722d);
    }

    public static b f() {
        return b().h(false);
    }

    public b a(r rVar) {
        if (rVar == null) {
            throw new ConfigException.BugOrBroken("null resolver passed to appendResolver");
        }
        r rVar2 = this.f44725c;
        return rVar == rVar2 ? this : new b(this.f44723a, this.f44724b, rVar2.b(rVar));
    }

    public boolean c() {
        return this.f44724b;
    }

    public r d() {
        return this.f44725c;
    }

    public boolean e() {
        return this.f44723a;
    }

    public b g(boolean z11) {
        return new b(this.f44723a, z11, this.f44725c);
    }

    public b h(boolean z11) {
        return new b(z11, this.f44724b, this.f44725c);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements r {
        @Override // ju.r
        public t a(String str) {
            return null;
        }

        @Override // ju.r
        public r b(r rVar) {
            return rVar;
        }
    }
}
