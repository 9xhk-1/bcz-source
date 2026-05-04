package vy;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f94414a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f94415b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f94416c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Long f94417d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f94418e;

    public a() {
        this(null, null, null, null, null, 31, null);
    }

    @l
    public final String a() {
        return this.f94418e;
    }

    @l
    public final String b() {
        return this.f94414a;
    }

    @l
    public final String c() {
        return this.f94415b;
    }

    @l
    public final String d() {
        return this.f94416c;
    }

    @l
    public final Long e() {
        return this.f94417d;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        b.b(sb2, "data", this.f94414a);
        b.b(sb2, NotificationCompat.CATEGORY_EVENT, this.f94415b);
        b.b(sb2, "id", this.f94416c);
        b.b(sb2, "retry", this.f94417d);
        b.b(sb2, "", this.f94418e);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public a(@l String str, @l String str2, @l String str3, @l Long l11, @l String str4) {
        this.f94414a = str;
        this.f94415b = str2;
        this.f94416c = str3;
        this.f94417d = l11;
        this.f94418e = str4;
    }

    public /* synthetic */ a(String str, String str2, String str3, Long l11, String str4, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : str4);
    }
}
