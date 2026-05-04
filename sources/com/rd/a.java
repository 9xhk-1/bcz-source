package com.rd;

import androidx.annotation.Nullable;
import qt.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public ut.a f41573a;

    /* renamed from: b, reason: collision with root package name */
    public pt.a f41574b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0496a f41575c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.rd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0496a {
        void b();
    }

    public a(@Nullable InterfaceC0496a interfaceC0496a) {
        this.f41575c = interfaceC0496a;
        ut.a aVar = new ut.a();
        this.f41573a = aVar;
        this.f41574b = new pt.a(aVar.b(), this);
    }

    @Override // qt.b.a
    public void a(@Nullable rt.b bVar) {
        this.f41573a.g(bVar);
        InterfaceC0496a interfaceC0496a = this.f41575c;
        if (interfaceC0496a != null) {
            interfaceC0496a.b();
        }
    }

    public pt.a b() {
        return this.f41574b;
    }

    public ut.a c() {
        return this.f41573a;
    }

    public wt.a d() {
        return this.f41573a.b();
    }
}
