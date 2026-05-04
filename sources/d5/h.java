package d5;

import b5.b1;
import b5.x0;
import h50.d;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGameProtocolProcess.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameProtocolProcess.kt\ncom/baicizhan/app/biz/game/impl/unity/proto/PayloadSerializer\n+ 2 Koin.kt\norg/koin/core/Koin\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,112:1\n124#2,4:113\n142#3:117\n*S KotlinDebug\n*F\n+ 1 GameProtocolProcess.kt\ncom/baicizhan/app/biz/game/impl/unity/proto/PayloadSerializer\n*L\n98#1:113,4\n98#1:117\n*E\n"})
/* loaded from: classes3.dex */
public final class h implements f50.i<x0> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f47250a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h50.f f47251b;

    public h(@m80.k String command) {
        g0.p(command, "command");
        this.f47250a = command;
        this.f47251b = h50.l.i("DynamicPayload", d.b.f58510a, new h50.f[0], null, 8, null);
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f47251b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public x0 e(@m80.k i50.f decoder) {
        x0 x0Var;
        g0.p(decoder, "decoder");
        k50.i iVar = decoder instanceof k50.i ? (k50.i) decoder : null;
        if (iVar == null) {
            throw new SerializationException("Expected JSON decoder");
        }
        k50.k i11 = iVar.i();
        f50.e<x0> b11 = ((g) c4.j.f7801a.a().P().h().i(o0.d(g.class), null, null)).b(this.f47250a).b();
        return (b11 == null || (x0Var = (x0) iVar.a().e(b11, i11)) == null) ? b1.INSTANCE : x0Var;
    }

    @Override // f50.b0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k x0 value) {
        g0.p(encoder, "encoder");
        g0.p(value, "value");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public static /* synthetic */ void h() {
    }
}
