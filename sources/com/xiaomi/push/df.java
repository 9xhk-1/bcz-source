package com.xiaomi.push;

import com.xiaomi.push.de;
import com.xiaomi.push.de.c;
import java.io.File;
import java.util.Date;

/* loaded from: classes8.dex */
class df extends de.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f45384a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ de f246a;

    /* renamed from: a, reason: collision with other field name */
    File f247a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f248a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ Date f249a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ boolean f250a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f45385b;

    /* renamed from: b, reason: collision with other field name */
    final /* synthetic */ Date f251b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(de deVar, int i11, Date date, Date date2, String str, String str2, boolean z11) {
        super();
        this.f246a = deVar;
        this.f45384a = i11;
        this.f249a = date;
        this.f251b = date2;
        this.f248a = str;
        this.f45385b = str2;
        this.f250a = z11;
    }

    @Override // com.xiaomi.push.de.b, com.xiaomi.push.am.b
    public void b() {
        if (aa.d()) {
            try {
                File file = new File(this.f246a.f239a.getExternalFilesDir(null) + "/.logcache");
                file.mkdirs();
                if (file.isDirectory()) {
                    dd ddVar = new dd();
                    ddVar.a(this.f45384a);
                    this.f247a = ddVar.a(this.f246a.f239a, this.f249a, this.f251b, file);
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.xiaomi.push.am.b
    /* renamed from: c */
    public void mo5820c() {
        File file = this.f247a;
        if (file != null && file.exists()) {
            this.f246a.f240a.add(this.f246a.new c(this.f248a, this.f45385b, this.f247a, this.f250a));
        }
        this.f246a.a(0L);
    }
}
