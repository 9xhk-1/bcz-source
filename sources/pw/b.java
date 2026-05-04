package pw;

import cx.z;
import java.io.IOException;
import kotlin.Result;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b implements t50.c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z f81204a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c40.n<okhttp3.n> f81205b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@m80.k z requestData, @m80.k c40.n<? super okhttp3.n> continuation) {
        g0.p(requestData, "requestData");
        g0.p(continuation, "continuation");
        this.f81204a = requestData;
        this.f81205b = continuation;
    }

    @Override // t50.c
    public void c(@m80.k t50.b call, @m80.k okhttp3.n response) {
        g0.p(call, "call");
        g0.p(response, "response");
        if (call.isCanceled()) {
            return;
        }
        c40.n<okhttp3.n> nVar = this.f81205b;
        Result.a aVar = Result.Companion;
        nVar.resumeWith(Result.m6308constructorimpl(response));
    }

    @Override // t50.c
    public void d(@m80.k t50.b call, @m80.k IOException e11) {
        Throwable f11;
        g0.p(call, "call");
        g0.p(e11, "e");
        if (this.f81205b.isCancelled()) {
            return;
        }
        c40.n<okhttp3.n> nVar = this.f81205b;
        Result.a aVar = Result.Companion;
        f11 = t.f(this.f81204a, e11);
        nVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(f11)));
    }
}
