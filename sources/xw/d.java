package xw;

import ix.g1;
import ix.q0;
import kotlin.jvm.internal.g0;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d extends v.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v f98399b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final io.ktor.utils.io.g f98400c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final ix.k f98401d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final Long f98402e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final g1 f98403f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final q0 f98404g;

    public d(@m80.k v originalContent, @m80.k io.ktor.utils.io.g channel) {
        g0.p(originalContent, "originalContent");
        g0.p(channel, "channel");
        this.f98399b = originalContent;
        this.f98400c = channel;
        this.f98401d = originalContent.b();
        this.f98402e = originalContent.a();
        this.f98403f = originalContent.h();
        this.f98404g = originalContent.d();
    }

    @Override // mx.v
    @m80.l
    public Long a() {
        return this.f98402e;
    }

    @Override // mx.v
    @m80.l
    public ix.k b() {
        return this.f98401d;
    }

    @Override // mx.v
    @m80.k
    public q0 d() {
        return this.f98404g;
    }

    @Override // mx.v
    @m80.l
    public <T> T e(@m80.k xy.a<T> key) {
        g0.p(key, "key");
        return (T) this.f98399b.e(key);
    }

    @Override // mx.v
    @m80.l
    public g1 h() {
        return this.f98403f;
    }

    @Override // mx.v
    public <T> void i(@m80.k xy.a<T> key, @m80.l T t11) {
        g0.p(key, "key");
        this.f98399b.i(key, t11);
    }

    @Override // mx.v.e
    @m80.k
    public io.ktor.utils.io.g m() {
        return this.f98400c;
    }
}
