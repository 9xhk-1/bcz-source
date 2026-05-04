package a90;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class l0 implements p80.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f2407a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f2408b;

    public l0(k repetitionInfo, e0 formatter) {
        this.f2407a = repetitionInfo;
        this.f2408b = formatter;
    }

    @Override // p80.g0
    public String a(int invocationIndex) {
        e0 e0Var = this.f2408b;
        k kVar = this.f2407a;
        return e0Var.a(kVar.f2397a, kVar.f2398b);
    }

    @Override // p80.g0
    public List<p80.m> b() {
        return Collections.singletonList(new m0(this.f2407a));
    }
}
